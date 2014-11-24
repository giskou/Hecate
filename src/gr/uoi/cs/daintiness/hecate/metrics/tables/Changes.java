/**
 * 
 */
package gr.uoi.cs.daintiness.hecate.metrics.tables;


/**
 * @author iskoulis
 *
 */
public class Changes {
	private int insertions;
	private int deletions;
	private int keyChange;
	private int attrTypeChange;
	
	public Changes() {
		this.insertions = 0;
		this.deletions = 0;
		this.keyChange = 0;
		this.attrTypeChange = 0;
	}

	public int getInsertions() { return insertions; }
	public int getDeletions() { return deletions; }
	public int getKeyChange() { return keyChange; }
	public int getAttrTypeChange() { return attrTypeChange; }

	public void addInsertion() { this.insertions++; }
	public void addInsertion(int i) { this.insertions += i;	}
	
	public void addDeletion() { this.deletions++; }
	public void addDeletion(int i) { this.deletions += i; }

	public void addKeyChange() { this.keyChange++; }
	public void addKeyChange(int i) { this.keyChange += i; }

	public void addAttrTypeChange() { this.attrTypeChange++; }
	public void addAttrTypeChange(int i) { this.attrTypeChange += i; }

	public int getTotal() {
		return this.insertions + this.deletions +
		       (this.keyChange > 0 ? 1 : 0) + this.attrTypeChange;
	}

	public String toString() {
		return this.insertions + "|" + this.deletions + "|" +
		       this.attrTypeChange + "|" + this.keyChange;
	}
}
