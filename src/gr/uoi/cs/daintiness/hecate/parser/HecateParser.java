package gr.uoi.cs.daintiness.hecate.parser;

import gr.uoi.cs.daintiness.hecate.sql.Attribute;
import gr.uoi.cs.daintiness.hecate.sql.Schema;
import gr.uoi.cs.daintiness.hecate.sql.Table;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * This class uses the parser of the generated ANTLR grammar to parse
 * the file given to the constructor.
 * @author giskou
 */
public class HecateParser {
	static Schema s;
	
	/**
	 * 
	 * @param filePath The path of the file to be parsed.
	 * @throws IOException
	 * @throws RecognitionException
	 */
	public static Schema parse(String filePath) {
		CharStream      charStream = null;
		
		try {
			charStream = new ANTLRFileStream(filePath);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		DDLLexer        lexer = new DDLLexer(charStream) ;
		TokenStream     tokenStream = new CommonTokenStream(lexer);
		DDLParser       parser = new DDLParser(tokenStream) ;
		ParseTree       root = parser.start();
		SchemaLoader    loader = new SchemaLoader();
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(loader, root);
		
		return s;
	}
	
	private static class SchemaLoader extends DDLBaseListener {
		
		private Table t;
		private Attribute a;
		boolean foundTableConst = false;
		
		public void enterStart (DDLParser.StartContext ctx) {
			System.out.println("Starting");
			s = new Schema();
		}
		public void exitStart (DDLParser.StartContext ctx) {
			System.out.println("\n\n\n" + s.print());
		}
		
		public void enterTable (DDLParser.TableContext ctx) {
			String tableName = ctx.table_name().getText();
			t = new Table(tableName);
			System.out.println("TABLE : " + tableName);
		}
		public void exitTable (DDLParser.TableContext ctx) {
			s.addTable(t);
			System.out.println();
		}
		
		public void enterColumn (DDLParser.ColumnContext ctx) {
			String colName = ctx.col_name().getText();
			String colType = ctx.data_type().getText();
			colType = colType.toUpperCase();
			a = new Attribute(colName, colType);
		}
		
		public void exitColumn (DDLParser.ColumnContext ctx) {
			System.out.print(a.getName() + " ");
			t.addAttribute(a);
		}
		
		public void enterLine_constraint(DDLParser.Line_constraintContext ctx) {
			if (ctx.getText().contains("PRIMARY")) {
				t.addAttrToPrimeKey(a);
			}
		}
		public void exitLine_constraint(DDLParser.Line_constraintContext ctx) {
			System.out.print( "PRIMARY ");
		}
		
		public void enterTable_constraint(DDLParser.Table_constraintContext ctx) {
			foundTableConst = true;
		}
		public void exitTable_constraint(DDLParser.Table_constraintContext ctx) {
			foundTableConst = false;
		}
		
		public void enterPrimary (DDLParser.PrimaryContext ctx) {
			if (foundTableConst) {
				String todo = ctx.parNameList().getText();
				todo = todo.substring(1, todo.length()-1);
				String[] names = todo.split(",");
				for (String s : names) {
					if (t.getAttrs().get(s) != null){
						t.addAttrToPrimeKey(t.getAttrs().get(s));
					}
				}
			}
		}
	}
}
