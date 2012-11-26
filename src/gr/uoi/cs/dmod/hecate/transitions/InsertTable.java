/**
 * 
 */
package gr.uoi.cs.dmod.hecate.transitions;

import gr.uoi.cs.dmod.hecate.sql.Table;

/**
 * @author iskoulis
 *
 */
public class InsertTable extends Insersion {
	
	public InsertTable(Table newTable) {
		super.affectedTable = newTable;
		super.insertedAtributes = newTable.getAttrs();
	}
}
