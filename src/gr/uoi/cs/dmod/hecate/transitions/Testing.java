/**
 * 
 */
package gr.uoi.cs.dmod.hecate.transitions;

import gr.uoi.cs.dmod.hecate.diff.Delta;
import gr.uoi.cs.dmod.hecate.parser.HecateParser;
import gr.uoi.cs.dmod.hecate.sql.Schema;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 * @author iskoulis
 *
 */
public class Testing {

	public static void main(String[] args) throws Exception{
		
		HecateParser parser = new HecateParser("/home/iskoulis/Dev/Hecate/AppData/schemas/CMS's/wikimedia/v04571.sql");
		HecateParser parser2 = new HecateParser("/home/iskoulis/Dev/Hecate/AppData/schemas/CMS's/wikimedia/v08798.sql");
		Schema oldSchema = parser.getSchema();
		oldSchema.setTitle("v04571");
		Schema newSchema = parser2.getSchema();
		newSchema.setTitle("v08798");
		
		
		Delta delta = new Delta();
		Transitions trs = new Transitions();
		TransitionList tl1 = delta.minus(oldSchema, newSchema); trs.add(tl1);
		TransitionList tl2 = delta.minus(oldSchema, newSchema); trs.add(tl2);
		TransitionList tl3 = delta.minus(oldSchema, newSchema); trs.add(tl3);
		test(trs);
	}
	
	public static void test(Transitions tl) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Deletion.class, Insersion.class, TransitionList.class, Transitions.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(tl, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
