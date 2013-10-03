/**
 * 
 */
package gr.uoi.cs.daintiness.hecate.metrics;

/**
 * @author iskoulis
 *
 */
public class TableChanges {
	int version;
	int insertions;
	int deletions;
	int keyChange;
	int attrTypeChange;
	
	public TableChanges() {
		this.version = 0;
		
	}
}
