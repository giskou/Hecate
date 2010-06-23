package gr.uoi.cs.dmod.hecate.graph.tree;

import javax.swing.JTree;

@SuppressWarnings("serial")
public class HecateTree extends JTree {
	
	public HecateTree() {
		
	}
	
	public void expandAll() {
		for (int i = 0; i < getRowCount(); i++) {
			expandRow(i);
		}
	}
	
	public void collapseAll() {
		for (int i = getRowCount() - 1; i >=0; i--){
			collapseRow(i);
		}
	}
}
