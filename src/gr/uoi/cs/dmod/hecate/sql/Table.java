package gr.uoi.cs.dmod.hecate.sql;

import java.util.Map;
import java.util.TreeMap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.NONE)
public class Table implements SqlItem{
	@XmlValue
	private String name;
	private TreeMap<String, Attribute> attrs;
	private Key pKey;
	private Key fKey;
	private char mode;
	
	// --Constructors--
	public Table() {
		this.name = null;
		this.attrs = new TreeMap<String, Attribute>();
		this.pKey = null;
		this.fKey = null;
	}
	
	public Table(String name, TreeMap<String, Attribute> attributes, Key pKey) {
		this.name = name;
		this.attrs = new TreeMap<String, Attribute>();
		for (Map.Entry<String, Attribute> entry : attributes.entrySet()) {
			this.attrs.put(entry.getKey(), entry.getValue()) ;
		}
		this.pKey = pKey;
		this.fKey = null;
		this.updateAttributes();
	}
	
	public Table(String n, TreeMap<String, Attribute> a, Key p, Key f) {
		this.name = n;
		this.attrs = a;
		this.pKey = p;
		this.fKey = f;
		this.updateAttributes();
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
	
	@Override
	public char getMode(){
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
		String buff = new String();
		buff = "Table: " + this.name + "\n";
		for (Map.Entry<String, Attribute> entry : this.attrs.entrySet()) {
			Attribute a = entry.getValue();
			buff += "    " + a.print() + "\n";
		}
		return buff;
	}
	
	public Attribute getAttrAt(int i) {
		int c = 0;
		if (i >= 0 && i < attrs.size()){
			for (Map.Entry<String, Attribute> t : attrs.entrySet()) {
				if (c == i) {
					return t.getValue();
				}
				c++;
			}
		}
		return null;
	}

	@Override
	public String whatAmI() {
		return "Table";
	}
	
	private void updateAttributes() {
		for (Map.Entry<String, Attribute> entry : attrs.entrySet()) {
			entry.getValue().setTable(this);
		}
	}
}
