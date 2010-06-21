package gr.uoi.cs.dmod.hecate.gui.swing;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MainWindow extends JFrame{
	
	public MainWindow(){
		initialize();
		setJMenuBar(new MenuBar());
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
	
	private void draw() {
		setSize(800, 600);
		setMinimumSize(new Dimension(640, 480));
		// center on screen
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width/2 - getWidth()/2, 
		            size.height/2 - getHeight()/2);
	}
}
