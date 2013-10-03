/**
 * 
 */
package gr.uoi.cs.daintiness.hecate.metrics;

/**
 * @author iskoulis
 *
 */
public class TableChanges {
	private int insertions;
	private int deletions;
	private int keyChange;
	private int attrTypeChange;

	public TableChanges() {
		this.insertions = 0;
		this.deletions = 0;
		this.keyChange = 0;
		this.attrTypeChange = 0;
	}

	public int getInsertions() { return insertions; }
	public int getDeletions() { return deletions; }
	public int getKeyChange() { return keyChange; }
	public int getAttrTypeChange() { return attrTypeChange; }
	
	public void addInsertion() {
		this.insertions++;
	}
	
	public void addDeletion() {
		this.deletions++;
	}
	
	public void addKeyChange() {
		this.keyChange++;
	}
	
	public void addAttrTypeChange() {
		this.attrTypeChange++;
	}
}
