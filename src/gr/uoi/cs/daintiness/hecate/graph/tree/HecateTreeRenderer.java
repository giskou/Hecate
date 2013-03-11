package gr.uoi.cs.daintiness.hecate.graph.tree;

import gr.uoi.cs.daintiness.hecate.Hecate;
import gr.uoi.cs.daintiness.hecate.sql.Attribute;
import gr.uoi.cs.daintiness.hecate.sql.Schema;
import gr.uoi.cs.daintiness.hecate.sql.SqlItem;
import gr.uoi.cs.daintiness.hecate.sql.Table;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import org.netbeans.swing.outline.RenderDataProvider;

/**
 * Implements {@link RenderDataProvider}
 * @author giskou
 *
 */
public class HecateTreeRenderer implements RenderDataProvider {

	@Override
	public Color getBackground(Object o) {
		switch (((SqlItem)o).getMode()) {
			case SqlItem.UPDATED: return Color.YELLOW;
			case SqlItem.DELETED: return Color.RED;
			case SqlItem.INSERTED: return Color.GREEN;
			default: return null;
		}
	}

	@Override
	public String getDisplayName(Object o) {
		if (o.getClass() == Attribute.class) {
			if (((Attribute)o).isKey()) {
				return "<u>" + ((SqlItem)o).getName() + "</u>";
			}
		}
		return null;
	}

	@Override
	public Color getForeground(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Icon getIcon(Object o) {
		if (o.getClass() == Attribute.class) {
			return new ImageIcon(Hecate.class.getResource("art/attribute.png"));
		}
		if (o.getClass() == Table.class) {
			return new ImageIcon(Hecate.class.getResource("art/table.png"));
		}
		if (o.getClass() == Schema.class) {
			return new ImageIcon(Hecate.class.getResource("art/schema.png"));
		}
		return null;
	}

	@Override
	public String getTooltipText(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isHtmlDisplayName(Object o) {
		return true;
	}
}
