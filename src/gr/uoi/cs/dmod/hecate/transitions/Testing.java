/**
 * 
 */
package gr.uoi.cs.dmod.hecate.transitions;

import gr.uoi.cs.dmod.hecate.diff.Delta;
import gr.uoi.cs.dmod.hecate.parser.HecateParser;
import gr.uoi.cs.dmod.hecate.sql.Schema;

import java.io.FileInputStream;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 * @author iskoulis
 *
 */
public class Testing {

	public static void main(String[] args) throws Exception{
		
		HecateParser parser = new HecateParser("AppData/schemas/CMS's/wikimedia/v04571.sql");
		HecateParser parser2 = new HecateParser("AppData/schemas/CMS's/wikimedia/v08798.sql");
		HecateParser parser3 = new HecateParser("AppData/schemas/CMS's/wikimedia/v19569.sql");


		Schema schema1 = parser.getSchema();
		schema1.setTitle("1");
		Schema schema2 = parser2.getSchema();
		schema2.setTitle("2");
		Schema schema3 = parser3.getSchema();
		schema3.setTitle("3");
		
		
		Delta delta = new Delta();
		Transitions trs = new Transitions();
		TransitionList tl1 = delta.minus(schema1, schema2); trs.add(tl1);
		TransitionList tl2 = delta.minus(schema2, schema3); trs.add(tl2);
		TransitionList tl3 = delta.minus(schema1, schema3); trs.add(tl3);
		test(trs);
	}
	
	public static void test(Transitions tl) {
		
		// Marshal
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Update.class, Deletion.class, Insersion.class, TransitionList.class, Transitions.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(tl, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
		
		// Unmarshal
		InputStream inputStream;
		Transitions t = null;
		try {
			inputStream = new FileInputStream("lala.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Update.class, Deletion.class, Insersion.class, TransitionList.class, Transitions.class);
			Unmarshaller u = jaxbContext.createUnmarshaller();
			t = (Transitions)u.unmarshal( inputStream );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t);
		
	}
}
