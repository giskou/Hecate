package gr.uoi.cs.daintiness.hecate.graph.tree;

import gr.uoi.cs.daintiness.hecate.sql.Attribute;
import gr.uoi.cs.daintiness.hecate.sql.Table;

import org.netbeans.swing.outline.RowModel;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Schema;

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
				Class<?> type = node.getClass();
				if (type == Schema.class) {
					return null;
				}
				else if (type == Table.class) {
					return null;
				}
				else if (type == Attribute.class) {
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
