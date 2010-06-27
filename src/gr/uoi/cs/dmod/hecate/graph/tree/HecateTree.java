package gr.uoi.cs.dmod.hecate.graph.tree;

import gr.uoi.cs.dmod.hecate.sql.Attribute;
import gr.uoi.cs.dmod.hecate.sql.Schema;
import gr.uoi.cs.dmod.hecate.sql.Table;

import java.awt.ComponentOrientation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

@SuppressWarnings("serial")
public class HecateTree extends JTree {
	HecateTreeModel model;
	
//	private static DefaultMutableTreeNode root;
//	private TreeMap<String, Table> tables;
//	private TreeMap<String, Attribute> attrs;
	
	public HecateTree(Schema schema) {
		super(new HecateTreeModel(schema));
//		root = new DefaultMutableTreeNode(schema.getTitle());
//		
//		tables = schema.getTables();
//		for (Map.Entry<String, Table> t : tables.entrySet()) {
//			Table table = t.getValue();
//			DefaultMutableTreeNode node = new DefaultMutableTreeNode(t.getKey());
//			root.add(node);
//			attrs = table.getAttrs();
//			for (Map.Entry<String, Attribute> a : attrs.entrySet()){
//				node.add(new DefaultMutableTreeNode(a.getKey()));
//			}
//		}
		
		setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		setShowsRootHandles(true);
		expandAll();
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
