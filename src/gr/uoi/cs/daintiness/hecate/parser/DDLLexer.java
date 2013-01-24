// $ANTLR 3.4 DDL.g 2013-01-24 17:05:59

  package gr.uoi.cs.daintiness.hecate.parser ;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class DDLLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int ACTION=4;
    public static final int ASC=5;
    public static final int AUTO_INC=6;
    public static final int BINARY=7;
    public static final int CASCADE=8;
    public static final int CHARACTER=9;
    public static final int COLLATE=10;
    public static final int COMMENT=11;
    public static final int CREATE=12;
    public static final int DEF=13;
    public static final int DEFAULT=14;
    public static final int DELETE=15;
    public static final int DESC=16;
    public static final int DROP=17;
    public static final int ENUM=18;
    public static final int ESC_SEQ=19;
    public static final int EXISTS=20;
    public static final int FOREIGN=21;
    public static final int FULLTEXT=22;
    public static final int HASH=23;
    public static final int HEX_DIGIT=24;
    public static final int ID=25;
    public static final int IF=26;
    public static final int INDEX=27;
    public static final int INSERT=28;
    public static final int INT=29;
    public static final int INTO=30;
    public static final int KEY=31;
    public static final int NO=32;
    public static final int NOT=33;
    public static final int NULL=34;
    public static final int OCTAL_ESC=35;
    public static final int ON=36;
    public static final int PRIMARY=37;
    public static final int REFERENCES=38;
    public static final int RESTRICT=39;
    public static final int SCHEMA=40;
    public static final int SET=41;
    public static final int TABLE=42;
    public static final int UNICODE_ESC=43;
    public static final int UNIQUE=44;
    public static final int UNSIGNED=45;
    public static final int UPDATE=46;
    public static final int USE=47;
    public static final int VALUES=48;
    public static final int WS=49;

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

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
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
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
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
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
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
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
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
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
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
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
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
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
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
    // $ANTLR end "T__56"

    // $ANTLR start "DROP"
    public final void mDROP() throws RecognitionException {
        try {
            int _type = DROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:170:6: ( 'DROP' | 'drop' )
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
                    // DDL.g:170:8: 'DROP'
                    {
                    match("DROP"); 



                    }
                    break;
                case 2 :
                    // DDL.g:170:17: 'drop'
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
            // DDL.g:171:8: ( 'CREATE' | 'create' )
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
                    // DDL.g:171:10: 'CREATE'
                    {
                    match("CREATE"); 



                    }
                    break;
                case 2 :
                    // DDL.g:171:21: 'create'
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

    // $ANTLR start "TABLE"
    public final void mTABLE() throws RecognitionException {
        try {
            int _type = TABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:172:7: ( 'TABLE' | 'table' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='T') ) {
                alt3=1;
            }
            else if ( (LA3_0=='t') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // DDL.g:172:9: 'TABLE'
                    {
                    match("TABLE"); 



                    }
                    break;
                case 2 :
                    // DDL.g:172:19: 'table'
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
            // DDL.g:173:4: ( 'IF' | 'if' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='I') ) {
                alt4=1;
            }
            else if ( (LA4_0=='i') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // DDL.g:173:6: 'IF'
                    {
                    match("IF"); 



                    }
                    break;
                case 2 :
                    // DDL.g:173:13: 'if'
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
            // DDL.g:174:5: ( 'NOT' | 'not' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='N') ) {
                alt5=1;
            }
            else if ( (LA5_0=='n') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // DDL.g:174:7: 'NOT'
                    {
                    match("NOT"); 



                    }
                    break;
                case 2 :
                    // DDL.g:174:15: 'not'
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
            // DDL.g:175:8: ( 'EXISTS' | 'exists' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='E') ) {
                alt6=1;
            }
            else if ( (LA6_0=='e') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // DDL.g:175:10: 'EXISTS'
                    {
                    match("EXISTS"); 



                    }
                    break;
                case 2 :
                    // DDL.g:175:21: 'exists'
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
            // DDL.g:176:6: ( 'ENUM' | 'enum' )
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
                    // DDL.g:176:8: 'ENUM'
                    {
                    match("ENUM"); 



                    }
                    break;
                case 2 :
                    // DDL.g:176:17: 'enum'
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
            // DDL.g:177:6: ( ( 'NULL' | 'null' )? )
            // DDL.g:177:8: ( 'NULL' | 'null' )?
            {
            // DDL.g:177:8: ( 'NULL' | 'null' )?
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='N') ) {
                alt8=1;
            }
            else if ( (LA8_0=='n') ) {
                alt8=2;
            }
            switch (alt8) {
                case 1 :
                    // DDL.g:177:9: 'NULL'
                    {
                    match("NULL"); 



                    }
                    break;
                case 2 :
                    // DDL.g:177:18: 'null'
                    {
                    match("null"); 



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
            // DDL.g:178:9: ( 'DEFAULT' | 'default' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='D') ) {
                alt9=1;
            }
            else if ( (LA9_0=='d') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // DDL.g:178:11: 'DEFAULT'
                    {
                    match("DEFAULT"); 



                    }
                    break;
                case 2 :
                    // DDL.g:178:23: 'default'
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
            // DDL.g:179:5: ( 'KEY' | 'key' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='K') ) {
                alt10=1;
            }
            else if ( (LA10_0=='k') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // DDL.g:179:7: 'KEY'
                    {
                    match("KEY"); 



                    }
                    break;
                case 2 :
                    // DDL.g:179:15: 'key'
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
            // DDL.g:180:6: ( 'HASH' 'hash' )
            // DDL.g:180:8: 'HASH' 'hash'
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
            // DDL.g:181:8: ( 'UNIQUE' | 'unique' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='U') ) {
                alt11=1;
            }
            else if ( (LA11_0=='u') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // DDL.g:181:10: 'UNIQUE'
                    {
                    match("UNIQUE"); 



                    }
                    break;
                case 2 :
                    // DDL.g:181:21: 'unique'
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
            // DDL.g:182:9: ( 'PRIMARY' | 'primary' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='P') ) {
                alt12=1;
            }
            else if ( (LA12_0=='p') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // DDL.g:182:11: 'PRIMARY'
                    {
                    match("PRIMARY"); 



                    }
                    break;
                case 2 :
                    // DDL.g:182:23: 'primary'
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
            // DDL.g:183:9: ( 'FOREIGN' | 'foreign' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='F') ) {
                alt13=1;
            }
            else if ( (LA13_0=='f') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // DDL.g:183:11: 'FOREIGN'
                    {
                    match("FOREIGN"); 



                    }
                    break;
                case 2 :
                    // DDL.g:183:23: 'foreign'
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
            // DDL.g:184:7: ( 'INDEX' | 'index' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='I') ) {
                alt14=1;
            }
            else if ( (LA14_0=='i') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // DDL.g:184:9: 'INDEX'
                    {
                    match("INDEX"); 



                    }
                    break;
                case 2 :
                    // DDL.g:184:19: 'index'
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

    // $ANTLR start "FULLTEXT"
    public final void mFULLTEXT() throws RecognitionException {
        try {
            int _type = FULLTEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:185:10: ( 'FULLTEXT' | 'fulltext' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='F') ) {
                alt15=1;
            }
            else if ( (LA15_0=='f') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // DDL.g:185:12: 'FULLTEXT'
                    {
                    match("FULLTEXT"); 



                    }
                    break;
                case 2 :
                    // DDL.g:185:25: 'fulltext'
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
            // DDL.g:186:12: ( 'REFERENCES' | 'references' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='R') ) {
                alt16=1;
            }
            else if ( (LA16_0=='r') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // DDL.g:186:14: 'REFERENCES'
                    {
                    match("REFERENCES"); 



                    }
                    break;
                case 2 :
                    // DDL.g:186:29: 'references'
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
            // DDL.g:187:4: ( 'ON' | 'on' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='O') ) {
                alt17=1;
            }
            else if ( (LA17_0=='o') ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // DDL.g:187:6: 'ON'
                    {
                    match("ON"); 



                    }
                    break;
                case 2 :
                    // DDL.g:187:13: 'on'
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
            // DDL.g:188:6: ( 'INTO' | 'into' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='I') ) {
                alt18=1;
            }
            else if ( (LA18_0=='i') ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // DDL.g:188:8: 'INTO'
                    {
                    match("INTO"); 



                    }
                    break;
                case 2 :
                    // DDL.g:188:17: 'into'
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
            // DDL.g:189:8: ( 'VALUES' | 'values' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='V') ) {
                alt19=1;
            }
            else if ( (LA19_0=='v') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // DDL.g:189:10: 'VALUES'
                    {
                    match("VALUES"); 



                    }
                    break;
                case 2 :
                    // DDL.g:189:21: 'values'
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
            // DDL.g:190:8: ( 'DELETE' | 'delete' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='D') ) {
                alt20=1;
            }
            else if ( (LA20_0=='d') ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // DDL.g:190:10: 'DELETE'
                    {
                    match("DELETE"); 



                    }
                    break;
                case 2 :
                    // DDL.g:190:21: 'delete'
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
            // DDL.g:191:9: ( 'CASCADE' | 'cascade' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='C') ) {
                alt21=1;
            }
            else if ( (LA21_0=='c') ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // DDL.g:191:11: 'CASCADE'
                    {
                    match("CASCADE"); 



                    }
                    break;
                case 2 :
                    // DDL.g:191:23: 'cascade'
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
            // DDL.g:192:10: ( 'RESTRICT' | 'restrict' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='R') ) {
                alt22=1;
            }
            else if ( (LA22_0=='r') ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // DDL.g:192:12: 'RESTRICT'
                    {
                    match("RESTRICT"); 



                    }
                    break;
                case 2 :
                    // DDL.g:192:25: 'restrict'
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
            // DDL.g:193:8: ( 'ACTION' | 'action' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='A') ) {
                alt23=1;
            }
            else if ( (LA23_0=='a') ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // DDL.g:193:10: 'ACTION'
                    {
                    match("ACTION"); 



                    }
                    break;
                case 2 :
                    // DDL.g:193:21: 'action'
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
            // DDL.g:194:4: ( 'NO' | 'no' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='N') ) {
                alt24=1;
            }
            else if ( (LA24_0=='n') ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // DDL.g:194:6: 'NO'
                    {
                    match("NO"); 



                    }
                    break;
                case 2 :
                    // DDL.g:194:13: 'no'
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
            // DDL.g:195:5: ( 'SET' | 'set' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='S') ) {
                alt25=1;
            }
            else if ( (LA25_0=='s') ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // DDL.g:195:7: 'SET'
                    {
                    match("SET"); 



                    }
                    break;
                case 2 :
                    // DDL.g:195:15: 'set'
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
            // DDL.g:196:8: ( 'INSERT' | 'insert' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='I') ) {
                alt26=1;
            }
            else if ( (LA26_0=='i') ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // DDL.g:196:10: 'INSERT'
                    {
                    match("INSERT"); 



                    }
                    break;
                case 2 :
                    // DDL.g:196:21: 'insert'
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
            // DDL.g:197:8: ( 'UPDATE' | 'update' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='U') ) {
                alt27=1;
            }
            else if ( (LA27_0=='u') ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // DDL.g:197:10: 'UPDATE'
                    {
                    match("UPDATE"); 



                    }
                    break;
                case 2 :
                    // DDL.g:197:21: 'update'
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
            // DDL.g:198:10: ( 'UNSIGNED' | 'unsigned' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='U') ) {
                alt28=1;
            }
            else if ( (LA28_0=='u') ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // DDL.g:198:12: 'UNSIGNED'
                    {
                    match("UNSIGNED"); 



                    }
                    break;
                case 2 :
                    // DDL.g:198:25: 'unsigned'
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
            // DDL.g:199:8: ( 'BINARY' | 'binary' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='B') ) {
                alt29=1;
            }
            else if ( (LA29_0=='b') ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // DDL.g:199:10: 'BINARY'
                    {
                    match("BINARY"); 



                    }
                    break;
                case 2 :
                    // DDL.g:199:21: 'binary'
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
            // DDL.g:200:10: ( 'AUTO_INCREMENT' | 'auto_increment' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='A') ) {
                alt30=1;
            }
            else if ( (LA30_0=='a') ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // DDL.g:200:12: 'AUTO_INCREMENT'
                    {
                    match("AUTO_INCREMENT"); 



                    }
                    break;
                case 2 :
                    // DDL.g:200:31: 'auto_increment'
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
            // DDL.g:201:5: ( 'ASC' | 'asc' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0=='A') ) {
                alt31=1;
            }
            else if ( (LA31_0=='a') ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }
            switch (alt31) {
                case 1 :
                    // DDL.g:201:7: 'ASC'
                    {
                    match("ASC"); 



                    }
                    break;
                case 2 :
                    // DDL.g:201:15: 'asc'
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
            // DDL.g:202:6: ( 'DESC' | 'desc' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='D') ) {
                alt32=1;
            }
            else if ( (LA32_0=='d') ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // DDL.g:202:8: 'DESC'
                    {
                    match("DESC"); 



                    }
                    break;
                case 2 :
                    // DDL.g:202:17: 'desc'
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
            // DDL.g:203:11: ( 'CHARACTER' | 'character' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0=='C') ) {
                alt33=1;
            }
            else if ( (LA33_0=='c') ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // DDL.g:203:13: 'CHARACTER'
                    {
                    match("CHARACTER"); 



                    }
                    break;
                case 2 :
                    // DDL.g:203:27: 'character'
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
            // DDL.g:204:9: ( 'COLLATE' | 'colate' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='C') ) {
                alt34=1;
            }
            else if ( (LA34_0=='c') ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }
            switch (alt34) {
                case 1 :
                    // DDL.g:204:11: 'COLLATE'
                    {
                    match("COLLATE"); 



                    }
                    break;
                case 2 :
                    // DDL.g:204:23: 'colate'
                    {
                    match("colate"); 



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
            // DDL.g:205:5: ( 'USE' | 'use' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0=='U') ) {
                alt35=1;
            }
            else if ( (LA35_0=='u') ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }
            switch (alt35) {
                case 1 :
                    // DDL.g:205:7: 'USE'
                    {
                    match("USE"); 



                    }
                    break;
                case 2 :
                    // DDL.g:205:15: 'use'
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
            // DDL.g:206:8: ( 'SCHEMA' | 'schema' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0=='S') ) {
                alt36=1;
            }
            else if ( (LA36_0=='s') ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }
            switch (alt36) {
                case 1 :
                    // DDL.g:206:10: 'SCHEMA'
                    {
                    match("SCHEMA"); 



                    }
                    break;
                case 2 :
                    // DDL.g:206:21: 'schema'
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

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:208:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // DDL.g:208:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // DDL.g:208:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0 >= '0' && LA37_0 <= '9')||(LA37_0 >= 'A' && LA37_0 <= 'Z')||LA37_0=='_'||(LA37_0 >= 'a' && LA37_0 <= 'z')) ) {
                    alt37=1;
                }


                switch (alt37) {
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
            	    break loop37;
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
            // DDL.g:210:5: ( ( '-' )? ( '0' .. '9' )+ )
            // DDL.g:210:7: ( '-' )? ( '0' .. '9' )+
            {
            // DDL.g:210:7: ( '-' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0=='-') ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // DDL.g:210:7: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // DDL.g:210:12: ( '0' .. '9' )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0 >= '0' && LA39_0 <= '9')) ) {
                    alt39=1;
                }


                switch (alt39) {
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
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
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
            // DDL.g:213:2: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' | '--' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            int alt47=4;
            switch ( input.LA(1) ) {
            case '/':
                {
                int LA47_1 = input.LA(2);

                if ( (LA47_1=='/') ) {
                    alt47=1;
                }
                else if ( (LA47_1=='*') ) {
                    alt47=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;

                }
                }
                break;
            case '-':
                {
                alt47=3;
                }
                break;
            case '#':
                {
                alt47=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;

            }

            switch (alt47) {
                case 1 :
                    // DDL.g:213:4: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // DDL.g:213:9: (~ ( '\\n' | '\\r' ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( ((LA40_0 >= '\u0000' && LA40_0 <= '\t')||(LA40_0 >= '\u000B' && LA40_0 <= '\f')||(LA40_0 >= '\u000E' && LA40_0 <= '\uFFFF')) ) {
                            alt40=1;
                        }


                        switch (alt40) {
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
                    	    break loop40;
                        }
                    } while (true);


                    // DDL.g:213:23: ( '\\r' )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0=='\r') ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // DDL.g:213:23: '\\r'
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
                    // DDL.g:214:4: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // DDL.g:214:9: ( options {greedy=false; } : . )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0=='*') ) {
                            int LA42_1 = input.LA(2);

                            if ( (LA42_1=='/') ) {
                                alt42=2;
                            }
                            else if ( ((LA42_1 >= '\u0000' && LA42_1 <= '.')||(LA42_1 >= '0' && LA42_1 <= '\uFFFF')) ) {
                                alt42=1;
                            }


                        }
                        else if ( ((LA42_0 >= '\u0000' && LA42_0 <= ')')||(LA42_0 >= '+' && LA42_0 <= '\uFFFF')) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // DDL.g:214:37: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;
                case 3 :
                    // DDL.g:215:4: '--' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("--"); 



                    // DDL.g:215:9: (~ ( '\\n' | '\\r' ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( ((LA43_0 >= '\u0000' && LA43_0 <= '\t')||(LA43_0 >= '\u000B' && LA43_0 <= '\f')||(LA43_0 >= '\u000E' && LA43_0 <= '\uFFFF')) ) {
                            alt43=1;
                        }


                        switch (alt43) {
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
                    	    break loop43;
                        }
                    } while (true);


                    // DDL.g:215:23: ( '\\r' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0=='\r') ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // DDL.g:215:23: '\\r'
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
                    // DDL.g:216:5: '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match('#'); 

                    // DDL.g:216:9: (~ ( '\\n' | '\\r' ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( ((LA45_0 >= '\u0000' && LA45_0 <= '\t')||(LA45_0 >= '\u000B' && LA45_0 <= '\f')||(LA45_0 >= '\u000E' && LA45_0 <= '\uFFFF')) ) {
                            alt45=1;
                        }


                        switch (alt45) {
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
                    	    break loop45;
                        }
                    } while (true);


                    // DDL.g:216:23: ( '\\r' )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0=='\r') ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // DDL.g:216:23: '\\r'
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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:219:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // DDL.g:219:7: ( ' ' | '\\t' | '\\r' | '\\n' )
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
            // DDL.g:221:5: ( ( '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )+ '\\'' ) | ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )+ '\"' ) | ( '`' ( ESC_SEQ |~ ( '\\\\' | '`' ) )+ '`' ) )
            int alt51=3;
            switch ( input.LA(1) ) {
            case '\'':
                {
                alt51=1;
                }
                break;
            case '\"':
                {
                alt51=2;
                }
                break;
            case '`':
                {
                alt51=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;

            }

            switch (alt51) {
                case 1 :
                    // DDL.g:221:7: ( '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )+ '\\'' )
                    {
                    // DDL.g:221:7: ( '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )+ '\\'' )
                    // DDL.g:221:9: '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )+ '\\''
                    {
                    match('\''); 

                    // DDL.g:221:14: ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )+
                    int cnt48=0;
                    loop48:
                    do {
                        int alt48=3;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0=='\\') ) {
                            alt48=1;
                        }
                        else if ( ((LA48_0 >= '\u0000' && LA48_0 <= '&')||(LA48_0 >= '(' && LA48_0 <= '[')||(LA48_0 >= ']' && LA48_0 <= '\uFFFF')) ) {
                            alt48=2;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // DDL.g:221:16: ESC_SEQ
                    	    {
                    	    mESC_SEQ(); 


                    	    }
                    	    break;
                    	case 2 :
                    	    // DDL.g:221:26: ~ ( '\\\\' | '\\'' )
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
                    	    if ( cnt48 >= 1 ) break loop48;
                                EarlyExitException eee =
                                    new EarlyExitException(48, input);
                                throw eee;
                        }
                        cnt48++;
                    } while (true);


                    match('\''); 

                    }


                    }
                    break;
                case 2 :
                    // DDL.g:222:4: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )+ '\"' )
                    {
                    // DDL.g:222:4: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )+ '\"' )
                    // DDL.g:222:6: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )+ '\"'
                    {
                    match('\"'); 

                    // DDL.g:222:10: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )+
                    int cnt49=0;
                    loop49:
                    do {
                        int alt49=3;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0=='\\') ) {
                            alt49=1;
                        }
                        else if ( ((LA49_0 >= '\u0000' && LA49_0 <= '!')||(LA49_0 >= '#' && LA49_0 <= '[')||(LA49_0 >= ']' && LA49_0 <= '\uFFFF')) ) {
                            alt49=2;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // DDL.g:222:12: ESC_SEQ
                    	    {
                    	    mESC_SEQ(); 


                    	    }
                    	    break;
                    	case 2 :
                    	    // DDL.g:222:22: ~ ( '\\\\' | '\"' )
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
                    	    if ( cnt49 >= 1 ) break loop49;
                                EarlyExitException eee =
                                    new EarlyExitException(49, input);
                                throw eee;
                        }
                        cnt49++;
                    } while (true);


                    match('\"'); 

                    }


                    }
                    break;
                case 3 :
                    // DDL.g:223:4: ( '`' ( ESC_SEQ |~ ( '\\\\' | '`' ) )+ '`' )
                    {
                    // DDL.g:223:4: ( '`' ( ESC_SEQ |~ ( '\\\\' | '`' ) )+ '`' )
                    // DDL.g:223:6: '`' ( ESC_SEQ |~ ( '\\\\' | '`' ) )+ '`'
                    {
                    match('`'); 

                    // DDL.g:223:10: ( ESC_SEQ |~ ( '\\\\' | '`' ) )+
                    int cnt50=0;
                    loop50:
                    do {
                        int alt50=3;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0=='\\') ) {
                            alt50=1;
                        }
                        else if ( ((LA50_0 >= '\u0000' && LA50_0 <= '[')||(LA50_0 >= ']' && LA50_0 <= '_')||(LA50_0 >= 'a' && LA50_0 <= '\uFFFF')) ) {
                            alt50=2;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // DDL.g:223:12: ESC_SEQ
                    	    {
                    	    mESC_SEQ(); 


                    	    }
                    	    break;
                    	case 2 :
                    	    // DDL.g:223:22: ~ ( '\\\\' | '`' )
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
                    	    if ( cnt50 >= 1 ) break loop50;
                                EarlyExitException eee =
                                    new EarlyExitException(50, input);
                                throw eee;
                        }
                        cnt50++;
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
            // DDL.g:229:2: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
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
            // DDL.g:234:2: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt52=3;
            int LA52_0 = input.LA(1);

            if ( (LA52_0=='\\') ) {
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
                    alt52=1;
                    }
                    break;
                case 'u':
                    {
                    alt52=2;
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
                    alt52=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;

            }
            switch (alt52) {
                case 1 :
                    // DDL.g:234:4: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // DDL.g:235:4: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // DDL.g:236:4: OCTAL_ESC
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
            // DDL.g:241:2: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt53=3;
            int LA53_0 = input.LA(1);

            if ( (LA53_0=='\\') ) {
                int LA53_1 = input.LA(2);

                if ( ((LA53_1 >= '0' && LA53_1 <= '3')) ) {
                    int LA53_2 = input.LA(3);

                    if ( ((LA53_2 >= '0' && LA53_2 <= '7')) ) {
                        int LA53_4 = input.LA(4);

                        if ( ((LA53_4 >= '0' && LA53_4 <= '7')) ) {
                            alt53=1;
                        }
                        else {
                            alt53=2;
                        }
                    }
                    else {
                        alt53=3;
                    }
                }
                else if ( ((LA53_1 >= '4' && LA53_1 <= '7')) ) {
                    int LA53_3 = input.LA(3);

                    if ( ((LA53_3 >= '0' && LA53_3 <= '7')) ) {
                        alt53=2;
                    }
                    else {
                        alt53=3;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;

            }
            switch (alt53) {
                case 1 :
                    // DDL.g:241:4: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
                    // DDL.g:242:4: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
                    // DDL.g:243:4: '\\\\' ( '0' .. '7' )
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
            // DDL.g:248:2: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // DDL.g:248:4: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
        // DDL.g:1:8: ( T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | DROP | CREATE | TABLE | IF | NOT | EXISTS | ENUM | NULL | DEFAULT | KEY | HASH | UNIQUE | PRIMARY | FOREIGN | INDEX | FULLTEXT | REFERENCES | ON | INTO | VALUES | DELETE | CASCADE | RESTRICT | ACTION | NO | SET | INSERT | UPDATE | UNSIGNED | BINARY | AUTO_INC | ASC | DESC | CHARACTER | COLLATE | USE | SCHEMA | ID | INT | COMMENT | WS | DEF )
        int alt54=49;
        alt54 = dfa54.predict(input);
        switch (alt54) {
            case 1 :
                // DDL.g:1:10: T__50
                {
                mT__50(); 


                }
                break;
            case 2 :
                // DDL.g:1:16: T__51
                {
                mT__51(); 


                }
                break;
            case 3 :
                // DDL.g:1:22: T__52
                {
                mT__52(); 


                }
                break;
            case 4 :
                // DDL.g:1:28: T__53
                {
                mT__53(); 


                }
                break;
            case 5 :
                // DDL.g:1:34: T__54
                {
                mT__54(); 


                }
                break;
            case 6 :
                // DDL.g:1:40: T__55
                {
                mT__55(); 


                }
                break;
            case 7 :
                // DDL.g:1:46: T__56
                {
                mT__56(); 


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
                // DDL.g:1:64: TABLE
                {
                mTABLE(); 


                }
                break;
            case 11 :
                // DDL.g:1:70: IF
                {
                mIF(); 


                }
                break;
            case 12 :
                // DDL.g:1:73: NOT
                {
                mNOT(); 


                }
                break;
            case 13 :
                // DDL.g:1:77: EXISTS
                {
                mEXISTS(); 


                }
                break;
            case 14 :
                // DDL.g:1:84: ENUM
                {
                mENUM(); 


                }
                break;
            case 15 :
                // DDL.g:1:89: NULL
                {
                mNULL(); 


                }
                break;
            case 16 :
                // DDL.g:1:94: DEFAULT
                {
                mDEFAULT(); 


                }
                break;
            case 17 :
                // DDL.g:1:102: KEY
                {
                mKEY(); 


                }
                break;
            case 18 :
                // DDL.g:1:106: HASH
                {
                mHASH(); 


                }
                break;
            case 19 :
                // DDL.g:1:111: UNIQUE
                {
                mUNIQUE(); 


                }
                break;
            case 20 :
                // DDL.g:1:118: PRIMARY
                {
                mPRIMARY(); 


                }
                break;
            case 21 :
                // DDL.g:1:126: FOREIGN
                {
                mFOREIGN(); 


                }
                break;
            case 22 :
                // DDL.g:1:134: INDEX
                {
                mINDEX(); 


                }
                break;
            case 23 :
                // DDL.g:1:140: FULLTEXT
                {
                mFULLTEXT(); 


                }
                break;
            case 24 :
                // DDL.g:1:149: REFERENCES
                {
                mREFERENCES(); 


                }
                break;
            case 25 :
                // DDL.g:1:160: ON
                {
                mON(); 


                }
                break;
            case 26 :
                // DDL.g:1:163: INTO
                {
                mINTO(); 


                }
                break;
            case 27 :
                // DDL.g:1:168: VALUES
                {
                mVALUES(); 


                }
                break;
            case 28 :
                // DDL.g:1:175: DELETE
                {
                mDELETE(); 


                }
                break;
            case 29 :
                // DDL.g:1:182: CASCADE
                {
                mCASCADE(); 


                }
                break;
            case 30 :
                // DDL.g:1:190: RESTRICT
                {
                mRESTRICT(); 


                }
                break;
            case 31 :
                // DDL.g:1:199: ACTION
                {
                mACTION(); 


                }
                break;
            case 32 :
                // DDL.g:1:206: NO
                {
                mNO(); 


                }
                break;
            case 33 :
                // DDL.g:1:209: SET
                {
                mSET(); 


                }
                break;
            case 34 :
                // DDL.g:1:213: INSERT
                {
                mINSERT(); 


                }
                break;
            case 35 :
                // DDL.g:1:220: UPDATE
                {
                mUPDATE(); 


                }
                break;
            case 36 :
                // DDL.g:1:227: UNSIGNED
                {
                mUNSIGNED(); 


                }
                break;
            case 37 :
                // DDL.g:1:236: BINARY
                {
                mBINARY(); 


                }
                break;
            case 38 :
                // DDL.g:1:243: AUTO_INC
                {
                mAUTO_INC(); 


                }
                break;
            case 39 :
                // DDL.g:1:252: ASC
                {
                mASC(); 


                }
                break;
            case 40 :
                // DDL.g:1:256: DESC
                {
                mDESC(); 


                }
                break;
            case 41 :
                // DDL.g:1:261: CHARACTER
                {
                mCHARACTER(); 


                }
                break;
            case 42 :
                // DDL.g:1:271: COLLATE
                {
                mCOLLATE(); 


                }
                break;
            case 43 :
                // DDL.g:1:279: USE
                {
                mUSE(); 


                }
                break;
            case 44 :
                // DDL.g:1:283: SCHEMA
                {
                mSCHEMA(); 


                }
                break;
            case 45 :
                // DDL.g:1:290: ID
                {
                mID(); 


                }
                break;
            case 46 :
                // DDL.g:1:293: INT
                {
                mINT(); 


                }
                break;
            case 47 :
                // DDL.g:1:297: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 48 :
                // DDL.g:1:305: WS
                {
                mWS(); 


                }
                break;
            case 49 :
                // DDL.g:1:308: DEF
                {
                mDEF(); 


                }
                break;

        }

    }


    protected DFA54 dfa54 = new DFA54(this);
    static final String DFA54_eotS =
        "\1\24\7\uffff\14\52\1\uffff\25\52\7\uffff\16\52\1\176\1\52\1\176"+
        "\1\52\1\u0086\1\52\1\u0086\26\52\2\u00a3\40\52\1\uffff\6\52\1\u00ca"+
        "\1\uffff\1\52\1\u00ca\5\52\2\u00d1\4\52\1\u00d6\3\52\1\u00d6\12"+
        "\52\1\uffff\4\52\1\u00e8\2\52\1\u00e8\1\u00eb\1\52\1\u00eb\3\52"+
        "\1\u00f0\2\52\1\u00f3\1\u00f0\2\52\1\u00f3\13\52\1\u0101\2\52\1"+
        "\u0101\1\52\1\uffff\2\24\1\52\1\u0106\1\52\1\u0106\1\uffff\4\52"+
        "\1\uffff\21\52\1\uffff\2\52\1\uffff\4\52\1\uffff\2\52\1\uffff\12"+
        "\52\2\u012f\1\u0130\1\uffff\1\52\1\u0130\2\52\1\uffff\35\52\1\u0151"+
        "\1\52\1\u0151\1\u0153\3\52\1\u0153\2\52\1\u0159\2\uffff\2\u015a"+
        "\2\u015b\1\52\1\u015d\1\52\1\u015f\1\u015d\1\52\1\u015f\12\52\2"+
        "\u016b\1\u016c\1\52\1\u016c\1\52\2\u016f\2\u0170\1\u0171\1\uffff"+
        "\1\u0171\1\uffff\1\u0172\1\52\1\u0159\1\u0172\1\52\3\uffff\1\52"+
        "\1\uffff\1\52\1\uffff\1\52\2\u0178\1\u0179\1\52\1\u0179\5\52\2\uffff"+
        "\2\52\4\uffff\2\52\1\u0184\2\u0185\2\uffff\2\u0186\1\52\1\u0188"+
        "\1\52\1\u0188\2\52\2\u018c\3\uffff\1\52\1\uffff\3\52\1\uffff\2\u0191"+
        "\2\52\1\uffff\6\52\2\u019a\1\uffff";
    static final String DFA54_eofS =
        "\u019b\uffff";
    static final String DFA54_minS =
        "\1\11\6\uffff\1\0\1\105\1\145\1\101\1\141\1\101\1\141\1\106\1\146"+
        "\1\117\1\157\1\116\1\156\1\uffff\1\105\1\145\1\101\1\116\1\156\1"+
        "\122\1\162\1\117\1\157\1\105\1\145\1\116\1\156\1\101\1\141\1\103"+
        "\1\143\1\103\1\143\1\111\1\151\1\uffff\1\55\5\uffff\1\117\1\106"+
        "\1\157\1\146\1\105\1\123\1\101\1\114\1\145\1\163\1\141\1\154\1\102"+
        "\1\142\1\60\1\104\1\60\1\144\1\60\1\114\1\60\1\154\1\111\1\125\1"+
        "\151\1\165\1\131\1\171\1\123\1\111\1\104\1\105\1\151\1\144\1\145"+
        "\1\111\1\151\1\122\1\114\1\162\1\154\1\106\1\146\2\60\1\114\1\154"+
        "\2\124\1\103\2\164\1\143\1\124\1\110\1\164\1\150\1\116\1\156\1\120"+
        "\1\101\1\105\1\103\1\160\1\141\1\145\1\143\1\101\1\103\1\122\1\114"+
        "\1\141\1\143\1\162\1\141\1\114\1\154\1\uffff\1\105\1\117\1\105\1"+
        "\145\1\157\1\145\1\60\1\uffff\1\114\1\60\1\154\1\123\1\115\1\163"+
        "\1\155\2\60\1\110\1\121\1\111\1\101\1\60\1\161\1\151\1\141\1\60"+
        "\1\115\1\155\1\105\1\114\1\145\1\154\1\105\1\124\1\145\1\164\1\uffff"+
        "\1\125\1\165\1\111\1\117\1\60\1\151\1\157\2\60\1\105\1\60\1\145"+
        "\1\101\1\141\1\60\1\125\1\124\2\60\1\165\1\164\1\60\1\124\3\101"+
        "\1\164\2\141\1\164\1\105\1\145\1\130\1\60\1\122\1\170\1\60\1\162"+
        "\1\uffff\2\60\1\124\1\60\1\164\1\60\1\uffff\1\150\1\125\1\107\1"+
        "\124\1\uffff\1\165\1\147\1\164\1\101\1\141\1\111\1\124\1\151\1\164"+
        "\2\122\2\162\1\105\1\145\1\117\1\137\1\uffff\1\157\1\137\1\uffff"+
        "\1\115\1\155\1\122\1\162\1\uffff\1\114\1\105\1\uffff\1\154\1\145"+
        "\1\105\1\104\1\103\1\124\1\145\1\144\1\143\1\145\3\60\1\uffff\1"+
        "\124\1\60\1\164\1\123\1\uffff\1\163\1\141\1\105\1\116\1\105\1\145"+
        "\1\156\1\145\1\122\1\162\1\107\1\105\1\147\1\145\1\105\1\111\1\145"+
        "\1\151\1\123\1\163\1\116\1\111\1\156\1\151\1\101\1\141\1\131\1\171"+
        "\1\124\1\60\1\164\2\60\1\105\1\124\1\105\1\60\1\145\1\164\1\60\2"+
        "\uffff\4\60\1\163\1\60\1\105\2\60\1\145\1\60\1\131\1\171\1\116\1"+
        "\130\1\156\1\170\1\116\1\103\1\156\1\143\3\60\1\116\1\60\1\156\5"+
        "\60\1\uffff\1\60\1\uffff\1\60\1\105\2\60\1\145\3\uffff\1\150\1\uffff"+
        "\1\104\1\uffff\1\144\3\60\1\124\1\60\1\164\1\103\1\124\1\143\1\164"+
        "\2\uffff\1\103\1\143\4\uffff\1\122\1\162\3\60\2\uffff\2\60\1\105"+
        "\1\60\1\145\1\60\1\122\1\162\2\60\3\uffff\1\123\1\uffff\1\163\1"+
        "\105\1\145\1\uffff\2\60\1\115\1\155\1\uffff\1\105\1\145\1\116\1"+
        "\156\1\124\1\164\2\60\1\uffff";
    static final String DFA54_maxS =
        "\1\172\6\uffff\1\uffff\1\122\1\162\1\122\1\162\1\101\1\141\1\116"+
        "\1\156\1\125\1\165\1\130\1\170\1\uffff\1\105\1\145\1\101\1\123\1"+
        "\163\1\122\1\162\1\125\1\165\1\105\1\145\1\116\1\156\1\101\1\141"+
        "\1\125\1\165\1\105\1\145\1\111\1\151\1\uffff\1\71\5\uffff\1\117"+
        "\1\123\1\157\1\163\1\105\1\123\1\101\1\114\1\145\1\163\1\141\1\154"+
        "\1\102\1\142\1\172\1\124\1\172\1\164\1\172\1\114\1\172\1\154\1\111"+
        "\1\125\1\151\1\165\1\131\1\171\2\123\1\104\1\105\1\163\1\144\1\145"+
        "\1\111\1\151\1\122\1\114\1\162\1\154\1\123\1\163\2\172\1\114\1\154"+
        "\2\124\1\103\2\164\1\143\1\124\1\110\1\164\1\150\1\116\1\156\1\120"+
        "\1\101\1\105\1\103\1\160\1\141\1\145\1\143\1\101\1\103\1\122\1\114"+
        "\1\141\1\143\1\162\1\141\1\114\1\154\1\uffff\1\105\1\117\1\105\1"+
        "\145\1\157\1\145\1\172\1\uffff\1\114\1\172\1\154\1\123\1\115\1\163"+
        "\1\155\2\172\1\110\1\121\1\111\1\101\1\172\1\161\1\151\1\141\1\172"+
        "\1\115\1\155\1\105\1\114\1\145\1\154\1\105\1\124\1\145\1\164\1\uffff"+
        "\1\125\1\165\1\111\1\117\1\172\1\151\1\157\2\172\1\105\1\172\1\145"+
        "\1\101\1\141\1\172\1\125\1\124\2\172\1\165\1\164\1\172\1\124\3\101"+
        "\1\164\2\141\1\164\1\105\1\145\1\130\1\172\1\122\1\170\1\172\1\162"+
        "\1\uffff\2\172\1\124\1\172\1\164\1\172\1\uffff\1\150\1\125\1\107"+
        "\1\124\1\uffff\1\165\1\147\1\164\1\101\1\141\1\111\1\124\1\151\1"+
        "\164\2\122\2\162\1\105\1\145\1\117\1\137\1\uffff\1\157\1\137\1\uffff"+
        "\1\115\1\155\1\122\1\162\1\uffff\1\114\1\105\1\uffff\1\154\1\145"+
        "\1\105\1\104\1\103\1\124\1\145\1\144\1\143\1\145\3\172\1\uffff\1"+
        "\124\1\172\1\164\1\123\1\uffff\1\163\1\141\1\105\1\116\1\105\1\145"+
        "\1\156\1\145\1\122\1\162\1\107\1\105\1\147\1\145\1\105\1\111\1\145"+
        "\1\151\1\123\1\163\1\116\1\111\1\156\1\151\1\101\1\141\1\131\1\171"+
        "\1\124\1\172\1\164\2\172\1\105\1\124\1\105\1\172\1\145\1\164\1\172"+
        "\2\uffff\4\172\1\163\1\172\1\105\2\172\1\145\1\172\1\131\1\171\1"+
        "\116\1\130\1\156\1\170\1\116\1\103\1\156\1\143\3\172\1\116\1\172"+
        "\1\156\5\172\1\uffff\1\172\1\uffff\1\172\1\105\2\172\1\145\3\uffff"+
        "\1\150\1\uffff\1\104\1\uffff\1\144\3\172\1\124\1\172\1\164\1\103"+
        "\1\124\1\143\1\164\2\uffff\1\103\1\143\4\uffff\1\122\1\162\3\172"+
        "\2\uffff\2\172\1\105\1\172\1\145\1\172\1\122\1\162\2\172\3\uffff"+
        "\1\123\1\uffff\1\163\1\105\1\145\1\uffff\2\172\1\115\1\155\1\uffff"+
        "\1\105\1\145\1\116\1\156\1\124\1\164\2\172\1\uffff";
    static final String DFA54_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\15\uffff\1\17\25\uffff\1\55\1\uffff"+
        "\1\56\1\57\1\60\1\61\1\7\115\uffff\1\13\7\uffff\1\40\34\uffff\1"+
        "\31\46\uffff\1\14\6\uffff\1\21\4\uffff\1\53\21\uffff\1\47\2\uffff"+
        "\1\41\4\uffff\1\10\2\uffff\1\50\15\uffff\1\32\4\uffff\1\16\50\uffff"+
        "\1\12\1\26\40\uffff\1\34\1\uffff\1\11\5\uffff\1\52\1\42\1\15\1\uffff"+
        "\1\23\1\uffff\1\43\13\uffff\1\33\1\37\2\uffff\1\54\1\45\1\20\1\35"+
        "\5\uffff\1\24\1\25\12\uffff\1\22\1\44\1\27\1\uffff\1\36\3\uffff"+
        "\1\51\4\uffff\1\30\10\uffff\1\46";
    static final String DFA54_specialS =
        "\7\uffff\1\0\u0193\uffff}>";
    static final String[] DFA54_transitionS = {
            "\2\56\2\uffff\1\56\22\uffff\1\56\1\uffff\1\57\1\55\3\uffff\1"+
            "\7\1\1\1\2\2\uffff\1\3\1\53\1\4\1\55\12\54\1\uffff\1\5\1\uffff"+
            "\1\6\3\uffff\1\44\1\50\1\12\1\10\1\22\1\34\1\52\1\27\1\16\1"+
            "\52\1\25\2\52\1\20\1\40\1\32\1\52\1\36\1\46\1\14\1\30\1\42\4"+
            "\52\4\uffff\1\52\1\57\1\45\1\51\1\13\1\11\1\23\1\35\2\52\1\17"+
            "\1\52\1\26\2\52\1\21\1\41\1\33\1\52\1\37\1\47\1\15\1\31\1\43"+
            "\4\52",
            "",
            "",
            "",
            "",
            "",
            "",
            "\47\57\1\60\uffd8\57",
            "\1\62\14\uffff\1\61",
            "\1\64\14\uffff\1\63",
            "\1\66\6\uffff\1\67\6\uffff\1\70\2\uffff\1\65",
            "\1\72\6\uffff\1\73\6\uffff\1\74\2\uffff\1\71",
            "\1\75",
            "\1\76",
            "\1\77\7\uffff\1\100",
            "\1\101\7\uffff\1\102",
            "\1\103\5\uffff\1\104",
            "\1\105\5\uffff\1\106",
            "\1\110\11\uffff\1\107",
            "\1\112\11\uffff\1\111",
            "",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116\1\uffff\1\117\2\uffff\1\120",
            "\1\121\1\uffff\1\122\2\uffff\1\123",
            "\1\124",
            "\1\125",
            "\1\126\5\uffff\1\127",
            "\1\130\5\uffff\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140\17\uffff\1\142\1\uffff\1\141",
            "\1\143\17\uffff\1\145\1\uffff\1\144",
            "\1\147\1\uffff\1\146",
            "\1\151\1\uffff\1\150",
            "\1\152",
            "\1\153",
            "",
            "\1\55\2\uffff\12\54",
            "",
            "",
            "",
            "",
            "",
            "\1\154",
            "\1\155\5\uffff\1\156\6\uffff\1\157",
            "\1\160",
            "\1\161\5\uffff\1\162\6\uffff\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\177\16\uffff\1\u0081\1\u0080",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0082\16\uffff\1\u0084\1\u0083",
            "\12\52\7\uffff\23\52\1\u0085\6\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0087",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\u0088\6\52",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091\11\uffff\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095\11\uffff\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f\14\uffff\1\u00a0",
            "\1\u00a1\14\uffff\1\u00a2",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
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
            "",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u00cb",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00e9",
            "\1\u00ea",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00ec",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00f1",
            "\1\u00f2",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00f4",
            "\1\u00f5",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0102",
            "\1\u0103",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0104",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0105",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0107",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "",
            "\1\u011d",
            "\1\u011e",
            "",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "",
            "\1\u0123",
            "\1\u0124",
            "",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u0131",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0132",
            "\1\u0133",
            "",
            "\1\u0134",
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
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0152",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0157",
            "\1\u0158",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u015c",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u015e",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0160",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u016d",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u016e",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0173",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0174",
            "",
            "",
            "",
            "\1\u0175",
            "",
            "\1\u0176",
            "",
            "\1\u0177",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u017a",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "",
            "",
            "\1\u0180",
            "\1\u0181",
            "",
            "",
            "",
            "",
            "\1\u0182",
            "\1\u0183",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0187",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0189",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u018a",
            "\1\u018b",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "\1\u018d",
            "",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0192",
            "\1\u0193",
            "",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
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
            return "1:1: Tokens : ( T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | DROP | CREATE | TABLE | IF | NOT | EXISTS | ENUM | NULL | DEFAULT | KEY | HASH | UNIQUE | PRIMARY | FOREIGN | INDEX | FULLTEXT | REFERENCES | ON | INTO | VALUES | DELETE | CASCADE | RESTRICT | ACTION | NO | SET | INSERT | UPDATE | UNSIGNED | BINARY | AUTO_INC | ASC | DESC | CHARACTER | COLLATE | USE | SCHEMA | ID | INT | COMMENT | WS | DEF );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_7 = input.LA(1);

                        s = -1;
                        if ( (LA54_7=='\'') ) {s = 48;}

                        else if ( ((LA54_7 >= '\u0000' && LA54_7 <= '&')||(LA54_7 >= '(' && LA54_7 <= '\uFFFF')) ) {s = 47;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 54, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}