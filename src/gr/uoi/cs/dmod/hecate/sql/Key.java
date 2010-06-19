package gr.uoi.cs.dmod.hecate.sql;

import java.util.Map;
import java.util.TreeMap;

public class Key {
	TreeMap<String, Attribute> key;
	
	public Key(TreeMap<String, Attribute> k) {
		this.key = k;
	}
	
	public String toString() {
		String buff = new String();
		buff = "Primary Key: ";
		for (Map.Entry<String, Attribute> entry : this.key.entrySet()) {
			Attribute a = entry.getValue();
			buff += a.toString() + " ";
		}
		buff += "\n";
		return buff;
	}
}
