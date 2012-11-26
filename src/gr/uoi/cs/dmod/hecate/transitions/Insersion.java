/**
 * 
 */
package gr.uoi.cs.dmod.hecate.transitions;

import gr.uoi.cs.dmod.hecate.sql.Attribute;
import gr.uoi.cs.dmod.hecate.sql.Table;

import java.util.Collection;
import java.util.TreeMap;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * @author iskoulis
 *
 */
@XmlRootElement
public abstract class Insersion implements Transition {

	@XmlElement(name="table")
	Table affectedTable;

	TreeMap<String, Attribute> insertedAtributes;
	
	public Insersion() {
		insertedAtributes = new TreeMap<String, Attribute>();
	}
	
	public Table getAffTable(){
		return affectedTable;
	}
	
	public int getNumOfAffAttributes() {
		return insertedAtributes.size();
	}
	
	public TreeMap<String,Attribute> getAffAttributes() {
		return insertedAtributes;
	}
	
	@XmlElement(name="attribute")
	public Collection<Attribute> getList() {
		return insertedAtributes.values();
	}
}
