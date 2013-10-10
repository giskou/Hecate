/**
 * 
 */
package gr.uoi.cs.daintiness.hecate.metrics.tables;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * @author iskoulis
 *
 */
public class MetricsOverVersion extends HashMap<Integer, TableMetrics> {

	private static final long serialVersionUID = 6222279078841584012L;
	
	public Changes getChanges(int version) {
		return get(version).getChanges();
	}
	
	public int getSize(int version) {
		return get(version).getSize();
	}
	
	Changes getTotalChanges() {
		Changes c = new Changes();
		for (Entry<Integer, TableMetrics> e : this.entrySet() ) {
			Changes vc = e.getValue().getChanges();
			c.addInsertion(vc.getInsertions());
			c.addDeletion(vc.getInsertions());
			c.addAttrTypeChange(vc.getInsertions());
			c.addKeyChange(vc.getInsertions());
		}
		return c;
	}
}
