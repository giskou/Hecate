package gr.uoi.cs.daintiness.hecate.parser;

import gr.uoi.cs.daintiness.hecate.sql.Attribute;
import gr.uoi.cs.daintiness.hecate.sql.Schema;
import gr.uoi.cs.daintiness.hecate.sql.Table;

import java.io.File;
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
		String[] path = filePath.split(File.separator);
		s.setTitle(path[path.length-1]);
		return s;
	}
	
	private static class SchemaLoader extends DDLBaseListener {
		
		private Table t;
		private Attribute a;
		boolean foundTableConst = false;
		boolean foundAlterConst = false;
		String alteringTable = null;
		
		public void enterStart (DDLParser.StartContext ctx) {
			System.out.println("Starting");
			s = new Schema();
		}
		public void exitStart (DDLParser.StartContext ctx) {
			System.out.println("\n\n\n" + s.print());
		}
		
		public void enterTable (DDLParser.TableContext ctx) {
			String tableName = removeQuotes(ctx.table_name().getText());
			t = new Table(tableName);
			System.out.println("TABLE : " + tableName);
		}
		public void exitTable (DDLParser.TableContext ctx) {
			s.addTable(t);
			System.out.println();
		}
		
		public void enterColumn (DDLParser.ColumnContext ctx) {
			String colName = removeQuotes(ctx.col_name().getText());
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
			} else if (ctx.getText().contains("FOREIGN")){
				System.out.print(" FOREIGN " + ctx.getText());
			}
		}
		public void exitLine_constraint(DDLParser.Line_constraintContext ctx) {
			System.out.print( "PRIMARY ");
		}
		
		public void enterAlter_statement(DDLParser.Alter_statementContext ctx) {
			alteringTable = ctx.table_name().getText();
		}
		public void exitAlter_statement(DDLParser.Alter_statementContext ctx) {
			alteringTable = null;
		}
		
		public void enterTable_constraint(DDLParser.Table_constraintContext ctx) {
			foundTableConst = true;
		}
		public void exitTable_constraint(DDLParser.Table_constraintContext ctx) {
			foundTableConst = false;
		}
		
		public void enterAlter_constraint(DDLParser.Alter_constraintContext ctx) {
			foundAlterConst = true;
		}
		public void exitAlter_constraint(DDLParser.Alter_constraintContext ctx) {
			foundAlterConst = true;
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
			} else if (foundAlterConst) {
				
			}
		}
		
		public void enterForeign (DDLParser.ForeignContext ctx) {
			if (foundTableConst) {
				System.out.print( "FOREIGN ");
			} else {
				System.out.println(alteringTable + " " + ctx.getText());
				Table orTable = s.getTables().get(alteringTable);
				Table reTable = s.getTables().get(ctx.reference_definition().table_name().getText());
				Attribute[] or = getNames(ctx.parNameList().getText(), orTable);
				Attribute[] re = getNames(ctx.reference_definition().parNameList().getText(), reTable);
				for (int i = 0; i < or.length; i++) {
					System.out.println(orTable + "." + or[i] + "->" + reTable + "." + re[i] + "\n");
					orTable.getfKey().addReference(or[i], re[i]);
				}
			}
		}
		
		private Attribute[] getNames(String s, Table table) {
			s = s.substring(1, s.length()-1);
			String[] names = s.split(",");
			Attribute[] res = new Attribute[names.length];
			for (int i = 0; i < names.length; i++) {
				res[i] = table.getAttrs().get(names[i]);
			}
			return res;
		}
		
		private boolean hasQuotes(String s) {
			switch (s.charAt(0)) {
				case '\'':
				case '\"':
				case '`':
					return true;
				default:
					return false;
			}
		}
		
		private String removeQuotes(String s) {
			if (hasQuotes(s)) {
				String res = null;
				res = s.substring(1, s.length()-1);
				return res;
			}
			return s;
		}
	}
}
