package gr.uoi.cs.dmod.hecate.gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class MainWindow extends JFrame{
	
	public MainWindow(){
		setSize(800,600);
		setTitle("Hecate");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// center on screen
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width/2 - getWidth()/2, 
		            size.height/2 - getHeight()/2);
		
		setJMenuBar(createMenubar());
	}
	
	protected JMenuBar createMenubar(){
		JMenuBar menubar = new JMenuBar();
		// File
		JMenu file = new JMenu("File");
		file.setMnemonic(KeyEvent.VK_F);
		// File->Open...
		JMenuItem fileOpen = new JMenuItem("Open...");
		fileOpen.setMnemonic(KeyEvent.VK_O);
		fileOpen.setToolTipText("Create new diff graph");
		file.add(fileOpen);
		// File->Close
		JMenuItem fileClose = new JMenuItem("Close");
		fileClose.setMnemonic(KeyEvent.VK_C);
		fileClose.setToolTipText("Exit application");
		fileClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		file.add(fileClose);
		menubar.add(file);

		// View
		JMenu view = new JMenu("View");
		view.setMnemonic(KeyEvent.VK_V);
		menubar.add(view);

		// Help
		JMenu help = new JMenu("Help");
		help.setMnemonic(KeyEvent.VK_H);
		// Help->About
		JMenuItem helpAbout = new JMenuItem("About");
		helpAbout.setMnemonic(KeyEvent.VK_A);
		help.add(helpAbout);

		menubar.add(help);

		return menubar;
	}
}
