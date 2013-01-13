package gr.uoi.cs.daintiness.hecate.graph.tree;

import gr.uoi.cs.daintiness.hecate.sql.Attribute;
import gr.uoi.cs.daintiness.hecate.sql.SqlItem;

import org.netbeans.swing.outline.RowModel;

/**
 * An implementation of {@link RowModel}
 * @author giskou
 *
 */
public class HecateRowModel implements RowModel{


	@Override
	public Class<?> getColumnClass(int arg0) {
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
		switch (column) {
			case 0: 
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
			break;
			default: return null;
		}
		return null;
	}

	@Override
	public boolean isCellEditable(Object arg0, int arg1) {
		return false;
	}

	@Override
	public void setValueFor(Object arg0, int arg1, Object arg2) {
		// TODO Auto-generated method stub
		
	}

}
