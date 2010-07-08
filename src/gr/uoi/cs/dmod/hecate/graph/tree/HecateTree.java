package gr.uoi.cs.dmod.hecate.graph.tree;

import gr.uoi.cs.dmod.hecate.sql.Schema;

import java.awt.ComponentOrientation;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTree;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

@SuppressWarnings("serial")
public class HecateTree extends JTree {
	
	/**
	 * Default Constructor
	 * @param schema
	 */
	public HecateTree(Schema schema) {
		super();

		setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		setShowsRootHandles(true);
		expandAll();
	}
	
	/**
	 * Expands all the rows of the tree
	 */
	public void expandAll() {
		for (int i = 0; i < getRowCount(); i++) {
			expandRow(i);
		}
	}
	
	/**
	 * Collapses all the rows of the tree
	 */
	public void collapseAll() {
		for (int i = getRowCount() - 1; i >=0; i--){
			collapseRow(i);
		}
	}
	
	/**
	 * 
	 * @param treeNode A node of the tree
	 * @return A {@link TreePath} describing the path of the treeNode
	 */
	public TreePath getPath(TreeNode treeNode) {
		List<Object> nodes = new ArrayList<Object>();
		if (treeNode != null) {
			nodes.add(treeNode);
			treeNode = treeNode.getParent();
			while (treeNode != null) {
				nodes.add(0, treeNode);
				treeNode = treeNode.getParent();
			}
		}
		return nodes.isEmpty() ? null : new TreePath(nodes.toArray());
	}
}
