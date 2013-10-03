package gr.uoi.cs.daintiness.hecate.diff;

import gr.uoi.cs.daintiness.hecate.sql.Attribute;
import gr.uoi.cs.daintiness.hecate.sql.Schema;
import gr.uoi.cs.daintiness.hecate.sql.SqlItem;
import gr.uoi.cs.daintiness.hecate.sql.Table;
import gr.uoi.cs.daintiness.hecate.transitions.Deletion;
import gr.uoi.cs.daintiness.hecate.transitions.Insersion;
import gr.uoi.cs.daintiness.hecate.transitions.Update;

import java.util.Iterator;

/**
 * This class is responsible for performing the diff algorithm
 * between two SQL schemas. It then stores some metrics about the
 * performed diff.
 * @author giskou
 *
 */
public class Delta {

	private static Insersion in;
	private static Deletion out;
	private static Update up;
	private static DiffResult res;
		
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
	public static DiffResult minus(Schema A, Schema B) {
		res = new DiffResult();
		res.setVersionNames(A.getName(), A.getName());
		String oldTableKey = null, newTableKey = null ;
		String oldAttrKey = null, newAttrKey = null ;
		Iterator<String> oldTableKeys = A.getTables().keySet().iterator() ;
		Iterator<Table> oldTableValues = A.getTables().values().iterator() ;
		Iterator<String> newTableKeys = B.getTables().keySet().iterator() ;
		Iterator<Table> newTableValues = B.getTables().values().iterator() ;
		setOriginalSizes(A.getSize(), B.getSize());
		if (oldTableKeys.hasNext() && newTableKeys.hasNext()){
			oldTableKey = oldTableKeys.next() ;
			Table oldTable = (Table) oldTableValues.next() ;
			newTableKey = newTableKeys.next() ;
			Table newTable = (Table) newTableValues.next() ;
			while(true) {
				in = null; out = null; up = null;
				if (oldTableKey.compareTo(newTableKey) == 0) {            // ** Matched tables
					match(oldTable, newTable);
					// check attributes
					Iterator<String> oldAttributeKeys = oldTable.getAttrs().keySet().iterator();
					Iterator<Attribute> oldAttributeValues = oldTable.getAttrs().values().iterator() ;
					Iterator<String> newAttributeKeys = newTable.getAttrs().keySet().iterator();
					Iterator<Attribute> newAttributeValues = newTable.getAttrs().values().iterator() ;
					
					if (oldAttributeKeys.hasNext() && newAttributeKeys.hasNext()){
						oldAttrKey = oldAttributeKeys.next() ;
						Attribute oldAttr = oldAttributeValues.next();
						newAttrKey = newAttributeKeys.next() ;
						Attribute newAttr = newAttributeValues.next();
						while (true) {
							if (oldAttrKey.compareTo(newAttrKey) == 0) {                   // possible attribute match
								if (oldAttr.getType().compareTo(newAttr.getType()) == 0){  // check attribute type
									if (oldAttr.isKey() == newAttr.isKey()) {              // ** Matched attributes
										match(oldAttr, newAttr);
									} else {                                               // * attribute key changed
										attrKeyChange(oldAttr, newAttr);
									}
								} else {                                                   // attribute type changed
									attrTypeChange(oldAttr, newAttr);
								}
								// move both attributes
								if (oldAttributeKeys.hasNext() && newAttributeKeys.hasNext()) {
									oldAttrKey = oldAttributeKeys.next() ;
									oldAttr = oldAttributeValues.next();
									newAttrKey = newAttributeKeys.next() ;
									newAttr = newAttributeValues.next();
									continue;
								} else {            // one of the lists is empty, must process the rest of the other
									break ;
								}
							} else if (oldAttrKey.compareTo(newAttrKey) < 0) {           // ** Deleted attributes
								attrDel(oldAttr, newTable);
								// move old only attributes
								if (oldAttributeKeys.hasNext()) {
									oldAttrKey = oldAttributeKeys.next();
									oldAttr = oldAttributeValues.next();
									continue;
								} else {                  // no more old
									attrIns(oldTable, newAttr);
									break ;
								}
							} else {                    // ** Inserted attributes
								attrIns(oldTable, newAttr);
								// move new only
								if (newAttributeKeys.hasNext()) {
									newAttrKey = newAttributeKeys.next() ;
									newAttr = newAttributeValues.next();
									continue;
								} else {                  // no more new
									attrDel(oldAttr, newTable);
									break ;
								}
							}
						}
					}
					// check remaining attributes
					while (oldAttributeKeys.hasNext()) {       // delete remaining old (not found in new)
						oldAttrKey = (String) oldAttributeKeys.next();
						Attribute oldAttr = oldAttributeValues.next();
						attrDel(oldAttr, newTable);
					}
					while (newAttributeKeys.hasNext()) {        // insert remaining new (not found in old)
						newAttrKey = (String) newAttributeKeys.next();
						Attribute newAttr = newAttributeValues.next();
						attrIns(oldTable, newAttr);
					}
					//  ** Done with attributes **
					if (newTable.getMode() == SqlItem.UPDATED) {
						tableAlt(newTable);
					}
					if (oldTableKeys.hasNext() && newTableKeys.hasNext()) {   // move both tables
						oldTableKey = oldTableKeys.next() ;
						oldTable = (Table) oldTableValues.next() ;
						newTableKey = newTableKeys.next() ;
						newTable = (Table) newTableValues.next() ;
						continue;
					} else {            // one list is empty
						break ;
					}
				} else if (oldTableKey.compareTo(newTableKey) < 0) {  // ** Table Deleted
					tableDel(oldTable);
					if (oldTableKeys.hasNext()) {                     // move old only
						oldTableKey = oldTableKeys.next() ;
						oldTable = (Table) oldTableValues.next() ;
						continue;
					} else {
						tableIns(newTable);
						break;
					}
				} else {                                             // ** Table Inserted
					tableIns(newTable);
					if (newTableKeys.hasNext()) {                    // move new only
						newTableKey = newTableKeys.next() ;
						newTable = (Table) newTableValues.next() ;
						continue;
					} else {
						tableDel(oldTable);
						break ;
					}
				}
			}
		}
		// check remaining table keys
		while (oldTableKeys.hasNext()) {
			oldTableKey = (String) oldTableKeys.next();
			Table oldTable = (Table) oldTableValues.next();
			tableDel(oldTable);
		}
		while (newTableKeys.hasNext()) {
			newTableKey = (String) newTableKeys.next();
			Table newTable = (Table) newTableValues.next();
			tableIns(newTable);
		}
		res.met.sanityCheck();
		return res;
	}

