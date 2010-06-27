package gr.uoi.cs.dmod.hecate.gui.swing;

import gr.uoi.cs.dmod.hecate.graph.tree.HecateTree;
import gr.uoi.cs.dmod.hecate.sql.Schema;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class MainPanel extends JPanel {
	
	private JScrollPane leftScrollPane;
	private HecateTree leftTree;
	private JScrollPane rightScrollPane;
	private HecateTree rightTree;
	
	public MainPanel() {
		setLayout(new GridLayout(1,2));
		
		leftScrollPane = new JScrollPane();
		add(leftScrollPane);

		
		rightScrollPane = new JScrollPane();
		add(rightScrollPane);

	}
	
	protected void drawSchema(Schema s, String side) {
		if (side == "old") {
			leftTree = new HecateTree(s);
			leftScrollPane.add(leftTree);
			leftScrollPane.setViewportView(leftTree);
		}
		else if (side == "new") {
			rightTree = new HecateTree(s);
			rightScrollPane.add(rightTree);
			rightScrollPane.setViewportView(rightTree);
		}
	}
}
