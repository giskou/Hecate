package gr.uoi.cs.dmod.hecate.parser;

import gr.uoi.cs.dmod.hecate.sql.*;
import gr.uoi.cs.dmod.hecate.diff.Delta;
import java.io.IOException;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;


public class Test {
	public static void main(String[] args) throws RecognitionException, IOException {
		CharStream charStream = new ANTLRFileStream("AppData/schemas/wikimedia/v01284.sql");
		CharStream charStream2 = new ANTLRFileStream("AppData/schemas/wikimedia/v01911.sql");
		DDLLexer lexer = new DDLLexer(charStream) ;
		DDLLexer lexer2 = new DDLLexer(charStream2) ;
		TokenStream tokenStream = new CommonTokenStream(lexer);
		TokenStream tokenStream2 = new CommonTokenStream(lexer2);
		DDLParser parser = new DDLParser(tokenStream) ;
		DDLParser parser2 = new DDLParser(tokenStream2) ;
		Schema s = parser.start();
		Schema s2 = parser2.start();
		System.out.println(s.toString());
		System.out.println(s2.toString());
		
		Delta d = new Delta();
		System.out.println("---------------");
		d.minus(s, s2);
		System.out.println("--------------------");
		d.minus(s2, s);
	}
}
