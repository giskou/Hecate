package gr.uoi.cs.daintiness.hecate.metrics.tables;

public class TableMetrics {
	
	private Changes changes;
	private int size;
	
	public TableMetrics() {
		changes = new Changes();
		size = -1;
	}
	
	Changes getChanges() { return changes; }
	int getSize() { return size; }
	
	void setSize(int size) { this.size = size; }
	
	public String toString() {
		return size + "[" + changes.toString() + "]";
	}
}
