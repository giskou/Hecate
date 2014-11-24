/**
 * 
 */
package gr.uoi.cs.daintiness.hecate.gui.swing;

import gr.uoi.cs.daintiness.hecate.diff.Delta;
import gr.uoi.cs.daintiness.hecate.diff.DiffResult;
import gr.uoi.cs.daintiness.hecate.io.Export;
import gr.uoi.cs.daintiness.hecate.parser.HecateParser;
import gr.uoi.cs.daintiness.hecate.sql.Schema;
import gr.uoi.cs.daintiness.hecate.sql.Table;
import gr.uoi.cs.daintiness.hecate.transitions.Transitions;

import java.io.File;
import java.util.Map.Entry;

import javax.swing.ProgressMonitor;
import javax.swing.SwingWorker;

/**
 * @author iskoulis
 *
 */
public class DiffWorker extends SwingWorker<DiffResult, Integer> {
	
	MainPanel mp;
	ProgressMonitor pm;
	File oldFile = null;
	File newFile = null;
	File folder = null;
	Schema oldSchema;
	Schema newSchema;
	
	public DiffWorker(MainPanel mp,
			          File oldFile, File newFile) {
		this.mp = mp;
		this.oldFile = oldFile;
		this.newFile = newFile;
	}
	
	public DiffWorker(MainPanel mp, File folder) {
		this.mp = mp;
		this.folder = folder;
	}

	@Override
	protected DiffResult doInBackground() throws Exception {
		pm = new ProgressMonitor(mp.getRootPane(), "Working...", null, 0, 100);
		DiffResult res = new DiffResult();
		if (oldFile != null && newFile != null) {
			pm.setMaximum(3);
			oldSchema = HecateParser.parse(oldFile.getAbsolutePath());
			pm.setProgress(1);
			newSchema = HecateParser.parse(newFile.getAbsolutePath());
			pm.setProgress(2);
			res = Delta.minus(oldSchema, newSchema);
			pm.setProgress(3);
			oldFile = null;
			newFile = null;
		} else if (folder != null){
			res.clear();
			Transitions trs = new Transitions();
			String[] list = folder.list();
			pm.setMaximum(list.length);
			String path = folder.getAbsolutePath();
			java.util.Arrays.sort(list);
			
			Export.initMetrics(path);
			for (int i = 0; i < list.length-1; i++) {
				pm.setNote("Parsing " + list[i]);
				Schema schema = HecateParser.parse(path + File.separator + list[i]);
				for (Entry<String, Table> e : schema.getTables().entrySet()) {
					String tname = e.getKey();
					int attrs = e.getValue().getSize();
					res.tInfo.addTable(tname, i, attrs);
				}
				pm.setNote("Parsing " + list[i+1]);
				Schema schema2 = HecateParser.parse(path + File.separator + list[i+1]);
				if (i == list.length-2) {
					for (Entry<String, Table> e : schema2.getTables().entrySet()) {
						String tname = e.getKey();
						int attrs = e.getValue().getSize();
						res.tInfo.addTable(tname, i+1, attrs);
					}
				}
				pm.setNote(list[i] + "-" + list[i+1]);
				res = Delta.minus(schema, schema2);
				trs.add(res.tl);
				Export.metrics(res, path);
				pm.setProgress(i+1);
			}
			try {
				Export.tables(path, res.met.getNumRevisions()+1, res.tInfo);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Export.xml(trs, path);
			oldSchema = HecateParser.parse(path + File.separator + list[0]);
			newSchema = HecateParser.parse(path + File.separator + list[list.length-1]);
			res = Delta.minus(oldSchema, newSchema);
			folder = null;
		}
		return res;
	}

	@Override
	protected void done() {
		mp.drawSchema(oldSchema, "old");
		mp.drawSchema(newSchema, "new");
		pm.setProgress(pm.getMaximum());
		super.done();
	}
}
