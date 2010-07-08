package gr.uoi.cs.dmod.hecate.graph.tree;

import gr.uoi.cs.dmod.hecate.sql.SqlItem;

import java.awt.Color;

import javax.swing.Icon;

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
