package gr.uoi.cs.dmod.hecate.graph.tree;

import java.util.Map;
import java.util.TreeMap;

import gr.uoi.cs.dmod.hecate.sql.Schema;
import gr.uoi.cs.dmod.hecate.sql.Table;
import gr.uoi.cs.dmod.hecate.sql.Attribute;

import javax.swing.event.EventListenerList;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

public class HecateTreeModel implements TreeModel {
	
	protected Schema root;
	protected EventListenerList listenerList = new EventListenerList();
	
	public HecateTreeModel(Schema root) {
		this.root = root;
	}

	@Override
	public void addTreeModelListener(TreeModelListener l) {
		listenerList.add(TreeModelListener.class, l);
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
		int count = 0;
		String type = parent.getClass().getName();
		if (type == "gr.uoi.cs.dmod.hecate.sql.Schema") {
			TreeMap<String, Table> tables = ((Schema)parent).getTables();
			for (Map.Entry<String, Table> t : tables.entrySet()) {
				if (t.getKey().compareTo(child.toString()) == 0) { return count; }
				else { count++; } 
			}
			return -1;
		}
		else if (type == "gr.uoi.cs.dmod.hecate.sql.Table") {
			TreeMap<String, Attribute> attrs = ((Table)parent).getAttrs();
			for (Map.Entry<String, Attribute> a : attrs.entrySet()) {
				if (a.getKey().compareTo(child.toString()) == 0) { return count; }
				else { count++; } 
			}
		}
		else if (type == "gr.uoi.cs.dmod.hecate.sql.Attribute") {
			return -1;
		}

		return -1;
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
	public void removeTreeModelListener(TreeModelListener l) {
		listenerList.remove(TreeModelListener.class, l);
	}

	@Override
	public void valueForPathChanged(TreePath arg0, Object arg1) {
		// TODO Auto-generated method stub
	}
}
