package gr.uoi.cs.dmod.hecate.graph.tree;

import gr.uoi.cs.dmod.hecate.sql.Attribute;
import gr.uoi.cs.dmod.hecate.sql.SqlItem;

import org.netbeans.swing.outline.RowModel;

public class HecateRowModel implements RowModel{

	@Override
	public Class<?> getColumnClass(int arg0) {
		// TODO Auto-generated method stub
		return String.class;
	}

	@Override
	public int getColumnCount() {
		return 1;
	}

	@Override
	public String getColumnName(int column) {
		switch (column) {
			case 0: return "Type";
			default: assert false;
		}
		return null;
	}

	@Override
	public Object getValueFor(Object node, int column) {
		String type = ((SqlItem)node).whatAmI();
		if (type == "Schema") {
			return null;
		}
		else if (type == "Table") {
			return null;
		}
		else if (type == "Attribute") {
			switch (column) {
				case 0: return ((Attribute)node).getType();
				default: assert false;
			}
		}
		return null;
	}

	@Override
	public boolean isCellEditable(Object arg0, int arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setValueFor(Object arg0, int arg1, Object arg2) {
		// TODO Auto-generated method stub
		
	}

}
