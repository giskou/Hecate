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
		this.insertions = 0;
		this.deletions = 0;
		this.keyChange = 0;
		this.attrTypeChange = 0;
	}

	public int getVersion() { return version; }
	public int getInsertions() { return insertions; }
	public int getDeletions() { return deletions; }
	public int getKeyChange() { return keyChange; }
	public int getAttrTypeChange() { return attrTypeChange; }
	
	public void setVersion(int version) {
		this.version = version;
	}
	
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
