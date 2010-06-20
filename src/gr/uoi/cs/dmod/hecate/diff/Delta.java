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
				if (oldTableKey.compareTo(newTableKey) == 0) {
					System.out.println(oldTableKey + " Matched") ;
					// check attributes
					Iterator<String> oldAttributeKeys = oldTable.getAttrs().keySet().iterator();
					Iterator<String> newAttributeKeys = newTable.getAttrs().keySet().iterator();
					
					if (oldAttributeKeys.hasNext() && newAttributeKeys.hasNext()){
						oldAttrKey = oldAttributeKeys.next() ;
						newAttrKey = newAttributeKeys.next() ;
						while (true) {
							if (oldAttrKey.compareTo(newAttrKey) == 0) {
								System.out.println(oldAttrKey + " Matched");
								// move both
								if (oldAttributeKeys.hasNext() && newAttributeKeys.hasNext()) {
									oldAttrKey = oldAttributeKeys.next() ;
									newAttrKey = newAttributeKeys.next() ;
								}
								else {
									break ;
								}
							}
							else if (oldAttrKey.compareTo(newAttrKey) < 0) {
								System.out.println(oldAttrKey + " Deleted");
								// move old only
								if (oldAttributeKeys.hasNext()) {
									oldAttrKey = oldAttributeKeys.next() ;
								}
								else {
									break ;
								}
							}
							else {
								System.out.println(newAttrKey + " Inserted");
								// move new only
								if (newAttributeKeys.hasNext()) {
									newAttrKey = newAttributeKeys.next() ;
								}
								else {
									break ;
								}
							}
						}
					}
					// check remaining attributes
					while (oldTableKeys.hasNext()) {
						oldAttrKey = (String) oldAttributeKeys.next();
//						Table newTable = (Table) newTableValues.next();
						System.out.println(oldAttrKey + " Deleted");
					}
					while (newTableKeys.hasNext()) {
						newAttrKey = (String) newAttributeKeys.next();
//						Table newTable = (Table) newTableValues.next();
						System.out.println(newAttrKey + " Inserted");
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
//			Table newTable = (Table) newTableValues.next();
			System.out.println(oldTableKey + " Deleted");
		}
		while (newTableKeys.hasNext()) {
			newTableKey = (String) newTableKeys.next();
//			Table newTable = (Table) newTableValues.next();
			System.out.println(newTableKey + " Inserted");
		}
	}
}
