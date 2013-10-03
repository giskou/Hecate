/**
 * 
 */
package gr.uoi.cs.daintiness.hecate.metrics;

import gr.uoi.cs.daintiness.hecate.io.Export;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

/**
 * @author iskoulis
 * 
 */
public class TablesOverVersion {

	private LinkedHashMap<String, LinkedHashMap<Integer, Integer>> tables;
	private LinkedHashMap<String, LinkedHashMap<Integer, TableChanges>> changes;

	public enum changeType {
		Insertion,
		Deletion,
		KeyChange,
		TypeChange
	}
	
	public void addChange(String table, int version, changeType type) {
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
		case TypeChange:
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
	
	public TablesOverVersion() {
		this.tables = new LinkedHashMap<String, LinkedHashMap<Integer, Integer>>();
		this.changes = new LinkedHashMap<String, LinkedHashMap<Integer, TableChanges>>();
	}

	public int getTableSize() {
		return tables.size();
	}
	
	public void export(String path, int versions) throws IOException {
		String filePath = Export.getDir(path) + File.separator + "tables.csv";
		BufferedWriter tables = new BufferedWriter(new FileWriter(filePath));
		tables.write(";");
		for (int i = 0; i < versions; i++) {
			tables.write(i+1 + ";");
		}
		tables.write("\n");
		for (Entry<String, LinkedHashMap<Integer, Integer>> e : this.tables.entrySet()) {
			tables.write(e.getKey() + ";");
			for (int i = 0; i < versions; i++) {
				if (e.getValue().containsKey(i)) {
					tables.write(e.getValue().get(i) + ";");
				} else {
					tables.write(" ;");
				}
			}
			tables.write("\n");
		}
		tables.close();
	}
}
