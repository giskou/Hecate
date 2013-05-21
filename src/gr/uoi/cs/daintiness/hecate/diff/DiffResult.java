/**
 * 
 */
package gr.uoi.cs.daintiness.hecate.diff;

import gr.uoi.cs.daintiness.hecate.transitions.TransitionList;

/**
 * @author iskoulis
 *
 */
public class DiffResult {

	final public TransitionList tl;
	final public Metrics met;
	/**
	 * 
	 */
	public DiffResult(TransitionList tl, Metrics met) {
		this.tl = tl;
		this.met = met;
	}
}
