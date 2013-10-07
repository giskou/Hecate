package gr.uoi.cs.daintiness.hecate.io;

import gr.uoi.cs.daintiness.hecate.diff.DiffResult;
import gr.uoi.cs.daintiness.hecate.metrics.TableChanges;
import gr.uoi.cs.daintiness.hecate.metrics.TablesOverVersion;
import gr.uoi.cs.daintiness.hecate.transitions.Deletion;
import gr.uoi.cs.daintiness.hecate.transitions.Insersion;
import gr.uoi.cs.daintiness.hecate.transitions.TransitionList;
import gr.uoi.cs.daintiness.hecate.transitions.Transitions;
import gr.uoi.cs.daintiness.hecate.transitions.Update;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class Export {
	
	public static void xml(Transitions trs, String path) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Update.class, Deletion.class, Insersion.class, TransitionList.class, Transitions.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			String filePath = getDir(path) + File.separator + "transitions.xml";
			jaxbMarshaller.marshal(trs, new FileOutputStream(filePath));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void metrics(DiffResult res, String path) throws IOException {
		String filePath = getDir(path) + File.separator + "metrics.csv";
		BufferedWriter metrics = new BufferedWriter(new FileWriter(filePath, true));
		String name = res.met.getVersionNames()[1];
		String time = name.substring(0, name.length()-4);
		metrics.write(
				res.met.getNumRevisions() + ";" +
				time + ";" +
				res.met.getVersionNames()[0] + ";" +
				res.met.getVersionNames()[1] + ";" +
				res.met.getOldSizes()[0] + ";" +
				res.met.getNewSizes()[0] + ";" +
				res.met.getOldSizes()[1] + ";" +
				res.met.getNewSizes()[1] + ";" +
				res.met.getTableMetrics()[0] + ";" +
				res.met.getTableMetrics()[1] + ";" +
				res.met.getAttributeMetrics()[0] + ";" +
				res.met.getAttributeMetrics()[1] + ";" +
				res.met.getAttributeMetrics()[2] + ";" +
				res.met.getAttributeMetrics()[3] + ";" +
				res.met.getTotalMetrics()[2] + ";" +
				res.met.getAttributeMetrics()[4] + ";" +
				res.met.getAttributeMetrics()[5] + ";" +
				res.met.getTableMetrics()[2] + "\n"
			);
		metrics.close();
	}
	
	public static void initMetrics(String path) throws IOException {
		String filePath = getDir(path) + File.separator + "metrics.csv";
		BufferedWriter metrics = new BufferedWriter(new FileWriter(filePath));
		metrics.write("trID;time;oldVer;newVer;#oldT;#newT;#oldA"
				+ ";#newA;tIns;tDel;aIns;aDel;tabAlt"
				+ ";aTypeAlt;keyAlt;totAlt;aTabIns;aTabDel\n");
		metrics.close();
	}
	
	public static String getDir(String path) {
		String parrent = (new File(path)).getParent();
		File dir = new File(parrent + File.separator + "results");
		if (!dir.exists()) {
			dir.mkdir();
		}
		return dir.getPath();
	}
	
	public static void tables(String path, int versions, TablesOverVersion tov) throws IOException {
		LinkedHashMap<String, LinkedHashMap<Integer, Integer>>ts = tov.getTables();
		String filePath = Export.getDir(path) + File.separator + "tables.csv";
		BufferedWriter tables = new BufferedWriter(new FileWriter(filePath));
		tables.write(";");
		for (int i = 0; i < versions; i++) {
			tables.write(i+1 + ";");
		}
		tables.write("\n");
		for (Entry<String, LinkedHashMap<Integer, Integer>> e : ts.entrySet()) {
			tables.write(e.getKey() + ";");
			for (int i = 0; i < versions; i++) {
				if (e.getValue().containsKey(i)) {
					tables.write(e.getValue().get(i) + ";");
				} else {
					tables.write(";");
				}
			}
			tables.write("\n");
		}
		tables.close();
		
		LinkedHashMap<String, LinkedHashMap<Integer, TableChanges>> tc = tov.getChanges();
		filePath = Export.getDir(path) + File.separator + "table_add.csv";
		tables = new BufferedWriter(new FileWriter(filePath));
		tables.write(";");
		for (int i = 1; i <= versions; i++) {
			tables.write(i + "-" + (i+1) + ";");
		}
		tables.write("\n");
		for (Entry<String, LinkedHashMap<Integer, TableChanges>> e : tc.entrySet()) {
			tables.write(e.getKey() + ";");
			for (int i = 0; i <= versions; i++) {
				if (e.getValue().containsKey(i)) {
					if (e.getValue().get(i).getInsertions() != 0) {
						tables.write(e.getValue().get(i).getInsertions());
					}
					tables.write(";");
				} else {
					tables.write(";");
				}
			}
			tables.write("\n");
		}
		tables.close();
		
		filePath = Export.getDir(path) + File.separator + "table_del.csv";
		tables = new BufferedWriter(new FileWriter(filePath));
		tables.write(";");
		for (int i = 1; i <= versions; i++) {
			tables.write(i + "-" + (i+1) + ";");
		}
		tables.write("\n");
		for (Entry<String, LinkedHashMap<Integer, TableChanges>> e : tc.entrySet()) {
			tables.write(e.getKey() + ";");
			for (int i = 0; i <= versions; i++) {
				if (e.getValue().containsKey(i)) {
					if (e.getValue().get(i).getDeletions() != 0) {
						tables.write(e.getValue().get(i).getDeletions());
					}
					tables.write(";");
				} else {
					tables.write(";");
				}
			}
			tables.write("\n");
		}
		tables.close();
		
		filePath = Export.getDir(path) + File.separator + "table_key_ch.csv";
		tables = new BufferedWriter(new FileWriter(filePath));
		tables.write(";");
		for (int i = 1; i <= versions; i++) {
			tables.write(i + "-" + (i+1) + ";");
		}
		tables.write("\n");
		for (Entry<String, LinkedHashMap<Integer, TableChanges>> e : tc.entrySet()) {
			tables.write(e.getKey() + ";");
			for (int i = 0; i <= versions; i++) {
				if (e.getValue().containsKey(i)) {
					if (e.getValue().get(i).getKeyChange() != 0) {
						tables.write(e.getValue().get(i).getKeyChange());
					}
					tables.write(";");
				} else {
					tables.write(";");
				}
			}
			tables.write("\n");
		}
		tables.close();
		
		filePath = Export.getDir(path) + File.separator + "table_type_ch.csv";
		tables = new BufferedWriter(new FileWriter(filePath));
		tables.write(";");
		for (int i = 1; i <= versions; i++) {
			tables.write(i + "-" + (i+1) + ";");
		}
		tables.write("\n");
		for (Entry<String, LinkedHashMap<Integer, TableChanges>> e : tc.entrySet()) {
			tables.write(e.getKey() + ";");
			for (int i = 0; i <= versions; i++) {
				if (e.getValue().containsKey(i)) {
					if (e.getValue().get(i).getAttrTypeChange() != 0) {
						tables.write(e.getValue().get(i).getAttrTypeChange());
					}
					tables.write(";");
				} else {
					tables.write(";");
				}
			}
			tables.write("\n");
		}
		tables.close();
	}
}
