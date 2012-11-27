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
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author iskoulis
 *
 */
@XmlRootElement
public class Deletion implements Transition {

	@XmlElement(name="table")
	Table affectedTable;
	@XmlElement(name="attribute")
	Collection<Attribute> deletedAtributes;
	@XmlAttribute(name="type")
	String type;
	
	public Deletion() {
		affectedTable = null;
		type = null;
		deletedAtributes = new ArrayList<Attribute>();
	}
	
	public Table getAffTable(){
		return affectedTable;
	}
	
	public int getNumOfAffAttributes() {
		return deletedAtributes.size();
	}
	
	public Collection<Attribute> getAffAttributes() {
		return deletedAtributes;
	}
	
	public void deleteAttribute(Attribute newAttribute) throws Exception {
		if (type == null) {
			type = "UpdateTable";
		}
		if (affectedTable == null) {
			this.affectedTable = newAttribute.getTable();
		} else if (affectedTable != newAttribute.getTable()){
			throw new Exception("ta ekanes salata!");
		}
		this.deletedAtributes.add(newAttribute);
	}
	
	public void deleteTable(Table newTable) {
		this.type = "DeleteTable";
		this.affectedTable = newTable;
		this.deletedAtributes = newTable.getAttrs().values();
	}
}
