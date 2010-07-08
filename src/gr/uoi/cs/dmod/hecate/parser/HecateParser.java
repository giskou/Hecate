package gr.uoi.cs.dmod.hecate.parser;

import java.io.IOException;

import gr.uoi.cs.dmod.hecate.sql.Schema;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

/**
 * This class uses the parser of the generated ANTLR grammar to parse
 * the file given to the constructor. A later call of {@code getSchema}
 * returns the result of the parsing
 * @author giskou
 *
 */
public class HecateParser {
	
	private Schema schema;
	
	/**
	 * Paramerised Constructor
	 * @param filePath The path of the file to be parsed.
	 * @throws IOException
	 * @throws RecognitionException
	 */
	public HecateParser(String filePath) throws IOException, RecognitionException {
		CharStream charStream = new ANTLRFileStream(filePath);
		DDLLexer lexer = new DDLLexer(charStream) ;
		TokenStream tokenStream = new CommonTokenStream(lexer);
		DDLParser parser = new DDLParser(tokenStream) ;
		schema = parser.start();
	}
	
	/**
	 * 
	 * @return The resulting {@link Schema} from parsing
	 */
	public Schema getSchema() {
		return this.schema;
	}
}
