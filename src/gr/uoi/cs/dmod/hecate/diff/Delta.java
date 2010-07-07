package gr.uoi.cs.dmod.hecate.diff;

import gr.uoi.cs.dmod.hecate.sql.*;
import java.util.Iterator;

public class Delta {

	private int insertions, deletions;
	
	public Delta(){
		insertions = deletions = 0;
	}
	
	public void minus(Schema A, Schema B) {
		String oldTableKey = null, newTableKey = null ;
		String oldAttrKey = null, newAttrKey = null ;
		Iterator<String> oldTableKeys = A.getTables().keySet().iterator() ;
		Iterator<Table> oldTableValues = A.getTables().values().iterator() ;
		Iterator<String> newTableKeys = B.getTables().keySet().iterator() ;
		Iterator<Table> newTableValues = B.getTables().values().iterator() ;
		
		if (oldTableKeys.hasNext() && newTableKeys.hasNext()){
			oldTableKey = oldTableKeys.next() ;
			Table oldTable = (Table) oldTableValues.next() ;
			newTableKey = newTableKeys.next() ;
			Table newTable = (Table) newTableValues.next() ;
			while(true) {
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
						oldAttrKey = oldAttributeKeys.next() ;
						Attribute oldAttr = oldAttributeValues.next();
						newAttrKey = newAttributeKeys.next() ;
						Attribute newAttr = newAttributeValues.next();
						while (true) {
							if (oldAttrKey.compareTo(newAttrKey) == 0) {
								// Matched attributes
								oldAttr.setMode('m');
								newAttr.setMode('m');
								// move both attributes
								if (oldAttributeKeys.hasNext() && newAttributeKeys.hasNext()) {
									oldAttrKey = oldAttributeKeys.next() ;
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
								deletions++;
								oldAttr.setMode('d');
								oldTable.setMode('u');
								// move old only attributes
								if (oldAttributeKeys.hasNext()) {
									oldAttrKey = oldAttributeKeys.next() ;
									oldAttr = oldAttributeValues.next();
								}
								else {
									break ;
								}
							}
							else {
								// Inserted attributes
								insertions++;
								newAttr.setMode('i');
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
						oldAttrKey = (String) oldAttributeKeys.next();
						Attribute oldAttr = oldAttributeValues.next();
						// Deleted
						deletions++;
						oldAttr.setMode('d');
						oldTable.setMode('u');
					}
					while (newAttributeKeys.hasNext()) {
						newAttrKey = (String) newAttributeKeys.next();
						Attribute newAttr = newAttributeValues.next();
						// Inserted
						insertions++;
						newAttr.setMode('i');
						newTable.setMode('u');
					}
					// move both
					if (oldTableKeys.hasNext() && newTableKeys.hasNext()) {
						oldTableKey = oldTableKeys.next() ;
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
					deletions++;
					oldTable.setMode('d');
					// move old only
					if (oldTableKeys.hasNext()) {
						oldTableKey = oldTableKeys.next() ;
						oldTable = (Table) oldTableValues.next() ;
					}
					else {
						break;
					}
				}
				else {
					// Inserted
					insertions++;
					newTable.setMode('i');
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
			oldTableKey = (String) oldTableKeys.next();
			Table oldTable = (Table) oldTableValues.next();
			System.out.println(oldTableKey + " Deleted");
			oldTable.setMode('d');
		}
		while (newTableKeys.hasNext()) {
			newTableKey = (String) newTableKeys.next();
			Table newTable = (Table) newTableValues.next();
			System.out.println(newTableKey + " Inserted");
			newTable.setMode('i');
		}
	}
	
	public int[] getMetrics(){
		int i[] = {this.insertions, this.deletions};
		return i;
	}
}
