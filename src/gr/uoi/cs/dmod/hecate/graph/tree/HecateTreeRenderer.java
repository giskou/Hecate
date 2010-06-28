package gr.uoi.cs.dmod.hecate.graph.tree;

import gr.uoi.cs.dmod.hecate.sql.Attribute;
import gr.uoi.cs.dmod.hecate.sql.Table;

import java.awt.Color;

import javax.swing.Icon;

import org.netbeans.swing.outline.RenderDataProvider;

public class HecateTreeRenderer implements RenderDataProvider {

	@Override
	public Color getBackground(Object o) {
		String type = o.getClass().getName();
		if (type == "gr.uoi.cs.dmod.hecate.sql.Schema") {
			return null;
		}
		else if (type == "gr.uoi.cs.dmod.hecate.sql.Table") {
			if (((Table)o).getMode() == 'u') {
				return Color.YELLOW;
			}
			else if (((Table)o).getMode() == 'd') {
				return Color.RED;
			}
			else if (((Table)o).getMode() == 'i') {
				return Color.GREEN;
			}
		}
		else if (type == "gr.uoi.cs.dmod.hecate.sql.Attribute") {
			if (((Attribute)o).getMode() == 'u') {
				return Color.YELLOW;
			}
			else if (((Attribute)o).getMode() == 'd') {
				return Color.RED;
			}
			else if (((Attribute)o).getMode() == 'i') {
				return Color.GREEN;
			}
		}
		return null;
	}

	@Override
	public String getDisplayName(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color getForeground(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Icon getIcon(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTooltipText(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isHtmlDisplayName(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

}
