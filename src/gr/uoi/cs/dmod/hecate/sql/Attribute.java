package gr.uoi.cs.dmod.hecate.sql;

public class Attribute implements SqlItem{
	private String name;
	private String type;
	private boolean isNull;
	private boolean isKey;
	private String def;
	private char mode;
	
	public Attribute(String n, String t, boolean in, String d) {
		this.name = n;
		this.type = t;
		this.isNull = in;
		this.isKey = false;
		this.def = d;
		this.mode = 'u';
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
	
	public boolean isKey() {
		return this.isKey;
	}
	
	public void setToKey() {
		this.isKey = true;
	}
	@Override
	public char getMode() {
		return this.mode;
	}
	
	@Override
	public void setMode(char m){
		this.mode = m;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public String print() {
		return name + " " + type + " (" + mode + ")";
	}

	@Override
	public String whatAmI() {
		return "Attribute";
	}
}
