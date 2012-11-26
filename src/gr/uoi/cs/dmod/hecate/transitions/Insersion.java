/**
 * 
 */
package gr.uoi.cs.dmod.hecate.transitions;

import gr.uoi.cs.dmod.hecate.sql.Attribute;
import gr.uoi.cs.dmod.hecate.sql.Table;

import java.util.TreeMap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * @author iskoulis
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public abstract class Insersion implements Transition {

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
}
