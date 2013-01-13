package gr.uoi.cs.daintiness.hecate.diff;

import gr.uoi.cs.daintiness.hecate.sql.*;
import gr.uoi.cs.daintiness.hecate.transitions.*;

import java.util.Iterator;

/**
 * This class is responsible for performing the diff algorithm
 * between two SQL schemas. It then stores some metrics about the
 * performed diff.
 * @author giskou
 *
 */
public class Delta {

	private int insertions, deletions, alterations;
	private int tableIns, tableDel;
	private int attrIns, attrDel;
	private int alterKey, alterAttribute, alterTable;
	private int numOfTables, numOfAttributes;
	private Insersion in;
	private Deletion out;
	private Update up;
	private TransitionList tl;
		
	/**
	 * The default Constructor
	 * Just initializes <code>insertions</code> and <code>deletions</code>
	 */
	public Delta(){
		insertions = deletions = alterations = 0;
		tableIns = tableDel = 0;
		attrIns = attrDel = 0;
		numOfTables = numOfAttributes = 0;
		alterKey = alterAttribute = alterTable =0;
	}
	
	/**
	 * This function performs the main diff algorithm for
	 * finding the differences between the schemas that are 
	 * given as parameters. The algorithm is a modification of
	 * the SortMergeJoin algorithm found at DBMS's for joining
	 * two tables. The tables and attributes are stored on TreeMaps
	 * thus sorted according their name. Starting from the top of
	 * each Map we check the items for matches. If the original is
	 * larger lexicographically then the item of the modified Map does
	 * not exist in the original and so it's inserted and we move to
	 * the next item on the modified Map. Likewise, if the modified
	 * is larger lexicographically then the item on the original has been
	 * deleted and we move to the next item on the original Map. If a
	 * Map reaches at an end then the remaining items on the other Map
	 * are marked as inserted or deleted accordingly.
	 * @param A
	 *   The original schema
	 * @param B
	 *   The modified version of the original schema
	 */
	public TransitionList minus(Schema A, Schema B) {
		tl = new TransitionList(A.toString(), B.toString());
		String oldTableKey = null, newTableKey = null ;
		String oldAttrKey = null, newAttrKey = null ;
		Iterator<String> oldTableKeys = A.getTables().keySet().iterator() ;
		Iterator<Table> oldTableValues = A.getTables().values().iterator() ;
		Iterator<String> newTableKeys = B.getTables().keySet().iterator() ;
		Iterator<Table> newTableValues = B.getTables().values().iterator() ;
		
		if (oldTableKeys.hasNext() && newTableKeys.hasNext()){
			oldTableKey = oldTableKeys.next() ; numOfTables++;
			Table oldTable = (Table) oldTableValues.next() ;
			newTableKey = newTableKeys.next() ;
			Table newTable = (Table) newTableValues.next() ;
			while(true) {
				in = null;
				out = null;
				up = null;
				if (oldTableKey.compareTo(newTableKey) == 0) {
					// Matched tables
					oldTable.setMode('m');
					newTable.setMode('m');
					// check attributes
					Iterator<String> oldAttributeKeys = oldTable.getAttrs().keySet().iterator();
					Iterator<Attribute> oldAttributeValues = oldTable.getAttrs().values().iterator() ;
					Iterator<String> newAttributeKeys = newTable.getAttrs().keySet().iterator();
					Iterator<Attribute> newAttributeValues = newTable.getAttrs().values().iterator() ;
					
					if (oldAttributeKeys.hasNext() && newAttributeKeys.hasNext()){
						oldAttrKey = oldAttributeKeys.next() ; numOfAttributes++;
						Attribute oldAttr = oldAttributeValues.next();
						newAttrKey = newAttributeKeys.next() ;
						Attribute newAttr = newAttributeValues.next();
						while (true) {
							if (oldAttrKey.compareTo(newAttrKey) == 0) {
							// possible attribute match
								// check attribute type
								if (oldAttr.getType().compareTo(newAttr.getType()) == 0){
									// check key
									if (oldAttr.isKey() == newAttr.isKey()) {
										// Matched attributes
										oldAttr.setMode('m');
										newAttr.setMode('m');
									}
									else {
										// attribute key changed
										alterKey++;
										update(newAttr, "KeyChange");
										oldTable.setMode('u');
										newTable.setMode('u');
										oldAttr.setMode('u');
										newAttr.setMode('u');
									}
								}
								else {
									// attribute type changed
									alterAttribute++;
									update(newAttr, "TypeChange");
									oldTable.setMode('u');
									newTable.setMode('u');
									oldAttr.setMode('u');
									newAttr.setMode('u');
								}
								// move both attributes
								if (oldAttributeKeys.hasNext() && newAttributeKeys.hasNext()) {
									oldAttrKey = oldAttributeKeys.next() ; numOfAttributes++;
									oldAttr = oldAttributeValues.next();
									newAttrKey = newAttributeKeys.next() ;
									newAttr = newAttributeValues.next();
								}
								else {
									break ;
								}
							}
							else if (oldAttrKey.compareTo(newAttrKey) < 0) {
								// Deleted attributes
								attrDel++;
								delete(oldAttr);
								oldAttr.setMode('d');
								oldTable.setMode('u');
								newTable.setMode('u');
								// move old only attributes
								if (oldAttributeKeys.hasNext()) {
									oldAttrKey = oldAttributeKeys.next() ; numOfAttributes++;
									oldAttr = oldAttributeValues.next();
								}
								else {
									break ;
								}
							}
							else {
								// Inserted attributes
								attrIns++;
								insert(newAttr);
								newAttr.setMode('i');
								oldTable.setMode('u');
								newTable.setMode('u');
								// move new only
								if (newAttributeKeys.hasNext()) {
									newAttrKey = newAttributeKeys.next() ;
									newAttr = newAttributeValues.next();
								}
								else {
									break ;
								}
							}
						}
					}
					// check remaining attributes
					while (oldAttributeKeys.hasNext()) {
						oldAttrKey = (String) oldAttributeKeys.next(); numOfAttributes++;
						Attribute oldAttr = oldAttributeValues.next();
						// Deleted
						delete(oldAttr);
						attrDel++;
						oldAttr.setMode('d');
						oldTable.setMode('u');
						newTable.setMode('u');
					}
					while (newAttributeKeys.hasNext()) {
						newAttrKey = (String) newAttributeKeys.next();
						Attribute newAttr = newAttributeValues.next();
						// Inserted
						insert(newAttr);
						attrIns++;
						newAttr.setMode('i');
						oldTable.setMode('u');
						newTable.setMode('u');
					}
					// move both
					if (oldTableKeys.hasNext() && newTableKeys.hasNext()) {
						oldTableKey = oldTableKeys.next() ; numOfTables++;
						oldTable = (Table) oldTableValues.next() ;
						newTableKey = newTableKeys.next() ;
						newTable = (Table) newTableValues.next() ;
					}
					else {
						break ;
					}
				}
				else if (oldTableKey.compareTo(newTableKey) < 0) {
					// Deleted
					delete(oldTable);
					tableDel++;
					oldTable.setMode('d');
					// mark attributes deleted
					markAll(oldTable, 'd');
					// move old only
					if (oldTableKeys.hasNext()) {
						oldTableKey = oldTableKeys.next() ;  numOfTables++;
						oldTable = (Table) oldTableValues.next() ;
					}
					else {
						break;
					}
				}
				else {
					// Inserted
					insert(newTable);
					tableIns++;
					newTable.setMode('i');
					// mark attributes inserted
					markAll(newTable, 'i');
					// move new only
					if (newTableKeys.hasNext()) {
						newTableKey = newTableKeys.next() ;
						newTable = (Table) newTableValues.next() ;
					}
					else {
						break ;
					}
				}
			}
		}
		// check remaining table keys
		while (oldTableKeys.hasNext()) {
			oldTableKey = (String) oldTableKeys.next();  numOfTables++;
			Table oldTable = (Table) oldTableValues.next();
			tableDel++;
			delete(oldTable);
			oldTable.setMode('d');
			// mark attributes deleted
			markAll(oldTable, 'd');
		}
		while (newTableKeys.hasNext()) {
			newTableKey = (String) newTableKeys.next();
			Table newTable = (Table) newTableValues.next();
			tableIns++;
			insert(newTable);
			newTable.setMode('i');
			// mark attributes inserted
			markAll(newTable, 'i');
		}
		return tl;
	}

