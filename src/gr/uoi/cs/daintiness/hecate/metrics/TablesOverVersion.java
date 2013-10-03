/**
 * 
 */
package gr.uoi.cs.daintiness.hecate.metrics;

import java.util.LinkedHashMap;

/**
 * @author iskoulis
 * 
 */
public class TablesOverVersion {

	private LinkedHashMap<String, LinkedHashMap<Integer, Integer>> tables;
	private static LinkedHashMap<String, LinkedHashMap<Integer, TableChanges>> changes;
	
	
	public TablesOverVersion() {
		this.tables = new LinkedHashMap<String, LinkedHashMap<Integer, Integer>>();
		if (changes == null) {
			changes = new LinkedHashMap<String, LinkedHashMap<Integer, TableChanges>>();
		}
	}

	public void addChange(String table, int version, TableChangeType type) {
		LinkedHashMap<Integer, TableChanges> tcm;
		if (changes.containsKey(table)) {
			tcm = changes.get(table);
		} else {
			tcm = new LinkedHashMap<Integer, TableChanges>();
			changes.put(table, tcm);
		}
		TableChanges tc;
		if (tcm.containsKey(version)) {
			tc = tcm.get(version);
		} else {
			tc = new TableChanges();
			tcm.put(version, tc);
		}
		switch (type) {
		case Insertion:
			tc.addInsertion();
			break;
		case Deletion:
			tc.addDeletion();
			break;
		case KeyChange:
			tc.addKeyChange();
			break;
		case AttrTypeChange:
			tc.addAttrTypeChange();
			break;
		}
	}
	
	public boolean addTable(String name, int version, int size) {
		if (tables.containsKey(name)) {
			tables.get(name).put(version, size);
			return false;
		} else {
			tables.put(name, new LinkedHashMap<Integer, Integer>());
			tables.get(name).put(version, size);
			return true;
		}
	}

	public int getTableSize() {
		return tables.size();
	}
	
	public LinkedHashMap<String, LinkedHashMap<Integer, Integer>> getTables() {
		return this.tables;
	}

	public LinkedHashMap<String, LinkedHashMap<Integer, TableChanges>> getChanges() {
		return changes;
	}
}
