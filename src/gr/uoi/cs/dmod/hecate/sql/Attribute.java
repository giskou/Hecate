package gr.uoi.cs.dmod.hecate.sql;

public class Attribute implements SqlItem{
	private Table table;
	private String name;
	private String type;
	private boolean isNull;
	private boolean isKey;
	private String def;
	private char mode;
	
	public Attribute() {
		this.table = null;
		this.name = null;
		this.type = null;
		this.isNull = false;
		this.isKey = false;
		this.def = null;
		this.mode = 'x';
	}
	
	public Attribute(Table tab, String name, String type, boolean isNull, String d) {
		this.table = tab;
		this.name = name;
		this.type = type;
		this.isNull = isNull;
		this.isKey = false;
		this.def = d;
		this.mode = 'u';
	}
	
	// --Getters--
	public Table getTable() {
		return this.table;
	}
	
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
