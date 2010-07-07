package gr.uoi.cs.dmod.hecate.gui.swing;

import gr.uoi.cs.dmod.hecate.diff.Delta;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JTextPane;

@SuppressWarnings("serial")
public class MetricsDialog extends JDialog {
	
	JTextPane mainText;
	String text;
	
	public MetricsDialog(Delta d) {
		initialize();
		
		mainText = new JTextPane();
		if (d != null){
			int metrics[] = d.getMetrics();
			text = "Insertions: " + metrics[0] + "\n" +
			       "Deletions: " + metrics[1] + "\n";
		}
		else {
			text = "No Schemas loaded.\n";
		}
		mainText.setText(text);
		this.add(mainText);
		
		draw();
	}
	private void initialize() {
		setTitle("Metrics") ;
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	private void draw() {
		pack();
		// center on screen
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width/2 - getWidth()/2, 
		            size.height/2 - getHeight()/2);
	}
}
