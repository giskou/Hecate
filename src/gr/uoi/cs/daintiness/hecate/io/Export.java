package gr.uoi.cs.daintiness.hecate.io;

import gr.uoi.cs.daintiness.hecate.diff.DiffResult;
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

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class Export {
	
	static private int id;
	
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
		metrics.write(
				(id++) + "," +
				"time" + "," + // TODO fix time stuff
				res.met.getVersionNames()[0] + "," +
				res.met.getVersionNames()[1] + "," +
				res.met.getOldSizes()[0] + "," +
				res.met.getNewSizes()[0] + "," +
				res.met.getOldSizes()[1] + "," +
				res.met.getNewSizes()[1] + "," +
				res.met.getTableMetrics()[0] + "," +
				res.met.getTableMetrics()[1] + "," +
				res.met.getAttributeMetrics()[0] + "," +
				res.met.getAttributeMetrics()[1] + "," +
				res.met.getAttributeMetrics()[2] + "," +
				res.met.getAttributeMetrics()[3] + "," +
				res.met.getTotalMetrics()[2] + "," +
				res.met.getAttributeMetrics()[4] + "," +
				res.met.getAttributeMetrics()[5] + "\n"
			);
		metrics.close();
	}
	
	public static void initMetrics(String path) throws IOException {
		id = 1;
		String filePath = getDir(path) + File.separator + "metrics.csv";
		BufferedWriter metrics = new BufferedWriter(new FileWriter(filePath));
		metrics.write("# transID,time,oldVersion,newVersion,#oldTables,#newTables,#oldAttrs"
				+ ",newAttr,tableIns,tableDel,attrIns,attrDel"
				+ ",attrTypeAlt,keyAlt,totalAlt,attrTabIns,attrTabDel\n");
		metrics.close();
	}
	
	private static String getDir(String path) {
		String parrent = (new File(path)).getParent();
		File dir = new File(parrent + File.separator + "results");
		if (!dir.exists()) {
			dir.mkdir();
		}
		return dir.getPath();
	}


}
