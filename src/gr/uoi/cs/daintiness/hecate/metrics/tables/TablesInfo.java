/**
 * 
 */
package gr.uoi.cs.daintiness.hecate.metrics.tables;

import java.util.HashMap;
import java.util.Set;

/**
 * @author iskoulis
 * 
 */
public class TablesInfo {

	private static HashMap<String, MetricsOverVersion>  data;
	private int versions;
	
	public TablesInfo() {
		if (data == null) {
			data = new HashMap<String, MetricsOverVersion>();
			versions = 0;
		}
	}

	public void addChange(String table, int version, ChangeType type) {
		if (this.versions < version) this.versions = version;
		TableMetrics t = lookup(table, version);
		Changes c = t.getChanges();
		switch (type) {
		case Insertion:
			c.addInsertion();
			break;
		case Deletion:
			c.addDeletion();
			break;
		case KeyChange:
			c.addKeyChange();
			break;
		case AttrTypeChange:
			c.addAttrTypeChange();
			break;
		}
	}

	public void addTable(String table, int version, int size) {
		TableMetrics t = lookup(table, version);
		t.setSize(size);
	}

	public Set<String> getTables() {
		return data.keySet();
	}
	
	public int getNumVersions() {
		return this.versions;
	}

	private TableMetrics lookup(String table, int version) {
		MetricsOverVersion m = data.get(table);
		if (m == null) {
			m = new MetricsOverVersion();
			data.put(table, m);
		}
		TableMetrics t = m.get(version);
		if (t == null) {
			t = new TableMetrics();
			m.put(version, t);
		}
		return t;
	}

	public void clear() {
		data.clear();
		versions = 0;
	}

	public MetricsOverVersion getTableMetrics(String table) {
		return data.get(table);
	}
}
