package gr.uoi.cs.daintiness.hecate.sql;

import java.util.HashMap;
import java.util.Map;

public class ForeignKey {
	private Map<Attribute, Attribute> references;

	public ForeignKey() {
		references = new HashMap<Attribute, Attribute>();
	}
	
	public void addReference(Attribute orig, Attribute ref) {
		references.put(orig, ref);
	}
	
	public String toString() {
		String buff = new String();
		buff = "Foreign Key: ";
		for (Map.Entry<Attribute, Attribute> entry : this.references.entrySet()) {
			Attribute or = entry.getKey();
			Attribute re = entry.getValue();
			buff += or.toString() + " -> " + re.toString() + "\n";
		}
		buff += "\n";
		return buff;
	}
	
	public ForeignKey getRefs() {
		return references;
	}
}
