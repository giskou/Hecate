package gr.uoi.cs.dmod.hecate.diff;

import gr.uoi.cs.dmod.hecate.sql.*;
import java.util.Iterator;

public class Delta {

	private String oldTableKey, newTableKey ;
	private String oldAttrKey, newAttrKey ;
	
	public Delta(){
		oldTableKey = newTableKey = oldAttrKey = newAttrKey =null ;
	}
	
	public void minus(Schema A, Schema B) {
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
				System.out.println();
				if (oldTableKey.compareTo(newTableKey) == 0) {
					System.out.println(oldTableKey + " Matched") ;
					oldTable.setMode('m');
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
								System.out.println(oldAttrKey + " Matched");
								oldAttr.setMode('m');
								newAttr.setMode('m');
								// move both
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
								System.out.println(oldAttrKey + " Deleted");
								oldAttr.setMode('d');
								// move old only
								if (oldAttributeKeys.hasNext()) {
									oldAttrKey = oldAttributeKeys.next() ;
									oldAttr = oldAttributeValues.next();
								}
								else {
									break ;
								}
							}
							else {
								System.out.println(newAttrKey + " Inserted");
								newAttr.setMode('i');
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
						System.out.println(oldAttrKey + " Deleted");
						oldAttr.setMode('d');
					}
					while (newAttributeKeys.hasNext()) {
						newAttrKey = (String) newAttributeKeys.next();
						Attribute newAttr = newAttributeValues.next();
						System.out.println(newAttrKey + " Inserted");
						newAttr.setMode('i');
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
					System.out.println(oldTableKey + " Deleted") ;
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
					System.out.println(newTableKey + " Inserted") ;
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
}
