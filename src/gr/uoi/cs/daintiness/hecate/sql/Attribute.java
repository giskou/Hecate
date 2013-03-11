package gr.uoi.cs.daintiness.hecate.sql;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class Attribute implements SqlItem{
	private Table table;
	@XmlElement
	private String name;
	@XmlElement
	private String type;
	private boolean isNull;
	@XmlElement
	private boolean isKey;
	private String def;
	private int mode;
	
	public Attribute() {
		this.table = null;
		this.name = null;
		this.type = null;
		this.isNull = false;
		this.isKey = false;
		this.def = null;
		this.mode = UNTOUCHED;
	}
	
	public Attribute(String name, String type, boolean isNull, String d) {
		this.name = name;
		this.type = type;
		this.isNull = isNull;
		this.isKey = false;
		this.def = d;
		this.mode = UPDATED;
	}	
	
	public Attribute(String name, String type) {
		this.name = name;
		this.type = type;
		this.isNull = false;
		this.isKey = false;
		this.def = null;
		this.mode = UPDATED;
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
	public int getMode() {
		return this.mode;
	}
	
	@Override
	public void setMode(int mode){
		this.mode = mode;
	}
	
	public void setTable(Table t) {
		this.table = t;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public String print() {
		String s = name + " " + type + " (" + mode + ")";
		if (this.isKey) s += " *PK*";
		return s;
	}
}
