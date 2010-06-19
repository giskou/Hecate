package gr.uoi.cs.dmod.hecate.parser;

import java.io.IOException;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

public class Test {
	public static void main(String[] args) throws RecognitionException, IOException {
		CharStream charStream = new ANTLRFileStream("AppData/schemas/wikimedia/v25635.sql");
		DDLLexer lexer = new DDLLexer(charStream) ;
		TokenStream tokenStream = new CommonTokenStream(lexer);
		DDLParser parser = new DDLParser(tokenStream) ;
		parser.start();
		System.out.println("done!");
	}
}
