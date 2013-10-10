package gr.uoi.cs.daintiness.hecate.gui.swing;

import gr.uoi.cs.daintiness.hecate.Hecate;
import gr.uoi.cs.daintiness.hecate.diff.DiffResult;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;

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
						DiffWorker task = 
								new DiffWorker(mainPanel,
										openDialog.getOldFile(),
										openDialog.getNewFile());
						task.execute();
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
				if (openFolderDialog == null) {
					openFolderDialog = new OpenFolderDialog();
				}
				openFolderDialog.setVisible(true);
				if (openFolderDialog.getStatus() != 0) {
					String path = openFolderDialog.getFolder();
					File dir = new File(path);
					try {
						DiffWorker task = new DiffWorker(mainPanel, dir);
						task.execute();
						
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
}
