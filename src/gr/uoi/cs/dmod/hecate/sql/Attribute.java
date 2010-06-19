package gr.uoi.cs.dmod.hecate.sql;

public class Attribute {
	String name;
	String type;
	boolean isNull;
	String def;
	
	public Attribute(String n, String t, boolean in, String d) {
		this.name = n;
		this.type = t;
		this.isNull = in;
		this.def = d;
	}
	
	// --Getters--
	public String getName() {
		return this.name;
	}
	
	public String getType() {
		return this.type;
	}
	
	public boolean getNull() {
		return this.isNull;
	}
	
	public String getDefault() {
		return this.def;
	}
	
	public String toString() {
		return name + " " + type;
	}
}
