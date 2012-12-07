package gr.uoi.cs.dmod.hecate.sql;

import java.util.Map;
import java.util.TreeMap;

public class Key implements SqlItem{
	private String name;
	protected TreeMap<String, Attribute> key;
	private char mode;
	
	public Key() {
		this.name = null;
		this.key = new TreeMap<String, Attribute>();
	}
	
	public Key(String name, TreeMap<String, Attribute> k) {
		this.key = k;
		this.name = name;
	}
	
	@Override
	public char getMode() {
		return mode;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String print() {
		String buff = new String();
		buff = "Primary Key: ";
		for (Map.Entry<String, Attribute> entry : this.key.entrySet()) {
			Attribute a = entry.getValue();
			buff += a.toString() + " ";
		}
		buff += "\n";
		return buff;
	}

	@Override
	public void setMode(char c) {
		mode = c;
	}

	@Override
	public String whatAmI() {
		return "Key";
	}
	
	public String toString() {
		return name;
	}
}
