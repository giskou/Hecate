package gr.uoi.cs.daintiness.hecate.sql;

import java.util.Map;
import java.util.TreeMap;

public class PrimaryKey implements SqlItem{
	private String name;
	protected TreeMap<String, Attribute> key;
	private int mode;
	
	public PrimaryKey() {
		this.name = null;
		this.key = new TreeMap<String, Attribute>();
	}
	
	public PrimaryKey(String name, TreeMap<String, Attribute> k) {
		this.key = k;
		this.name = name;
	}
	
	public void  add(Attribute attr) {
		key.put(attr.getName(), attr);
	}
	
	@Override
	public int getMode() {
		return this.mode;
	}

	@Override
	public String getName() {
		return this.name;
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
	public void setMode(int mode) {
		this.mode = mode;
	}
	
	public boolean isEmpty() {
		return key.isEmpty();
	}
	
	public String toString() {
		return this.name;
	}
}
