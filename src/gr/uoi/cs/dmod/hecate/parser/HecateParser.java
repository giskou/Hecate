package gr.uoi.cs.dmod.hecate.parser;

import java.io.IOException;

import gr.uoi.cs.dmod.hecate.sql.Schema;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

public class HecateParser {
	
	private Schema schema;
	
	public HecateParser(String filePath) throws IOException, RecognitionException {
		CharStream charStream = new ANTLRFileStream(filePath);
		DDLLexer lexer = new DDLLexer(charStream) ;
		TokenStream tokenStream = new CommonTokenStream(lexer);
		DDLParser parser = new DDLParser(tokenStream) ;
		schema = parser.start();
	}
	
	public Schema getSchema() {
		return this.schema;
	}
}
