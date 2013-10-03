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
	private LinkedHashMap<String, TableChanges> changes;

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
