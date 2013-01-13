package gr.uoi.cs.daintiness.hecate.sql;

import java.util.Map;
import java.util.TreeMap;

public class ForeignKey extends Key {
	private Table ref;

	public ForeignKey(String name, TreeMap<String, Attribute> k, Table t) {
		super(name, k);
		this.ref = t;
	}
	
	public String toString() {
		String buff = new String();
		buff = "Foreign Key: ";
		for (Map.Entry<String, Attribute> entry : this.key.entrySet()) {
			Attribute a = entry.getValue();
			buff += a.toString() + " ";
		}
		buff += "\n";
		return buff;
	}
	
	public Table getRef() {
		return this.ref;
	}
}