	private void markAll(Table t, char m) {
		for (Iterator<Attribute> i = t.getAttrs().values().iterator(); i.hasNext(); ) {
			i.next().setMode(m);
			switch(m){
				case 'i': attrIns++; break;
				case 'd': attrDel++; break;
				default:;
			}
		}
	}
	
	private void insert(SqlItem item) {
		if (item.getClass() == Attribute.class) {
			if (in == null) {
				in = new Insersion();
				tl.add(in);
			}
			try {
				in.attribute( (Attribute) item);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (item.getClass() == Table.class) {
			in = new Insersion();
			tl.add(in);
			in.table( (Table) item);
		}
	}
	
	private void delete(SqlItem item) {
		if (item.getClass() == Attribute.class) {
			if (out == null) {
				out = new Deletion();
				tl.add(out);
			}
			try {
				out.attribute( (Attribute) item);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (item.getClass() == Table.class) {
			out = new Deletion();
			tl.add(out);
			out.table( (Table) item);
		}
	}
	
	private void update(Attribute item, String type) {
		if (up == null) {
			up = new Update();
			tl.add(up);
		}
		try {
			up.updateAttribute((Attribute)item, type);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Returns the metrics of the diff performed with {@link minus}
	 * @return An integer array with insertions at 0
	 * and deletions at 1.
	 */
	public int[] getTotalMetrics() {
		this.insertions = this.tableIns + this.attrIns;
		this.deletions = this.tableDel + this.attrDel;
		this.alterations = this.alterKey + this.alterAttribute ;
		int i[] = {this.insertions, this.deletions, this.alterations};
		return i;
	}
	
	public int[] getTableMetrics() {
		this.alterTable = this.alterAttribute + this.alterKey +
		                  this.attrIns;
		int i[] = {this.tableIns, this.tableDel, this.alterTable};
		return i;
	}
	
	public int[] getAttributeMetrics() {
		int i[] = {this.attrIns, this.attrDel,
				   this.alterAttribute + this.alterKey};
		return i;
	}
	
	public int[] getOldSizes() {
		int i[] = {this.numOfTables, this.numOfAttributes};
		return i;
	}
	
	public int[] getNewSizes() {
		int i[] = {this.numOfTables + this.tableIns - this.tableDel, 
		           this.numOfAttributes + this.attrIns - this.attrDel};
		return i;
	}
}
