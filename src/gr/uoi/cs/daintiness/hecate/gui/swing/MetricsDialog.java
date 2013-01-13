package gr.uoi.cs.daintiness.hecate.gui.swing;

import gr.uoi.cs.daintiness.hecate.diff.Delta;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JTextPane;

/**
 * A dialog with miscellaneous metics
 * @author giskou
 *
 */
@SuppressWarnings("serial")
public class MetricsDialog extends JDialog {
	
	JTextPane mainText;
	String text;
	
	/**
	 * Paramerized Constructor
	 * @param d a Delta object that has run {@link minus} at least once
	 */
	public MetricsDialog(Delta d) {
		initialize();
		
		mainText = new JTextPane();
		if (d != null){
			text =
			    " Total Insertions: " + d.getTotalMetrics()[0] + " \n" +
			    " of which ... \n" +
			    "   Tables inserted: " + d.getTableMetrics()[0] + " \n" +
			    "   Attributes inserted: " + d.getAttributeMetrics()[0] + " \n" +
			    " Total Deletions: " + d.getTotalMetrics()[1] + " \n" +
			    " of which ... \n" +
			    "   Tables deleted: " + d.getTableMetrics()[1] + " \n" +
			    "   Attributes deleted: " + d.getAttributeMetrics()[1] + " \n\n" +
			    " Attributes altered: " + d.getAttributeMetrics()[2] + " \n\n" +
			    " First version had: \n" +
			    "   Tables: " + d.getOldSizes()[0] + " \n" +
			    "   Attributes: " + d.getOldSizes()[1] + " \n" +
			    " Second version has: \n" +
			    "   Tables: " + d.getNewSizes()[0] + " \n" +
			    "   Attributes: " + d.getNewSizes()[1] ;
		}
		else {
			text = "No Schemas loaded.";
		}
		mainText.setText(text);
		this.add(mainText);
		
		draw();
	}
	
	/**
	 * Sets the title of the dialog an the default close operation
	 */
	private void initialize() {
		setTitle("Metrics") ;
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	/**
	 * Sets the size of the dialog and centers it to the screen
	 */
	private void draw() {
		pack();
		// center on screen
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width/2 - getWidth()/2, 
		            size.height/2 - getHeight()/2);
	}
}
