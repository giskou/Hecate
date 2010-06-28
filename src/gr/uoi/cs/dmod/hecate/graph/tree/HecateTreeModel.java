package gr.uoi.cs.dmod.hecate.graph.tree;

import gr.uoi.cs.dmod.hecate.sql.Schema;
import gr.uoi.cs.dmod.hecate.sql.Table;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

public class HecateTreeModel implements TreeModel {
	
	private Schema root;
	
	public HecateTreeModel(Schema root) {
		this.root = root;
	}

	@Override
	public void addTreeModelListener(TreeModelListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object getChild(Object parent, int index) {
		String type = parent.getClass().getName();
		if (type == "gr.uoi.cs.dmod.hecate.sql.Schema") {
			return ((Schema)parent).getTableAt(index);
		}
		else if (type == "gr.uoi.cs.dmod.hecate.sql.Table") {
			return ((Table)parent).getAttrAt(index);
		}
		return null;
	}

	@Override
	public int getChildCount(Object node) {
		String type = node.getClass().getName();
		int count = 0;
		if (type == "gr.uoi.cs.dmod.hecate.sql.Schema") {
			count = ((Schema)node).getTables().size();
		}
		else if (type == "gr.uoi.cs.dmod.hecate.sql.Table") {
			count = ((Table)node).getAttrs().size();
		}
		else if (type == "gr.uoi.cs.dmod.hecate.sql.Attribute") {
			count = 0;
		}
		return count;
	}

	@Override
	public int getIndexOfChild(Object parent, Object child) {
		// TODO Auto-generated method stub

		return 0;
	}

	@Override
	public Object getRoot() {
		return root;
	}

	@Override
	public boolean isLeaf(Object node) {
		String type = node.getClass().getName();
		if (type == "gr.uoi.cs.dmod.hecate.sql.Attribute") {
			return true;
		}
		return false;
	}

	@Override
	public void removeTreeModelListener(TreeModelListener arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void valueForPathChanged(TreePath arg0, Object arg1) {
		// TODO Auto-generated method stub
	}

}
