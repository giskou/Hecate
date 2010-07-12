package gr.uoi.cs.dmod.hecate.graph.tree;

import gr.uoi.cs.dmod.hecate.sql.Attribute;
import gr.uoi.cs.dmod.hecate.sql.SqlItem;

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
			case 'u': return Color.YELLOW;
			case 'd': return Color.RED;
			case 'i': return Color.GREEN;
			default: return null;
		}
	}

	@Override
	public String getDisplayName(Object o) {
		if (((SqlItem)o).whatAmI().compareTo("Attribute") == 0) {
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
		if (((SqlItem)o).whatAmI().compareTo("Attribute") == 0) {
			return new ImageIcon("art/attribute.png");
		}
		if ((((SqlItem)o).whatAmI().compareTo("Table") == 0)) {
			return new ImageIcon("art/table.png");
		}
		if ((((SqlItem)o).whatAmI().compareTo("Schema") == 0)) {
			return new ImageIcon("art/schema.png");
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
