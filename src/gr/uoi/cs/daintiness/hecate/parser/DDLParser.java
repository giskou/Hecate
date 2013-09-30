// Generated from /home/iskoulis/Projects/Hecate/src/gr/uoi/cs/daintiness/hecate/parser/DDL.g4 by ANTLR 4.0
package gr.uoi.cs.daintiness.hecate.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DDLParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING_G=1, STRING_Q=2, STRING_D=3, WS=4, COMMENT=5, LINE_COMMENT=6, EQ=7, 
		LP=8, RP=9, SQ=10, CO=11, QO=12, US=13, AT=14, DA=15, HA=16, SL=17, ST=18, 
		DQ=19, GR=20, CL=21, DO=22, SP=23, CA=24, VB=25, PL=26, CONFLICT_START=27, 
		CONFLICT_END=28, CONFLICT=29, ACTION=30, ADD=31, ALTER=32, AS=33, ASC=34, 
		AUTO_INC=35, BIGINT=36, BINARY=37, BIT=38, BTREE=39, CASCADE=40, CHARACTER=41, 
		CHAR=42, CHECK=43, COLLATE=44, COL_FORMAT=45, COMMIT=46, CONSTRAINT=47, 
		CREATE=48, DATABASE=49, DECIMAL=50, DEFAULT=51, DEFERRABLE=52, DELETE=53, 
		DESC=54, DISK=55, DOUBLE=56, DROP=57, DYNAMIC=58, END=59, ENUM=60, EXISTS=61, 
		FIXED=62, FOREIGN=63, FULLTEXT=64, FUNCTION=65, HASH=66, IF=67, IGNORE=68, 
		INDEX=69, INSERT=70, INTEGER=71, INTO=72, IS=73, KEY=74, KEY_BSIZE=75, 
		MEMORY=76, NO=77, NOT=78, NULL=79, NUMERIC=80, ON=81, OR=82, PRECISION=83, 
		PROCEDURE=84, PRIMARY=85, PURGE=86, REAL=87, REFERENCES=88, REPLACE=89, 
		RESTRICT=90, SCHEMA=91, SET=92, SIGNED=93, SMALLINT=94, SPATIAL=95, STORAGE=96, 
		TABLE=97, TEMPORARY=98, TRIGGER=99, UNIQUE=100, UNSIGNED=101, UPDATE=102, 
		USE=103, USING=104, VALUES=105, VARBINARY=106, VARCHAR=107, VIEW=108, 
		WHERE=109, YEAR=110, ZEROFILL=111, INT=112, ID=113, OTHER=114;
	public static final String[] tokenNames = {
		"<INVALID>", "STRING_G", "STRING_Q", "STRING_D", "WS", "COMMENT", "LINE_COMMENT", 
		"'='", "'('", "')'", "';'", "','", "'''", "'_'", "'@'", "'-'", "'#'", 
		"'/'", "'*'", "'\"'", "'`'", "':'", "'.'", "' '", "'$'", "'|'", "'+'", 
		"'<<<<<<<'", "'>>>>>>>'", "CONFLICT", "ACTION", "ADD", "ALTER", "AS", 
		"ASC", "AUTO_INC", "BIGINT", "BINARY", "BIT", "BTREE", "CASCADE", "CHARACTER", 
		"CHAR", "CHECK", "COLLATE", "COL_FORMAT", "COMMIT", "CONSTRAINT", "CREATE", 
		"DATABASE", "DECIMAL", "DEFAULT", "DEFERRABLE", "DELETE", "DESC", "DISK", 
		"DOUBLE", "DROP", "DYNAMIC", "END", "ENUM", "EXISTS", "FIXED", "FOREIGN", 
		"FULLTEXT", "FUNCTION", "HASH", "IF", "IGNORE", "INDEX", "INSERT", "INTEGER", 
		"INTO", "IS", "KEY", "KEY_BSIZE", "MEMORY", "NO", "NOT", "NULL", "NUMERIC", 
		"ON", "OR", "PRECISION", "PROCEDURE", "PRIMARY", "PURGE", "REAL", "REFERENCES", 
		"REPLACE", "RESTRICT", "SCHEMA", "SET", "SIGNED", "SMALLINT", "SPATIAL", 
		"STORAGE", "TABLE", "TEMPORARY", "TRIGGER", "UNIQUE", "UNSIGNED", "UPDATE", 
		"USE", "USING", "VALUES", "VARBINARY", "VARCHAR", "VIEW", "WHERE", "YEAR", 
		"ZEROFILL", "INT", "ID", "OTHER"
	};
	public static final int
		RULE_start = 0, RULE_sql_statement = 1, RULE_ddl_statement = 2, RULE_other_statement = 3, 
		RULE_namespace = 4, RULE_commit = 5, RULE_set = 6, RULE_drop_statement = 7, 
		RULE_insert_statement = 8, RULE_create_statement = 9, RULE_alter_statement = 10, 
		RULE_update_statement = 11, RULE_database = 12, RULE_create_option = 13, 
		RULE_index = 14, RULE_index_type = 15, RULE_index_option = 16, RULE_view = 17, 
		RULE_triger = 18, RULE_pl_sql = 19, RULE_consume_until_end = 20, RULE_table = 21, 
		RULE_table_definition = 22, RULE_table_option = 23, RULE_column = 24, 
		RULE_column_option = 25, RULE_table_constraint = 26, RULE_line_constraint = 27, 
		RULE_alter_constraint = 28, RULE_constraint = 29, RULE_consume_par = 30, 
		RULE_reference_definition = 31, RULE_reference_option = 32, RULE_refs = 33, 
		RULE_data_type = 34, RULE_data_option = 35, RULE_schema_name = 36, RULE_table_name = 37, 
		RULE_col_name = 38, RULE_index_name = 39, RULE_charset_name = 40, RULE_collation_name = 41, 
		RULE_constr_name = 42, RULE_triger_name = 43, RULE_nameList = 44, RULE_parNameList = 45, 
		RULE_valueList = 46, RULE_parValueList = 47, RULE_valuesList = 48, RULE_size = 49, 
		RULE_order = 50, RULE_value = 51, RULE_ident = 52, RULE_number = 53, RULE_quote = 54, 
		RULE_quoted_rest = 55, RULE_string = 56, RULE_function = 57, RULE_special_char = 58, 
		RULE_restricted = 59;
	public static final String[] ruleNames = {
		"start", "sql_statement", "ddl_statement", "other_statement", "namespace", 
		"commit", "set", "drop_statement", "insert_statement", "create_statement", 
		"alter_statement", "update_statement", "database", "create_option", "index", 
		"index_type", "index_option", "view", "triger", "pl_sql", "consume_until_end", 
		"table", "table_definition", "table_option", "column", "column_option", 
		"table_constraint", "line_constraint", "alter_constraint", "constraint", 
		"consume_par", "reference_definition", "reference_option", "refs", "data_type", 
		"data_option", "schema_name", "table_name", "col_name", "index_name", 
		"charset_name", "collation_name", "constr_name", "triger_name", "nameList", 
		"parNameList", "valueList", "parValueList", "valuesList", "size", "order", 
		"value", "ident", "number", "quote", "quoted_rest", "string", "function", 
		"special_char", "restricted"
	};

	@Override
	public String getGrammarFileName() { return "DDL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public DDLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public TerminalNode SQ(int i) {
			return getToken(DDLParser.SQ, i);
		}
		public TerminalNode EOF() { return getToken(DDLParser.EOF, 0); }
		public List<Sql_statementContext> sql_statement() {
			return getRuleContexts(Sql_statementContext.class);
		}
		public Sql_statementContext sql_statement(int i) {
			return getRuleContext(Sql_statementContext.class,i);
		}
		public List<TerminalNode> SQ() { return getTokens(DDLParser.SQ); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(120); sql_statement();
				setState(122);
				_la = _input.LA(1);
				if (_la==SQ) {
					{
					setState(121); match(SQ);
					}
				}

				}
				}
				setState(126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALTER) | (1L << COMMIT) | (1L << CREATE) | (1L << DROP))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (INSERT - 70)) | (1L << (SET - 70)) | (1L << (UPDATE - 70)) | (1L << (USE - 70)))) != 0) );
			setState(128); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_statementContext extends ParserRuleContext {
		public Ddl_statementContext ddl_statement() {
			return getRuleContext(Ddl_statementContext.class,0);
		}
		public Other_statementContext other_statement() {
			return getRuleContext(Other_statementContext.class,0);
		}
		public Sql_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterSql_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitSql_statement(this);
		}
	}

	public final Sql_statementContext sql_statement() throws RecognitionException {
		Sql_statementContext _localctx = new Sql_statementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sql_statement);
		try {
			setState(132);
			switch (_input.LA(1)) {
			case ALTER:
			case CREATE:
			case DROP:
			case UPDATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(130); ddl_statement();
				}
				break;
			case COMMIT:
			case INSERT:
			case SET:
			case USE:
				enterOuterAlt(_localctx, 2);
				{
				setState(131); other_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ddl_statementContext extends ParserRuleContext {
		public Drop_statementContext drop_statement() {
			return getRuleContext(Drop_statementContext.class,0);
		}
		public Alter_statementContext alter_statement() {
			return getRuleContext(Alter_statementContext.class,0);
		}
		public Update_statementContext update_statement() {
			return getRuleContext(Update_statementContext.class,0);
		}
		public Create_statementContext create_statement() {
			return getRuleContext(Create_statementContext.class,0);
		}
		public Ddl_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddl_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterDdl_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitDdl_statement(this);
		}
	}

	public final Ddl_statementContext ddl_statement() throws RecognitionException {
		Ddl_statementContext _localctx = new Ddl_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ddl_statement);
		try {
			setState(138);
			switch (_input.LA(1)) {
			case DROP:
				enterOuterAlt(_localctx, 1);
				{
				setState(134); drop_statement();
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(135); create_statement();
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(136); alter_statement();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(137); update_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Other_statementContext extends ParserRuleContext {
		public CommitContext commit() {
			return getRuleContext(CommitContext.class,0);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public Insert_statementContext insert_statement() {
			return getRuleContext(Insert_statementContext.class,0);
		}
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public Other_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterOther_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitOther_statement(this);
		}
	}

	public final Other_statementContext other_statement() throws RecognitionException {
		Other_statementContext _localctx = new Other_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_other_statement);
		try {
			setState(144);
			switch (_input.LA(1)) {
			case INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(140); insert_statement();
				}
				break;
			case USE:
				enterOuterAlt(_localctx, 2);
				{
				setState(141); namespace();
				}
				break;
			case COMMIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(142); commit();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 4);
				{
				setState(143); set();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode USE() { return getToken(DDLParser.USE, 0); }
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitNamespace(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_namespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); match(USE);
			setState(147); ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommitContext extends ParserRuleContext {
		public TerminalNode COMMIT() { return getToken(DDLParser.COMMIT, 0); }
		public CommitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterCommit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitCommit(this);
		}
	}

	public final CommitContext commit() throws RecognitionException {
		CommitContext _localctx = new CommitContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_commit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); match(COMMIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(DDLParser.SET, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public TerminalNode EQ() { return getToken(DDLParser.EQ, 0); }
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitSet(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); match(SET);
			setState(152); ident();
			setState(155);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(153); match(EQ);
				setState(154); ident();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_statementContext extends ParserRuleContext {
		public TerminalNode TABLE() { return getToken(DDLParser.TABLE, 0); }
		public TerminalNode PURGE() { return getToken(DDLParser.PURGE, 0); }
		public TerminalNode DATABASE() { return getToken(DDLParser.DATABASE, 0); }
		public TerminalNode EXISTS() { return getToken(DDLParser.EXISTS, 0); }
		public TerminalNode DROP() { return getToken(DDLParser.DROP, 0); }
		public NameListContext nameList() {
			return getRuleContext(NameListContext.class,0);
		}
		public TerminalNode IF() { return getToken(DDLParser.IF, 0); }
		public Drop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterDrop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitDrop_statement(this);
		}
	}

	public final Drop_statementContext drop_statement() throws RecognitionException {
		Drop_statementContext _localctx = new Drop_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_drop_statement);
		int _la;
		try {
			setState(175);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157); match(DROP);
				setState(158);
				_la = _input.LA(1);
				if ( !(_la==DATABASE || _la==TABLE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(159); match(IF);
				setState(160); match(EXISTS);
				setState(161); nameList();
				setState(163);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(162); match(PURGE);
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165); match(DROP);
				setState(166);
				_la = _input.LA(1);
				if ( !(_la==DATABASE || _la==TABLE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(167); nameList();
				setState(169);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(168); match(PURGE);
					}
				}

				setState(173);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(171); match(IF);
					setState(172); match(EXISTS);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_statementContext extends ParserRuleContext {
		public List<ParValueListContext> parValueList() {
			return getRuleContexts(ParValueListContext.class);
		}
		public TerminalNode CO(int i) {
			return getToken(DDLParser.CO, i);
		}
		public ParNameListContext parNameList() {
			return getRuleContext(ParNameListContext.class,0);
		}
		public TerminalNode INSERT() { return getToken(DDLParser.INSERT, 0); }
		public TerminalNode IGNORE() { return getToken(DDLParser.IGNORE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> CO() { return getTokens(DDLParser.CO); }
		public TerminalNode INTO() { return getToken(DDLParser.INTO, 0); }
		public ParValueListContext parValueList(int i) {
			return getRuleContext(ParValueListContext.class,i);
		}
		public TerminalNode VALUES() { return getToken(DDLParser.VALUES, 0); }
		public Insert_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterInsert_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitInsert_statement(this);
		}
	}

	public final Insert_statementContext insert_statement() throws RecognitionException {
		Insert_statementContext _localctx = new Insert_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_insert_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177); match(INSERT);
			setState(179);
			_la = _input.LA(1);
			if (_la==IGNORE) {
				{
				setState(178); match(IGNORE);
				}
			}

			setState(181); match(INTO);
			setState(182); table_name();
			setState(184);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(183); parNameList();
				}
			}

			setState(186); match(VALUES);
			setState(187); parValueList();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CO) {
				{
				{
				setState(188); match(CO);
				setState(189); parValueList();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_statementContext extends ParserRuleContext {
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(DDLParser.CREATE, 0); }
		public ViewContext view() {
			return getRuleContext(ViewContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public Pl_sqlContext pl_sql() {
			return getRuleContext(Pl_sqlContext.class,0);
		}
		public DatabaseContext database() {
			return getRuleContext(DatabaseContext.class,0);
		}
		public TrigerContext triger() {
			return getRuleContext(TrigerContext.class,0);
		}
		public Create_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterCreate_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitCreate_statement(this);
		}
	}

	public final Create_statementContext create_statement() throws RecognitionException {
		Create_statementContext _localctx = new Create_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_create_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195); match(CREATE);
			setState(202);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(196); database();
				}
				break;

			case 2:
				{
				setState(197); table();
				}
				break;

			case 3:
				{
				setState(198); index();
				}
				break;

			case 4:
				{
				setState(199); view();
				}
				break;

			case 5:
				{
				setState(200); triger();
				}
				break;

			case 6:
				{
				setState(201); pl_sql();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_statementContext extends ParserRuleContext {
		public TerminalNode TABLE() { return getToken(DDLParser.TABLE, 0); }
		public List<Alter_constraintContext> alter_constraint() {
			return getRuleContexts(Alter_constraintContext.class);
		}
		public TerminalNode ALTER() { return getToken(DDLParser.ALTER, 0); }
		public TerminalNode ADD(int i) {
			return getToken(DDLParser.ADD, i);
		}
		public Alter_constraintContext alter_constraint(int i) {
			return getRuleContext(Alter_constraintContext.class,i);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> ADD() { return getTokens(DDLParser.ADD); }
		public Alter_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterAlter_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitAlter_statement(this);
		}
	}

	public final Alter_statementContext alter_statement() throws RecognitionException {
		Alter_statementContext _localctx = new Alter_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_alter_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); match(ALTER);
			setState(205); match(TABLE);
			setState(206); table_name();
			setState(209); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(207); match(ADD);
				setState(208); alter_constraint();
				}
				}
				setState(211); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ADD );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_statementContext extends ParserRuleContext {
		public List<Col_nameContext> col_name() {
			return getRuleContexts(Col_nameContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode UPDATE() { return getToken(DDLParser.UPDATE, 0); }
		public TerminalNode SET() { return getToken(DDLParser.SET, 0); }
		public TerminalNode CO(int i) {
			return getToken(DDLParser.CO, i);
		}
		public List<TerminalNode> EQ() { return getTokens(DDLParser.EQ); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public TerminalNode EQ(int i) {
			return getToken(DDLParser.EQ, i);
		}
		public List<TerminalNode> CO() { return getTokens(DDLParser.CO); }
		public Col_nameContext col_name(int i) {
			return getRuleContext(Col_nameContext.class,i);
		}
		public Update_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterUpdate_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitUpdate_statement(this);
		}
	}

	public final Update_statementContext update_statement() throws RecognitionException {
		Update_statementContext _localctx = new Update_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_update_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213); match(UPDATE);
			setState(214); table_name();
			setState(215); match(SET);
			setState(216); col_name();
			setState(217); match(EQ);
			setState(218); value();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CO) {
				{
				{
				setState(219); match(CO);
				setState(220); col_name();
				setState(221); match(EQ);
				setState(222); value();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatabaseContext extends ParserRuleContext {
		public Create_optionContext create_option(int i) {
			return getRuleContext(Create_optionContext.class,i);
		}
		public Schema_nameContext schema_name() {
			return getRuleContext(Schema_nameContext.class,0);
		}
		public TerminalNode SCHEMA() { return getToken(DDLParser.SCHEMA, 0); }
		public TerminalNode EXISTS() { return getToken(DDLParser.EXISTS, 0); }
		public TerminalNode NOT() { return getToken(DDLParser.NOT, 0); }
		public TerminalNode DATABASE() { return getToken(DDLParser.DATABASE, 0); }
		public List<Create_optionContext> create_option() {
			return getRuleContexts(Create_optionContext.class);
		}
		public TerminalNode IF() { return getToken(DDLParser.IF, 0); }
		public DatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitDatabase(this);
		}
	}

	public final DatabaseContext database() throws RecognitionException {
		DatabaseContext _localctx = new DatabaseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_database);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(233);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(230); match(IF);
				setState(231); match(NOT);
				setState(232); match(EXISTS);
				}
				break;
			}
			setState(235); schema_name();
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHARACTER) | (1L << COLLATE) | (1L << DEFAULT))) != 0)) {
				{
				{
				setState(236); create_option();
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_optionContext extends ParserRuleContext {
		public Create_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_option; }
	 
		public Create_optionContext() { }
		public void copyFrom(Create_optionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CollateContext extends Create_optionContext {
		public TerminalNode EQ() { return getToken(DDLParser.EQ, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(DDLParser.DEFAULT, 0); }
		public TerminalNode COLLATE() { return getToken(DDLParser.COLLATE, 0); }
		public CollateContext(Create_optionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterCollate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitCollate(this);
		}
	}
	public static class Char_setContext extends Create_optionContext {
		public TerminalNode SET() { return getToken(DDLParser.SET, 0); }
		public TerminalNode EQ() { return getToken(DDLParser.EQ, 0); }
		public Charset_nameContext charset_name() {
			return getRuleContext(Charset_nameContext.class,0);
		}
		public TerminalNode CHARACTER() { return getToken(DDLParser.CHARACTER, 0); }
		public TerminalNode DEFAULT() { return getToken(DDLParser.DEFAULT, 0); }
		public Char_setContext(Create_optionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterChar_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitChar_set(this);
		}
	}

	public final Create_optionContext create_option() throws RecognitionException {
		Create_optionContext _localctx = new Create_optionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_create_option);
		int _la;
		try {
			setState(259);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new Char_setContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(242); match(DEFAULT);
					}
				}

				setState(245); match(CHARACTER);
				setState(246); match(SET);
				setState(248);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(247); match(EQ);
					}
				}

				setState(250); charset_name();
				}
				break;

			case 2:
				_localctx = new CollateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(251); match(DEFAULT);
					}
				}

				setState(254); match(COLLATE);
				setState(256);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(255); match(EQ);
					}
				}

				setState(258); collation_name();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(DDLParser.ON, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode INDEX() { return getToken(DDLParser.INDEX, 0); }
		public TerminalNode FULLTEXT() { return getToken(DDLParser.FULLTEXT, 0); }
		public TerminalNode UNIQUE() { return getToken(DDLParser.UNIQUE, 0); }
		public Index_optionContext index_option() {
			return getRuleContext(Index_optionContext.class,0);
		}
		public ParNameListContext parNameList() {
			return getRuleContext(ParNameListContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode SPATIAL() { return getToken(DDLParser.SPATIAL, 0); }
		public Index_typeContext index_type() {
			return getRuleContext(Index_typeContext.class,0);
		}
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitIndex(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(262);
			_la = _input.LA(1);
			if (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FULLTEXT - 64)) | (1L << (SPATIAL - 64)) | (1L << (UNIQUE - 64)))) != 0)) {
				{
				setState(261);
				_la = _input.LA(1);
				if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FULLTEXT - 64)) | (1L << (SPATIAL - 64)) | (1L << (UNIQUE - 64)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			}
			setState(264); match(INDEX);
			setState(265); index_name();
			setState(267);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(266); index_type();
				}
			}

			setState(269); match(ON);
			setState(270); table_name();
			setState(271); parNameList();
			setState(273);
			_la = _input.LA(1);
			if (_la==KEY_BSIZE || _la==USING) {
				{
				setState(272); index_option();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_typeContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(DDLParser.HASH, 0); }
		public TerminalNode BTREE() { return getToken(DDLParser.BTREE, 0); }
		public TerminalNode USING() { return getToken(DDLParser.USING, 0); }
		public Index_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterIndex_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitIndex_type(this);
		}
	}

	public final Index_typeContext index_type() throws RecognitionException {
		Index_typeContext _localctx = new Index_typeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_index_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275); match(USING);
			setState(277);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(276);
				_la = _input.LA(1);
				if ( !(_la==BTREE || _la==HASH) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_optionContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode KEY_BSIZE() { return getToken(DDLParser.KEY_BSIZE, 0); }
		public Index_typeContext index_type() {
			return getRuleContext(Index_typeContext.class,0);
		}
		public Index_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterIndex_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitIndex_option(this);
		}
	}

	public final Index_optionContext index_option() throws RecognitionException {
		Index_optionContext _localctx = new Index_optionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_index_option);
		int _la;
		try {
			setState(285);
			switch (_input.LA(1)) {
			case KEY_BSIZE:
				enterOuterAlt(_localctx, 1);
				{
				setState(279); match(KEY_BSIZE);
				setState(281);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(280); match(EQ);
					}
				}

				setState(283); value();
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(284); index_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ViewContext extends ParserRuleContext {
		public TerminalNode RP(int i) {
			return getToken(DDLParser.RP, i);
		}
		public TerminalNode AS() { return getToken(DDLParser.AS, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ParNameListContext parNameList() {
			return getRuleContext(ParNameListContext.class,0);
		}
		public TerminalNode VIEW() { return getToken(DDLParser.VIEW, 0); }
		public List<TerminalNode> RP() { return getTokens(DDLParser.RP); }
		public TerminalNode LP() { return getToken(DDLParser.LP, 0); }
		public ViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitView(this);
		}
	}

	public final ViewContext view() throws RecognitionException {
		ViewContext _localctx = new ViewContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_view);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287); match(VIEW);
			setState(288); ident();
			setState(289); parNameList();
			setState(290); match(AS);
			setState(291); match(LP);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_G) | (1L << STRING_Q) | (1L << STRING_D) | (1L << WS) | (1L << COMMENT) | (1L << LINE_COMMENT) | (1L << EQ) | (1L << LP) | (1L << SQ) | (1L << CO) | (1L << QO) | (1L << US) | (1L << AT) | (1L << DA) | (1L << HA) | (1L << SL) | (1L << ST) | (1L << DQ) | (1L << GR) | (1L << CL) | (1L << DO) | (1L << SP) | (1L << CA) | (1L << VB) | (1L << PL) | (1L << CONFLICT_START) | (1L << CONFLICT_END) | (1L << CONFLICT) | (1L << ACTION) | (1L << ADD) | (1L << ALTER) | (1L << AS) | (1L << ASC) | (1L << AUTO_INC) | (1L << BIGINT) | (1L << BINARY) | (1L << BIT) | (1L << BTREE) | (1L << CASCADE) | (1L << CHARACTER) | (1L << CHAR) | (1L << CHECK) | (1L << COLLATE) | (1L << COL_FORMAT) | (1L << COMMIT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << DATABASE) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DEFERRABLE) | (1L << DELETE) | (1L << DESC) | (1L << DISK) | (1L << DOUBLE) | (1L << DROP) | (1L << DYNAMIC) | (1L << END) | (1L << ENUM) | (1L << EXISTS) | (1L << FIXED) | (1L << FOREIGN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FULLTEXT - 64)) | (1L << (FUNCTION - 64)) | (1L << (HASH - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INDEX - 64)) | (1L << (INSERT - 64)) | (1L << (INTEGER - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (KEY - 64)) | (1L << (KEY_BSIZE - 64)) | (1L << (MEMORY - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NUMERIC - 64)) | (1L << (ON - 64)) | (1L << (OR - 64)) | (1L << (PRECISION - 64)) | (1L << (PROCEDURE - 64)) | (1L << (PRIMARY - 64)) | (1L << (PURGE - 64)) | (1L << (REAL - 64)) | (1L << (REFERENCES - 64)) | (1L << (REPLACE - 64)) | (1L << (RESTRICT - 64)) | (1L << (SCHEMA - 64)) | (1L << (SET - 64)) | (1L << (SIGNED - 64)) | (1L << (SMALLINT - 64)) | (1L << (SPATIAL - 64)) | (1L << (STORAGE - 64)) | (1L << (TABLE - 64)) | (1L << (TEMPORARY - 64)) | (1L << (TRIGGER - 64)) | (1L << (UNIQUE - 64)) | (1L << (UNSIGNED - 64)) | (1L << (UPDATE - 64)) | (1L << (USE - 64)) | (1L << (USING - 64)) | (1L << (VALUES - 64)) | (1L << (VARBINARY - 64)) | (1L << (VARCHAR - 64)) | (1L << (VIEW - 64)) | (1L << (WHERE - 64)) | (1L << (YEAR - 64)) | (1L << (ZEROFILL - 64)) | (1L << (INT - 64)) | (1L << (ID - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(292);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==RP) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(298); match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrigerContext extends ParserRuleContext {
		public Triger_nameContext triger_name() {
			return getRuleContext(Triger_nameContext.class,0);
		}
		public TerminalNode REPLACE() { return getToken(DDLParser.REPLACE, 0); }
		public Consume_until_endContext consume_until_end() {
			return getRuleContext(Consume_until_endContext.class,0);
		}
		public TerminalNode OR() { return getToken(DDLParser.OR, 0); }
		public TerminalNode TRIGGER() { return getToken(DDLParser.TRIGGER, 0); }
		public TrigerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterTriger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitTriger(this);
		}
	}

	public final TrigerContext triger() throws RecognitionException {
		TrigerContext _localctx = new TrigerContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_triger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(300); match(OR);
				setState(301); match(REPLACE);
				}
			}

			setState(304); match(TRIGGER);
			setState(305); triger_name();
			setState(306); consume_until_end();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pl_sqlContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(DDLParser.FUNCTION, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode REPLACE() { return getToken(DDLParser.REPLACE, 0); }
		public TerminalNode PROCEDURE() { return getToken(DDLParser.PROCEDURE, 0); }
		public Consume_until_endContext consume_until_end() {
			return getRuleContext(Consume_until_endContext.class,0);
		}
		public TerminalNode OR() { return getToken(DDLParser.OR, 0); }
		public Pl_sqlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pl_sql; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterPl_sql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitPl_sql(this);
		}
	}

	public final Pl_sqlContext pl_sql() throws RecognitionException {
		Pl_sqlContext _localctx = new Pl_sqlContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_pl_sql);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(308); match(OR);
				setState(309); match(REPLACE);
				}
			}

			setState(312);
			_la = _input.LA(1);
			if ( !(_la==FUNCTION || _la==PROCEDURE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(313); ident();
			setState(314); consume_until_end();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Consume_until_endContext extends ParserRuleContext {
		public TerminalNode END(int i) {
			return getToken(DDLParser.END, i);
		}
		public TerminalNode SQ(int i) {
			return getToken(DDLParser.SQ, i);
		}
		public List<TerminalNode> END() { return getTokens(DDLParser.END); }
		public List<TerminalNode> SQ() { return getTokens(DDLParser.SQ); }
		public Consume_until_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consume_until_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterConsume_until_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitConsume_until_end(this);
		}
	}

	public final Consume_until_endContext consume_until_end() throws RecognitionException {
		Consume_until_endContext _localctx = new Consume_until_endContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_consume_until_end);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(319);
					switch (_input.LA(1)) {
					case STRING_G:
					case STRING_Q:
					case STRING_D:
					case WS:
					case COMMENT:
					case LINE_COMMENT:
					case EQ:
					case LP:
					case RP:
					case SQ:
					case CO:
					case QO:
					case US:
					case AT:
					case DA:
					case HA:
					case SL:
					case ST:
					case DQ:
					case GR:
					case CL:
					case DO:
					case SP:
					case CA:
					case VB:
					case PL:
					case CONFLICT_START:
					case CONFLICT_END:
					case CONFLICT:
					case ACTION:
					case ADD:
					case ALTER:
					case AS:
					case ASC:
					case AUTO_INC:
					case BIGINT:
					case BINARY:
					case BIT:
					case BTREE:
					case CASCADE:
					case CHARACTER:
					case CHAR:
					case CHECK:
					case COLLATE:
					case COL_FORMAT:
					case COMMIT:
					case CONSTRAINT:
					case CREATE:
					case DATABASE:
					case DECIMAL:
					case DEFAULT:
					case DEFERRABLE:
					case DELETE:
					case DESC:
					case DISK:
					case DOUBLE:
					case DROP:
					case DYNAMIC:
					case ENUM:
					case EXISTS:
					case FIXED:
					case FOREIGN:
					case FULLTEXT:
					case FUNCTION:
					case HASH:
					case IF:
					case IGNORE:
					case INDEX:
					case INSERT:
					case INTEGER:
					case INTO:
					case IS:
					case KEY:
					case KEY_BSIZE:
					case MEMORY:
					case NO:
					case NOT:
					case NULL:
					case NUMERIC:
					case ON:
					case OR:
					case PRECISION:
					case PROCEDURE:
					case PRIMARY:
					case PURGE:
					case REAL:
					case REFERENCES:
					case REPLACE:
					case RESTRICT:
					case SCHEMA:
					case SET:
					case SIGNED:
					case SMALLINT:
					case SPATIAL:
					case STORAGE:
					case TABLE:
					case TEMPORARY:
					case TRIGGER:
					case UNIQUE:
					case UNSIGNED:
					case UPDATE:
					case USE:
					case USING:
					case VALUES:
					case VARBINARY:
					case VARCHAR:
					case VIEW:
					case WHERE:
					case YEAR:
					case ZEROFILL:
					case INT:
					case ID:
					case OTHER:
						{
						setState(316);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==END) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					case END:
						{
						setState(317); match(END);
						setState(318);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==SQ) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(324); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableContext extends ParserRuleContext {
		public TerminalNode CO(int i) {
			return getToken(DDLParser.CO, i);
		}
		public TerminalNode RP() { return getToken(DDLParser.RP, 0); }
		public List<TerminalNode> SQ() { return getTokens(DDLParser.SQ); }
		public TerminalNode LP() { return getToken(DDLParser.LP, 0); }
		public Table_definitionContext table_definition(int i) {
			return getRuleContext(Table_definitionContext.class,i);
		}
		public TerminalNode TABLE() { return getToken(DDLParser.TABLE, 0); }
		public List<Table_definitionContext> table_definition() {
			return getRuleContexts(Table_definitionContext.class);
		}
		public TerminalNode SQ(int i) {
			return getToken(DDLParser.SQ, i);
		}
		public TerminalNode NOT() { return getToken(DDLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(DDLParser.EXISTS, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Table_optionContext> table_option() {
			return getRuleContexts(Table_optionContext.class);
		}
		public List<TerminalNode> CO() { return getTokens(DDLParser.CO); }
		public TerminalNode TEMPORARY() { return getToken(DDLParser.TEMPORARY, 0); }
		public Table_optionContext table_option(int i) {
			return getRuleContext(Table_optionContext.class,i);
		}
		public TerminalNode IF() { return getToken(DDLParser.IF, 0); }
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitTable(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_table);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(326); match(TEMPORARY);
				}
			}

			setState(329); match(TABLE);
			setState(333);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(330); match(IF);
				setState(331); match(NOT);
				setState(332); match(EXISTS);
				}
				break;
			}
			setState(335); table_name();
			setState(336); match(LP);
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_G) | (1L << STRING_Q) | (1L << STRING_D) | (1L << QO) | (1L << DQ) | (1L << GR) | (1L << ACTION) | (1L << ADD) | (1L << ALTER) | (1L << ASC) | (1L << AUTO_INC) | (1L << BIGINT) | (1L << BINARY) | (1L << BIT) | (1L << BTREE) | (1L << CASCADE) | (1L << CHARACTER) | (1L << CHAR) | (1L << CHECK) | (1L << COLLATE) | (1L << COL_FORMAT) | (1L << COMMIT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << DATABASE) | (1L << DECIMAL) | (1L << DELETE) | (1L << DESC) | (1L << DISK) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << END) | (1L << ENUM) | (1L << EXISTS) | (1L << FIXED) | (1L << FOREIGN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FULLTEXT - 64)) | (1L << (FUNCTION - 64)) | (1L << (HASH - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INDEX - 64)) | (1L << (INSERT - 64)) | (1L << (INTEGER - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (KEY - 64)) | (1L << (NUMERIC - 64)) | (1L << (PRIMARY - 64)) | (1L << (REAL - 64)) | (1L << (REFERENCES - 64)) | (1L << (REPLACE - 64)) | (1L << (RESTRICT - 64)) | (1L << (SCHEMA - 64)) | (1L << (SET - 64)) | (1L << (SMALLINT - 64)) | (1L << (SPATIAL - 64)) | (1L << (STORAGE - 64)) | (1L << (TABLE - 64)) | (1L << (TEMPORARY - 64)) | (1L << (UNIQUE - 64)) | (1L << (UNSIGNED - 64)) | (1L << (UPDATE - 64)) | (1L << (USE - 64)) | (1L << (USING - 64)) | (1L << (VALUES - 64)) | (1L << (VARBINARY - 64)) | (1L << (VARCHAR - 64)) | (1L << (YEAR - 64)) | (1L << (ZEROFILL - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(337); table_definition();
				setState(339);
				_la = _input.LA(1);
				if (_la==SQ || _la==CO) {
					{
					setState(338);
					_la = _input.LA(1);
					if ( !(_la==SQ || _la==CO) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				}
				}
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(346); match(RP);
			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(347); table_option();
					}
					} 
				}
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_definitionContext extends ParserRuleContext {
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public Table_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterTable_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitTable_definition(this);
		}
	}

	public final Table_definitionContext table_definition() throws RecognitionException {
		Table_definitionContext _localctx = new Table_definitionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_table_definition);
		try {
			setState(355);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(353); column();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354); table_constraint();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_optionContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(DDLParser.SET, 0); }
		public TerminalNode INT() { return getToken(DDLParser.INT, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public TerminalNode EQ() { return getToken(DDLParser.EQ, 0); }
		public TerminalNode CHARACTER() { return getToken(DDLParser.CHARACTER, 0); }
		public TerminalNode DEFAULT() { return getToken(DDLParser.DEFAULT, 0); }
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Table_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterTable_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitTable_option(this);
		}
	}

	public final Table_optionContext table_option() throws RecognitionException {
		Table_optionContext _localctx = new Table_optionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_table_option);
		int _la;
		try {
			setState(379);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(357); match(DEFAULT);
					}
				}

				setState(360); match(CHARACTER);
				setState(361); match(SET);
				setState(363);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(362); match(EQ);
					}
				}

				setState(365); ident();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(366); match(DEFAULT);
					}
				}

				setState(369); ident();
				setState(377);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(371);
					_la = _input.LA(1);
					if (_la==EQ) {
						{
						setState(370); match(EQ);
						}
					}

					setState(375);
					switch (_input.LA(1)) {
					case STRING_G:
					case STRING_Q:
					case STRING_D:
					case QO:
					case DQ:
					case GR:
					case ACTION:
					case ADD:
					case ALTER:
					case ASC:
					case AUTO_INC:
					case BIGINT:
					case BINARY:
					case BIT:
					case BTREE:
					case CASCADE:
					case CHARACTER:
					case CHAR:
					case CHECK:
					case COLLATE:
					case COL_FORMAT:
					case COMMIT:
					case CREATE:
					case DATABASE:
					case DECIMAL:
					case DELETE:
					case DESC:
					case DISK:
					case DOUBLE:
					case DYNAMIC:
					case END:
					case ENUM:
					case EXISTS:
					case FIXED:
					case FOREIGN:
					case FULLTEXT:
					case FUNCTION:
					case HASH:
					case IF:
					case IGNORE:
					case INSERT:
					case INTEGER:
					case INTO:
					case IS:
					case NUMERIC:
					case REAL:
					case REFERENCES:
					case REPLACE:
					case RESTRICT:
					case SCHEMA:
					case SET:
					case SMALLINT:
					case SPATIAL:
					case STORAGE:
					case TABLE:
					case TEMPORARY:
					case UNSIGNED:
					case UPDATE:
					case USE:
					case USING:
					case VALUES:
					case VARBINARY:
					case VARCHAR:
					case YEAR:
					case ZEROFILL:
					case ID:
						{
						setState(373); ident();
						}
						break;
					case INT:
						{
						setState(374); match(INT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnContext extends ParserRuleContext {
		public Line_constraintContext line_constraint(int i) {
			return getRuleContext(Line_constraintContext.class,i);
		}
		public Col_nameContext col_name() {
			return getRuleContext(Col_nameContext.class,0);
		}
		public TerminalNode UPDATE() { return getToken(DDLParser.UPDATE, 0); }
		public TerminalNode ON() { return getToken(DDLParser.ON, 0); }
		public Column_optionContext column_option(int i) {
			return getRuleContext(Column_optionContext.class,i);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Data_optionContext data_option() {
			return getRuleContext(Data_optionContext.class,0);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public List<Line_constraintContext> line_constraint() {
			return getRuleContexts(Line_constraintContext.class);
		}
		public Create_optionContext create_option() {
			return getRuleContext(Create_optionContext.class,0);
		}
		public List<Column_optionContext> column_option() {
			return getRuleContexts(Column_optionContext.class);
		}
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitColumn(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_column);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(381); col_name();
			setState(382); data_type();
			setState(384);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(383); data_option();
				}
				break;
			}
			setState(387);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(386); create_option();
				}
				break;
			}
			setState(393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(391);
					switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
					case 1:
						{
						setState(389); column_option();
						}
						break;

					case 2:
						{
						setState(390); line_constraint();
						}
						break;
					}
					} 
				}
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			setState(399);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(396); match(ON);
				setState(397); match(UPDATE);
				setState(398); ident();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_optionContext extends ParserRuleContext {
		public TerminalNode AUTO_INC() { return getToken(DDLParser.AUTO_INC, 0); }
		public TerminalNode NOT() { return getToken(DDLParser.NOT, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode NULL() { return getToken(DDLParser.NULL, 0); }
		public TerminalNode DEFAULT() { return getToken(DDLParser.DEFAULT, 0); }
		public Column_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterColumn_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitColumn_option(this);
		}
	}

	public final Column_optionContext column_option() throws RecognitionException {
		Column_optionContext _localctx = new Column_optionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_column_option);
		int _la;
		try {
			setState(411);
			switch (_input.LA(1)) {
			case NOT:
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(401); match(NOT);
					}
				}

				setState(404); match(NULL);
				}
				break;
			case AUTO_INC:
				enterOuterAlt(_localctx, 2);
				{
				setState(405); match(AUTO_INC);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(406); match(DEFAULT);
				setState(409);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(407); value();
					}
					break;

				case 2:
					{
					setState(408); match(NULL);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraintContext extends ParserRuleContext {
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitTable_constraint(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_table_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413); constraint();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Line_constraintContext extends ParserRuleContext {
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public Line_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterLine_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitLine_constraint(this);
		}
	}

	public final Line_constraintContext line_constraint() throws RecognitionException {
		Line_constraintContext _localctx = new Line_constraintContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_line_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415); constraint();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_constraintContext extends ParserRuleContext {
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public Alter_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterAlter_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitAlter_constraint(this);
		}
	}

	public final Alter_constraintContext alter_constraint() throws RecognitionException {
		Alter_constraintContext _localctx = new Alter_constraintContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_alter_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417); constraint();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintContext extends ParserRuleContext {
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
	 
		public ConstraintContext() { }
		public void copyFrom(ConstraintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UniqueContext extends ConstraintContext {
		public TerminalNode INDEX() { return getToken(DDLParser.INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Index_optionContext index_option(int i) {
			return getRuleContext(Index_optionContext.class,i);
		}
		public List<Index_optionContext> index_option() {
			return getRuleContexts(Index_optionContext.class);
		}
		public TerminalNode UNIQUE() { return getToken(DDLParser.UNIQUE, 0); }
		public Constr_nameContext constr_name() {
			return getRuleContext(Constr_nameContext.class,0);
		}
		public ParNameListContext parNameList() {
			return getRuleContext(ParNameListContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(DDLParser.CONSTRAINT, 0); }
		public TerminalNode KEY() { return getToken(DDLParser.KEY, 0); }
		public Index_typeContext index_type() {
			return getRuleContext(Index_typeContext.class,0);
		}
		public UniqueContext(ConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterUnique(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitUnique(this);
		}
	}
	public static class CheckContext extends ConstraintContext {
		public Consume_parContext consume_par() {
			return getRuleContext(Consume_parContext.class,0);
		}
		public Constr_nameContext constr_name() {
			return getRuleContext(Constr_nameContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(DDLParser.CHECK, 0); }
		public TerminalNode CONSTRAINT() { return getToken(DDLParser.CONSTRAINT, 0); }
		public CheckContext(ConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitCheck(this);
		}
	}
	public static class PrimaryContext extends ConstraintContext {
		public Index_optionContext index_option(int i) {
			return getRuleContext(Index_optionContext.class,i);
		}
		public List<Index_optionContext> index_option() {
			return getRuleContexts(Index_optionContext.class);
		}
		public List<Constr_nameContext> constr_name() {
			return getRuleContexts(Constr_nameContext.class);
		}
		public TerminalNode PRIMARY() { return getToken(DDLParser.PRIMARY, 0); }
		public ParNameListContext parNameList() {
			return getRuleContext(ParNameListContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(DDLParser.CONSTRAINT, 0); }
		public Constr_nameContext constr_name(int i) {
			return getRuleContext(Constr_nameContext.class,i);
		}
		public TerminalNode KEY() { return getToken(DDLParser.KEY, 0); }
		public Index_typeContext index_type() {
			return getRuleContext(Index_typeContext.class,0);
		}
		public PrimaryContext(ConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitPrimary(this);
		}
	}
	public static class Index_keyContext extends ConstraintContext {
		public Col_nameContext col_name() {
			return getRuleContext(Col_nameContext.class,0);
		}
		public TerminalNode ON() { return getToken(DDLParser.ON, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode INDEX() { return getToken(DDLParser.INDEX, 0); }
		public Index_optionContext index_option(int i) {
			return getRuleContext(Index_optionContext.class,i);
		}
		public List<Index_optionContext> index_option() {
			return getRuleContexts(Index_optionContext.class);
		}
		public ParNameListContext parNameList() {
			return getRuleContext(ParNameListContext.class,0);
		}
		public TerminalNode KEY() { return getToken(DDLParser.KEY, 0); }
		public Index_typeContext index_type() {
			return getRuleContext(Index_typeContext.class,0);
		}
		public Index_keyContext(ConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterIndex_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitIndex_key(this);
		}
	}
	public static class ForeignContext extends ConstraintContext {
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Constr_nameContext constr_name() {
			return getRuleContext(Constr_nameContext.class,0);
		}
		public ParNameListContext parNameList() {
			return getRuleContext(ParNameListContext.class,0);
		}
		public TerminalNode FOREIGN() { return getToken(DDLParser.FOREIGN, 0); }
		public TerminalNode CONSTRAINT() { return getToken(DDLParser.CONSTRAINT, 0); }
		public Reference_definitionContext reference_definition() {
			return getRuleContext(Reference_definitionContext.class,0);
		}
		public TerminalNode KEY() { return getToken(DDLParser.KEY, 0); }
		public ForeignContext(ConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterForeign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitForeign(this);
		}
	}
	public static class ReferenceContext extends ConstraintContext {
		public Reference_definitionContext reference_definition() {
			return getRuleContext(Reference_definitionContext.class,0);
		}
		public ReferenceContext(ConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitReference(this);
		}
	}
	public static class FulltextContext extends ConstraintContext {
		public TerminalNode INDEX() { return getToken(DDLParser.INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Index_optionContext index_option(int i) {
			return getRuleContext(Index_optionContext.class,i);
		}
		public List<Index_optionContext> index_option() {
			return getRuleContexts(Index_optionContext.class);
		}
		public TerminalNode FULLTEXT() { return getToken(DDLParser.FULLTEXT, 0); }
		public ParNameListContext parNameList() {
			return getRuleContext(ParNameListContext.class,0);
		}
		public TerminalNode KEY() { return getToken(DDLParser.KEY, 0); }
		public TerminalNode SPATIAL() { return getToken(DDLParser.SPATIAL, 0); }
		public FulltextContext(ConstraintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterFulltext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitFulltext(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constraint);
		int _la;
		try {
			int _alt;
			setState(519);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				_localctx = new PrimaryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(419); match(CONSTRAINT);
					}
				}

				setState(423);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_G) | (1L << STRING_Q) | (1L << STRING_D) | (1L << QO) | (1L << DQ) | (1L << GR) | (1L << ACTION) | (1L << ADD) | (1L << ALTER) | (1L << ASC) | (1L << AUTO_INC) | (1L << BIGINT) | (1L << BINARY) | (1L << BIT) | (1L << BTREE) | (1L << CASCADE) | (1L << CHARACTER) | (1L << CHAR) | (1L << CHECK) | (1L << COLLATE) | (1L << COL_FORMAT) | (1L << COMMIT) | (1L << CREATE) | (1L << DATABASE) | (1L << DECIMAL) | (1L << DELETE) | (1L << DESC) | (1L << DISK) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << END) | (1L << ENUM) | (1L << EXISTS) | (1L << FIXED) | (1L << FOREIGN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FULLTEXT - 64)) | (1L << (FUNCTION - 64)) | (1L << (HASH - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INSERT - 64)) | (1L << (INTEGER - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (NUMERIC - 64)) | (1L << (REAL - 64)) | (1L << (REFERENCES - 64)) | (1L << (REPLACE - 64)) | (1L << (RESTRICT - 64)) | (1L << (SCHEMA - 64)) | (1L << (SET - 64)) | (1L << (SMALLINT - 64)) | (1L << (SPATIAL - 64)) | (1L << (STORAGE - 64)) | (1L << (TABLE - 64)) | (1L << (TEMPORARY - 64)) | (1L << (UNSIGNED - 64)) | (1L << (UPDATE - 64)) | (1L << (USE - 64)) | (1L << (USING - 64)) | (1L << (VALUES - 64)) | (1L << (VARBINARY - 64)) | (1L << (VARCHAR - 64)) | (1L << (YEAR - 64)) | (1L << (ZEROFILL - 64)) | (1L << (ID - 64)))) != 0)) {
					{
					setState(422); constr_name();
					}
				}

				setState(425); match(PRIMARY);
				setState(426); match(KEY);
				setState(428);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(427); constr_name();
					}
					break;
				}
				setState(431);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(430); index_type();
					}
					break;
				}
				setState(434);
				_la = _input.LA(1);
				if (_la==LP) {
					{
					setState(433); parNameList();
					}
				}

				setState(439);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(436); index_option();
						}
						} 
					}
					setState(441);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				}
				}
				break;

			case 2:
				_localctx = new Index_keyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				_la = _input.LA(1);
				if ( !(_la==INDEX || _la==KEY) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(444);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(443); index_name();
					}
					break;
				}
				setState(448);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(446); match(ON);
					setState(447); col_name();
					}
				}

				setState(451);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(450); index_type();
					}
				}

				setState(453); parNameList();
				setState(457);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(454); index_option();
						}
						} 
					}
					setState(459);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				}
				}
				break;

			case 3:
				_localctx = new UniqueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(461);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(460); match(CONSTRAINT);
					}
				}

				setState(464);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_G) | (1L << STRING_Q) | (1L << STRING_D) | (1L << QO) | (1L << DQ) | (1L << GR) | (1L << ACTION) | (1L << ADD) | (1L << ALTER) | (1L << ASC) | (1L << AUTO_INC) | (1L << BIGINT) | (1L << BINARY) | (1L << BIT) | (1L << BTREE) | (1L << CASCADE) | (1L << CHARACTER) | (1L << CHAR) | (1L << CHECK) | (1L << COLLATE) | (1L << COL_FORMAT) | (1L << COMMIT) | (1L << CREATE) | (1L << DATABASE) | (1L << DECIMAL) | (1L << DELETE) | (1L << DESC) | (1L << DISK) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << END) | (1L << ENUM) | (1L << EXISTS) | (1L << FIXED) | (1L << FOREIGN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FULLTEXT - 64)) | (1L << (FUNCTION - 64)) | (1L << (HASH - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INSERT - 64)) | (1L << (INTEGER - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (NUMERIC - 64)) | (1L << (REAL - 64)) | (1L << (REFERENCES - 64)) | (1L << (REPLACE - 64)) | (1L << (RESTRICT - 64)) | (1L << (SCHEMA - 64)) | (1L << (SET - 64)) | (1L << (SMALLINT - 64)) | (1L << (SPATIAL - 64)) | (1L << (STORAGE - 64)) | (1L << (TABLE - 64)) | (1L << (TEMPORARY - 64)) | (1L << (UNSIGNED - 64)) | (1L << (UPDATE - 64)) | (1L << (USE - 64)) | (1L << (USING - 64)) | (1L << (VALUES - 64)) | (1L << (VARBINARY - 64)) | (1L << (VARCHAR - 64)) | (1L << (YEAR - 64)) | (1L << (ZEROFILL - 64)) | (1L << (ID - 64)))) != 0)) {
					{
					setState(463); constr_name();
					}
				}

				setState(466); match(UNIQUE);
				setState(468);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(467);
					_la = _input.LA(1);
					if ( !(_la==INDEX || _la==KEY) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				}
				setState(471);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(470); index_name();
					}
					break;
				}
				setState(474);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(473); index_type();
					}
					break;
				}
				setState(477);
				_la = _input.LA(1);
				if (_la==LP) {
					{
					setState(476); parNameList();
					}
				}

				setState(482);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(479); index_option();
						}
						} 
					}
					setState(484);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				}
				}
				break;

			case 4:
				_localctx = new FulltextContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(485);
				_la = _input.LA(1);
				if ( !(_la==FULLTEXT || _la==SPATIAL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(487);
				_la = _input.LA(1);
				if (_la==INDEX || _la==KEY) {
					{
					setState(486);
					_la = _input.LA(1);
					if ( !(_la==INDEX || _la==KEY) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(490);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_G) | (1L << STRING_Q) | (1L << STRING_D) | (1L << QO) | (1L << DQ) | (1L << GR) | (1L << ACTION) | (1L << ADD) | (1L << ALTER) | (1L << ASC) | (1L << AUTO_INC) | (1L << BIGINT) | (1L << BINARY) | (1L << BIT) | (1L << BTREE) | (1L << CASCADE) | (1L << CHARACTER) | (1L << CHAR) | (1L << CHECK) | (1L << COLLATE) | (1L << COL_FORMAT) | (1L << COMMIT) | (1L << CREATE) | (1L << DATABASE) | (1L << DECIMAL) | (1L << DELETE) | (1L << DESC) | (1L << DISK) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << END) | (1L << ENUM) | (1L << EXISTS) | (1L << FIXED) | (1L << FOREIGN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FULLTEXT - 64)) | (1L << (FUNCTION - 64)) | (1L << (HASH - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INSERT - 64)) | (1L << (INTEGER - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (NUMERIC - 64)) | (1L << (REAL - 64)) | (1L << (REFERENCES - 64)) | (1L << (REPLACE - 64)) | (1L << (RESTRICT - 64)) | (1L << (SCHEMA - 64)) | (1L << (SET - 64)) | (1L << (SMALLINT - 64)) | (1L << (SPATIAL - 64)) | (1L << (STORAGE - 64)) | (1L << (TABLE - 64)) | (1L << (TEMPORARY - 64)) | (1L << (UNSIGNED - 64)) | (1L << (UPDATE - 64)) | (1L << (USE - 64)) | (1L << (USING - 64)) | (1L << (VALUES - 64)) | (1L << (VARBINARY - 64)) | (1L << (VARCHAR - 64)) | (1L << (YEAR - 64)) | (1L << (ZEROFILL - 64)) | (1L << (ID - 64)))) != 0)) {
					{
					setState(489); index_name();
					}
				}

				setState(492); parNameList();
				setState(496);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(493); index_option();
						}
						} 
					}
					setState(498);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				}
				}
				break;

			case 5:
				_localctx = new ForeignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(500);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(499); match(CONSTRAINT);
					}
				}

				setState(503);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(502); constr_name();
					}
					break;
				}
				setState(505); match(FOREIGN);
				setState(506); match(KEY);
				setState(508);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_G) | (1L << STRING_Q) | (1L << STRING_D) | (1L << QO) | (1L << DQ) | (1L << GR) | (1L << ACTION) | (1L << ADD) | (1L << ALTER) | (1L << ASC) | (1L << AUTO_INC) | (1L << BIGINT) | (1L << BINARY) | (1L << BIT) | (1L << BTREE) | (1L << CASCADE) | (1L << CHARACTER) | (1L << CHAR) | (1L << CHECK) | (1L << COLLATE) | (1L << COL_FORMAT) | (1L << COMMIT) | (1L << CREATE) | (1L << DATABASE) | (1L << DECIMAL) | (1L << DELETE) | (1L << DESC) | (1L << DISK) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << END) | (1L << ENUM) | (1L << EXISTS) | (1L << FIXED) | (1L << FOREIGN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FULLTEXT - 64)) | (1L << (FUNCTION - 64)) | (1L << (HASH - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INSERT - 64)) | (1L << (INTEGER - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (NUMERIC - 64)) | (1L << (REAL - 64)) | (1L << (REFERENCES - 64)) | (1L << (REPLACE - 64)) | (1L << (RESTRICT - 64)) | (1L << (SCHEMA - 64)) | (1L << (SET - 64)) | (1L << (SMALLINT - 64)) | (1L << (SPATIAL - 64)) | (1L << (STORAGE - 64)) | (1L << (TABLE - 64)) | (1L << (TEMPORARY - 64)) | (1L << (UNSIGNED - 64)) | (1L << (UPDATE - 64)) | (1L << (USE - 64)) | (1L << (USING - 64)) | (1L << (VALUES - 64)) | (1L << (VARBINARY - 64)) | (1L << (VARCHAR - 64)) | (1L << (YEAR - 64)) | (1L << (ZEROFILL - 64)) | (1L << (ID - 64)))) != 0)) {
					{
					setState(507); index_name();
					}
				}

				setState(510); parNameList();
				setState(511); reference_definition();
				}
				break;

			case 6:
				_localctx = new CheckContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(513); match(CONSTRAINT);
				setState(514); constr_name();
				setState(515); match(CHECK);
				setState(516); consume_par();
				}
				break;

			case 7:
				_localctx = new ReferenceContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(518); reference_definition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Consume_parContext extends ParserRuleContext {
		public TerminalNode RP(int i) {
			return getToken(DDLParser.RP, i);
		}
		public List<Consume_parContext> consume_par() {
			return getRuleContexts(Consume_parContext.class);
		}
		public Consume_parContext consume_par(int i) {
			return getRuleContext(Consume_parContext.class,i);
		}
		public List<TerminalNode> RP() { return getTokens(DDLParser.RP); }
		public TerminalNode LP(int i) {
			return getToken(DDLParser.LP, i);
		}
		public List<TerminalNode> LP() { return getTokens(DDLParser.LP); }
		public Consume_parContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consume_par; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterConsume_par(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitConsume_par(this);
		}
	}

	public final Consume_parContext consume_par() throws RecognitionException {
		Consume_parContext _localctx = new Consume_parContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_consume_par);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521); match(LP);
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_G) | (1L << STRING_Q) | (1L << STRING_D) | (1L << WS) | (1L << COMMENT) | (1L << LINE_COMMENT) | (1L << EQ) | (1L << LP) | (1L << SQ) | (1L << CO) | (1L << QO) | (1L << US) | (1L << AT) | (1L << DA) | (1L << HA) | (1L << SL) | (1L << ST) | (1L << DQ) | (1L << GR) | (1L << CL) | (1L << DO) | (1L << SP) | (1L << CA) | (1L << VB) | (1L << PL) | (1L << CONFLICT_START) | (1L << CONFLICT_END) | (1L << CONFLICT) | (1L << ACTION) | (1L << ADD) | (1L << ALTER) | (1L << AS) | (1L << ASC) | (1L << AUTO_INC) | (1L << BIGINT) | (1L << BINARY) | (1L << BIT) | (1L << BTREE) | (1L << CASCADE) | (1L << CHARACTER) | (1L << CHAR) | (1L << CHECK) | (1L << COLLATE) | (1L << COL_FORMAT) | (1L << COMMIT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << DATABASE) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DEFERRABLE) | (1L << DELETE) | (1L << DESC) | (1L << DISK) | (1L << DOUBLE) | (1L << DROP) | (1L << DYNAMIC) | (1L << END) | (1L << ENUM) | (1L << EXISTS) | (1L << FIXED) | (1L << FOREIGN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FULLTEXT - 64)) | (1L << (FUNCTION - 64)) | (1L << (HASH - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INDEX - 64)) | (1L << (INSERT - 64)) | (1L << (INTEGER - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (KEY - 64)) | (1L << (KEY_BSIZE - 64)) | (1L << (MEMORY - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NUMERIC - 64)) | (1L << (ON - 64)) | (1L << (OR - 64)) | (1L << (PRECISION - 64)) | (1L << (PROCEDURE - 64)) | (1L << (PRIMARY - 64)) | (1L << (PURGE - 64)) | (1L << (REAL - 64)) | (1L << (REFERENCES - 64)) | (1L << (REPLACE - 64)) | (1L << (RESTRICT - 64)) | (1L << (SCHEMA - 64)) | (1L << (SET - 64)) | (1L << (SIGNED - 64)) | (1L << (SMALLINT - 64)) | (1L << (SPATIAL - 64)) | (1L << (STORAGE - 64)) | (1L << (TABLE - 64)) | (1L << (TEMPORARY - 64)) | (1L << (TRIGGER - 64)) | (1L << (UNIQUE - 64)) | (1L << (UNSIGNED - 64)) | (1L << (UPDATE - 64)) | (1L << (USE - 64)) | (1L << (USING - 64)) | (1L << (VALUES - 64)) | (1L << (VARBINARY - 64)) | (1L << (VARCHAR - 64)) | (1L << (VIEW - 64)) | (1L << (WHERE - 64)) | (1L << (YEAR - 64)) | (1L << (ZEROFILL - 64)) | (1L << (INT - 64)) | (1L << (ID - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				setState(524);
				switch (_input.LA(1)) {
				case STRING_G:
				case STRING_Q:
				case STRING_D:
				case WS:
				case COMMENT:
				case LINE_COMMENT:
				case EQ:
				case SQ:
				case CO:
				case QO:
				case US:
				case AT:
				case DA:
				case HA:
				case SL:
				case ST:
				case DQ:
				case GR:
				case CL:
				case DO:
				case SP:
				case CA:
				case VB:
				case PL:
				case CONFLICT_START:
				case CONFLICT_END:
				case CONFLICT:
				case ACTION:
				case ADD:
				case ALTER:
				case AS:
				case ASC:
				case AUTO_INC:
				case BIGINT:
				case BINARY:
				case BIT:
				case BTREE:
				case CASCADE:
				case CHARACTER:
				case CHAR:
				case CHECK:
				case COLLATE:
				case COL_FORMAT:
				case COMMIT:
				case CONSTRAINT:
				case CREATE:
				case DATABASE:
				case DECIMAL:
				case DEFAULT:
				case DEFERRABLE:
				case DELETE:
				case DESC:
				case DISK:
				case DOUBLE:
				case DROP:
				case DYNAMIC:
				case END:
				case ENUM:
				case EXISTS:
				case FIXED:
				case FOREIGN:
				case FULLTEXT:
				case FUNCTION:
				case HASH:
				case IF:
				case IGNORE:
				case INDEX:
				case INSERT:
				case INTEGER:
				case INTO:
				case IS:
				case KEY:
				case KEY_BSIZE:
				case MEMORY:
				case NO:
				case NOT:
				case NULL:
				case NUMERIC:
				case ON:
				case OR:
				case PRECISION:
				case PROCEDURE:
				case PRIMARY:
				case PURGE:
				case REAL:
				case REFERENCES:
				case REPLACE:
				case RESTRICT:
				case SCHEMA:
				case SET:
				case SIGNED:
				case SMALLINT:
				case SPATIAL:
				case STORAGE:
				case TABLE:
				case TEMPORARY:
				case TRIGGER:
				case UNIQUE:
				case UNSIGNED:
				case UPDATE:
				case USE:
				case USING:
				case VALUES:
				case VARBINARY:
				case VARCHAR:
				case VIEW:
				case WHERE:
				case YEAR:
				case ZEROFILL:
				case INT:
				case ID:
				case OTHER:
					{
					setState(522);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==LP || _la==RP) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				case LP:
					{
					setState(523); consume_par();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(529); match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reference_definitionContext extends ParserRuleContext {
		public Reference_optionContext reference_option(int i) {
			return getRuleContext(Reference_optionContext.class,i);
		}
		public ParNameListContext parNameList() {
			return getRuleContext(ParNameListContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Reference_optionContext> reference_option() {
			return getRuleContexts(Reference_optionContext.class);
		}
		public TerminalNode REFERENCES() { return getToken(DDLParser.REFERENCES, 0); }
		public Reference_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterReference_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitReference_definition(this);
		}
	}

	public final Reference_definitionContext reference_definition() throws RecognitionException {
		Reference_definitionContext _localctx = new Reference_definitionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_reference_definition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(531); match(REFERENCES);
			setState(532); table_name();
			setState(533); parNameList();
			setState(537);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(534); reference_option();
					}
					} 
				}
				setState(539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reference_optionContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(DDLParser.UPDATE, 0); }
		public TerminalNode ON() { return getToken(DDLParser.ON, 0); }
		public TerminalNode DELETE() { return getToken(DDLParser.DELETE, 0); }
		public RefsContext refs() {
			return getRuleContext(RefsContext.class,0);
		}
		public Reference_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterReference_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitReference_option(this);
		}
	}

	public final Reference_optionContext reference_option() throws RecognitionException {
		Reference_optionContext _localctx = new Reference_optionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_reference_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540); match(ON);
			setState(541);
			_la = _input.LA(1);
			if ( !(_la==DELETE || _la==UPDATE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(542); refs();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RefsContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(DDLParser.SET, 0); }
		public TerminalNode DEFERRABLE() { return getToken(DDLParser.DEFERRABLE, 0); }
		public TerminalNode CASCADE() { return getToken(DDLParser.CASCADE, 0); }
		public TerminalNode ACTION() { return getToken(DDLParser.ACTION, 0); }
		public TerminalNode RESTRICT() { return getToken(DDLParser.RESTRICT, 0); }
		public TerminalNode NULL() { return getToken(DDLParser.NULL, 0); }
		public TerminalNode NO() { return getToken(DDLParser.NO, 0); }
		public RefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterRefs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitRefs(this);
		}
	}

	public final RefsContext refs() throws RecognitionException {
		RefsContext _localctx = new RefsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_refs);
		int _la;
		try {
			setState(552);
			switch (_input.LA(1)) {
			case CASCADE:
			case RESTRICT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(544);
				_la = _input.LA(1);
				if ( !(_la==CASCADE || _la==RESTRICT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(546);
				_la = _input.LA(1);
				if (_la==DEFERRABLE) {
					{
					setState(545); match(DEFERRABLE);
					}
				}

				}
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(548); match(SET);
				setState(549); match(NULL);
				}
				}
				break;
			case NO:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(550); match(NO);
				setState(551); match(ACTION);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_typeContext extends ParserRuleContext {
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
	 
		public Data_typeContext() { }
		public void copyFrom(Data_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GenericContext extends Data_typeContext {
		public ParValueListContext parValueList() {
			return getRuleContext(ParValueListContext.class,0);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public TerminalNode ENUM() { return getToken(DDLParser.ENUM, 0); }
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public GenericContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterGeneric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitGeneric(this);
		}
	}
	public static class Set_typeContext extends Data_typeContext {
		public ParValueListContext parValueList() {
			return getRuleContext(ParValueListContext.class,0);
		}
		public TerminalNode SET() { return getToken(DDLParser.SET, 0); }
		public Set_typeContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterSet_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitSet_type(this);
		}
	}
	public static class EnumContext extends Data_typeContext {
		public ParValueListContext parValueList() {
			return getRuleContext(ParValueListContext.class,0);
		}
		public TerminalNode ENUM() { return getToken(DDLParser.ENUM, 0); }
		public EnumContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitEnum(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_data_type);
		int _la;
		try {
			int _alt;
			setState(570);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				_localctx = new GenericContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(555); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(554); ident();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(557); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				setState(560);
				_la = _input.LA(1);
				if (_la==LP) {
					{
					setState(559); size();
					}
				}

				setState(564);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(562); match(ENUM);
					setState(563); parValueList();
					}
					break;
				}
				}
				break;

			case 2:
				_localctx = new EnumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(566); match(ENUM);
				setState(567); parValueList();
				}
				break;

			case 3:
				_localctx = new Set_typeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(568); match(SET);
				setState(569); parValueList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_optionContext extends ParserRuleContext {
		public TerminalNode SIGNED() { return getToken(DDLParser.SIGNED, 0); }
		public TerminalNode ZEROFILL() { return getToken(DDLParser.ZEROFILL, 0); }
		public TerminalNode UNSIGNED() { return getToken(DDLParser.UNSIGNED, 0); }
		public TerminalNode BINARY() { return getToken(DDLParser.BINARY, 0); }
		public Data_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterData_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitData_option(this);
		}
	}

	public final Data_optionContext data_option() throws RecognitionException {
		Data_optionContext _localctx = new Data_optionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_data_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			_la = _input.LA(1);
			if ( !(_la==BINARY || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (SIGNED - 93)) | (1L << (UNSIGNED - 93)) | (1L << (ZEROFILL - 93)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Schema_nameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Schema_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterSchema_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitSchema_name(this);
		}
	}

	public final Schema_nameContext schema_name() throws RecognitionException {
		Schema_nameContext _localctx = new Schema_nameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574); ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitTable_name(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576); ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Col_nameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Col_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterCol_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitCol_name(this);
		}
	}

	public final Col_nameContext col_name() throws RecognitionException {
		Col_nameContext _localctx = new Col_nameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_col_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578); ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_nameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitIndex_name(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580); ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Charset_nameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Charset_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charset_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterCharset_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitCharset_name(this);
		}
	}

	public final Charset_nameContext charset_name() throws RecognitionException {
		Charset_nameContext _localctx = new Charset_nameContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_charset_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582); ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collation_nameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitCollation_name(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584); ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constr_nameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Constr_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constr_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterConstr_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitConstr_name(this);
		}
	}

	public final Constr_nameContext constr_name() throws RecognitionException {
		Constr_nameContext _localctx = new Constr_nameContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_constr_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586); ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Triger_nameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Triger_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triger_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterTriger_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitTriger_name(this);
		}
	}

	public final Triger_nameContext triger_name() throws RecognitionException {
		Triger_nameContext _localctx = new Triger_nameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_triger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588); ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameListContext extends ParserRuleContext {
		public TerminalNode RP(int i) {
			return getToken(DDLParser.RP, i);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public TerminalNode CO(int i) {
			return getToken(DDLParser.CO, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public List<TerminalNode> RP() { return getTokens(DDLParser.RP); }
		public List<TerminalNode> CO() { return getTokens(DDLParser.CO); }
		public TerminalNode LP(int i) {
			return getToken(DDLParser.LP, i);
		}
		public List<TerminalNode> LP() { return getTokens(DDLParser.LP); }
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public NameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitNameList(this);
		}
	}

	public final NameListContext nameList() throws RecognitionException {
		NameListContext _localctx = new NameListContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_nameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590); ident();
			setState(595);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(591); match(LP);
				setState(592); value();
				setState(593); match(RP);
				}
			}

			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CO) {
				{
				{
				setState(597); match(CO);
				setState(598); ident();
				setState(603);
				_la = _input.LA(1);
				if (_la==LP) {
					{
					setState(599); match(LP);
					setState(600); value();
					setState(601); match(RP);
					}
				}

				}
				}
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParNameListContext extends ParserRuleContext {
		public TerminalNode RP() { return getToken(DDLParser.RP, 0); }
		public NameListContext nameList() {
			return getRuleContext(NameListContext.class,0);
		}
		public TerminalNode LP() { return getToken(DDLParser.LP, 0); }
		public ParNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterParNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitParNameList(this);
		}
	}

	public final ParNameListContext parNameList() throws RecognitionException {
		ParNameListContext _localctx = new ParNameListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_parNameList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610); match(LP);
			setState(611); nameList();
			setState(612); match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueListContext extends ParserRuleContext {
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode CO(int i) {
			return getToken(DDLParser.CO, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public List<TerminalNode> CO() { return getTokens(DDLParser.CO); }
		public ValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitValueList(this);
		}
	}

	public final ValueListContext valueList() throws RecognitionException {
		ValueListContext _localctx = new ValueListContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614); value();
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CO) {
				{
				{
				setState(615); match(CO);
				setState(616); value();
				}
				}
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParValueListContext extends ParserRuleContext {
		public TerminalNode RP() { return getToken(DDLParser.RP, 0); }
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
		}
		public TerminalNode LP() { return getToken(DDLParser.LP, 0); }
		public ParValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterParValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitParValueList(this);
		}
	}

	public final ParValueListContext parValueList() throws RecognitionException {
		ParValueListContext _localctx = new ParValueListContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_parValueList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622); match(LP);
			setState(623); valueList();
			setState(624); match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValuesListContext extends ParserRuleContext {
		public List<ParValueListContext> parValueList() {
			return getRuleContexts(ParValueListContext.class);
		}
		public TerminalNode RP() { return getToken(DDLParser.RP, 0); }
		public ParValueListContext parValueList(int i) {
			return getRuleContext(ParValueListContext.class,i);
		}
		public TerminalNode LP() { return getToken(DDLParser.LP, 0); }
		public ValuesListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuesList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterValuesList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitValuesList(this);
		}
	}

	public final ValuesListContext valuesList() throws RecognitionException {
		ValuesListContext _localctx = new ValuesListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_valuesList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626); match(LP);
			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LP) {
				{
				{
				setState(627); parValueList();
				}
				}
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(633); match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SizeContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(DDLParser.INT); }
		public TerminalNode RP() { return getToken(DDLParser.RP, 0); }
		public TerminalNode CO() { return getToken(DDLParser.CO, 0); }
		public TerminalNode INT(int i) {
			return getToken(DDLParser.INT, i);
		}
		public TerminalNode LP() { return getToken(DDLParser.LP, 0); }
		public SizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitSize(this);
		}
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635); match(LP);
			setState(636); match(INT);
			setState(639);
			_la = _input.LA(1);
			if (_la==CO) {
				{
				setState(637); match(CO);
				setState(638); match(INT);
				}
			}

			setState(641); match(RP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderContext extends ParserRuleContext {
		public TerminalNode DESC() { return getToken(DDLParser.DESC, 0); }
		public TerminalNode ASC() { return getToken(DDLParser.ASC, 0); }
		public OrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitOrder(this);
		}
	}

	public final OrderContext order() throws RecognitionException {
		OrderContext _localctx = new OrderContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_order);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			_la = _input.LA(1);
			if ( !(_la==ASC || _la==DESC) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode NULL() { return getToken(DDLParser.NULL, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_value);
		try {
			setState(649);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(645); number();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(646); match(NULL);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(647); ident();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(648); function();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentContext extends ParserRuleContext {
		public Quoted_restContext quoted_rest() {
			return getRuleContext(Quoted_restContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public RestrictedContext restricted() {
			return getRuleContext(RestrictedContext.class,0);
		}
		public TerminalNode ID() { return getToken(DDLParser.ID, 0); }
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitIdent(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_ident);
		try {
			setState(655);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(651); match(ID);
				}
				break;
			case ACTION:
			case ADD:
			case ALTER:
			case ASC:
			case AUTO_INC:
			case BIGINT:
			case BINARY:
			case BIT:
			case BTREE:
			case CASCADE:
			case CHARACTER:
			case CHAR:
			case CHECK:
			case COLLATE:
			case COL_FORMAT:
			case COMMIT:
			case CREATE:
			case DATABASE:
			case DECIMAL:
			case DELETE:
			case DESC:
			case DISK:
			case DOUBLE:
			case DYNAMIC:
			case END:
			case ENUM:
			case EXISTS:
			case FIXED:
			case FOREIGN:
			case FULLTEXT:
			case FUNCTION:
			case HASH:
			case IF:
			case IGNORE:
			case INSERT:
			case INTEGER:
			case INTO:
			case IS:
			case NUMERIC:
			case REAL:
			case REFERENCES:
			case REPLACE:
			case RESTRICT:
			case SCHEMA:
			case SET:
			case SMALLINT:
			case SPATIAL:
			case STORAGE:
			case TABLE:
			case TEMPORARY:
			case UNSIGNED:
			case UPDATE:
			case USE:
			case USING:
			case VALUES:
			case VARBINARY:
			case VARCHAR:
			case YEAR:
			case ZEROFILL:
				enterOuterAlt(_localctx, 2);
				{
				setState(652); restricted();
				}
				break;
			case QO:
			case DQ:
			case GR:
				enterOuterAlt(_localctx, 3);
				{
				setState(653); quoted_rest();
				}
				break;
			case STRING_G:
			case STRING_Q:
			case STRING_D:
				enterOuterAlt(_localctx, 4);
				{
				setState(654); string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public QuoteContext quote(int i) {
			return getRuleContext(QuoteContext.class,i);
		}
		public TerminalNode INT() { return getToken(DDLParser.INT, 0); }
		public List<QuoteContext> quote() {
			return getRuleContexts(QuoteContext.class);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_number);
		try {
			setState(662);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(657); match(INT);
				}
				break;
			case QO:
			case DQ:
			case GR:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(658); quote();
				setState(659); match(INT);
				setState(660); quote();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuoteContext extends ParserRuleContext {
		public TerminalNode GR() { return getToken(DDLParser.GR, 0); }
		public TerminalNode DQ() { return getToken(DDLParser.DQ, 0); }
		public TerminalNode QO() { return getToken(DDLParser.QO, 0); }
		public QuoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterQuote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitQuote(this);
		}
	}

	public final QuoteContext quote() throws RecognitionException {
		QuoteContext _localctx = new QuoteContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_quote);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QO) | (1L << DQ) | (1L << GR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Quoted_restContext extends ParserRuleContext {
		public QuoteContext quote(int i) {
			return getRuleContext(QuoteContext.class,i);
		}
		public List<QuoteContext> quote() {
			return getRuleContexts(QuoteContext.class);
		}
		public RestrictedContext restricted() {
			return getRuleContext(RestrictedContext.class,0);
		}
		public Quoted_restContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quoted_rest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterQuoted_rest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitQuoted_rest(this);
		}
	}

	public final Quoted_restContext quoted_rest() throws RecognitionException {
		Quoted_restContext _localctx = new Quoted_restContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_quoted_rest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666); quote();
			setState(667); restricted();
			setState(668); quote();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING_G() { return getToken(DDLParser.STRING_G, 0); }
		public TerminalNode STRING_Q() { return getToken(DDLParser.STRING_Q, 0); }
		public TerminalNode STRING_D() { return getToken(DDLParser.STRING_D, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_G) | (1L << STRING_Q) | (1L << STRING_D))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public Consume_parContext consume_par() {
			return getRuleContext(Consume_parContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672); ident();
			setState(673); consume_par();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Special_charContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(DDLParser.AT, 0); }
		public TerminalNode US() { return getToken(DDLParser.US, 0); }
		public TerminalNode HA() { return getToken(DDLParser.HA, 0); }
		public TerminalNode SL() { return getToken(DDLParser.SL, 0); }
		public TerminalNode RP() { return getToken(DDLParser.RP, 0); }
		public TerminalNode DA() { return getToken(DDLParser.DA, 0); }
		public TerminalNode CA() { return getToken(DDLParser.CA, 0); }
		public TerminalNode QO() { return getToken(DDLParser.QO, 0); }
		public TerminalNode SP() { return getToken(DDLParser.SP, 0); }
		public TerminalNode LP() { return getToken(DDLParser.LP, 0); }
		public TerminalNode SQ() { return getToken(DDLParser.SQ, 0); }
		public TerminalNode PL() { return getToken(DDLParser.PL, 0); }
		public TerminalNode DO() { return getToken(DDLParser.DO, 0); }
		public TerminalNode VB() { return getToken(DDLParser.VB, 0); }
		public TerminalNode ST() { return getToken(DDLParser.ST, 0); }
		public TerminalNode GR() { return getToken(DDLParser.GR, 0); }
		public TerminalNode DQ() { return getToken(DDLParser.DQ, 0); }
		public TerminalNode EQ() { return getToken(DDLParser.EQ, 0); }
		public TerminalNode CO() { return getToken(DDLParser.CO, 0); }
		public TerminalNode CL() { return getToken(DDLParser.CL, 0); }
		public Special_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special_char; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterSpecial_char(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitSpecial_char(this);
		}
	}

	public final Special_charContext special_char() throws RecognitionException {
		Special_charContext _localctx = new Special_charContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_special_char);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << LP) | (1L << RP) | (1L << SQ) | (1L << CO) | (1L << QO) | (1L << US) | (1L << AT) | (1L << DA) | (1L << HA) | (1L << SL) | (1L << ST) | (1L << DQ) | (1L << GR) | (1L << CL) | (1L << DO) | (1L << SP) | (1L << CA) | (1L << VB) | (1L << PL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RestrictedContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(DDLParser.FUNCTION, 0); }
		public TerminalNode ALTER() { return getToken(DDLParser.ALTER, 0); }
		public TerminalNode YEAR() { return getToken(DDLParser.YEAR, 0); }
		public TerminalNode FIXED() { return getToken(DDLParser.FIXED, 0); }
		public TerminalNode CHAR() { return getToken(DDLParser.CHAR, 0); }
		public TerminalNode TABLE() { return getToken(DDLParser.TABLE, 0); }
		public TerminalNode UPDATE() { return getToken(DDLParser.UPDATE, 0); }
		public TerminalNode VARCHAR() { return getToken(DDLParser.VARCHAR, 0); }
		public TerminalNode CASCADE() { return getToken(DDLParser.CASCADE, 0); }
		public TerminalNode FOREIGN() { return getToken(DDLParser.FOREIGN, 0); }
		public TerminalNode ACTION() { return getToken(DDLParser.ACTION, 0); }
		public TerminalNode CHARACTER() { return getToken(DDLParser.CHARACTER, 0); }
		public TerminalNode IF() { return getToken(DDLParser.IF, 0); }
		public TerminalNode STORAGE() { return getToken(DDLParser.STORAGE, 0); }
		public TerminalNode CREATE() { return getToken(DDLParser.CREATE, 0); }
		public TerminalNode BTREE() { return getToken(DDLParser.BTREE, 0); }
		public TerminalNode INSERT() { return getToken(DDLParser.INSERT, 0); }
		public TerminalNode USING() { return getToken(DDLParser.USING, 0); }
		public TerminalNode REFERENCES() { return getToken(DDLParser.REFERENCES, 0); }
		public TerminalNode IS() { return getToken(DDLParser.IS, 0); }
		public TerminalNode REPLACE() { return getToken(DDLParser.REPLACE, 0); }
		public TerminalNode COL_FORMAT() { return getToken(DDLParser.COL_FORMAT, 0); }
		public TerminalNode DOUBLE() { return getToken(DDLParser.DOUBLE, 0); }
		public TerminalNode FULLTEXT() { return getToken(DDLParser.FULLTEXT, 0); }
		public TerminalNode ZEROFILL() { return getToken(DDLParser.ZEROFILL, 0); }
		public TerminalNode EXISTS() { return getToken(DDLParser.EXISTS, 0); }
		public TerminalNode INTO() { return getToken(DDLParser.INTO, 0); }
		public TerminalNode COLLATE() { return getToken(DDLParser.COLLATE, 0); }
		public TerminalNode ADD() { return getToken(DDLParser.ADD, 0); }
		public TerminalNode INTEGER() { return getToken(DDLParser.INTEGER, 0); }
		public TerminalNode VARBINARY() { return getToken(DDLParser.VARBINARY, 0); }
		public TerminalNode ASC() { return getToken(DDLParser.ASC, 0); }
		public TerminalNode SPATIAL() { return getToken(DDLParser.SPATIAL, 0); }
		public TerminalNode VALUES() { return getToken(DDLParser.VALUES, 0); }
		public TerminalNode HASH() { return getToken(DDLParser.HASH, 0); }
		public TerminalNode AUTO_INC() { return getToken(DDLParser.AUTO_INC, 0); }
		public TerminalNode SET() { return getToken(DDLParser.SET, 0); }
		public TerminalNode DELETE() { return getToken(DDLParser.DELETE, 0); }
		public TerminalNode IGNORE() { return getToken(DDLParser.IGNORE, 0); }
		public TerminalNode NUMERIC() { return getToken(DDLParser.NUMERIC, 0); }
		public TerminalNode RESTRICT() { return getToken(DDLParser.RESTRICT, 0); }
		public TerminalNode REAL() { return getToken(DDLParser.REAL, 0); }
		public TerminalNode COMMIT() { return getToken(DDLParser.COMMIT, 0); }
		public TerminalNode SCHEMA() { return getToken(DDLParser.SCHEMA, 0); }
		public TerminalNode ENUM() { return getToken(DDLParser.ENUM, 0); }
		public TerminalNode UNSIGNED() { return getToken(DDLParser.UNSIGNED, 0); }
		public TerminalNode DATABASE() { return getToken(DDLParser.DATABASE, 0); }
		public TerminalNode DECIMAL() { return getToken(DDLParser.DECIMAL, 0); }
		public TerminalNode DISK() { return getToken(DDLParser.DISK, 0); }
		public TerminalNode BIGINT() { return getToken(DDLParser.BIGINT, 0); }
		public TerminalNode BIT() { return getToken(DDLParser.BIT, 0); }
		public TerminalNode CHECK() { return getToken(DDLParser.CHECK, 0); }
		public TerminalNode USE() { return getToken(DDLParser.USE, 0); }
		public TerminalNode DESC() { return getToken(DDLParser.DESC, 0); }
		public TerminalNode BINARY() { return getToken(DDLParser.BINARY, 0); }
		public TerminalNode END() { return getToken(DDLParser.END, 0); }
		public TerminalNode TEMPORARY() { return getToken(DDLParser.TEMPORARY, 0); }
		public TerminalNode DYNAMIC() { return getToken(DDLParser.DYNAMIC, 0); }
		public TerminalNode SMALLINT() { return getToken(DDLParser.SMALLINT, 0); }
		public RestrictedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restricted; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterRestricted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitRestricted(this);
		}
	}

	public final RestrictedContext restricted() throws RecognitionException {
		RestrictedContext _localctx = new RestrictedContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_restricted);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACTION) | (1L << ADD) | (1L << ALTER) | (1L << ASC) | (1L << AUTO_INC) | (1L << BIGINT) | (1L << BINARY) | (1L << BIT) | (1L << BTREE) | (1L << CASCADE) | (1L << CHARACTER) | (1L << CHAR) | (1L << CHECK) | (1L << COLLATE) | (1L << COL_FORMAT) | (1L << COMMIT) | (1L << CREATE) | (1L << DATABASE) | (1L << DECIMAL) | (1L << DELETE) | (1L << DESC) | (1L << DISK) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << END) | (1L << ENUM) | (1L << EXISTS) | (1L << FIXED) | (1L << FOREIGN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FULLTEXT - 64)) | (1L << (FUNCTION - 64)) | (1L << (HASH - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INSERT - 64)) | (1L << (INTEGER - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (NUMERIC - 64)) | (1L << (REAL - 64)) | (1L << (REFERENCES - 64)) | (1L << (REPLACE - 64)) | (1L << (RESTRICT - 64)) | (1L << (SCHEMA - 64)) | (1L << (SET - 64)) | (1L << (SMALLINT - 64)) | (1L << (SPATIAL - 64)) | (1L << (STORAGE - 64)) | (1L << (TABLE - 64)) | (1L << (TEMPORARY - 64)) | (1L << (UNSIGNED - 64)) | (1L << (UPDATE - 64)) | (1L << (USE - 64)) | (1L << (USING - 64)) | (1L << (VALUES - 64)) | (1L << (VARBINARY - 64)) | (1L << (VARCHAR - 64)) | (1L << (YEAR - 64)) | (1L << (ZEROFILL - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\2\3t\u02aa\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4"+
		")\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62"+
		"\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4"+
		";\t;\4<\t<\4=\t=\3\2\3\2\5\2}\n\2\6\2\177\n\2\r\2\16\2\u0080\3\2\3\2\3"+
		"\3\3\3\5\3\u0087\n\3\3\4\3\4\3\4\3\4\5\4\u008d\n\4\3\5\3\5\3\5\3\5\5\5"+
		"\u0093\n\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u009e\n\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u00a6\n\t\3\t\3\t\3\t\3\t\5\t\u00ac\n\t\3\t\3\t\5\t"+
		"\u00b0\n\t\5\t\u00b2\n\t\3\n\3\n\5\n\u00b6\n\n\3\n\3\n\3\n\5\n\u00bb\n"+
		"\n\3\n\3\n\3\n\3\n\7\n\u00c1\n\n\f\n\16\n\u00c4\13\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u00cd\n\13\3\f\3\f\3\f\3\f\3\f\6\f\u00d4\n\f\r"+
		"\f\16\f\u00d5\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00e3\n"+
		"\r\f\r\16\r\u00e6\13\r\3\16\3\16\3\16\3\16\5\16\u00ec\n\16\3\16\3\16\7"+
		"\16\u00f0\n\16\f\16\16\16\u00f3\13\16\3\17\5\17\u00f6\n\17\3\17\3\17\3"+
		"\17\5\17\u00fb\n\17\3\17\3\17\5\17\u00ff\n\17\3\17\3\17\5\17\u0103\n\17"+
		"\3\17\5\17\u0106\n\17\3\20\5\20\u0109\n\20\3\20\3\20\3\20\5\20\u010e\n"+
		"\20\3\20\3\20\3\20\3\20\5\20\u0114\n\20\3\21\3\21\5\21\u0118\n\21\3\22"+
		"\3\22\5\22\u011c\n\22\3\22\3\22\5\22\u0120\n\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\7\23\u0128\n\23\f\23\16\23\u012b\13\23\3\23\3\23\3\24\3\24\5"+
		"\24\u0131\n\24\3\24\3\24\3\24\3\24\3\25\3\25\5\25\u0139\n\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\7\26\u0142\n\26\f\26\16\26\u0145\13\26\3\26"+
		"\3\26\3\27\5\27\u014a\n\27\3\27\3\27\3\27\3\27\5\27\u0150\n\27\3\27\3"+
		"\27\3\27\3\27\5\27\u0156\n\27\7\27\u0158\n\27\f\27\16\27\u015b\13\27\3"+
		"\27\3\27\7\27\u015f\n\27\f\27\16\27\u0162\13\27\3\30\3\30\5\30\u0166\n"+
		"\30\3\31\5\31\u0169\n\31\3\31\3\31\3\31\5\31\u016e\n\31\3\31\3\31\5\31"+
		"\u0172\n\31\3\31\3\31\5\31\u0176\n\31\3\31\3\31\5\31\u017a\n\31\5\31\u017c"+
		"\n\31\5\31\u017e\n\31\3\32\3\32\3\32\5\32\u0183\n\32\3\32\5\32\u0186\n"+
		"\32\3\32\3\32\7\32\u018a\n\32\f\32\16\32\u018d\13\32\3\32\3\32\3\32\5"+
		"\32\u0192\n\32\3\33\5\33\u0195\n\33\3\33\3\33\3\33\3\33\3\33\5\33\u019c"+
		"\n\33\5\33\u019e\n\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\5\37\u01a7\n"+
		"\37\3\37\5\37\u01aa\n\37\3\37\3\37\3\37\5\37\u01af\n\37\3\37\5\37\u01b2"+
		"\n\37\3\37\5\37\u01b5\n\37\3\37\7\37\u01b8\n\37\f\37\16\37\u01bb\13\37"+
		"\3\37\3\37\5\37\u01bf\n\37\3\37\3\37\5\37\u01c3\n\37\3\37\5\37\u01c6\n"+
		"\37\3\37\3\37\7\37\u01ca\n\37\f\37\16\37\u01cd\13\37\3\37\5\37\u01d0\n"+
		"\37\3\37\5\37\u01d3\n\37\3\37\3\37\5\37\u01d7\n\37\3\37\5\37\u01da\n\37"+
		"\3\37\5\37\u01dd\n\37\3\37\5\37\u01e0\n\37\3\37\7\37\u01e3\n\37\f\37\16"+
		"\37\u01e6\13\37\3\37\3\37\5\37\u01ea\n\37\3\37\5\37\u01ed\n\37\3\37\3"+
		"\37\7\37\u01f1\n\37\f\37\16\37\u01f4\13\37\3\37\5\37\u01f7\n\37\3\37\5"+
		"\37\u01fa\n\37\3\37\3\37\3\37\5\37\u01ff\n\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u020a\n\37\3 \3 \3 \7 \u020f\n \f \16 \u0212"+
		"\13 \3 \3 \3!\3!\3!\3!\7!\u021a\n!\f!\16!\u021d\13!\3\"\3\"\3\"\3\"\3"+
		"#\3#\5#\u0225\n#\3#\3#\3#\3#\5#\u022b\n#\3$\6$\u022e\n$\r$\16$\u022f\3"+
		"$\5$\u0233\n$\3$\3$\5$\u0237\n$\3$\3$\3$\3$\5$\u023d\n$\3%\3%\3&\3&\3"+
		"\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3.\3.\5.\u0256\n."+
		"\3.\3.\3.\3.\3.\3.\5.\u025e\n.\7.\u0260\n.\f.\16.\u0263\13.\3/\3/\3/\3"+
		"/\3\60\3\60\3\60\7\60\u026c\n\60\f\60\16\60\u026f\13\60\3\61\3\61\3\61"+
		"\3\61\3\62\3\62\7\62\u0277\n\62\f\62\16\62\u027a\13\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\5\63\u0282\n\63\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65"+
		"\5\65\u028c\n\65\3\66\3\66\3\66\3\66\5\66\u0292\n\66\3\67\3\67\3\67\3"+
		"\67\3\67\5\67\u0299\n\67\38\38\39\39\39\39\3:\3:\3;\3;\3;\3<\3<\3=\3="+
		"\3=\2>\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTVXZ\\^`bdfhjlnprtvx\2\31\4\63\63cc\4\63\63cc\4\63\63]]\5B"+
		"Baaff\4))DD\3\13\13\4CCVV\3==\3\f\f\3\f\r\4GGLL\4GGLL\4BBaa\4GGLL\3\n"+
		"\13\4\67\67hh\4**\\\\\6\'\'__ggqq\4$$88\4\16\16\25\26\3\3\5\3\t\34\r "+
		"\"$\60\62\64\67:<FHKRRY^`dgmpq\u02e2\2~\3\2\2\2\4\u0086\3\2\2\2\6\u008c"+
		"\3\2\2\2\b\u0092\3\2\2\2\n\u0094\3\2\2\2\f\u0097\3\2\2\2\16\u0099\3\2"+
		"\2\2\20\u00b1\3\2\2\2\22\u00b3\3\2\2\2\24\u00c5\3\2\2\2\26\u00ce\3\2\2"+
		"\2\30\u00d7\3\2\2\2\32\u00e7\3\2\2\2\34\u0105\3\2\2\2\36\u0108\3\2\2\2"+
		" \u0115\3\2\2\2\"\u011f\3\2\2\2$\u0121\3\2\2\2&\u0130\3\2\2\2(\u0138\3"+
		"\2\2\2*\u0143\3\2\2\2,\u0149\3\2\2\2.\u0165\3\2\2\2\60\u017d\3\2\2\2\62"+
		"\u017f\3\2\2\2\64\u019d\3\2\2\2\66\u019f\3\2\2\28\u01a1\3\2\2\2:\u01a3"+
		"\3\2\2\2<\u0209\3\2\2\2>\u020b\3\2\2\2@\u0215\3\2\2\2B\u021e\3\2\2\2D"+
		"\u022a\3\2\2\2F\u023c\3\2\2\2H\u023e\3\2\2\2J\u0240\3\2\2\2L\u0242\3\2"+
		"\2\2N\u0244\3\2\2\2P\u0246\3\2\2\2R\u0248\3\2\2\2T\u024a\3\2\2\2V\u024c"+
		"\3\2\2\2X\u024e\3\2\2\2Z\u0250\3\2\2\2\\\u0264\3\2\2\2^\u0268\3\2\2\2"+
		"`\u0270\3\2\2\2b\u0274\3\2\2\2d\u027d\3\2\2\2f\u0285\3\2\2\2h\u028b\3"+
		"\2\2\2j\u0291\3\2\2\2l\u0298\3\2\2\2n\u029a\3\2\2\2p\u029c\3\2\2\2r\u02a0"+
		"\3\2\2\2t\u02a2\3\2\2\2v\u02a5\3\2\2\2x\u02a7\3\2\2\2z|\5\4\3\2{}\7\f"+
		"\2\2|{\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~z\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\7\1\2\2"+
		"\u0083\3\3\2\2\2\u0084\u0087\5\6\4\2\u0085\u0087\5\b\5\2\u0086\u0084\3"+
		"\2\2\2\u0086\u0085\3\2\2\2\u0087\5\3\2\2\2\u0088\u008d\5\20\t\2\u0089"+
		"\u008d\5\24\13\2\u008a\u008d\5\26\f\2\u008b\u008d\5\30\r\2\u008c\u0088"+
		"\3\2\2\2\u008c\u0089\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d"+
		"\7\3\2\2\2\u008e\u0093\5\22\n\2\u008f\u0093\5\n\6\2\u0090\u0093\5\f\7"+
		"\2\u0091\u0093\5\16\b\2\u0092\u008e\3\2\2\2\u0092\u008f\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\t\3\2\2\2\u0094\u0095\7i\2\2"+
		"\u0095\u0096\5j\66\2\u0096\13\3\2\2\2\u0097\u0098\7\60\2\2\u0098\r\3\2"+
		"\2\2\u0099\u009a\7^\2\2\u009a\u009d\5j\66\2\u009b\u009c\7\t\2\2\u009c"+
		"\u009e\5j\66\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\17\3\2\2"+
		"\2\u009f\u00a0\7;\2\2\u00a0\u00a1\t\2\2\2\u00a1\u00a2\7E\2\2\u00a2\u00a3"+
		"\7?\2\2\u00a3\u00a5\5Z.\2\u00a4\u00a6\7X\2\2\u00a5\u00a4\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00b2\3\2\2\2\u00a7\u00a8\7;\2\2\u00a8\u00a9\t\3"+
		"\2\2\u00a9\u00ab\5Z.\2\u00aa\u00ac\7X\2\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ae\7E\2\2\u00ae\u00b0\7?\2\2\u00af"+
		"\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u009f\3\2"+
		"\2\2\u00b1\u00a7\3\2\2\2\u00b2\21\3\2\2\2\u00b3\u00b5\7H\2\2\u00b4\u00b6"+
		"\7F\2\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b8\7J\2\2\u00b8\u00ba\5L\'\2\u00b9\u00bb\5\\/\2\u00ba\u00b9\3\2\2"+
		"\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\7k\2\2\u00bd\u00c2"+
		"\5`\61\2\u00be\u00bf\7\r\2\2\u00bf\u00c1\5`\61\2\u00c0\u00be\3\2\2\2\u00c1"+
		"\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\23\3\2\2"+
		"\2\u00c4\u00c2\3\2\2\2\u00c5\u00cc\7\62\2\2\u00c6\u00cd\5\32\16\2\u00c7"+
		"\u00cd\5,\27\2\u00c8\u00cd\5\36\20\2\u00c9\u00cd\5$\23\2\u00ca\u00cd\5"+
		"&\24\2\u00cb\u00cd\5(\25\2\u00cc\u00c6\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cc"+
		"\u00c8\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2"+
		"\2\2\u00cd\25\3\2\2\2\u00ce\u00cf\7\"\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d3"+
		"\5L\'\2\u00d1\u00d2\7!\2\2\u00d2\u00d4\5:\36\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\27\3\2\2"+
		"\2\u00d7\u00d8\7h\2\2\u00d8\u00d9\5L\'\2\u00d9\u00da\7^\2\2\u00da\u00db"+
		"\5N(\2\u00db\u00dc\7\t\2\2\u00dc\u00e4\5h\65\2\u00dd\u00de\7\r\2\2\u00de"+
		"\u00df\5N(\2\u00df\u00e0\7\t\2\2\u00e0\u00e1\5h\65\2\u00e1\u00e3\3\2\2"+
		"\2\u00e2\u00dd\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5"+
		"\3\2\2\2\u00e5\31\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00eb\t\4\2\2\u00e8"+
		"\u00e9\7E\2\2\u00e9\u00ea\7P\2\2\u00ea\u00ec\7?\2\2\u00eb\u00e8\3\2\2"+
		"\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f1\5J&\2\u00ee\u00f0"+
		"\5\34\17\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2"+
		"\u00f1\u00f2\3\2\2\2\u00f2\33\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f6"+
		"\7\65\2\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2"+
		"\u00f7\u00f8\7+\2\2\u00f8\u00fa\7^\2\2\u00f9\u00fb\7\t\2\2\u00fa\u00f9"+
		"\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0106\5R*\2\u00fd"+
		"\u00ff\7\65\2\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3"+
		"\2\2\2\u0100\u0102\7.\2\2\u0101\u0103\7\t\2\2\u0102\u0101\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\5T+\2\u0105\u00f5\3\2\2"+
		"\2\u0105\u00fe\3\2\2\2\u0106\35\3\2\2\2\u0107\u0109\t\5\2\2\u0108\u0107"+
		"\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\7G\2\2\u010b"+
		"\u010d\5P)\2\u010c\u010e\5 \21\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2"+
		"\2\u010e\u010f\3\2\2\2\u010f\u0110\7S\2\2\u0110\u0111\5L\'\2\u0111\u0113"+
		"\5\\/\2\u0112\u0114\5\"\22\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\37\3\2\2\2\u0115\u0117\7j\2\2\u0116\u0118\t\6\2\2\u0117\u0116\3\2\2\2"+
		"\u0117\u0118\3\2\2\2\u0118!\3\2\2\2\u0119\u011b\7M\2\2\u011a\u011c\7\t"+
		"\2\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u0120\5h\65\2\u011e\u0120\5 \21\2\u011f\u0119\3\2\2\2\u011f\u011e\3\2"+
		"\2\2\u0120#\3\2\2\2\u0121\u0122\7n\2\2\u0122\u0123\5j\66\2\u0123\u0124"+
		"\5\\/\2\u0124\u0125\7#\2\2\u0125\u0129\7\n\2\2\u0126\u0128\n\7\2\2\u0127"+
		"\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2"+
		"\2\2\u012a\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012d\7\13\2\2\u012d"+
		"%\3\2\2\2\u012e\u012f\7T\2\2\u012f\u0131\7[\2\2\u0130\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\7e\2\2\u0133\u0134\5X-"+
		"\2\u0134\u0135\5*\26\2\u0135\'\3\2\2\2\u0136\u0137\7T\2\2\u0137\u0139"+
		"\7[\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u013b\t\b\2\2\u013b\u013c\5j\66\2\u013c\u013d\5*\26\2\u013d)\3\2\2\2"+
		"\u013e\u0142\n\t\2\2\u013f\u0140\7=\2\2\u0140\u0142\n\n\2\2\u0141\u013e"+
		"\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0147\7="+
		"\2\2\u0147+\3\2\2\2\u0148\u014a\7d\2\2\u0149\u0148\3\2\2\2\u0149\u014a"+
		"\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014f\7c\2\2\u014c\u014d\7E\2\2\u014d"+
		"\u014e\7P\2\2\u014e\u0150\7?\2\2\u014f\u014c\3\2\2\2\u014f\u0150\3\2\2"+
		"\2\u0150\u0151\3\2\2\2\u0151\u0152\5L\'\2\u0152\u0159\7\n\2\2\u0153\u0155"+
		"\5.\30\2\u0154\u0156\t\13\2\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2"+
		"\u0156\u0158\3\2\2\2\u0157\u0153\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157"+
		"\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c"+
		"\u0160\7\13\2\2\u015d\u015f\5\60\31\2\u015e\u015d\3\2\2\2\u015f\u0162"+
		"\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161-\3\2\2\2\u0162"+
		"\u0160\3\2\2\2\u0163\u0166\5\62\32\2\u0164\u0166\5\66\34\2\u0165\u0163"+
		"\3\2\2\2\u0165\u0164\3\2\2\2\u0166/\3\2\2\2\u0167\u0169\7\65\2\2\u0168"+
		"\u0167\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\7+"+
		"\2\2\u016b\u016d\7^\2\2\u016c\u016e\7\t\2\2\u016d\u016c\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u017e\5j\66\2\u0170\u0172\7\65"+
		"\2\2\u0171\u0170\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u017b\5j\66\2\u0174\u0176\7\t\2\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2"+
		"\2\2\u0176\u0179\3\2\2\2\u0177\u017a\5j\66\2\u0178\u017a\7r\2\2\u0179"+
		"\u0177\3\2\2\2\u0179\u0178\3\2\2\2\u017a\u017c\3\2\2\2\u017b\u0175\3\2"+
		"\2\2\u017b\u017c\3\2\2\2\u017c\u017e\3\2\2\2\u017d\u0168\3\2\2\2\u017d"+
		"\u0171\3\2\2\2\u017e\61\3\2\2\2\u017f\u0180\5N(\2\u0180\u0182\5F$\2\u0181"+
		"\u0183\5H%\2\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0185\3\2\2"+
		"\2\u0184\u0186\5\34\17\2\u0185\u0184\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"\u018b\3\2\2\2\u0187\u018a\5\64\33\2\u0188\u018a\58\35\2\u0189\u0187\3"+
		"\2\2\2\u0189\u0188\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018c\u0191\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u018f\7S"+
		"\2\2\u018f\u0190\7h\2\2\u0190\u0192\5j\66\2\u0191\u018e\3\2\2\2\u0191"+
		"\u0192\3\2\2\2\u0192\63\3\2\2\2\u0193\u0195\7P\2\2\u0194\u0193\3\2\2\2"+
		"\u0194\u0195\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u019e\7Q\2\2\u0197\u019e"+
		"\7%\2\2\u0198\u019b\7\65\2\2\u0199\u019c\5h\65\2\u019a\u019c\7Q\2\2\u019b"+
		"\u0199\3\2\2\2\u019b\u019a\3\2\2\2\u019c\u019e\3\2\2\2\u019d\u0194\3\2"+
		"\2\2\u019d\u0197\3\2\2\2\u019d\u0198\3\2\2\2\u019e\65\3\2\2\2\u019f\u01a0"+
		"\5<\37\2\u01a0\67\3\2\2\2\u01a1\u01a2\5<\37\2\u01a29\3\2\2\2\u01a3\u01a4"+
		"\5<\37\2\u01a4;\3\2\2\2\u01a5\u01a7\7\61\2\2\u01a6\u01a5\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7\u01a9\3\2\2\2\u01a8\u01aa\5V,\2\u01a9\u01a8\3\2\2"+
		"\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\7W\2\2\u01ac\u01ae"+
		"\7L\2\2\u01ad\u01af\5V,\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af"+
		"\u01b1\3\2\2\2\u01b0\u01b2\5 \21\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2"+
		"\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01b5\5\\/\2\u01b4\u01b3\3\2\2\2\u01b4"+
		"\u01b5\3\2\2\2\u01b5\u01b9\3\2\2\2\u01b6\u01b8\5\"\22\2\u01b7\u01b6\3"+
		"\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba"+
		"\u020a\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01be\t\f\2\2\u01bd\u01bf\5P"+
		")\2\u01be\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0"+
		"\u01c1\7S\2\2\u01c1\u01c3\5N(\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2"+
		"\2\u01c3\u01c5\3\2\2\2\u01c4\u01c6\5 \21\2\u01c5\u01c4\3\2\2\2\u01c5\u01c6"+
		"\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01cb\5\\/\2\u01c8\u01ca\5\"\22\2\u01c9"+
		"\u01c8\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2"+
		"\2\2\u01cc\u020a\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01d0\7\61\2\2\u01cf"+
		"\u01ce\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d2\3\2\2\2\u01d1\u01d3\5V"+
		",\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4"+
		"\u01d6\7f\2\2\u01d5\u01d7\t\r\2\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2"+
		"\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01da\5P)\2\u01d9\u01d8\3\2\2\2\u01d9\u01da"+
		"\3\2\2\2\u01da\u01dc\3\2\2\2\u01db\u01dd\5 \21\2\u01dc\u01db\3\2\2\2\u01dc"+
		"\u01dd\3\2\2\2\u01dd\u01df\3\2\2\2\u01de\u01e0\5\\/\2\u01df\u01de\3\2"+
		"\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e4\3\2\2\2\u01e1\u01e3\5\"\22\2\u01e2"+
		"\u01e1\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2"+
		"\2\2\u01e5\u020a\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01e9\t\16\2\2\u01e8"+
		"\u01ea\t\17\2\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ec\3"+
		"\2\2\2\u01eb\u01ed\5P)\2\u01ec\u01eb\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed"+
		"\u01ee\3\2\2\2\u01ee\u01f2\5\\/\2\u01ef\u01f1\5\"\22\2\u01f0\u01ef\3\2"+
		"\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3"+
		"\u020a\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01f7\7\61\2\2\u01f6\u01f5\3"+
		"\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01fa\5V,\2\u01f9"+
		"\u01f8\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\7A"+
		"\2\2\u01fc\u01fe\7L\2\2\u01fd\u01ff\5P)\2\u01fe\u01fd\3\2\2\2\u01fe\u01ff"+
		"\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0201\5\\/\2\u0201\u0202\5@!\2\u0202"+
		"\u020a\3\2\2\2\u0203\u0204\7\61\2\2\u0204\u0205\5V,\2\u0205\u0206\7-\2"+
		"\2\u0206\u0207\5> \2\u0207\u020a\3\2\2\2\u0208\u020a\5@!\2\u0209\u01a6"+
		"\3\2\2\2\u0209\u01bc\3\2\2\2\u0209\u01cf\3\2\2\2\u0209\u01e7\3\2\2\2\u0209"+
		"\u01f6\3\2\2\2\u0209\u0203\3\2\2\2\u0209\u0208\3\2\2\2\u020a=\3\2\2\2"+
		"\u020b\u0210\7\n\2\2\u020c\u020f\n\20\2\2\u020d\u020f\5> \2\u020e\u020c"+
		"\3\2\2\2\u020e\u020d\3\2\2\2\u020f\u0212\3\2\2\2\u0210\u020e\3\2\2\2\u0210"+
		"\u0211\3\2\2\2\u0211\u0213\3\2\2\2\u0212\u0210\3\2\2\2\u0213\u0214\7\13"+
		"\2\2\u0214?\3\2\2\2\u0215\u0216\7Z\2\2\u0216\u0217\5L\'\2\u0217\u021b"+
		"\5\\/\2\u0218\u021a\5B\"\2\u0219\u0218\3\2\2\2\u021a\u021d\3\2\2\2\u021b"+
		"\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021cA\3\2\2\2\u021d\u021b\3\2\2\2"+
		"\u021e\u021f\7S\2\2\u021f\u0220\t\21\2\2\u0220\u0221\5D#\2\u0221C\3\2"+
		"\2\2\u0222\u0224\t\22\2\2\u0223\u0225\7\66\2\2\u0224\u0223\3\2\2\2\u0224"+
		"\u0225\3\2\2\2\u0225\u022b\3\2\2\2\u0226\u0227\7^\2\2\u0227\u022b\7Q\2"+
		"\2\u0228\u0229\7O\2\2\u0229\u022b\7 \2\2\u022a\u0222\3\2\2\2\u022a\u0226"+
		"\3\2\2\2\u022a\u0228\3\2\2\2\u022bE\3\2\2\2\u022c\u022e\5j\66\2\u022d"+
		"\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2"+
		"\2\2\u0230\u0232\3\2\2\2\u0231\u0233\5d\63\2\u0232\u0231\3\2\2\2\u0232"+
		"\u0233\3\2\2\2\u0233\u0236\3\2\2\2\u0234\u0235\7>\2\2\u0235\u0237\5`\61"+
		"\2\u0236\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u023d\3\2\2\2\u0238\u0239"+
		"\7>\2\2\u0239\u023d\5`\61\2\u023a\u023b\7^\2\2\u023b\u023d\5`\61\2\u023c"+
		"\u022d\3\2\2\2\u023c\u0238\3\2\2\2\u023c\u023a\3\2\2\2\u023dG\3\2\2\2"+
		"\u023e\u023f\t\23\2\2\u023fI\3\2\2\2\u0240\u0241\5j\66\2\u0241K\3\2\2"+
		"\2\u0242\u0243\5j\66\2\u0243M\3\2\2\2\u0244\u0245\5j\66\2\u0245O\3\2\2"+
		"\2\u0246\u0247\5j\66\2\u0247Q\3\2\2\2\u0248\u0249\5j\66\2\u0249S\3\2\2"+
		"\2\u024a\u024b\5j\66\2\u024bU\3\2\2\2\u024c\u024d\5j\66\2\u024dW\3\2\2"+
		"\2\u024e\u024f\5j\66\2\u024fY\3\2\2\2\u0250\u0255\5j\66\2\u0251\u0252"+
		"\7\n\2\2\u0252\u0253\5h\65\2\u0253\u0254\7\13\2\2\u0254\u0256\3\2\2\2"+
		"\u0255\u0251\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0261\3\2\2\2\u0257\u0258"+
		"\7\r\2\2\u0258\u025d\5j\66\2\u0259\u025a\7\n\2\2\u025a\u025b\5h\65\2\u025b"+
		"\u025c\7\13\2\2\u025c\u025e\3\2\2\2\u025d\u0259\3\2\2\2\u025d\u025e\3"+
		"\2\2\2\u025e\u0260\3\2\2\2\u025f\u0257\3\2\2\2\u0260\u0263\3\2\2\2\u0261"+
		"\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262[\3\2\2\2\u0263\u0261\3\2\2\2"+
		"\u0264\u0265\7\n\2\2\u0265\u0266\5Z.\2\u0266\u0267\7\13\2\2\u0267]\3\2"+
		"\2\2\u0268\u026d\5h\65\2\u0269\u026a\7\r\2\2\u026a\u026c\5h\65\2\u026b"+
		"\u0269\3\2\2\2\u026c\u026f\3\2\2\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2"+
		"\2\2\u026e_\3\2\2\2\u026f\u026d\3\2\2\2\u0270\u0271\7\n\2\2\u0271\u0272"+
		"\5^\60\2\u0272\u0273\7\13\2\2\u0273a\3\2\2\2\u0274\u0278\7\n\2\2\u0275"+
		"\u0277\5`\61\2\u0276\u0275\3\2\2\2\u0277\u027a\3\2\2\2\u0278\u0276\3\2"+
		"\2\2\u0278\u0279\3\2\2\2\u0279\u027b\3\2\2\2\u027a\u0278\3\2\2\2\u027b"+
		"\u027c\7\13\2\2\u027cc\3\2\2\2\u027d\u027e\7\n\2\2\u027e\u0281\7r\2\2"+
		"\u027f\u0280\7\r\2\2\u0280\u0282\7r\2\2\u0281\u027f\3\2\2\2\u0281\u0282"+
		"\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0284\7\13\2\2\u0284e\3\2\2\2\u0285"+
		"\u0286\t\24\2\2\u0286g\3\2\2\2\u0287\u028c\5l\67\2\u0288\u028c\7Q\2\2"+
		"\u0289\u028c\5j\66\2\u028a\u028c\5t;\2\u028b\u0287\3\2\2\2\u028b\u0288"+
		"\3\2\2\2\u028b\u0289\3\2\2\2\u028b\u028a\3\2\2\2\u028ci\3\2\2\2\u028d"+
		"\u0292\7s\2\2\u028e\u0292\5x=\2\u028f\u0292\5p9\2\u0290\u0292\5r:\2\u0291"+
		"\u028d\3\2\2\2\u0291\u028e\3\2\2\2\u0291\u028f\3\2\2\2\u0291\u0290\3\2"+
		"\2\2\u0292k\3\2\2\2\u0293\u0299\7r\2\2\u0294\u0295\5n8\2\u0295\u0296\7"+
		"r\2\2\u0296\u0297\5n8\2\u0297\u0299\3\2\2\2\u0298\u0293\3\2\2\2\u0298"+
		"\u0294\3\2\2\2\u0299m\3\2\2\2\u029a\u029b\t\25\2\2\u029bo\3\2\2\2\u029c"+
		"\u029d\5n8\2\u029d\u029e\5x=\2\u029e\u029f\5n8\2\u029fq\3\2\2\2\u02a0"+
		"\u02a1\t\26\2\2\u02a1s\3\2\2\2\u02a2\u02a3\5j\66\2\u02a3\u02a4\5> \2\u02a4"+
		"u\3\2\2\2\u02a5\u02a6\t\27\2\2\u02a6w\3\2\2\2\u02a7\u02a8\t\30\2\2\u02a8"+
		"y\3\2\2\2c|\u0080\u0086\u008c\u0092\u009d\u00a5\u00ab\u00af\u00b1\u00b5"+
		"\u00ba\u00c2\u00cc\u00d5\u00e4\u00eb\u00f1\u00f5\u00fa\u00fe\u0102\u0105"+
		"\u0108\u010d\u0113\u0117\u011b\u011f\u0129\u0130\u0138\u0141\u0143\u0149"+
		"\u014f\u0155\u0159\u0160\u0165\u0168\u016d\u0171\u0175\u0179\u017b\u017d"+
		"\u0182\u0185\u0189\u018b\u0191\u0194\u019b\u019d\u01a6\u01a9\u01ae\u01b1"+
		"\u01b4\u01b9\u01be\u01c2\u01c5\u01cb\u01cf\u01d2\u01d6\u01d9\u01dc\u01df"+
		"\u01e4\u01e9\u01ec\u01f2\u01f6\u01f9\u01fe\u0209\u020e\u0210\u021b\u0224"+
		"\u022a\u022f\u0232\u0236\u023c\u0255\u025d\u0261\u026d\u0278\u0281\u028b"+
		"\u0291\u0298";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}