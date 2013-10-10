/**
 * 
 */
package gr.uoi.cs.daintiness.hecate.diff;

import gr.uoi.cs.daintiness.hecate.metrics.Metrics;
import gr.uoi.cs.daintiness.hecate.metrics.tables.TablesInfo;
import gr.uoi.cs.daintiness.hecate.transitions.TransitionList;

/**
 * @author iskoulis
 *
 */
public class DiffResult {

	final public TransitionList tl;
	final public Metrics met;
	final public TablesInfo tInfo;
	/**
	 * 
	 */
	public DiffResult() {
		this.tl = new TransitionList();
		this.met = new Metrics();
		this.tInfo = new TablesInfo();
	}
	
	public void setVersionNames(String newVersion, String oldVersion) {
		this.tl.setVersionNames(oldVersion, newVersion);
		this.met.setVersionNames(oldVersion, newVersion);
	}
	
	public void clear() {
		this.tInfo.clear();
		met.resetRevisions();
	}
}
