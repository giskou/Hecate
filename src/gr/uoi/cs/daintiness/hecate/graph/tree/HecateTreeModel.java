package gr.uoi.cs.daintiness.hecate.graph.tree;

import gr.uoi.cs.daintiness.hecate.sql.Attribute;
import gr.uoi.cs.daintiness.hecate.sql.Schema;
import gr.uoi.cs.daintiness.hecate.sql.Table;

import java.util.Map;
import java.util.TreeMap;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 * Implements {@link TreeModel}
 * @author giskou
 *
 */
public class HecateTreeModel implements TreeModel {
	
	private Schema root;
	
	public HecateTreeModel(Schema root) {
		this.root = root;
	}

	@Override
	public void addTreeModelListener(TreeModelListener l) {
		// TODO Auto-generated method stub
	}

	@Override
	public Object getChild(Object parent, int index) {
		Class<?> type = parent.getClass();
		if (type == Schema.class) {
			return ((Schema)parent).getTableAt(index);
		}
		else if (type == Table.class) {
			return ((Table)parent).getAttrAt(index);
		}
		return null;
	}

	@Override
	public int getChildCount(Object node) {
		Class<?> type = node.getClass();
		int count = 0;
		if (type == Schema.class) {
			count = ((Schema)node).getTables().size();
		}
		else if (type == Table.class) {
			count = ((Table)node).getAttrs().size();
		}
		else if (type == Attribute.class) {
			count = 0;
		}
		return count;
	}

	@Override
	public int getIndexOfChild(Object parent, Object child) {
		int count = 0;
		Class<?> type = parent.getClass();
		if (type == Schema.class) {
			TreeMap<String, Table> tables = ((Schema)parent).getTables();
			for (Map.Entry<String, Table> t : tables.entrySet()) {
				if (t.getKey().compareTo(child.toString()) == 0) { return count; }
				else { count++; } 
			}
			return -1;
		}
		else if (type == Table.class) {
			TreeMap<String, Attribute> attrs = ((Table)parent).getAttrs();
			for (Map.Entry<String, Attribute> a : attrs.entrySet()) {
				if (a.getKey().compareTo(child.toString()) == 0) { return count; }
				else { count++; } 
			}
		}
		else if (type == Attribute.class) {
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
		Class<?> type = node.getClass();
		if (type == Attribute.class) {
			return true;
		}
		return false;
	}

	@Override
	public void removeTreeModelListener(TreeModelListener l) {
		// TODO Auto-generated method stub
	}

	@Override
	public void valueForPathChanged(TreePath arg0, Object arg1) {
		// TODO Auto-generated method stub
	}
}
