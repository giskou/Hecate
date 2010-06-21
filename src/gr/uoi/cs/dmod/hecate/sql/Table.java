package gr.uoi.cs.dmod.hecate.sql;

import java.util.Map;
import java.util.TreeMap;

public class Table {
	String name;
	TreeMap<String, Attribute> attrs;
	Key pKey;
	Key fKey;
	char mode;
	
	// --Constructors--
	public Table(String n, TreeMap<String, Attribute> a, Key p) {
		this.name = n;
		this.attrs = new TreeMap<String, Attribute>();
		for (Map.Entry<String, Attribute> entry : a.entrySet()) {
			this.attrs.put(entry.getKey(), entry.getValue()) ;
		}
		this.pKey = p;
		this.fKey = null;
	}
	
	public Table(String n, TreeMap<String, Attribute> a, Key p, Key f) {
		this.name = n;
		this.attrs = a;
		this.pKey = p;
		this.fKey = f;
	}
	
	// --Getters--
	public String getName() {
		return this.name;
	}
	
	public TreeMap<String, Attribute> getAttrs() {
		return this.attrs;
	}
	
	public Key getpKey() {
		return this.pKey;
	}
	
	public Key getfKey() {
		return this.fKey;
	}
	
	public void setMode(char m){
		this.mode = m;
	}
	
	public String toString() {
		String buff = new String();
		buff = "Table: " + this.name + "\n";
		for (Map.Entry<String, Attribute> entry : this.attrs.entrySet()) {
			Attribute a = entry.getValue();
			buff += "    " + a.toString() + "\n";
		}
		return buff;
	}
}
