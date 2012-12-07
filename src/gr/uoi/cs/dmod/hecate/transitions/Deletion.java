/**
 * 
 */
package gr.uoi.cs.dmod.hecate.transitions;

import gr.uoi.cs.dmod.hecate.sql.Table;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author iskoulis
 *
 */
@XmlRootElement
public class Deletion extends Transition {

	public Deletion() {
		super();
	}
	
	public void table(Table newTable) {
		super.table(newTable);
		this.type = "DeleteTable";
	}
}
