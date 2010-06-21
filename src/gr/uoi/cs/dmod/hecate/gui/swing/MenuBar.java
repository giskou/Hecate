package gr.uoi.cs.dmod.hecate.gui.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class MenuBar extends JMenuBar{
	
	public MenuBar(){
		
		// File
		JMenu file = new JMenu("File");
		file.setMnemonic(KeyEvent.VK_F);
		// File->Open...
		JMenuItem fileOpen = new JMenuItem("Open...");
		fileOpen.setMnemonic(KeyEvent.VK_O);
		fileOpen.setToolTipText("Create new diff graph");
		fileOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				OpenDialog od = new OpenDialog();
				od.setVisible(true);
			}
		});
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
		this.add(file);

		// View
		JMenu view = new JMenu("View");
		view.setMnemonic(KeyEvent.VK_V);
		this.add(view);

		// Help
		JMenu help = new JMenu("Help");
		help.setMnemonic(KeyEvent.VK_H);
		// Help->About
		JMenuItem helpAbout = new JMenuItem("About");
		helpAbout.setMnemonic(KeyEvent.VK_A);
		helpAbout.setToolTipText("About Hecate");
		helpAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				AboutDialog ad = new AboutDialog();
				ad.setVisible(true);
			}
		});
		help.add(helpAbout);
		this.add(help);
	}
}
