/**
 * 
 */
package gr.uoi.cs.dmod.hecate.transitions;

import gr.uoi.cs.dmod.hecate.sql.Attribute;

/**
 * @author iskoulis
 *
 */
public class InsertAttribute extends Insersion {
	
	public InsertAttribute(Attribute newAttribute) {
		super();
		super.affectedTable = newAttribute.getTable();
		super.insertedAtributes.put(newAttribute.getName(), newAttribute);
	}
}
