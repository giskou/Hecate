package gr.uoi.cs.dmod.hecate.gui.swing;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

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
		
		setJMenuBar(new MenuBar());
	}
}
