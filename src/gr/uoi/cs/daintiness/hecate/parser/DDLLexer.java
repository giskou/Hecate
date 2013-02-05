// $ANTLR 3.4 DDL.g 2013-02-05 11:53:27

  package gr.uoi.cs.daintiness.hecate.parser ;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class DDLLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
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
    public static final int CONSTRAINT=14;
    public static final int CREATE=15;
    public static final int DEF=16;
    public static final int DEFAULT=17;
    public static final int DELETE=18;
    public static final int DESC=19;
    public static final int DROP=20;
    public static final int ENUM=21;
    public static final int ESC_SEQ=22;
    public static final int EXISTS=23;
    public static final int FOREIGN=24;
    public static final int FULLTEXT=25;
    public static final int HASH=26;
    public static final int HEX_DIGIT=27;
    public static final int ID=28;
    public static final int IF=29;
    public static final int INDEX=30;
    public static final int INSERT=31;
    public static final int INT=32;
    public static final int INTO=33;
    public static final int IS=34;
    public static final int KEY=35;
    public static final int NO=36;
    public static final int NOT=37;
    public static final int NULL=38;
    public static final int OCTAL_ESC=39;
    public static final int ON=40;
    public static final int PRIMARY=41;
    public static final int REFERENCES=42;
    public static final int RESTRICT=43;
    public static final int SCHEMA=44;
    public static final int SET=45;
    public static final int TABLE=46;
    public static final int UNICODE_ESC=47;
    public static final int UNIQUE=48;
    public static final int UNSIGNED=49;
    public static final int UPDATE=50;
    public static final int USE=51;
    public static final int VALUES=52;
    public static final int WS=53;

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

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
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
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
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
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
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
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
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
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
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
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
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
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
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
    // $ANTLR end "T__60"

    // $ANTLR start "DROP"
    public final void mDROP() throws RecognitionException {
        try {
            int _type = DROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:179:6: ( 'DROP' | 'drop' )
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
                    // DDL.g:179:8: 'DROP'
                    {
                    match("DROP"); 



                    }
                    break;
                case 2 :
                    // DDL.g:179:17: 'drop'
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
            // DDL.g:180:8: ( 'CREATE' | 'create' )
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
                    // DDL.g:180:10: 'CREATE'
                    {
                    match("CREATE"); 



                    }
                    break;
                case 2 :
                    // DDL.g:180:21: 'create'
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
            // DDL.g:181:7: ( 'TABLE' | 'table' )
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
                    // DDL.g:181:9: 'TABLE'
                    {
                    match("TABLE"); 



                    }
                    break;
                case 2 :
                    // DDL.g:181:19: 'table'
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
            // DDL.g:182:4: ( 'IF' | 'if' )
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
                    // DDL.g:182:6: 'IF'
                    {
                    match("IF"); 



                    }
                    break;
                case 2 :
                    // DDL.g:182:13: 'if'
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
            // DDL.g:183:5: ( 'NOT' | 'not' )
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
                    // DDL.g:183:7: 'NOT'
                    {
                    match("NOT"); 



                    }
                    break;
                case 2 :
                    // DDL.g:183:15: 'not'
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
            // DDL.g:184:8: ( 'EXISTS' | 'exists' )
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
                    // DDL.g:184:10: 'EXISTS'
                    {
                    match("EXISTS"); 



                    }
                    break;
                case 2 :
                    // DDL.g:184:21: 'exists'
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
            // DDL.g:185:6: ( 'ENUM' | 'enum' )
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
                    // DDL.g:185:8: 'ENUM'
                    {
                    match("ENUM"); 



                    }
                    break;
                case 2 :
                    // DDL.g:185:17: 'enum'
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
            // DDL.g:186:6: ( ( 'NULL' | 'null' | 'Null' )? )
            // DDL.g:186:8: ( 'NULL' | 'null' | 'Null' )?
            {
            // DDL.g:186:8: ( 'NULL' | 'null' | 'Null' )?
            int alt8=4;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='N') ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1=='U') ) {
                    alt8=1;
                }
                else if ( (LA8_1=='u') ) {
                    alt8=3;
                }
            }
            else if ( (LA8_0=='n') ) {
                alt8=2;
            }
            switch (alt8) {
                case 1 :
                    // DDL.g:186:9: 'NULL'
                    {
                    match("NULL"); 



                    }
                    break;
                case 2 :
                    // DDL.g:186:18: 'null'
                    {
                    match("null"); 



                    }
                    break;
                case 3 :
                    // DDL.g:186:27: 'Null'
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
            // DDL.g:187:9: ( 'DEFAULT' | 'default' )
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
                    // DDL.g:187:11: 'DEFAULT'
                    {
                    match("DEFAULT"); 



                    }
                    break;
                case 2 :
                    // DDL.g:187:23: 'default'
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
            // DDL.g:188:5: ( 'KEY' | 'key' )
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
                    // DDL.g:188:7: 'KEY'
                    {
                    match("KEY"); 



                    }
                    break;
                case 2 :
                    // DDL.g:188:15: 'key'
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
            // DDL.g:189:6: ( 'HASH' 'hash' )
            // DDL.g:189:8: 'HASH' 'hash'
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
            // DDL.g:190:8: ( 'UNIQUE' | 'unique' )
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
                    // DDL.g:190:10: 'UNIQUE'
                    {
                    match("UNIQUE"); 



                    }
                    break;
                case 2 :
                    // DDL.g:190:21: 'unique'
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
            // DDL.g:191:9: ( 'PRIMARY' | 'primary' )
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
                    // DDL.g:191:11: 'PRIMARY'
                    {
                    match("PRIMARY"); 



                    }
                    break;
                case 2 :
                    // DDL.g:191:23: 'primary'
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
            // DDL.g:192:9: ( 'FOREIGN' | 'foreign' )
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
                    // DDL.g:192:11: 'FOREIGN'
                    {
                    match("FOREIGN"); 



                    }
                    break;
                case 2 :
                    // DDL.g:192:23: 'foreign'
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
            // DDL.g:193:7: ( 'INDEX' | 'index' )
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
                    // DDL.g:193:9: 'INDEX'
                    {
                    match("INDEX"); 



                    }
                    break;
                case 2 :
                    // DDL.g:193:19: 'index'
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
            // DDL.g:194:12: ( 'CONSTRAINT' | 'constraint' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='C') ) {
                alt15=1;
            }
            else if ( (LA15_0=='c') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // DDL.g:194:14: 'CONSTRAINT'
                    {
                    match("CONSTRAINT"); 



                    }
                    break;
                case 2 :
                    // DDL.g:194:29: 'constraint'
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
            // DDL.g:195:10: ( 'FULLTEXT' | 'fulltext' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='F') ) {
                alt16=1;
            }
            else if ( (LA16_0=='f') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // DDL.g:195:12: 'FULLTEXT'
                    {
                    match("FULLTEXT"); 



                    }
                    break;
                case 2 :
                    // DDL.g:195:25: 'fulltext'
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
            // DDL.g:196:12: ( 'REFERENCES' | 'references' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='R') ) {
                alt17=1;
            }
            else if ( (LA17_0=='r') ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // DDL.g:196:14: 'REFERENCES'
                    {
                    match("REFERENCES"); 



                    }
                    break;
                case 2 :
                    // DDL.g:196:29: 'references'
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
            // DDL.g:197:4: ( 'ON' | 'on' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='O') ) {
                alt18=1;
            }
            else if ( (LA18_0=='o') ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // DDL.g:197:6: 'ON'
                    {
                    match("ON"); 



                    }
                    break;
                case 2 :
                    // DDL.g:197:13: 'on'
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
            // DDL.g:198:6: ( 'INTO' | 'into' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='I') ) {
                alt19=1;
            }
            else if ( (LA19_0=='i') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // DDL.g:198:8: 'INTO'
                    {
                    match("INTO"); 



                    }
                    break;
                case 2 :
                    // DDL.g:198:17: 'into'
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
            // DDL.g:199:8: ( 'VALUES' | 'values' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='V') ) {
                alt20=1;
            }
            else if ( (LA20_0=='v') ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // DDL.g:199:10: 'VALUES'
                    {
                    match("VALUES"); 



                    }
                    break;
                case 2 :
                    // DDL.g:199:21: 'values'
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
            // DDL.g:200:8: ( 'DELETE' | 'delete' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='D') ) {
                alt21=1;
            }
            else if ( (LA21_0=='d') ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // DDL.g:200:10: 'DELETE'
                    {
                    match("DELETE"); 



                    }
                    break;
                case 2 :
                    // DDL.g:200:21: 'delete'
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
            // DDL.g:201:9: ( 'CASCADE' | 'cascade' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='C') ) {
                alt22=1;
            }
            else if ( (LA22_0=='c') ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // DDL.g:201:11: 'CASCADE'
                    {
                    match("CASCADE"); 



                    }
                    break;
                case 2 :
                    // DDL.g:201:23: 'cascade'
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
            // DDL.g:202:10: ( 'RESTRICT' | 'restrict' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='R') ) {
                alt23=1;
            }
            else if ( (LA23_0=='r') ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // DDL.g:202:12: 'RESTRICT'
                    {
                    match("RESTRICT"); 



                    }
                    break;
                case 2 :
                    // DDL.g:202:25: 'restrict'
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
            // DDL.g:203:8: ( 'ACTION' | 'action' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='A') ) {
                alt24=1;
            }
            else if ( (LA24_0=='a') ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // DDL.g:203:10: 'ACTION'
                    {
                    match("ACTION"); 



                    }
                    break;
                case 2 :
                    // DDL.g:203:21: 'action'
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
            // DDL.g:204:4: ( 'NO' | 'no' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='N') ) {
                alt25=1;
            }
            else if ( (LA25_0=='n') ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // DDL.g:204:6: 'NO'
                    {
                    match("NO"); 



                    }
                    break;
                case 2 :
                    // DDL.g:204:13: 'no'
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
            // DDL.g:205:5: ( 'SET' | 'set' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='S') ) {
                alt26=1;
            }
            else if ( (LA26_0=='s') ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // DDL.g:205:7: 'SET'
                    {
                    match("SET"); 



                    }
                    break;
                case 2 :
                    // DDL.g:205:15: 'set'
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
            // DDL.g:206:8: ( 'INSERT' | 'insert' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='I') ) {
                alt27=1;
            }
            else if ( (LA27_0=='i') ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // DDL.g:206:10: 'INSERT'
                    {
                    match("INSERT"); 



                    }
                    break;
                case 2 :
                    // DDL.g:206:21: 'insert'
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
            // DDL.g:207:8: ( 'UPDATE' | 'update' )
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
                    // DDL.g:207:10: 'UPDATE'
                    {
                    match("UPDATE"); 



                    }
                    break;
                case 2 :
                    // DDL.g:207:21: 'update'
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
            // DDL.g:208:10: ( 'UNSIGNED' | 'unsigned' )
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
                    // DDL.g:208:12: 'UNSIGNED'
                    {
                    match("UNSIGNED"); 



                    }
                    break;
                case 2 :
                    // DDL.g:208:25: 'unsigned'
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
            // DDL.g:209:8: ( 'BINARY' | 'binary' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='B') ) {
                alt30=1;
            }
            else if ( (LA30_0=='b') ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // DDL.g:209:10: 'BINARY'
                    {
                    match("BINARY"); 



                    }
                    break;
                case 2 :
                    // DDL.g:209:21: 'binary'
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
            // DDL.g:210:10: ( 'AUTO_INCREMENT' | 'auto_increment' )
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
                    // DDL.g:210:12: 'AUTO_INCREMENT'
                    {
                    match("AUTO_INCREMENT"); 



                    }
                    break;
                case 2 :
                    // DDL.g:210:31: 'auto_increment'
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
            // DDL.g:211:5: ( 'ASC' | 'asc' )
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
                    // DDL.g:211:7: 'ASC'
                    {
                    match("ASC"); 



                    }
                    break;
                case 2 :
                    // DDL.g:211:15: 'asc'
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
            // DDL.g:212:6: ( 'DESC' | 'desc' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0=='D') ) {
                alt33=1;
            }
            else if ( (LA33_0=='d') ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // DDL.g:212:8: 'DESC'
                    {
                    match("DESC"); 



                    }
                    break;
                case 2 :
                    // DDL.g:212:17: 'desc'
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
            // DDL.g:213:11: ( 'CHARACTER' | 'character' )
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
                    // DDL.g:213:13: 'CHARACTER'
                    {
                    match("CHARACTER"); 



                    }
                    break;
                case 2 :
                    // DDL.g:213:27: 'character'
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
            // DDL.g:214:9: ( 'COLLATE' | 'collate' )
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
                    // DDL.g:214:11: 'COLLATE'
                    {
                    match("COLLATE"); 



                    }
                    break;
                case 2 :
                    // DDL.g:214:23: 'collate'
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
            // DDL.g:215:5: ( 'USE' | 'use' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0=='U') ) {
                alt36=1;
            }
            else if ( (LA36_0=='u') ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }
            switch (alt36) {
                case 1 :
                    // DDL.g:215:7: 'USE'
                    {
                    match("USE"); 



                    }
                    break;
                case 2 :
                    // DDL.g:215:15: 'use'
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
            // DDL.g:216:8: ( 'SCHEMA' | 'schema' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0=='S') ) {
                alt37=1;
            }
            else if ( (LA37_0=='s') ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }
            switch (alt37) {
                case 1 :
                    // DDL.g:216:10: 'SCHEMA'
                    {
                    match("SCHEMA"); 



                    }
                    break;
                case 2 :
                    // DDL.g:216:21: 'schema'
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
            // DDL.g:217:8: ( 'COMMIT' | 'commit' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0=='C') ) {
                alt38=1;
            }
            else if ( (LA38_0=='c') ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }
            switch (alt38) {
                case 1 :
                    // DDL.g:217:10: 'COMMIT'
                    {
                    match("COMMIT"); 



                    }
                    break;
                case 2 :
                    // DDL.g:217:21: 'commit'
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
            // DDL.g:218:4: ( 'IS' | 'is' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0=='I') ) {
                alt39=1;
            }
            else if ( (LA39_0=='i') ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }
            switch (alt39) {
                case 1 :
                    // DDL.g:218:6: 'IS'
                    {
                    match("IS"); 



                    }
                    break;
                case 2 :
                    // DDL.g:218:13: 'is'
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
            // DDL.g:219:7: ( 'CHECK' | 'check' )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0=='C') ) {
                alt40=1;
            }
            else if ( (LA40_0=='c') ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;

            }
            switch (alt40) {
                case 1 :
                    // DDL.g:219:9: 'CHECK'
                    {
                    match("CHECK"); 



                    }
                    break;
                case 2 :
                    // DDL.g:219:19: 'check'
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

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DDL.g:221:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // DDL.g:221:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // DDL.g:221:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0 >= '0' && LA41_0 <= '9')||(LA41_0 >= 'A' && LA41_0 <= 'Z')||LA41_0=='_'||(LA41_0 >= 'a' && LA41_0 <= 'z')) ) {
                    alt41=1;
                }


                switch (alt41) {
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
            	    break loop41;
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
            // DDL.g:223:5: ( ( '-' )? ( '0' .. '9' )+ )
            // DDL.g:223:7: ( '-' )? ( '0' .. '9' )+
            {
            // DDL.g:223:7: ( '-' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0=='-') ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // DDL.g:223:7: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // DDL.g:223:12: ( '0' .. '9' )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0 >= '0' && LA43_0 <= '9')) ) {
                    alt43=1;
                }


                switch (alt43) {
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
            	    if ( cnt43 >= 1 ) break loop43;
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
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
            // DDL.g:226:2: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' | '--' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            int alt51=4;
            switch ( input.LA(1) ) {
            case '/':
                {
                int LA51_1 = input.LA(2);

                if ( (LA51_1=='/') ) {
                    alt51=1;
                }
                else if ( (LA51_1=='*') ) {
                    alt51=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;

                }
                }
                break;
            case '-':
                {
                alt51=3;
                }
                break;
            case '#':
                {
                alt51=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;

            }

            switch (alt51) {
                case 1 :
                    // DDL.g:226:4: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // DDL.g:226:9: (~ ( '\\n' | '\\r' ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( ((LA44_0 >= '\u0000' && LA44_0 <= '\t')||(LA44_0 >= '\u000B' && LA44_0 <= '\f')||(LA44_0 >= '\u000E' && LA44_0 <= '\uFFFF')) ) {
                            alt44=1;
                        }


                        switch (alt44) {
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
                    	    break loop44;
                        }
                    } while (true);


                    // DDL.g:226:23: ( '\\r' )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0=='\r') ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // DDL.g:226:23: '\\r'
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
                    // DDL.g:227:4: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // DDL.g:227:9: ( options {greedy=false; } : . )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0=='*') ) {
                            int LA46_1 = input.LA(2);

                            if ( (LA46_1=='/') ) {
                                alt46=2;
                            }
                            else if ( ((LA46_1 >= '\u0000' && LA46_1 <= '.')||(LA46_1 >= '0' && LA46_1 <= '\uFFFF')) ) {
                                alt46=1;
                            }


                        }
                        else if ( ((LA46_0 >= '\u0000' && LA46_0 <= ')')||(LA46_0 >= '+' && LA46_0 <= '\uFFFF')) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // DDL.g:227:37: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;
                case 3 :
                    // DDL.g:228:4: '--' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("--"); 



                    // DDL.g:228:9: (~ ( '\\n' | '\\r' ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( ((LA47_0 >= '\u0000' && LA47_0 <= '\t')||(LA47_0 >= '\u000B' && LA47_0 <= '\f')||(LA47_0 >= '\u000E' && LA47_0 <= '\uFFFF')) ) {
                            alt47=1;
                        }


                        switch (alt47) {
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
                    	    break loop47;
                        }
                    } while (true);


                    // DDL.g:228:23: ( '\\r' )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0=='\r') ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // DDL.g:228:23: '\\r'
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
                    // DDL.g:229:5: '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match('#'); 

                    // DDL.g:229:9: (~ ( '\\n' | '\\r' ) )*
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


                    // DDL.g:229:23: ( '\\r' )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0=='\r') ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // DDL.g:229:23: '\\r'
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
            // DDL.g:232:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // DDL.g:232:7: ( ' ' | '\\t' | '\\r' | '\\n' )
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
            // DDL.g:234:5: ( ( '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )+ '\\'' ) | ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )+ '\"' ) | ( '`' ( ESC_SEQ |~ ( '\\\\' | '`' ) )+ '`' ) )
            int alt55=3;
            switch ( input.LA(1) ) {
            case '\'':
                {
                alt55=1;
                }
                break;
            case '\"':
                {
                alt55=2;
                }
                break;
            case '`':
                {
                alt55=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;

            }

            switch (alt55) {
                case 1 :
                    // DDL.g:234:7: ( '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )+ '\\'' )
                    {
                    // DDL.g:234:7: ( '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )+ '\\'' )
                    // DDL.g:234:9: '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )+ '\\''
                    {
                    match('\''); 

                    // DDL.g:234:14: ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )+
                    int cnt52=0;
                    loop52:
                    do {
                        int alt52=3;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0=='\\') ) {
                            alt52=1;
                        }
                        else if ( ((LA52_0 >= '\u0000' && LA52_0 <= '&')||(LA52_0 >= '(' && LA52_0 <= '[')||(LA52_0 >= ']' && LA52_0 <= '\uFFFF')) ) {
                            alt52=2;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // DDL.g:234:16: ESC_SEQ
                    	    {
                    	    mESC_SEQ(); 


                    	    }
                    	    break;
                    	case 2 :
                    	    // DDL.g:234:26: ~ ( '\\\\' | '\\'' )
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
                    	    if ( cnt52 >= 1 ) break loop52;
                                EarlyExitException eee =
                                    new EarlyExitException(52, input);
                                throw eee;
                        }
                        cnt52++;
                    } while (true);


                    match('\''); 

                    }


                    }
                    break;
                case 2 :
                    // DDL.g:235:4: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )+ '\"' )
                    {
                    // DDL.g:235:4: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )+ '\"' )
                    // DDL.g:235:6: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )+ '\"'
                    {
                    match('\"'); 

                    // DDL.g:235:10: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )+
                    int cnt53=0;
                    loop53:
                    do {
                        int alt53=3;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0=='\\') ) {
                            alt53=1;
                        }
                        else if ( ((LA53_0 >= '\u0000' && LA53_0 <= '!')||(LA53_0 >= '#' && LA53_0 <= '[')||(LA53_0 >= ']' && LA53_0 <= '\uFFFF')) ) {
                            alt53=2;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // DDL.g:235:12: ESC_SEQ
                    	    {
                    	    mESC_SEQ(); 


                    	    }
                    	    break;
                    	case 2 :
                    	    // DDL.g:235:22: ~ ( '\\\\' | '\"' )
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
                    	    if ( cnt53 >= 1 ) break loop53;
                                EarlyExitException eee =
                                    new EarlyExitException(53, input);
                                throw eee;
                        }
                        cnt53++;
                    } while (true);


                    match('\"'); 

                    }


                    }
                    break;
                case 3 :
                    // DDL.g:236:4: ( '`' ( ESC_SEQ |~ ( '\\\\' | '`' ) )+ '`' )
                    {
                    // DDL.g:236:4: ( '`' ( ESC_SEQ |~ ( '\\\\' | '`' ) )+ '`' )
                    // DDL.g:236:6: '`' ( ESC_SEQ |~ ( '\\\\' | '`' ) )+ '`'
                    {
                    match('`'); 

                    // DDL.g:236:10: ( ESC_SEQ |~ ( '\\\\' | '`' ) )+
                    int cnt54=0;
                    loop54:
                    do {
                        int alt54=3;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0=='\\') ) {
                            alt54=1;
                        }
                        else if ( ((LA54_0 >= '\u0000' && LA54_0 <= '[')||(LA54_0 >= ']' && LA54_0 <= '_')||(LA54_0 >= 'a' && LA54_0 <= '\uFFFF')) ) {
                            alt54=2;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // DDL.g:236:12: ESC_SEQ
                    	    {
                    	    mESC_SEQ(); 


                    	    }
                    	    break;
                    	case 2 :
                    	    // DDL.g:236:22: ~ ( '\\\\' | '`' )
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
                    	    if ( cnt54 >= 1 ) break loop54;
                                EarlyExitException eee =
                                    new EarlyExitException(54, input);
                                throw eee;
                        }
                        cnt54++;
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
            // DDL.g:242:2: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
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
            // DDL.g:247:2: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt56=3;
            int LA56_0 = input.LA(1);

            if ( (LA56_0=='\\') ) {
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
                    alt56=1;
                    }
                    break;
                case 'u':
                    {
                    alt56=2;
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
                    alt56=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;

            }
            switch (alt56) {
                case 1 :
                    // DDL.g:247:4: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // DDL.g:248:4: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // DDL.g:249:4: OCTAL_ESC
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
            // DDL.g:254:2: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt57=3;
            int LA57_0 = input.LA(1);

            if ( (LA57_0=='\\') ) {
                int LA57_1 = input.LA(2);

                if ( ((LA57_1 >= '0' && LA57_1 <= '3')) ) {
                    int LA57_2 = input.LA(3);

                    if ( ((LA57_2 >= '0' && LA57_2 <= '7')) ) {
                        int LA57_4 = input.LA(4);

                        if ( ((LA57_4 >= '0' && LA57_4 <= '7')) ) {
                            alt57=1;
                        }
                        else {
                            alt57=2;
                        }
                    }
                    else {
                        alt57=3;
                    }
                }
                else if ( ((LA57_1 >= '4' && LA57_1 <= '7')) ) {
                    int LA57_3 = input.LA(3);

                    if ( ((LA57_3 >= '0' && LA57_3 <= '7')) ) {
                        alt57=2;
                    }
                    else {
                        alt57=3;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;

            }
            switch (alt57) {
                case 1 :
                    // DDL.g:254:4: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
                    // DDL.g:255:4: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
                    // DDL.g:256:4: '\\\\' ( '0' .. '7' )
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
            // DDL.g:261:2: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // DDL.g:261:4: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
        // DDL.g:1:8: ( T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | DROP | CREATE | TABLE | IF | NOT | EXISTS | ENUM | NULL | DEFAULT | KEY | HASH | UNIQUE | PRIMARY | FOREIGN | INDEX | CONSTRAINT | FULLTEXT | REFERENCES | ON | INTO | VALUES | DELETE | CASCADE | RESTRICT | ACTION | NO | SET | INSERT | UPDATE | UNSIGNED | BINARY | AUTO_INC | ASC | DESC | CHARACTER | COLLATE | USE | SCHEMA | COMMIT | IS | CHECK | ID | INT | COMMENT | WS | DEF )
        int alt58=53;
        alt58 = dfa58.predict(input);
        switch (alt58) {
            case 1 :
                // DDL.g:1:10: T__54
                {
                mT__54(); 


                }
                break;
            case 2 :
                // DDL.g:1:16: T__55
                {
                mT__55(); 


                }
                break;
            case 3 :
                // DDL.g:1:22: T__56
                {
                mT__56(); 


                }
                break;
            case 4 :
                // DDL.g:1:28: T__57
                {
                mT__57(); 


                }
                break;
            case 5 :
                // DDL.g:1:34: T__58
                {
                mT__58(); 


                }
                break;
            case 6 :
                // DDL.g:1:40: T__59
                {
                mT__59(); 


                }
                break;
            case 7 :
                // DDL.g:1:46: T__60
                {
                mT__60(); 


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
                // DDL.g:1:140: CONSTRAINT
                {
                mCONSTRAINT(); 


                }
                break;
            case 24 :
                // DDL.g:1:151: FULLTEXT
                {
                mFULLTEXT(); 


                }
                break;
            case 25 :
                // DDL.g:1:160: REFERENCES
                {
                mREFERENCES(); 


                }
                break;
            case 26 :
                // DDL.g:1:171: ON
                {
                mON(); 


                }
                break;
            case 27 :
                // DDL.g:1:174: INTO
                {
                mINTO(); 


                }
                break;
            case 28 :
                // DDL.g:1:179: VALUES
                {
                mVALUES(); 


                }
                break;
            case 29 :
                // DDL.g:1:186: DELETE
                {
                mDELETE(); 


                }
                break;
            case 30 :
                // DDL.g:1:193: CASCADE
                {
                mCASCADE(); 


                }
                break;
            case 31 :
                // DDL.g:1:201: RESTRICT
                {
                mRESTRICT(); 


                }
                break;
            case 32 :
                // DDL.g:1:210: ACTION
                {
                mACTION(); 


                }
                break;
            case 33 :
                // DDL.g:1:217: NO
                {
                mNO(); 


                }
                break;
            case 34 :
                // DDL.g:1:220: SET
                {
                mSET(); 


                }
                break;
            case 35 :
                // DDL.g:1:224: INSERT
                {
                mINSERT(); 


                }
                break;
            case 36 :
                // DDL.g:1:231: UPDATE
                {
                mUPDATE(); 


                }
                break;
            case 37 :
                // DDL.g:1:238: UNSIGNED
                {
                mUNSIGNED(); 


                }
                break;
            case 38 :
                // DDL.g:1:247: BINARY
                {
                mBINARY(); 


                }
                break;
            case 39 :
                // DDL.g:1:254: AUTO_INC
                {
                mAUTO_INC(); 


                }
                break;
            case 40 :
                // DDL.g:1:263: ASC
                {
                mASC(); 


                }
                break;
            case 41 :
                // DDL.g:1:267: DESC
                {
                mDESC(); 


                }
                break;
            case 42 :
                // DDL.g:1:272: CHARACTER
                {
                mCHARACTER(); 


                }
                break;
            case 43 :
                // DDL.g:1:282: COLLATE
                {
                mCOLLATE(); 


                }
                break;
            case 44 :
                // DDL.g:1:290: USE
                {
                mUSE(); 


                }
                break;
            case 45 :
                // DDL.g:1:294: SCHEMA
                {
                mSCHEMA(); 


                }
                break;
            case 46 :
                // DDL.g:1:301: COMMIT
                {
                mCOMMIT(); 


                }
                break;
            case 47 :
                // DDL.g:1:308: IS
                {
                mIS(); 


                }
                break;
            case 48 :
                // DDL.g:1:311: CHECK
                {
                mCHECK(); 


                }
                break;
            case 49 :
                // DDL.g:1:317: ID
                {
                mID(); 


                }
                break;
            case 50 :
                // DDL.g:1:320: INT
                {
                mINT(); 


                }
                break;
            case 51 :
                // DDL.g:1:324: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 52 :
                // DDL.g:1:332: WS
                {
                mWS(); 


                }
                break;
            case 53 :
                // DDL.g:1:335: DEF
                {
                mDEF(); 


                }
                break;

        }

    }


    protected DFA58 dfa58 = new DFA58(this);
    static final String DFA58_eotS =
        "\1\24\7\uffff\14\52\1\uffff\25\52\7\uffff\16\52\1\u0087\1\52\1\u008b"+
        "\1\u0087\1\52\1\u008b\1\u0090\2\52\1\u0090\26\52\2\u00ae\46\52\1"+
        "\uffff\3\52\1\uffff\3\52\1\u00db\1\uffff\2\52\1\u00db\5\52\2\u00e3"+
        "\4\52\1\u00e8\3\52\1\u00e8\12\52\1\uffff\4\52\1\u00fa\2\52\1\u00fa"+
        "\1\u00fd\1\52\1\u00fd\3\52\1\u0102\2\52\1\u0105\1\u0102\2\52\1\u0105"+
        "\21\52\1\u0119\2\52\1\u0119\1\52\1\uffff\3\24\1\52\1\u011e\1\52"+
        "\1\u011e\1\uffff\4\52\1\uffff\21\52\1\uffff\2\52\1\uffff\4\52\1"+
        "\uffff\2\52\1\uffff\10\52\1\u0145\6\52\1\u0145\2\u014c\1\u014d\1"+
        "\uffff\1\52\1\u014d\2\52\1\uffff\35\52\1\u016e\1\52\1\u016e\1\u0170"+
        "\2\52\1\u0173\2\52\1\uffff\1\u0170\2\52\1\u0173\2\52\2\uffff\2\u017a"+
        "\2\u017b\1\52\1\u017d\1\52\1\u017f\1\u017d\1\52\1\u017f\12\52\2"+
        "\u018b\1\u018c\1\52\1\u018c\1\52\2\u018f\2\u0190\1\u0191\1\uffff"+
        "\1\u0191\1\uffff\1\52\1\u0193\1\uffff\1\u0194\2\52\1\u0193\1\u0194"+
        "\1\52\2\uffff\1\52\1\uffff\1\52\1\uffff\1\52\2\u019b\1\u019c\1\52"+
        "\1\u019c\5\52\2\uffff\2\52\3\uffff\1\52\2\uffff\3\52\1\u01a9\2\u01aa"+
        "\2\uffff\2\u01ab\1\52\1\u01ad\1\52\1\u01ad\3\52\1\u01b2\1\52\1\u01b2"+
        "\3\uffff\1\52\1\uffff\3\52\1\u01b8\1\uffff\1\u01b8\2\u01b9\2\52"+
        "\2\uffff\6\52\2\u01c2\1\uffff";
    static final String DFA58_eofS =
        "\u01c3\uffff";
    static final String DFA58_minS =
        "\1\11\6\uffff\1\0\1\105\1\145\1\101\1\141\1\101\1\141\1\106\1\146"+
        "\1\117\1\157\1\116\1\156\1\uffff\1\105\1\145\1\101\1\116\1\156\1"+
        "\122\1\162\1\117\1\157\1\105\1\145\1\116\1\156\1\101\1\141\1\103"+
        "\1\143\1\103\1\143\1\111\1\151\1\uffff\1\55\5\uffff\1\117\1\106"+
        "\1\157\1\146\1\105\1\114\1\123\1\101\1\145\1\154\1\163\1\141\1\102"+
        "\1\142\1\60\1\104\2\60\1\144\2\60\1\114\1\154\1\60\1\154\1\111\1"+
        "\125\1\151\1\165\1\131\1\171\1\123\1\111\1\104\1\105\1\151\1\144"+
        "\1\145\1\111\1\151\1\122\1\114\1\162\1\154\1\106\1\146\2\60\1\114"+
        "\1\154\2\124\1\103\2\164\1\143\1\124\1\110\1\164\1\150\1\116\1\156"+
        "\1\120\1\101\1\105\1\103\1\160\1\141\1\145\1\143\1\101\1\123\1\114"+
        "\1\115\1\103\1\122\1\103\1\141\1\163\1\154\1\155\1\143\1\162\1\143"+
        "\1\114\1\154\1\uffff\1\105\1\117\1\105\1\uffff\1\145\1\157\1\145"+
        "\1\60\1\uffff\1\114\1\154\1\60\1\154\1\123\1\115\1\163\1\155\2\60"+
        "\1\110\1\121\1\111\1\101\1\60\1\161\1\151\1\141\1\60\1\115\1\155"+
        "\1\105\1\114\1\145\1\154\1\105\1\124\1\145\1\164\1\uffff\1\125\1"+
        "\165\1\111\1\117\1\60\1\151\1\157\2\60\1\105\1\60\1\145\1\101\1"+
        "\141\1\60\1\125\1\124\2\60\1\165\1\164\1\60\2\124\1\101\1\111\2"+
        "\101\1\113\2\164\1\141\1\151\2\141\1\153\1\105\1\145\1\130\1\60"+
        "\1\122\1\170\1\60\1\162\1\uffff\3\60\1\124\1\60\1\164\1\60\1\uffff"+
        "\1\150\1\125\1\107\1\124\1\uffff\1\165\1\147\1\164\1\101\1\141\1"+
        "\111\1\124\1\151\1\164\2\122\2\162\1\105\1\145\1\117\1\137\1\uffff"+
        "\1\157\1\137\1\uffff\1\115\1\155\1\122\1\162\1\uffff\1\114\1\105"+
        "\1\uffff\1\154\1\145\1\105\1\122\2\124\1\104\1\103\1\60\1\145\1"+
        "\162\2\164\1\144\1\143\4\60\1\uffff\1\124\1\60\1\164\1\123\1\uffff"+
        "\1\163\1\141\1\105\1\116\1\105\1\145\1\156\1\145\1\122\1\162\1\107"+
        "\1\105\1\147\1\145\1\105\1\111\1\145\1\151\1\123\1\163\1\116\1\111"+
        "\1\156\1\151\1\101\1\141\1\131\1\171\1\124\1\60\1\164\2\60\1\101"+
        "\1\105\1\60\1\105\1\124\1\uffff\1\60\1\141\1\145\1\60\1\145\1\164"+
        "\2\uffff\4\60\1\163\1\60\1\105\2\60\1\145\1\60\1\131\1\171\1\116"+
        "\1\130\1\156\1\170\1\116\1\103\1\156\1\143\3\60\1\116\1\60\1\156"+
        "\5\60\1\uffff\1\60\1\uffff\1\111\1\60\1\uffff\1\60\1\105\1\151\2"+
        "\60\1\145\2\uffff\1\150\1\uffff\1\104\1\uffff\1\144\3\60\1\124\1"+
        "\60\1\164\1\103\1\124\1\143\1\164\2\uffff\1\103\1\143\3\uffff\1"+
        "\116\2\uffff\1\122\1\156\1\162\3\60\2\uffff\2\60\1\105\1\60\1\145"+
        "\1\60\1\122\1\162\1\124\1\60\1\164\1\60\3\uffff\1\123\1\uffff\1"+
        "\163\1\105\1\145\1\60\1\uffff\3\60\1\115\1\155\2\uffff\1\105\1\145"+
        "\1\116\1\156\1\124\1\164\2\60\1\uffff";
    static final String DFA58_maxS =
        "\1\172\6\uffff\1\uffff\1\122\1\162\1\122\1\162\1\101\1\141\1\123"+
        "\1\163\2\165\1\130\1\170\1\uffff\1\105\1\145\1\101\1\123\1\163\1"+
        "\122\1\162\1\125\1\165\1\105\1\145\1\116\1\156\1\101\1\141\1\125"+
        "\1\165\1\105\1\145\1\111\1\151\1\uffff\1\71\5\uffff\1\117\1\123"+
        "\1\157\1\163\1\105\1\116\1\123\1\105\1\145\1\156\1\163\1\145\1\102"+
        "\1\142\1\172\1\124\2\172\1\164\2\172\1\114\1\154\1\172\1\154\1\111"+
        "\1\125\1\151\1\165\1\131\1\171\2\123\1\104\1\105\1\163\1\144\1\145"+
        "\1\111\1\151\1\122\1\114\1\162\1\154\1\123\1\163\2\172\1\114\1\154"+
        "\2\124\1\103\2\164\1\143\1\124\1\110\1\164\1\150\1\116\1\156\1\120"+
        "\1\101\1\105\1\103\1\160\1\141\1\145\1\143\1\101\1\123\1\114\1\115"+
        "\1\103\1\122\1\103\1\141\1\163\1\154\1\155\1\143\1\162\1\143\1\114"+
        "\1\154\1\uffff\1\105\1\117\1\105\1\uffff\1\145\1\157\1\145\1\172"+
        "\1\uffff\1\114\1\154\1\172\1\154\1\123\1\115\1\163\1\155\2\172\1"+
        "\110\1\121\1\111\1\101\1\172\1\161\1\151\1\141\1\172\1\115\1\155"+
        "\1\105\1\114\1\145\1\154\1\105\1\124\1\145\1\164\1\uffff\1\125\1"+
        "\165\1\111\1\117\1\172\1\151\1\157\2\172\1\105\1\172\1\145\1\101"+
        "\1\141\1\172\1\125\1\124\2\172\1\165\1\164\1\172\2\124\1\101\1\111"+
        "\2\101\1\113\2\164\1\141\1\151\2\141\1\153\1\105\1\145\1\130\1\172"+
        "\1\122\1\170\1\172\1\162\1\uffff\3\172\1\124\1\172\1\164\1\172\1"+
        "\uffff\1\150\1\125\1\107\1\124\1\uffff\1\165\1\147\1\164\1\101\1"+
        "\141\1\111\1\124\1\151\1\164\2\122\2\162\1\105\1\145\1\117\1\137"+
        "\1\uffff\1\157\1\137\1\uffff\1\115\1\155\1\122\1\162\1\uffff\1\114"+
        "\1\105\1\uffff\1\154\1\145\1\105\1\122\2\124\1\104\1\103\1\172\1"+
        "\145\1\162\2\164\1\144\1\143\4\172\1\uffff\1\124\1\172\1\164\1\123"+
        "\1\uffff\1\163\1\141\1\105\1\116\1\105\1\145\1\156\1\145\1\122\1"+
        "\162\1\107\1\105\1\147\1\145\1\105\1\111\1\145\1\151\1\123\1\163"+
        "\1\116\1\111\1\156\1\151\1\101\1\141\1\131\1\171\1\124\1\172\1\164"+
        "\2\172\1\101\1\105\1\172\1\105\1\124\1\uffff\1\172\1\141\1\145\1"+
        "\172\1\145\1\164\2\uffff\4\172\1\163\1\172\1\105\2\172\1\145\1\172"+
        "\1\131\1\171\1\116\1\130\1\156\1\170\1\116\1\103\1\156\1\143\3\172"+
        "\1\116\1\172\1\156\5\172\1\uffff\1\172\1\uffff\1\111\1\172\1\uffff"+
        "\1\172\1\105\1\151\2\172\1\145\2\uffff\1\150\1\uffff\1\104\1\uffff"+
        "\1\144\3\172\1\124\1\172\1\164\1\103\1\124\1\143\1\164\2\uffff\1"+
        "\103\1\143\3\uffff\1\116\2\uffff\1\122\1\156\1\162\3\172\2\uffff"+
        "\2\172\1\105\1\172\1\145\1\172\1\122\1\162\1\124\1\172\1\164\1\172"+
        "\3\uffff\1\123\1\uffff\1\163\1\105\1\145\1\172\1\uffff\3\172\1\115"+
        "\1\155\2\uffff\1\105\1\145\1\116\1\156\1\124\1\164\2\172\1\uffff";
    static final String DFA58_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\15\uffff\1\17\25\uffff\1\61\1\uffff"+
        "\1\62\1\63\1\64\1\65\1\7\126\uffff\1\13\3\uffff\1\57\4\uffff\1\41"+
        "\35\uffff\1\32\54\uffff\1\14\7\uffff\1\21\4\uffff\1\54\21\uffff"+
        "\1\50\2\uffff\1\42\4\uffff\1\10\2\uffff\1\51\23\uffff\1\33\4\uffff"+
        "\1\16\46\uffff\1\60\6\uffff\1\12\1\26\40\uffff\1\35\1\uffff\1\11"+
        "\2\uffff\1\56\6\uffff\1\43\1\15\1\uffff\1\23\1\uffff\1\44\13\uffff"+
        "\1\34\1\40\2\uffff\1\55\1\46\1\20\1\uffff\1\53\1\36\6\uffff\1\24"+
        "\1\25\14\uffff\1\22\1\45\1\30\1\uffff\1\37\4\uffff\1\52\5\uffff"+
        "\1\27\1\31\10\uffff\1\47";
    static final String DFA58_specialS =
        "\7\uffff\1\0\u01bb\uffff}>";
    static final String[] DFA58_transitionS = {
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
            "\1\67\6\uffff\1\70\6\uffff\1\66\2\uffff\1\65",
            "\1\73\6\uffff\1\74\6\uffff\1\72\2\uffff\1\71",
            "\1\75",
            "\1\76",
            "\1\77\7\uffff\1\100\4\uffff\1\101",
            "\1\102\7\uffff\1\103\4\uffff\1\104",
            "\1\105\5\uffff\1\106\37\uffff\1\107",
            "\1\110\5\uffff\1\111",
            "\1\113\11\uffff\1\112",
            "\1\115\11\uffff\1\114",
            "",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121\1\uffff\1\122\2\uffff\1\123",
            "\1\124\1\uffff\1\125\2\uffff\1\126",
            "\1\127",
            "\1\130",
            "\1\131\5\uffff\1\132",
            "\1\133\5\uffff\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143\17\uffff\1\145\1\uffff\1\144",
            "\1\146\17\uffff\1\150\1\uffff\1\147",
            "\1\152\1\uffff\1\151",
            "\1\154\1\uffff\1\153",
            "\1\155",
            "\1\156",
            "",
            "\1\55\2\uffff\12\54",
            "",
            "",
            "",
            "",
            "",
            "\1\157",
            "\1\160\5\uffff\1\161\6\uffff\1\162",
            "\1\163",
            "\1\164\5\uffff\1\165\6\uffff\1\166",
            "\1\167",
            "\1\171\1\172\1\170",
            "\1\173",
            "\1\174\3\uffff\1\175",
            "\1\176",
            "\1\u0080\1\u0081\1\177",
            "\1\u0082",
            "\1\u0083\3\uffff\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0088\16\uffff\1\u008a\1\u0089",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u008c\16\uffff\1\u008e\1\u008d",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\23\52\1\u008f\6\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0091",
            "\1\u0092",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\u0093\6\52",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c\11\uffff\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0\11\uffff\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa\14\uffff\1\u00ab",
            "\1\u00ac\14\uffff\1\u00ad",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
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
            "",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u00dc",
            "\1\u00dd",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00fb",
            "\1\u00fc",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00fe",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0103",
            "\1\u0104",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0106",
            "\1\u0107",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
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
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u011a",
            "\1\u011b",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u011c",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u011d",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u011f",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "",
            "\1\u0124",
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
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "",
            "\1\u0135",
            "\1\u0136",
            "",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "",
            "\1\u013b",
            "\1\u013c",
            "",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u014e",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u014f",
            "\1\u0150",
            "",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
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
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u016f",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0171",
            "\1\u0172",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0174",
            "\1\u0175",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0176",
            "\1\u0177",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0178",
            "\1\u0179",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u017c",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u017e",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0180",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u018d",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u018e",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u0192",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0195",
            "\1\u0196",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0197",
            "",
            "",
            "\1\u0198",
            "",
            "\1\u0199",
            "",
            "\1\u019a",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u019d",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u019e",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "",
            "",
            "\1\u01a3",
            "\1\u01a4",
            "",
            "",
            "",
            "\1\u01a5",
            "",
            "",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01ac",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01ae",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01b3",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "\1\u01b4",
            "",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u01ba",
            "\1\u01bb",
            "",
            "",
            "\1\u01bc",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            ""
    };

    static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
    static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
    static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
    static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
    static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
    static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
    static final short[][] DFA58_transition;

    static {
        int numStates = DFA58_transitionS.length;
        DFA58_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = DFA58_eot;
            this.eof = DFA58_eof;
            this.min = DFA58_min;
            this.max = DFA58_max;
            this.accept = DFA58_accept;
            this.special = DFA58_special;
            this.transition = DFA58_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | DROP | CREATE | TABLE | IF | NOT | EXISTS | ENUM | NULL | DEFAULT | KEY | HASH | UNIQUE | PRIMARY | FOREIGN | INDEX | CONSTRAINT | FULLTEXT | REFERENCES | ON | INTO | VALUES | DELETE | CASCADE | RESTRICT | ACTION | NO | SET | INSERT | UPDATE | UNSIGNED | BINARY | AUTO_INC | ASC | DESC | CHARACTER | COLLATE | USE | SCHEMA | COMMIT | IS | CHECK | ID | INT | COMMENT | WS | DEF );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_7 = input.LA(1);

                        s = -1;
                        if ( (LA58_7=='\'') ) {s = 48;}

                        else if ( ((LA58_7 >= '\u0000' && LA58_7 <= '&')||(LA58_7 >= '(' && LA58_7 <= '\uFFFF')) ) {s = 47;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 58, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}