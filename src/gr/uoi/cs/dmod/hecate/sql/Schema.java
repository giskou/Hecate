package gr.uoi.cs.dmod.hecate.sql;

import java.util.Map;
import java.util.TreeMap;

public class Schema implements SqlItem{
	
	private String name;
	private TreeMap<String, Table> tables;
	
	public Schema(TreeMap<String, Table> t) {
		this.tables = t;
	}
	
	public TreeMap<String, Table> getTables() {
		return this.tables;
	}
	
	public String toString() {
		return name;
	}
	
	public String print() {
		String buff = new String();
		buff = "Shema: \n\n";
		for (Map.Entry<String, Table> entry : this.tables.entrySet()) {
			Table a = entry.getValue();
			buff += "  " + a.print() + "\n";
		}
		return buff;
	}
	
	public void setTitle(String title) {
		this.name = title;
	}
	
	public Table getTableAt(int i) {
		int c = 0;
		if (i >= 0 && i < tables.size()){
			for (Map.Entry<String, Table> t : tables.entrySet()) {
				if (c == i) {
					return t.getValue();
				}
				c++;
			}
		}
		return null;
	}

	@Override
	public char getMode() {
		return 0;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setMode(char c) {
	
	}

	@Override
	public String whatAmI() {
		return "Schema";
	}
}
