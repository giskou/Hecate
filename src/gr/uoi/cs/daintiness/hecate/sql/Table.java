package gr.uoi.cs.daintiness.hecate.sql;

import java.util.Map;
import java.util.TreeMap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class Table implements SqlItem{
	@XmlElement
	private String name;
	private TreeMap<String, Attribute> attrs;
	@XmlElement
	private PrimaryKey pKey;
	private ForeignKey fKey;
	private int mode;
	
	// --Constructors--
	public Table() {
		this.name = null;
		this.attrs = new TreeMap<String, Attribute>();
		this.pKey = null;
		this.fKey = new ForeignKey();
	}
	
	public Table(String name) {
		this.name = name;
		this.attrs = new TreeMap<String, Attribute>();
		this.pKey = new PrimaryKey();
		this.fKey = new ForeignKey();
	}
	
	public Table(String name, TreeMap<String, Attribute> attributes, PrimaryKey pKey) {
		this.name = name;
		this.attrs = new TreeMap<String, Attribute>();
		for (Map.Entry<String, Attribute> entry : attributes.entrySet()) {
			this.attrs.put(entry.getKey(), entry.getValue()) ;
		}
		this.pKey = pKey;
		this.fKey = new ForeignKey();
		this.updateAttributes();
	}
	
	public Table(String n, TreeMap<String, Attribute> a, PrimaryKey p, ForeignKey f) {
		this.name = n;
		this.attrs = a;
		this.pKey = p;
		this.fKey = f;
		this.updateAttributes();
	}
	
	public void addAttribute(Attribute attr) {
		this.attrs.put(attr.getName(), attr);
		attr.setTable(this);
		if (attr.isKey()) {
			addAttrToPrimeKey(attr);
		}
	}
	
	public void addAttrToPrimeKey(Attribute attr) {
		attr.setToKey();
		this.pKey.add(attr);
	}
	
	// --Getters--
	public String getName() {
		return this.name;
	}
	
	public int getSize() {
		return attrs.size();
	}
	
	public TreeMap<String, Attribute> getAttrs() {
		return this.attrs;
	}
	
	public PrimaryKey getpKey() {
		return this.pKey;
	}
	
	public ForeignKey getfKey() {
		return this.fKey;
	}
	
	@Override
	public int getMode(){
		return this.mode;
	}
	
	@Override
	public void setMode(int mode){
		this.mode = mode;
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

	private void updateAttributes() {
		for (Map.Entry<String, Attribute> entry : attrs.entrySet()) {
			entry.getValue().setTable(this);
		}
	}
}
