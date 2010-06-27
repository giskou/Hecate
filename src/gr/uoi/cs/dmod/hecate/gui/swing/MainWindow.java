package gr.uoi.cs.dmod.hecate.gui.swing;

import gr.uoi.cs.dmod.hecate.diff.Delta;
import gr.uoi.cs.dmod.hecate.parser.DDLLexer;
import gr.uoi.cs.dmod.hecate.parser.DDLParser;
import gr.uoi.cs.dmod.hecate.sql.Schema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

@SuppressWarnings("serial")
public class MainWindow extends JFrame{
	
	private Schema oldSchema;
	private Schema newSchema;
	
	protected MainPanel mainPanel;
	protected JMenuBar menuBar;
	
	// menu items
	private JMenu file;
	private JMenuItem fileOpen;
	private JMenuItem fileClose;
	private JMenu view;
	private JMenu help;
	private JMenuItem helpAbout;
	private OpenDialog openDialog;
	
	public MainWindow(){
		initialize();
		
		createMenu();
		mainPanel = new MainPanel();
		add(mainPanel);
		
		draw();
	}
	
	private void initialize() {
		// look and feel
		try {
			javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		setTitle("Hecate");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void createMenu() {
		menuBar = new JMenuBar();
		// File
		file = new JMenu("File");
		file.setMnemonic(KeyEvent.VK_F);
		// File->Open...
		fileOpen = new JMenuItem("Open...");
		fileOpen.setMnemonic(KeyEvent.VK_O);
		fileOpen.setToolTipText("Create new diff graph");
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
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (RecognitionException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		file.add(fileOpen);
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
				AboutDialog ad = new AboutDialog();
				ad.setVisible(true);
			}
		});
		help.add(helpAbout);
		menuBar.add(help);
		
		setJMenuBar(menuBar);
	}
	
	private void draw() {
		setMinimumSize(new Dimension(400, 300));
		pack();
		// center on screen
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width/2 - getWidth()/2, 
		            size.height/2 - getHeight()/2);
	}
	
	private void drawTree(String oldFilePath, String newFilePath) throws IOException, RecognitionException {
		CharStream charStream = new ANTLRFileStream(oldFilePath);
		CharStream charStream2 = new ANTLRFileStream(newFilePath);
		DDLLexer lexer = new DDLLexer(charStream) ;
		DDLLexer lexer2 = new DDLLexer(charStream2) ;
		TokenStream tokenStream = new CommonTokenStream(lexer);
		TokenStream tokenStream2 = new CommonTokenStream(lexer2);
		DDLParser parser = new DDLParser(tokenStream) ;
		DDLParser parser2 = new DDLParser(tokenStream2) ;
		oldSchema = parser.start();
		oldSchema.setTitle(getNameFromPath(oldFilePath));
		newSchema = parser2.start();
		newSchema.setTitle(getNameFromPath(newFilePath));
		
		mainPanel.drawSchema(oldSchema, "old");
		mainPanel.drawSchema(newSchema, "new");
		draw();
		
		Delta d = new Delta();
		System.out.println("---------------");
		d.minus(oldSchema, newSchema);
	}
	
	private String getNameFromPath(String path) {
		if (path.lastIndexOf('/') != 0)
			return path.substring(path.lastIndexOf('/'));
		else
			return path.substring(path.lastIndexOf('\\'));
	}
}
