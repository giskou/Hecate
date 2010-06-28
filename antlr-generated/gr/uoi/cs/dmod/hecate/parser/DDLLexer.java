// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g 2010-06-28 12:36:33

  package gr.uoi.cs.dmod.hecate.parser ;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class DDLLexer extends Lexer {
    public static final int DEF=38;
    public static final int OCTAL_ESC=45;
    public static final int TABLE=6;
    public static final int UPDATE=29;
    public static final int NOT=11;
    public static final int CASCADE=24;
    public static final int ID=37;
    public static final int FOREIGN=18;
    public static final int EOF=-1;
    public static final int CHARACTER=32;
    public static final int ACTION=27;
    public static final int IF=7;
    public static final int INDEX=14;
    public static final int CREATE=9;
    public static final int T__51=51;
    public static final int ESC_SEQ=42;
    public static final int T__52=52;
    public static final int REFERENCES=22;
    public static final int FULLTEXT=16;
    public static final int EXISTS=8;
    public static final int COMMENT=40;
    public static final int T__50=50;
    public static final int UNIQUE=12;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int ASC=30;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int KEY=17;
    public static final int UNICODE_ESC=44;
    public static final int NULL=19;
    public static final int DEFAULT=21;
    public static final int NO=26;
    public static final int HASH=39;
    public static final int ON=15;
    public static final int HEX_DIGIT=43;
    public static final int AUTO_INC=20;
    public static final int SET=28;
    public static final int PRIMARY=13;
    public static final int INT=33;
    public static final int DELETE=23;
    public static final int RESTRICT=25;
    public static final int SCHEMA=10;
    public static final int WS=41;
    public static final int ENUM=36;
    public static final int UNSIGNED=34;
    public static final int DROP=5;
    public static final int USE=4;
    public static final int BINARY=35;
    public static final int DESC=31;

    // delegates
    // delegators

    public DDLLexer() {;} 
    public DDLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public DDLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g"; }

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:11:7: ( ';' )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:11:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:12:7: ( '(' )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:12:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:13:7: ( ')' )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:13:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:14:7: ( ',' )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:14:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:15:7: ( '\\'\\'' )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:15:9: '\\'\\''
            {
            match("''"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:16:7: ( '=' )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:16:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:17:7: ( '.' )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:17:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "DROP"
    public final void mDROP() throws RecognitionException {
        try {
            int _type = DROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:131:6: ( 'DROP' | 'drop' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:131:8: 'DROP'
                    {
                    match("DROP"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:131:17: 'drop'
                    {
                    match("drop"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DROP"

    // $ANTLR start "CREATE"
    public final void mCREATE() throws RecognitionException {
        try {
            int _type = CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:132:8: ( 'CREATE' | 'create' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:132:10: 'CREATE'
                    {
                    match("CREATE"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:132:21: 'create'
                    {
                    match("create"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CREATE"

    // $ANTLR start "TABLE"
    public final void mTABLE() throws RecognitionException {
        try {
            int _type = TABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:133:7: ( 'TABLE' | 'table' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:133:9: 'TABLE'
                    {
                    match("TABLE"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:133:19: 'table'
                    {
                    match("table"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TABLE"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:134:4: ( 'IF' | 'if' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:134:6: 'IF'
                    {
                    match("IF"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:134:13: 'if'
                    {
                    match("if"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:135:5: ( 'NOT' | 'not' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:135:7: 'NOT'
                    {
                    match("NOT"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:135:15: 'not'
                    {
                    match("not"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "EXISTS"
    public final void mEXISTS() throws RecognitionException {
        try {
            int _type = EXISTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:136:8: ( 'EXISTS' | 'exists' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:136:10: 'EXISTS'
                    {
                    match("EXISTS"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:136:21: 'exists'
                    {
                    match("exists"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXISTS"

    // $ANTLR start "ENUM"
    public final void mENUM() throws RecognitionException {
        try {
            int _type = ENUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:137:6: ( 'ENUM' | 'enum' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:137:8: 'ENUM'
                    {
                    match("ENUM"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:137:17: 'enum'
                    {
                    match("enum"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENUM"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:138:6: ( ( 'NULL' | 'null' )? )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:138:8: ( 'NULL' | 'null' )?
            {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:138:8: ( 'NULL' | 'null' )?
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:138:9: 'NULL'
                    {
                    match("NULL"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:138:18: 'null'
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
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "DEFAULT"
    public final void mDEFAULT() throws RecognitionException {
        try {
            int _type = DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:139:9: ( 'DEFAULT' | 'default' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:139:11: 'DEFAULT'
                    {
                    match("DEFAULT"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:139:23: 'default'
                    {
                    match("default"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFAULT"

    // $ANTLR start "KEY"
    public final void mKEY() throws RecognitionException {
        try {
            int _type = KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:140:5: ( 'KEY' | 'key' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:140:7: 'KEY'
                    {
                    match("KEY"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:140:15: 'key'
                    {
                    match("key"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEY"

    // $ANTLR start "HASH"
    public final void mHASH() throws RecognitionException {
        try {
            int _type = HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:141:6: ( 'HASH' 'hash' )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:141:8: 'HASH' 'hash'
            {
            match("HASH"); 

            match("hash"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HASH"

    // $ANTLR start "UNIQUE"
    public final void mUNIQUE() throws RecognitionException {
        try {
            int _type = UNIQUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:142:8: ( 'UNIQUE' | 'unique' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:142:10: 'UNIQUE'
                    {
                    match("UNIQUE"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:142:21: 'unique'
                    {
                    match("unique"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNIQUE"

    // $ANTLR start "PRIMARY"
    public final void mPRIMARY() throws RecognitionException {
        try {
            int _type = PRIMARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:143:9: ( 'PRIMARY' | 'primary' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:143:11: 'PRIMARY'
                    {
                    match("PRIMARY"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:143:23: 'primary'
                    {
                    match("primary"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRIMARY"

    // $ANTLR start "FOREIGN"
    public final void mFOREIGN() throws RecognitionException {
        try {
            int _type = FOREIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:144:9: ( 'FOREIGN' | 'foreign' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:144:11: 'FOREIGN'
                    {
                    match("FOREIGN"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:144:23: 'foreign'
                    {
                    match("foreign"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOREIGN"

    // $ANTLR start "INDEX"
    public final void mINDEX() throws RecognitionException {
        try {
            int _type = INDEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:145:7: ( 'INDEX' | 'index' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:145:9: 'INDEX'
                    {
                    match("INDEX"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:145:19: 'index'
                    {
                    match("index"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INDEX"

    // $ANTLR start "FULLTEXT"
    public final void mFULLTEXT() throws RecognitionException {
        try {
            int _type = FULLTEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:146:10: ( 'FULLTEXT' | 'fulltext' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:146:12: 'FULLTEXT'
                    {
                    match("FULLTEXT"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:146:25: 'fulltext'
                    {
                    match("fulltext"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FULLTEXT"

    // $ANTLR start "REFERENCES"
    public final void mREFERENCES() throws RecognitionException {
        try {
            int _type = REFERENCES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:147:12: ( 'REFERENCES' | 'references' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:147:14: 'REFERENCES'
                    {
                    match("REFERENCES"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:147:29: 'references'
                    {
                    match("references"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REFERENCES"

    // $ANTLR start "ON"
    public final void mON() throws RecognitionException {
        try {
            int _type = ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:148:4: ( 'ON' | 'on' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:148:6: 'ON'
                    {
                    match("ON"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:148:13: 'on'
                    {
                    match("on"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ON"

    // $ANTLR start "DELETE"
    public final void mDELETE() throws RecognitionException {
        try {
            int _type = DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:149:8: ( 'DELETE' | 'delete' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:149:10: 'DELETE'
                    {
                    match("DELETE"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:149:21: 'delete'
                    {
                    match("delete"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DELETE"

    // $ANTLR start "CASCADE"
    public final void mCASCADE() throws RecognitionException {
        try {
            int _type = CASCADE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:150:9: ( 'CASCADE' | 'cascade' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:150:11: 'CASCADE'
                    {
                    match("CASCADE"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:150:23: 'cascade'
                    {
                    match("cascade"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CASCADE"

    // $ANTLR start "RESTRICT"
    public final void mRESTRICT() throws RecognitionException {
        try {
            int _type = RESTRICT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:151:10: ( 'RESTRICT' | 'restrict' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:151:12: 'RESTRICT'
                    {
                    match("RESTRICT"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:151:25: 'restrict'
                    {
                    match("restrict"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RESTRICT"

    // $ANTLR start "ACTION"
    public final void mACTION() throws RecognitionException {
        try {
            int _type = ACTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:152:8: ( 'ACTION' | 'action' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:152:10: 'ACTION'
                    {
                    match("ACTION"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:152:21: 'action'
                    {
                    match("action"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ACTION"

    // $ANTLR start "NO"
    public final void mNO() throws RecognitionException {
        try {
            int _type = NO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:153:4: ( 'NO' | 'no' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:153:6: 'NO'
                    {
                    match("NO"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:153:13: 'no'
                    {
                    match("no"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NO"

    // $ANTLR start "SET"
    public final void mSET() throws RecognitionException {
        try {
            int _type = SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:154:5: ( 'SET' | 'set' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:154:7: 'SET'
                    {
                    match("SET"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:154:15: 'set'
                    {
                    match("set"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SET"

    // $ANTLR start "UPDATE"
    public final void mUPDATE() throws RecognitionException {
        try {
            int _type = UPDATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:155:8: ( 'UPDATE' | 'update' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:155:10: 'UPDATE'
                    {
                    match("UPDATE"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:155:21: 'update'
                    {
                    match("update"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UPDATE"

    // $ANTLR start "UNSIGNED"
    public final void mUNSIGNED() throws RecognitionException {
        try {
            int _type = UNSIGNED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:156:10: ( 'UNSIGNED' | 'unsigned' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:156:12: 'UNSIGNED'
                    {
                    match("UNSIGNED"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:156:25: 'unsigned'
                    {
                    match("unsigned"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNSIGNED"

    // $ANTLR start "BINARY"
    public final void mBINARY() throws RecognitionException {
        try {
            int _type = BINARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:157:8: ( 'BINARY' | 'binary' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:157:10: 'BINARY'
                    {
                    match("BINARY"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:157:21: 'binary'
                    {
                    match("binary"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BINARY"

    // $ANTLR start "AUTO_INC"
    public final void mAUTO_INC() throws RecognitionException {
        try {
            int _type = AUTO_INC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:158:10: ( 'AUTO_INCREMENT' | 'auto_increment' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:158:12: 'AUTO_INCREMENT'
                    {
                    match("AUTO_INCREMENT"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:158:31: 'auto_increment'
                    {
                    match("auto_increment"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AUTO_INC"

    // $ANTLR start "ASC"
    public final void mASC() throws RecognitionException {
        try {
            int _type = ASC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:159:5: ( 'ASC' | 'asc' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:159:7: 'ASC'
                    {
                    match("ASC"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:159:15: 'asc'
                    {
                    match("asc"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASC"

    // $ANTLR start "DESC"
    public final void mDESC() throws RecognitionException {
        try {
            int _type = DESC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:160:6: ( 'DESC' | 'desc' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:160:8: 'DESC'
                    {
                    match("DESC"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:160:17: 'desc'
                    {
                    match("desc"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DESC"

    // $ANTLR start "CHARACTER"
    public final void mCHARACTER() throws RecognitionException {
        try {
            int _type = CHARACTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:161:11: ( 'CHARACTER' | 'character' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:161:13: 'CHARACTER'
                    {
                    match("CHARACTER"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:161:27: 'character'
                    {
                    match("character"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHARACTER"

    // $ANTLR start "USE"
    public final void mUSE() throws RecognitionException {
        try {
            int _type = USE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:162:5: ( 'USE' | 'use' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:162:7: 'USE'
                    {
                    match("USE"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:162:15: 'use'
                    {
                    match("use"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "USE"

    // $ANTLR start "SCHEMA"
    public final void mSCHEMA() throws RecognitionException {
        try {
            int _type = SCHEMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:163:8: ( 'SCHEMA' | 'schema' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:163:10: 'SCHEMA'
                    {
                    match("SCHEMA"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:163:21: 'schema'
                    {
                    match("schema"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SCHEMA"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:165:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:165:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:165:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>='0' && LA33_0<='9')||(LA33_0>='A' && LA33_0<='Z')||LA33_0=='_'||(LA33_0>='a' && LA33_0<='z')) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:167:5: ( ( '0' .. '9' )+ )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:167:7: ( '0' .. '9' )+
            {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:167:7: ( '0' .. '9' )+
            int cnt34=0;
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>='0' && LA34_0<='9')) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:167:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:170:2: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' | '--' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            int alt40=3;
            int LA40_0 = input.LA(1);

            if ( (LA40_0=='/') ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1=='/') ) {
                    alt40=1;
                }
                else if ( (LA40_1=='*') ) {
                    alt40=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA40_0=='-') ) {
                alt40=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:170:4: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:170:9: (~ ( '\\n' | '\\r' ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( ((LA35_0>='\u0000' && LA35_0<='\t')||(LA35_0>='\u000B' && LA35_0<='\f')||(LA35_0>='\u000E' && LA35_0<='\uFFFF')) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:170:9: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:170:23: ( '\\r' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0=='\r') ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:170:23: '\\r'
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:171:4: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:171:9: ( options {greedy=false; } : . )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0=='*') ) {
                            int LA37_1 = input.LA(2);

                            if ( (LA37_1=='/') ) {
                                alt37=2;
                            }
                            else if ( ((LA37_1>='\u0000' && LA37_1<='.')||(LA37_1>='0' && LA37_1<='\uFFFF')) ) {
                                alt37=1;
                            }


                        }
                        else if ( ((LA37_0>='\u0000' && LA37_0<=')')||(LA37_0>='+' && LA37_0<='\uFFFF')) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:171:37: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    match("*/"); 

                    _channel=HIDDEN;

                    }
                    break;
                case 3 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:172:4: '--' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("--"); 

                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:172:9: (~ ( '\\n' | '\\r' ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( ((LA38_0>='\u0000' && LA38_0<='\t')||(LA38_0>='\u000B' && LA38_0<='\f')||(LA38_0>='\u000E' && LA38_0<='\uFFFF')) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:172:9: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:172:23: ( '\\r' )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0=='\r') ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:172:23: '\\r'
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
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:175:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:175:7: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "DEF"
    public final void mDEF() throws RecognitionException {
        try {
            int _type = DEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:177:5: ( ( '\\'' ( ESC_SEQ | ~ ( '\\\\' | '\\'' ) )+ '\\'' ) | ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )+ '\"' ) | ( '`' ( ESC_SEQ | ~ ( '\\\\' | '`' ) )+ '`' ) )
            int alt44=3;
            switch ( input.LA(1) ) {
            case '\'':
                {
                alt44=1;
                }
                break;
            case '\"':
                {
                alt44=2;
                }
                break;
            case '`':
                {
                alt44=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:177:7: ( '\\'' ( ESC_SEQ | ~ ( '\\\\' | '\\'' ) )+ '\\'' )
                    {
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:177:7: ( '\\'' ( ESC_SEQ | ~ ( '\\\\' | '\\'' ) )+ '\\'' )
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:177:9: '\\'' ( ESC_SEQ | ~ ( '\\\\' | '\\'' ) )+ '\\''
                    {
                    match('\''); 
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:177:14: ( ESC_SEQ | ~ ( '\\\\' | '\\'' ) )+
                    int cnt41=0;
                    loop41:
                    do {
                        int alt41=3;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0=='\\') ) {
                            alt41=1;
                        }
                        else if ( ((LA41_0>='\u0000' && LA41_0<='&')||(LA41_0>='(' && LA41_0<='[')||(LA41_0>=']' && LA41_0<='\uFFFF')) ) {
                            alt41=2;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:177:16: ESC_SEQ
                    	    {
                    	    mESC_SEQ(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:177:26: ~ ( '\\\\' | '\\'' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt41 >= 1 ) break loop41;
                                EarlyExitException eee =
                                    new EarlyExitException(41, input);
                                throw eee;
                        }
                        cnt41++;
                    } while (true);

                    match('\''); 

                    }


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:178:4: ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )+ '\"' )
                    {
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:178:4: ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )+ '\"' )
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:178:6: '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )+ '\"'
                    {
                    match('\"'); 
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:178:10: ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )+
                    int cnt42=0;
                    loop42:
                    do {
                        int alt42=3;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0=='\\') ) {
                            alt42=1;
                        }
                        else if ( ((LA42_0>='\u0000' && LA42_0<='!')||(LA42_0>='#' && LA42_0<='[')||(LA42_0>=']' && LA42_0<='\uFFFF')) ) {
                            alt42=2;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:178:12: ESC_SEQ
                    	    {
                    	    mESC_SEQ(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:178:22: ~ ( '\\\\' | '\"' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt42 >= 1 ) break loop42;
                                EarlyExitException eee =
                                    new EarlyExitException(42, input);
                                throw eee;
                        }
                        cnt42++;
                    } while (true);

                    match('\"'); 

                    }


                    }
                    break;
                case 3 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:179:4: ( '`' ( ESC_SEQ | ~ ( '\\\\' | '`' ) )+ '`' )
                    {
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:179:4: ( '`' ( ESC_SEQ | ~ ( '\\\\' | '`' ) )+ '`' )
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:179:6: '`' ( ESC_SEQ | ~ ( '\\\\' | '`' ) )+ '`'
                    {
                    match('`'); 
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:179:10: ( ESC_SEQ | ~ ( '\\\\' | '`' ) )+
                    int cnt43=0;
                    loop43:
                    do {
                        int alt43=3;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0=='\\') ) {
                            alt43=1;
                        }
                        else if ( ((LA43_0>='\u0000' && LA43_0<='[')||(LA43_0>=']' && LA43_0<='_')||(LA43_0>='a' && LA43_0<='\uFFFF')) ) {
                            alt43=2;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:179:12: ESC_SEQ
                    	    {
                    	    mESC_SEQ(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:179:22: ~ ( '\\\\' | '`' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='_')||(input.LA(1)>='a' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


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

                    match('`'); 

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEF"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:184:2: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:184:4: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:189:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt45=3;
            int LA45_0 = input.LA(1);

            if ( (LA45_0=='\\') ) {
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
                    alt45=1;
                    }
                    break;
                case 'u':
                    {
                    alt45=2;
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
                    alt45=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:189:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:190:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:191:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:196:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt46=3;
            int LA46_0 = input.LA(1);

            if ( (LA46_0=='\\') ) {
                int LA46_1 = input.LA(2);

                if ( ((LA46_1>='0' && LA46_1<='3')) ) {
                    int LA46_2 = input.LA(3);

                    if ( ((LA46_2>='0' && LA46_2<='7')) ) {
                        int LA46_4 = input.LA(4);

                        if ( ((LA46_4>='0' && LA46_4<='7')) ) {
                            alt46=1;
                        }
                        else {
                            alt46=2;}
                    }
                    else {
                        alt46=3;}
                }
                else if ( ((LA46_1>='4' && LA46_1<='7')) ) {
                    int LA46_3 = input.LA(3);

                    if ( ((LA46_3>='0' && LA46_3<='7')) ) {
                        alt46=2;
                    }
                    else {
                        alt46=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:196:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:196:14: ( '0' .. '3' )
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:196:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:196:25: ( '0' .. '7' )
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:196:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:196:36: ( '0' .. '7' )
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:196:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:197:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:197:14: ( '0' .. '7' )
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:197:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:197:25: ( '0' .. '7' )
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:197:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:198:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:198:14: ( '0' .. '7' )
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:198:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:203:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:203:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
        }
    }
    // $ANTLR end "UNICODE_ESC"

    public void mTokens() throws RecognitionException {
        // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:8: ( T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | DROP | CREATE | TABLE | IF | NOT | EXISTS | ENUM | NULL | DEFAULT | KEY | HASH | UNIQUE | PRIMARY | FOREIGN | INDEX | FULLTEXT | REFERENCES | ON | DELETE | CASCADE | RESTRICT | ACTION | NO | SET | UPDATE | UNSIGNED | BINARY | AUTO_INC | ASC | DESC | CHARACTER | USE | SCHEMA | ID | INT | COMMENT | WS | DEF )
        int alt47=45;
        alt47 = dfa47.predict(input);
        switch (alt47) {
            case 1 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:10: T__46
                {
                mT__46(); 

                }
                break;
            case 2 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:16: T__47
                {
                mT__47(); 

                }
                break;
            case 3 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:22: T__48
                {
                mT__48(); 

                }
                break;
            case 4 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:28: T__49
                {
                mT__49(); 

                }
                break;
            case 5 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:34: T__50
                {
                mT__50(); 

                }
                break;
            case 6 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:40: T__51
                {
                mT__51(); 

                }
                break;
            case 7 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:46: T__52
                {
                mT__52(); 

                }
                break;
            case 8 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:52: DROP
                {
                mDROP(); 

                }
                break;
            case 9 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:57: CREATE
                {
                mCREATE(); 

                }
                break;
            case 10 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:64: TABLE
                {
                mTABLE(); 

                }
                break;
            case 11 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:70: IF
                {
                mIF(); 

                }
                break;
            case 12 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:73: NOT
                {
                mNOT(); 

                }
                break;
            case 13 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:77: EXISTS
                {
                mEXISTS(); 

                }
                break;
            case 14 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:84: ENUM
                {
                mENUM(); 

                }
                break;
            case 15 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:89: NULL
                {
                mNULL(); 

                }
                break;
            case 16 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:94: DEFAULT
                {
                mDEFAULT(); 

                }
                break;
            case 17 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:102: KEY
                {
                mKEY(); 

                }
                break;
            case 18 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:106: HASH
                {
                mHASH(); 

                }
                break;
            case 19 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:111: UNIQUE
                {
                mUNIQUE(); 

                }
                break;
            case 20 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:118: PRIMARY
                {
                mPRIMARY(); 

                }
                break;
            case 21 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:126: FOREIGN
                {
                mFOREIGN(); 

                }
                break;
            case 22 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:134: INDEX
                {
                mINDEX(); 

                }
                break;
            case 23 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:140: FULLTEXT
                {
                mFULLTEXT(); 

                }
                break;
            case 24 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:149: REFERENCES
                {
                mREFERENCES(); 

                }
                break;
            case 25 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:160: ON
                {
                mON(); 

                }
                break;
            case 26 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:163: DELETE
                {
                mDELETE(); 

                }
                break;
            case 27 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:170: CASCADE
                {
                mCASCADE(); 

                }
                break;
            case 28 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:178: RESTRICT
                {
                mRESTRICT(); 

                }
                break;
            case 29 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:187: ACTION
                {
                mACTION(); 

                }
                break;
            case 30 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:194: NO
                {
                mNO(); 

                }
                break;
            case 31 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:197: SET
                {
                mSET(); 

                }
                break;
            case 32 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:201: UPDATE
                {
                mUPDATE(); 

                }
                break;
            case 33 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:208: UNSIGNED
                {
                mUNSIGNED(); 

                }
                break;
            case 34 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:217: BINARY
                {
                mBINARY(); 

                }
                break;
            case 35 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:224: AUTO_INC
                {
                mAUTO_INC(); 

                }
                break;
            case 36 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:233: ASC
                {
                mASC(); 

                }
                break;
            case 37 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:237: DESC
                {
                mDESC(); 

                }
                break;
            case 38 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:242: CHARACTER
                {
                mCHARACTER(); 

                }
                break;
            case 39 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:252: USE
                {
                mUSE(); 

                }
                break;
            case 40 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:256: SCHEMA
                {
                mSCHEMA(); 

                }
                break;
            case 41 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:263: ID
                {
                mID(); 

                }
                break;
            case 42 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:266: INT
                {
                mINT(); 

                }
                break;
            case 43 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:270: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 44 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:278: WS
                {
                mWS(); 

                }
                break;
            case 45 :
                // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:1:281: DEF
                {
                mDEF(); 

                }
                break;

        }

    }


    protected DFA47 dfa47 = new DFA47(this);
    static final String DFA47_eotS =
        "\1\24\56\uffff";
    static final String DFA47_eofS =
        "\57\uffff";
    static final String DFA47_minS =
        "\1\11\56\uffff";
    static final String DFA47_maxS =
        "\1\172\56\uffff";
    static final String DFA47_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\2\10\2\11\2\12\2\13\2\14\2"+
        "\15\1\17\2\21\1\22\2\23\2\24\2\25\2\30\2\31\2\35\2\37\2\42\1\51"+
        "\1\52\1\53\1\uffff\1\54\1\55\1\uffff";
    static final String DFA47_specialS =
        "\57\uffff}>";
    static final String[] DFA47_transitionS = {
            "\2\54\2\uffff\1\54\22\uffff\1\54\1\uffff\1\55\4\uffff\1\5\1"+
            "\2\1\3\2\uffff\1\4\1\52\1\7\1\52\12\51\1\uffff\1\1\1\uffff\1"+
            "\6\3\uffff\1\42\1\46\1\12\1\10\1\22\1\34\1\50\1\27\1\16\1\50"+
            "\1\25\2\50\1\20\1\40\1\32\1\50\1\36\1\44\1\14\1\30\5\50\4\uffff"+
            "\1\50\1\55\1\43\1\47\1\13\1\11\1\23\1\35\2\50\1\17\1\50\1\26"+
            "\2\50\1\21\1\41\1\33\1\50\1\37\1\45\1\15\1\31\5\50",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
    static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
    static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
    static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
    static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
    static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
    static final short[][] DFA47_transition;

    static {
        int numStates = DFA47_transitionS.length;
        DFA47_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = DFA47_eot;
            this.eof = DFA47_eof;
            this.min = DFA47_min;
            this.max = DFA47_max;
            this.accept = DFA47_accept;
            this.special = DFA47_special;
            this.transition = DFA47_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | DROP | CREATE | TABLE | IF | NOT | EXISTS | ENUM | NULL | DEFAULT | KEY | HASH | UNIQUE | PRIMARY | FOREIGN | INDEX | FULLTEXT | REFERENCES | ON | DELETE | CASCADE | RESTRICT | ACTION | NO | SET | UPDATE | UNSIGNED | BINARY | AUTO_INC | ASC | DESC | CHARACTER | USE | SCHEMA | ID | INT | COMMENT | WS | DEF );";
        }
    }
 

}