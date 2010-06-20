// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g 2010-06-20 17:14:36

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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:133:6: ( 'DROP' | 'drop' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:133:8: 'DROP'
                    {
                    match("DROP"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:133:17: 'drop'
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:134:8: ( 'CREATE' | 'create' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:134:10: 'CREATE'
                    {
                    match("CREATE"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:134:21: 'create'
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:135:7: ( 'TABLE' | 'table' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:135:9: 'TABLE'
                    {
                    match("TABLE"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:135:19: 'table'
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:136:4: ( 'IF' | 'if' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:136:6: 'IF'
                    {
                    match("IF"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:136:13: 'if'
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:137:5: ( 'NOT' | 'not' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:137:7: 'NOT'
                    {
                    match("NOT"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:137:15: 'not'
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:138:8: ( 'EXISTS' | 'exists' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:138:10: 'EXISTS'
                    {
                    match("EXISTS"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:138:21: 'exists'
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:139:6: ( 'ENUM' | 'enum' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:139:8: 'ENUM'
                    {
                    match("ENUM"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:139:17: 'enum'
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:140:6: ( ( 'NULL' | 'null' )? )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:140:8: ( 'NULL' | 'null' )?
            {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:140:8: ( 'NULL' | 'null' )?
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:140:9: 'NULL'
                    {
                    match("NULL"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:140:18: 'null'
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:141:9: ( 'DEFAULT' | 'default' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:141:11: 'DEFAULT'
                    {
                    match("DEFAULT"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:141:23: 'default'
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:142:5: ( 'KEY' | 'key' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:142:7: 'KEY'
                    {
                    match("KEY"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:142:15: 'key'
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:143:6: ( 'HASH' 'hash' )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:143:8: 'HASH' 'hash'
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:144:8: ( 'UNIQUE' | 'unique' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:144:10: 'UNIQUE'
                    {
                    match("UNIQUE"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:144:21: 'unique'
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:145:9: ( 'PRIMARY' | 'primary' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:145:11: 'PRIMARY'
                    {
                    match("PRIMARY"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:145:23: 'primary'
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:146:9: ( 'FOREIGN' | 'foreign' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:146:11: 'FOREIGN'
                    {
                    match("FOREIGN"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:146:23: 'foreign'
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:147:7: ( 'INDEX' | 'index' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:147:9: 'INDEX'
                    {
                    match("INDEX"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:147:19: 'index'
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:148:10: ( 'FULLTEXT' | 'fulltext' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:148:12: 'FULLTEXT'
                    {
                    match("FULLTEXT"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:148:25: 'fulltext'
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:149:12: ( 'REFERENCES' | 'references' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:149:14: 'REFERENCES'
                    {
                    match("REFERENCES"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:149:29: 'references'
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:150:4: ( 'ON' | 'on' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:150:6: 'ON'
                    {
                    match("ON"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:150:13: 'on'
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:151:8: ( 'DELETE' | 'delete' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:151:10: 'DELETE'
                    {
                    match("DELETE"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:151:21: 'delete'
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:152:9: ( 'CASCADE' | 'cascade' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:152:11: 'CASCADE'
                    {
                    match("CASCADE"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:152:23: 'cascade'
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:153:10: ( 'RESTRICT' | 'restrict' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:153:12: 'RESTRICT'
                    {
                    match("RESTRICT"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:153:25: 'restrict'
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:154:8: ( 'ACTION' | 'action' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:154:10: 'ACTION'
                    {
                    match("ACTION"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:154:21: 'action'
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:155:4: ( 'NO' | 'no' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:155:6: 'NO'
                    {
                    match("NO"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:155:13: 'no'
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:156:5: ( 'SET' | 'set' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:156:7: 'SET'
                    {
                    match("SET"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:156:15: 'set'
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:157:8: ( 'UPDATE' | 'update' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:157:10: 'UPDATE'
                    {
                    match("UPDATE"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:157:21: 'update'
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:158:10: ( 'UNSIGNED' | 'unsigned' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:158:12: 'UNSIGNED'
                    {
                    match("UNSIGNED"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:158:25: 'unsigned'
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:159:8: ( 'BINARY' | 'binary' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:159:10: 'BINARY'
                    {
                    match("BINARY"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:159:21: 'binary'
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:160:10: ( 'AUTO_INCREMENT' | 'auto_increment' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:160:12: 'AUTO_INCREMENT'
                    {
                    match("AUTO_INCREMENT"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:160:31: 'auto_increment'
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:161:5: ( 'ASC' | 'asc' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:161:7: 'ASC'
                    {
                    match("ASC"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:161:15: 'asc'
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:162:6: ( 'DESC' | 'desc' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:162:8: 'DESC'
                    {
                    match("DESC"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:162:17: 'desc'
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:163:11: ( 'CHARACTER' | 'character' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:163:13: 'CHARACTER'
                    {
                    match("CHARACTER"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:163:27: 'character'
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:164:5: ( 'USE' | 'use' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:164:7: 'USE'
                    {
                    match("USE"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:164:15: 'use'
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:165:8: ( 'SCHEMA' | 'schema' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:165:10: 'SCHEMA'
                    {
                    match("SCHEMA"); 


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:165:21: 'schema'
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:167:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:167:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:167:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:169:5: ( ( '0' .. '9' )+ )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:169:7: ( '0' .. '9' )+
            {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:169:7: ( '0' .. '9' )+
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
            	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:169:7: '0' .. '9'
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:172:2: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' | '--' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:172:4: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:172:9: (~ ( '\\n' | '\\r' ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( ((LA35_0>='\u0000' && LA35_0<='\t')||(LA35_0>='\u000B' && LA35_0<='\f')||(LA35_0>='\u000E' && LA35_0<='\uFFFF')) ) {
                            alt35=1;
                        }


                        switch (alt35) {
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
                    	    break loop35;
                        }
                    } while (true);

                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:172:23: ( '\\r' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0=='\r') ) {
                        alt36=1;
                    }
                    switch (alt36) {
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
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:173:4: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:173:9: ( options {greedy=false; } : . )*
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
                    	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:173:37: .
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:174:4: '--' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("--"); 

                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:174:9: (~ ( '\\n' | '\\r' ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( ((LA38_0>='\u0000' && LA38_0<='\t')||(LA38_0>='\u000B' && LA38_0<='\f')||(LA38_0>='\u000E' && LA38_0<='\uFFFF')) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:174:9: ~ ( '\\n' | '\\r' )
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

                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:174:23: ( '\\r' )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0=='\r') ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:174:23: '\\r'
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:177:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:177:7: ( ' ' | '\\t' | '\\r' | '\\n' )
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:179:5: ( ( '\\'' ( ESC_SEQ | ~ ( '\\\\' | '\\'' ) )+ '\\'' ) | ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )+ '\"' ) | ( '`' ( ESC_SEQ | ~ ( '\\\\' | '`' ) )+ '`' ) )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:179:7: ( '\\'' ( ESC_SEQ | ~ ( '\\\\' | '\\'' ) )+ '\\'' )
                    {
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:179:7: ( '\\'' ( ESC_SEQ | ~ ( '\\\\' | '\\'' ) )+ '\\'' )
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:179:9: '\\'' ( ESC_SEQ | ~ ( '\\\\' | '\\'' ) )+ '\\''
                    {
                    match('\''); 
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:179:14: ( ESC_SEQ | ~ ( '\\\\' | '\\'' ) )+
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
                    	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:179:16: ESC_SEQ
                    	    {
                    	    mESC_SEQ(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:179:26: ~ ( '\\\\' | '\\'' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:180:4: ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )+ '\"' )
                    {
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:180:4: ( '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )+ '\"' )
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:180:6: '\"' ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )+ '\"'
                    {
                    match('\"'); 
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:180:10: ( ESC_SEQ | ~ ( '\\\\' | '\"' ) )+
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
                    	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:180:12: ESC_SEQ
                    	    {
                    	    mESC_SEQ(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:180:22: ~ ( '\\\\' | '\"' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:181:4: ( '`' ( ESC_SEQ | ~ ( '\\\\' | '`' ) )+ '`' )
                    {
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:181:4: ( '`' ( ESC_SEQ | ~ ( '\\\\' | '`' ) )+ '`' )
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:181:6: '`' ( ESC_SEQ | ~ ( '\\\\' | '`' ) )+ '`'
                    {
                    match('`'); 
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:181:10: ( ESC_SEQ | ~ ( '\\\\' | '`' ) )+
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
                    	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:181:12: ESC_SEQ
                    	    {
                    	    mESC_SEQ(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:181:22: ~ ( '\\\\' | '`' )
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:186:2: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:186:4: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:191:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:191:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:192:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 

                    }
                    break;
                case 3 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:193:9: OCTAL_ESC
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:198:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:198:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:198:14: ( '0' .. '3' )
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:198:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:198:25: ( '0' .. '7' )
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:198:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:198:36: ( '0' .. '7' )
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:198:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:199:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:199:14: ( '0' .. '7' )
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:199:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:199:25: ( '0' .. '7' )
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:199:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:200:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:200:14: ( '0' .. '7' )
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:200:15: '0' .. '7'
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
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:205:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:205:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
        "\1\24\7\uffff\14\50\1\uffff\23\50\6\uffff\14\50\1\165\1\50\1\165"+
        "\1\50\1\171\1\50\1\171\26\50\2\u0096\34\50\1\uffff\2\50\1\u00b5"+
        "\1\uffff\1\50\1\u00b5\5\50\2\u00bc\4\50\1\u00c1\3\50\1\u00c1\12"+
        "\50\1\uffff\2\50\1\u00d1\2\50\1\u00d1\1\u00d4\1\50\1\u00d4\3\50"+
        "\1\u00d9\2\50\1\u00dc\1\u00d9\2\50\1\u00dc\12\50\1\uffff\2\24\1"+
        "\50\1\u00ea\1\50\1\u00ea\1\uffff\4\50\1\uffff\17\50\1\uffff\2\50"+
        "\1\uffff\4\50\1\uffff\2\50\1\uffff\10\50\2\u010f\2\u0110\1\50\1"+
        "\uffff\33\50\1\u012d\1\50\1\u012d\1\u012f\2\50\1\u012f\2\50\2\uffff"+
        "\2\u0134\1\50\1\u0136\1\50\1\u0138\1\u0136\1\50\1\u0138\12\50\1"+
        "\u0144\1\50\1\u0144\1\50\2\u0147\2\u0148\1\u0149\1\uffff\1\u0149"+
        "\1\uffff\1\u014a\1\50\1\u014a\1\50\1\uffff\1\50\1\uffff\1\50\1\uffff"+
        "\1\50\2\u0150\1\u0151\1\50\1\u0151\5\50\1\uffff\2\50\4\uffff\2\50"+
        "\1\u015c\2\u015d\2\uffff\2\u015e\1\50\1\u0160\1\50\1\u0160\2\50"+
        "\2\u0164\3\uffff\1\50\1\uffff\3\50\1\uffff\2\u0169\2\50\1\uffff"+
        "\6\50\2\u0172\1\uffff";
    static final String DFA47_eofS =
        "\u0173\uffff";
    static final String DFA47_minS =
        "\1\11\4\uffff\1\0\2\uffff\1\105\1\145\1\101\1\141\1\101\1\141\1"+
        "\106\1\146\1\117\1\157\1\116\1\156\1\uffff\1\105\1\145\1\101\1\116"+
        "\1\156\1\122\1\162\1\117\1\157\1\105\1\145\1\116\1\156\1\103\1\143"+
        "\1\103\1\143\1\111\1\151\6\uffff\1\117\1\106\1\157\1\146\1\105\1"+
        "\123\1\101\1\145\1\163\1\141\1\102\1\142\1\60\1\104\1\60\1\144\1"+
        "\60\1\114\1\60\1\154\1\111\1\125\1\151\1\165\1\131\1\171\1\123\1"+
        "\111\1\104\1\105\1\151\1\144\1\145\1\111\1\151\1\122\1\114\1\162"+
        "\1\154\1\106\1\146\2\60\2\124\1\103\2\164\1\143\1\124\1\110\1\164"+
        "\1\150\1\116\1\156\1\120\1\101\1\105\1\103\1\160\1\141\1\145\1\143"+
        "\1\101\1\103\1\122\1\141\1\143\1\162\1\114\1\154\1\uffff\1\105\1"+
        "\145\1\60\1\uffff\1\114\1\60\1\154\1\123\1\115\1\163\1\155\2\60"+
        "\1\110\1\121\1\111\1\101\1\60\1\161\1\151\1\141\1\60\1\115\1\155"+
        "\1\105\1\114\1\145\1\154\1\105\1\124\1\145\1\164\1\uffff\1\111\1"+
        "\117\1\60\1\151\1\157\2\60\1\105\1\60\1\145\1\101\1\141\1\60\1\125"+
        "\1\124\2\60\1\165\1\164\1\60\1\124\2\101\1\164\2\141\1\105\1\145"+
        "\1\130\1\170\1\uffff\2\60\1\124\1\60\1\164\1\60\1\uffff\1\150\1"+
        "\125\1\107\1\124\1\uffff\1\165\1\147\1\164\1\101\1\141\1\111\1\124"+
        "\1\151\1\164\2\122\2\162\1\117\1\137\1\uffff\1\157\1\137\1\uffff"+
        "\1\115\1\155\1\122\1\162\1\uffff\1\114\1\105\1\uffff\1\154\1\145"+
        "\1\105\1\104\1\103\1\145\1\144\1\143\4\60\1\123\1\uffff\1\163\1"+
        "\141\1\105\1\116\1\105\1\145\1\156\1\145\1\122\1\162\1\107\1\105"+
        "\1\147\1\145\1\105\1\111\1\145\1\151\1\116\1\111\1\156\1\151\1\101"+
        "\1\141\1\131\1\171\1\124\1\60\1\164\2\60\1\105\1\124\1\60\1\145"+
        "\1\164\2\uffff\2\60\1\163\1\60\1\105\2\60\1\145\1\60\1\131\1\171"+
        "\1\116\1\130\1\156\1\170\1\116\1\103\1\156\1\143\1\60\1\116\1\60"+
        "\1\156\5\60\1\uffff\1\60\1\uffff\1\60\1\105\1\60\1\145\1\uffff\1"+
        "\150\1\uffff\1\104\1\uffff\1\144\3\60\1\124\1\60\1\164\1\103\1\124"+
        "\1\143\1\164\1\uffff\1\103\1\143\4\uffff\1\122\1\162\3\60\2\uffff"+
        "\2\60\1\105\1\60\1\145\1\60\1\122\1\162\2\60\3\uffff\1\123\1\uffff"+
        "\1\163\1\105\1\145\1\uffff\2\60\1\115\1\155\1\uffff\1\105\1\145"+
        "\1\116\1\156\1\124\1\164\2\60\1\uffff";
    static final String DFA47_maxS =
        "\1\172\4\uffff\1\uffff\2\uffff\1\122\1\162\1\122\1\162\1\101\1\141"+
        "\1\116\1\156\1\125\1\165\1\130\1\170\1\uffff\1\105\1\145\1\101\1"+
        "\123\1\163\1\122\1\162\1\125\1\165\1\105\1\145\1\116\1\156\1\125"+
        "\1\165\1\105\1\145\1\111\1\151\6\uffff\1\117\1\123\1\157\1\163\1"+
        "\105\1\123\1\101\1\145\1\163\1\141\1\102\1\142\1\172\1\104\1\172"+
        "\1\144\1\172\1\114\1\172\1\154\1\111\1\125\1\151\1\165\1\131\1\171"+
        "\2\123\1\104\1\105\1\163\1\144\1\145\1\111\1\151\1\122\1\114\1\162"+
        "\1\154\1\123\1\163\2\172\2\124\1\103\2\164\1\143\1\124\1\110\1\164"+
        "\1\150\1\116\1\156\1\120\1\101\1\105\1\103\1\160\1\141\1\145\1\143"+
        "\1\101\1\103\1\122\1\141\1\143\1\162\1\114\1\154\1\uffff\1\105\1"+
        "\145\1\172\1\uffff\1\114\1\172\1\154\1\123\1\115\1\163\1\155\2\172"+
        "\1\110\1\121\1\111\1\101\1\172\1\161\1\151\1\141\1\172\1\115\1\155"+
        "\1\105\1\114\1\145\1\154\1\105\1\124\1\145\1\164\1\uffff\1\111\1"+
        "\117\1\172\1\151\1\157\2\172\1\105\1\172\1\145\1\101\1\141\1\172"+
        "\1\125\1\124\2\172\1\165\1\164\1\172\1\124\2\101\1\164\2\141\1\105"+
        "\1\145\1\130\1\170\1\uffff\2\172\1\124\1\172\1\164\1\172\1\uffff"+
        "\1\150\1\125\1\107\1\124\1\uffff\1\165\1\147\1\164\1\101\1\141\1"+
        "\111\1\124\1\151\1\164\2\122\2\162\1\117\1\137\1\uffff\1\157\1\137"+
        "\1\uffff\1\115\1\155\1\122\1\162\1\uffff\1\114\1\105\1\uffff\1\154"+
        "\1\145\1\105\1\104\1\103\1\145\1\144\1\143\4\172\1\123\1\uffff\1"+
        "\163\1\141\1\105\1\116\1\105\1\145\1\156\1\145\1\122\1\162\1\107"+
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
    static final String DFA47_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\1\7\14\uffff\1\17\23\uffff"+
        "\1\51\1\52\1\53\1\54\1\55\1\5\107\uffff\1\13\3\uffff\1\36\34\uffff"+
        "\1\31\36\uffff\1\14\6\uffff\1\21\4\uffff\1\47\17\uffff\1\44\2\uffff"+
        "\1\37\4\uffff\1\10\2\uffff\1\45\15\uffff\1\16\44\uffff\1\12\1\26"+
        "\34\uffff\1\32\1\uffff\1\11\4\uffff\1\15\1\uffff\1\23\1\uffff\1"+
        "\40\13\uffff\1\35\2\uffff\1\50\1\42\1\20\1\33\5\uffff\1\24\1\25"+
        "\12\uffff\1\22\1\41\1\27\1\uffff\1\34\3\uffff\1\46\4\uffff\1\30"+
        "\10\uffff\1\43";
    static final String DFA47_specialS =
        "\5\uffff\1\0\u016d\uffff}>";
    static final String[] DFA47_transitionS = {
            "\2\53\2\uffff\1\53\22\uffff\1\53\1\uffff\1\54\4\uffff\1\5\1"+
            "\2\1\3\2\uffff\1\4\1\52\1\7\1\52\12\51\1\uffff\1\1\1\uffff\1"+
            "\6\3\uffff\1\42\1\46\1\12\1\10\1\22\1\34\1\50\1\27\1\16\1\50"+
            "\1\25\2\50\1\20\1\40\1\32\1\50\1\36\1\44\1\14\1\30\5\50\4\uffff"+
            "\1\50\1\54\1\43\1\47\1\13\1\11\1\23\1\35\2\50\1\17\1\50\1\26"+
            "\2\50\1\21\1\41\1\33\1\50\1\37\1\45\1\15\1\31\5\50",
            "",
            "",
            "",
            "",
            "\47\54\1\55\uffd8\54",
            "",
            "",
            "\1\57\14\uffff\1\56",
            "\1\61\14\uffff\1\60",
            "\1\63\6\uffff\1\64\11\uffff\1\62",
            "\1\66\6\uffff\1\67\11\uffff\1\65",
            "\1\70",
            "\1\71",
            "\1\72\7\uffff\1\73",
            "\1\74\7\uffff\1\75",
            "\1\76\5\uffff\1\77",
            "\1\100\5\uffff\1\101",
            "\1\103\11\uffff\1\102",
            "\1\105\11\uffff\1\104",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111\1\uffff\1\112\2\uffff\1\113",
            "\1\114\1\uffff\1\115\2\uffff\1\116",
            "\1\117",
            "\1\120",
            "\1\121\5\uffff\1\122",
            "\1\123\5\uffff\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131\17\uffff\1\133\1\uffff\1\132",
            "\1\134\17\uffff\1\136\1\uffff\1\135",
            "\1\140\1\uffff\1\137",
            "\1\142\1\uffff\1\141",
            "\1\143",
            "\1\144",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\145",
            "\1\146\5\uffff\1\147\6\uffff\1\150",
            "\1\151",
            "\1\152\5\uffff\1\153\6\uffff\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\166",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\167",
            "\12\50\7\uffff\23\50\1\170\6\50\4\uffff\1\50\1\uffff\32\50",
            "\1\172",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\23\50\1\173\6\50",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084\11\uffff\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088\11\uffff\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092\14\uffff\1\u0093",
            "\1\u0094\14\uffff\1\u0095",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0097",
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
            "",
            "\1\u00b3",
            "\1\u00b4",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00b6",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
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
            "",
            "\1\u00cf",
            "\1\u00d0",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00d2",
            "\1\u00d3",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00d5",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00da",
            "\1\u00db",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00dd",
            "\1\u00de",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00e9",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00eb",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "",
            "\1\u00f0",
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
            "",
            "\1\u00ff",
            "\1\u0100",
            "",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "",
            "\1\u0105",
            "\1\u0106",
            "",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0111",
            "",
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
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u012e",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0130",
            "\1\u0131",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0132",
            "\1\u0133",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0135",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0137",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0139",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
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
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0145",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0146",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u014b",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u014c",
            "",
            "\1\u014d",
            "",
            "\1\u014e",
            "",
            "\1\u014f",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0152",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "",
            "\1\u0158",
            "\1\u0159",
            "",
            "",
            "",
            "",
            "\1\u015a",
            "\1\u015b",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u015f",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0161",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0162",
            "\1\u0163",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "",
            "\1\u0165",
            "",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u016a",
            "\1\u016b",
            "",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
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
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA47_5 = input.LA(1);

                        s = -1;
                        if ( (LA47_5=='\'') ) {s = 45;}

                        else if ( ((LA47_5>='\u0000' && LA47_5<='&')||(LA47_5>='(' && LA47_5<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 47, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}