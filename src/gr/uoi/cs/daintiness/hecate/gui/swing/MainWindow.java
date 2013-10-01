package gr.uoi.cs.daintiness.hecate.gui.swing;

import gr.uoi.cs.daintiness.hecate.Hecate;
import gr.uoi.cs.daintiness.hecate.diff.Delta;
import gr.uoi.cs.daintiness.hecate.diff.DiffResult;
import gr.uoi.cs.daintiness.hecate.io.Export;
import gr.uoi.cs.daintiness.hecate.io.TablesOverVersion;
import gr.uoi.cs.daintiness.hecate.parser.HecateParser;
import gr.uoi.cs.daintiness.hecate.sql.Schema;
import gr.uoi.cs.daintiness.hecate.sql.Table;
import gr.uoi.cs.daintiness.hecate.transitions.Transitions;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Map.Entry;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import org.antlr.v4.runtime.RecognitionException;

/**
 * The main window of Hecate
 * @author giskou
 *
 */
@SuppressWarnings("serial")
public class MainWindow extends JFrame{
	
	private Schema oldSchema;
	private Schema newSchema;
	
	private MainPanel mainPanel;
	private JMenuBar menuBar;
	
	// menu items
	private JMenu file;
	private JMenuItem fileOpen;
	private JMenuItem fileFOpen;
	private JMenuItem fileClose;
	private JMenu view;
	private JMenuItem viewMetrics;
	private JMenu help;
	private JMenuItem helpAbout;
	
	private OpenDialog openDialog;
	private OpenFolderDialog openFolderDialog;
	private MetricsDialog metricsDialog;
	private AboutDialog aboutDialog;
	private Image hecateIcon;
	
	private DiffResult res;
	
	/**
	 * Default Constructor
	 */
	public MainWindow(){
		initialize();
		
		createMenu();
		mainPanel = new MainPanel();
		add(mainPanel);
		
		draw();
	}
	
	/**
	 * Sets
	 * <li>the look and feel of the application
	 * <li>the window title
	 * <li>the window icon
	 * <li>the default close operation of the window
	 */
	private void initialize() {
		// look and feel
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		setTitle("Hecate");
		hecateIcon = new ImageIcon(Hecate.class.getResource("art/icon.png")).getImage();
		this.setIconImage(hecateIcon);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	/**
	 * Creates the windows menu
	 */
	private void createMenu() {
		menuBar = new JMenuBar();
		// File
		file = new JMenu("File");
		file.setMnemonic(KeyEvent.VK_F);
		// File->Open...
		fileOpen = new JMenuItem("Open...");
		fileOpen.setMnemonic(KeyEvent.VK_O);
		fileOpen.setToolTipText("Create new diff tree");
		fileOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (openDialog == null) {
					openDialog = new OpenDialog();
				}
				openDialog.setVisible(true);
				if (openDialog.getStatus() != 0) {
					try {
						drawTree(openDialog.getOldFile(), openDialog.getNewFile());
					} catch (IOException e) {
						e.printStackTrace();
					} catch (RecognitionException e) {
						e.printStackTrace();
					}
				}
			}
		});
		file.add(fileOpen);
		//File->Open Folder
		fileFOpen = new JMenuItem("Open Folder...");
		fileFOpen.setMnemonic(KeyEvent.VK_F);
		fileFOpen.setToolTipText("Create diff tree from multiple files");
		fileFOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Transitions trs = new Transitions();
				if (openFolderDialog == null) {
					openFolderDialog = new OpenFolderDialog();
				}
				openFolderDialog.setVisible(true);
				if (openFolderDialog.getStatus() != 0) {
					String path = openFolderDialog.getFolder();
					File dir = new File(path);
					String[] list = dir.list();
					java.util.Arrays.sort(list);
					try {
						Export.initMetrics(path);
						if (res != null) {
							res.met.resetVersionNum();
						}
						TablesOverVersion tv = new TablesOverVersion();
						int ver = 0;
						for (int i = 0; i < list.length-1; i++) {
							Schema schema = HecateParser.parse(path + File.separator + list[i]);
							for (Entry<String, Table> e : schema.getTables().entrySet()) {
								String tname = e.getKey();
								int attrs = e.getValue().getSize();
								tv.addTable(tname, i, attrs);
							}
							Schema schema2 = HecateParser.parse(path + File.separator + list[i+1]);
							if (i == list.length-2) {
								for (Entry<String, Table> e : schema.getTables().entrySet()) {
									String tname = e.getKey();
									int attrs = e.getValue().getSize();
									tv.addTable(tname, i+1, attrs);
								}
							}
							res = Delta.minus(schema, schema2);
							trs.add(res.tl);
							Export.metrics(res, path);
							ver = i;
						}
						tv.export(path, ver+1);
						Export.xml(trs, path);
						drawTree(new File(path + File.separator + list[0]), new File(path + File.separator + list[list.length-1]));
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		});
		file.add(fileFOpen);
		// File->Close
		fileClose = new JMenuItem("Close");
		fileClose.setMnemonic(KeyEvent.VK_C);
		
		fileClose.setToolTipText("Exit application");
		fileClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		file.add(fileClose);
		menuBar.add(file);

		// View
		view = new JMenu("View");
		view.setMnemonic(KeyEvent.VK_V);
		// View->Metrics...
		viewMetrics = new JMenuItem("Metrics...");
		viewMetrics.setMnemonic(KeyEvent.VK_M);
		viewMetrics.setToolTipText("View diff Metrics");
		viewMetrics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if (res != null) {
					metricsDialog = new MetricsDialog(res.met);
					metricsDialog.setVisible(true);
				}
			}
		});
		view.add(viewMetrics);
		menuBar.add(view);

		// Help
		help = new JMenu("Help");
		help.setMnemonic(KeyEvent.VK_H);
		// Help->About
		helpAbout = new JMenuItem("About");
		helpAbout.setMnemonic(KeyEvent.VK_A);
		helpAbout.setToolTipText("About Hecate");
		helpAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				aboutDialog = new AboutDialog();
				aboutDialog.setVisible(true);
			}
		});
		help.add(helpAbout);
		menuBar.add(help);
		
		setJMenuBar(menuBar);
	}
	
	/**
	 * Sets the size of the window and centers it to the screen
	 */
	private void draw() {
		setMinimumSize(new Dimension(400, 300));
		pack();
		// center on screen
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width/2 - getWidth()/2, 
		            size.height/2 - getHeight()/2);
	}
	
	/**
	 * Calls the parser on the files, initializes the {@link Delta}
	 * class and draws the trees at the {@link MainPanel}
	 * @param oldFilePath
	 *   The {@ink String} of the path of the original schema file
	 * @param newFilePath
	 *   The {@ink String} of the path of the modified schema file
	 * @throws IOException
	 * @throws RecognitionException
	 */
	private void drawTree(File oldFile, File newFile) throws IOException, RecognitionException {
		oldSchema = HecateParser.parse(oldFile.getAbsolutePath());
		newSchema = HecateParser.parse(newFile.getAbsolutePath());
		
		mainPanel.drawSchema(oldSchema, "old");
		mainPanel.drawSchema(newSchema, "new");
		draw();
		
		res = Delta.minus(oldSchema, newSchema);
	}
}
