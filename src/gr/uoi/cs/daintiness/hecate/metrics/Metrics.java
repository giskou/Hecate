/**
 * 
 */
package gr.uoi.cs.daintiness.hecate.metrics;


/**
 * 
 * @author iskoulis
 *
 */
public class Metrics {

	private String oldVersion;
	private String newVersion;
	private int insertions, deletions, alterations;
	private int tableIns, tableDel, tableAlt;
	private int attrIns, attrDel, attrAlt;
	private int attrTabIns, attrTabDel;
	private int keyAlt;
	private int numOfTables, numOfAttributes;
	private int numOfNewTables, numOfNewAttributes;
	private static int versions = 0;
	
	/**
	 * 
	 */
	public Metrics(String oldVersion, String newVersion) {
		versions++;
		this.oldVersion = oldVersion;
		this.newVersion = newVersion;
		reset();
	}
	
	public Metrics() {
		versions++;
		this.oldVersion = "not set";
		this.newVersion = "not set";
		reset();
	}
	
	public void setVersionNames(String oldVersion, String newVersion) {
		this.oldVersion = oldVersion;
		this.newVersion = newVersion;
	}

	private void reset() {
		insertions = deletions = alterations = 0;
		tableIns = tableDel = 0;
		attrIns = attrDel = 0;
		tableAlt = attrAlt = keyAlt = 0;
		numOfTables = numOfAttributes = 0;
	}
	
	public void resetVersionNum() {
		versions = 0;
	}

	public void insertAttr () {
		attrIns++; insertions++;
	}
	public void insertTabAttr () {
		attrTabIns++; insertions++;
	}
	public void insetTable() {
		tableIns++; insertions++;
	}

	public void deleteAttr() {
		attrDel++; deletions++;
	}
	public void deleteTabAttr() {
		attrTabDel++; deletions++;
	}
	public void deleteTable() {
		tableDel++; deletions++;
	}

	public void alterAttr() {
		attrAlt++;
		alterations++;
	}
	public void alterTable() {
		tableAlt++;
		alterations++;
	}
	public void alterKey() {
		keyAlt++;
		alterations++;
	}

	public void setOrigTables(int n) {
		numOfTables = n;
	}
	public void setOrigAttrs(int n) {
		numOfAttributes = n;
	}

	public void setNewTables(int n) {
		numOfNewTables = n;
	}
	public void setNewAttrs(int n) {
		numOfNewAttributes = n;
	}

	public int[] getTotalMetrics() {
		int i[] = {this.insertions, this.deletions, this.alterations};
		return i;
	}

	public int[] getTableMetrics() {
		int i[] = {this.tableIns, this.tableDel, this.tableAlt};
		return i;
	}

	public int[] getAttributeMetrics() {
		int i[] = {this.attrIns, this.attrDel, this.attrAlt ,this.keyAlt, this.attrTabIns, this.attrTabDel};
		return i;
	}

	public int[] getOldSizes() {
		int i[] = {this.numOfTables, this.numOfAttributes};
		return i;
	}

	public int[] getNewSizes() {
		int i[] = {this.numOfNewTables, this.numOfNewAttributes};
		return i;
	}

	public String[] getVersionNames() {
		String[] ret = {oldVersion, newVersion};
		return ret;
	}

	public int getNumVersions() {
		return versions;
	}

	public void sanityCheck() {
		int calcIns = tableIns + attrIns + attrTabIns;
		assert insertions == calcIns: "Insertions misculculated";
		int calcDel = tableDel + attrDel + attrTabDel;
		assert deletions == calcDel: "Deletions misculculated";
		int tableGrowth = numOfNewTables - numOfTables;
		int calcTabChanges = tableIns - tableDel;
		assert tableGrowth == calcTabChanges: "Table changes misculculated";
		int attrGrowth = numOfNewAttributes - numOfAttributes;
		int calcAttrChanges = attrIns + attrTabIns - attrDel - attrTabDel; 
		assert attrGrowth == calcAttrChanges: "Attribute changes misculculated";
	}
}
