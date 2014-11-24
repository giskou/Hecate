package gr.uoi.cs.daintiness.hecate.io;

import gr.uoi.cs.daintiness.hecate.diff.DiffResult;
import gr.uoi.cs.daintiness.hecate.metrics.tables.Changes;
import gr.uoi.cs.daintiness.hecate.metrics.tables.MetricsOverVersion;
import gr.uoi.cs.daintiness.hecate.metrics.tables.TablesInfo;
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

import javax.swing.JOptionPane;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class Export {

	public static void xml(Transitions trs, String path) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Update.class,
					Deletion.class, Insersion.class,
					TransitionList.class, Transitions.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			String filePath = getDir(path) + File.separator + "transitions.xml";
			jaxbMarshaller.marshal(trs, new FileOutputStream(filePath));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void metrics(DiffResult res, String path)
			throws IOException {
		String filePath = getDir(path) + File.separator + "metrics.csv";
		FileWriter fw = new FileWriter(filePath, true);
		BufferedWriter metrics = new BufferedWriter(fw);
		String name = res.met.getVersionNames()[1];
		String time = name.substring(0, name.length()-4);
		metrics.write(
				res.met.getNumRevisions() + ";" +			//trID
				time + ";" +								//time
				res.met.getVersionNames()[0] + ";" +		//oldVer
				res.met.getVersionNames()[1] + ";" +		//newVer
				res.met.getOldSizes()[0] + ";" +			//#oldT
				res.met.getNewSizes()[0] + ";" +			//#newT
				res.met.getOldSizes()[1] + ";" +			//#oldA
				res.met.getNewSizes()[1] + ";" +			//#newA
				res.met.getTableMetrics()[0] + ";" +		//tIns
				res.met.getTableMetrics()[1] + ";" +		//tDel
				res.met.getAttributeMetrics()[0] + ";" +	//aIns
				res.met.getAttributeMetrics()[1] + ";" +	//aDel
				res.met.getAttributeMetrics()[2] + ";" +	//aTypeAlt
				res.met.getAttributeMetrics()[3] + ";" +	//keyAlt
				res.met.getAttributeMetrics()[4] + ";" +	//aTabIns
				res.met.getAttributeMetrics()[5] + "\n"		//aTabDel
			);
		metrics.close();
	}

	public static void initMetrics(String path) throws IOException {
		String filePath = getDir(path) + File.separator + "metrics.csv";
		BufferedWriter metrics = new BufferedWriter(new FileWriter(filePath));
		metrics.write("trID;time;oldVer;newVer;#oldT;#newT;#oldA;#newA"
				+ ";tIns;tDel;aIns;aDel;aTypeAlt;keyAlt;aTabIns;aTabDel\n");
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

	public static void tables(String path, int versions, TablesInfo ti) {
		String slashedPath = Export.getDir(path) + File.separator;
		String sTab = slashedPath + "tables.csv";
		String sTabI = slashedPath + "table_ins.csv";
		String sTabD = slashedPath + "table_del.csv";
		String sTabT = slashedPath + "table_type.csv";
		String sTabK = slashedPath + "table_key.csv";
		String sTabAll = slashedPath + "all.csv";
		String sTabSt = slashedPath + "table_stats.csv";

		try {
			BufferedWriter fTab = new BufferedWriter(new FileWriter(sTab));
			BufferedWriter fTabI = new BufferedWriter(new FileWriter(sTabI));
			BufferedWriter fTabD = new BufferedWriter(new FileWriter(sTabD));
			BufferedWriter fTabT = new BufferedWriter(new FileWriter(sTabT));
			BufferedWriter fTabK = new BufferedWriter(new FileWriter(sTabK));
			BufferedWriter fTabAll = new BufferedWriter(new FileWriter(sTabAll));
			BufferedWriter fTabSt = new BufferedWriter(new FileWriter(sTabSt));

			writeVersionsLine(fTab, versions);
			writeVersionsLine(fTabI, versions);
			writeVersionsLine(fTabD, versions);
			writeVersionsLine(fTabT, versions);
			writeVersionsLine(fTabK, versions);
			writeVersionsLine(fTabAll, versions);
			fTabSt.write("table;dur;birth;death;chngs;s@s;s@e;sAvg\n");

			for (String t : ti.getTables()){
				fTab.write(t + ";");
				fTabI.write(t + ";");
				fTabD.write(t + ";");
				fTabT.write(t + ";");
				fTabK.write(t + ";");
				fTabAll.write(t + ";");

				fTabSt.write(t + ";");
				MetricsOverVersion mov = ti.getTableMetrics(t);
				fTabSt.write(mov.getLife() + ";");
				fTabSt.write(mov.getBirth() + ";");

				fTabSt.write((mov.getDeath()==versions-1 ? "-" : mov.getDeath())
						+ ";");

				fTabSt.write(mov.getTotalChanges().getTotal() + ";");
				fTabSt.write(mov.getBirthSize() + ";");
				fTabSt.write(mov.getDeathSize() + ";");

				int sumSize = 0;
				int v = 0;
				for (int i = 0; i < versions; i++) {
					if (mov != null && mov.containsKey(i)) {
						fTab.write(mov.getSize(i) + ";");
						Changes c = mov.getChanges(i);
						fTabI.write(c.getInsertions() + ";");
						fTabD.write(c.getDeletions() + ";");
						fTabT.write(c.getAttrTypeChange() + ";");
						fTabK.write(c.getKeyChange() + ";");
						fTabAll.write(mov.getSize(i) + "[" + c.toString() +
								"]" + ";");
						sumSize += mov.getSize(i);
						v++;

					} else {
						fTab.write("0;");
						fTabI.write("-;");
						fTabD.write("-;");
						fTabT.write("-;");
						fTabK.write("-;");
						fTabAll.write("0|-|-|-|-;");
					}
				}
				fTabSt.write(Float.toString((sumSize/(float)v)));
				fTabSt.write("\n");

				fTab.write("\n");
				fTabI.write("\n");
				fTabD.write("\n");
				fTabT.write("\n");
				fTabK.write("\n");
				fTabAll.write("\n");
			}
			fTab.close();
			fTabI.close();
			fTabD.close();
			fTabT.close();
			fTabK.close();
			fTabAll.close();
			fTabSt.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Oups...",
					                      JOptionPane.ERROR_MESSAGE);
		}
	}

	private static void writeVersionsLine(BufferedWriter file, int versions)
			throws IOException {
		file.write(";");
		for (int i = 0; i < versions; i++) {
			file.write(i + ";");
		}
		file.write("\n");
	}
}