	private static void attrIns(Table oldTable, Attribute newAttr) {
		res.met.insertAttr();
		insert(newAttr);
		newAttr.setMode(SqlItem.INSERTED);
		oldTable.setMode(SqlItem.UPDATED);
		newAttr.getTable().setMode(SqlItem.UPDATED);
	}

	private static void attrDel(Attribute oldAttr, Table newTable) {
		res.met.deleteAttr();
		delete(oldAttr);
		oldAttr.setMode(SqlItem.DELETED);
		oldAttr.getTable().setMode(SqlItem.UPDATED);
		newTable.setMode(SqlItem.UPDATED);
	}

	private static void attrTypeChange(Attribute oldAttr, Attribute newAttr) {
		res.met.alterAttr();
		update(newAttr, "TypeChange");
		oldAttr.getTable().setMode(SqlItem.UPDATED);
		newAttr.getTable().setMode(SqlItem.UPDATED);
		oldAttr.setMode(SqlItem.UPDATED);
		newAttr.setMode(SqlItem.UPDATED);
	}

	private static void attrKeyChange(Attribute oldAttr, Attribute newAttr) {
		res.met.alterKey();
		update(newAttr, "KeyChange");
		oldAttr.getTable().setMode(SqlItem.UPDATED);
		newAttr.getTable().setMode(SqlItem.UPDATED);
		oldAttr.setMode(SqlItem.UPDATED);
		newAttr.setMode(SqlItem.UPDATED);
	}
	
	private static void tableDel(Table t) {
		delete(t);
		res.met.deleteTable();
		markAll(t, SqlItem.DELETED);     // mark attributes deleted
	}
	
	private static void tableIns(Table t) {
		insert(t);
		res.met.insetTable();
		markAll(t, SqlItem.INSERTED);     // mark attributes inserted
	}
	
	private static void tableAlt(Table t) {
		res.met.alterTable();
	}

	private static void match(SqlItem oldI, SqlItem newI) {
		oldI.setMode(SqlItem.MACHED);
		newI.setMode(SqlItem.MACHED);
	}

	private static void markAll(Table t, int mode) {
		t.setMode(mode);
		for (Iterator<Attribute> i = t.getAttrs().values().iterator(); i.hasNext(); ) {
			i.next().setMode(mode);
			switch(mode){
				case SqlItem.INSERTED: res.met.insertTabAttr(); break;
				case SqlItem.DELETED: res.met.deleteTabAttr(); break;
				default:;
			}
		}
	}
	
	private static void insert(SqlItem item) {
		if (item.getClass() == Attribute.class) {
			if (in == null) {
				in = new Insersion();
				res.tl.add(in);
			}
			try {
				in.attribute( (Attribute) item);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (item.getClass() == Table.class) {
			in = new Insersion();
			res.tl.add(in);
			in.table( (Table) item);
		}
	}
	
	private static void delete(SqlItem item) {
		if (item.getClass() == Attribute.class) {
			if (out == null) {
				out = new Deletion();
				res.tl.add(out);
			}
			try {
				out.attribute( (Attribute) item);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (item.getClass() == Table.class) {
			out = new Deletion();
			res.tl.add(out);
			out.table( (Table) item);
		}
	}
	
	private static void update(Attribute item, String type) {
		if (up == null) {
			up = new Update();
			res.tl.add(up);
		}
		try {
			up.updateAttribute((Attribute)item, type);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void setOriginalSizes(int[] sizeA, int[] sizeB) {
		res.met.setOrigTables(sizeA[0]); res.met.setOrigAttrs(sizeA[1]);
		res.met.setNewTables(sizeB[0]); res.met.setNewAttrs(sizeB[1]);
	}
}
