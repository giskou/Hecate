package gr.uoi.cs.dmod.hecate.transitions;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TransitionList extends ArrayList<Transition> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8523048667698455130L;
	
	@XmlAttribute
	private String oldVersion;
	@XmlAttribute
	private String newVersion;
	
	@Override
	public Object[] toArray() {
		return super.toArray();
	}
	
	public TransitionList() {
		this.oldVersion = null;
		this.newVersion = null;
	}
	
	public TransitionList(String oldVersion, String newVersion) {
		this.oldVersion = oldVersion;
		this.newVersion = newVersion;
	}

	/**
	 * @return the oldVersion
	 */
	public String getOldVersion() {
		return oldVersion;
	}

	/**
	 * @return the newVersion
	 */
	public String getNewVersion() {
		return newVersion;
	}
}
