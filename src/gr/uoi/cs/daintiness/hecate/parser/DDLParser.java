// $ANTLR 3.4 DDL.g 2013-02-06 16:34:16

  package gr.uoi.cs.daintiness.hecate.parser ;
  import gr.uoi.cs.daintiness.hecate.sql.* ;
  import java.util.TreeMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class DDLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACTION", "ASC", "AUTO_INC", "BINARY", "CASCADE", "CHARACTER", "CHECK", "COLLATE", "COMMENT", "COMMIT", "CONFLICT", "CONSTRAINT", "CREATE", "DATABASE", "DEF", "DEFAULT", "DELETE", "DESC", "DROP", "ENUM", "ESC_SEQ", "EXISTS", "FOREIGN", "FULLTEXT", "HASH", "HEX_DIGIT", "ID", "IF", "IGNORE", "INDEX", "INSERT", "INT", "INTO", "IS", "KEY", "NO", "NOT", "NULL", "OCTAL_ESC", "ON", "PRIMARY", "REFERENCES", "RESTRICT", "SCHEMA", "SET", "TABLE", "UNICODE_ESC", "UNIQUE", "UNSIGNED", "UPDATE", "USE", "VALUES", "WS", "'('", "')'", "','", "'.'", "';'", "'='", "'\\'\\''"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public DDLParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public DDLParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return DDLParser.tokenNames; }
    public String getGrammarFileName() { return "DDL.g"; }


    	Schema s ;
    	TreeMap<String, Table> tm = new TreeMap<String, Table>();
    	TreeMap<String, Attribute> km = new TreeMap<String, Attribute>();
    	TreeMap<String, Attribute> am = new TreeMap<String, Attribute>();
    	Key k = null;
    	
    	String[] getArrayFromList(String list) {
    		String[] array = list.split(",");
    		for (int i = 0; i < array.length; i++) {
    			array[i] = array[i].trim();
    		}
    		return array;
    	}



    // $ANTLR start "start"
    // DDL.g:33:1: start returns [Schema s] : ( drop | create | namespace | insert | update | commit )+ ;
    public final Schema start() throws RecognitionException {
        Schema s = null;


        try {
            // DDL.g:34:2: ( ( drop | create | namespace | insert | update | commit )+ )
            // DDL.g:34:4: ( drop | create | namespace | insert | update | commit )+
            {
            // DDL.g:34:4: ( drop | create | namespace | insert | update | commit )+
            int cnt1=0;
            loop1:
            do {
                int alt1=7;
                switch ( input.LA(1) ) {
                case DROP:
                    {
                    alt1=1;
                    }
                    break;
                case CREATE:
                    {
                    alt1=2;
                    }
                    break;
                case USE:
                    {
                    alt1=3;
                    }
                    break;
                case INSERT:
                    {
                    alt1=4;
                    }
                    break;
                case UPDATE:
                    {
                    alt1=5;
                    }
                    break;
                case COMMIT:
                    {
                    alt1=6;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // DDL.g:34:6: drop
            	    {
            	    pushFollow(FOLLOW_drop_in_start51);
            	    drop();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // DDL.g:34:13: create
            	    {
            	    pushFollow(FOLLOW_create_in_start55);
            	    create();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // DDL.g:34:22: namespace
            	    {
            	    pushFollow(FOLLOW_namespace_in_start59);
            	    namespace();

            	    state._fsp--;


            	    }
            	    break;
            	case 4 :
            	    // DDL.g:34:34: insert
            	    {
            	    pushFollow(FOLLOW_insert_in_start63);
            	    insert();

            	    state._fsp--;


            	    }
            	    break;
            	case 5 :
            	    // DDL.g:34:43: update
            	    {
            	    pushFollow(FOLLOW_update_in_start67);
            	    update();

            	    state._fsp--;


            	    }
            	    break;
            	case 6 :
            	    // DDL.g:34:52: commit
            	    {
            	    pushFollow(FOLLOW_commit_in_start71);
            	    commit();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);



            		s = new Schema(tm) ;
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return s;
    }
    // $ANTLR end "start"



    // $ANTLR start "namespace"
    // DDL.g:40:1: namespace : USE name ';' ;
    public final void namespace() throws RecognitionException {
        try {
            // DDL.g:41:2: ( USE name ';' )
            // DDL.g:41:4: USE name ';'
            {
            match(input,USE,FOLLOW_USE_in_namespace88); 

            pushFollow(FOLLOW_name_in_namespace90);
            name();

            state._fsp--;


            match(input,61,FOLLOW_61_in_namespace92); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "namespace"



    // $ANTLR start "commit"
    // DDL.g:44:1: commit : COMMIT ';' ;
    public final void commit() throws RecognitionException {
        try {
            // DDL.g:45:2: ( COMMIT ';' )
            // DDL.g:45:4: COMMIT ';'
            {
            match(input,COMMIT,FOLLOW_COMMIT_in_commit104); 

            match(input,61,FOLLOW_61_in_commit106); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "commit"



    // $ANTLR start "drop"
    // DDL.g:48:1: drop : ( DROP TABLE ( IF EXISTS )? nameList ';' | DROP DATABASE ( IF EXISTS )? nameList ';' );
    public final void drop() throws RecognitionException {
        try {
            // DDL.g:49:2: ( DROP TABLE ( IF EXISTS )? nameList ';' | DROP DATABASE ( IF EXISTS )? nameList ';' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==DROP) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==TABLE) ) {
                    alt4=1;
                }
                else if ( (LA4_1==DATABASE) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // DDL.g:49:4: DROP TABLE ( IF EXISTS )? nameList ';'
                    {
                    match(input,DROP,FOLLOW_DROP_in_drop117); 

                    match(input,TABLE,FOLLOW_TABLE_in_drop119); 

                    // DDL.g:49:15: ( IF EXISTS )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==IF) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // DDL.g:49:17: IF EXISTS
                            {
                            match(input,IF,FOLLOW_IF_in_drop123); 

                            match(input,EXISTS,FOLLOW_EXISTS_in_drop125); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_nameList_in_drop130);
                    nameList();

                    state._fsp--;


                    match(input,61,FOLLOW_61_in_drop132); 

                    }
                    break;
                case 2 :
                    // DDL.g:50:4: DROP DATABASE ( IF EXISTS )? nameList ';'
                    {
                    match(input,DROP,FOLLOW_DROP_in_drop137); 

                    match(input,DATABASE,FOLLOW_DATABASE_in_drop139); 

                    // DDL.g:50:18: ( IF EXISTS )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==IF) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // DDL.g:50:20: IF EXISTS
                            {
                            match(input,IF,FOLLOW_IF_in_drop143); 

                            match(input,EXISTS,FOLLOW_EXISTS_in_drop145); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_nameList_in_drop150);
                    nameList();

                    state._fsp--;


                    match(input,61,FOLLOW_61_in_drop152); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "drop"



    // $ANTLR start "create"
    // DDL.g:53:1: create : ( CREATE database ( ';' )? | CREATE schema ( ';' )? | CREATE table ( ';' )? | CREATE index ( ';' )? );
    public final void create() throws RecognitionException {
        try {
            // DDL.g:54:2: ( CREATE database ( ';' )? | CREATE schema ( ';' )? | CREATE table ( ';' )? | CREATE index ( ';' )? )
            int alt9=4;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==CREATE) ) {
                switch ( input.LA(2) ) {
                case DATABASE:
                    {
                    alt9=1;
                    }
                    break;
                case SCHEMA:
                    {
                    alt9=2;
                    }
                    break;
                case TABLE:
                    {
                    alt9=3;
                    }
                    break;
                case FULLTEXT:
                case INDEX:
                case PRIMARY:
                case UNIQUE:
                    {
                    alt9=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // DDL.g:54:4: CREATE database ( ';' )?
                    {
                    match(input,CREATE,FOLLOW_CREATE_in_create164); 

                    pushFollow(FOLLOW_database_in_create166);
                    database();

                    state._fsp--;


                    // DDL.g:54:20: ( ';' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==61) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // DDL.g:54:20: ';'
                            {
                            match(input,61,FOLLOW_61_in_create168); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // DDL.g:55:4: CREATE schema ( ';' )?
                    {
                    match(input,CREATE,FOLLOW_CREATE_in_create174); 

                    pushFollow(FOLLOW_schema_in_create176);
                    schema();

                    state._fsp--;


                    // DDL.g:55:18: ( ';' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==61) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // DDL.g:55:18: ';'
                            {
                            match(input,61,FOLLOW_61_in_create178); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // DDL.g:56:4: CREATE table ( ';' )?
                    {
                    match(input,CREATE,FOLLOW_CREATE_in_create184); 

                    pushFollow(FOLLOW_table_in_create186);
                    table();

                    state._fsp--;


                    // DDL.g:56:17: ( ';' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==61) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // DDL.g:56:17: ';'
                            {
                            match(input,61,FOLLOW_61_in_create188); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // DDL.g:57:4: CREATE index ( ';' )?
                    {
                    match(input,CREATE,FOLLOW_CREATE_in_create194); 

                    pushFollow(FOLLOW_index_in_create196);
                    index();

                    state._fsp--;


                    // DDL.g:57:17: ( ';' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==61) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // DDL.g:57:17: ';'
                            {
                            match(input,61,FOLLOW_61_in_create198); 

                            }
                            break;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "create"



    // $ANTLR start "insert"
    // DDL.g:60:1: insert : INSERT ( IGNORE )? INTO name ( '(' nameList ')' )? VALUES '(' (~ ';' )* ')' ';' ;
    public final void insert() throws RecognitionException {
        try {
            // DDL.g:61:2: ( INSERT ( IGNORE )? INTO name ( '(' nameList ')' )? VALUES '(' (~ ';' )* ')' ';' )
            // DDL.g:61:4: INSERT ( IGNORE )? INTO name ( '(' nameList ')' )? VALUES '(' (~ ';' )* ')' ';'
            {
            match(input,INSERT,FOLLOW_INSERT_in_insert210); 

            // DDL.g:61:11: ( IGNORE )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==IGNORE) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // DDL.g:61:11: IGNORE
                    {
                    match(input,IGNORE,FOLLOW_IGNORE_in_insert212); 

                    }
                    break;

            }


            match(input,INTO,FOLLOW_INTO_in_insert215); 

            pushFollow(FOLLOW_name_in_insert217);
            name();

            state._fsp--;


            // DDL.g:61:29: ( '(' nameList ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==57) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // DDL.g:61:31: '(' nameList ')'
                    {
                    match(input,57,FOLLOW_57_in_insert221); 

                    pushFollow(FOLLOW_nameList_in_insert223);
                    nameList();

                    state._fsp--;


                    match(input,58,FOLLOW_58_in_insert225); 

                    }
                    break;

            }


            match(input,VALUES,FOLLOW_VALUES_in_insert230); 

            match(input,57,FOLLOW_57_in_insert232); 

            // DDL.g:61:62: (~ ';' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==58) ) {
                    int LA12_1 = input.LA(2);

                    if ( ((LA12_1 >= ACTION && LA12_1 <= 60)||(LA12_1 >= 62 && LA12_1 <= 63)) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0 >= ACTION && LA12_0 <= 57)||(LA12_0 >= 59 && LA12_0 <= 60)||(LA12_0 >= 62 && LA12_0 <= 63)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // DDL.g:
            	    {
            	    if ( (input.LA(1) >= ACTION && input.LA(1) <= 60)||(input.LA(1) >= 62 && input.LA(1) <= 63) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            match(input,58,FOLLOW_58_in_insert240); 

            match(input,61,FOLLOW_61_in_insert242); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "insert"



    // $ANTLR start "update"
    // DDL.g:64:1: update : UPDATE (~ ';' )* ';' ;
    public final void update() throws RecognitionException {
        try {
            // DDL.g:65:2: ( UPDATE (~ ';' )* ';' )
            // DDL.g:65:4: UPDATE (~ ';' )* ';'
            {
            match(input,UPDATE,FOLLOW_UPDATE_in_update253); 

            // DDL.g:65:11: (~ ';' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0 >= ACTION && LA13_0 <= 60)||(LA13_0 >= 62 && LA13_0 <= 63)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // DDL.g:
            	    {
            	    if ( (input.LA(1) >= ACTION && input.LA(1) <= 60)||(input.LA(1) >= 62 && input.LA(1) <= 63) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            match(input,61,FOLLOW_61_in_update261); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "update"



    // $ANTLR start "database"
    // DDL.g:68:1: database : DATABASE ( IF NOT EXISTS )? name ( parameter )? ;
    public final void database() throws RecognitionException {
        try {
            // DDL.g:69:2: ( DATABASE ( IF NOT EXISTS )? name ( parameter )? )
            // DDL.g:69:4: DATABASE ( IF NOT EXISTS )? name ( parameter )?
            {
            match(input,DATABASE,FOLLOW_DATABASE_in_database272); 

            // DDL.g:69:13: ( IF NOT EXISTS )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==IF) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // DDL.g:69:15: IF NOT EXISTS
                    {
                    match(input,IF,FOLLOW_IF_in_database276); 

                    match(input,NOT,FOLLOW_NOT_in_database278); 

                    match(input,EXISTS,FOLLOW_EXISTS_in_database280); 

                    }
                    break;

            }


            pushFollow(FOLLOW_name_in_database285);
            name();

            state._fsp--;


            // DDL.g:69:37: ( parameter )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ACTION||LA15_0==AUTO_INC||LA15_0==CHARACTER||LA15_0==COLLATE||(LA15_0 >= DEF && LA15_0 <= DEFAULT)||LA15_0==ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // DDL.g:69:37: parameter
                    {
                    pushFollow(FOLLOW_parameter_in_database287);
                    parameter();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "database"



    // $ANTLR start "schema"
    // DDL.g:72:1: schema : SCHEMA ( IF NOT EXISTS )? name ( parameter )? ;
    public final void schema() throws RecognitionException {
        try {
            // DDL.g:73:2: ( SCHEMA ( IF NOT EXISTS )? name ( parameter )? )
            // DDL.g:73:4: SCHEMA ( IF NOT EXISTS )? name ( parameter )?
            {
            match(input,SCHEMA,FOLLOW_SCHEMA_in_schema299); 

            // DDL.g:73:11: ( IF NOT EXISTS )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==IF) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // DDL.g:73:13: IF NOT EXISTS
                    {
                    match(input,IF,FOLLOW_IF_in_schema303); 

                    match(input,NOT,FOLLOW_NOT_in_schema305); 

                    match(input,EXISTS,FOLLOW_EXISTS_in_schema307); 

                    }
                    break;

            }


            pushFollow(FOLLOW_name_in_schema312);
            name();

            state._fsp--;


            // DDL.g:73:35: ( parameter )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ACTION||LA17_0==AUTO_INC||LA17_0==CHARACTER||LA17_0==COLLATE||(LA17_0 >= DEF && LA17_0 <= DEFAULT)||LA17_0==ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // DDL.g:73:35: parameter
                    {
                    pushFollow(FOLLOW_parameter_in_schema314);
                    parameter();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "schema"



    // $ANTLR start "table"
    // DDL.g:76:1: table : TABLE ( IF NOT EXISTS )? name '(' definition ')' ( parameter )* ;
    public final void table() throws RecognitionException {
        DDLParser.name_return name1 =null;



        		am.clear();
        	
        try {
            // DDL.g:80:2: ( TABLE ( IF NOT EXISTS )? name '(' definition ')' ( parameter )* )
            // DDL.g:80:4: TABLE ( IF NOT EXISTS )? name '(' definition ')' ( parameter )*
            {
            match(input,TABLE,FOLLOW_TABLE_in_table331); 

            // DDL.g:80:10: ( IF NOT EXISTS )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IF) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // DDL.g:80:12: IF NOT EXISTS
                    {
                    match(input,IF,FOLLOW_IF_in_table335); 

                    match(input,NOT,FOLLOW_NOT_in_table337); 

                    match(input,EXISTS,FOLLOW_EXISTS_in_table339); 

                    }
                    break;

            }


            pushFollow(FOLLOW_name_in_table344);
            name1=name();

            state._fsp--;


            match(input,57,FOLLOW_57_in_table346); 

            pushFollow(FOLLOW_definition_in_table348);
            definition();

            state._fsp--;


            match(input,58,FOLLOW_58_in_table350); 

            // DDL.g:80:53: ( parameter )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==ACTION||LA19_0==AUTO_INC||LA19_0==CHARACTER||LA19_0==COLLATE||(LA19_0 >= DEF && LA19_0 <= DEFAULT)||LA19_0==ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // DDL.g:80:53: parameter
            	    {
            	    pushFollow(FOLLOW_parameter_in_table352);
            	    parameter();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);



            		String n = (name1!=null?input.toString(name1.start,name1.stop):null).replace("`","");
            		tm.put(n, new Table(n, am, k)) ;
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "table"



    // $ANTLR start "definition"
    // DDL.g:87:1: definition : ( column | constraint | index ) ( ',' ( column | constraint | index ) )* ;
    public final void definition() throws RecognitionException {
        try {
            // DDL.g:88:2: ( ( column | constraint | index ) ( ',' ( column | constraint | index ) )* )
            // DDL.g:88:4: ( column | constraint | index ) ( ',' ( column | constraint | index ) )*
            {
            // DDL.g:88:4: ( column | constraint | index )
            int alt20=3;
            switch ( input.LA(1) ) {
            case ACTION:
            case DEF:
            case ID:
                {
                alt20=1;
                }
                break;
            case CONSTRAINT:
            case FOREIGN:
            case KEY:
                {
                alt20=2;
                }
                break;
            case FULLTEXT:
                {
                int LA20_3 = input.LA(2);

                if ( (LA20_3==FOREIGN||LA20_3==KEY||LA20_3==PRIMARY||LA20_3==UNIQUE) ) {
                    alt20=2;
                }
                else if ( (LA20_3==ACTION||LA20_3==DEF||LA20_3==ID) ) {
                    alt20=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 3, input);

                    throw nvae;

                }
                }
                break;
            case UNIQUE:
                {
                int LA20_4 = input.LA(2);

                if ( (LA20_4==ACTION||LA20_4==DEF||LA20_4==ID||LA20_4==KEY||(LA20_4 >= 57 && LA20_4 <= 59)) ) {
                    alt20=2;
                }
                else if ( (LA20_4==INDEX) ) {
                    alt20=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 4, input);

                    throw nvae;

                }
                }
                break;
            case PRIMARY:
                {
                int LA20_5 = input.LA(2);

                if ( (LA20_5==KEY) ) {
                    alt20=2;
                }
                else if ( (LA20_5==INDEX) ) {
                    alt20=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 5, input);

                    throw nvae;

                }
                }
                break;
            case INDEX:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }

            switch (alt20) {
                case 1 :
                    // DDL.g:88:6: column
                    {
                    pushFollow(FOLLOW_column_in_definition369);
                    column();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // DDL.g:88:15: constraint
                    {
                    pushFollow(FOLLOW_constraint_in_definition373);
                    constraint();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // DDL.g:88:28: index
                    {
                    pushFollow(FOLLOW_index_in_definition377);
                    index();

                    state._fsp--;


                    }
                    break;

            }


            // DDL.g:88:36: ( ',' ( column | constraint | index ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==59) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // DDL.g:88:38: ',' ( column | constraint | index )
            	    {
            	    match(input,59,FOLLOW_59_in_definition383); 

            	    // DDL.g:88:42: ( column | constraint | index )
            	    int alt21=3;
            	    switch ( input.LA(1) ) {
            	    case ACTION:
            	    case DEF:
            	    case ID:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case CONSTRAINT:
            	    case FOREIGN:
            	    case KEY:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    case FULLTEXT:
            	        {
            	        int LA21_3 = input.LA(2);

            	        if ( (LA21_3==FOREIGN||LA21_3==KEY||LA21_3==PRIMARY||LA21_3==UNIQUE) ) {
            	            alt21=2;
            	        }
            	        else if ( (LA21_3==ACTION||LA21_3==DEF||LA21_3==ID) ) {
            	            alt21=3;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 21, 3, input);

            	            throw nvae;

            	        }
            	        }
            	        break;
            	    case UNIQUE:
            	        {
            	        int LA21_4 = input.LA(2);

            	        if ( (LA21_4==ACTION||LA21_4==DEF||LA21_4==ID||LA21_4==KEY||(LA21_4 >= 57 && LA21_4 <= 59)) ) {
            	            alt21=2;
            	        }
            	        else if ( (LA21_4==INDEX) ) {
            	            alt21=3;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 21, 4, input);

            	            throw nvae;

            	        }
            	        }
            	        break;
            	    case PRIMARY:
            	        {
            	        int LA21_5 = input.LA(2);

            	        if ( (LA21_5==KEY) ) {
            	            alt21=2;
            	        }
            	        else if ( (LA21_5==INDEX) ) {
            	            alt21=3;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 21, 5, input);

            	            throw nvae;

            	        }
            	        }
            	        break;
            	    case INDEX:
            	        {
            	        alt21=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt21) {
            	        case 1 :
            	            // DDL.g:88:44: column
            	            {
            	            pushFollow(FOLLOW_column_in_definition387);
            	            column();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // DDL.g:88:53: constraint
            	            {
            	            pushFollow(FOLLOW_constraint_in_definition391);
            	            constraint();

            	            state._fsp--;


            	            }
            	            break;
            	        case 3 :
            	            // DDL.g:88:66: index
            	            {
            	            pushFollow(FOLLOW_index_in_definition395);
            	            index();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "definition"



    // $ANTLR start "column"
    // DDL.g:91:1: column : name type ( option )* ;
    public final void column() throws RecognitionException {
        DDLParser.type_return type2 =null;

        DDLParser.name_return name3 =null;


        try {
            // DDL.g:92:2: ( name type ( option )* )
            // DDL.g:92:4: name type ( option )*
            {
            pushFollow(FOLLOW_name_in_column411);
            name3=name();

            state._fsp--;


            pushFollow(FOLLOW_type_in_column413);
            type2=type();

            state._fsp--;


            // DDL.g:92:14: ( option )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==AUTO_INC||LA23_0==DEFAULT||LA23_0==FOREIGN||LA23_0==KEY||(LA23_0 >= NOT && LA23_0 <= NULL)||(LA23_0 >= PRIMARY && LA23_0 <= REFERENCES)||LA23_0==UNIQUE) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // DDL.g:92:14: option
            	    {
            	    pushFollow(FOLLOW_option_in_column415);
            	    option();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);



            		String t = (type2!=null?input.toString(type2.start,type2.stop):null);
            		String n = (name3!=null?input.toString(name3.start,name3.stop):null).replace("`","");
            		if ( (t != null) & (n != null) )
            			am.put(n, new Attribute(n, t.toUpperCase(), false, null)) ;
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "column"



    // $ANTLR start "constraint"
    // DDL.g:101:1: constraint : ( CONSTRAINT name key | ( CONSTRAINT )? ( FULLTEXT )? key | ( CONSTRAINT name )? UNIQUE ( name )? ( '(' nameList ')' )? | CONSTRAINT ( name )? CHECK '(' name IS NOT NULL ')' );
    public final void constraint() throws RecognitionException {
        try {
            // DDL.g:102:2: ( CONSTRAINT name key | ( CONSTRAINT )? ( FULLTEXT )? key | ( CONSTRAINT name )? UNIQUE ( name )? ( '(' nameList ')' )? | CONSTRAINT ( name )? CHECK '(' name IS NOT NULL ')' )
            int alt30=4;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // DDL.g:102:4: CONSTRAINT name key
                    {
                    match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_constraint430); 

                    pushFollow(FOLLOW_name_in_constraint432);
                    name();

                    state._fsp--;


                    pushFollow(FOLLOW_key_in_constraint434);
                    key();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // DDL.g:103:4: ( CONSTRAINT )? ( FULLTEXT )? key
                    {
                    // DDL.g:103:4: ( CONSTRAINT )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==CONSTRAINT) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // DDL.g:103:4: CONSTRAINT
                            {
                            match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_constraint439); 

                            }
                            break;

                    }


                    // DDL.g:103:16: ( FULLTEXT )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==FULLTEXT) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // DDL.g:103:16: FULLTEXT
                            {
                            match(input,FULLTEXT,FOLLOW_FULLTEXT_in_constraint442); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_key_in_constraint445);
                    key();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // DDL.g:104:4: ( CONSTRAINT name )? UNIQUE ( name )? ( '(' nameList ')' )?
                    {
                    // DDL.g:104:4: ( CONSTRAINT name )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==CONSTRAINT) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // DDL.g:104:6: CONSTRAINT name
                            {
                            match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_constraint452); 

                            pushFollow(FOLLOW_name_in_constraint454);
                            name();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input,UNIQUE,FOLLOW_UNIQUE_in_constraint459); 

                    // DDL.g:104:32: ( name )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==ACTION||LA27_0==DEF||LA27_0==ID) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // DDL.g:104:32: name
                            {
                            pushFollow(FOLLOW_name_in_constraint461);
                            name();

                            state._fsp--;


                            }
                            break;

                    }


                    // DDL.g:104:38: ( '(' nameList ')' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==57) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // DDL.g:104:40: '(' nameList ')'
                            {
                            match(input,57,FOLLOW_57_in_constraint466); 

                            pushFollow(FOLLOW_nameList_in_constraint468);
                            nameList();

                            state._fsp--;


                            match(input,58,FOLLOW_58_in_constraint470); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // DDL.g:105:4: CONSTRAINT ( name )? CHECK '(' name IS NOT NULL ')'
                    {
                    match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_constraint478); 

                    // DDL.g:105:15: ( name )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==ACTION||LA29_0==DEF||LA29_0==ID) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // DDL.g:105:15: name
                            {
                            pushFollow(FOLLOW_name_in_constraint480);
                            name();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input,CHECK,FOLLOW_CHECK_in_constraint483); 

                    match(input,57,FOLLOW_57_in_constraint485); 

                    pushFollow(FOLLOW_name_in_constraint487);
                    name();

                    state._fsp--;


                    match(input,IS,FOLLOW_IS_in_constraint489); 

                    match(input,NOT,FOLLOW_NOT_in_constraint491); 

                    match(input,NULL,FOLLOW_NULL_in_constraint493); 

                    match(input,58,FOLLOW_58_in_constraint495); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "constraint"



    // $ANTLR start "index"
    // DDL.g:108:1: index : ( ( UNIQUE | PRIMARY )? INDEX ( name )? ( ON name )? '(' nameList ')' | FULLTEXT name '(' nameList ')' );
    public final void index() throws RecognitionException {
        try {
            // DDL.g:109:2: ( ( UNIQUE | PRIMARY )? INDEX ( name )? ( ON name )? '(' nameList ')' | FULLTEXT name '(' nameList ')' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==INDEX||LA34_0==PRIMARY||LA34_0==UNIQUE) ) {
                alt34=1;
            }
            else if ( (LA34_0==FULLTEXT) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }
            switch (alt34) {
                case 1 :
                    // DDL.g:109:4: ( UNIQUE | PRIMARY )? INDEX ( name )? ( ON name )? '(' nameList ')'
                    {
                    // DDL.g:109:4: ( UNIQUE | PRIMARY )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==PRIMARY||LA31_0==UNIQUE) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // DDL.g:
                            {
                            if ( input.LA(1)==PRIMARY||input.LA(1)==UNIQUE ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }


                    match(input,INDEX,FOLLOW_INDEX_in_index517); 

                    // DDL.g:109:32: ( name )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==ACTION||LA32_0==DEF||LA32_0==ID) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // DDL.g:109:32: name
                            {
                            pushFollow(FOLLOW_name_in_index519);
                            name();

                            state._fsp--;


                            }
                            break;

                    }


                    // DDL.g:109:38: ( ON name )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==ON) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // DDL.g:109:40: ON name
                            {
                            match(input,ON,FOLLOW_ON_in_index524); 

                            pushFollow(FOLLOW_name_in_index526);
                            name();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input,57,FOLLOW_57_in_index531); 

                    pushFollow(FOLLOW_nameList_in_index533);
                    nameList();

                    state._fsp--;


                    match(input,58,FOLLOW_58_in_index535); 

                    }
                    break;
                case 2 :
                    // DDL.g:110:4: FULLTEXT name '(' nameList ')'
                    {
                    match(input,FULLTEXT,FOLLOW_FULLTEXT_in_index540); 

                    pushFollow(FOLLOW_name_in_index542);
                    name();

                    state._fsp--;


                    match(input,57,FOLLOW_57_in_index544); 

                    pushFollow(FOLLOW_nameList_in_index546);
                    nameList();

                    state._fsp--;


                    match(input,58,FOLLOW_58_in_index548); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "index"



    // $ANTLR start "key"
    // DDL.g:113:1: key : ( ( UNIQUE | PRIMARY )? KEY ( name )? ( '(' nameList ')' )? | FOREIGN KEY ( name )? ( '(' nameList ')' )? reference );
    public final void key() throws RecognitionException {
        DDLParser.nameList_return nameList4 =null;



        		km.clear();
        	
        try {
            // DDL.g:117:2: ( ( UNIQUE | PRIMARY )? KEY ( name )? ( '(' nameList ')' )? | FOREIGN KEY ( name )? ( '(' nameList ')' )? reference )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==KEY||LA40_0==PRIMARY||LA40_0==UNIQUE) ) {
                alt40=1;
            }
            else if ( (LA40_0==FOREIGN) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;

            }
            switch (alt40) {
                case 1 :
                    // DDL.g:117:4: ( UNIQUE | PRIMARY )? KEY ( name )? ( '(' nameList ')' )?
                    {
                    // DDL.g:117:4: ( UNIQUE | PRIMARY )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==PRIMARY||LA35_0==UNIQUE) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // DDL.g:
                            {
                            if ( input.LA(1)==PRIMARY||input.LA(1)==UNIQUE ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }


                    match(input,KEY,FOLLOW_KEY_in_key575); 

                    // DDL.g:117:30: ( name )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==ACTION||LA36_0==DEF||LA36_0==ID) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // DDL.g:117:30: name
                            {
                            pushFollow(FOLLOW_name_in_key577);
                            name();

                            state._fsp--;


                            }
                            break;

                    }


                    // DDL.g:117:36: ( '(' nameList ')' )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==57) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // DDL.g:117:38: '(' nameList ')'
                            {
                            match(input,57,FOLLOW_57_in_key582); 

                            pushFollow(FOLLOW_nameList_in_key584);
                            nameList4=nameList();

                            state._fsp--;


                            match(input,58,FOLLOW_58_in_key586); 

                            }
                            break;

                    }



                    		if ((nameList4!=null?input.toString(nameList4.start,nameList4.stop):null) != null) {
                    			String[] list = getArrayFromList((nameList4!=null?input.toString(nameList4.start,nameList4.stop):null));
                    			for (int i = 0; i < list.length; i++) {
                    				if (am.containsKey(list[i])) {
                    					Attribute a = am.get(list[i]);
                    					a.setToKey();
                    					km.put(list[i], a);
                    				}
                    			}
                    		}
                    	

                    }
                    break;
                case 2 :
                    // DDL.g:130:4: FOREIGN KEY ( name )? ( '(' nameList ')' )? reference
                    {
                    match(input,FOREIGN,FOLLOW_FOREIGN_in_key597); 

                    match(input,KEY,FOLLOW_KEY_in_key599); 

                    // DDL.g:130:16: ( name )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==ACTION||LA38_0==DEF||LA38_0==ID) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // DDL.g:130:16: name
                            {
                            pushFollow(FOLLOW_name_in_key601);
                            name();

                            state._fsp--;


                            }
                            break;

                    }


                    // DDL.g:130:22: ( '(' nameList ')' )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==57) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // DDL.g:130:24: '(' nameList ')'
                            {
                            match(input,57,FOLLOW_57_in_key606); 

                            pushFollow(FOLLOW_nameList_in_key608);
                            nameList();

                            state._fsp--;


                            match(input,58,FOLLOW_58_in_key610); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_reference_in_key615);
                    reference();

                    state._fsp--;



                    		//TODO
                    	

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "key"



    // $ANTLR start "option"
    // DDL.g:136:1: option : ( key | reference | ( NOT )? NULL | AUTO_INC | DEFAULT ( value | NULL | empty ) );
    public final void option() throws RecognitionException {
        try {
            // DDL.g:137:2: ( key | reference | ( NOT )? NULL | AUTO_INC | DEFAULT ( value | NULL | empty ) )
            int alt43=5;
            switch ( input.LA(1) ) {
            case FOREIGN:
            case KEY:
            case PRIMARY:
            case UNIQUE:
                {
                alt43=1;
                }
                break;
            case REFERENCES:
                {
                alt43=2;
                }
                break;
            case NOT:
            case NULL:
                {
                alt43=3;
                }
                break;
            case AUTO_INC:
                {
                alt43=4;
                }
                break;
            case DEFAULT:
                {
                alt43=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }

            switch (alt43) {
                case 1 :
                    // DDL.g:137:4: key
                    {
                    pushFollow(FOLLOW_key_in_option629);
                    key();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // DDL.g:138:4: reference
                    {
                    pushFollow(FOLLOW_reference_in_option634);
                    reference();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // DDL.g:139:4: ( NOT )? NULL
                    {
                    // DDL.g:139:4: ( NOT )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==NOT) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // DDL.g:139:4: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_option639); 

                            }
                            break;

                    }


                    match(input,NULL,FOLLOW_NULL_in_option642); 

                    }
                    break;
                case 4 :
                    // DDL.g:140:4: AUTO_INC
                    {
                    match(input,AUTO_INC,FOLLOW_AUTO_INC_in_option647); 

                    }
                    break;
                case 5 :
                    // DDL.g:141:4: DEFAULT ( value | NULL | empty )
                    {
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_option652); 

                    // DDL.g:141:12: ( value | NULL | empty )
                    int alt42=3;
                    switch ( input.LA(1) ) {
                    case ACTION:
                    case DEF:
                    case ID:
                    case INT:
                        {
                        alt42=1;
                        }
                        break;
                    case NULL:
                        {
                        alt42=2;
                        }
                        break;
                    case 63:
                        {
                        alt42=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;

                    }

                    switch (alt42) {
                        case 1 :
                            // DDL.g:141:14: value
                            {
                            pushFollow(FOLLOW_value_in_option656);
                            value();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // DDL.g:141:22: NULL
                            {
                            match(input,NULL,FOLLOW_NULL_in_option660); 

                            }
                            break;
                        case 3 :
                            // DDL.g:141:29: empty
                            {
                            pushFollow(FOLLOW_empty_in_option664);
                            empty();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "option"



    // $ANTLR start "reference"
    // DDL.g:144:1: reference : REFERENCES ( name )? ( '(' nameList ')' )? ( referenceOptions )* ;
    public final void reference() throws RecognitionException {
        try {
            // DDL.g:145:2: ( REFERENCES ( name )? ( '(' nameList ')' )? ( referenceOptions )* )
            // DDL.g:145:4: REFERENCES ( name )? ( '(' nameList ')' )? ( referenceOptions )*
            {
            match(input,REFERENCES,FOLLOW_REFERENCES_in_reference677); 

            // DDL.g:145:15: ( name )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==ACTION||LA44_0==DEF||LA44_0==ID) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // DDL.g:145:15: name
                    {
                    pushFollow(FOLLOW_name_in_reference679);
                    name();

                    state._fsp--;


                    }
                    break;

            }


            // DDL.g:145:21: ( '(' nameList ')' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==57) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // DDL.g:145:23: '(' nameList ')'
                    {
                    match(input,57,FOLLOW_57_in_reference684); 

                    pushFollow(FOLLOW_nameList_in_reference686);
                    nameList();

                    state._fsp--;


                    match(input,58,FOLLOW_58_in_reference688); 

                    }
                    break;

            }


            // DDL.g:145:43: ( referenceOptions )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==ON) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // DDL.g:145:43: referenceOptions
            	    {
            	    pushFollow(FOLLOW_referenceOptions_in_reference693);
            	    referenceOptions();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "reference"



    // $ANTLR start "referenceOptions"
    // DDL.g:148:1: referenceOptions : ( ON DELETE ( CASCADE | RESTRICT | NO ACTION | SET ( DEFAULT | NULL ) ) | ON UPDATE ( CASCADE | SET ( DEFAULT | NULL ) ) );
    public final void referenceOptions() throws RecognitionException {
        try {
            // DDL.g:149:2: ( ON DELETE ( CASCADE | RESTRICT | NO ACTION | SET ( DEFAULT | NULL ) ) | ON UPDATE ( CASCADE | SET ( DEFAULT | NULL ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==ON) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==DELETE) ) {
                    alt49=1;
                }
                else if ( (LA49_1==UPDATE) ) {
                    alt49=2;
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
                    // DDL.g:149:4: ON DELETE ( CASCADE | RESTRICT | NO ACTION | SET ( DEFAULT | NULL ) )
                    {
                    match(input,ON,FOLLOW_ON_in_referenceOptions705); 

                    match(input,DELETE,FOLLOW_DELETE_in_referenceOptions707); 

                    // DDL.g:149:14: ( CASCADE | RESTRICT | NO ACTION | SET ( DEFAULT | NULL ) )
                    int alt47=4;
                    switch ( input.LA(1) ) {
                    case CASCADE:
                        {
                        alt47=1;
                        }
                        break;
                    case RESTRICT:
                        {
                        alt47=2;
                        }
                        break;
                    case NO:
                        {
                        alt47=3;
                        }
                        break;
                    case SET:
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
                            // DDL.g:149:16: CASCADE
                            {
                            match(input,CASCADE,FOLLOW_CASCADE_in_referenceOptions711); 

                            }
                            break;
                        case 2 :
                            // DDL.g:149:26: RESTRICT
                            {
                            match(input,RESTRICT,FOLLOW_RESTRICT_in_referenceOptions715); 

                            }
                            break;
                        case 3 :
                            // DDL.g:149:37: NO ACTION
                            {
                            match(input,NO,FOLLOW_NO_in_referenceOptions719); 

                            match(input,ACTION,FOLLOW_ACTION_in_referenceOptions721); 

                            }
                            break;
                        case 4 :
                            // DDL.g:149:49: SET ( DEFAULT | NULL )
                            {
                            match(input,SET,FOLLOW_SET_in_referenceOptions725); 

                            if ( input.LA(1)==DEFAULT||input.LA(1)==NULL ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // DDL.g:150:4: ON UPDATE ( CASCADE | SET ( DEFAULT | NULL ) )
                    {
                    match(input,ON,FOLLOW_ON_in_referenceOptions742); 

                    match(input,UPDATE,FOLLOW_UPDATE_in_referenceOptions744); 

                    // DDL.g:150:14: ( CASCADE | SET ( DEFAULT | NULL ) )
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==CASCADE) ) {
                        alt48=1;
                    }
                    else if ( (LA48_0==SET) ) {
                        alt48=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        throw nvae;

                    }
                    switch (alt48) {
                        case 1 :
                            // DDL.g:150:16: CASCADE
                            {
                            match(input,CASCADE,FOLLOW_CASCADE_in_referenceOptions748); 

                            }
                            break;
                        case 2 :
                            // DDL.g:150:26: SET ( DEFAULT | NULL )
                            {
                            match(input,SET,FOLLOW_SET_in_referenceOptions752); 

                            if ( input.LA(1)==DEFAULT||input.LA(1)==NULL ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "referenceOptions"



    // $ANTLR start "order"
    // DDL.g:153:1: order : ( ASC | DESC );
    public final void order() throws RecognitionException {
        try {
            // DDL.g:154:2: ( ASC | DESC )
            // DDL.g:
            {
            if ( input.LA(1)==ASC||input.LA(1)==DESC ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "order"



    // $ANTLR start "parameter"
    // DDL.g:158:1: parameter : ( name '=' value ( ',' )? | ( DEFAULT )? CHARACTER SET ( '=' )? value ( ',' )? | ( DEFAULT )? COLLATE ( '=' )? value ( ',' )? | AUTO_INC ( '=' )? INT );
    public final void parameter() throws RecognitionException {
        try {
            // DDL.g:159:2: ( name '=' value ( ',' )? | ( DEFAULT )? CHARACTER SET ( '=' )? value ( ',' )? | ( DEFAULT )? COLLATE ( '=' )? value ( ',' )? | AUTO_INC ( '=' )? INT )
            int alt58=4;
            switch ( input.LA(1) ) {
            case ACTION:
            case DEF:
            case ID:
                {
                alt58=1;
                }
                break;
            case DEFAULT:
                {
                int LA58_2 = input.LA(2);

                if ( (LA58_2==CHARACTER) ) {
                    alt58=2;
                }
                else if ( (LA58_2==COLLATE) ) {
                    alt58=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 58, 2, input);

                    throw nvae;

                }
                }
                break;
            case CHARACTER:
                {
                alt58=2;
                }
                break;
            case COLLATE:
                {
                alt58=3;
                }
                break;
            case AUTO_INC:
                {
                alt58=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;

            }

            switch (alt58) {
                case 1 :
                    // DDL.g:159:4: name '=' value ( ',' )?
                    {
                    pushFollow(FOLLOW_name_in_parameter792);
                    name();

                    state._fsp--;


                    match(input,62,FOLLOW_62_in_parameter794); 

                    pushFollow(FOLLOW_value_in_parameter796);
                    value();

                    state._fsp--;


                    // DDL.g:159:19: ( ',' )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==59) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // DDL.g:159:19: ','
                            {
                            match(input,59,FOLLOW_59_in_parameter798); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // DDL.g:160:4: ( DEFAULT )? CHARACTER SET ( '=' )? value ( ',' )?
                    {
                    // DDL.g:160:4: ( DEFAULT )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==DEFAULT) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // DDL.g:160:6: DEFAULT
                            {
                            match(input,DEFAULT,FOLLOW_DEFAULT_in_parameter806); 

                            }
                            break;

                    }


                    match(input,CHARACTER,FOLLOW_CHARACTER_in_parameter811); 

                    match(input,SET,FOLLOW_SET_in_parameter813); 

                    // DDL.g:160:31: ( '=' )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==62) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // DDL.g:160:31: '='
                            {
                            match(input,62,FOLLOW_62_in_parameter815); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_value_in_parameter818);
                    value();

                    state._fsp--;


                    // DDL.g:160:42: ( ',' )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==59) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // DDL.g:160:42: ','
                            {
                            match(input,59,FOLLOW_59_in_parameter820); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // DDL.g:161:4: ( DEFAULT )? COLLATE ( '=' )? value ( ',' )?
                    {
                    // DDL.g:161:4: ( DEFAULT )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==DEFAULT) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // DDL.g:161:6: DEFAULT
                            {
                            match(input,DEFAULT,FOLLOW_DEFAULT_in_parameter828); 

                            }
                            break;

                    }


                    match(input,COLLATE,FOLLOW_COLLATE_in_parameter833); 

                    // DDL.g:161:25: ( '=' )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==62) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // DDL.g:161:25: '='
                            {
                            match(input,62,FOLLOW_62_in_parameter835); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_value_in_parameter838);
                    value();

                    state._fsp--;


                    // DDL.g:161:36: ( ',' )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==59) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // DDL.g:161:36: ','
                            {
                            match(input,59,FOLLOW_59_in_parameter840); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // DDL.g:162:4: AUTO_INC ( '=' )? INT
                    {
                    match(input,AUTO_INC,FOLLOW_AUTO_INC_in_parameter846); 

                    // DDL.g:162:13: ( '=' )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==62) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // DDL.g:162:13: '='
                            {
                            match(input,62,FOLLOW_62_in_parameter848); 

                            }
                            break;

                    }


                    match(input,INT,FOLLOW_INT_in_parameter851); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "parameter"


    public static class type_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "type"
    // DDL.g:165:1: type : ( ( UNSIGNED | BINARY )? name ( '(' INT ( ',' INT )? ')' )? ( UNSIGNED | BINARY )? | ENUM '(' nameList ')' | BINARY ( '(' INT ')' ) );
    public final DDLParser.type_return type() throws RecognitionException {
        DDLParser.type_return retval = new DDLParser.type_return();
        retval.start = input.LT(1);


        try {
            // DDL.g:166:2: ( ( UNSIGNED | BINARY )? name ( '(' INT ( ',' INT )? ')' )? ( UNSIGNED | BINARY )? | ENUM '(' nameList ')' | BINARY ( '(' INT ')' ) )
            int alt63=3;
            switch ( input.LA(1) ) {
            case BINARY:
                {
                int LA63_1 = input.LA(2);

                if ( (LA63_1==ACTION||LA63_1==DEF||LA63_1==ID) ) {
                    alt63=1;
                }
                else if ( (LA63_1==57) ) {
                    alt63=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 1, input);

                    throw nvae;

                }
                }
                break;
            case ACTION:
            case DEF:
            case ID:
            case UNSIGNED:
                {
                alt63=1;
                }
                break;
            case ENUM:
                {
                alt63=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;

            }

            switch (alt63) {
                case 1 :
                    // DDL.g:166:4: ( UNSIGNED | BINARY )? name ( '(' INT ( ',' INT )? ')' )? ( UNSIGNED | BINARY )?
                    {
                    // DDL.g:166:4: ( UNSIGNED | BINARY )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==BINARY||LA59_0==UNSIGNED) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // DDL.g:
                            {
                            if ( input.LA(1)==BINARY||input.LA(1)==UNSIGNED ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }


                    pushFollow(FOLLOW_name_in_type873);
                    name();

                    state._fsp--;


                    // DDL.g:166:32: ( '(' INT ( ',' INT )? ')' )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==57) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // DDL.g:166:34: '(' INT ( ',' INT )? ')'
                            {
                            match(input,57,FOLLOW_57_in_type877); 

                            match(input,INT,FOLLOW_INT_in_type879); 

                            // DDL.g:166:42: ( ',' INT )?
                            int alt60=2;
                            int LA60_0 = input.LA(1);

                            if ( (LA60_0==59) ) {
                                alt60=1;
                            }
                            switch (alt60) {
                                case 1 :
                                    // DDL.g:166:44: ',' INT
                                    {
                                    match(input,59,FOLLOW_59_in_type883); 

                                    match(input,INT,FOLLOW_INT_in_type885); 

                                    }
                                    break;

                            }


                            match(input,58,FOLLOW_58_in_type890); 

                            }
                            break;

                    }


                    // DDL.g:166:62: ( UNSIGNED | BINARY )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==BINARY||LA62_0==UNSIGNED) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // DDL.g:
                            {
                            if ( input.LA(1)==BINARY||input.LA(1)==UNSIGNED ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // DDL.g:167:4: ENUM '(' nameList ')'
                    {
                    match(input,ENUM,FOLLOW_ENUM_in_type909); 

                    match(input,57,FOLLOW_57_in_type911); 

                    pushFollow(FOLLOW_nameList_in_type913);
                    nameList();

                    state._fsp--;


                    match(input,58,FOLLOW_58_in_type915); 

                    }
                    break;
                case 3 :
                    // DDL.g:168:4: BINARY ( '(' INT ')' )
                    {
                    match(input,BINARY,FOLLOW_BINARY_in_type920); 

                    // DDL.g:168:11: ( '(' INT ')' )
                    // DDL.g:168:13: '(' INT ')'
                    {
                    match(input,57,FOLLOW_57_in_type924); 

                    match(input,INT,FOLLOW_INT_in_type926); 

                    match(input,58,FOLLOW_58_in_type928); 

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type"


    public static class nameList_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "nameList"
    // DDL.g:171:1: nameList : name ( '(' value ')' )? ( order )? ( ( ',' )? name ( '(' value ')' )? ( order )? )* ;
    public final DDLParser.nameList_return nameList() throws RecognitionException {
        DDLParser.nameList_return retval = new DDLParser.nameList_return();
        retval.start = input.LT(1);


        try {
            // DDL.g:172:2: ( name ( '(' value ')' )? ( order )? ( ( ',' )? name ( '(' value ')' )? ( order )? )* )
            // DDL.g:172:4: name ( '(' value ')' )? ( order )? ( ( ',' )? name ( '(' value ')' )? ( order )? )*
            {
            pushFollow(FOLLOW_name_in_nameList941);
            name();

            state._fsp--;


            // DDL.g:172:9: ( '(' value ')' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==57) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // DDL.g:172:11: '(' value ')'
                    {
                    match(input,57,FOLLOW_57_in_nameList945); 

                    pushFollow(FOLLOW_value_in_nameList947);
                    value();

                    state._fsp--;


                    match(input,58,FOLLOW_58_in_nameList949); 

                    }
                    break;

            }


            // DDL.g:172:28: ( order )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==ASC||LA65_0==DESC) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // DDL.g:172:28: order
                    {
                    pushFollow(FOLLOW_order_in_nameList954);
                    order();

                    state._fsp--;


                    }
                    break;

            }


            // DDL.g:172:35: ( ( ',' )? name ( '(' value ')' )? ( order )? )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==ACTION||LA69_0==DEF||LA69_0==ID||LA69_0==59) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // DDL.g:172:37: ( ',' )? name ( '(' value ')' )? ( order )?
            	    {
            	    // DDL.g:172:37: ( ',' )?
            	    int alt66=2;
            	    int LA66_0 = input.LA(1);

            	    if ( (LA66_0==59) ) {
            	        alt66=1;
            	    }
            	    switch (alt66) {
            	        case 1 :
            	            // DDL.g:172:37: ','
            	            {
            	            match(input,59,FOLLOW_59_in_nameList959); 

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_name_in_nameList962);
            	    name();

            	    state._fsp--;


            	    // DDL.g:172:47: ( '(' value ')' )?
            	    int alt67=2;
            	    int LA67_0 = input.LA(1);

            	    if ( (LA67_0==57) ) {
            	        alt67=1;
            	    }
            	    switch (alt67) {
            	        case 1 :
            	            // DDL.g:172:49: '(' value ')'
            	            {
            	            match(input,57,FOLLOW_57_in_nameList966); 

            	            pushFollow(FOLLOW_value_in_nameList968);
            	            value();

            	            state._fsp--;


            	            match(input,58,FOLLOW_58_in_nameList970); 

            	            }
            	            break;

            	    }


            	    // DDL.g:172:66: ( order )?
            	    int alt68=2;
            	    int LA68_0 = input.LA(1);

            	    if ( (LA68_0==ASC||LA68_0==DESC) ) {
            	        alt68=1;
            	    }
            	    switch (alt68) {
            	        case 1 :
            	            // DDL.g:172:66: order
            	            {
            	            pushFollow(FOLLOW_order_in_nameList975);
            	            order();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nameList"



    // $ANTLR start "valueList"
    // DDL.g:175:1: valueList : ( value | empty ) ( ',' ( value | empty ) )* ;
    public final void valueList() throws RecognitionException {
        try {
            // DDL.g:176:2: ( ( value | empty ) ( ',' ( value | empty ) )* )
            // DDL.g:176:4: ( value | empty ) ( ',' ( value | empty ) )*
            {
            // DDL.g:176:4: ( value | empty )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==ACTION||LA70_0==DEF||LA70_0==ID||LA70_0==INT) ) {
                alt70=1;
            }
            else if ( (LA70_0==63) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;

            }
            switch (alt70) {
                case 1 :
                    // DDL.g:176:6: value
                    {
                    pushFollow(FOLLOW_value_in_valueList992);
                    value();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // DDL.g:176:14: empty
                    {
                    pushFollow(FOLLOW_empty_in_valueList996);
                    empty();

                    state._fsp--;


                    }
                    break;

            }


            // DDL.g:176:22: ( ',' ( value | empty ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==59) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // DDL.g:176:23: ',' ( value | empty )
            	    {
            	    match(input,59,FOLLOW_59_in_valueList1001); 

            	    // DDL.g:176:27: ( value | empty )
            	    int alt71=2;
            	    int LA71_0 = input.LA(1);

            	    if ( (LA71_0==ACTION||LA71_0==DEF||LA71_0==ID||LA71_0==INT) ) {
            	        alt71=1;
            	    }
            	    else if ( (LA71_0==63) ) {
            	        alt71=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 71, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt71) {
            	        case 1 :
            	            // DDL.g:176:29: value
            	            {
            	            pushFollow(FOLLOW_value_in_valueList1005);
            	            value();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // DDL.g:176:37: empty
            	            {
            	            pushFollow(FOLLOW_empty_in_valueList1009);
            	            empty();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "valueList"



    // $ANTLR start "value"
    // DDL.g:179:1: value : ( name | INT );
    public final void value() throws RecognitionException {
        try {
            // DDL.g:180:2: ( name | INT )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==ACTION||LA73_0==DEF||LA73_0==ID) ) {
                alt73=1;
            }
            else if ( (LA73_0==INT) ) {
                alt73=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;

            }
            switch (alt73) {
                case 1 :
                    // DDL.g:180:4: name
                    {
                    pushFollow(FOLLOW_name_in_value1024);
                    name();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // DDL.g:181:4: INT
                    {
                    match(input,INT,FOLLOW_INT_in_value1029); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "value"



    // $ANTLR start "empty"
    // DDL.g:184:2: empty : '\\'\\'' ;
    public final void empty() throws RecognitionException {
        try {
            // DDL.g:185:2: ( '\\'\\'' )
            // DDL.g:185:4: '\\'\\''
            {
            match(input,63,FOLLOW_63_in_empty1041); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "empty"


    public static class name_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "name"
    // DDL.g:188:1: name : ( ID ( '.' ID )* | DEF ( '.' DEF )* | ACTION );
    public final DDLParser.name_return name() throws RecognitionException {
        DDLParser.name_return retval = new DDLParser.name_return();
        retval.start = input.LT(1);


        try {
            // DDL.g:189:2: ( ID ( '.' ID )* | DEF ( '.' DEF )* | ACTION )
            int alt76=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt76=1;
                }
                break;
            case DEF:
                {
                alt76=2;
                }
                break;
            case ACTION:
                {
                alt76=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;

            }

            switch (alt76) {
                case 1 :
                    // DDL.g:189:4: ID ( '.' ID )*
                    {
                    match(input,ID,FOLLOW_ID_in_name1052); 

                    // DDL.g:189:7: ( '.' ID )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==60) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // DDL.g:189:9: '.' ID
                    	    {
                    	    match(input,60,FOLLOW_60_in_name1056); 

                    	    match(input,ID,FOLLOW_ID_in_name1058); 

                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // DDL.g:190:4: DEF ( '.' DEF )*
                    {
                    match(input,DEF,FOLLOW_DEF_in_name1066); 

                    // DDL.g:190:8: ( '.' DEF )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==60) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // DDL.g:190:10: '.' DEF
                    	    {
                    	    match(input,60,FOLLOW_60_in_name1070); 

                    	    match(input,DEF,FOLLOW_DEF_in_name1072); 

                    	    }
                    	    break;

                    	default :
                    	    break loop75;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // DDL.g:191:4: ACTION
                    {
                    match(input,ACTION,FOLLOW_ACTION_in_name1080); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "name"

    // Delegated rules


    protected DFA30 dfa30 = new DFA30(this);
    static final String DFA30_eotS =
        "\17\uffff";
    static final String DFA30_eofS =
        "\17\uffff";
    static final String DFA30_minS =
        "\1\17\1\4\1\uffff\1\4\3\12\2\uffff\1\36\1\4\1\uffff\1\22\2\12";
    static final String DFA30_maxS =
        "\2\63\1\uffff\1\73\2\74\1\63\2\uffff\1\36\1\73\1\uffff\1\22\2\74";
    static final String DFA30_acceptS =
        "\2\uffff\1\2\4\uffff\1\4\1\3\2\uffff\1\1\3\uffff";
    static final String DFA30_specialS =
        "\17\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\1\12\uffff\2\2\12\uffff\1\2\5\uffff\1\2\6\uffff\1\3",
            "\1\6\5\uffff\1\7\7\uffff\1\5\7\uffff\2\2\2\uffff\1\4\7\uffff"+
            "\1\2\5\uffff\1\2\6\uffff\1\2",
            "",
            "\1\10\15\uffff\1\10\13\uffff\1\10\7\uffff\1\2\22\uffff\3\10",
            "\1\7\17\uffff\1\13\13\uffff\1\13\5\uffff\1\13\6\uffff\1\12"+
            "\10\uffff\1\11",
            "\1\7\17\uffff\1\13\13\uffff\1\13\5\uffff\1\13\6\uffff\1\12"+
            "\10\uffff\1\14",
            "\1\7\17\uffff\1\13\13\uffff\1\13\5\uffff\1\13\6\uffff\1\12",
            "",
            "",
            "\1\15",
            "\1\10\15\uffff\1\10\13\uffff\1\10\7\uffff\1\13\22\uffff\3\10",
            "",
            "\1\16",
            "\1\7\17\uffff\1\13\13\uffff\1\13\5\uffff\1\13\6\uffff\1\12"+
            "\10\uffff\1\11",
            "\1\7\17\uffff\1\13\13\uffff\1\13\5\uffff\1\13\6\uffff\1\12"+
            "\10\uffff\1\14"
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "101:1: constraint : ( CONSTRAINT name key | ( CONSTRAINT )? ( FULLTEXT )? key | ( CONSTRAINT name )? UNIQUE ( name )? ( '(' nameList ')' )? | CONSTRAINT ( name )? CHECK '(' name IS NOT NULL ')' );";
        }
    }
 

    public static final BitSet FOLLOW_drop_in_start51 = new BitSet(new long[]{0x0060000400412002L});
    public static final BitSet FOLLOW_create_in_start55 = new BitSet(new long[]{0x0060000400412002L});
    public static final BitSet FOLLOW_namespace_in_start59 = new BitSet(new long[]{0x0060000400412002L});
    public static final BitSet FOLLOW_insert_in_start63 = new BitSet(new long[]{0x0060000400412002L});
    public static final BitSet FOLLOW_update_in_start67 = new BitSet(new long[]{0x0060000400412002L});
    public static final BitSet FOLLOW_commit_in_start71 = new BitSet(new long[]{0x0060000400412002L});
    public static final BitSet FOLLOW_USE_in_namespace88 = new BitSet(new long[]{0x0000000040040010L});
    public static final BitSet FOLLOW_name_in_namespace90 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_namespace92 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMIT_in_commit104 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_commit106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop117 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_TABLE_in_drop119 = new BitSet(new long[]{0x00000000C0040010L});
    public static final BitSet FOLLOW_IF_in_drop123 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop125 = new BitSet(new long[]{0x0000000040040010L});
    public static final BitSet FOLLOW_nameList_in_drop130 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_drop132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop137 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DATABASE_in_drop139 = new BitSet(new long[]{0x00000000C0040010L});
    public static final BitSet FOLLOW_IF_in_drop143 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop145 = new BitSet(new long[]{0x0000000040040010L});
    public static final BitSet FOLLOW_nameList_in_drop150 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_drop152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create164 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_database_in_create166 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_create168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create174 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_schema_in_create176 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_create178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create184 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_table_in_create186 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_create188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create194 = new BitSet(new long[]{0x0008100208000000L});
    public static final BitSet FOLLOW_index_in_create196 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_create198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert210 = new BitSet(new long[]{0x0000001100000000L});
    public static final BitSet FOLLOW_IGNORE_in_insert212 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INTO_in_insert215 = new BitSet(new long[]{0x0000000040040010L});
    public static final BitSet FOLLOW_name_in_insert217 = new BitSet(new long[]{0x0280000000000000L});
    public static final BitSet FOLLOW_57_in_insert221 = new BitSet(new long[]{0x0000000040040010L});
    public static final BitSet FOLLOW_nameList_in_insert223 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_insert225 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_VALUES_in_insert230 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_insert232 = new BitSet(new long[]{0xDFFFFFFFFFFFFFF0L});
    public static final BitSet FOLLOW_58_in_insert240 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_insert242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_update253 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L});
    public static final BitSet FOLLOW_61_in_update261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATABASE_in_database272 = new BitSet(new long[]{0x00000000C0040010L});
    public static final BitSet FOLLOW_IF_in_database276 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_NOT_in_database278 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EXISTS_in_database280 = new BitSet(new long[]{0x0000000040040010L});
    public static final BitSet FOLLOW_name_in_database285 = new BitSet(new long[]{0x00000000400C0A52L});
    public static final BitSet FOLLOW_parameter_in_database287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCHEMA_in_schema299 = new BitSet(new long[]{0x00000000C0040010L});
    public static final BitSet FOLLOW_IF_in_schema303 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_NOT_in_schema305 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EXISTS_in_schema307 = new BitSet(new long[]{0x0000000040040010L});
    public static final BitSet FOLLOW_name_in_schema312 = new BitSet(new long[]{0x00000000400C0A52L});
    public static final BitSet FOLLOW_parameter_in_schema314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TABLE_in_table331 = new BitSet(new long[]{0x00000000C0040010L});
    public static final BitSet FOLLOW_IF_in_table335 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_NOT_in_table337 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EXISTS_in_table339 = new BitSet(new long[]{0x0000000040040010L});
    public static final BitSet FOLLOW_name_in_table344 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_table346 = new BitSet(new long[]{0x000810424C048010L});
    public static final BitSet FOLLOW_definition_in_table348 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_table350 = new BitSet(new long[]{0x00000000400C0A52L});
    public static final BitSet FOLLOW_parameter_in_table352 = new BitSet(new long[]{0x00000000400C0A52L});
    public static final BitSet FOLLOW_column_in_definition369 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_constraint_in_definition373 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_index_in_definition377 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_definition383 = new BitSet(new long[]{0x000810424C048010L});
    public static final BitSet FOLLOW_column_in_definition387 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_constraint_in_definition391 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_index_in_definition395 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_name_in_column411 = new BitSet(new long[]{0x0010000040840090L});
    public static final BitSet FOLLOW_type_in_column413 = new BitSet(new long[]{0x0008334004080042L});
    public static final BitSet FOLLOW_option_in_column415 = new BitSet(new long[]{0x0008334004080042L});
    public static final BitSet FOLLOW_CONSTRAINT_in_constraint430 = new BitSet(new long[]{0x0000000040040010L});
    public static final BitSet FOLLOW_name_in_constraint432 = new BitSet(new long[]{0x0008104004000000L});
    public static final BitSet FOLLOW_key_in_constraint434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRAINT_in_constraint439 = new BitSet(new long[]{0x000810400C000000L});
    public static final BitSet FOLLOW_FULLTEXT_in_constraint442 = new BitSet(new long[]{0x0008104004000000L});
    public static final BitSet FOLLOW_key_in_constraint445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRAINT_in_constraint452 = new BitSet(new long[]{0x0000000040040010L});
    public static final BitSet FOLLOW_name_in_constraint454 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_UNIQUE_in_constraint459 = new BitSet(new long[]{0x0200000040040012L});
    public static final BitSet FOLLOW_name_in_constraint461 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_constraint466 = new BitSet(new long[]{0x0000000040040010L});
    public static final BitSet FOLLOW_nameList_in_constraint468 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_constraint470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRAINT_in_constraint478 = new BitSet(new long[]{0x0000000040040410L});
    public static final BitSet FOLLOW_name_in_constraint480 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_CHECK_in_constraint483 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_constraint485 = new BitSet(new long[]{0x0000000040040010L});
    public static final BitSet FOLLOW_name_in_constraint487 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IS_in_constraint489 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_NOT_in_constraint491 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_NULL_in_constraint493 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_constraint495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDEX_in_index517 = new BitSet(new long[]{0x0200080040040010L});
    public static final BitSet FOLLOW_name_in_index519 = new BitSet(new long[]{0x0200080000000000L});
    public static final BitSet FOLLOW_ON_in_index524 = new BitSet(new long[]{0x0000000040040010L});
    public static final BitSet FOLLOW_name_in_index526 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_index531 = new BitSet(new long[]{0x0000000040040010L});
    public static final BitSet FOLLOW_nameList_in_index533 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_index535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FULLTEXT_in_index540 = new BitSet(new long[]{0x0000000040040010L});
    public static final BitSet FOLLOW_name_in_index542 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_index544 = new BitSet(new long[]{0x0000000040040010L});
    public static final BitSet FOLLOW_nameList_in_index546 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_index548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_in_key575 = new BitSet(new long[]{0x0200000040040012L});
    public static final BitSet FOLLOW_name_in_key577 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_key582 = new BitSet(new long[]{0x0000000040040010L});
    public static final BitSet FOLLOW_nameList_in_key584 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_key586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREIGN_in_key597 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_KEY_in_key599 = new BitSet(new long[]{0x0200200040040010L});
    public static final BitSet FOLLOW_name_in_key601 = new BitSet(new long[]{0x0200200000000000L});
    public static final BitSet FOLLOW_57_in_key606 = new BitSet(new long[]{0x0000000040040010L});
    public static final BitSet FOLLOW_nameList_in_key608 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_key610 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_reference_in_key615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_key_in_option629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_in_option634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_option639 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_NULL_in_option642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUTO_INC_in_option647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_option652 = new BitSet(new long[]{0x8000020840040010L});
    public static final BitSet FOLLOW_value_in_option656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_option660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_empty_in_option664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REFERENCES_in_reference677 = new BitSet(new long[]{0x0200080040040012L});
    public static final BitSet FOLLOW_name_in_reference679 = new BitSet(new long[]{0x0200080000000002L});
    public static final BitSet FOLLOW_57_in_reference684 = new BitSet(new long[]{0x0000000040040010L});
    public static final BitSet FOLLOW_nameList_in_reference686 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_reference688 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_referenceOptions_in_reference693 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ON_in_referenceOptions705 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DELETE_in_referenceOptions707 = new BitSet(new long[]{0x0001408000000100L});
    public static final BitSet FOLLOW_CASCADE_in_referenceOptions711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESTRICT_in_referenceOptions715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NO_in_referenceOptions719 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ACTION_in_referenceOptions721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_referenceOptions725 = new BitSet(new long[]{0x0000020000080000L});
    public static final BitSet FOLLOW_set_in_referenceOptions727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_referenceOptions742 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_UPDATE_in_referenceOptions744 = new BitSet(new long[]{0x0001000000000100L});
    public static final BitSet FOLLOW_CASCADE_in_referenceOptions748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_referenceOptions752 = new BitSet(new long[]{0x0000020000080000L});
    public static final BitSet FOLLOW_set_in_referenceOptions754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_parameter792 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_parameter794 = new BitSet(new long[]{0x0000000840040010L});
    public static final BitSet FOLLOW_value_in_parameter796 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_parameter798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_parameter806 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_CHARACTER_in_parameter811 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_SET_in_parameter813 = new BitSet(new long[]{0x4000000840040010L});
    public static final BitSet FOLLOW_62_in_parameter815 = new BitSet(new long[]{0x0000000840040010L});
    public static final BitSet FOLLOW_value_in_parameter818 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_parameter820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_parameter828 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COLLATE_in_parameter833 = new BitSet(new long[]{0x4000000840040010L});
    public static final BitSet FOLLOW_62_in_parameter835 = new BitSet(new long[]{0x0000000840040010L});
    public static final BitSet FOLLOW_value_in_parameter838 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_parameter840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUTO_INC_in_parameter846 = new BitSet(new long[]{0x4000000800000000L});
    public static final BitSet FOLLOW_62_in_parameter848 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_INT_in_parameter851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_type873 = new BitSet(new long[]{0x0210000000000082L});
    public static final BitSet FOLLOW_57_in_type877 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_INT_in_type879 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_59_in_type883 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_INT_in_type885 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_type890 = new BitSet(new long[]{0x0010000000000082L});
    public static final BitSet FOLLOW_ENUM_in_type909 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_type911 = new BitSet(new long[]{0x0000000040040010L});
    public static final BitSet FOLLOW_nameList_in_type913 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_type915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BINARY_in_type920 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_type924 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_INT_in_type926 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_type928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_nameList941 = new BitSet(new long[]{0x0A00000040240032L});
    public static final BitSet FOLLOW_57_in_nameList945 = new BitSet(new long[]{0x0000000840040010L});
    public static final BitSet FOLLOW_value_in_nameList947 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_nameList949 = new BitSet(new long[]{0x0800000040240032L});
    public static final BitSet FOLLOW_order_in_nameList954 = new BitSet(new long[]{0x0800000040040012L});
    public static final BitSet FOLLOW_59_in_nameList959 = new BitSet(new long[]{0x0000000040040010L});
    public static final BitSet FOLLOW_name_in_nameList962 = new BitSet(new long[]{0x0A00000040240032L});
    public static final BitSet FOLLOW_57_in_nameList966 = new BitSet(new long[]{0x0000000840040010L});
    public static final BitSet FOLLOW_value_in_nameList968 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_nameList970 = new BitSet(new long[]{0x0800000040240032L});
    public static final BitSet FOLLOW_order_in_nameList975 = new BitSet(new long[]{0x0800000040040012L});
    public static final BitSet FOLLOW_value_in_valueList992 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_empty_in_valueList996 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_valueList1001 = new BitSet(new long[]{0x8000000840040010L});
    public static final BitSet FOLLOW_value_in_valueList1005 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_empty_in_valueList1009 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_name_in_value1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_value1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_empty1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_name1052 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_name1056 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ID_in_name1058 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_DEF_in_name1066 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_name1070 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_DEF_in_name1072 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ACTION_in_name1080 = new BitSet(new long[]{0x0000000000000002L});

}