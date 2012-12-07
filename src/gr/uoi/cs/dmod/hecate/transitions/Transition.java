/**
 * 
 */
package gr.uoi.cs.dmod.hecate.transitions;

import gr.uoi.cs.dmod.hecate.sql.Attribute;
import gr.uoi.cs.dmod.hecate.sql.Table;

import java.util.ArrayList;
import java.util.Collection;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;


/**
 * @author iskoulis
 *
 */
public abstract class Transition {

	@XmlElement(name="table")
	Table affectedTable;
	@XmlElement(name="attribute")
	Collection<Attribute> affectedAtributes;
	@XmlAttribute(name="type")
	String type;
	
	public Transition() {
		affectedTable = null;
		type = null;
		affectedAtributes = new ArrayList<Attribute>();
	}
	
	public void attribute(Attribute newAttribute) throws Exception {
		if (type == null) {
			type = "UpdateTable";
		}
		if (affectedTable == null) {
			this.affectedTable = newAttribute.getTable();
		} else if (affectedTable != newAttribute.getTable()){
			throw new Exception("ta ekanes salata!");
		}
		this.affectedAtributes.add(newAttribute);
	}
	
	public void table(Table newTable) {
		this.affectedTable = newTable;
		this.affectedAtributes = newTable.getAttrs().values();
	}
	
	public Table getAffTable(){
		return affectedTable;
	}
	
	public int getNumOfAffAttributes() {
		return affectedAtributes.size();
	}
	
	public Collection<Attribute> getAffAttributes() {
		return affectedAtributes;
	}
	
	
}
