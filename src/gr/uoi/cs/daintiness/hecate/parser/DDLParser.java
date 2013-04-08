// Generated from /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/daintiness/hecate/parser/DDL.g4 by ANTLR 4.0
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
		RULE_namespace = 4, RULE_commit = 5, RULE_drop_statement = 6, RULE_insert_statement = 7, 
		RULE_create_statement = 8, RULE_alter_statement = 9, RULE_update_statement = 10, 
		RULE_database = 11, RULE_create_option = 12, RULE_index = 13, RULE_index_type = 14, 
		RULE_index_option = 15, RULE_view = 16, RULE_triger = 17, RULE_pl_sql = 18, 
		RULE_consume_until_end = 19, RULE_table = 20, RULE_table_definition = 21, 
		RULE_table_option = 22, RULE_column = 23, RULE_column_option = 24, RULE_table_constraint = 25, 
		RULE_line_constraint = 26, RULE_alter_constraint = 27, RULE_constraint = 28, 
		RULE_consume_par = 29, RULE_reference_definition = 30, RULE_reference_option = 31, 
		RULE_refs = 32, RULE_data_type = 33, RULE_data_option = 34, RULE_schema_name = 35, 
		RULE_table_name = 36, RULE_col_name = 37, RULE_index_name = 38, RULE_charset_name = 39, 
		RULE_collation_name = 40, RULE_constr_name = 41, RULE_triger_name = 42, 
		RULE_nameList = 43, RULE_parNameList = 44, RULE_valueList = 45, RULE_parValueList = 46, 
		RULE_valuesList = 47, RULE_size = 48, RULE_order = 49, RULE_value = 50, 
		RULE_ident = 51, RULE_number = 52, RULE_quote = 53, RULE_quoted_rest = 54, 
		RULE_string = 55, RULE_function = 56, RULE_special_char = 57, RULE_restricted = 58;
	public static final String[] ruleNames = {
		"start", "sql_statement", "ddl_statement", "other_statement", "namespace", 
		"commit", "drop_statement", "insert_statement", "create_statement", "alter_statement", 
		"update_statement", "database", "create_option", "index", "index_type", 
		"index_option", "view", "triger", "pl_sql", "consume_until_end", "table", 
		"table_definition", "table_option", "column", "column_option", "table_constraint", 
		"line_constraint", "alter_constraint", "constraint", "consume_par", "reference_definition", 
		"reference_option", "refs", "data_type", "data_option", "schema_name", 
		"table_name", "col_name", "index_name", "charset_name", "collation_name", 
		"constr_name", "triger_name", "nameList", "parNameList", "valueList", 
		"parValueList", "valuesList", "size", "order", "value", "ident", "number", 
		"quote", "quoted_rest", "string", "function", "special_char", "restricted"
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
			setState(122); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(118); sql_statement();
				setState(120);
				_la = _input.LA(1);
				if (_la==SQ) {
					{
					setState(119); match(SQ);
					}
				}

				}
				}
				setState(124); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALTER) | (1L << COMMIT) | (1L << CREATE) | (1L << DROP))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (INSERT - 70)) | (1L << (UPDATE - 70)) | (1L << (USE - 70)))) != 0) );
			setState(126); match(EOF);
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
			setState(130);
			switch (_input.LA(1)) {
			case ALTER:
			case CREATE:
			case DROP:
			case UPDATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(128); ddl_statement();
				}
				break;
			case COMMIT:
			case INSERT:
			case USE:
				enterOuterAlt(_localctx, 2);
				{
				setState(129); other_statement();
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
			setState(136);
			switch (_input.LA(1)) {
			case DROP:
				enterOuterAlt(_localctx, 1);
				{
				setState(132); drop_statement();
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(133); create_statement();
				}
				break;
			case ALTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(134); alter_statement();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(135); update_statement();
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
			setState(141);
			switch (_input.LA(1)) {
			case INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(138); insert_statement();
				}
				break;
			case USE:
				enterOuterAlt(_localctx, 2);
				{
				setState(139); namespace();
				}
				break;
			case COMMIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(140); commit();
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
			setState(143); match(USE);
			setState(144); ident();
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
			setState(146); match(COMMIT);
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
		enterRule(_localctx, 12, RULE_drop_statement);
		int _la;
		try {
			setState(166);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148); match(DROP);
				setState(149);
				_la = _input.LA(1);
				if ( !(_la==DATABASE || _la==TABLE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(150); match(IF);
				setState(151); match(EXISTS);
				setState(152); nameList();
				setState(154);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(153); match(PURGE);
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156); match(DROP);
				setState(157);
				_la = _input.LA(1);
				if ( !(_la==DATABASE || _la==TABLE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(158); nameList();
				setState(160);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(159); match(PURGE);
					}
				}

				setState(164);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(162); match(IF);
					setState(163); match(EXISTS);
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
		enterRule(_localctx, 14, RULE_insert_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); match(INSERT);
			setState(170);
			_la = _input.LA(1);
			if (_la==IGNORE) {
				{
				setState(169); match(IGNORE);
				}
			}

			setState(172); match(INTO);
			setState(173); table_name();
			setState(175);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(174); parNameList();
				}
			}

			setState(177); match(VALUES);
			setState(178); parValueList();
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CO) {
				{
				{
				setState(179); match(CO);
				setState(180); parValueList();
				}
				}
				setState(185);
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
		enterRule(_localctx, 16, RULE_create_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186); match(CREATE);
			setState(193);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(187); database();
				}
				break;

			case 2:
				{
				setState(188); table();
				}
				break;

			case 3:
				{
				setState(189); index();
				}
				break;

			case 4:
				{
				setState(190); view();
				}
				break;

			case 5:
				{
				setState(191); triger();
				}
				break;

			case 6:
				{
				setState(192); pl_sql();
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
		enterRule(_localctx, 18, RULE_alter_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195); match(ALTER);
			setState(196); match(TABLE);
			setState(197); table_name();
			setState(200); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(198); match(ADD);
				setState(199); alter_constraint();
				}
				}
				setState(202); 
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
		enterRule(_localctx, 20, RULE_update_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); match(UPDATE);
			setState(205); table_name();
			setState(206); match(SET);
			setState(207); col_name();
			setState(208); match(EQ);
			setState(209); value();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CO) {
				{
				{
				setState(210); match(CO);
				setState(211); col_name();
				setState(212); match(EQ);
				setState(213); value();
				}
				}
				setState(219);
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
		enterRule(_localctx, 22, RULE_database);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(224);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(221); match(IF);
				setState(222); match(NOT);
				setState(223); match(EXISTS);
				}
				break;
			}
			setState(226); schema_name();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHARACTER) | (1L << COLLATE) | (1L << DEFAULT))) != 0)) {
				{
				{
				setState(227); create_option();
				}
				}
				setState(232);
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
		enterRule(_localctx, 24, RULE_create_option);
		int _la;
		try {
			setState(250);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new Char_setContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(233); match(DEFAULT);
					}
				}

				setState(236); match(CHARACTER);
				setState(237); match(SET);
				setState(239);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(238); match(EQ);
					}
				}

				setState(241); charset_name();
				}
				break;

			case 2:
				_localctx = new CollateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(242); match(DEFAULT);
					}
				}

				setState(245); match(COLLATE);
				setState(247);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(246); match(EQ);
					}
				}

				setState(249); collation_name();
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
		enterRule(_localctx, 26, RULE_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(253);
			_la = _input.LA(1);
			if (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FULLTEXT - 64)) | (1L << (SPATIAL - 64)) | (1L << (UNIQUE - 64)))) != 0)) {
				{
				setState(252);
				_la = _input.LA(1);
				if ( !(((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FULLTEXT - 64)) | (1L << (SPATIAL - 64)) | (1L << (UNIQUE - 64)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			}
			setState(255); match(INDEX);
			setState(256); index_name();
			setState(258);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(257); index_type();
				}
			}

			setState(260); match(ON);
			setState(261); table_name();
			setState(262); parNameList();
			setState(264);
			_la = _input.LA(1);
			if (_la==KEY_BSIZE || _la==USING) {
				{
				setState(263); index_option();
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
		enterRule(_localctx, 28, RULE_index_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266); match(USING);
			setState(268);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(267);
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
		enterRule(_localctx, 30, RULE_index_option);
		int _la;
		try {
			setState(276);
			switch (_input.LA(1)) {
			case KEY_BSIZE:
				enterOuterAlt(_localctx, 1);
				{
				setState(270); match(KEY_BSIZE);
				setState(272);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(271); match(EQ);
					}
				}

				setState(274); value();
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(275); index_type();
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
		enterRule(_localctx, 32, RULE_view);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278); match(VIEW);
			setState(279); ident();
			setState(280); parNameList();
			setState(281); match(AS);
			setState(282); match(LP);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_G) | (1L << STRING_Q) | (1L << STRING_D) | (1L << WS) | (1L << COMMENT) | (1L << LINE_COMMENT) | (1L << EQ) | (1L << LP) | (1L << SQ) | (1L << CO) | (1L << QO) | (1L << US) | (1L << AT) | (1L << DA) | (1L << HA) | (1L << SL) | (1L << ST) | (1L << DQ) | (1L << GR) | (1L << CL) | (1L << DO) | (1L << SP) | (1L << CA) | (1L << VB) | (1L << PL) | (1L << CONFLICT_START) | (1L << CONFLICT_END) | (1L << CONFLICT) | (1L << ACTION) | (1L << ADD) | (1L << ALTER) | (1L << AS) | (1L << ASC) | (1L << AUTO_INC) | (1L << BIGINT) | (1L << BINARY) | (1L << BIT) | (1L << BTREE) | (1L << CASCADE) | (1L << CHARACTER) | (1L << CHAR) | (1L << CHECK) | (1L << COLLATE) | (1L << COL_FORMAT) | (1L << COMMIT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << DATABASE) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DEFERRABLE) | (1L << DELETE) | (1L << DESC) | (1L << DISK) | (1L << DOUBLE) | (1L << DROP) | (1L << DYNAMIC) | (1L << END) | (1L << ENUM) | (1L << EXISTS) | (1L << FIXED) | (1L << FOREIGN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FULLTEXT - 64)) | (1L << (FUNCTION - 64)) | (1L << (HASH - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INDEX - 64)) | (1L << (INSERT - 64)) | (1L << (INTEGER - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (KEY - 64)) | (1L << (KEY_BSIZE - 64)) | (1L << (MEMORY - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NUMERIC - 64)) | (1L << (ON - 64)) | (1L << (OR - 64)) | (1L << (PRECISION - 64)) | (1L << (PROCEDURE - 64)) | (1L << (PRIMARY - 64)) | (1L << (PURGE - 64)) | (1L << (REAL - 64)) | (1L << (REFERENCES - 64)) | (1L << (REPLACE - 64)) | (1L << (RESTRICT - 64)) | (1L << (SCHEMA - 64)) | (1L << (SET - 64)) | (1L << (SIGNED - 64)) | (1L << (SMALLINT - 64)) | (1L << (SPATIAL - 64)) | (1L << (STORAGE - 64)) | (1L << (TABLE - 64)) | (1L << (TEMPORARY - 64)) | (1L << (TRIGGER - 64)) | (1L << (UNIQUE - 64)) | (1L << (UNSIGNED - 64)) | (1L << (UPDATE - 64)) | (1L << (USE - 64)) | (1L << (USING - 64)) | (1L << (VALUES - 64)) | (1L << (VARBINARY - 64)) | (1L << (VARCHAR - 64)) | (1L << (VIEW - 64)) | (1L << (WHERE - 64)) | (1L << (YEAR - 64)) | (1L << (ZEROFILL - 64)) | (1L << (INT - 64)) | (1L << (ID - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				{
				setState(283);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==RP) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289); match(RP);
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
		enterRule(_localctx, 34, RULE_triger);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(291); match(OR);
				setState(292); match(REPLACE);
				}
			}

			setState(295); match(TRIGGER);
			setState(296); triger_name();
			setState(297); consume_until_end();
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
		enterRule(_localctx, 36, RULE_pl_sql);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(299); match(OR);
				setState(300); match(REPLACE);
				}
			}

			setState(303);
			_la = _input.LA(1);
			if ( !(_la==FUNCTION || _la==PROCEDURE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(304); ident();
			setState(305); consume_until_end();
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
		enterRule(_localctx, 38, RULE_consume_until_end);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(310);
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
						setState(307);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==END) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					case END:
						{
						setState(308); match(END);
						setState(309);
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
				setState(314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(315); match(END);
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
		public TerminalNode TEMPORARY() { return getToken(DDLParser.TEMPORARY, 0); }
		public Table_optionContext table_option(int i) {
			return getRuleContext(Table_optionContext.class,i);
		}
		public List<TerminalNode> CO() { return getTokens(DDLParser.CO); }
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
		enterRule(_localctx, 40, RULE_table);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(317); match(TEMPORARY);
				}
			}

			setState(320); match(TABLE);
			setState(324);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(321); match(IF);
				setState(322); match(NOT);
				setState(323); match(EXISTS);
				}
				break;
			}
			setState(326); table_name();
			setState(327); match(LP);
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_G) | (1L << STRING_Q) | (1L << STRING_D) | (1L << QO) | (1L << DQ) | (1L << GR) | (1L << ACTION) | (1L << ADD) | (1L << ALTER) | (1L << ASC) | (1L << AUTO_INC) | (1L << BIGINT) | (1L << BINARY) | (1L << BIT) | (1L << BTREE) | (1L << CASCADE) | (1L << CHARACTER) | (1L << CHAR) | (1L << CHECK) | (1L << COLLATE) | (1L << COL_FORMAT) | (1L << COMMIT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << DATABASE) | (1L << DECIMAL) | (1L << DELETE) | (1L << DESC) | (1L << DISK) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << END) | (1L << ENUM) | (1L << EXISTS) | (1L << FIXED) | (1L << FOREIGN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FULLTEXT - 64)) | (1L << (FUNCTION - 64)) | (1L << (HASH - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INDEX - 64)) | (1L << (INSERT - 64)) | (1L << (INTEGER - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (KEY - 64)) | (1L << (NUMERIC - 64)) | (1L << (PRIMARY - 64)) | (1L << (REAL - 64)) | (1L << (REFERENCES - 64)) | (1L << (REPLACE - 64)) | (1L << (RESTRICT - 64)) | (1L << (SCHEMA - 64)) | (1L << (SET - 64)) | (1L << (SMALLINT - 64)) | (1L << (SPATIAL - 64)) | (1L << (STORAGE - 64)) | (1L << (TABLE - 64)) | (1L << (TEMPORARY - 64)) | (1L << (UNIQUE - 64)) | (1L << (UNSIGNED - 64)) | (1L << (UPDATE - 64)) | (1L << (USE - 64)) | (1L << (USING - 64)) | (1L << (VALUES - 64)) | (1L << (VARBINARY - 64)) | (1L << (VARCHAR - 64)) | (1L << (YEAR - 64)) | (1L << (ZEROFILL - 64)) | (1L << (ID - 64)))) != 0)) {
				{
				{
				setState(328); table_definition();
				setState(330);
				_la = _input.LA(1);
				if (_la==SQ || _la==CO) {
					{
					setState(329);
					_la = _input.LA(1);
					if ( !(_la==SQ || _la==CO) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				}
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(337); match(RP);
			setState(341);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(338); table_option();
					}
					} 
				}
				setState(343);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
		enterRule(_localctx, 42, RULE_table_definition);
		try {
			setState(346);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(344); column();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(345); table_constraint();
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
		enterRule(_localctx, 44, RULE_table_option);
		int _la;
		try {
			setState(370);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(348); match(DEFAULT);
					}
				}

				setState(351); match(CHARACTER);
				setState(352); match(SET);
				setState(354);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(353); match(EQ);
					}
				}

				setState(356); ident();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(357); match(DEFAULT);
					}
				}

				setState(360); ident();
				setState(368);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(362);
					_la = _input.LA(1);
					if (_la==EQ) {
						{
						setState(361); match(EQ);
						}
					}

					setState(366);
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
						setState(364); ident();
						}
						break;
					case INT:
						{
						setState(365); match(INT);
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
		enterRule(_localctx, 46, RULE_column);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(372); col_name();
			setState(373); data_type();
			setState(375);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(374); data_option();
				}
				break;
			}
			setState(378);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(377); create_option();
				}
				break;
			}
			setState(384);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(382);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						setState(380); column_option();
						}
						break;

					case 2:
						{
						setState(381); line_constraint();
						}
						break;
					}
					} 
				}
				setState(386);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			setState(390);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(387); match(ON);
				setState(388); match(UPDATE);
				setState(389); ident();
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
		enterRule(_localctx, 48, RULE_column_option);
		int _la;
		try {
			setState(402);
			switch (_input.LA(1)) {
			case NOT:
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(392); match(NOT);
					}
				}

				setState(395); match(NULL);
				}
				break;
			case AUTO_INC:
				enterOuterAlt(_localctx, 2);
				{
				setState(396); match(AUTO_INC);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(397); match(DEFAULT);
				setState(400);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(398); value();
					}
					break;

				case 2:
					{
					setState(399); match(NULL);
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
		enterRule(_localctx, 50, RULE_table_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404); constraint();
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
		enterRule(_localctx, 52, RULE_line_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406); constraint();
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
		enterRule(_localctx, 54, RULE_alter_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408); constraint();
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
		enterRule(_localctx, 56, RULE_constraint);
		int _la;
		try {
			int _alt;
			setState(510);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				_localctx = new PrimaryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(410); match(CONSTRAINT);
					}
				}

				setState(414);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_G) | (1L << STRING_Q) | (1L << STRING_D) | (1L << QO) | (1L << DQ) | (1L << GR) | (1L << ACTION) | (1L << ADD) | (1L << ALTER) | (1L << ASC) | (1L << AUTO_INC) | (1L << BIGINT) | (1L << BINARY) | (1L << BIT) | (1L << BTREE) | (1L << CASCADE) | (1L << CHARACTER) | (1L << CHAR) | (1L << CHECK) | (1L << COLLATE) | (1L << COL_FORMAT) | (1L << COMMIT) | (1L << CREATE) | (1L << DATABASE) | (1L << DECIMAL) | (1L << DELETE) | (1L << DESC) | (1L << DISK) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << END) | (1L << ENUM) | (1L << EXISTS) | (1L << FIXED) | (1L << FOREIGN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FULLTEXT - 64)) | (1L << (FUNCTION - 64)) | (1L << (HASH - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INSERT - 64)) | (1L << (INTEGER - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (NUMERIC - 64)) | (1L << (REAL - 64)) | (1L << (REFERENCES - 64)) | (1L << (REPLACE - 64)) | (1L << (RESTRICT - 64)) | (1L << (SCHEMA - 64)) | (1L << (SET - 64)) | (1L << (SMALLINT - 64)) | (1L << (SPATIAL - 64)) | (1L << (STORAGE - 64)) | (1L << (TABLE - 64)) | (1L << (TEMPORARY - 64)) | (1L << (UNSIGNED - 64)) | (1L << (UPDATE - 64)) | (1L << (USE - 64)) | (1L << (USING - 64)) | (1L << (VALUES - 64)) | (1L << (VARBINARY - 64)) | (1L << (VARCHAR - 64)) | (1L << (YEAR - 64)) | (1L << (ZEROFILL - 64)) | (1L << (ID - 64)))) != 0)) {
					{
					setState(413); constr_name();
					}
				}

				setState(416); match(PRIMARY);
				setState(417); match(KEY);
				setState(419);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(418); constr_name();
					}
					break;
				}
				setState(422);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(421); index_type();
					}
					break;
				}
				setState(425);
				_la = _input.LA(1);
				if (_la==LP) {
					{
					setState(424); parNameList();
					}
				}

				setState(430);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(427); index_option();
						}
						} 
					}
					setState(432);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				}
				break;

			case 2:
				_localctx = new Index_keyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				_la = _input.LA(1);
				if ( !(_la==INDEX || _la==KEY) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(435);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(434); index_name();
					}
					break;
				}
				setState(439);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(437); match(ON);
					setState(438); col_name();
					}
				}

				setState(442);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(441); index_type();
					}
				}

				setState(444); parNameList();
				setState(448);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(445); index_option();
						}
						} 
					}
					setState(450);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				}
				}
				break;

			case 3:
				_localctx = new UniqueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(452);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(451); match(CONSTRAINT);
					}
				}

				setState(455);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_G) | (1L << STRING_Q) | (1L << STRING_D) | (1L << QO) | (1L << DQ) | (1L << GR) | (1L << ACTION) | (1L << ADD) | (1L << ALTER) | (1L << ASC) | (1L << AUTO_INC) | (1L << BIGINT) | (1L << BINARY) | (1L << BIT) | (1L << BTREE) | (1L << CASCADE) | (1L << CHARACTER) | (1L << CHAR) | (1L << CHECK) | (1L << COLLATE) | (1L << COL_FORMAT) | (1L << COMMIT) | (1L << CREATE) | (1L << DATABASE) | (1L << DECIMAL) | (1L << DELETE) | (1L << DESC) | (1L << DISK) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << END) | (1L << ENUM) | (1L << EXISTS) | (1L << FIXED) | (1L << FOREIGN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FULLTEXT - 64)) | (1L << (FUNCTION - 64)) | (1L << (HASH - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INSERT - 64)) | (1L << (INTEGER - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (NUMERIC - 64)) | (1L << (REAL - 64)) | (1L << (REFERENCES - 64)) | (1L << (REPLACE - 64)) | (1L << (RESTRICT - 64)) | (1L << (SCHEMA - 64)) | (1L << (SET - 64)) | (1L << (SMALLINT - 64)) | (1L << (SPATIAL - 64)) | (1L << (STORAGE - 64)) | (1L << (TABLE - 64)) | (1L << (TEMPORARY - 64)) | (1L << (UNSIGNED - 64)) | (1L << (UPDATE - 64)) | (1L << (USE - 64)) | (1L << (USING - 64)) | (1L << (VALUES - 64)) | (1L << (VARBINARY - 64)) | (1L << (VARCHAR - 64)) | (1L << (YEAR - 64)) | (1L << (ZEROFILL - 64)) | (1L << (ID - 64)))) != 0)) {
					{
					setState(454); constr_name();
					}
				}

				setState(457); match(UNIQUE);
				setState(459);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(458);
					_la = _input.LA(1);
					if ( !(_la==INDEX || _la==KEY) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				}
				setState(462);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(461); index_name();
					}
					break;
				}
				setState(465);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(464); index_type();
					}
					break;
				}
				setState(468);
				_la = _input.LA(1);
				if (_la==LP) {
					{
					setState(467); parNameList();
					}
				}

				setState(473);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(470); index_option();
						}
						} 
					}
					setState(475);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				}
				break;

			case 4:
				_localctx = new FulltextContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(476);
				_la = _input.LA(1);
				if ( !(_la==FULLTEXT || _la==SPATIAL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(478);
				_la = _input.LA(1);
				if (_la==INDEX || _la==KEY) {
					{
					setState(477);
					_la = _input.LA(1);
					if ( !(_la==INDEX || _la==KEY) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(481);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_G) | (1L << STRING_Q) | (1L << STRING_D) | (1L << QO) | (1L << DQ) | (1L << GR) | (1L << ACTION) | (1L << ADD) | (1L << ALTER) | (1L << ASC) | (1L << AUTO_INC) | (1L << BIGINT) | (1L << BINARY) | (1L << BIT) | (1L << BTREE) | (1L << CASCADE) | (1L << CHARACTER) | (1L << CHAR) | (1L << CHECK) | (1L << COLLATE) | (1L << COL_FORMAT) | (1L << COMMIT) | (1L << CREATE) | (1L << DATABASE) | (1L << DECIMAL) | (1L << DELETE) | (1L << DESC) | (1L << DISK) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << END) | (1L << ENUM) | (1L << EXISTS) | (1L << FIXED) | (1L << FOREIGN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FULLTEXT - 64)) | (1L << (FUNCTION - 64)) | (1L << (HASH - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INSERT - 64)) | (1L << (INTEGER - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (NUMERIC - 64)) | (1L << (REAL - 64)) | (1L << (REFERENCES - 64)) | (1L << (REPLACE - 64)) | (1L << (RESTRICT - 64)) | (1L << (SCHEMA - 64)) | (1L << (SET - 64)) | (1L << (SMALLINT - 64)) | (1L << (SPATIAL - 64)) | (1L << (STORAGE - 64)) | (1L << (TABLE - 64)) | (1L << (TEMPORARY - 64)) | (1L << (UNSIGNED - 64)) | (1L << (UPDATE - 64)) | (1L << (USE - 64)) | (1L << (USING - 64)) | (1L << (VALUES - 64)) | (1L << (VARBINARY - 64)) | (1L << (VARCHAR - 64)) | (1L << (YEAR - 64)) | (1L << (ZEROFILL - 64)) | (1L << (ID - 64)))) != 0)) {
					{
					setState(480); index_name();
					}
				}

				setState(483); parNameList();
				setState(487);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(484); index_option();
						}
						} 
					}
					setState(489);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				}
				}
				break;

			case 5:
				_localctx = new ForeignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(491);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(490); match(CONSTRAINT);
					}
				}

				setState(494);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(493); constr_name();
					}
					break;
				}
				setState(496); match(FOREIGN);
				setState(497); match(KEY);
				setState(499);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_G) | (1L << STRING_Q) | (1L << STRING_D) | (1L << QO) | (1L << DQ) | (1L << GR) | (1L << ACTION) | (1L << ADD) | (1L << ALTER) | (1L << ASC) | (1L << AUTO_INC) | (1L << BIGINT) | (1L << BINARY) | (1L << BIT) | (1L << BTREE) | (1L << CASCADE) | (1L << CHARACTER) | (1L << CHAR) | (1L << CHECK) | (1L << COLLATE) | (1L << COL_FORMAT) | (1L << COMMIT) | (1L << CREATE) | (1L << DATABASE) | (1L << DECIMAL) | (1L << DELETE) | (1L << DESC) | (1L << DISK) | (1L << DOUBLE) | (1L << DYNAMIC) | (1L << END) | (1L << ENUM) | (1L << EXISTS) | (1L << FIXED) | (1L << FOREIGN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FULLTEXT - 64)) | (1L << (FUNCTION - 64)) | (1L << (HASH - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INSERT - 64)) | (1L << (INTEGER - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (NUMERIC - 64)) | (1L << (REAL - 64)) | (1L << (REFERENCES - 64)) | (1L << (REPLACE - 64)) | (1L << (RESTRICT - 64)) | (1L << (SCHEMA - 64)) | (1L << (SET - 64)) | (1L << (SMALLINT - 64)) | (1L << (SPATIAL - 64)) | (1L << (STORAGE - 64)) | (1L << (TABLE - 64)) | (1L << (TEMPORARY - 64)) | (1L << (UNSIGNED - 64)) | (1L << (UPDATE - 64)) | (1L << (USE - 64)) | (1L << (USING - 64)) | (1L << (VALUES - 64)) | (1L << (VARBINARY - 64)) | (1L << (VARCHAR - 64)) | (1L << (YEAR - 64)) | (1L << (ZEROFILL - 64)) | (1L << (ID - 64)))) != 0)) {
					{
					setState(498); index_name();
					}
				}

				setState(501); parNameList();
				setState(502); reference_definition();
				}
				break;

			case 6:
				_localctx = new CheckContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(504); match(CONSTRAINT);
				setState(505); constr_name();
				setState(506); match(CHECK);
				setState(507); consume_par();
				}
				break;

			case 7:
				_localctx = new ReferenceContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(509); reference_definition();
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
		enterRule(_localctx, 58, RULE_consume_par);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512); match(LP);
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_G) | (1L << STRING_Q) | (1L << STRING_D) | (1L << WS) | (1L << COMMENT) | (1L << LINE_COMMENT) | (1L << EQ) | (1L << LP) | (1L << SQ) | (1L << CO) | (1L << QO) | (1L << US) | (1L << AT) | (1L << DA) | (1L << HA) | (1L << SL) | (1L << ST) | (1L << DQ) | (1L << GR) | (1L << CL) | (1L << DO) | (1L << SP) | (1L << CA) | (1L << VB) | (1L << PL) | (1L << CONFLICT_START) | (1L << CONFLICT_END) | (1L << CONFLICT) | (1L << ACTION) | (1L << ADD) | (1L << ALTER) | (1L << AS) | (1L << ASC) | (1L << AUTO_INC) | (1L << BIGINT) | (1L << BINARY) | (1L << BIT) | (1L << BTREE) | (1L << CASCADE) | (1L << CHARACTER) | (1L << CHAR) | (1L << CHECK) | (1L << COLLATE) | (1L << COL_FORMAT) | (1L << COMMIT) | (1L << CONSTRAINT) | (1L << CREATE) | (1L << DATABASE) | (1L << DECIMAL) | (1L << DEFAULT) | (1L << DEFERRABLE) | (1L << DELETE) | (1L << DESC) | (1L << DISK) | (1L << DOUBLE) | (1L << DROP) | (1L << DYNAMIC) | (1L << END) | (1L << ENUM) | (1L << EXISTS) | (1L << FIXED) | (1L << FOREIGN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (FULLTEXT - 64)) | (1L << (FUNCTION - 64)) | (1L << (HASH - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INDEX - 64)) | (1L << (INSERT - 64)) | (1L << (INTEGER - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (KEY - 64)) | (1L << (KEY_BSIZE - 64)) | (1L << (MEMORY - 64)) | (1L << (NO - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NUMERIC - 64)) | (1L << (ON - 64)) | (1L << (OR - 64)) | (1L << (PRECISION - 64)) | (1L << (PROCEDURE - 64)) | (1L << (PRIMARY - 64)) | (1L << (PURGE - 64)) | (1L << (REAL - 64)) | (1L << (REFERENCES - 64)) | (1L << (REPLACE - 64)) | (1L << (RESTRICT - 64)) | (1L << (SCHEMA - 64)) | (1L << (SET - 64)) | (1L << (SIGNED - 64)) | (1L << (SMALLINT - 64)) | (1L << (SPATIAL - 64)) | (1L << (STORAGE - 64)) | (1L << (TABLE - 64)) | (1L << (TEMPORARY - 64)) | (1L << (TRIGGER - 64)) | (1L << (UNIQUE - 64)) | (1L << (UNSIGNED - 64)) | (1L << (UPDATE - 64)) | (1L << (USE - 64)) | (1L << (USING - 64)) | (1L << (VALUES - 64)) | (1L << (VARBINARY - 64)) | (1L << (VARCHAR - 64)) | (1L << (VIEW - 64)) | (1L << (WHERE - 64)) | (1L << (YEAR - 64)) | (1L << (ZEROFILL - 64)) | (1L << (INT - 64)) | (1L << (ID - 64)) | (1L << (OTHER - 64)))) != 0)) {
				{
				setState(515);
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
					setState(513);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==LP || _la==RP) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				case LP:
					{
					setState(514); consume_par();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(520); match(RP);
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
		enterRule(_localctx, 60, RULE_reference_definition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(522); match(REFERENCES);
			setState(523); table_name();
			setState(524); parNameList();
			setState(528);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(525); reference_option();
					}
					} 
				}
				setState(530);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
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
		enterRule(_localctx, 62, RULE_reference_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531); match(ON);
			setState(532);
			_la = _input.LA(1);
			if ( !(_la==DELETE || _la==UPDATE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(533); refs();
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
		enterRule(_localctx, 64, RULE_refs);
		int _la;
		try {
			setState(543);
			switch (_input.LA(1)) {
			case CASCADE:
			case RESTRICT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(535);
				_la = _input.LA(1);
				if ( !(_la==CASCADE || _la==RESTRICT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(537);
				_la = _input.LA(1);
				if (_la==DEFERRABLE) {
					{
					setState(536); match(DEFERRABLE);
					}
				}

				}
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(539); match(SET);
				setState(540); match(NULL);
				}
				}
				break;
			case NO:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(541); match(NO);
				setState(542); match(ACTION);
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
	public static class SetContext extends Data_typeContext {
		public ParValueListContext parValueList() {
			return getRuleContext(ParValueListContext.class,0);
		}
		public TerminalNode SET() { return getToken(DDLParser.SET, 0); }
		public SetContext(Data_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DDLListener ) ((DDLListener)listener).exitSet(this);
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
		enterRule(_localctx, 66, RULE_data_type);
		int _la;
		try {
			int _alt;
			setState(561);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				_localctx = new GenericContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(546); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(545); ident();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(548); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				setState(551);
				_la = _input.LA(1);
				if (_la==LP) {
					{
					setState(550); size();
					}
				}

				setState(555);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(553); match(ENUM);
					setState(554); parValueList();
					}
					break;
				}
				}
				break;

			case 2:
				_localctx = new EnumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(557); match(ENUM);
				setState(558); parValueList();
				}
				break;

			case 3:
				_localctx = new SetContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(559); match(SET);
				setState(560); parValueList();
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
		enterRule(_localctx, 68, RULE_data_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
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
		enterRule(_localctx, 70, RULE_schema_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565); ident();
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
		enterRule(_localctx, 72, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567); ident();
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
		enterRule(_localctx, 74, RULE_col_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569); ident();
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
		enterRule(_localctx, 76, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571); ident();
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
		enterRule(_localctx, 78, RULE_charset_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573); ident();
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
		enterRule(_localctx, 80, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575); ident();
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
		enterRule(_localctx, 82, RULE_constr_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577); ident();
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
		enterRule(_localctx, 84, RULE_triger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579); ident();
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
		enterRule(_localctx, 86, RULE_nameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581); ident();
			setState(586);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(582); match(LP);
				setState(583); value();
				setState(584); match(RP);
				}
			}

			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CO) {
				{
				{
				setState(588); match(CO);
				setState(589); ident();
				setState(594);
				_la = _input.LA(1);
				if (_la==LP) {
					{
					setState(590); match(LP);
					setState(591); value();
					setState(592); match(RP);
					}
				}

				}
				}
				setState(600);
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
		enterRule(_localctx, 88, RULE_parNameList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601); match(LP);
			setState(602); nameList();
			setState(603); match(RP);
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
		enterRule(_localctx, 90, RULE_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605); value();
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CO) {
				{
				{
				setState(606); match(CO);
				setState(607); value();
				}
				}
				setState(612);
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
		enterRule(_localctx, 92, RULE_parValueList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613); match(LP);
			setState(614); valueList();
			setState(615); match(RP);
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
		enterRule(_localctx, 94, RULE_valuesList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617); match(LP);
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LP) {
				{
				{
				setState(618); parValueList();
				}
				}
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		enterRule(_localctx, 96, RULE_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626); match(LP);
			setState(627); match(INT);
			setState(630);
			_la = _input.LA(1);
			if (_la==CO) {
				{
				setState(628); match(CO);
				setState(629); match(INT);
				}
			}

			setState(632); match(RP);
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
		enterRule(_localctx, 98, RULE_order);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
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
		enterRule(_localctx, 100, RULE_value);
		try {
			setState(640);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(636); number();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(637); match(NULL);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(638); ident();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(639); function();
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
		enterRule(_localctx, 102, RULE_ident);
		try {
			setState(646);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(642); match(ID);
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
				setState(643); restricted();
				}
				break;
			case QO:
			case DQ:
			case GR:
				enterOuterAlt(_localctx, 3);
				{
				setState(644); quoted_rest();
				}
				break;
			case STRING_G:
			case STRING_Q:
			case STRING_D:
				enterOuterAlt(_localctx, 4);
				{
				setState(645); string();
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
		enterRule(_localctx, 104, RULE_number);
		try {
			setState(653);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(648); match(INT);
				}
				break;
			case QO:
			case DQ:
			case GR:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(649); quote();
				setState(650); match(INT);
				setState(651); quote();
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
		enterRule(_localctx, 106, RULE_quote);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
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
		enterRule(_localctx, 108, RULE_quoted_rest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657); quote();
			setState(658); restricted();
			setState(659); quote();
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
		enterRule(_localctx, 110, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
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
		enterRule(_localctx, 112, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663); ident();
			setState(664); consume_par();
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
		enterRule(_localctx, 114, RULE_special_char);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
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
		public TerminalNode ADD() { return getToken(DDLParser.ADD, 0); }
		public TerminalNode COLLATE() { return getToken(DDLParser.COLLATE, 0); }
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
		enterRule(_localctx, 116, RULE_restricted);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
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
		"\2\3t\u02a1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4"+
		")\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62"+
		"\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4"+
		";\t;\4<\t<\3\2\3\2\5\2{\n\2\6\2}\n\2\r\2\16\2~\3\2\3\2\3\3\3\3\5\3\u0085"+
		"\n\3\3\4\3\4\3\4\3\4\5\4\u008b\n\4\3\5\3\5\3\5\5\5\u0090\n\5\3\6\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u009d\n\b\3\b\3\b\3\b\3\b\5\b\u00a3"+
		"\n\b\3\b\3\b\5\b\u00a7\n\b\5\b\u00a9\n\b\3\t\3\t\5\t\u00ad\n\t\3\t\3\t"+
		"\3\t\5\t\u00b2\n\t\3\t\3\t\3\t\3\t\7\t\u00b8\n\t\f\t\16\t\u00bb\13\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c4\n\n\3\13\3\13\3\13\3\13\3\13\6\13"+
		"\u00cb\n\13\r\13\16\13\u00cc\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\7\f\u00da\n\f\f\f\16\f\u00dd\13\f\3\r\3\r\3\r\3\r\5\r\u00e3\n\r\3\r"+
		"\3\r\7\r\u00e7\n\r\f\r\16\r\u00ea\13\r\3\16\5\16\u00ed\n\16\3\16\3\16"+
		"\3\16\5\16\u00f2\n\16\3\16\3\16\5\16\u00f6\n\16\3\16\3\16\5\16\u00fa\n"+
		"\16\3\16\5\16\u00fd\n\16\3\17\5\17\u0100\n\17\3\17\3\17\3\17\5\17\u0105"+
		"\n\17\3\17\3\17\3\17\3\17\5\17\u010b\n\17\3\20\3\20\5\20\u010f\n\20\3"+
		"\21\3\21\5\21\u0113\n\21\3\21\3\21\5\21\u0117\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u011f\n\22\f\22\16\22\u0122\13\22\3\22\3\22\3\23\3\23"+
		"\5\23\u0128\n\23\3\23\3\23\3\23\3\23\3\24\3\24\5\24\u0130\n\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\7\25\u0139\n\25\f\25\16\25\u013c\13\25\3"+
		"\25\3\25\3\26\5\26\u0141\n\26\3\26\3\26\3\26\3\26\5\26\u0147\n\26\3\26"+
		"\3\26\3\26\3\26\5\26\u014d\n\26\7\26\u014f\n\26\f\26\16\26\u0152\13\26"+
		"\3\26\3\26\7\26\u0156\n\26\f\26\16\26\u0159\13\26\3\27\3\27\5\27\u015d"+
		"\n\27\3\30\5\30\u0160\n\30\3\30\3\30\3\30\5\30\u0165\n\30\3\30\3\30\5"+
		"\30\u0169\n\30\3\30\3\30\5\30\u016d\n\30\3\30\3\30\5\30\u0171\n\30\5\30"+
		"\u0173\n\30\5\30\u0175\n\30\3\31\3\31\3\31\5\31\u017a\n\31\3\31\5\31\u017d"+
		"\n\31\3\31\3\31\7\31\u0181\n\31\f\31\16\31\u0184\13\31\3\31\3\31\3\31"+
		"\5\31\u0189\n\31\3\32\5\32\u018c\n\32\3\32\3\32\3\32\3\32\3\32\5\32\u0193"+
		"\n\32\5\32\u0195\n\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\5\36\u019e\n"+
		"\36\3\36\5\36\u01a1\n\36\3\36\3\36\3\36\5\36\u01a6\n\36\3\36\5\36\u01a9"+
		"\n\36\3\36\5\36\u01ac\n\36\3\36\7\36\u01af\n\36\f\36\16\36\u01b2\13\36"+
		"\3\36\3\36\5\36\u01b6\n\36\3\36\3\36\5\36\u01ba\n\36\3\36\5\36\u01bd\n"+
		"\36\3\36\3\36\7\36\u01c1\n\36\f\36\16\36\u01c4\13\36\3\36\5\36\u01c7\n"+
		"\36\3\36\5\36\u01ca\n\36\3\36\3\36\5\36\u01ce\n\36\3\36\5\36\u01d1\n\36"+
		"\3\36\5\36\u01d4\n\36\3\36\5\36\u01d7\n\36\3\36\7\36\u01da\n\36\f\36\16"+
		"\36\u01dd\13\36\3\36\3\36\5\36\u01e1\n\36\3\36\5\36\u01e4\n\36\3\36\3"+
		"\36\7\36\u01e8\n\36\f\36\16\36\u01eb\13\36\3\36\5\36\u01ee\n\36\3\36\5"+
		"\36\u01f1\n\36\3\36\3\36\3\36\5\36\u01f6\n\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\5\36\u0201\n\36\3\37\3\37\3\37\7\37\u0206\n\37\f"+
		"\37\16\37\u0209\13\37\3\37\3\37\3 \3 \3 \3 \7 \u0211\n \f \16 \u0214\13"+
		" \3!\3!\3!\3!\3\"\3\"\5\"\u021c\n\"\3\"\3\"\3\"\3\"\5\"\u0222\n\"\3#\6"+
		"#\u0225\n#\r#\16#\u0226\3#\5#\u022a\n#\3#\3#\5#\u022e\n#\3#\3#\3#\3#\5"+
		"#\u0234\n#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-"+
		"\3-\3-\3-\3-\5-\u024d\n-\3-\3-\3-\3-\3-\3-\5-\u0255\n-\7-\u0257\n-\f-"+
		"\16-\u025a\13-\3.\3.\3.\3.\3/\3/\3/\7/\u0263\n/\f/\16/\u0266\13/\3\60"+
		"\3\60\3\60\3\60\3\61\3\61\7\61\u026e\n\61\f\61\16\61\u0271\13\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\62\5\62\u0279\n\62\3\62\3\62\3\63\3\63\3\64\3\64"+
		"\3\64\3\64\5\64\u0283\n\64\3\65\3\65\3\65\3\65\5\65\u0289\n\65\3\66\3"+
		"\66\3\66\3\66\3\66\5\66\u0290\n\66\3\67\3\67\38\38\38\38\39\39\3:\3:\3"+
		":\3;\3;\3<\3<\3<\2=\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv\2\31\4\63\63cc\4\63\63cc\4"+
		"\63\63]]\5BBaaff\4))DD\3\13\13\4CCVV\3==\3\f\f\3\f\r\4GGLL\4GGLL\4BBa"+
		"a\4GGLL\3\n\13\4\67\67hh\4**\\\\\6\'\'__ggqq\4$$88\4\16\16\25\26\3\3\5"+
		"\3\t\34\r \"$\60\62\64\67:<FHKRRY^`dgmpq\u02d8\2|\3\2\2\2\4\u0084\3\2"+
		"\2\2\6\u008a\3\2\2\2\b\u008f\3\2\2\2\n\u0091\3\2\2\2\f\u0094\3\2\2\2\16"+
		"\u00a8\3\2\2\2\20\u00aa\3\2\2\2\22\u00bc\3\2\2\2\24\u00c5\3\2\2\2\26\u00ce"+
		"\3\2\2\2\30\u00de\3\2\2\2\32\u00fc\3\2\2\2\34\u00ff\3\2\2\2\36\u010c\3"+
		"\2\2\2 \u0116\3\2\2\2\"\u0118\3\2\2\2$\u0127\3\2\2\2&\u012f\3\2\2\2(\u013a"+
		"\3\2\2\2*\u0140\3\2\2\2,\u015c\3\2\2\2.\u0174\3\2\2\2\60\u0176\3\2\2\2"+
		"\62\u0194\3\2\2\2\64\u0196\3\2\2\2\66\u0198\3\2\2\28\u019a\3\2\2\2:\u0200"+
		"\3\2\2\2<\u0202\3\2\2\2>\u020c\3\2\2\2@\u0215\3\2\2\2B\u0221\3\2\2\2D"+
		"\u0233\3\2\2\2F\u0235\3\2\2\2H\u0237\3\2\2\2J\u0239\3\2\2\2L\u023b\3\2"+
		"\2\2N\u023d\3\2\2\2P\u023f\3\2\2\2R\u0241\3\2\2\2T\u0243\3\2\2\2V\u0245"+
		"\3\2\2\2X\u0247\3\2\2\2Z\u025b\3\2\2\2\\\u025f\3\2\2\2^\u0267\3\2\2\2"+
		"`\u026b\3\2\2\2b\u0274\3\2\2\2d\u027c\3\2\2\2f\u0282\3\2\2\2h\u0288\3"+
		"\2\2\2j\u028f\3\2\2\2l\u0291\3\2\2\2n\u0293\3\2\2\2p\u0297\3\2\2\2r\u0299"+
		"\3\2\2\2t\u029c\3\2\2\2v\u029e\3\2\2\2xz\5\4\3\2y{\7\f\2\2zy\3\2\2\2z"+
		"{\3\2\2\2{}\3\2\2\2|x\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0081\7\1\2\2\u0081\3\3\2\2\2\u0082\u0085\5\6\4\2\u0083"+
		"\u0085\5\b\5\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\5\3\2\2\2"+
		"\u0086\u008b\5\16\b\2\u0087\u008b\5\22\n\2\u0088\u008b\5\24\13\2\u0089"+
		"\u008b\5\26\f\2\u008a\u0086\3\2\2\2\u008a\u0087\3\2\2\2\u008a\u0088\3"+
		"\2\2\2\u008a\u0089\3\2\2\2\u008b\7\3\2\2\2\u008c\u0090\5\20\t\2\u008d"+
		"\u0090\5\n\6\2\u008e\u0090\5\f\7\2\u008f\u008c\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u008f\u008e\3\2\2\2\u0090\t\3\2\2\2\u0091\u0092\7i\2\2\u0092\u0093"+
		"\5h\65\2\u0093\13\3\2\2\2\u0094\u0095\7\60\2\2\u0095\r\3\2\2\2\u0096\u0097"+
		"\7;\2\2\u0097\u0098\t\2\2\2\u0098\u0099\7E\2\2\u0099\u009a\7?\2\2\u009a"+
		"\u009c\5X-\2\u009b\u009d\7X\2\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2"+
		"\2\u009d\u00a9\3\2\2\2\u009e\u009f\7;\2\2\u009f\u00a0\t\3\2\2\u00a0\u00a2"+
		"\5X-\2\u00a1\u00a3\7X\2\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a6\3\2\2\2\u00a4\u00a5\7E\2\2\u00a5\u00a7\7?\2\2\u00a6\u00a4\3\2\2"+
		"\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u0096\3\2\2\2\u00a8\u009e"+
		"\3\2\2\2\u00a9\17\3\2\2\2\u00aa\u00ac\7H\2\2\u00ab\u00ad\7F\2\2\u00ac"+
		"\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\7J"+
		"\2\2\u00af\u00b1\5J&\2\u00b0\u00b2\5Z.\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b9\5^\60\2\u00b5"+
		"\u00b6\7\r\2\2\u00b6\u00b8\5^\60\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3\2"+
		"\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\21\3\2\2\2\u00bb\u00b9"+
		"\3\2\2\2\u00bc\u00c3\7\62\2\2\u00bd\u00c4\5\30\r\2\u00be\u00c4\5*\26\2"+
		"\u00bf\u00c4\5\34\17\2\u00c0\u00c4\5\"\22\2\u00c1\u00c4\5$\23\2\u00c2"+
		"\u00c4\5&\24\2\u00c3\u00bd\3\2\2\2\u00c3\u00be\3\2\2\2\u00c3\u00bf\3\2"+
		"\2\2\u00c3\u00c0\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4"+
		"\23\3\2\2\2\u00c5\u00c6\7\"\2\2\u00c6\u00c7\7c\2\2\u00c7\u00ca\5J&\2\u00c8"+
		"\u00c9\7!\2\2\u00c9\u00cb\58\35\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\25\3\2\2\2\u00ce\u00cf"+
		"\7h\2\2\u00cf\u00d0\5J&\2\u00d0\u00d1\7^\2\2\u00d1\u00d2\5L\'\2\u00d2"+
		"\u00d3\7\t\2\2\u00d3\u00db\5f\64\2\u00d4\u00d5\7\r\2\2\u00d5\u00d6\5L"+
		"\'\2\u00d6\u00d7\7\t\2\2\u00d7\u00d8\5f\64\2\u00d8\u00da\3\2\2\2\u00d9"+
		"\u00d4\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\27\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e2\t\4\2\2\u00df\u00e0"+
		"\7E\2\2\u00e0\u00e1\7P\2\2\u00e1\u00e3\7?\2\2\u00e2\u00df\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e8\5H%\2\u00e5\u00e7\5\32"+
		"\16\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\31\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ed\7\65\2"+
		"\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef"+
		"\7+\2\2\u00ef\u00f1\7^\2\2\u00f0\u00f2\7\t\2\2\u00f1\u00f0\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00fd\5P)\2\u00f4\u00f6\7\65"+
		"\2\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f9\7.\2\2\u00f8\u00fa\7\t\2\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2"+
		"\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\5R*\2\u00fc\u00ec\3\2\2\2\u00fc\u00f5"+
		"\3\2\2\2\u00fd\33\3\2\2\2\u00fe\u0100\t\5\2\2\u00ff\u00fe\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\7G\2\2\u0102\u0104\5N("+
		"\2\u0103\u0105\5\36\20\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0107\7S\2\2\u0107\u0108\5J&\2\u0108\u010a\5Z.\2"+
		"\u0109\u010b\5 \21\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\35"+
		"\3\2\2\2\u010c\u010e\7j\2\2\u010d\u010f\t\6\2\2\u010e\u010d\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\37\3\2\2\2\u0110\u0112\7M\2\2\u0111\u0113\7\t\2\2"+
		"\u0112\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0117"+
		"\5f\64\2\u0115\u0117\5\36\20\2\u0116\u0110\3\2\2\2\u0116\u0115\3\2\2\2"+
		"\u0117!\3\2\2\2\u0118\u0119\7n\2\2\u0119\u011a\5h\65\2\u011a\u011b\5Z"+
		".\2\u011b\u011c\7#\2\2\u011c\u0120\7\n\2\2\u011d\u011f\n\7\2\2\u011e\u011d"+
		"\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\7\13\2\2\u0124#\3\2\2\2"+
		"\u0125\u0126\7T\2\2\u0126\u0128\7[\2\2\u0127\u0125\3\2\2\2\u0127\u0128"+
		"\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\7e\2\2\u012a\u012b\5V,\2\u012b"+
		"\u012c\5(\25\2\u012c%\3\2\2\2\u012d\u012e\7T\2\2\u012e\u0130\7[\2\2\u012f"+
		"\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\t\b"+
		"\2\2\u0132\u0133\5h\65\2\u0133\u0134\5(\25\2\u0134\'\3\2\2\2\u0135\u0139"+
		"\n\t\2\2\u0136\u0137\7=\2\2\u0137\u0139\n\n\2\2\u0138\u0135\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2"+
		"\2\2\u013b\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e\7=\2\2\u013e"+
		")\3\2\2\2\u013f\u0141\7d\2\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142\u0146\7c\2\2\u0143\u0144\7E\2\2\u0144\u0145\7P\2"+
		"\2\u0145\u0147\7?\2\2\u0146\u0143\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148"+
		"\3\2\2\2\u0148\u0149\5J&\2\u0149\u0150\7\n\2\2\u014a\u014c\5,\27\2\u014b"+
		"\u014d\t\13\2\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f\3"+
		"\2\2\2\u014e\u014a\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0157\7\13"+
		"\2\2\u0154\u0156\5.\30\2\u0155\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158+\3\2\2\2\u0159\u0157\3\2\2\2"+
		"\u015a\u015d\5\60\31\2\u015b\u015d\5\64\33\2\u015c\u015a\3\2\2\2\u015c"+
		"\u015b\3\2\2\2\u015d-\3\2\2\2\u015e\u0160\7\65\2\2\u015f\u015e\3\2\2\2"+
		"\u015f\u0160\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\7+\2\2\u0162\u0164"+
		"\7^\2\2\u0163\u0165\7\t\2\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0175\5h\65\2\u0167\u0169\7\65\2\2\u0168\u0167\3"+
		"\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u0172\5h\65\2\u016b"+
		"\u016d\7\t\2\2\u016c\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u0170\3\2"+
		"\2\2\u016e\u0171\5h\65\2\u016f\u0171\7r\2\2\u0170\u016e\3\2\2\2\u0170"+
		"\u016f\3\2\2\2\u0171\u0173\3\2\2\2\u0172\u016c\3\2\2\2\u0172\u0173\3\2"+
		"\2\2\u0173\u0175\3\2\2\2\u0174\u015f\3\2\2\2\u0174\u0168\3\2\2\2\u0175"+
		"/\3\2\2\2\u0176\u0177\5L\'\2\u0177\u0179\5D#\2\u0178\u017a\5F$\2\u0179"+
		"\u0178\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017c\3\2\2\2\u017b\u017d\5\32"+
		"\16\2\u017c\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u0182\3\2\2\2\u017e"+
		"\u0181\5\62\32\2\u017f\u0181\5\66\34\2\u0180\u017e\3\2\2\2\u0180\u017f"+
		"\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
		"\u0188\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0186\7S\2\2\u0186\u0187\7h\2"+
		"\2\u0187\u0189\5h\65\2\u0188\u0185\3\2\2\2\u0188\u0189\3\2\2\2\u0189\61"+
		"\3\2\2\2\u018a\u018c\7P\2\2\u018b\u018a\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u018d\3\2\2\2\u018d\u0195\7Q\2\2\u018e\u0195\7%\2\2\u018f\u0192\7\65"+
		"\2\2\u0190\u0193\5f\64\2\u0191\u0193\7Q\2\2\u0192\u0190\3\2\2\2\u0192"+
		"\u0191\3\2\2\2\u0193\u0195\3\2\2\2\u0194\u018b\3\2\2\2\u0194\u018e\3\2"+
		"\2\2\u0194\u018f\3\2\2\2\u0195\63\3\2\2\2\u0196\u0197\5:\36\2\u0197\65"+
		"\3\2\2\2\u0198\u0199\5:\36\2\u0199\67\3\2\2\2\u019a\u019b\5:\36\2\u019b"+
		"9\3\2\2\2\u019c\u019e\7\61\2\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2"+
		"\u019e\u01a0\3\2\2\2\u019f\u01a1\5T+\2\u01a0\u019f\3\2\2\2\u01a0\u01a1"+
		"\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\7W\2\2\u01a3\u01a5\7L\2\2\u01a4"+
		"\u01a6\5T+\2\u01a5\u01a4\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a8\3\2\2"+
		"\2\u01a7\u01a9\5\36\20\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01ab\3\2\2\2\u01aa\u01ac\5Z.\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2\2"+
		"\2\u01ac\u01b0\3\2\2\2\u01ad\u01af\5 \21\2\u01ae\u01ad\3\2\2\2\u01af\u01b2"+
		"\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u0201\3\2\2\2\u01b2"+
		"\u01b0\3\2\2\2\u01b3\u01b5\t\f\2\2\u01b4\u01b6\5N(\2\u01b5\u01b4\3\2\2"+
		"\2\u01b5\u01b6\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b8\7S\2\2\u01b8\u01ba"+
		"\5L\'\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb"+
		"\u01bd\5\36\20\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\3"+
		"\2\2\2\u01be\u01c2\5Z.\2\u01bf\u01c1\5 \21\2\u01c0\u01bf\3\2\2\2\u01c1"+
		"\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u0201\3\2"+
		"\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c7\7\61\2\2\u01c6\u01c5\3\2\2\2\u01c6"+
		"\u01c7\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01ca\5T+\2\u01c9\u01c8\3\2\2"+
		"\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\7f\2\2\u01cc\u01ce"+
		"\t\r\2\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf"+
		"\u01d1\5N(\2\u01d0\u01cf\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d3\3\2\2"+
		"\2\u01d2\u01d4\5\36\20\2\u01d3\u01d2\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4"+
		"\u01d6\3\2\2\2\u01d5\u01d7\5Z.\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2"+
		"\2\u01d7\u01db\3\2\2\2\u01d8\u01da\5 \21\2\u01d9\u01d8\3\2\2\2\u01da\u01dd"+
		"\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u0201\3\2\2\2\u01dd"+
		"\u01db\3\2\2\2\u01de\u01e0\t\16\2\2\u01df\u01e1\t\17\2\2\u01e0\u01df\3"+
		"\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3\3\2\2\2\u01e2\u01e4\5N(\2\u01e3"+
		"\u01e2\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e9\5Z"+
		".\2\u01e6\u01e8\5 \21\2\u01e7\u01e6\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9"+
		"\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u0201\3\2\2\2\u01eb\u01e9\3\2"+
		"\2\2\u01ec\u01ee\7\61\2\2\u01ed\u01ec\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee"+
		"\u01f0\3\2\2\2\u01ef\u01f1\5T+\2\u01f0\u01ef\3\2\2\2\u01f0\u01f1\3\2\2"+
		"\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\7A\2\2\u01f3\u01f5\7L\2\2\u01f4\u01f6"+
		"\5N(\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7"+
		"\u01f8\5Z.\2\u01f8\u01f9\5> \2\u01f9\u0201\3\2\2\2\u01fa\u01fb\7\61\2"+
		"\2\u01fb\u01fc\5T+\2\u01fc\u01fd\7-\2\2\u01fd\u01fe\5<\37\2\u01fe\u0201"+
		"\3\2\2\2\u01ff\u0201\5> \2\u0200\u019d\3\2\2\2\u0200\u01b3\3\2\2\2\u0200"+
		"\u01c6\3\2\2\2\u0200\u01de\3\2\2\2\u0200\u01ed\3\2\2\2\u0200\u01fa\3\2"+
		"\2\2\u0200\u01ff\3\2\2\2\u0201;\3\2\2\2\u0202\u0207\7\n\2\2\u0203\u0206"+
		"\n\20\2\2\u0204\u0206\5<\37\2\u0205\u0203\3\2\2\2\u0205\u0204\3\2\2\2"+
		"\u0206\u0209\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020a"+
		"\3\2\2\2\u0209\u0207\3\2\2\2\u020a\u020b\7\13\2\2\u020b=\3\2\2\2\u020c"+
		"\u020d\7Z\2\2\u020d\u020e\5J&\2\u020e\u0212\5Z.\2\u020f\u0211\5@!\2\u0210"+
		"\u020f\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2"+
		"\2\2\u0213?\3\2\2\2\u0214\u0212\3\2\2\2\u0215\u0216\7S\2\2\u0216\u0217"+
		"\t\21\2\2\u0217\u0218\5B\"\2\u0218A\3\2\2\2\u0219\u021b\t\22\2\2\u021a"+
		"\u021c\7\66\2\2\u021b\u021a\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u0222\3"+
		"\2\2\2\u021d\u021e\7^\2\2\u021e\u0222\7Q\2\2\u021f\u0220\7O\2\2\u0220"+
		"\u0222\7 \2\2\u0221\u0219\3\2\2\2\u0221\u021d\3\2\2\2\u0221\u021f\3\2"+
		"\2\2\u0222C\3\2\2\2\u0223\u0225\5h\65\2\u0224\u0223\3\2\2\2\u0225\u0226"+
		"\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0229\3\2\2\2\u0228"+
		"\u022a\5b\62\2\u0229\u0228\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022d\3\2"+
		"\2\2\u022b\u022c\7>\2\2\u022c\u022e\5^\60\2\u022d\u022b\3\2\2\2\u022d"+
		"\u022e\3\2\2\2\u022e\u0234\3\2\2\2\u022f\u0230\7>\2\2\u0230\u0234\5^\60"+
		"\2\u0231\u0232\7^\2\2\u0232\u0234\5^\60\2\u0233\u0224\3\2\2\2\u0233\u022f"+
		"\3\2\2\2\u0233\u0231\3\2\2\2\u0234E\3\2\2\2\u0235\u0236\t\23\2\2\u0236"+
		"G\3\2\2\2\u0237\u0238\5h\65\2\u0238I\3\2\2\2\u0239\u023a\5h\65\2\u023a"+
		"K\3\2\2\2\u023b\u023c\5h\65\2\u023cM\3\2\2\2\u023d\u023e\5h\65\2\u023e"+
		"O\3\2\2\2\u023f\u0240\5h\65\2\u0240Q\3\2\2\2\u0241\u0242\5h\65\2\u0242"+
		"S\3\2\2\2\u0243\u0244\5h\65\2\u0244U\3\2\2\2\u0245\u0246\5h\65\2\u0246"+
		"W\3\2\2\2\u0247\u024c\5h\65\2\u0248\u0249\7\n\2\2\u0249\u024a\5f\64\2"+
		"\u024a\u024b\7\13\2\2\u024b\u024d\3\2\2\2\u024c\u0248\3\2\2\2\u024c\u024d"+
		"\3\2\2\2\u024d\u0258\3\2\2\2\u024e\u024f\7\r\2\2\u024f\u0254\5h\65\2\u0250"+
		"\u0251\7\n\2\2\u0251\u0252\5f\64\2\u0252\u0253\7\13\2\2\u0253\u0255\3"+
		"\2\2\2\u0254\u0250\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0257\3\2\2\2\u0256"+
		"\u024e\3\2\2\2\u0257\u025a\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0259\3\2"+
		"\2\2\u0259Y\3\2\2\2\u025a\u0258\3\2\2\2\u025b\u025c\7\n\2\2\u025c\u025d"+
		"\5X-\2\u025d\u025e\7\13\2\2\u025e[\3\2\2\2\u025f\u0264\5f\64\2\u0260\u0261"+
		"\7\r\2\2\u0261\u0263\5f\64\2\u0262\u0260\3\2\2\2\u0263\u0266\3\2\2\2\u0264"+
		"\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265]\3\2\2\2\u0266\u0264\3\2\2\2"+
		"\u0267\u0268\7\n\2\2\u0268\u0269\5\\/\2\u0269\u026a\7\13\2\2\u026a_\3"+
		"\2\2\2\u026b\u026f\7\n\2\2\u026c\u026e\5^\60\2\u026d\u026c\3\2\2\2\u026e"+
		"\u0271\3\2\2\2\u026f\u026d\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0272\3\2"+
		"\2\2\u0271\u026f\3\2\2\2\u0272\u0273\7\13\2\2\u0273a\3\2\2\2\u0274\u0275"+
		"\7\n\2\2\u0275\u0278\7r\2\2\u0276\u0277\7\r\2\2\u0277\u0279\7r\2\2\u0278"+
		"\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027b\7\13"+
		"\2\2\u027bc\3\2\2\2\u027c\u027d\t\24\2\2\u027de\3\2\2\2\u027e\u0283\5"+
		"j\66\2\u027f\u0283\7Q\2\2\u0280\u0283\5h\65\2\u0281\u0283\5r:\2\u0282"+
		"\u027e\3\2\2\2\u0282\u027f\3\2\2\2\u0282\u0280\3\2\2\2\u0282\u0281\3\2"+
		"\2\2\u0283g\3\2\2\2\u0284\u0289\7s\2\2\u0285\u0289\5v<\2\u0286\u0289\5"+
		"n8\2\u0287\u0289\5p9\2\u0288\u0284\3\2\2\2\u0288\u0285\3\2\2\2\u0288\u0286"+
		"\3\2\2\2\u0288\u0287\3\2\2\2\u0289i\3\2\2\2\u028a\u0290\7r\2\2\u028b\u028c"+
		"\5l\67\2\u028c\u028d\7r\2\2\u028d\u028e\5l\67\2\u028e\u0290\3\2\2\2\u028f"+
		"\u028a\3\2\2\2\u028f\u028b\3\2\2\2\u0290k\3\2\2\2\u0291\u0292\t\25\2\2"+
		"\u0292m\3\2\2\2\u0293\u0294\5l\67\2\u0294\u0295\5v<\2\u0295\u0296\5l\67"+
		"\2\u0296o\3\2\2\2\u0297\u0298\t\26\2\2\u0298q\3\2\2\2\u0299\u029a\5h\65"+
		"\2\u029a\u029b\5<\37\2\u029bs\3\2\2\2\u029c\u029d\t\27\2\2\u029du\3\2"+
		"\2\2\u029e\u029f\t\30\2\2\u029fw\3\2\2\2bz~\u0084\u008a\u008f\u009c\u00a2"+
		"\u00a6\u00a8\u00ac\u00b1\u00b9\u00c3\u00cc\u00db\u00e2\u00e8\u00ec\u00f1"+
		"\u00f5\u00f9\u00fc\u00ff\u0104\u010a\u010e\u0112\u0116\u0120\u0127\u012f"+
		"\u0138\u013a\u0140\u0146\u014c\u0150\u0157\u015c\u015f\u0164\u0168\u016c"+
		"\u0170\u0172\u0174\u0179\u017c\u0180\u0182\u0188\u018b\u0192\u0194\u019d"+
		"\u01a0\u01a5\u01a8\u01ab\u01b0\u01b5\u01b9\u01bc\u01c2\u01c6\u01c9\u01cd"+
		"\u01d0\u01d3\u01d6\u01db\u01e0\u01e3\u01e9\u01ed\u01f0\u01f5\u0200\u0205"+
		"\u0207\u0212\u021b\u0221\u0226\u0229\u022d\u0233\u024c\u0254\u0258\u0264"+
		"\u026f\u0278\u0282\u0288\u028f";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}