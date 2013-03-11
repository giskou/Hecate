package gr.uoi.cs.daintiness.hecate.sql;

public interface SqlItem {
	
	public static int MACHED = 1;
	public static int INSERTED = 2;
	public static int DELETED = 3;
	public static int UPDATED = 4;
	public static int UNTOUCHED = 5;
	
	public String print();
	public String getName();
	public void setMode(int mode);
	public int getMode();
}
