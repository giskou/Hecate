// $ANTLR 3.4 DDL.g 2013-02-06 16:34:19

  package gr.uoi.cs.daintiness.hecate.parser ;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class DDLLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int ACTION=4;
    public static final int ASC=5;
    public static final int AUTO_INC=6;
    public static final int BINARY=7;
    public static final int CASCADE=8;
    public static final int CHARACTER=9;
    public static final int CHECK=10;
    public static final int COLLATE=11;
    public static final int COMMENT=12;
    public static final int COMMIT=13;
    public static final int CONFLICT=14;
    public static final int CONSTRAINT=15;
    public static final int CREATE=16;
    public static final int DATABASE=17;
    public static final int DEF=18;
    public static final int DEFAULT=19;
    public static final int DELETE=20;
    public static final int DESC=21;
    public static final int DROP=22;
    public static final int ENUM=23;
    public static final int ESC_SEQ=24;
    public static final int EXISTS=25;
    public static final int FOREIGN=26;
    public static final int FULLTEXT=27;
    public static final int HASH=28;
    public static final int HEX_DIGIT=29;
    public static final int ID=30;
    public static final int IF=31;
    public static final int IGNORE=32;
    public static final int INDEX=33;
    public static final int INSERT=34;
    public static final int INT=35;
    public static final int INTO=36;
    public static final int IS=37;
    public static final int KEY=38;
    public static final int NO=39;
    public static final int NOT=40;
    public static final int NULL=41;
    public static final int OCTAL_ESC=42;
    public static final int ON=43;
    public static final int PRIMARY=44;
    public static final int REFERENCES=45;
    public static final int RESTRICT=46;
    public static final int SCHEMA=47;
    public static final int SET=48;
    public static final int TABLE=49;
    public static final int UNICODE_ESC=50;
    public static final int UNIQUE=51;
    public static final int UNSIGNED=52;
    public static final int UPDATE=53;
    public static final int USE=54;
    public static final int VALUES=55;
    public static final int WS=56;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public DDLLexer() {} 
    public DDLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public DDLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "DDL.g"; }

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:11:7: ( '(' )
            // DDL.g:11:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:12:7: ( ')' )
            // DDL.g:12:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:13:7: ( ',' )
            // DDL.g:13:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:14:7: ( '.' )
            // DDL.g:14:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:15:7: ( ';' )
            // DDL.g:15:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:16:7: ( '=' )
            // DDL.g:16:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:17:7: ( '\\'\\'' )
            // DDL.g:17:9: '\\'\\''
            {
            match("''"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "DROP"
    public final void mDROP() throws RecognitionException {
        try {
            int _type = DROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:194:6: ( 'DROP' | 'drop' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='D') ) {
                alt1=1;
            }
            else if ( (LA1_0=='d') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // DDL.g:194:8: 'DROP'
                    {
                    match("DROP"); 



                    }
                    break;
                case 2 :
                    // DDL.g:194:17: 'drop'
                    {
                    match("drop"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DROP"

    // $ANTLR start "CREATE"
    public final void mCREATE() throws RecognitionException {
        try {
            int _type = CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:195:8: ( 'CREATE' | 'create' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='C') ) {
                alt2=1;
            }
            else if ( (LA2_0=='c') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // DDL.g:195:10: 'CREATE'
                    {
                    match("CREATE"); 



                    }
                    break;
                case 2 :
                    // DDL.g:195:21: 'create'
                    {
                    match("create"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CREATE"

    // $ANTLR start "DATABASE"
    public final void mDATABASE() throws RecognitionException {
        try {
            int _type = DATABASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:196:10: ( 'DATABASE' | 'database' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='D') ) {
                alt3=1;
            }
            else if ( (LA3_0=='d') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // DDL.g:196:12: 'DATABASE'
                    {
                    match("DATABASE"); 



                    }
                    break;
                case 2 :
                    // DDL.g:196:25: 'database'
                    {
                    match("database"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DATABASE"

    // $ANTLR start "TABLE"
    public final void mTABLE() throws RecognitionException {
        try {
            int _type = TABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:197:7: ( 'TABLE' | 'table' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='T') ) {
                alt4=1;
            }
            else if ( (LA4_0=='t') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // DDL.g:197:9: 'TABLE'
                    {
                    match("TABLE"); 



                    }
                    break;
                case 2 :
                    // DDL.g:197:19: 'table'
                    {
                    match("table"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TABLE"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:198:4: ( 'IF' | 'if' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='I') ) {
                alt5=1;
            }
            else if ( (LA5_0=='i') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // DDL.g:198:6: 'IF'
                    {
                    match("IF"); 



                    }
                    break;
                case 2 :
                    // DDL.g:198:13: 'if'
                    {
                    match("if"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:199:5: ( 'NOT' | 'not' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='N') ) {
                alt6=1;
            }
            else if ( (LA6_0=='n') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // DDL.g:199:7: 'NOT'
                    {
                    match("NOT"); 



                    }
                    break;
                case 2 :
                    // DDL.g:199:15: 'not'
                    {
                    match("not"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "EXISTS"
    public final void mEXISTS() throws RecognitionException {
        try {
            int _type = EXISTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:200:8: ( 'EXISTS' | 'exists' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='E') ) {
                alt7=1;
            }
            else if ( (LA7_0=='e') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // DDL.g:200:10: 'EXISTS'
                    {
                    match("EXISTS"); 



                    }
                    break;
                case 2 :
                    // DDL.g:200:21: 'exists'
                    {
                    match("exists"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXISTS"

    // $ANTLR start "ENUM"
    public final void mENUM() throws RecognitionException {
        try {
            int _type = ENUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:201:6: ( 'ENUM' | 'enum' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='E') ) {
                alt8=1;
            }
            else if ( (LA8_0=='e') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // DDL.g:201:8: 'ENUM'
                    {
                    match("ENUM"); 



                    }
                    break;
                case 2 :
                    // DDL.g:201:17: 'enum'
                    {
                    match("enum"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENUM"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:202:6: ( ( 'NULL' | 'null' | 'Null' )? )
            // DDL.g:202:8: ( 'NULL' | 'null' | 'Null' )?
            {
            // DDL.g:202:8: ( 'NULL' | 'null' | 'Null' )?
            int alt9=4;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='N') ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1=='U') ) {
                    alt9=1;
                }
                else if ( (LA9_1=='u') ) {
                    alt9=3;
                }
            }
            else if ( (LA9_0=='n') ) {
                alt9=2;
            }
            switch (alt9) {
                case 1 :
                    // DDL.g:202:9: 'NULL'
                    {
                    match("NULL"); 



                    }
                    break;
                case 2 :
                    // DDL.g:202:18: 'null'
                    {
                    match("null"); 



                    }
                    break;
                case 3 :
                    // DDL.g:202:27: 'Null'
                    {
                    match("Null"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "DEFAULT"
    public final void mDEFAULT() throws RecognitionException {
        try {
            int _type = DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:203:9: ( 'DEFAULT' | 'default' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='D') ) {
                alt10=1;
            }
            else if ( (LA10_0=='d') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // DDL.g:203:11: 'DEFAULT'
                    {
                    match("DEFAULT"); 



                    }
                    break;
                case 2 :
                    // DDL.g:203:23: 'default'
                    {
                    match("default"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEFAULT"

    // $ANTLR start "KEY"
    public final void mKEY() throws RecognitionException {
        try {
            int _type = KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:204:5: ( 'KEY' | 'key' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='K') ) {
                alt11=1;
            }
            else if ( (LA11_0=='k') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // DDL.g:204:7: 'KEY'
                    {
                    match("KEY"); 



                    }
                    break;
                case 2 :
                    // DDL.g:204:15: 'key'
                    {
                    match("key"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KEY"

    // $ANTLR start "HASH"
    public final void mHASH() throws RecognitionException {
        try {
            int _type = HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:205:6: ( 'HASH' 'hash' )
            // DDL.g:205:8: 'HASH' 'hash'
            {
            match("HASH"); 



            match("hash"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HASH"

    // $ANTLR start "UNIQUE"
    public final void mUNIQUE() throws RecognitionException {
        try {
            int _type = UNIQUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:206:8: ( 'UNIQUE' | 'unique' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='U') ) {
                alt12=1;
            }
            else if ( (LA12_0=='u') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // DDL.g:206:10: 'UNIQUE'
                    {
                    match("UNIQUE"); 



                    }
                    break;
                case 2 :
                    // DDL.g:206:21: 'unique'
                    {
                    match("unique"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNIQUE"

    // $ANTLR start "PRIMARY"
    public final void mPRIMARY() throws RecognitionException {
        try {
            int _type = PRIMARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:207:9: ( 'PRIMARY' | 'primary' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='P') ) {
                alt13=1;
            }
            else if ( (LA13_0=='p') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // DDL.g:207:11: 'PRIMARY'
                    {
                    match("PRIMARY"); 



                    }
                    break;
                case 2 :
                    // DDL.g:207:23: 'primary'
                    {
                    match("primary"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRIMARY"

    // $ANTLR start "FOREIGN"
    public final void mFOREIGN() throws RecognitionException {
        try {
            int _type = FOREIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:208:9: ( 'FOREIGN' | 'foreign' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='F') ) {
                alt14=1;
            }
            else if ( (LA14_0=='f') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // DDL.g:208:11: 'FOREIGN'
                    {
                    match("FOREIGN"); 



                    }
                    break;
                case 2 :
                    // DDL.g:208:23: 'foreign'
                    {
                    match("foreign"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOREIGN"

    // $ANTLR start "INDEX"
    public final void mINDEX() throws RecognitionException {
        try {
            int _type = INDEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:209:7: ( 'INDEX' | 'index' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='I') ) {
                alt15=1;
            }
            else if ( (LA15_0=='i') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // DDL.g:209:9: 'INDEX'
                    {
                    match("INDEX"); 



                    }
                    break;
                case 2 :
                    // DDL.g:209:19: 'index'
                    {
                    match("index"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INDEX"

    // $ANTLR start "CONSTRAINT"
    public final void mCONSTRAINT() throws RecognitionException {
        try {
            int _type = CONSTRAINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:210:12: ( 'CONSTRAINT' | 'constraint' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='C') ) {
                alt16=1;
            }
            else if ( (LA16_0=='c') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // DDL.g:210:14: 'CONSTRAINT'
                    {
                    match("CONSTRAINT"); 



                    }
                    break;
                case 2 :
                    // DDL.g:210:29: 'constraint'
                    {
                    match("constraint"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONSTRAINT"

    // $ANTLR start "FULLTEXT"
    public final void mFULLTEXT() throws RecognitionException {
        try {
            int _type = FULLTEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:211:10: ( 'FULLTEXT' | 'fulltext' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='F') ) {
                alt17=1;
            }
            else if ( (LA17_0=='f') ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // DDL.g:211:12: 'FULLTEXT'
                    {
                    match("FULLTEXT"); 



                    }
                    break;
                case 2 :
                    // DDL.g:211:25: 'fulltext'
                    {
                    match("fulltext"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FULLTEXT"

    // $ANTLR start "REFERENCES"
    public final void mREFERENCES() throws RecognitionException {
        try {
            int _type = REFERENCES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:212:12: ( 'REFERENCES' | 'references' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='R') ) {
                alt18=1;
            }
            else if ( (LA18_0=='r') ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // DDL.g:212:14: 'REFERENCES'
                    {
                    match("REFERENCES"); 



                    }
                    break;
                case 2 :
                    // DDL.g:212:29: 'references'
                    {
                    match("references"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REFERENCES"

    // $ANTLR start "ON"
    public final void mON() throws RecognitionException {
        try {
            int _type = ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:213:4: ( 'ON' | 'on' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='O') ) {
                alt19=1;
            }
            else if ( (LA19_0=='o') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // DDL.g:213:6: 'ON'
                    {
                    match("ON"); 



                    }
                    break;
                case 2 :
                    // DDL.g:213:13: 'on'
                    {
                    match("on"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ON"

    // $ANTLR start "INTO"
    public final void mINTO() throws RecognitionException {
        try {
            int _type = INTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:214:6: ( 'INTO' | 'into' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='I') ) {
                alt20=1;
            }
            else if ( (LA20_0=='i') ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // DDL.g:214:8: 'INTO'
                    {
                    match("INTO"); 



                    }
                    break;
                case 2 :
                    // DDL.g:214:17: 'into'
                    {
                    match("into"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTO"

    // $ANTLR start "VALUES"
    public final void mVALUES() throws RecognitionException {
        try {
            int _type = VALUES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:215:8: ( 'VALUES' | 'values' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='V') ) {
                alt21=1;
            }
            else if ( (LA21_0=='v') ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // DDL.g:215:10: 'VALUES'
                    {
                    match("VALUES"); 



                    }
                    break;
                case 2 :
                    // DDL.g:215:21: 'values'
                    {
                    match("values"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VALUES"

    // $ANTLR start "DELETE"
    public final void mDELETE() throws RecognitionException {
        try {
            int _type = DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:216:8: ( 'DELETE' | 'delete' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='D') ) {
                alt22=1;
            }
            else if ( (LA22_0=='d') ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // DDL.g:216:10: 'DELETE'
                    {
                    match("DELETE"); 



                    }
                    break;
                case 2 :
                    // DDL.g:216:21: 'delete'
                    {
                    match("delete"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DELETE"

    // $ANTLR start "CASCADE"
    public final void mCASCADE() throws RecognitionException {
        try {
            int _type = CASCADE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:217:9: ( 'CASCADE' | 'cascade' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='C') ) {
                alt23=1;
            }
            else if ( (LA23_0=='c') ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // DDL.g:217:11: 'CASCADE'
                    {
                    match("CASCADE"); 



                    }
                    break;
                case 2 :
                    // DDL.g:217:23: 'cascade'
                    {
                    match("cascade"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CASCADE"

    // $ANTLR start "RESTRICT"
    public final void mRESTRICT() throws RecognitionException {
        try {
            int _type = RESTRICT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:218:10: ( 'RESTRICT' | 'restrict' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='R') ) {
                alt24=1;
            }
            else if ( (LA24_0=='r') ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // DDL.g:218:12: 'RESTRICT'
                    {
                    match("RESTRICT"); 



                    }
                    break;
                case 2 :
                    // DDL.g:218:25: 'restrict'
                    {
                    match("restrict"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RESTRICT"

    // $ANTLR start "ACTION"
    public final void mACTION() throws RecognitionException {
        try {
            int _type = ACTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:219:8: ( 'ACTION' | 'action' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='A') ) {
                alt25=1;
            }
            else if ( (LA25_0=='a') ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // DDL.g:219:10: 'ACTION'
                    {
                    match("ACTION"); 



                    }
                    break;
                case 2 :
                    // DDL.g:219:21: 'action'
                    {
                    match("action"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ACTION"

    // $ANTLR start "NO"
    public final void mNO() throws RecognitionException {
        try {
            int _type = NO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:220:4: ( 'NO' | 'no' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='N') ) {
                alt26=1;
            }
            else if ( (LA26_0=='n') ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // DDL.g:220:6: 'NO'
                    {
                    match("NO"); 



                    }
                    break;
                case 2 :
                    // DDL.g:220:13: 'no'
                    {
                    match("no"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NO"

    // $ANTLR start "SET"
    public final void mSET() throws RecognitionException {
        try {
            int _type = SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:221:5: ( 'SET' | 'set' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='S') ) {
                alt27=1;
            }
            else if ( (LA27_0=='s') ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // DDL.g:221:7: 'SET'
                    {
                    match("SET"); 



                    }
                    break;
                case 2 :
                    // DDL.g:221:15: 'set'
                    {
                    match("set"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SET"

    // $ANTLR start "INSERT"
    public final void mINSERT() throws RecognitionException {
        try {
            int _type = INSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:222:8: ( 'INSERT' | 'insert' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='I') ) {
                alt28=1;
            }
            else if ( (LA28_0=='i') ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // DDL.g:222:10: 'INSERT'
                    {
                    match("INSERT"); 



                    }
                    break;
                case 2 :
                    // DDL.g:222:21: 'insert'
                    {
                    match("insert"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INSERT"

    // $ANTLR start "UPDATE"
    public final void mUPDATE() throws RecognitionException {
        try {
            int _type = UPDATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:223:8: ( 'UPDATE' | 'update' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='U') ) {
                alt29=1;
            }
            else if ( (LA29_0=='u') ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // DDL.g:223:10: 'UPDATE'
                    {
                    match("UPDATE"); 



                    }
                    break;
                case 2 :
                    // DDL.g:223:21: 'update'
                    {
                    match("update"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UPDATE"

    // $ANTLR start "UNSIGNED"
    public final void mUNSIGNED() throws RecognitionException {
        try {
            int _type = UNSIGNED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:224:10: ( 'UNSIGNED' | 'unsigned' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='U') ) {
                alt30=1;
            }
            else if ( (LA30_0=='u') ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // DDL.g:224:12: 'UNSIGNED'
                    {
                    match("UNSIGNED"); 



                    }
                    break;
                case 2 :
                    // DDL.g:224:25: 'unsigned'
                    {
                    match("unsigned"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNSIGNED"

    // $ANTLR start "BINARY"
    public final void mBINARY() throws RecognitionException {
        try {
            int _type = BINARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:225:8: ( 'BINARY' | 'binary' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0=='B') ) {
                alt31=1;
            }
            else if ( (LA31_0=='b') ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }
            switch (alt31) {
                case 1 :
                    // DDL.g:225:10: 'BINARY'
                    {
                    match("BINARY"); 



                    }
                    break;
                case 2 :
                    // DDL.g:225:21: 'binary'
                    {
                    match("binary"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BINARY"

    // $ANTLR start "AUTO_INC"
    public final void mAUTO_INC() throws RecognitionException {
        try {
            int _type = AUTO_INC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:226:10: ( 'AUTO_INCREMENT' | 'auto_increment' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='A') ) {
                alt32=1;
            }
            else if ( (LA32_0=='a') ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // DDL.g:226:12: 'AUTO_INCREMENT'
                    {
                    match("AUTO_INCREMENT"); 



                    }
                    break;
                case 2 :
                    // DDL.g:226:31: 'auto_increment'
                    {
                    match("auto_increment"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AUTO_INC"

    // $ANTLR start "ASC"
    public final void mASC() throws RecognitionException {
        try {
            int _type = ASC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:227:5: ( 'ASC' | 'asc' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0=='A') ) {
                alt33=1;
            }
            else if ( (LA33_0=='a') ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // DDL.g:227:7: 'ASC'
                    {
                    match("ASC"); 



                    }
                    break;
                case 2 :
                    // DDL.g:227:15: 'asc'
                    {
                    match("asc"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASC"

    // $ANTLR start "DESC"
    public final void mDESC() throws RecognitionException {
        try {
            int _type = DESC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:228:6: ( 'DESC' | 'desc' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='D') ) {
                alt34=1;
            }
            else if ( (LA34_0=='d') ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }
            switch (alt34) {
                case 1 :
                    // DDL.g:228:8: 'DESC'
                    {
                    match("DESC"); 



                    }
                    break;
                case 2 :
                    // DDL.g:228:17: 'desc'
                    {
                    match("desc"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DESC"

    // $ANTLR start "CHARACTER"
    public final void mCHARACTER() throws RecognitionException {
        try {
            int _type = CHARACTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:229:11: ( 'CHARACTER' | 'character' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0=='C') ) {
                alt35=1;
            }
            else if ( (LA35_0=='c') ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }
            switch (alt35) {
                case 1 :
                    // DDL.g:229:13: 'CHARACTER'
                    {
                    match("CHARACTER"); 



                    }
                    break;
                case 2 :
                    // DDL.g:229:27: 'character'
                    {
                    match("character"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARACTER"

    // $ANTLR start "COLLATE"
    public final void mCOLLATE() throws RecognitionException {
        try {
            int _type = COLLATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:230:9: ( 'COLLATE' | 'collate' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0=='C') ) {
                alt36=1;
            }
            else if ( (LA36_0=='c') ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }
            switch (alt36) {
                case 1 :
                    // DDL.g:230:11: 'COLLATE'
                    {
                    match("COLLATE"); 



                    }
                    break;
                case 2 :
                    // DDL.g:230:23: 'collate'
                    {
                    match("collate"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLLATE"

    // $ANTLR start "USE"
    public final void mUSE() throws RecognitionException {
        try {
            int _type = USE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:231:5: ( 'USE' | 'use' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0=='U') ) {
                alt37=1;
            }
            else if ( (LA37_0=='u') ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }
            switch (alt37) {
                case 1 :
                    // DDL.g:231:7: 'USE'
                    {
                    match("USE"); 



                    }
                    break;
                case 2 :
                    // DDL.g:231:15: 'use'
                    {
                    match("use"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "USE"

    // $ANTLR start "SCHEMA"
    public final void mSCHEMA() throws RecognitionException {
        try {
            int _type = SCHEMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:232:8: ( 'SCHEMA' | 'schema' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0=='S') ) {
                alt38=1;
            }
            else if ( (LA38_0=='s') ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }
            switch (alt38) {
                case 1 :
                    // DDL.g:232:10: 'SCHEMA'
                    {
                    match("SCHEMA"); 



                    }
                    break;
                case 2 :
                    // DDL.g:232:21: 'schema'
                    {
                    match("schema"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SCHEMA"

    // $ANTLR start "COMMIT"
    public final void mCOMMIT() throws RecognitionException {
        try {
            int _type = COMMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:233:8: ( 'COMMIT' | 'commit' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0=='C') ) {
                alt39=1;
            }
            else if ( (LA39_0=='c') ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }
            switch (alt39) {
                case 1 :
                    // DDL.g:233:10: 'COMMIT'
                    {
                    match("COMMIT"); 



                    }
                    break;
                case 2 :
                    // DDL.g:233:21: 'commit'
                    {
                    match("commit"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMIT"

    // $ANTLR start "IS"
    public final void mIS() throws RecognitionException {
        try {
            int _type = IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:234:4: ( 'IS' | 'is' )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0=='I') ) {
                alt40=1;
            }
            else if ( (LA40_0=='i') ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;

            }
            switch (alt40) {
                case 1 :
                    // DDL.g:234:6: 'IS'
                    {
                    match("IS"); 



                    }
                    break;
                case 2 :
                    // DDL.g:234:13: 'is'
                    {
                    match("is"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IS"

    // $ANTLR start "CHECK"
    public final void mCHECK() throws RecognitionException {
        try {
            int _type = CHECK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:235:7: ( 'CHECK' | 'check' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0=='C') ) {
                alt41=1;
            }
            else if ( (LA41_0=='c') ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;

            }
            switch (alt41) {
                case 1 :
                    // DDL.g:235:9: 'CHECK'
                    {
                    match("CHECK"); 



                    }
                    break;
                case 2 :
                    // DDL.g:235:19: 'check'
                    {
                    match("check"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHECK"

    // $ANTLR start "IGNORE"
    public final void mIGNORE() throws RecognitionException {
        try {
            int _type = IGNORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:236:8: ( 'IGNORE' | 'ignore' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0=='I') ) {
                alt42=1;
            }
            else if ( (LA42_0=='i') ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }
            switch (alt42) {
                case 1 :
                    // DDL.g:236:10: 'IGNORE'
                    {
                    match("IGNORE"); 



                    }
                    break;
                case 2 :
                    // DDL.g:236:21: 'ignore'
                    {
                    match("ignore"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IGNORE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:238:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // DDL.g:238:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // DDL.g:238:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0 >= '0' && LA43_0 <= '9')||(LA43_0 >= 'A' && LA43_0 <= 'Z')||LA43_0=='_'||(LA43_0 >= 'a' && LA43_0 <= 'z')) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // DDL.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:240:5: ( ( '-' )? ( '0' .. '9' )+ )
            // DDL.g:240:7: ( '-' )? ( '0' .. '9' )+
            {
            // DDL.g:240:7: ( '-' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0=='-') ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // DDL.g:240:7: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // DDL.g:240:12: ( '0' .. '9' )+
            int cnt45=0;
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0 >= '0' && LA45_0 <= '9')) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // DDL.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt45 >= 1 ) break loop45;
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:243:2: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' | '--' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            int alt53=4;
            switch ( input.LA(1) ) {
            case '/':
                {
                int LA53_1 = input.LA(2);

                if ( (LA53_1=='/') ) {
                    alt53=1;
                }
                else if ( (LA53_1=='*') ) {
                    alt53=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    throw nvae;

                }
                }
                break;
            case '-':
                {
                alt53=3;
                }
                break;
            case '#':
                {
                alt53=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;

            }

            switch (alt53) {
                case 1 :
                    // DDL.g:243:4: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // DDL.g:243:9: (~ ( '\\n' | '\\r' ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( ((LA46_0 >= '\u0000' && LA46_0 <= '\t')||(LA46_0 >= '\u000B' && LA46_0 <= '\f')||(LA46_0 >= '\u000E' && LA46_0 <= '\uFFFF')) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // DDL.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


                    // DDL.g:243:23: ( '\\r' )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0=='\r') ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // DDL.g:243:23: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // DDL.g:244:4: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // DDL.g:244:9: ( options {greedy=false; } : . )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0=='*') ) {
                            int LA48_1 = input.LA(2);

                            if ( (LA48_1=='/') ) {
                                alt48=2;
                            }
                            else if ( ((LA48_1 >= '\u0000' && LA48_1 <= '.')||(LA48_1 >= '0' && LA48_1 <= '\uFFFF')) ) {
                                alt48=1;
                            }


                        }
                        else if ( ((LA48_0 >= '\u0000' && LA48_0 <= ')')||(LA48_0 >= '+' && LA48_0 <= '\uFFFF')) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // DDL.g:244:37: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;
                case 3 :
                    // DDL.g:245:4: '--' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("--"); 



                    // DDL.g:245:9: (~ ( '\\n' | '\\r' ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( ((LA49_0 >= '\u0000' && LA49_0 <= '\t')||(LA49_0 >= '\u000B' && LA49_0 <= '\f')||(LA49_0 >= '\u000E' && LA49_0 <= '\uFFFF')) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // DDL.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);


                    // DDL.g:245:23: ( '\\r' )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0=='\r') ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // DDL.g:245:23: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 4 :
                    // DDL.g:246:5: '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match('#'); 

                    // DDL.g:246:9: (~ ( '\\n' | '\\r' ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( ((LA51_0 >= '\u0000' && LA51_0 <= '\t')||(LA51_0 >= '\u000B' && LA51_0 <= '\f')||(LA51_0 >= '\u000E' && LA51_0 <= '\uFFFF')) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // DDL.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);


                    // DDL.g:246:23: ( '\\r' )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0=='\r') ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // DDL.g:246:23: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "CONFLICT"
    public final void mCONFLICT() throws RecognitionException {
        try {
            int _type = CONFLICT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:249:10: ( '<<<<<<<' ( options {greedy=false; } : . )* '>>>>>>>' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // DDL.g:249:12: '<<<<<<<' ( options {greedy=false; } : . )* '>>>>>>>' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("<<<<<<<"); 



            // DDL.g:249:22: ( options {greedy=false; } : . )*
            loop54:
            do {
                int alt54=2;
                alt54 = dfa54.predict(input);
                switch (alt54) {
            	case 1 :
            	    // DDL.g:249:50: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            match(">>>>>>>"); 



            // DDL.g:249:65: (~ ( '\\n' | '\\r' ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0 >= '\u0000' && LA55_0 <= '\t')||(LA55_0 >= '\u000B' && LA55_0 <= '\f')||(LA55_0 >= '\u000E' && LA55_0 <= '\uFFFF')) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // DDL.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            // DDL.g:249:79: ( '\\r' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0=='\r') ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // DDL.g:249:79: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONFLICT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:251:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // DDL.g:251:7: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "DEF"
    public final void mDEF() throws RecognitionException {
        try {
            int _type = DEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:253:5: ( ( '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )+ '\\'' ) | ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )+ '\"' ) | ( '`' ( ESC_SEQ |~ ( '\\\\' | '`' ) )+ '`' ) )
            int alt60=3;
            switch ( input.LA(1) ) {
            case '\'':
                {
                alt60=1;
                }
                break;
            case '\"':
                {
                alt60=2;
                }
                break;
            case '`':
                {
                alt60=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;

            }

            switch (alt60) {
                case 1 :
                    // DDL.g:253:7: ( '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )+ '\\'' )
                    {
                    // DDL.g:253:7: ( '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )+ '\\'' )
                    // DDL.g:253:9: '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )+ '\\''
                    {
                    match('\''); 

                    // DDL.g:253:14: ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )+
                    int cnt57=0;
                    loop57:
                    do {
                        int alt57=3;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0=='\\') ) {
                            alt57=1;
                        }
                        else if ( ((LA57_0 >= '\u0000' && LA57_0 <= '&')||(LA57_0 >= '(' && LA57_0 <= '[')||(LA57_0 >= ']' && LA57_0 <= '\uFFFF')) ) {
                            alt57=2;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // DDL.g:253:16: ESC_SEQ
                    	    {
                    	    mESC_SEQ(); 


                    	    }
                    	    break;
                    	case 2 :
                    	    // DDL.g:253:26: ~ ( '\\\\' | '\\'' )
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt57 >= 1 ) break loop57;
                                EarlyExitException eee =
                                    new EarlyExitException(57, input);
                                throw eee;
                        }
                        cnt57++;
                    } while (true);


                    match('\''); 

                    }


                    }
                    break;
                case 2 :
                    // DDL.g:254:4: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )+ '\"' )
                    {
                    // DDL.g:254:4: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )+ '\"' )
                    // DDL.g:254:6: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )+ '\"'
                    {
                    match('\"'); 

                    // DDL.g:254:10: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )+
                    int cnt58=0;
                    loop58:
                    do {
                        int alt58=3;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0=='\\') ) {
                            alt58=1;
                        }
                        else if ( ((LA58_0 >= '\u0000' && LA58_0 <= '!')||(LA58_0 >= '#' && LA58_0 <= '[')||(LA58_0 >= ']' && LA58_0 <= '\uFFFF')) ) {
                            alt58=2;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // DDL.g:254:12: ESC_SEQ
                    	    {
                    	    mESC_SEQ(); 


                    	    }
                    	    break;
                    	case 2 :
                    	    // DDL.g:254:22: ~ ( '\\\\' | '\"' )
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt58 >= 1 ) break loop58;
                                EarlyExitException eee =
                                    new EarlyExitException(58, input);
                                throw eee;
                        }
                        cnt58++;
                    } while (true);


                    match('\"'); 

                    }


                    }
                    break;
                case 3 :
                    // DDL.g:255:4: ( '`' ( ESC_SEQ |~ ( '\\\\' | '`' ) )+ '`' )
                    {
                    // DDL.g:255:4: ( '`' ( ESC_SEQ |~ ( '\\\\' | '`' ) )+ '`' )
                    // DDL.g:255:6: '`' ( ESC_SEQ |~ ( '\\\\' | '`' ) )+ '`'
                    {
                    match('`'); 

                    // DDL.g:255:10: ( ESC_SEQ |~ ( '\\\\' | '`' ) )+
                    int cnt59=0;
                    loop59:
                    do {
                        int alt59=3;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0=='\\') ) {
                            alt59=1;
                        }
                        else if ( ((LA59_0 >= '\u0000' && LA59_0 <= '[')||(LA59_0 >= ']' && LA59_0 <= '_')||(LA59_0 >= 'a' && LA59_0 <= '\uFFFF')) ) {
                            alt59=2;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // DDL.g:255:12: ESC_SEQ
                    	    {
                    	    mESC_SEQ(); 


                    	    }
                    	    break;
                    	case 2 :
                    	    // DDL.g:255:22: ~ ( '\\\\' | '`' )
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt59 >= 1 ) break loop59;
                                EarlyExitException eee =
                                    new EarlyExitException(59, input);
                                throw eee;
                        }
                        cnt59++;
                    } while (true);


                    match('`'); 

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DEF"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // DDL.g:261:2: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // DDL.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // DDL.g:266:2: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt61=3;
            int LA61_0 = input.LA(1);

            if ( (LA61_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt61=1;
                    }
                    break;
                case 'u':
                    {
                    alt61=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt61=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;

            }
            switch (alt61) {
                case 1 :
                    // DDL.g:266:4: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 

                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // DDL.g:267:4: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // DDL.g:268:4: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // DDL.g:273:2: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt62=3;
            int LA62_0 = input.LA(1);

            if ( (LA62_0=='\\') ) {
                int LA62_1 = input.LA(2);

                if ( ((LA62_1 >= '0' && LA62_1 <= '3')) ) {
                    int LA62_2 = input.LA(3);

                    if ( ((LA62_2 >= '0' && LA62_2 <= '7')) ) {
                        int LA62_4 = input.LA(4);

                        if ( ((LA62_4 >= '0' && LA62_4 <= '7')) ) {
                            alt62=1;
                        }
                        else {
                            alt62=2;
                        }
                    }
                    else {
                        alt62=3;
                    }
                }
                else if ( ((LA62_1 >= '4' && LA62_1 <= '7')) ) {
                    int LA62_3 = input.LA(3);

                    if ( ((LA62_3 >= '0' && LA62_3 <= '7')) ) {
                        alt62=2;
                    }
                    else {
                        alt62=3;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;

            }
            switch (alt62) {
                case 1 :
                    // DDL.g:273:4: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // DDL.g:274:4: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // DDL.g:275:4: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // DDL.g:280:2: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // DDL.g:280:4: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
            match('\\'); 

            match('u'); 

            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            mHEX_DIGIT(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // DDL.g:1:8: ( T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | DROP | CREATE | DATABASE | TABLE | IF | NOT | EXISTS | ENUM | NULL | DEFAULT | KEY | HASH | UNIQUE | PRIMARY | FOREIGN | INDEX | CONSTRAINT | FULLTEXT | REFERENCES | ON | INTO | VALUES | DELETE | CASCADE | RESTRICT | ACTION | NO | SET | INSERT | UPDATE | UNSIGNED | BINARY | AUTO_INC | ASC | DESC | CHARACTER | COLLATE | USE | SCHEMA | COMMIT | IS | CHECK | IGNORE | ID | INT | COMMENT | CONFLICT | WS | DEF )
        int alt63=56;
        alt63 = dfa63.predict(input);
        switch (alt63) {
            case 1 :
                // DDL.g:1:10: T__57
                {
                mT__57(); 


                }
                break;
            case 2 :
                // DDL.g:1:16: T__58
                {
                mT__58(); 


                }
                break;
            case 3 :
                // DDL.g:1:22: T__59
                {
                mT__59(); 


                }
                break;
            case 4 :
                // DDL.g:1:28: T__60
                {
                mT__60(); 


                }
                break;
            case 5 :
                // DDL.g:1:34: T__61
                {
                mT__61(); 


                }
                break;
            case 6 :
                // DDL.g:1:40: T__62
                {
                mT__62(); 


                }
                break;
            case 7 :
                // DDL.g:1:46: T__63
                {
                mT__63(); 


                }
                break;
            case 8 :
                // DDL.g:1:52: DROP
                {
                mDROP(); 


                }
                break;
            case 9 :
                // DDL.g:1:57: CREATE
                {
                mCREATE(); 


                }
                break;
            case 10 :
                // DDL.g:1:64: DATABASE
                {
                mDATABASE(); 


                }
                break;
            case 11 :
                // DDL.g:1:73: TABLE
                {
                mTABLE(); 


                }
                break;
            case 12 :
                // DDL.g:1:79: IF
                {
                mIF(); 


                }
                break;
            case 13 :
                // DDL.g:1:82: NOT
                {
                mNOT(); 


                }
                break;
            case 14 :
                // DDL.g:1:86: EXISTS
                {
                mEXISTS(); 


                }
                break;
            case 15 :
                // DDL.g:1:93: ENUM
                {
                mENUM(); 


                }
                break;
            case 16 :
                // DDL.g:1:98: NULL
                {
                mNULL(); 


                }
                break;
            case 17 :
                // DDL.g:1:103: DEFAULT
                {
                mDEFAULT(); 


                }
                break;
            case 18 :
                // DDL.g:1:111: KEY
                {
                mKEY(); 


                }
                break;
            case 19 :
                // DDL.g:1:115: HASH
                {
                mHASH(); 


                }
                break;
            case 20 :
                // DDL.g:1:120: UNIQUE
                {
                mUNIQUE(); 


                }
                break;
            case 21 :
                // DDL.g:1:127: PRIMARY
                {
                mPRIMARY(); 


                }
                break;
            case 22 :
                // DDL.g:1:135: FOREIGN
                {
                mFOREIGN(); 


                }
                break;
            case 23 :
                // DDL.g:1:143: INDEX
                {
                mINDEX(); 


                }
                break;
            case 24 :
                // DDL.g:1:149: CONSTRAINT
                {
                mCONSTRAINT(); 


                }
                break;
            case 25 :
                // DDL.g:1:160: FULLTEXT
                {
                mFULLTEXT(); 


                }
                break;
            case 26 :
                // DDL.g:1:169: REFERENCES
                {
                mREFERENCES(); 


                }
                break;
            case 27 :
                // DDL.g:1:180: ON
                {
                mON(); 


                }
                break;
            case 28 :
                // DDL.g:1:183: INTO
                {
                mINTO(); 


                }
                break;
            case 29 :
                // DDL.g:1:188: VALUES
                {
                mVALUES(); 


                }
                break;
            case 30 :
                // DDL.g:1:195: DELETE
                {
                mDELETE(); 


                }
                break;
            case 31 :
                // DDL.g:1:202: CASCADE
                {
                mCASCADE(); 


                }
                break;
            case 32 :
                // DDL.g:1:210: RESTRICT
                {
                mRESTRICT(); 


                }
                break;
            case 33 :
                // DDL.g:1:219: ACTION
                {
                mACTION(); 


                }
                break;
            case 34 :
                // DDL.g:1:226: NO
                {
                mNO(); 


                }
                break;
            case 35 :
                // DDL.g:1:229: SET
                {
                mSET(); 


                }
                break;
            case 36 :
                // DDL.g:1:233: INSERT
                {
                mINSERT(); 


                }
                break;
            case 37 :
                // DDL.g:1:240: UPDATE
                {
                mUPDATE(); 


                }
                break;
            case 38 :
                // DDL.g:1:247: UNSIGNED
                {
                mUNSIGNED(); 


                }
                break;
            case 39 :
                // DDL.g:1:256: BINARY
                {
                mBINARY(); 


                }
                break;
            case 40 :
                // DDL.g:1:263: AUTO_INC
                {
                mAUTO_INC(); 


                }
                break;
            case 41 :
                // DDL.g:1:272: ASC
                {
                mASC(); 


                }
                break;
            case 42 :
                // DDL.g:1:276: DESC
                {
                mDESC(); 


                }
                break;
            case 43 :
                // DDL.g:1:281: CHARACTER
                {
                mCHARACTER(); 


                }
                break;
            case 44 :
                // DDL.g:1:291: COLLATE
                {
                mCOLLATE(); 


                }
                break;
            case 45 :
                // DDL.g:1:299: USE
                {
                mUSE(); 


                }
                break;
            case 46 :
                // DDL.g:1:303: SCHEMA
                {
                mSCHEMA(); 


                }
                break;
            case 47 :
                // DDL.g:1:310: COMMIT
                {
                mCOMMIT(); 


                }
                break;
            case 48 :
                // DDL.g:1:317: IS
                {
                mIS(); 


                }
                break;
            case 49 :
                // DDL.g:1:320: CHECK
                {
                mCHECK(); 


                }
                break;
            case 50 :
                // DDL.g:1:326: IGNORE
                {
                mIGNORE(); 


                }
                break;
            case 51 :
                // DDL.g:1:333: ID
                {
                mID(); 


                }
                break;
            case 52 :
                // DDL.g:1:336: INT
                {
                mINT(); 


                }
                break;
            case 53 :
                // DDL.g:1:340: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 54 :
                // DDL.g:1:348: CONFLICT
                {
                mCONFLICT(); 


                }
                break;
            case 55 :
                // DDL.g:1:357: WS
                {
                mWS(); 


                }
                break;
            case 56 :
                // DDL.g:1:360: DEF
                {
                mDEF(); 


                }
                break;

        }

    }


    protected DFA54 dfa54 = new DFA54(this);
    protected DFA63 dfa63 = new DFA63(this);
    static final String DFA54_eotS =
        "\26\uffff";
    static final String DFA54_eofS =
        "\26\uffff";
    static final String DFA54_minS =
        "\2\0\1\uffff\6\0\1\uffff\2\0\1\uffff\2\0\1\uffff\2\0\1\uffff\2\0"+
        "\1\uffff";
    static final String DFA54_maxS =
        "\2\uffff\1\uffff\6\uffff\1\uffff\2\uffff\1\uffff\2\uffff\1\uffff"+
        "\2\uffff\1\uffff\2\uffff\1\uffff";
    static final String DFA54_acceptS =
        "\2\uffff\1\1\6\uffff\1\2\2\uffff\1\2\2\uffff\1\2\2\uffff\1\2\2\uffff"+
        "\1\2";
    static final String DFA54_specialS =
        "\1\5\1\14\1\uffff\1\17\1\6\1\7\1\0\1\11\1\2\1\uffff\1\15\1\16\1"+
        "\uffff\1\12\1\10\1\uffff\1\4\1\3\1\uffff\1\1\1\13\1\uffff}>";
    static final String[] DFA54_transitionS = {
            "\76\2\1\1\uffc1\2",
            "\76\2\1\3\uffc1\2",
            "",
            "\76\2\1\4\uffc1\2",
            "\76\2\1\5\uffc1\2",
            "\76\2\1\6\uffc1\2",
            "\76\2\1\7\uffc1\2",
            "\76\2\1\10\uffc1\2",
            "\12\12\1\14\2\12\1\13\60\12\1\11\uffc1\12",
            "",
            "\12\12\1\14\2\12\1\13\60\12\1\15\uffc1\12",
            "\12\2\1\14\ufff5\2",
            "",
            "\12\12\1\17\2\12\1\13\60\12\1\16\uffc1\12",
            "\12\12\1\17\2\12\1\13\60\12\1\20\uffc1\12",
            "",
            "\12\12\1\22\2\12\1\13\60\12\1\21\uffc1\12",
            "\12\12\1\22\2\12\1\13\60\12\1\23\uffc1\12",
            "",
            "\12\12\1\25\2\12\1\13\60\12\1\24\uffc1\12",
            "\12\12\1\25\2\12\1\13\60\12\1\11\uffc1\12",
            ""
    };

    static final short[] DFA54_eot = DFA.unpackEncodedString(DFA54_eotS);
    static final short[] DFA54_eof = DFA.unpackEncodedString(DFA54_eofS);
    static final char[] DFA54_min = DFA.unpackEncodedStringToUnsignedChars(DFA54_minS);
    static final char[] DFA54_max = DFA.unpackEncodedStringToUnsignedChars(DFA54_maxS);
    static final short[] DFA54_accept = DFA.unpackEncodedString(DFA54_acceptS);
    static final short[] DFA54_special = DFA.unpackEncodedString(DFA54_specialS);
    static final short[][] DFA54_transition;

    static {
        int numStates = DFA54_transitionS.length;
        DFA54_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA54_transition[i] = DFA.unpackEncodedString(DFA54_transitionS[i]);
        }
    }

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = DFA54_eot;
            this.eof = DFA54_eof;
            this.min = DFA54_min;
            this.max = DFA54_max;
            this.accept = DFA54_accept;
            this.special = DFA54_special;
            this.transition = DFA54_transition;
        }
        public String getDescription() {
            return "()* loopback of 249:22: ( options {greedy=false; } : . )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_6 = input.LA(1);

                        s = -1;
                        if ( (LA54_6=='>') ) {s = 7;}

                        else if ( ((LA54_6 >= '\u0000' && LA54_6 <= '=')||(LA54_6 >= '?' && LA54_6 <= '\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA54_19 = input.LA(1);

                        s = -1;
                        if ( (LA54_19=='>') ) {s = 20;}

                        else if ( (LA54_19=='\r') ) {s = 11;}

                        else if ( (LA54_19=='\n') ) {s = 21;}

                        else if ( ((LA54_19 >= '\u0000' && LA54_19 <= '\t')||(LA54_19 >= '\u000B' && LA54_19 <= '\f')||(LA54_19 >= '\u000E' && LA54_19 <= '=')||(LA54_19 >= '?' && LA54_19 <= '\uFFFF')) ) {s = 10;}

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA54_8 = input.LA(1);

                        s = -1;
                        if ( (LA54_8=='>') ) {s = 9;}

                        else if ( ((LA54_8 >= '\u0000' && LA54_8 <= '\t')||(LA54_8 >= '\u000B' && LA54_8 <= '\f')||(LA54_8 >= '\u000E' && LA54_8 <= '=')||(LA54_8 >= '?' && LA54_8 <= '\uFFFF')) ) {s = 10;}

                        else if ( (LA54_8=='\r') ) {s = 11;}

                        else if ( (LA54_8=='\n') ) {s = 12;}

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA54_17 = input.LA(1);

                        s = -1;
                        if ( (LA54_17=='>') ) {s = 19;}

                        else if ( (LA54_17=='\r') ) {s = 11;}

                        else if ( (LA54_17=='\n') ) {s = 18;}

                        else if ( ((LA54_17 >= '\u0000' && LA54_17 <= '\t')||(LA54_17 >= '\u000B' && LA54_17 <= '\f')||(LA54_17 >= '\u000E' && LA54_17 <= '=')||(LA54_17 >= '?' && LA54_17 <= '\uFFFF')) ) {s = 10;}

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA54_16 = input.LA(1);

                        s = -1;
                        if ( (LA54_16=='>') ) {s = 17;}

                        else if ( (LA54_16=='\r') ) {s = 11;}

                        else if ( (LA54_16=='\n') ) {s = 18;}

                        else if ( ((LA54_16 >= '\u0000' && LA54_16 <= '\t')||(LA54_16 >= '\u000B' && LA54_16 <= '\f')||(LA54_16 >= '\u000E' && LA54_16 <= '=')||(LA54_16 >= '?' && LA54_16 <= '\uFFFF')) ) {s = 10;}

                        if ( s>=0 ) return s;
                        break;

                    case 5 : 
                        int LA54_0 = input.LA(1);

                        s = -1;
                        if ( (LA54_0=='>') ) {s = 1;}

                        else if ( ((LA54_0 >= '\u0000' && LA54_0 <= '=')||(LA54_0 >= '?' && LA54_0 <= '\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;

                    case 6 : 
                        int LA54_4 = input.LA(1);

                        s = -1;
                        if ( (LA54_4=='>') ) {s = 5;}

                        else if ( ((LA54_4 >= '\u0000' && LA54_4 <= '=')||(LA54_4 >= '?' && LA54_4 <= '\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;

                    case 7 : 
                        int LA54_5 = input.LA(1);

                        s = -1;
                        if ( (LA54_5=='>') ) {s = 6;}

                        else if ( ((LA54_5 >= '\u0000' && LA54_5 <= '=')||(LA54_5 >= '?' && LA54_5 <= '\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;

                    case 8 : 
                        int LA54_14 = input.LA(1);

                        s = -1;
                        if ( (LA54_14=='>') ) {s = 16;}

                        else if ( (LA54_14=='\r') ) {s = 11;}

                        else if ( (LA54_14=='\n') ) {s = 15;}

                        else if ( ((LA54_14 >= '\u0000' && LA54_14 <= '\t')||(LA54_14 >= '\u000B' && LA54_14 <= '\f')||(LA54_14 >= '\u000E' && LA54_14 <= '=')||(LA54_14 >= '?' && LA54_14 <= '\uFFFF')) ) {s = 10;}

                        if ( s>=0 ) return s;
                        break;

                    case 9 : 
                        int LA54_7 = input.LA(1);

                        s = -1;
                        if ( (LA54_7=='>') ) {s = 8;}

                        else if ( ((LA54_7 >= '\u0000' && LA54_7 <= '=')||(LA54_7 >= '?' && LA54_7 <= '\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;

                    case 10 : 
                        int LA54_13 = input.LA(1);

                        s = -1;
                        if ( (LA54_13=='>') ) {s = 14;}

                        else if ( (LA54_13=='\r') ) {s = 11;}

                        else if ( (LA54_13=='\n') ) {s = 15;}

                        else if ( ((LA54_13 >= '\u0000' && LA54_13 <= '\t')||(LA54_13 >= '\u000B' && LA54_13 <= '\f')||(LA54_13 >= '\u000E' && LA54_13 <= '=')||(LA54_13 >= '?' && LA54_13 <= '\uFFFF')) ) {s = 10;}

                        if ( s>=0 ) return s;
                        break;

                    case 11 : 
                        int LA54_20 = input.LA(1);

                        s = -1;
                        if ( (LA54_20=='>') ) {s = 9;}

                        else if ( (LA54_20=='\r') ) {s = 11;}

                        else if ( (LA54_20=='\n') ) {s = 21;}

                        else if ( ((LA54_20 >= '\u0000' && LA54_20 <= '\t')||(LA54_20 >= '\u000B' && LA54_20 <= '\f')||(LA54_20 >= '\u000E' && LA54_20 <= '=')||(LA54_20 >= '?' && LA54_20 <= '\uFFFF')) ) {s = 10;}

                        if ( s>=0 ) return s;
                        break;

                    case 12 : 
                        int LA54_1 = input.LA(1);

                        s = -1;
                        if ( (LA54_1=='>') ) {s = 3;}

                        else if ( ((LA54_1 >= '\u0000' && LA54_1 <= '=')||(LA54_1 >= '?' && LA54_1 <= '\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;

                    case 13 : 
                        int LA54_10 = input.LA(1);

                        s = -1;
                        if ( (LA54_10=='\r') ) {s = 11;}

                        else if ( (LA54_10=='\n') ) {s = 12;}

                        else if ( (LA54_10=='>') ) {s = 13;}

                        else if ( ((LA54_10 >= '\u0000' && LA54_10 <= '\t')||(LA54_10 >= '\u000B' && LA54_10 <= '\f')||(LA54_10 >= '\u000E' && LA54_10 <= '=')||(LA54_10 >= '?' && LA54_10 <= '\uFFFF')) ) {s = 10;}

                        if ( s>=0 ) return s;
                        break;

                    case 14 : 
                        int LA54_11 = input.LA(1);

                        s = -1;
                        if ( (LA54_11=='\n') ) {s = 12;}

                        else if ( ((LA54_11 >= '\u0000' && LA54_11 <= '\t')||(LA54_11 >= '\u000B' && LA54_11 <= '\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;

                    case 15 : 
                        int LA54_3 = input.LA(1);

                        s = -1;
                        if ( (LA54_3=='>') ) {s = 4;}

                        else if ( ((LA54_3 >= '\u0000' && LA54_3 <= '=')||(LA54_3 >= '?' && LA54_3 <= '\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 54, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA63_eotS =
        "\1\24\7\uffff\14\52\1\uffff\25\52\10\uffff\20\52\1\u008e\1\52\1"+
        "\u0092\1\52\1\u008e\1\52\1\u0092\1\52\1\u0099\2\52\1\u0099\26\52"+
        "\2\u00b7\50\52\1\uffff\3\52\1\uffff\5\52\1\u00e8\1\uffff\2\52\1"+
        "\u00e8\5\52\2\u00f0\4\52\1\u00f5\3\52\1\u00f5\12\52\1\uffff\4\52"+
        "\1\u0107\2\52\1\u0107\1\u010a\1\52\1\u010a\3\52\1\u010f\3\52\1\u0113"+
        "\1\u010f\3\52\1\u0113\21\52\1\u0128\3\52\1\u0128\2\52\1\uffff\3"+
        "\24\1\52\1\u012f\1\52\1\u012f\1\uffff\4\52\1\uffff\21\52\1\uffff"+
        "\2\52\1\uffff\4\52\1\uffff\3\52\1\uffff\11\52\1\u0158\6\52\1\u0158"+
        "\2\u015f\1\u0160\1\uffff\2\52\1\u0160\3\52\1\uffff\36\52\1\u0184"+
        "\2\52\1\u0184\1\u0187\2\52\1\u018a\2\52\1\uffff\1\u0187\2\52\1\u018a"+
        "\2\52\2\uffff\1\u0191\1\u0192\1\u0191\1\u0192\2\u0193\1\52\1\u0195"+
        "\1\52\1\u0197\1\u0195\1\52\1\u0197\12\52\2\u01a3\1\u01a4\1\52\1"+
        "\u01a4\1\52\2\u01a7\2\u01a8\1\52\1\u01aa\1\uffff\1\52\1\u01aa\1"+
        "\uffff\1\52\1\u01ad\1\uffff\1\u01ae\2\52\1\u01ad\1\u01ae\1\52\3"+
        "\uffff\1\52\1\uffff\1\52\1\uffff\1\52\2\u01b5\1\u01b6\1\52\1\u01b6"+
        "\5\52\2\uffff\2\52\2\uffff\1\u01bf\1\uffff\1\u01bf\1\52\2\uffff"+
        "\3\52\1\u01c4\2\u01c5\2\uffff\2\u01c6\1\52\1\u01c8\1\52\1\u01c8"+
        "\2\52\1\uffff\1\52\1\u01cd\1\52\1\u01cd\3\uffff\1\52\1\uffff\3\52"+
        "\1\u01d3\1\uffff\1\u01d3\2\u01d4\2\52\2\uffff\6\52\2\u01dd\1\uffff";
    static final String DFA63_eofS =
        "\u01de\uffff";
    static final String DFA63_minS =
        "\1\11\6\uffff\1\0\1\101\1\141\1\101\1\141\1\101\1\141\1\106\1\146"+
        "\1\117\1\157\1\116\1\156\1\uffff\1\105\1\145\1\101\1\116\1\156\1"+
        "\122\1\162\1\117\1\157\1\105\1\145\1\116\1\156\1\101\1\141\1\103"+
        "\1\143\1\103\1\143\1\111\1\151\1\uffff\1\55\6\uffff\1\117\1\124"+
        "\1\106\1\157\1\164\1\146\1\105\1\114\1\123\1\101\1\145\1\154\1\163"+
        "\1\141\1\102\1\142\1\60\1\104\1\60\1\116\1\60\1\144\1\60\1\156\1"+
        "\60\1\114\1\154\1\60\1\154\1\111\1\125\1\151\1\165\1\131\1\171\1"+
        "\123\1\111\1\104\1\105\1\151\1\144\1\145\1\111\1\151\1\122\1\114"+
        "\1\162\1\154\1\106\1\146\2\60\1\114\1\154\2\124\1\103\2\164\1\143"+
        "\1\124\1\110\1\164\1\150\1\116\1\156\1\120\2\101\1\105\1\103\1\160"+
        "\2\141\1\145\1\143\1\101\1\123\1\114\1\115\1\103\1\122\1\103\1\141"+
        "\1\163\1\154\1\155\1\143\1\162\1\143\1\114\1\154\1\uffff\1\105\1"+
        "\117\1\105\1\uffff\1\117\1\145\1\157\1\145\1\157\1\60\1\uffff\1"+
        "\114\1\154\1\60\1\154\1\123\1\115\1\163\1\155\2\60\1\110\1\121\1"+
        "\111\1\101\1\60\1\161\1\151\1\141\1\60\1\115\1\155\1\105\1\114\1"+
        "\145\1\154\1\105\1\124\1\145\1\164\1\uffff\1\125\1\165\1\111\1\117"+
        "\1\60\1\151\1\157\2\60\1\105\1\60\1\145\1\101\1\141\1\60\1\102\1"+
        "\125\1\124\2\60\1\142\1\165\1\164\1\60\2\124\1\101\1\111\2\101\1"+
        "\113\2\164\1\141\1\151\2\141\1\153\1\105\1\145\1\130\1\60\2\122"+
        "\1\170\1\60\2\162\1\uffff\3\60\1\124\1\60\1\164\1\60\1\uffff\1\150"+
        "\1\125\1\107\1\124\1\uffff\1\165\1\147\1\164\1\101\1\141\1\111\1"+
        "\124\1\151\1\164\2\122\2\162\1\105\1\145\1\117\1\137\1\uffff\1\157"+
        "\1\137\1\uffff\1\115\1\155\1\122\1\162\1\uffff\1\101\1\114\1\105"+
        "\1\uffff\1\141\1\154\1\145\1\105\1\122\2\124\1\104\1\103\1\60\1"+
        "\145\1\162\2\164\1\144\1\143\4\60\1\uffff\1\124\1\105\1\60\1\164"+
        "\1\145\1\123\1\uffff\1\163\1\141\1\105\1\116\1\105\1\145\1\156\1"+
        "\145\1\122\1\162\1\107\1\105\1\147\1\145\1\105\1\111\1\145\1\151"+
        "\1\123\1\163\1\116\1\111\1\156\1\151\1\101\1\141\1\131\1\171\1\123"+
        "\1\124\1\60\1\163\1\164\2\60\1\101\1\105\1\60\1\105\1\124\1\uffff"+
        "\1\60\1\141\1\145\1\60\1\145\1\164\2\uffff\6\60\1\163\1\60\1\105"+
        "\2\60\1\145\1\60\1\131\1\171\1\116\1\130\1\156\1\170\1\116\1\103"+
        "\1\156\1\143\3\60\1\116\1\60\1\156\4\60\1\105\1\60\1\uffff\1\145"+
        "\1\60\1\uffff\1\111\1\60\1\uffff\1\60\1\105\1\151\2\60\1\145\3\uffff"+
        "\1\150\1\uffff\1\104\1\uffff\1\144\3\60\1\124\1\60\1\164\1\103\1"+
        "\124\1\143\1\164\2\uffff\1\103\1\143\2\uffff\1\60\1\uffff\1\60\1"+
        "\116\2\uffff\1\122\1\156\1\162\3\60\2\uffff\2\60\1\105\1\60\1\145"+
        "\1\60\1\122\1\162\1\uffff\1\124\1\60\1\164\1\60\3\uffff\1\123\1"+
        "\uffff\1\163\1\105\1\145\1\60\1\uffff\3\60\1\115\1\155\2\uffff\1"+
        "\105\1\145\1\116\1\156\1\124\1\164\2\60\1\uffff";
    static final String DFA63_maxS =
        "\1\172\6\uffff\1\uffff\1\122\1\162\1\122\1\162\1\101\1\141\1\123"+
        "\1\163\2\165\1\130\1\170\1\uffff\1\105\1\145\1\101\1\123\1\163\1"+
        "\122\1\162\1\125\1\165\1\105\1\145\1\116\1\156\1\101\1\141\1\125"+
        "\1\165\1\105\1\145\1\111\1\151\1\uffff\1\71\6\uffff\1\117\1\124"+
        "\1\123\1\157\1\164\1\163\1\105\1\116\1\123\1\105\1\145\1\156\1\163"+
        "\1\145\1\102\1\142\1\172\1\124\1\172\1\116\1\172\1\164\1\172\1\156"+
        "\1\172\1\114\1\154\1\172\1\154\1\111\1\125\1\151\1\165\1\131\1\171"+
        "\2\123\1\104\1\105\1\163\1\144\1\145\1\111\1\151\1\122\1\114\1\162"+
        "\1\154\1\123\1\163\2\172\1\114\1\154\2\124\1\103\2\164\1\143\1\124"+
        "\1\110\1\164\1\150\1\116\1\156\1\120\2\101\1\105\1\103\1\160\2\141"+
        "\1\145\1\143\1\101\1\123\1\114\1\115\1\103\1\122\1\103\1\141\1\163"+
        "\1\154\1\155\1\143\1\162\1\143\1\114\1\154\1\uffff\1\105\1\117\1"+
        "\105\1\uffff\1\117\1\145\1\157\1\145\1\157\1\172\1\uffff\1\114\1"+
        "\154\1\172\1\154\1\123\1\115\1\163\1\155\2\172\1\110\1\121\1\111"+
        "\1\101\1\172\1\161\1\151\1\141\1\172\1\115\1\155\1\105\1\114\1\145"+
        "\1\154\1\105\1\124\1\145\1\164\1\uffff\1\125\1\165\1\111\1\117\1"+
        "\172\1\151\1\157\2\172\1\105\1\172\1\145\1\101\1\141\1\172\1\102"+
        "\1\125\1\124\2\172\1\142\1\165\1\164\1\172\2\124\1\101\1\111\2\101"+
        "\1\113\2\164\1\141\1\151\2\141\1\153\1\105\1\145\1\130\1\172\2\122"+
        "\1\170\1\172\2\162\1\uffff\3\172\1\124\1\172\1\164\1\172\1\uffff"+
        "\1\150\1\125\1\107\1\124\1\uffff\1\165\1\147\1\164\1\101\1\141\1"+
        "\111\1\124\1\151\1\164\2\122\2\162\1\105\1\145\1\117\1\137\1\uffff"+
        "\1\157\1\137\1\uffff\1\115\1\155\1\122\1\162\1\uffff\1\101\1\114"+
        "\1\105\1\uffff\1\141\1\154\1\145\1\105\1\122\2\124\1\104\1\103\1"+
        "\172\1\145\1\162\2\164\1\144\1\143\4\172\1\uffff\1\124\1\105\1\172"+
        "\1\164\1\145\1\123\1\uffff\1\163\1\141\1\105\1\116\1\105\1\145\1"+
        "\156\1\145\1\122\1\162\1\107\1\105\1\147\1\145\1\105\1\111\1\145"+
        "\1\151\1\123\1\163\1\116\1\111\1\156\1\151\1\101\1\141\1\131\1\171"+
        "\1\123\1\124\1\172\1\163\1\164\2\172\1\101\1\105\1\172\1\105\1\124"+
        "\1\uffff\1\172\1\141\1\145\1\172\1\145\1\164\2\uffff\6\172\1\163"+
        "\1\172\1\105\2\172\1\145\1\172\1\131\1\171\1\116\1\130\1\156\1\170"+
        "\1\116\1\103\1\156\1\143\3\172\1\116\1\172\1\156\4\172\1\105\1\172"+
        "\1\uffff\1\145\1\172\1\uffff\1\111\1\172\1\uffff\1\172\1\105\1\151"+
        "\2\172\1\145\3\uffff\1\150\1\uffff\1\104\1\uffff\1\144\3\172\1\124"+
        "\1\172\1\164\1\103\1\124\1\143\1\164\2\uffff\1\103\1\143\2\uffff"+
        "\1\172\1\uffff\1\172\1\116\2\uffff\1\122\1\156\1\162\3\172\2\uffff"+
        "\2\172\1\105\1\172\1\145\1\172\1\122\1\162\1\uffff\1\124\1\172\1"+
        "\164\1\172\3\uffff\1\123\1\uffff\1\163\1\105\1\145\1\172\1\uffff"+
        "\3\172\1\115\1\155\2\uffff\1\105\1\145\1\116\1\156\1\124\1\164\2"+
        "\172\1\uffff";
    static final String DFA63_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\15\uffff\1\20\25\uffff\1\63\1\uffff"+
        "\1\64\1\65\1\66\1\67\1\70\1\7\134\uffff\1\14\3\uffff\1\60\6\uffff"+
        "\1\42\35\uffff\1\33\60\uffff\1\15\7\uffff\1\22\4\uffff\1\55\21\uffff"+
        "\1\51\2\uffff\1\43\4\uffff\1\10\3\uffff\1\52\24\uffff\1\34\6\uffff"+
        "\1\17\50\uffff\1\61\6\uffff\1\13\1\27\43\uffff\1\36\2\uffff\1\11"+
        "\2\uffff\1\57\6\uffff\1\44\1\62\1\16\1\uffff\1\24\1\uffff\1\45\13"+
        "\uffff\1\35\1\41\2\uffff\1\56\1\47\1\uffff\1\21\2\uffff\1\54\1\37"+
        "\6\uffff\1\25\1\26\10\uffff\1\12\4\uffff\1\23\1\46\1\31\1\uffff"+
        "\1\40\4\uffff\1\53\5\uffff\1\30\1\32\10\uffff\1\50";
    static final String DFA63_specialS =
        "\7\uffff\1\0\u01d6\uffff}>";
    static final String[] DFA63_transitionS = {
            "\2\57\2\uffff\1\57\22\uffff\1\57\1\uffff\1\60\1\55\3\uffff\1"+
            "\7\1\1\1\2\2\uffff\1\3\1\53\1\4\1\55\12\54\1\uffff\1\5\1\56"+
            "\1\6\3\uffff\1\44\1\50\1\12\1\10\1\22\1\34\1\52\1\27\1\16\1"+
            "\52\1\25\2\52\1\20\1\40\1\32\1\52\1\36\1\46\1\14\1\30\1\42\4"+
            "\52\4\uffff\1\52\1\60\1\45\1\51\1\13\1\11\1\23\1\35\2\52\1\17"+
            "\1\52\1\26\2\52\1\21\1\41\1\33\1\52\1\37\1\47\1\15\1\31\1\43"+
            "\4\52",
            "",
            "",
            "",
            "",
            "",
            "",
            "\47\60\1\61\uffd8\60",
            "\1\63\3\uffff\1\64\14\uffff\1\62",
            "\1\66\3\uffff\1\67\14\uffff\1\65",
            "\1\72\6\uffff\1\73\6\uffff\1\71\2\uffff\1\70",
            "\1\76\6\uffff\1\77\6\uffff\1\75\2\uffff\1\74",
            "\1\100",
            "\1\101",
            "\1\102\1\105\6\uffff\1\103\4\uffff\1\104",
            "\1\106\1\111\6\uffff\1\107\4\uffff\1\110",
            "\1\112\5\uffff\1\113\37\uffff\1\114",
            "\1\115\5\uffff\1\116",
            "\1\120\11\uffff\1\117",
            "\1\122\11\uffff\1\121",
            "",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126\1\uffff\1\127\2\uffff\1\130",
            "\1\131\1\uffff\1\132\2\uffff\1\133",
            "\1\134",
            "\1\135",
            "\1\136\5\uffff\1\137",
            "\1\140\5\uffff\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150\17\uffff\1\152\1\uffff\1\151",
            "\1\153\17\uffff\1\155\1\uffff\1\154",
            "\1\157\1\uffff\1\156",
            "\1\161\1\uffff\1\160",
            "\1\162",
            "\1\163",
            "",
            "\1\55\2\uffff\12\54",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\164",
            "\1\165",
            "\1\166\5\uffff\1\167\6\uffff\1\170",
            "\1\171",
            "\1\172",
            "\1\173\5\uffff\1\174\6\uffff\1\175",
            "\1\176",
            "\1\u0080\1\u0081\1\177",
            "\1\u0082",
            "\1\u0083\3\uffff\1\u0084",
            "\1\u0085",
            "\1\u0087\1\u0088\1\u0086",
            "\1\u0089",
            "\1\u008a\3\uffff\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u008f\16\uffff\1\u0091\1\u0090",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0093",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0094\16\uffff\1\u0096\1\u0095",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0097",
            "\12\52\7\uffff\23\52\1\u0098\6\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u009a",
            "\1\u009b",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\u009c\6\52",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5\11\uffff\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9\11\uffff\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3\14\uffff\1\u00b4",
            "\1\u00b5\14\uffff\1\u00b6",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u00e9",
            "\1\u00ea",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0108",
            "\1\u0109",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u010b",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u012c",
            "\1\u012d",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u012e",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0130",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "",
            "\1\u0146",
            "\1\u0147",
            "",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u0161",
            "\1\u0162",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0185",
            "\1\u0186",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0188",
            "\1\u0189",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u018b",
            "\1\u018c",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u018d",
            "\1\u018e",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u018f",
            "\1\u0190",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0194",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0196",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0198",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01a5",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01a6",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01a9",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u01ab",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u01ac",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01af",
            "\1\u01b0",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01b1",
            "",
            "",
            "",
            "\1\u01b2",
            "",
            "\1\u01b3",
            "",
            "\1\u01b4",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01b7",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "",
            "",
            "\1\u01bd",
            "\1\u01be",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01c0",
            "",
            "",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01c7",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01c9",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01ca",
            "\1\u01cb",
            "",
            "\1\u01cc",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01ce",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "\1\u01cf",
            "",
            "\1\u01d0",
            "\1\u01d1",
            "\1\u01d2",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01d5",
            "\1\u01d6",
            "",
            "",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            ""
    };

    static final short[] DFA63_eot = DFA.unpackEncodedString(DFA63_eotS);
    static final short[] DFA63_eof = DFA.unpackEncodedString(DFA63_eofS);
    static final char[] DFA63_min = DFA.unpackEncodedStringToUnsignedChars(DFA63_minS);
    static final char[] DFA63_max = DFA.unpackEncodedStringToUnsignedChars(DFA63_maxS);
    static final short[] DFA63_accept = DFA.unpackEncodedString(DFA63_acceptS);
    static final short[] DFA63_special = DFA.unpackEncodedString(DFA63_specialS);
    static final short[][] DFA63_transition;

    static {
        int numStates = DFA63_transitionS.length;
        DFA63_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA63_transition[i] = DFA.unpackEncodedString(DFA63_transitionS[i]);
        }
    }

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = DFA63_eot;
            this.eof = DFA63_eof;
            this.min = DFA63_min;
            this.max = DFA63_max;
            this.accept = DFA63_accept;
            this.special = DFA63_special;
            this.transition = DFA63_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | DROP | CREATE | DATABASE | TABLE | IF | NOT | EXISTS | ENUM | NULL | DEFAULT | KEY | HASH | UNIQUE | PRIMARY | FOREIGN | INDEX | CONSTRAINT | FULLTEXT | REFERENCES | ON | INTO | VALUES | DELETE | CASCADE | RESTRICT | ACTION | NO | SET | INSERT | UPDATE | UNSIGNED | BINARY | AUTO_INC | ASC | DESC | CHARACTER | COLLATE | USE | SCHEMA | COMMIT | IS | CHECK | IGNORE | ID | INT | COMMENT | CONFLICT | WS | DEF );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA63_7 = input.LA(1);

                        s = -1;
                        if ( (LA63_7=='\'') ) {s = 49;}

                        else if ( ((LA63_7 >= '\u0000' && LA63_7 <= '&')||(LA63_7 >= '(' && LA63_7 <= '\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 63, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}