package gr.uoi.cs.dmod.hecate.gui.swing;

import gr.uoi.cs.dmod.hecate.graph.tree.HecateRowModel;
import gr.uoi.cs.dmod.hecate.graph.tree.HecateTreeModel;
import gr.uoi.cs.dmod.hecate.sql.Schema;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.netbeans.swing.outline.DefaultOutlineModel;
import org.netbeans.swing.outline.Outline;
import org.netbeans.swing.outline.OutlineModel;

@SuppressWarnings("serial")
public class MainPanel extends JPanel {
	
	private JScrollPane leftScrollPane;
	private JScrollPane rightScrollPane;
	private Outline leftOutline;
	private Outline rightOutline;
	private HecateTreeModel leftTreeModel;
	private HecateTreeModel rightTreeModel;
	private OutlineModel leftOutlineModel;
	private OutlineModel rightOutlineModel;
	
	public MainPanel() {
		setLayout(new GridLayout(1,2));
		
		leftScrollPane = new JScrollPane();
		add(leftScrollPane);

		
		rightScrollPane = new JScrollPane();
		add(rightScrollPane);

	}
	
	protected void drawSchema(Schema s, String side) {
		if (side == "old") {
			leftTreeModel = new HecateTreeModel(s);
			leftOutlineModel = DefaultOutlineModel.createOutlineModel(leftTreeModel,new HecateRowModel(),
			                                                      true, "Name");
			leftOutline = new Outline();
			leftOutline.setModel(leftOutlineModel);
			leftScrollPane.add(leftOutline);
			leftScrollPane.setViewportView(leftOutline);
		}
		else if (side == "new") {
			rightTreeModel = new HecateTreeModel(s);
			rightOutlineModel = DefaultOutlineModel.createOutlineModel(rightTreeModel,new HecateRowModel(),
			                                                      true, "Name");
			rightOutline = new Outline();
			rightOutline.setModel(rightOutlineModel);
			rightScrollPane.add(rightOutline);
			rightScrollPane.setViewportView(rightOutline);
		}
	}
}
