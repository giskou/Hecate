// $ANTLR 3.4 /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g 2012-11-20 18:06:13

  package gr.uoi.cs.dmod.hecate.parser ;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class DDLLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int ACTION=4;
    public static final int ASC=5;
    public static final int AUTO_INC=6;
    public static final int BINARY=7;
    public static final int CASCADE=8;
    public static final int CHARACTER=9;
    public static final int COMMENT=10;
    public static final int CREATE=11;
    public static final int DEF=12;
    public static final int DEFAULT=13;
    public static final int DELETE=14;
    public static final int DESC=15;
    public static final int DROP=16;
    public static final int ENUM=17;
    public static final int ESC_SEQ=18;
    public static final int EXISTS=19;
    public static final int FOREIGN=20;
    public static final int FULLTEXT=21;
    public static final int HASH=22;
    public static final int HEX_DIGIT=23;
    public static final int ID=24;
    public static final int IF=25;
    public static final int INDEX=26;
    public static final int INT=27;
    public static final int KEY=28;
    public static final int NO=29;
    public static final int NOT=30;
    public static final int NULL=31;
    public static final int OCTAL_ESC=32;
    public static final int ON=33;
    public static final int PRIMARY=34;
    public static final int REFERENCES=35;
    public static final int RESTRICT=36;
    public static final int SCHEMA=37;
    public static final int SET=38;
    public static final int TABLE=39;
    public static final int UNICODE_ESC=40;
    public static final int UNIQUE=41;
    public static final int UNSIGNED=42;
    public static final int UPDATE=43;
    public static final int USE=44;
    public static final int WS=45;

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
    public String getGrammarFileName() { return "/home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g"; }

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:11:7: ( '(' )
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:11:9: '('
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
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:12:7: ( ')' )
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:12:9: ')'
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
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:13:7: ( ',' )
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:13:9: ','
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
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:14:7: ( '.' )
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:14:9: '.'
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
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:15:7: ( ';' )
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:15:9: ';'
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
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:16:7: ( '=' )
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:16:9: '='
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
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:17:7: ( '\\'\\'' )
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:17:9: '\\'\\''
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
    // $ANTLR end "T__52"

    // $ANTLR start "DROP"
    public final void mDROP() throws RecognitionException {
        try {
            int _type = DROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:158:6: ( 'DROP' | 'drop' )
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
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:158:8: 'DROP'
                    {
                    match("DROP"); 



                    }
                    break;
                case 2 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:158:17: 'drop'
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:159:8: ( 'CREATE' | 'create' )
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
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:159:10: 'CREATE'
                    {
                    match("CREATE"); 



                    }
                    break;
                case 2 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:159:21: 'create'
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:160:7: ( 'TABLE' | 'table' )
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
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:160:9: 'TABLE'
                    {
                    match("TABLE"); 



                    }
                    break;
                case 2 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:160:19: 'table'
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:161:4: ( 'IF' | 'if' )
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
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:161:6: 'IF'
                    {
                    match("IF"); 



                    }
                    break;
                case 2 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:161:13: 'if'
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:162:5: ( 'NOT' | 'not' )
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
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:162:7: 'NOT'
                    {
                    match("NOT"); 



                    }
                    break;
                case 2 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:162:15: 'not'
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:163:8: ( 'EXISTS' | 'exists' )
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
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:163:10: 'EXISTS'
                    {
                    match("EXISTS"); 



                    }
                    break;
                case 2 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:163:21: 'exists'
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:164:6: ( 'ENUM' | 'enum' )
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
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:164:8: 'ENUM'
                    {
                    match("ENUM"); 



                    }
                    break;
                case 2 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:164:17: 'enum'
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:165:6: ( ( 'NULL' | 'null' )? )
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:165:8: ( 'NULL' | 'null' )?
            {
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:165:8: ( 'NULL' | 'null' )?
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
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:165:9: 'NULL'
                    {
                    match("NULL"); 



                    }
                    break;
                case 2 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:165:18: 'null'
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:166:9: ( 'DEFAULT' | 'default' )
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
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:166:11: 'DEFAULT'
                    {
                    match("DEFAULT"); 



                    }
                    break;
                case 2 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:166:23: 'default'
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:167:5: ( 'KEY' | 'key' )
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
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:167:7: 'KEY'
                    {
                    match("KEY"); 



                    }
                    break;
                case 2 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:167:15: 'key'
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:168:6: ( 'HASH' 'hash' )
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:168:8: 'HASH' 'hash'
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:169:8: ( 'UNIQUE' | 'unique' )
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
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:169:10: 'UNIQUE'
                    {
                    match("UNIQUE"); 



                    }
                    break;
                case 2 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:169:21: 'unique'
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:170:9: ( 'PRIMARY' | 'primary' )
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
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:170:11: 'PRIMARY'
                    {
                    match("PRIMARY"); 



                    }
                    break;
                case 2 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:170:23: 'primary'
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:171:9: ( 'FOREIGN' | 'foreign' )
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
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:171:11: 'FOREIGN'
                    {
                    match("FOREIGN"); 



                    }
                    break;
                case 2 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:171:23: 'foreign'
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:172:7: ( 'INDEX' | 'index' )
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
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:172:9: 'INDEX'
                    {
                    match("INDEX"); 



                    }
                    break;
                case 2 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:172:19: 'index'
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:173:10: ( 'FULLTEXT' | 'fulltext' )
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
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:173:12: 'FULLTEXT'
                    {
                    match("FULLTEXT"); 



                    }
                    break;
                case 2 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:173:25: 'fulltext'
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:174:12: ( 'REFERENCES' | 'references' )
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
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:174:14: 'REFERENCES'
                    {
                    match("REFERENCES"); 



                    }
                    break;
                case 2 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:174:29: 'references'
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:175:4: ( 'ON' | 'on' )
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
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:175:6: 'ON'
                    {
                    match("ON"); 



                    }
                    break;
                case 2 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:175:13: 'on'
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

    // $ANTLR start "DELETE"
    public final void mDELETE() throws RecognitionException {
        try {
            int _type = DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:176:8: ( 'DELETE' | 'delete' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='D') ) {
                alt18=1;
            }
            else if ( (LA18_0=='d') ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:176:10: 'DELETE'
                    {
                    match("DELETE"); 



                    }
                    break;
                case 2 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:176:21: 'delete'
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:177:9: ( 'CASCADE' | 'cascade' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='C') ) {
                alt19=1;
            }
            else if ( (LA19_0=='c') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:177:11: 'CASCADE'
                    {
                    match("CASCADE"); 



                    }
                    break;
                case 2 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:177:23: 'cascade'
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:178:10: ( 'RESTRICT' | 'restrict' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='R') ) {
                alt20=1;
            }
            else if ( (LA20_0=='r') ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:178:12: 'RESTRICT'
                    {
                    match("RESTRICT"); 



                    }
                    break;
                case 2 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:178:25: 'restrict'
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:179:8: ( 'ACTION' | 'action' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='A') ) {
                alt21=1;
            }
            else if ( (LA21_0=='a') ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:179:10: 'ACTION'
                    {
                    match("ACTION"); 



                    }
                    break;
                case 2 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:179:21: 'action'
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:180:4: ( 'NO' | 'no' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='N') ) {
                alt22=1;
            }
            else if ( (LA22_0=='n') ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:180:6: 'NO'
                    {
                    match("NO"); 



                    }
                    break;
                case 2 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:180:13: 'no'
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:181:5: ( 'SET' | 'set' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='S') ) {
                alt23=1;
            }
            else if ( (LA23_0=='s') ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:181:7: 'SET'
                    {
                    match("SET"); 



                    }
                    break;
                case 2 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:181:15: 'set'
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

    // $ANTLR start "UPDATE"
    public final void mUPDATE() throws RecognitionException {
        try {
            int _type = UPDATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:182:8: ( 'UPDATE' | 'update' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='U') ) {
                alt24=1;
            }
            else if ( (LA24_0=='u') ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:182:10: 'UPDATE'
                    {
                    match("UPDATE"); 



                    }
                    break;
                case 2 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:182:21: 'update'
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:183:10: ( 'UNSIGNED' | 'unsigned' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='U') ) {
                alt25=1;
            }
            else if ( (LA25_0=='u') ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:183:12: 'UNSIGNED'
                    {
                    match("UNSIGNED"); 



                    }
                    break;
                case 2 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:183:25: 'unsigned'
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:184:8: ( 'BINARY' | 'binary' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='B') ) {
                alt26=1;
            }
            else if ( (LA26_0=='b') ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:184:10: 'BINARY'
                    {
                    match("BINARY"); 



                    }
                    break;
                case 2 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:184:21: 'binary'
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:185:10: ( 'AUTO_INCREMENT' | 'auto_increment' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='A') ) {
                alt27=1;
            }
            else if ( (LA27_0=='a') ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:185:12: 'AUTO_INCREMENT'
                    {
                    match("AUTO_INCREMENT"); 



                    }
                    break;
                case 2 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:185:31: 'auto_increment'
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:186:5: ( 'ASC' | 'asc' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='A') ) {
                alt28=1;
            }
            else if ( (LA28_0=='a') ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:186:7: 'ASC'
                    {
                    match("ASC"); 



                    }
                    break;
                case 2 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:186:15: 'asc'
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:187:6: ( 'DESC' | 'desc' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='D') ) {
                alt29=1;
            }
            else if ( (LA29_0=='d') ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:187:8: 'DESC'
                    {
                    match("DESC"); 



                    }
                    break;
                case 2 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:187:17: 'desc'
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:188:11: ( 'CHARACTER' | 'character' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='C') ) {
                alt30=1;
            }
            else if ( (LA30_0=='c') ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:188:13: 'CHARACTER'
                    {
                    match("CHARACTER"); 



                    }
                    break;
                case 2 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:188:27: 'character'
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

    // $ANTLR start "USE"
    public final void mUSE() throws RecognitionException {
        try {
            int _type = USE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:189:5: ( 'USE' | 'use' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0=='U') ) {
                alt31=1;
            }
            else if ( (LA31_0=='u') ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }
            switch (alt31) {
                case 1 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:189:7: 'USE'
                    {
                    match("USE"); 



                    }
                    break;
                case 2 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:189:15: 'use'
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:190:8: ( 'SCHEMA' | 'schema' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='S') ) {
                alt32=1;
            }
            else if ( (LA32_0=='s') ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:190:10: 'SCHEMA'
                    {
                    match("SCHEMA"); 



                    }
                    break;
                case 2 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:190:21: 'schema'
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:192:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:192:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:192:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0 >= '0' && LA33_0 <= '9')||(LA33_0 >= 'A' && LA33_0 <= 'Z')||LA33_0=='_'||(LA33_0 >= 'a' && LA33_0 <= 'z')) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:
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
            	    break loop33;
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:194:5: ( ( '-' )? ( '0' .. '9' )+ )
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:194:7: ( '-' )? ( '0' .. '9' )+
            {
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:194:7: ( '-' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='-') ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:194:7: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:194:12: ( '0' .. '9' )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0 >= '0' && LA35_0 <= '9')) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:
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
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:197:2: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' | '--' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            int alt43=4;
            switch ( input.LA(1) ) {
            case '/':
                {
                int LA43_1 = input.LA(2);

                if ( (LA43_1=='/') ) {
                    alt43=1;
                }
                else if ( (LA43_1=='*') ) {
                    alt43=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;

                }
                }
                break;
            case '-':
                {
                alt43=3;
                }
                break;
            case '#':
                {
                alt43=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }

            switch (alt43) {
                case 1 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:197:4: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:197:9: (~ ( '\\n' | '\\r' ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( ((LA36_0 >= '\u0000' && LA36_0 <= '\t')||(LA36_0 >= '\u000B' && LA36_0 <= '\f')||(LA36_0 >= '\u000E' && LA36_0 <= '\uFFFF')) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:
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
                    	    break loop36;
                        }
                    } while (true);


                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:197:23: ( '\\r' )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0=='\r') ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:197:23: '\\r'
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
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:198:4: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:198:9: ( options {greedy=false; } : . )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0=='*') ) {
                            int LA38_1 = input.LA(2);

                            if ( (LA38_1=='/') ) {
                                alt38=2;
                            }
                            else if ( ((LA38_1 >= '\u0000' && LA38_1 <= '.')||(LA38_1 >= '0' && LA38_1 <= '\uFFFF')) ) {
                                alt38=1;
                            }


                        }
                        else if ( ((LA38_0 >= '\u0000' && LA38_0 <= ')')||(LA38_0 >= '+' && LA38_0 <= '\uFFFF')) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:198:37: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;
                case 3 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:199:4: '--' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("--"); 



                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:199:9: (~ ( '\\n' | '\\r' ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( ((LA39_0 >= '\u0000' && LA39_0 <= '\t')||(LA39_0 >= '\u000B' && LA39_0 <= '\f')||(LA39_0 >= '\u000E' && LA39_0 <= '\uFFFF')) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:
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
                    	    break loop39;
                        }
                    } while (true);


                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:199:23: ( '\\r' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0=='\r') ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:199:23: '\\r'
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
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:200:5: '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match('#'); 

                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:200:9: (~ ( '\\n' | '\\r' ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( ((LA41_0 >= '\u0000' && LA41_0 <= '\t')||(LA41_0 >= '\u000B' && LA41_0 <= '\f')||(LA41_0 >= '\u000E' && LA41_0 <= '\uFFFF')) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:
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
                    	    break loop41;
                        }
                    } while (true);


                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:200:23: ( '\\r' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0=='\r') ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:200:23: '\\r'
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:203:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:203:7: ( ' ' | '\\t' | '\\r' | '\\n' )
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:205:5: ( ( '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )+ '\\'' ) | ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )+ '\"' ) | ( '`' ( ESC_SEQ |~ ( '\\\\' | '`' ) )+ '`' ) )
            int alt47=3;
            switch ( input.LA(1) ) {
            case '\'':
                {
                alt47=1;
                }
                break;
            case '\"':
                {
                alt47=2;
                }
                break;
            case '`':
                {
                alt47=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;

            }

            switch (alt47) {
                case 1 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:205:7: ( '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )+ '\\'' )
                    {
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:205:7: ( '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )+ '\\'' )
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:205:9: '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )+ '\\''
                    {
                    match('\''); 

                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:205:14: ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )+
                    int cnt44=0;
                    loop44:
                    do {
                        int alt44=3;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0=='\\') ) {
                            alt44=1;
                        }
                        else if ( ((LA44_0 >= '\u0000' && LA44_0 <= '&')||(LA44_0 >= '(' && LA44_0 <= '[')||(LA44_0 >= ']' && LA44_0 <= '\uFFFF')) ) {
                            alt44=2;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:205:16: ESC_SEQ
                    	    {
                    	    mESC_SEQ(); 


                    	    }
                    	    break;
                    	case 2 :
                    	    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:205:26: ~ ( '\\\\' | '\\'' )
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
                    	    if ( cnt44 >= 1 ) break loop44;
                                EarlyExitException eee =
                                    new EarlyExitException(44, input);
                                throw eee;
                        }
                        cnt44++;
                    } while (true);


                    match('\''); 

                    }


                    }
                    break;
                case 2 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:206:4: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )+ '\"' )
                    {
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:206:4: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )+ '\"' )
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:206:6: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )+ '\"'
                    {
                    match('\"'); 

                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:206:10: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )+
                    int cnt45=0;
                    loop45:
                    do {
                        int alt45=3;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0=='\\') ) {
                            alt45=1;
                        }
                        else if ( ((LA45_0 >= '\u0000' && LA45_0 <= '!')||(LA45_0 >= '#' && LA45_0 <= '[')||(LA45_0 >= ']' && LA45_0 <= '\uFFFF')) ) {
                            alt45=2;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:206:12: ESC_SEQ
                    	    {
                    	    mESC_SEQ(); 


                    	    }
                    	    break;
                    	case 2 :
                    	    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:206:22: ~ ( '\\\\' | '\"' )
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
                    	    if ( cnt45 >= 1 ) break loop45;
                                EarlyExitException eee =
                                    new EarlyExitException(45, input);
                                throw eee;
                        }
                        cnt45++;
                    } while (true);


                    match('\"'); 

                    }


                    }
                    break;
                case 3 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:207:4: ( '`' ( ESC_SEQ |~ ( '\\\\' | '`' ) )+ '`' )
                    {
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:207:4: ( '`' ( ESC_SEQ |~ ( '\\\\' | '`' ) )+ '`' )
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:207:6: '`' ( ESC_SEQ |~ ( '\\\\' | '`' ) )+ '`'
                    {
                    match('`'); 

                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:207:10: ( ESC_SEQ |~ ( '\\\\' | '`' ) )+
                    int cnt46=0;
                    loop46:
                    do {
                        int alt46=3;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0=='\\') ) {
                            alt46=1;
                        }
                        else if ( ((LA46_0 >= '\u0000' && LA46_0 <= '[')||(LA46_0 >= ']' && LA46_0 <= '_')||(LA46_0 >= 'a' && LA46_0 <= '\uFFFF')) ) {
                            alt46=2;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:207:12: ESC_SEQ
                    	    {
                    	    mESC_SEQ(); 


                    	    }
                    	    break;
                    	case 2 :
                    	    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:207:22: ~ ( '\\\\' | '`' )
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
                    	    if ( cnt46 >= 1 ) break loop46;
                                EarlyExitException eee =
                                    new EarlyExitException(46, input);
                                throw eee;
                        }
                        cnt46++;
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:213:2: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:218:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt48=3;
            int LA48_0 = input.LA(1);

            if ( (LA48_0=='\\') ) {
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
                    alt48=1;
                    }
                    break;
                case 'u':
                    {
                    alt48=2;
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
                    alt48=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;

            }
            switch (alt48) {
                case 1 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:218:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:219:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:220:9: OCTAL_ESC
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:225:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt49=3;
            int LA49_0 = input.LA(1);

            if ( (LA49_0=='\\') ) {
                int LA49_1 = input.LA(2);

                if ( ((LA49_1 >= '0' && LA49_1 <= '3')) ) {
                    int LA49_2 = input.LA(3);

                    if ( ((LA49_2 >= '0' && LA49_2 <= '7')) ) {
                        int LA49_4 = input.LA(4);

                        if ( ((LA49_4 >= '0' && LA49_4 <= '7')) ) {
                            alt49=1;
                        }
                        else {
                            alt49=2;
                        }
                    }
                    else {
                        alt49=3;
                    }
                }
                else if ( ((LA49_1 >= '4' && LA49_1 <= '7')) ) {
                    int LA49_3 = input.LA(3);

                    if ( ((LA49_3 >= '0' && LA49_3 <= '7')) ) {
                        alt49=2;
                    }
                    else {
                        alt49=3;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 49, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;

            }
            switch (alt49) {
                case 1 :
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:225:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:226:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
                    // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:227:9: '\\\\' ( '0' .. '7' )
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
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:232:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:232:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
        // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:8: ( T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | DROP | CREATE | TABLE | IF | NOT | EXISTS | ENUM | NULL | DEFAULT | KEY | HASH | UNIQUE | PRIMARY | FOREIGN | INDEX | FULLTEXT | REFERENCES | ON | DELETE | CASCADE | RESTRICT | ACTION | NO | SET | UPDATE | UNSIGNED | BINARY | AUTO_INC | ASC | DESC | CHARACTER | USE | SCHEMA | ID | INT | COMMENT | WS | DEF )
        int alt50=45;
        alt50 = dfa50.predict(input);
        switch (alt50) {
            case 1 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:10: T__46
                {
                mT__46(); 


                }
                break;
            case 2 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:16: T__47
                {
                mT__47(); 


                }
                break;
            case 3 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:22: T__48
                {
                mT__48(); 


                }
                break;
            case 4 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:28: T__49
                {
                mT__49(); 


                }
                break;
            case 5 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:34: T__50
                {
                mT__50(); 


                }
                break;
            case 6 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:40: T__51
                {
                mT__51(); 


                }
                break;
            case 7 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:46: T__52
                {
                mT__52(); 


                }
                break;
            case 8 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:52: DROP
                {
                mDROP(); 


                }
                break;
            case 9 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:57: CREATE
                {
                mCREATE(); 


                }
                break;
            case 10 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:64: TABLE
                {
                mTABLE(); 


                }
                break;
            case 11 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:70: IF
                {
                mIF(); 


                }
                break;
            case 12 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:73: NOT
                {
                mNOT(); 


                }
                break;
            case 13 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:77: EXISTS
                {
                mEXISTS(); 


                }
                break;
            case 14 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:84: ENUM
                {
                mENUM(); 


                }
                break;
            case 15 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:89: NULL
                {
                mNULL(); 


                }
                break;
            case 16 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:94: DEFAULT
                {
                mDEFAULT(); 


                }
                break;
            case 17 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:102: KEY
                {
                mKEY(); 


                }
                break;
            case 18 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:106: HASH
                {
                mHASH(); 


                }
                break;
            case 19 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:111: UNIQUE
                {
                mUNIQUE(); 


                }
                break;
            case 20 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:118: PRIMARY
                {
                mPRIMARY(); 


                }
                break;
            case 21 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:126: FOREIGN
                {
                mFOREIGN(); 


                }
                break;
            case 22 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:134: INDEX
                {
                mINDEX(); 


                }
                break;
            case 23 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:140: FULLTEXT
                {
                mFULLTEXT(); 


                }
                break;
            case 24 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:149: REFERENCES
                {
                mREFERENCES(); 


                }
                break;
            case 25 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:160: ON
                {
                mON(); 


                }
                break;
            case 26 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:163: DELETE
                {
                mDELETE(); 


                }
                break;
            case 27 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:170: CASCADE
                {
                mCASCADE(); 


                }
                break;
            case 28 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:178: RESTRICT
                {
                mRESTRICT(); 


                }
                break;
            case 29 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:187: ACTION
                {
                mACTION(); 


                }
                break;
            case 30 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:194: NO
                {
                mNO(); 


                }
                break;
            case 31 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:197: SET
                {
                mSET(); 


                }
                break;
            case 32 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:201: UPDATE
                {
                mUPDATE(); 


                }
                break;
            case 33 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:208: UNSIGNED
                {
                mUNSIGNED(); 


                }
                break;
            case 34 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:217: BINARY
                {
                mBINARY(); 


                }
                break;
            case 35 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:224: AUTO_INC
                {
                mAUTO_INC(); 


                }
                break;
            case 36 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:233: ASC
                {
                mASC(); 


                }
                break;
            case 37 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:237: DESC
                {
                mDESC(); 


                }
                break;
            case 38 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:242: CHARACTER
                {
                mCHARACTER(); 


                }
                break;
            case 39 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:252: USE
                {
                mUSE(); 


                }
                break;
            case 40 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:256: SCHEMA
                {
                mSCHEMA(); 


                }
                break;
            case 41 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:263: ID
                {
                mID(); 


                }
                break;
            case 42 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:266: INT
                {
                mINT(); 


                }
                break;
            case 43 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:270: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 44 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:278: WS
                {
                mWS(); 


                }
                break;
            case 45 :
                // /home/iskoulis/Dev/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:281: DEF
                {
                mDEF(); 


                }
                break;

        }

    }


    protected DFA50 dfa50 = new DFA50(this);
    static final String DFA50_eotS =
        "\1\24\7\uffff\14\50\1\uffff\23\50\7\uffff\14\50\1\166\1\50\1\166"+
        "\1\50\1\172\1\50\1\172\26\50\2\u0097\34\50\1\uffff\2\50\1\u00b6"+
        "\1\uffff\1\50\1\u00b6\5\50\2\u00bd\4\50\1\u00c2\3\50\1\u00c2\12"+
        "\50\1\uffff\2\50\1\u00d2\2\50\1\u00d2\1\u00d5\1\50\1\u00d5\3\50"+
        "\1\u00da\2\50\1\u00dd\1\u00da\2\50\1\u00dd\12\50\1\uffff\2\24\1"+
        "\50\1\u00eb\1\50\1\u00eb\1\uffff\4\50\1\uffff\17\50\1\uffff\2\50"+
        "\1\uffff\4\50\1\uffff\2\50\1\uffff\10\50\2\u0110\2\u0111\1\50\1"+
        "\uffff\33\50\1\u012e\1\50\1\u012e\1\u0130\2\50\1\u0130\2\50\2\uffff"+
        "\2\u0135\1\50\1\u0137\1\50\1\u0139\1\u0137\1\50\1\u0139\12\50\1"+
        "\u0145\1\50\1\u0145\1\50\2\u0148\2\u0149\1\u014a\1\uffff\1\u014a"+
        "\1\uffff\1\u014b\1\50\1\u014b\1\50\1\uffff\1\50\1\uffff\1\50\1\uffff"+
        "\1\50\2\u0151\1\u0152\1\50\1\u0152\5\50\1\uffff\2\50\4\uffff\2\50"+
        "\1\u015d\2\u015e\2\uffff\2\u015f\1\50\1\u0161\1\50\1\u0161\2\50"+
        "\2\u0165\3\uffff\1\50\1\uffff\3\50\1\uffff\2\u016a\2\50\1\uffff"+
        "\6\50\2\u0173\1\uffff";
    static final String DFA50_eofS =
        "\u0174\uffff";
    static final String DFA50_minS =
        "\1\11\6\uffff\1\0\1\105\1\145\1\101\1\141\1\101\1\141\1\106\1\146"+
        "\1\117\1\157\1\116\1\156\1\uffff\1\105\1\145\1\101\1\116\1\156\1"+
        "\122\1\162\1\117\1\157\1\105\1\145\1\116\1\156\1\103\1\143\1\103"+
        "\1\143\1\111\1\151\1\uffff\1\55\5\uffff\1\117\1\106\1\157\1\146"+
        "\1\105\1\123\1\101\1\145\1\163\1\141\1\102\1\142\1\60\1\104\1\60"+
        "\1\144\1\60\1\114\1\60\1\154\1\111\1\125\1\151\1\165\1\131\1\171"+
        "\1\123\1\111\1\104\1\105\1\151\1\144\1\145\1\111\1\151\1\122\1\114"+
        "\1\162\1\154\1\106\1\146\2\60\2\124\1\103\2\164\1\143\1\124\1\110"+
        "\1\164\1\150\1\116\1\156\1\120\1\101\1\105\1\103\1\160\1\141\1\145"+
        "\1\143\1\101\1\103\1\122\1\141\1\143\1\162\1\114\1\154\1\uffff\1"+
        "\105\1\145\1\60\1\uffff\1\114\1\60\1\154\1\123\1\115\1\163\1\155"+
        "\2\60\1\110\1\121\1\111\1\101\1\60\1\161\1\151\1\141\1\60\1\115"+
        "\1\155\1\105\1\114\1\145\1\154\1\105\1\124\1\145\1\164\1\uffff\1"+
        "\111\1\117\1\60\1\151\1\157\2\60\1\105\1\60\1\145\1\101\1\141\1"+
        "\60\1\125\1\124\2\60\1\165\1\164\1\60\1\124\2\101\1\164\2\141\1"+
        "\105\1\145\1\130\1\170\1\uffff\2\60\1\124\1\60\1\164\1\60\1\uffff"+
        "\1\150\1\125\1\107\1\124\1\uffff\1\165\1\147\1\164\1\101\1\141\1"+
        "\111\1\124\1\151\1\164\2\122\2\162\1\117\1\137\1\uffff\1\157\1\137"+
        "\1\uffff\1\115\1\155\1\122\1\162\1\uffff\1\114\1\105\1\uffff\1\154"+
        "\1\145\1\105\1\104\1\103\1\145\1\144\1\143\4\60\1\123\1\uffff\1"+
        "\163\1\141\1\105\1\116\1\105\1\145\1\156\1\145\1\122\1\162\1\107"+
        "\1\105\1\147\1\145\1\105\1\111\1\145\1\151\1\116\1\111\1\156\1\151"+
        "\1\101\1\141\1\131\1\171\1\124\1\60\1\164\2\60\1\105\1\124\1\60"+
        "\1\145\1\164\2\uffff\2\60\1\163\1\60\1\105\2\60\1\145\1\60\1\131"+
        "\1\171\1\116\1\130\1\156\1\170\1\116\1\103\1\156\1\143\1\60\1\116"+
        "\1\60\1\156\5\60\1\uffff\1\60\1\uffff\1\60\1\105\1\60\1\145\1\uffff"+
        "\1\150\1\uffff\1\104\1\uffff\1\144\3\60\1\124\1\60\1\164\1\103\1"+
        "\124\1\143\1\164\1\uffff\1\103\1\143\4\uffff\1\122\1\162\3\60\2"+
        "\uffff\2\60\1\105\1\60\1\145\1\60\1\122\1\162\2\60\3\uffff\1\123"+
        "\1\uffff\1\163\1\105\1\145\1\uffff\2\60\1\115\1\155\1\uffff\1\105"+
        "\1\145\1\116\1\156\1\124\1\164\2\60\1\uffff";
    static final String DFA50_maxS =
        "\1\172\6\uffff\1\uffff\1\122\1\162\1\122\1\162\1\101\1\141\1\116"+
        "\1\156\1\125\1\165\1\130\1\170\1\uffff\1\105\1\145\1\101\1\123\1"+
        "\163\1\122\1\162\1\125\1\165\1\105\1\145\1\116\1\156\1\125\1\165"+
        "\1\105\1\145\1\111\1\151\1\uffff\1\71\5\uffff\1\117\1\123\1\157"+
        "\1\163\1\105\1\123\1\101\1\145\1\163\1\141\1\102\1\142\1\172\1\104"+
        "\1\172\1\144\1\172\1\114\1\172\1\154\1\111\1\125\1\151\1\165\1\131"+
        "\1\171\2\123\1\104\1\105\1\163\1\144\1\145\1\111\1\151\1\122\1\114"+
        "\1\162\1\154\1\123\1\163\2\172\2\124\1\103\2\164\1\143\1\124\1\110"+
        "\1\164\1\150\1\116\1\156\1\120\1\101\1\105\1\103\1\160\1\141\1\145"+
        "\1\143\1\101\1\103\1\122\1\141\1\143\1\162\1\114\1\154\1\uffff\1"+
        "\105\1\145\1\172\1\uffff\1\114\1\172\1\154\1\123\1\115\1\163\1\155"+
        "\2\172\1\110\1\121\1\111\1\101\1\172\1\161\1\151\1\141\1\172\1\115"+
        "\1\155\1\105\1\114\1\145\1\154\1\105\1\124\1\145\1\164\1\uffff\1"+
        "\111\1\117\1\172\1\151\1\157\2\172\1\105\1\172\1\145\1\101\1\141"+
        "\1\172\1\125\1\124\2\172\1\165\1\164\1\172\1\124\2\101\1\164\2\141"+
        "\1\105\1\145\1\130\1\170\1\uffff\2\172\1\124\1\172\1\164\1\172\1"+
        "\uffff\1\150\1\125\1\107\1\124\1\uffff\1\165\1\147\1\164\1\101\1"+
        "\141\1\111\1\124\1\151\1\164\2\122\2\162\1\117\1\137\1\uffff\1\157"+
        "\1\137\1\uffff\1\115\1\155\1\122\1\162\1\uffff\1\114\1\105\1\uffff"+
        "\1\154\1\145\1\105\1\104\1\103\1\145\1\144\1\143\4\172\1\123\1\uffff"+
        "\1\163\1\141\1\105\1\116\1\105\1\145\1\156\1\145\1\122\1\162\1\107"+
        "\1\105\1\147\1\145\1\105\1\111\1\145\1\151\1\116\1\111\1\156\1\151"+
        "\1\101\1\141\1\131\1\171\1\124\1\172\1\164\2\172\1\105\1\124\1\172"+
        "\1\145\1\164\2\uffff\2\172\1\163\1\172\1\105\2\172\1\145\1\172\1"+
        "\131\1\171\1\116\1\130\1\156\1\170\1\116\1\103\1\156\1\143\1\172"+
        "\1\116\1\172\1\156\5\172\1\uffff\1\172\1\uffff\1\172\1\105\1\172"+
        "\1\145\1\uffff\1\150\1\uffff\1\104\1\uffff\1\144\3\172\1\124\1\172"+
        "\1\164\1\103\1\124\1\143\1\164\1\uffff\1\103\1\143\4\uffff\1\122"+
        "\1\162\3\172\2\uffff\2\172\1\105\1\172\1\145\1\172\1\122\1\162\2"+
        "\172\3\uffff\1\123\1\uffff\1\163\1\105\1\145\1\uffff\2\172\1\115"+
        "\1\155\1\uffff\1\105\1\145\1\116\1\156\1\124\1\164\2\172\1\uffff";
    static final String DFA50_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\15\uffff\1\17\23\uffff\1\51\1\uffff"+
        "\1\52\1\53\1\54\1\55\1\7\107\uffff\1\13\3\uffff\1\36\34\uffff\1"+
        "\31\36\uffff\1\14\6\uffff\1\21\4\uffff\1\47\17\uffff\1\44\2\uffff"+
        "\1\37\4\uffff\1\10\2\uffff\1\45\15\uffff\1\16\44\uffff\1\12\1\26"+
        "\34\uffff\1\32\1\uffff\1\11\4\uffff\1\15\1\uffff\1\23\1\uffff\1"+
        "\40\13\uffff\1\35\2\uffff\1\50\1\42\1\20\1\33\5\uffff\1\24\1\25"+
        "\12\uffff\1\22\1\41\1\27\1\uffff\1\34\3\uffff\1\46\4\uffff\1\30"+
        "\10\uffff\1\43";
    static final String DFA50_specialS =
        "\7\uffff\1\0\u016c\uffff}>";
    static final String[] DFA50_transitionS = {
            "\2\54\2\uffff\1\54\22\uffff\1\54\1\uffff\1\55\1\53\3\uffff\1"+
            "\7\1\1\1\2\2\uffff\1\3\1\51\1\4\1\53\12\52\1\uffff\1\5\1\uffff"+
            "\1\6\3\uffff\1\42\1\46\1\12\1\10\1\22\1\34\1\50\1\27\1\16\1"+
            "\50\1\25\2\50\1\20\1\40\1\32\1\50\1\36\1\44\1\14\1\30\5\50\4"+
            "\uffff\1\50\1\55\1\43\1\47\1\13\1\11\1\23\1\35\2\50\1\17\1\50"+
            "\1\26\2\50\1\21\1\41\1\33\1\50\1\37\1\45\1\15\1\31\5\50",
            "",
            "",
            "",
            "",
            "",
            "",
            "\47\55\1\56\uffd8\55",
            "\1\60\14\uffff\1\57",
            "\1\62\14\uffff\1\61",
            "\1\64\6\uffff\1\65\11\uffff\1\63",
            "\1\67\6\uffff\1\70\11\uffff\1\66",
            "\1\71",
            "\1\72",
            "\1\73\7\uffff\1\74",
            "\1\75\7\uffff\1\76",
            "\1\77\5\uffff\1\100",
            "\1\101\5\uffff\1\102",
            "\1\104\11\uffff\1\103",
            "\1\106\11\uffff\1\105",
            "",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112\1\uffff\1\113\2\uffff\1\114",
            "\1\115\1\uffff\1\116\2\uffff\1\117",
            "\1\120",
            "\1\121",
            "\1\122\5\uffff\1\123",
            "\1\124\5\uffff\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132\17\uffff\1\134\1\uffff\1\133",
            "\1\135\17\uffff\1\137\1\uffff\1\136",
            "\1\141\1\uffff\1\140",
            "\1\143\1\uffff\1\142",
            "\1\144",
            "\1\145",
            "",
            "\1\53\2\uffff\12\52",
            "",
            "",
            "",
            "",
            "",
            "\1\146",
            "\1\147\5\uffff\1\150\6\uffff\1\151",
            "\1\152",
            "\1\153\5\uffff\1\154\6\uffff\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\167",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\170",
            "\12\50\7\uffff\23\50\1\171\6\50\4\uffff\1\50\1\uffff\32\50",
            "\1\173",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\23\50\1\174\6\50",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085\11\uffff\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089\11\uffff\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093\14\uffff\1\u0094",
            "\1\u0095\14\uffff\1\u0096",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
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
            "",
            "\1\u00b4",
            "\1\u00b5",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00b7",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
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
            "",
            "\1\u00d0",
            "\1\u00d1",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00d3",
            "\1\u00d4",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00d6",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00db",
            "\1\u00dc",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00de",
            "\1\u00df",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00ea",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00ec",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
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
            "",
            "\1\u0100",
            "\1\u0101",
            "",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "",
            "\1\u0106",
            "\1\u0107",
            "",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0112",
            "",
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
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u012f",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0131",
            "\1\u0132",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0133",
            "\1\u0134",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0136",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0138",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u013a",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
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
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0146",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0147",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u014c",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u014d",
            "",
            "\1\u014e",
            "",
            "\1\u014f",
            "",
            "\1\u0150",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0153",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "",
            "\1\u0159",
            "\1\u015a",
            "",
            "",
            "",
            "",
            "\1\u015b",
            "\1\u015c",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0160",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0162",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0163",
            "\1\u0164",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "",
            "\1\u0166",
            "",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u016b",
            "\1\u016c",
            "",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            ""
    };

    static final short[] DFA50_eot = DFA.unpackEncodedString(DFA50_eotS);
    static final short[] DFA50_eof = DFA.unpackEncodedString(DFA50_eofS);
    static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars(DFA50_minS);
    static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars(DFA50_maxS);
    static final short[] DFA50_accept = DFA.unpackEncodedString(DFA50_acceptS);
    static final short[] DFA50_special = DFA.unpackEncodedString(DFA50_specialS);
    static final short[][] DFA50_transition;

    static {
        int numStates = DFA50_transitionS.length;
        DFA50_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
        }
    }

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = DFA50_eot;
            this.eof = DFA50_eof;
            this.min = DFA50_min;
            this.max = DFA50_max;
            this.accept = DFA50_accept;
            this.special = DFA50_special;
            this.transition = DFA50_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | DROP | CREATE | TABLE | IF | NOT | EXISTS | ENUM | NULL | DEFAULT | KEY | HASH | UNIQUE | PRIMARY | FOREIGN | INDEX | FULLTEXT | REFERENCES | ON | DELETE | CASCADE | RESTRICT | ACTION | NO | SET | UPDATE | UNSIGNED | BINARY | AUTO_INC | ASC | DESC | CHARACTER | USE | SCHEMA | ID | INT | COMMENT | WS | DEF );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA50_7 = input.LA(1);

                        s = -1;
                        if ( (LA50_7=='\'') ) {s = 46;}

                        else if ( ((LA50_7 >= '\u0000' && LA50_7 <= '&')||(LA50_7 >= '(' && LA50_7 <= '\uFFFF')) ) {s = 45;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 50, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}