/**
 * 
 */
package gr.uoi.cs.daintiness.hecate.transitions;

import gr.uoi.cs.daintiness.hecate.diff.Delta;
import gr.uoi.cs.daintiness.hecate.diff.DiffResult;
import gr.uoi.cs.daintiness.hecate.parser.HecateParser;
import gr.uoi.cs.daintiness.hecate.sql.Schema;

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
		DiffResult res;
		String path = "/home/iskoulis/Projects/Evolution Datasets/CMS\'s/wikimedia/schemata/";
		Schema schema1 = HecateParser.parse(path + "rev_004571.sql");
		Schema schema2 = HecateParser.parse(path + "rev_008798.sql");
		Schema schema3 = HecateParser.parse(path + "rev_019569.sql");
		
		Transitions trs = new Transitions();
		res = Delta.minus(schema1, schema2);
		trs.add(res.tl);
		res = Delta.minus(schema2, schema3);
		trs.add(res.tl);
		res = Delta.minus(schema1, schema3);
		trs.add(res.tl);
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
