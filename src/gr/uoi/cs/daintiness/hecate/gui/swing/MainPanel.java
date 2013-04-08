package gr.uoi.cs.daintiness.hecate.gui.swing;

import gr.uoi.cs.daintiness.hecate.graph.tree.HecateRowModel;
import gr.uoi.cs.daintiness.hecate.graph.tree.HecateTreeModel;
import gr.uoi.cs.daintiness.hecate.graph.tree.HecateTreeRenderer;
import gr.uoi.cs.daintiness.hecate.sql.Schema;
import gr.uoi.cs.daintiness.hecate.sql.Table;

import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;
import javax.swing.tree.TreePath;

import org.netbeans.swing.outline.DefaultOutlineModel;
import org.netbeans.swing.outline.Outline;
import org.netbeans.swing.outline.OutlineModel;
import org.netbeans.swing.outline.TreePathSupport;

/**
 * This Panel contains two panes with the original and the modified
 * version of the generated trees of the schemas.
 * @author giskou
 *
 */
@SuppressWarnings("serial")
public class MainPanel extends JPanel {

	private JScrollPane leftScrollPane;
	private JScrollPane rightScrollPane;
	private Outline leftOutline;
	private Outline rightOutline;
	private HecateTreeModel leftTreeModel;
	private HecateTreeModel rightTreeModel;
	private OutlineModel leftOutlineModel;
	private OutlineModel rightOutlineModel;
	private TreePathSupport leftTreePathSup;
	private TreePathSupport rightTreePathSup;

	/**
	 * Default Constructor.
	 */
	public MainPanel() {
		setLayout(new GridLayout(1,2));

		leftScrollPane = new JScrollPane();
		add(leftScrollPane);

		rightScrollPane = new JScrollPane();
		add(rightScrollPane);
	}

	/**
	 * Creates and draws a tree of the schema <code>s</code> at side
	 * <code>side</code>.
	 * @param s the schema to be drawn.
	 * @param side the side of the Panel the schema will be drawn.
	 * Accepted values are <code>"old"</code> for the left side and
	 * <code>"new"</code> for the right side.
	 */
	protected void drawSchema(Schema s, String side) {
		if (side.compareTo("old") == 0) {
			leftTreeModel = new HecateTreeModel(s);
			leftOutlineModel = DefaultOutlineModel.createOutlineModel(leftTreeModel,
			                     new HecateRowModel(), true, "Name");
			leftOutline = new Outline();
			leftOutline.setModel(leftOutlineModel);
			leftOutline.setRenderDataProvider(new HecateTreeRenderer());
			leftScrollPane.add(leftOutline);
			leftScrollPane.setViewportView(leftOutline);
//			leftOutline.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
//				@Override
//				public void valueChanged(ListSelectionEvent e) {
//					int row = leftOutline.getSelectedRow();
//					String item = ((SqlItem)leftOutline.getValueAt(row, 0)).getName();
//					if (!e.getValueIsAdjusting()) {
//						System.out.println(item);
//					}
//				}
//			});
			leftTreePathSup = leftOutlineModel.getTreePathSupport();
			leftTreePathSup.addTreeExpansionListener(new TreeExpansionListener() {
				@Override
				public void treeExpanded(TreeExpansionEvent e) {
					Table ext = (Table) e.getPath().getLastPathComponent();
					Schema s = (Schema) rightTreeModel.getRoot();
					Object[] a = {s, s.getTables().get(ext.getName())};
					TreePath tp = new TreePath(a);
					try {
						rightTreePathSup.expandPath(tp);
					} catch (Exception e2) {}
				}
				@Override
				public void treeCollapsed(TreeExpansionEvent e) {
					Table ext = (Table) e.getPath().getLastPathComponent();
					Schema s = (Schema) rightTreeModel.getRoot();
					Object[] a = {s, s.getTables().get(ext.getName())};
					TreePath tp = new TreePath(a);
					try {
						rightTreePathSup.collapsePath(tp);
					} catch (Exception e2) {}
				}
			});
		}
		else if (side.compareTo("new") == 0) {
			rightTreeModel = new HecateTreeModel(s);
			rightOutlineModel = DefaultOutlineModel.createOutlineModel(rightTreeModel,
			                      new HecateRowModel(), true, "Name");
			rightOutline = new Outline();
			rightOutline.setModel(rightOutlineModel);
			rightOutline.setRenderDataProvider(new HecateTreeRenderer());
			rightScrollPane.add(rightOutline);
			rightScrollPane.setViewportView(rightOutline);
//			rightOutline.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
//				@Override
//				public void valueChanged(ListSelectionEvent e) {
//					int row = rightOutline.getSelectedRow();
//					String item = ((SqlItem)rightOutline.getValueAt(row, 0)).getName();
//					if (!e.getValueIsAdjusting()) {
//						System.out.println(item);
//					}
//				}
//			});
			rightTreePathSup = rightOutlineModel.getTreePathSupport();
			rightTreePathSup.addTreeExpansionListener(new TreeExpansionListener() {
				@Override
				public void treeExpanded(TreeExpansionEvent e) {
					Table ext = (Table) e.getPath().getLastPathComponent();
					Schema s = (Schema) leftTreeModel.getRoot();
					Object[] a = {s, s.getTables().get(ext.getName())};
					TreePath tp = new TreePath(a);
					try {
						leftTreePathSup.expandPath(tp);
					} catch (Exception e2) {}
				}
				@Override
				public void treeCollapsed(TreeExpansionEvent e) {
					Table ext = (Table) e.getPath().getLastPathComponent();
					Schema s = (Schema) leftTreeModel.getRoot();
					Object[] a = {s, s.getTables().get(ext.getName())};
					TreePath tp = new TreePath(a);
					try {
						leftTreePathSup.collapsePath(tp);
					} catch (Exception e2) {}
				}
			});
		}
	}
}
