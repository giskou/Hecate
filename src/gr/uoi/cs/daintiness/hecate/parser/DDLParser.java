// $ANTLR 3.4 DDL.g 2013-02-13 17:44:48

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACTION", "ADD", "ALTER", "ASC", "AUTO_INC", "BINARY", "CASCADE", "CHARACTER", "CHECK", "COLLATE", "COMMENT", "COMMIT", "CONFLICT", "CONSTRAINT", "CREATE", "DATABASE", "DEF", "DEFAULT", "DELETE", "DESC", "DROP", "ENUM", "ESC_SEQ", "EXISTS", "FOREIGN", "FULLTEXT", "HASH", "HEX_DIGIT", "ID", "IF", "IGNORE", "INDEX", "INSERT", "INT", "INTO", "IS", "KEY", "NO", "NOT", "NULL", "OCTAL_ESC", "ON", "PRIMARY", "REFERENCES", "RESTRICT", "SCHEMA", "SET", "TABLE", "UNICODE_ESC", "UNIQUE", "UNSIGNED", "UPDATE", "USE", "VALUES", "WS", "'('", "')'", "','", "'.'", "';'", "'='", "'\\'\\''"
    };

    public static final int EOF=-1;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int ACTION=4;
    public static final int ADD=5;
    public static final int ALTER=6;
    public static final int ASC=7;
    public static final int AUTO_INC=8;
    public static final int BINARY=9;
    public static final int CASCADE=10;
    public static final int CHARACTER=11;
    public static final int CHECK=12;
    public static final int COLLATE=13;
    public static final int COMMENT=14;
    public static final int COMMIT=15;
    public static final int CONFLICT=16;
    public static final int CONSTRAINT=17;
    public static final int CREATE=18;
    public static final int DATABASE=19;
    public static final int DEF=20;
    public static final int DEFAULT=21;
    public static final int DELETE=22;
    public static final int DESC=23;
    public static final int DROP=24;
    public static final int ENUM=25;
    public static final int ESC_SEQ=26;
    public static final int EXISTS=27;
    public static final int FOREIGN=28;
    public static final int FULLTEXT=29;
    public static final int HASH=30;
    public static final int HEX_DIGIT=31;
    public static final int ID=32;
    public static final int IF=33;
    public static final int IGNORE=34;
    public static final int INDEX=35;
    public static final int INSERT=36;
    public static final int INT=37;
    public static final int INTO=38;
    public static final int IS=39;
    public static final int KEY=40;
    public static final int NO=41;
    public static final int NOT=42;
    public static final int NULL=43;
    public static final int OCTAL_ESC=44;
    public static final int ON=45;
    public static final int PRIMARY=46;
    public static final int REFERENCES=47;
    public static final int RESTRICT=48;
    public static final int SCHEMA=49;
    public static final int SET=50;
    public static final int TABLE=51;
    public static final int UNICODE_ESC=52;
    public static final int UNIQUE=53;
    public static final int UNSIGNED=54;
    public static final int UPDATE=55;
    public static final int USE=56;
    public static final int VALUES=57;
    public static final int WS=58;

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
    // DDL.g:33:1: start returns [Schema s] : ( drop | create | namespace | insert | update | alter | commit )+ ;
    public final Schema start() throws RecognitionException {
        Schema s = null;


        try {
            // DDL.g:34:2: ( ( drop | create | namespace | insert | update | alter | commit )+ )
            // DDL.g:34:4: ( drop | create | namespace | insert | update | alter | commit )+
            {
            // DDL.g:34:4: ( drop | create | namespace | insert | update | alter | commit )+
            int cnt1=0;
            loop1:
            do {
                int alt1=8;
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
                case ALTER:
                    {
                    alt1=6;
                    }
                    break;
                case COMMIT:
                    {
                    alt1=7;
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
            	    // DDL.g:34:52: alter
            	    {
            	    pushFollow(FOLLOW_alter_in_start71);
            	    alter();

            	    state._fsp--;


            	    }
            	    break;
            	case 7 :
            	    // DDL.g:34:60: commit
            	    {
            	    pushFollow(FOLLOW_commit_in_start75);
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
            match(input,USE,FOLLOW_USE_in_namespace92); 

            pushFollow(FOLLOW_name_in_namespace94);
            name();

            state._fsp--;


            match(input,63,FOLLOW_63_in_namespace96); 

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
            match(input,COMMIT,FOLLOW_COMMIT_in_commit108); 

            match(input,63,FOLLOW_63_in_commit110); 

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
                    match(input,DROP,FOLLOW_DROP_in_drop121); 

                    match(input,TABLE,FOLLOW_TABLE_in_drop123); 

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
                            match(input,IF,FOLLOW_IF_in_drop127); 

                            match(input,EXISTS,FOLLOW_EXISTS_in_drop129); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_nameList_in_drop134);
                    nameList();

                    state._fsp--;


                    match(input,63,FOLLOW_63_in_drop136); 

                    }
                    break;
                case 2 :
                    // DDL.g:50:4: DROP DATABASE ( IF EXISTS )? nameList ';'
                    {
                    match(input,DROP,FOLLOW_DROP_in_drop141); 

                    match(input,DATABASE,FOLLOW_DATABASE_in_drop143); 

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
                            match(input,IF,FOLLOW_IF_in_drop147); 

                            match(input,EXISTS,FOLLOW_EXISTS_in_drop149); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_nameList_in_drop154);
                    nameList();

                    state._fsp--;


                    match(input,63,FOLLOW_63_in_drop156); 

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
                    match(input,CREATE,FOLLOW_CREATE_in_create168); 

                    pushFollow(FOLLOW_database_in_create170);
                    database();

                    state._fsp--;


                    // DDL.g:54:20: ( ';' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==63) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // DDL.g:54:20: ';'
                            {
                            match(input,63,FOLLOW_63_in_create172); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // DDL.g:55:4: CREATE schema ( ';' )?
                    {
                    match(input,CREATE,FOLLOW_CREATE_in_create178); 

                    pushFollow(FOLLOW_schema_in_create180);
                    schema();

                    state._fsp--;


                    // DDL.g:55:18: ( ';' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==63) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // DDL.g:55:18: ';'
                            {
                            match(input,63,FOLLOW_63_in_create182); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // DDL.g:56:4: CREATE table ( ';' )?
                    {
                    match(input,CREATE,FOLLOW_CREATE_in_create188); 

                    pushFollow(FOLLOW_table_in_create190);
                    table();

                    state._fsp--;


                    // DDL.g:56:17: ( ';' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==63) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // DDL.g:56:17: ';'
                            {
                            match(input,63,FOLLOW_63_in_create192); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // DDL.g:57:4: CREATE index ( ';' )?
                    {
                    match(input,CREATE,FOLLOW_CREATE_in_create198); 

                    pushFollow(FOLLOW_index_in_create200);
                    index();

                    state._fsp--;


                    // DDL.g:57:17: ( ';' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==63) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // DDL.g:57:17: ';'
                            {
                            match(input,63,FOLLOW_63_in_create202); 

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
            match(input,INSERT,FOLLOW_INSERT_in_insert214); 

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
                    match(input,IGNORE,FOLLOW_IGNORE_in_insert216); 

                    }
                    break;

            }


            match(input,INTO,FOLLOW_INTO_in_insert219); 

            pushFollow(FOLLOW_name_in_insert221);
            name();

            state._fsp--;


            // DDL.g:61:29: ( '(' nameList ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==59) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // DDL.g:61:31: '(' nameList ')'
                    {
                    match(input,59,FOLLOW_59_in_insert225); 

                    pushFollow(FOLLOW_nameList_in_insert227);
                    nameList();

                    state._fsp--;


                    match(input,60,FOLLOW_60_in_insert229); 

                    }
                    break;

            }


            match(input,VALUES,FOLLOW_VALUES_in_insert234); 

            match(input,59,FOLLOW_59_in_insert236); 

            // DDL.g:61:62: (~ ';' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==60) ) {
                    int LA12_1 = input.LA(2);

                    if ( ((LA12_1 >= ACTION && LA12_1 <= 62)||(LA12_1 >= 64 && LA12_1 <= 65)) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0 >= ACTION && LA12_0 <= 59)||(LA12_0 >= 61 && LA12_0 <= 62)||(LA12_0 >= 64 && LA12_0 <= 65)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // DDL.g:
            	    {
            	    if ( (input.LA(1) >= ACTION && input.LA(1) <= 62)||(input.LA(1) >= 64 && input.LA(1) <= 65) ) {
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


            match(input,60,FOLLOW_60_in_insert244); 

            match(input,63,FOLLOW_63_in_insert246); 

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
            match(input,UPDATE,FOLLOW_UPDATE_in_update257); 

            // DDL.g:65:11: (~ ';' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0 >= ACTION && LA13_0 <= 62)||(LA13_0 >= 64 && LA13_0 <= 65)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // DDL.g:
            	    {
            	    if ( (input.LA(1) >= ACTION && input.LA(1) <= 62)||(input.LA(1) >= 64 && input.LA(1) <= 65) ) {
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


            match(input,63,FOLLOW_63_in_update265); 

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



    // $ANTLR start "alter"
    // DDL.g:68:1: alter : ALTER TABLE name ADD CONSTRAINT ( name )? key ( ON ( UPDATE | DELETE ) ( CASCADE | UPDATE ) ) ';' ;
    public final void alter() throws RecognitionException {
        try {
            // DDL.g:69:2: ( ALTER TABLE name ADD CONSTRAINT ( name )? key ( ON ( UPDATE | DELETE ) ( CASCADE | UPDATE ) ) ';' )
            // DDL.g:69:4: ALTER TABLE name ADD CONSTRAINT ( name )? key ( ON ( UPDATE | DELETE ) ( CASCADE | UPDATE ) ) ';'
            {
            match(input,ALTER,FOLLOW_ALTER_in_alter276); 

            match(input,TABLE,FOLLOW_TABLE_in_alter278); 

            pushFollow(FOLLOW_name_in_alter280);
            name();

            state._fsp--;


            match(input,ADD,FOLLOW_ADD_in_alter282); 

            match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_alter284); 

            // DDL.g:69:36: ( name )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ACTION||LA14_0==DEF||LA14_0==ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // DDL.g:69:36: name
                    {
                    pushFollow(FOLLOW_name_in_alter286);
                    name();

                    state._fsp--;


                    }
                    break;

            }


            pushFollow(FOLLOW_key_in_alter289);
            key();

            state._fsp--;


            // DDL.g:69:46: ( ON ( UPDATE | DELETE ) ( CASCADE | UPDATE ) )
            // DDL.g:69:48: ON ( UPDATE | DELETE ) ( CASCADE | UPDATE )
            {
            match(input,ON,FOLLOW_ON_in_alter293); 

            if ( input.LA(1)==DELETE||input.LA(1)==UPDATE ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            if ( input.LA(1)==CASCADE||input.LA(1)==UPDATE ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }


            match(input,63,FOLLOW_63_in_alter317); 

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
    // $ANTLR end "alter"



    // $ANTLR start "database"
    // DDL.g:73:1: database : DATABASE ( IF NOT EXISTS )? name ( parameter )? ;
    public final void database() throws RecognitionException {
        try {
            // DDL.g:74:2: ( DATABASE ( IF NOT EXISTS )? name ( parameter )? )
            // DDL.g:74:4: DATABASE ( IF NOT EXISTS )? name ( parameter )?
            {
            match(input,DATABASE,FOLLOW_DATABASE_in_database329); 

            // DDL.g:74:13: ( IF NOT EXISTS )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==IF) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // DDL.g:74:15: IF NOT EXISTS
                    {
                    match(input,IF,FOLLOW_IF_in_database333); 

                    match(input,NOT,FOLLOW_NOT_in_database335); 

                    match(input,EXISTS,FOLLOW_EXISTS_in_database337); 

                    }
                    break;

            }


            pushFollow(FOLLOW_name_in_database342);
            name();

            state._fsp--;


            // DDL.g:74:37: ( parameter )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ACTION||LA16_0==AUTO_INC||LA16_0==CHARACTER||LA16_0==COLLATE||(LA16_0 >= DEF && LA16_0 <= DEFAULT)||LA16_0==ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // DDL.g:74:37: parameter
                    {
                    pushFollow(FOLLOW_parameter_in_database344);
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
    // DDL.g:77:1: schema : SCHEMA ( IF NOT EXISTS )? name ( parameter )? ;
    public final void schema() throws RecognitionException {
        try {
            // DDL.g:78:2: ( SCHEMA ( IF NOT EXISTS )? name ( parameter )? )
            // DDL.g:78:4: SCHEMA ( IF NOT EXISTS )? name ( parameter )?
            {
            match(input,SCHEMA,FOLLOW_SCHEMA_in_schema356); 

            // DDL.g:78:11: ( IF NOT EXISTS )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==IF) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // DDL.g:78:13: IF NOT EXISTS
                    {
                    match(input,IF,FOLLOW_IF_in_schema360); 

                    match(input,NOT,FOLLOW_NOT_in_schema362); 

                    match(input,EXISTS,FOLLOW_EXISTS_in_schema364); 

                    }
                    break;

            }


            pushFollow(FOLLOW_name_in_schema369);
            name();

            state._fsp--;


            // DDL.g:78:35: ( parameter )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ACTION||LA18_0==AUTO_INC||LA18_0==CHARACTER||LA18_0==COLLATE||(LA18_0 >= DEF && LA18_0 <= DEFAULT)||LA18_0==ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // DDL.g:78:35: parameter
                    {
                    pushFollow(FOLLOW_parameter_in_schema371);
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
    // DDL.g:81:1: table : TABLE ( IF NOT EXISTS )? name '(' definition ')' ( parameter )* ;
    public final void table() throws RecognitionException {
        DDLParser.name_return name1 =null;



        		am.clear();
        	
        try {
            // DDL.g:85:2: ( TABLE ( IF NOT EXISTS )? name '(' definition ')' ( parameter )* )
            // DDL.g:85:4: TABLE ( IF NOT EXISTS )? name '(' definition ')' ( parameter )*
            {
            match(input,TABLE,FOLLOW_TABLE_in_table388); 

            // DDL.g:85:10: ( IF NOT EXISTS )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==IF) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // DDL.g:85:12: IF NOT EXISTS
                    {
                    match(input,IF,FOLLOW_IF_in_table392); 

                    match(input,NOT,FOLLOW_NOT_in_table394); 

                    match(input,EXISTS,FOLLOW_EXISTS_in_table396); 

                    }
                    break;

            }


            pushFollow(FOLLOW_name_in_table401);
            name1=name();

            state._fsp--;


            match(input,59,FOLLOW_59_in_table403); 

            pushFollow(FOLLOW_definition_in_table405);
            definition();

            state._fsp--;


            match(input,60,FOLLOW_60_in_table407); 

            // DDL.g:85:53: ( parameter )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==ACTION||LA20_0==AUTO_INC||LA20_0==CHARACTER||LA20_0==COLLATE||(LA20_0 >= DEF && LA20_0 <= DEFAULT)||LA20_0==ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // DDL.g:85:53: parameter
            	    {
            	    pushFollow(FOLLOW_parameter_in_table409);
            	    parameter();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // DDL.g:92:1: definition : ( column | constraint | index ) ( ',' ( column | constraint | index ) )* ;
    public final void definition() throws RecognitionException {
        try {
            // DDL.g:93:2: ( ( column | constraint | index ) ( ',' ( column | constraint | index ) )* )
            // DDL.g:93:4: ( column | constraint | index ) ( ',' ( column | constraint | index ) )*
            {
            // DDL.g:93:4: ( column | constraint | index )
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

                if ( (LA21_4==ACTION||LA21_4==DEF||LA21_4==ID||LA21_4==KEY||(LA21_4 >= 59 && LA21_4 <= 61)) ) {
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
                    // DDL.g:93:6: column
                    {
                    pushFollow(FOLLOW_column_in_definition426);
                    column();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // DDL.g:93:15: constraint
                    {
                    pushFollow(FOLLOW_constraint_in_definition430);
                    constraint();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // DDL.g:93:28: index
                    {
                    pushFollow(FOLLOW_index_in_definition434);
                    index();

                    state._fsp--;


                    }
                    break;

            }


            // DDL.g:93:36: ( ',' ( column | constraint | index ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==61) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // DDL.g:93:38: ',' ( column | constraint | index )
            	    {
            	    match(input,61,FOLLOW_61_in_definition440); 

            	    // DDL.g:93:42: ( column | constraint | index )
            	    int alt22=3;
            	    switch ( input.LA(1) ) {
            	    case ACTION:
            	    case DEF:
            	    case ID:
            	        {
            	        alt22=1;
            	        }
            	        break;
            	    case CONSTRAINT:
            	    case FOREIGN:
            	    case KEY:
            	        {
            	        alt22=2;
            	        }
            	        break;
            	    case FULLTEXT:
            	        {
            	        int LA22_3 = input.LA(2);

            	        if ( (LA22_3==FOREIGN||LA22_3==KEY||LA22_3==PRIMARY||LA22_3==UNIQUE) ) {
            	            alt22=2;
            	        }
            	        else if ( (LA22_3==ACTION||LA22_3==DEF||LA22_3==ID) ) {
            	            alt22=3;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 22, 3, input);

            	            throw nvae;

            	        }
            	        }
            	        break;
            	    case UNIQUE:
            	        {
            	        int LA22_4 = input.LA(2);

            	        if ( (LA22_4==ACTION||LA22_4==DEF||LA22_4==ID||LA22_4==KEY||(LA22_4 >= 59 && LA22_4 <= 61)) ) {
            	            alt22=2;
            	        }
            	        else if ( (LA22_4==INDEX) ) {
            	            alt22=3;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 22, 4, input);

            	            throw nvae;

            	        }
            	        }
            	        break;
            	    case PRIMARY:
            	        {
            	        int LA22_5 = input.LA(2);

            	        if ( (LA22_5==KEY) ) {
            	            alt22=2;
            	        }
            	        else if ( (LA22_5==INDEX) ) {
            	            alt22=3;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 22, 5, input);

            	            throw nvae;

            	        }
            	        }
            	        break;
            	    case INDEX:
            	        {
            	        alt22=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt22) {
            	        case 1 :
            	            // DDL.g:93:44: column
            	            {
            	            pushFollow(FOLLOW_column_in_definition444);
            	            column();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // DDL.g:93:53: constraint
            	            {
            	            pushFollow(FOLLOW_constraint_in_definition448);
            	            constraint();

            	            state._fsp--;


            	            }
            	            break;
            	        case 3 :
            	            // DDL.g:93:66: index
            	            {
            	            pushFollow(FOLLOW_index_in_definition452);
            	            index();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // DDL.g:96:1: column : name type ( option )* ;
    public final void column() throws RecognitionException {
        DDLParser.type_return type2 =null;

        DDLParser.name_return name3 =null;


        try {
            // DDL.g:97:2: ( name type ( option )* )
            // DDL.g:97:4: name type ( option )*
            {
            pushFollow(FOLLOW_name_in_column468);
            name3=name();

            state._fsp--;


            pushFollow(FOLLOW_type_in_column470);
            type2=type();

            state._fsp--;


            // DDL.g:97:14: ( option )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==AUTO_INC||LA24_0==DEFAULT||LA24_0==FOREIGN||LA24_0==KEY||(LA24_0 >= NOT && LA24_0 <= NULL)||(LA24_0 >= PRIMARY && LA24_0 <= REFERENCES)||LA24_0==UNIQUE) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // DDL.g:97:14: option
            	    {
            	    pushFollow(FOLLOW_option_in_column472);
            	    option();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // DDL.g:106:1: constraint : ( CONSTRAINT name key | ( CONSTRAINT )? ( FULLTEXT )? key | ( CONSTRAINT name )? UNIQUE ( name )? ( '(' nameList ')' )? | CONSTRAINT ( name )? CHECK '(' name IS NOT NULL ')' );
    public final void constraint() throws RecognitionException {
        try {
            // DDL.g:107:2: ( CONSTRAINT name key | ( CONSTRAINT )? ( FULLTEXT )? key | ( CONSTRAINT name )? UNIQUE ( name )? ( '(' nameList ')' )? | CONSTRAINT ( name )? CHECK '(' name IS NOT NULL ')' )
            int alt31=4;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // DDL.g:107:4: CONSTRAINT name key
                    {
                    match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_constraint487); 

                    pushFollow(FOLLOW_name_in_constraint489);
                    name();

                    state._fsp--;


                    pushFollow(FOLLOW_key_in_constraint491);
                    key();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // DDL.g:108:4: ( CONSTRAINT )? ( FULLTEXT )? key
                    {
                    // DDL.g:108:4: ( CONSTRAINT )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==CONSTRAINT) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // DDL.g:108:4: CONSTRAINT
                            {
                            match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_constraint496); 

                            }
                            break;

                    }


                    // DDL.g:108:16: ( FULLTEXT )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==FULLTEXT) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // DDL.g:108:16: FULLTEXT
                            {
                            match(input,FULLTEXT,FOLLOW_FULLTEXT_in_constraint499); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_key_in_constraint502);
                    key();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // DDL.g:109:4: ( CONSTRAINT name )? UNIQUE ( name )? ( '(' nameList ')' )?
                    {
                    // DDL.g:109:4: ( CONSTRAINT name )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==CONSTRAINT) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // DDL.g:109:6: CONSTRAINT name
                            {
                            match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_constraint509); 

                            pushFollow(FOLLOW_name_in_constraint511);
                            name();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input,UNIQUE,FOLLOW_UNIQUE_in_constraint516); 

                    // DDL.g:109:32: ( name )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==ACTION||LA28_0==DEF||LA28_0==ID) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // DDL.g:109:32: name
                            {
                            pushFollow(FOLLOW_name_in_constraint518);
                            name();

                            state._fsp--;


                            }
                            break;

                    }


                    // DDL.g:109:38: ( '(' nameList ')' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==59) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // DDL.g:109:40: '(' nameList ')'
                            {
                            match(input,59,FOLLOW_59_in_constraint523); 

                            pushFollow(FOLLOW_nameList_in_constraint525);
                            nameList();

                            state._fsp--;


                            match(input,60,FOLLOW_60_in_constraint527); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // DDL.g:110:4: CONSTRAINT ( name )? CHECK '(' name IS NOT NULL ')'
                    {
                    match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_constraint535); 

                    // DDL.g:110:15: ( name )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==ACTION||LA30_0==DEF||LA30_0==ID) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // DDL.g:110:15: name
                            {
                            pushFollow(FOLLOW_name_in_constraint537);
                            name();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input,CHECK,FOLLOW_CHECK_in_constraint540); 

                    match(input,59,FOLLOW_59_in_constraint542); 

                    pushFollow(FOLLOW_name_in_constraint544);
                    name();

                    state._fsp--;


                    match(input,IS,FOLLOW_IS_in_constraint546); 

                    match(input,NOT,FOLLOW_NOT_in_constraint548); 

                    match(input,NULL,FOLLOW_NULL_in_constraint550); 

                    match(input,60,FOLLOW_60_in_constraint552); 

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
    // DDL.g:113:1: index : ( ( UNIQUE | PRIMARY )? INDEX ( name )? ( ON name )? '(' nameList ')' | FULLTEXT name '(' nameList ')' );
    public final void index() throws RecognitionException {
        try {
            // DDL.g:114:2: ( ( UNIQUE | PRIMARY )? INDEX ( name )? ( ON name )? '(' nameList ')' | FULLTEXT name '(' nameList ')' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==INDEX||LA35_0==PRIMARY||LA35_0==UNIQUE) ) {
                alt35=1;
            }
            else if ( (LA35_0==FULLTEXT) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }
            switch (alt35) {
                case 1 :
                    // DDL.g:114:4: ( UNIQUE | PRIMARY )? INDEX ( name )? ( ON name )? '(' nameList ')'
                    {
                    // DDL.g:114:4: ( UNIQUE | PRIMARY )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==PRIMARY||LA32_0==UNIQUE) ) {
                        alt32=1;
                    }
                    switch (alt32) {
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


                    match(input,INDEX,FOLLOW_INDEX_in_index574); 

                    // DDL.g:114:32: ( name )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==ACTION||LA33_0==DEF||LA33_0==ID) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // DDL.g:114:32: name
                            {
                            pushFollow(FOLLOW_name_in_index576);
                            name();

                            state._fsp--;


                            }
                            break;

                    }


                    // DDL.g:114:38: ( ON name )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==ON) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // DDL.g:114:40: ON name
                            {
                            match(input,ON,FOLLOW_ON_in_index581); 

                            pushFollow(FOLLOW_name_in_index583);
                            name();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input,59,FOLLOW_59_in_index588); 

                    pushFollow(FOLLOW_nameList_in_index590);
                    nameList();

                    state._fsp--;


                    match(input,60,FOLLOW_60_in_index592); 

                    }
                    break;
                case 2 :
                    // DDL.g:115:4: FULLTEXT name '(' nameList ')'
                    {
                    match(input,FULLTEXT,FOLLOW_FULLTEXT_in_index597); 

                    pushFollow(FOLLOW_name_in_index599);
                    name();

                    state._fsp--;


                    match(input,59,FOLLOW_59_in_index601); 

                    pushFollow(FOLLOW_nameList_in_index603);
                    nameList();

                    state._fsp--;


                    match(input,60,FOLLOW_60_in_index605); 

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
    // DDL.g:118:1: key : ( ( UNIQUE | PRIMARY )? KEY ( name )? ( '(' nameList ')' )? | FOREIGN KEY ( name )? ( '(' nameList ')' )? reference );
    public final void key() throws RecognitionException {
        DDLParser.nameList_return nameList4 =null;



        		km.clear();
        	
        try {
            // DDL.g:122:2: ( ( UNIQUE | PRIMARY )? KEY ( name )? ( '(' nameList ')' )? | FOREIGN KEY ( name )? ( '(' nameList ')' )? reference )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==KEY||LA41_0==PRIMARY||LA41_0==UNIQUE) ) {
                alt41=1;
            }
            else if ( (LA41_0==FOREIGN) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;

            }
            switch (alt41) {
                case 1 :
                    // DDL.g:122:4: ( UNIQUE | PRIMARY )? KEY ( name )? ( '(' nameList ')' )?
                    {
                    // DDL.g:122:4: ( UNIQUE | PRIMARY )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==PRIMARY||LA36_0==UNIQUE) ) {
                        alt36=1;
                    }
                    switch (alt36) {
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


                    match(input,KEY,FOLLOW_KEY_in_key632); 

                    // DDL.g:122:30: ( name )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==ACTION||LA37_0==DEF||LA37_0==ID) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // DDL.g:122:30: name
                            {
                            pushFollow(FOLLOW_name_in_key634);
                            name();

                            state._fsp--;


                            }
                            break;

                    }


                    // DDL.g:122:36: ( '(' nameList ')' )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==59) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // DDL.g:122:38: '(' nameList ')'
                            {
                            match(input,59,FOLLOW_59_in_key639); 

                            pushFollow(FOLLOW_nameList_in_key641);
                            nameList4=nameList();

                            state._fsp--;


                            match(input,60,FOLLOW_60_in_key643); 

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
                    // DDL.g:135:4: FOREIGN KEY ( name )? ( '(' nameList ')' )? reference
                    {
                    match(input,FOREIGN,FOLLOW_FOREIGN_in_key654); 

                    match(input,KEY,FOLLOW_KEY_in_key656); 

                    // DDL.g:135:16: ( name )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==ACTION||LA39_0==DEF||LA39_0==ID) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // DDL.g:135:16: name
                            {
                            pushFollow(FOLLOW_name_in_key658);
                            name();

                            state._fsp--;


                            }
                            break;

                    }


                    // DDL.g:135:22: ( '(' nameList ')' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==59) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // DDL.g:135:24: '(' nameList ')'
                            {
                            match(input,59,FOLLOW_59_in_key663); 

                            pushFollow(FOLLOW_nameList_in_key665);
                            nameList();

                            state._fsp--;


                            match(input,60,FOLLOW_60_in_key667); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_reference_in_key672);
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
    // DDL.g:141:1: option : ( key | reference | ( NOT )? NULL | AUTO_INC | DEFAULT ( value | NULL | empty ) );
    public final void option() throws RecognitionException {
        try {
            // DDL.g:142:2: ( key | reference | ( NOT )? NULL | AUTO_INC | DEFAULT ( value | NULL | empty ) )
            int alt44=5;
            switch ( input.LA(1) ) {
            case FOREIGN:
            case KEY:
            case PRIMARY:
            case UNIQUE:
                {
                alt44=1;
                }
                break;
            case REFERENCES:
                {
                alt44=2;
                }
                break;
            case NOT:
            case NULL:
                {
                alt44=3;
                }
                break;
            case AUTO_INC:
                {
                alt44=4;
                }
                break;
            case DEFAULT:
                {
                alt44=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;

            }

            switch (alt44) {
                case 1 :
                    // DDL.g:142:4: key
                    {
                    pushFollow(FOLLOW_key_in_option686);
                    key();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // DDL.g:143:4: reference
                    {
                    pushFollow(FOLLOW_reference_in_option691);
                    reference();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // DDL.g:144:4: ( NOT )? NULL
                    {
                    // DDL.g:144:4: ( NOT )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==NOT) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // DDL.g:144:4: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_option696); 

                            }
                            break;

                    }


                    match(input,NULL,FOLLOW_NULL_in_option699); 

                    }
                    break;
                case 4 :
                    // DDL.g:145:4: AUTO_INC
                    {
                    match(input,AUTO_INC,FOLLOW_AUTO_INC_in_option704); 

                    }
                    break;
                case 5 :
                    // DDL.g:146:4: DEFAULT ( value | NULL | empty )
                    {
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_option709); 

                    // DDL.g:146:12: ( value | NULL | empty )
                    int alt43=3;
                    switch ( input.LA(1) ) {
                    case ACTION:
                    case DEF:
                    case ID:
                    case INT:
                        {
                        alt43=1;
                        }
                        break;
                    case NULL:
                        {
                        alt43=2;
                        }
                        break;
                    case 65:
                        {
                        alt43=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;

                    }

                    switch (alt43) {
                        case 1 :
                            // DDL.g:146:14: value
                            {
                            pushFollow(FOLLOW_value_in_option713);
                            value();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // DDL.g:146:22: NULL
                            {
                            match(input,NULL,FOLLOW_NULL_in_option717); 

                            }
                            break;
                        case 3 :
                            // DDL.g:146:29: empty
                            {
                            pushFollow(FOLLOW_empty_in_option721);
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
    // DDL.g:149:1: reference : REFERENCES ( name )? ( '(' nameList ')' )? ( referenceOptions )* ;
    public final void reference() throws RecognitionException {
        try {
            // DDL.g:150:2: ( REFERENCES ( name )? ( '(' nameList ')' )? ( referenceOptions )* )
            // DDL.g:150:4: REFERENCES ( name )? ( '(' nameList ')' )? ( referenceOptions )*
            {
            match(input,REFERENCES,FOLLOW_REFERENCES_in_reference734); 

            // DDL.g:150:15: ( name )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==ACTION||LA45_0==DEF||LA45_0==ID) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // DDL.g:150:15: name
                    {
                    pushFollow(FOLLOW_name_in_reference736);
                    name();

                    state._fsp--;


                    }
                    break;

            }


            // DDL.g:150:21: ( '(' nameList ')' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==59) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // DDL.g:150:23: '(' nameList ')'
                    {
                    match(input,59,FOLLOW_59_in_reference741); 

                    pushFollow(FOLLOW_nameList_in_reference743);
                    nameList();

                    state._fsp--;


                    match(input,60,FOLLOW_60_in_reference745); 

                    }
                    break;

            }


            // DDL.g:150:43: ( referenceOptions )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==ON) ) {
                    int LA47_1 = input.LA(2);

                    if ( (LA47_1==DELETE) ) {
                        int LA47_3 = input.LA(3);

                        if ( (LA47_3==CASCADE) ) {
                            int LA47_5 = input.LA(4);

                            if ( (LA47_5==AUTO_INC||LA47_5==DEFAULT||LA47_5==FOREIGN||LA47_5==KEY||(LA47_5 >= NOT && LA47_5 <= NULL)||(LA47_5 >= ON && LA47_5 <= REFERENCES)||LA47_5==UNIQUE||(LA47_5 >= 60 && LA47_5 <= 61)) ) {
                                alt47=1;
                            }


                        }
                        else if ( (LA47_3==NO||LA47_3==RESTRICT||LA47_3==SET) ) {
                            alt47=1;
                        }


                    }
                    else if ( (LA47_1==UPDATE) ) {
                        int LA47_4 = input.LA(3);

                        if ( (LA47_4==CASCADE) ) {
                            int LA47_7 = input.LA(4);

                            if ( (LA47_7==AUTO_INC||LA47_7==DEFAULT||LA47_7==FOREIGN||LA47_7==KEY||(LA47_7 >= NOT && LA47_7 <= NULL)||(LA47_7 >= ON && LA47_7 <= REFERENCES)||LA47_7==UNIQUE||(LA47_7 >= 60 && LA47_7 <= 61)) ) {
                                alt47=1;
                            }


                        }
                        else if ( (LA47_4==SET) ) {
                            alt47=1;
                        }


                    }


                }


                switch (alt47) {
            	case 1 :
            	    // DDL.g:150:43: referenceOptions
            	    {
            	    pushFollow(FOLLOW_referenceOptions_in_reference750);
            	    referenceOptions();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
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
    // DDL.g:153:1: referenceOptions : ( ON DELETE ( CASCADE | RESTRICT | NO ACTION | SET ( DEFAULT | NULL ) ) | ON UPDATE ( CASCADE | SET ( DEFAULT | NULL ) ) );
    public final void referenceOptions() throws RecognitionException {
        try {
            // DDL.g:154:2: ( ON DELETE ( CASCADE | RESTRICT | NO ACTION | SET ( DEFAULT | NULL ) ) | ON UPDATE ( CASCADE | SET ( DEFAULT | NULL ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==ON) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==DELETE) ) {
                    alt50=1;
                }
                else if ( (LA50_1==UPDATE) ) {
                    alt50=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;

            }
            switch (alt50) {
                case 1 :
                    // DDL.g:154:4: ON DELETE ( CASCADE | RESTRICT | NO ACTION | SET ( DEFAULT | NULL ) )
                    {
                    match(input,ON,FOLLOW_ON_in_referenceOptions762); 

                    match(input,DELETE,FOLLOW_DELETE_in_referenceOptions764); 

                    // DDL.g:154:14: ( CASCADE | RESTRICT | NO ACTION | SET ( DEFAULT | NULL ) )
                    int alt48=4;
                    switch ( input.LA(1) ) {
                    case CASCADE:
                        {
                        alt48=1;
                        }
                        break;
                    case RESTRICT:
                        {
                        alt48=2;
                        }
                        break;
                    case NO:
                        {
                        alt48=3;
                        }
                        break;
                    case SET:
                        {
                        alt48=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        throw nvae;

                    }

                    switch (alt48) {
                        case 1 :
                            // DDL.g:154:16: CASCADE
                            {
                            match(input,CASCADE,FOLLOW_CASCADE_in_referenceOptions768); 

                            }
                            break;
                        case 2 :
                            // DDL.g:154:26: RESTRICT
                            {
                            match(input,RESTRICT,FOLLOW_RESTRICT_in_referenceOptions772); 

                            }
                            break;
                        case 3 :
                            // DDL.g:154:37: NO ACTION
                            {
                            match(input,NO,FOLLOW_NO_in_referenceOptions776); 

                            match(input,ACTION,FOLLOW_ACTION_in_referenceOptions778); 

                            }
                            break;
                        case 4 :
                            // DDL.g:154:49: SET ( DEFAULT | NULL )
                            {
                            match(input,SET,FOLLOW_SET_in_referenceOptions782); 

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
                    // DDL.g:155:4: ON UPDATE ( CASCADE | SET ( DEFAULT | NULL ) )
                    {
                    match(input,ON,FOLLOW_ON_in_referenceOptions799); 

                    match(input,UPDATE,FOLLOW_UPDATE_in_referenceOptions801); 

                    // DDL.g:155:14: ( CASCADE | SET ( DEFAULT | NULL ) )
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==CASCADE) ) {
                        alt49=1;
                    }
                    else if ( (LA49_0==SET) ) {
                        alt49=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 0, input);

                        throw nvae;

                    }
                    switch (alt49) {
                        case 1 :
                            // DDL.g:155:16: CASCADE
                            {
                            match(input,CASCADE,FOLLOW_CASCADE_in_referenceOptions805); 

                            }
                            break;
                        case 2 :
                            // DDL.g:155:26: SET ( DEFAULT | NULL )
                            {
                            match(input,SET,FOLLOW_SET_in_referenceOptions809); 

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
    // DDL.g:158:1: order : ( ASC | DESC );
    public final void order() throws RecognitionException {
        try {
            // DDL.g:159:2: ( ASC | DESC )
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
    // DDL.g:163:1: parameter : ( name '=' value ( ',' )? | ( DEFAULT )? CHARACTER SET ( '=' )? value ( ',' )? | ( DEFAULT )? COLLATE ( '=' )? value ( ',' )? | AUTO_INC ( '=' )? INT );
    public final void parameter() throws RecognitionException {
        try {
            // DDL.g:164:2: ( name '=' value ( ',' )? | ( DEFAULT )? CHARACTER SET ( '=' )? value ( ',' )? | ( DEFAULT )? COLLATE ( '=' )? value ( ',' )? | AUTO_INC ( '=' )? INT )
            int alt59=4;
            switch ( input.LA(1) ) {
            case ACTION:
            case DEF:
            case ID:
                {
                alt59=1;
                }
                break;
            case DEFAULT:
                {
                int LA59_2 = input.LA(2);

                if ( (LA59_2==CHARACTER) ) {
                    alt59=2;
                }
                else if ( (LA59_2==COLLATE) ) {
                    alt59=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 2, input);

                    throw nvae;

                }
                }
                break;
            case CHARACTER:
                {
                alt59=2;
                }
                break;
            case COLLATE:
                {
                alt59=3;
                }
                break;
            case AUTO_INC:
                {
                alt59=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;

            }

            switch (alt59) {
                case 1 :
                    // DDL.g:164:4: name '=' value ( ',' )?
                    {
                    pushFollow(FOLLOW_name_in_parameter849);
                    name();

                    state._fsp--;


                    match(input,64,FOLLOW_64_in_parameter851); 

                    pushFollow(FOLLOW_value_in_parameter853);
                    value();

                    state._fsp--;


                    // DDL.g:164:19: ( ',' )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==61) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // DDL.g:164:19: ','
                            {
                            match(input,61,FOLLOW_61_in_parameter855); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // DDL.g:165:4: ( DEFAULT )? CHARACTER SET ( '=' )? value ( ',' )?
                    {
                    // DDL.g:165:4: ( DEFAULT )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==DEFAULT) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // DDL.g:165:6: DEFAULT
                            {
                            match(input,DEFAULT,FOLLOW_DEFAULT_in_parameter863); 

                            }
                            break;

                    }


                    match(input,CHARACTER,FOLLOW_CHARACTER_in_parameter868); 

                    match(input,SET,FOLLOW_SET_in_parameter870); 

                    // DDL.g:165:31: ( '=' )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==64) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // DDL.g:165:31: '='
                            {
                            match(input,64,FOLLOW_64_in_parameter872); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_value_in_parameter875);
                    value();

                    state._fsp--;


                    // DDL.g:165:42: ( ',' )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==61) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // DDL.g:165:42: ','
                            {
                            match(input,61,FOLLOW_61_in_parameter877); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // DDL.g:166:4: ( DEFAULT )? COLLATE ( '=' )? value ( ',' )?
                    {
                    // DDL.g:166:4: ( DEFAULT )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==DEFAULT) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // DDL.g:166:6: DEFAULT
                            {
                            match(input,DEFAULT,FOLLOW_DEFAULT_in_parameter885); 

                            }
                            break;

                    }


                    match(input,COLLATE,FOLLOW_COLLATE_in_parameter890); 

                    // DDL.g:166:25: ( '=' )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==64) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // DDL.g:166:25: '='
                            {
                            match(input,64,FOLLOW_64_in_parameter892); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_value_in_parameter895);
                    value();

                    state._fsp--;


                    // DDL.g:166:36: ( ',' )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==61) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // DDL.g:166:36: ','
                            {
                            match(input,61,FOLLOW_61_in_parameter897); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // DDL.g:167:4: AUTO_INC ( '=' )? INT
                    {
                    match(input,AUTO_INC,FOLLOW_AUTO_INC_in_parameter903); 

                    // DDL.g:167:13: ( '=' )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==64) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // DDL.g:167:13: '='
                            {
                            match(input,64,FOLLOW_64_in_parameter905); 

                            }
                            break;

                    }


                    match(input,INT,FOLLOW_INT_in_parameter908); 

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
    // DDL.g:170:1: type : ( ( UNSIGNED | BINARY )? name ( '(' INT ( ',' INT )? ')' )? ( UNSIGNED | BINARY )? | ENUM '(' nameList ')' | BINARY ( '(' INT ')' ) );
    public final DDLParser.type_return type() throws RecognitionException {
        DDLParser.type_return retval = new DDLParser.type_return();
        retval.start = input.LT(1);


        try {
            // DDL.g:171:2: ( ( UNSIGNED | BINARY )? name ( '(' INT ( ',' INT )? ')' )? ( UNSIGNED | BINARY )? | ENUM '(' nameList ')' | BINARY ( '(' INT ')' ) )
            int alt64=3;
            switch ( input.LA(1) ) {
            case BINARY:
                {
                int LA64_1 = input.LA(2);

                if ( (LA64_1==ACTION||LA64_1==DEF||LA64_1==ID) ) {
                    alt64=1;
                }
                else if ( (LA64_1==59) ) {
                    alt64=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 1, input);

                    throw nvae;

                }
                }
                break;
            case ACTION:
            case DEF:
            case ID:
            case UNSIGNED:
                {
                alt64=1;
                }
                break;
            case ENUM:
                {
                alt64=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;

            }

            switch (alt64) {
                case 1 :
                    // DDL.g:171:4: ( UNSIGNED | BINARY )? name ( '(' INT ( ',' INT )? ')' )? ( UNSIGNED | BINARY )?
                    {
                    // DDL.g:171:4: ( UNSIGNED | BINARY )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==BINARY||LA60_0==UNSIGNED) ) {
                        alt60=1;
                    }
                    switch (alt60) {
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


                    pushFollow(FOLLOW_name_in_type930);
                    name();

                    state._fsp--;


                    // DDL.g:171:32: ( '(' INT ( ',' INT )? ')' )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==59) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // DDL.g:171:34: '(' INT ( ',' INT )? ')'
                            {
                            match(input,59,FOLLOW_59_in_type934); 

                            match(input,INT,FOLLOW_INT_in_type936); 

                            // DDL.g:171:42: ( ',' INT )?
                            int alt61=2;
                            int LA61_0 = input.LA(1);

                            if ( (LA61_0==61) ) {
                                alt61=1;
                            }
                            switch (alt61) {
                                case 1 :
                                    // DDL.g:171:44: ',' INT
                                    {
                                    match(input,61,FOLLOW_61_in_type940); 

                                    match(input,INT,FOLLOW_INT_in_type942); 

                                    }
                                    break;

                            }


                            match(input,60,FOLLOW_60_in_type947); 

                            }
                            break;

                    }


                    // DDL.g:171:62: ( UNSIGNED | BINARY )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==BINARY||LA63_0==UNSIGNED) ) {
                        alt63=1;
                    }
                    switch (alt63) {
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
                    // DDL.g:172:4: ENUM '(' nameList ')'
                    {
                    match(input,ENUM,FOLLOW_ENUM_in_type966); 

                    match(input,59,FOLLOW_59_in_type968); 

                    pushFollow(FOLLOW_nameList_in_type970);
                    nameList();

                    state._fsp--;


                    match(input,60,FOLLOW_60_in_type972); 

                    }
                    break;
                case 3 :
                    // DDL.g:173:4: BINARY ( '(' INT ')' )
                    {
                    match(input,BINARY,FOLLOW_BINARY_in_type977); 

                    // DDL.g:173:11: ( '(' INT ')' )
                    // DDL.g:173:13: '(' INT ')'
                    {
                    match(input,59,FOLLOW_59_in_type981); 

                    match(input,INT,FOLLOW_INT_in_type983); 

                    match(input,60,FOLLOW_60_in_type985); 

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
    // DDL.g:176:1: nameList : name ( '(' value ')' )? ( order )? ( ( ',' )? name ( '(' value ')' )? ( order )? )* ;
    public final DDLParser.nameList_return nameList() throws RecognitionException {
        DDLParser.nameList_return retval = new DDLParser.nameList_return();
        retval.start = input.LT(1);


        try {
            // DDL.g:177:2: ( name ( '(' value ')' )? ( order )? ( ( ',' )? name ( '(' value ')' )? ( order )? )* )
            // DDL.g:177:4: name ( '(' value ')' )? ( order )? ( ( ',' )? name ( '(' value ')' )? ( order )? )*
            {
            pushFollow(FOLLOW_name_in_nameList998);
            name();

            state._fsp--;


            // DDL.g:177:9: ( '(' value ')' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==59) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // DDL.g:177:11: '(' value ')'
                    {
                    match(input,59,FOLLOW_59_in_nameList1002); 

                    pushFollow(FOLLOW_value_in_nameList1004);
                    value();

                    state._fsp--;


                    match(input,60,FOLLOW_60_in_nameList1006); 

                    }
                    break;

            }


            // DDL.g:177:28: ( order )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==ASC||LA66_0==DESC) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // DDL.g:177:28: order
                    {
                    pushFollow(FOLLOW_order_in_nameList1011);
                    order();

                    state._fsp--;


                    }
                    break;

            }


            // DDL.g:177:35: ( ( ',' )? name ( '(' value ')' )? ( order )? )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==ACTION||LA70_0==DEF||LA70_0==ID||LA70_0==61) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // DDL.g:177:37: ( ',' )? name ( '(' value ')' )? ( order )?
            	    {
            	    // DDL.g:177:37: ( ',' )?
            	    int alt67=2;
            	    int LA67_0 = input.LA(1);

            	    if ( (LA67_0==61) ) {
            	        alt67=1;
            	    }
            	    switch (alt67) {
            	        case 1 :
            	            // DDL.g:177:37: ','
            	            {
            	            match(input,61,FOLLOW_61_in_nameList1016); 

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_name_in_nameList1019);
            	    name();

            	    state._fsp--;


            	    // DDL.g:177:47: ( '(' value ')' )?
            	    int alt68=2;
            	    int LA68_0 = input.LA(1);

            	    if ( (LA68_0==59) ) {
            	        alt68=1;
            	    }
            	    switch (alt68) {
            	        case 1 :
            	            // DDL.g:177:49: '(' value ')'
            	            {
            	            match(input,59,FOLLOW_59_in_nameList1023); 

            	            pushFollow(FOLLOW_value_in_nameList1025);
            	            value();

            	            state._fsp--;


            	            match(input,60,FOLLOW_60_in_nameList1027); 

            	            }
            	            break;

            	    }


            	    // DDL.g:177:66: ( order )?
            	    int alt69=2;
            	    int LA69_0 = input.LA(1);

            	    if ( (LA69_0==ASC||LA69_0==DESC) ) {
            	        alt69=1;
            	    }
            	    switch (alt69) {
            	        case 1 :
            	            // DDL.g:177:66: order
            	            {
            	            pushFollow(FOLLOW_order_in_nameList1032);
            	            order();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop70;
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
    // DDL.g:180:1: valueList : ( value | empty ) ( ',' ( value | empty ) )* ;
    public final void valueList() throws RecognitionException {
        try {
            // DDL.g:181:2: ( ( value | empty ) ( ',' ( value | empty ) )* )
            // DDL.g:181:4: ( value | empty ) ( ',' ( value | empty ) )*
            {
            // DDL.g:181:4: ( value | empty )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==ACTION||LA71_0==DEF||LA71_0==ID||LA71_0==INT) ) {
                alt71=1;
            }
            else if ( (LA71_0==65) ) {
                alt71=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;

            }
            switch (alt71) {
                case 1 :
                    // DDL.g:181:6: value
                    {
                    pushFollow(FOLLOW_value_in_valueList1049);
                    value();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // DDL.g:181:14: empty
                    {
                    pushFollow(FOLLOW_empty_in_valueList1053);
                    empty();

                    state._fsp--;


                    }
                    break;

            }


            // DDL.g:181:22: ( ',' ( value | empty ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==61) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // DDL.g:181:23: ',' ( value | empty )
            	    {
            	    match(input,61,FOLLOW_61_in_valueList1058); 

            	    // DDL.g:181:27: ( value | empty )
            	    int alt72=2;
            	    int LA72_0 = input.LA(1);

            	    if ( (LA72_0==ACTION||LA72_0==DEF||LA72_0==ID||LA72_0==INT) ) {
            	        alt72=1;
            	    }
            	    else if ( (LA72_0==65) ) {
            	        alt72=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 72, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt72) {
            	        case 1 :
            	            // DDL.g:181:29: value
            	            {
            	            pushFollow(FOLLOW_value_in_valueList1062);
            	            value();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // DDL.g:181:37: empty
            	            {
            	            pushFollow(FOLLOW_empty_in_valueList1066);
            	            empty();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
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
    // DDL.g:184:1: value : ( name | INT );
    public final void value() throws RecognitionException {
        try {
            // DDL.g:185:2: ( name | INT )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==ACTION||LA74_0==DEF||LA74_0==ID) ) {
                alt74=1;
            }
            else if ( (LA74_0==INT) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;

            }
            switch (alt74) {
                case 1 :
                    // DDL.g:185:4: name
                    {
                    pushFollow(FOLLOW_name_in_value1081);
                    name();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // DDL.g:186:4: INT
                    {
                    match(input,INT,FOLLOW_INT_in_value1086); 

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
    // DDL.g:189:2: empty : '\\'\\'' ;
    public final void empty() throws RecognitionException {
        try {
            // DDL.g:190:2: ( '\\'\\'' )
            // DDL.g:190:4: '\\'\\''
            {
            match(input,65,FOLLOW_65_in_empty1098); 

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
    // DDL.g:193:1: name : ( ID ( '.' ID )* | DEF ( '.' DEF )* | ACTION );
    public final DDLParser.name_return name() throws RecognitionException {
        DDLParser.name_return retval = new DDLParser.name_return();
        retval.start = input.LT(1);


        try {
            // DDL.g:194:2: ( ID ( '.' ID )* | DEF ( '.' DEF )* | ACTION )
            int alt77=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt77=1;
                }
                break;
            case DEF:
                {
                alt77=2;
                }
                break;
            case ACTION:
                {
                alt77=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;

            }

            switch (alt77) {
                case 1 :
                    // DDL.g:194:4: ID ( '.' ID )*
                    {
                    match(input,ID,FOLLOW_ID_in_name1109); 

                    // DDL.g:194:7: ( '.' ID )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==62) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // DDL.g:194:9: '.' ID
                    	    {
                    	    match(input,62,FOLLOW_62_in_name1113); 

                    	    match(input,ID,FOLLOW_ID_in_name1115); 

                    	    }
                    	    break;

                    	default :
                    	    break loop75;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // DDL.g:195:4: DEF ( '.' DEF )*
                    {
                    match(input,DEF,FOLLOW_DEF_in_name1123); 

                    // DDL.g:195:8: ( '.' DEF )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==62) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // DDL.g:195:10: '.' DEF
                    	    {
                    	    match(input,62,FOLLOW_62_in_name1127); 

                    	    match(input,DEF,FOLLOW_DEF_in_name1129); 

                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // DDL.g:196:4: ACTION
                    {
                    match(input,ACTION,FOLLOW_ACTION_in_name1137); 

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


    protected DFA31 dfa31 = new DFA31(this);
    static final String DFA31_eotS =
        "\17\uffff";
    static final String DFA31_eofS =
        "\17\uffff";
    static final String DFA31_minS =
        "\1\21\1\4\1\uffff\1\4\3\14\2\uffff\1\40\1\4\1\uffff\1\24\2\14";
    static final String DFA31_maxS =
        "\2\65\1\uffff\1\75\2\76\1\65\2\uffff\1\40\1\75\1\uffff\1\24\2\76";
    static final String DFA31_acceptS =
        "\2\uffff\1\2\4\uffff\1\4\1\3\2\uffff\1\1\3\uffff";
    static final String DFA31_specialS =
        "\17\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\1\12\uffff\2\2\12\uffff\1\2\5\uffff\1\2\6\uffff\1\3",
            "\1\6\7\uffff\1\7\7\uffff\1\5\7\uffff\2\2\2\uffff\1\4\7\uffff"+
            "\1\2\5\uffff\1\2\6\uffff\1\2",
            "",
            "\1\10\17\uffff\1\10\13\uffff\1\10\7\uffff\1\2\22\uffff\3\10",
            "\1\7\17\uffff\1\13\13\uffff\1\13\5\uffff\1\13\6\uffff\1\12"+
            "\10\uffff\1\11",
            "\1\7\17\uffff\1\13\13\uffff\1\13\5\uffff\1\13\6\uffff\1\12"+
            "\10\uffff\1\14",
            "\1\7\17\uffff\1\13\13\uffff\1\13\5\uffff\1\13\6\uffff\1\12",
            "",
            "",
            "\1\15",
            "\1\10\17\uffff\1\10\13\uffff\1\10\7\uffff\1\13\22\uffff\3\10",
            "",
            "\1\16",
            "\1\7\17\uffff\1\13\13\uffff\1\13\5\uffff\1\13\6\uffff\1\12"+
            "\10\uffff\1\11",
            "\1\7\17\uffff\1\13\13\uffff\1\13\5\uffff\1\13\6\uffff\1\12"+
            "\10\uffff\1\14"
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "106:1: constraint : ( CONSTRAINT name key | ( CONSTRAINT )? ( FULLTEXT )? key | ( CONSTRAINT name )? UNIQUE ( name )? ( '(' nameList ')' )? | CONSTRAINT ( name )? CHECK '(' name IS NOT NULL ')' );";
        }
    }
 

    public static final BitSet FOLLOW_drop_in_start51 = new BitSet(new long[]{0x0180001001048042L});
    public static final BitSet FOLLOW_create_in_start55 = new BitSet(new long[]{0x0180001001048042L});
    public static final BitSet FOLLOW_namespace_in_start59 = new BitSet(new long[]{0x0180001001048042L});
    public static final BitSet FOLLOW_insert_in_start63 = new BitSet(new long[]{0x0180001001048042L});
    public static final BitSet FOLLOW_update_in_start67 = new BitSet(new long[]{0x0180001001048042L});
    public static final BitSet FOLLOW_alter_in_start71 = new BitSet(new long[]{0x0180001001048042L});
    public static final BitSet FOLLOW_commit_in_start75 = new BitSet(new long[]{0x0180001001048042L});
    public static final BitSet FOLLOW_USE_in_namespace92 = new BitSet(new long[]{0x0000000100100010L});
    public static final BitSet FOLLOW_name_in_namespace94 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_namespace96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMIT_in_commit108 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_commit110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop121 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_TABLE_in_drop123 = new BitSet(new long[]{0x0000000300100010L});
    public static final BitSet FOLLOW_IF_in_drop127 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop129 = new BitSet(new long[]{0x0000000100100010L});
    public static final BitSet FOLLOW_nameList_in_drop134 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_drop136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop141 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_DATABASE_in_drop143 = new BitSet(new long[]{0x0000000300100010L});
    public static final BitSet FOLLOW_IF_in_drop147 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_EXISTS_in_drop149 = new BitSet(new long[]{0x0000000100100010L});
    public static final BitSet FOLLOW_nameList_in_drop154 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_drop156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create168 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_database_in_create170 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_create172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create178 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_schema_in_create180 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_create182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create188 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_table_in_create190 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_create192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create198 = new BitSet(new long[]{0x0020400820000000L});
    public static final BitSet FOLLOW_index_in_create200 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_create202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert214 = new BitSet(new long[]{0x0000004400000000L});
    public static final BitSet FOLLOW_IGNORE_in_insert216 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_INTO_in_insert219 = new BitSet(new long[]{0x0000000100100010L});
    public static final BitSet FOLLOW_name_in_insert221 = new BitSet(new long[]{0x0A00000000000000L});
    public static final BitSet FOLLOW_59_in_insert225 = new BitSet(new long[]{0x0000000100100010L});
    public static final BitSet FOLLOW_nameList_in_insert227 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_insert229 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_VALUES_in_insert234 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_insert236 = new BitSet(new long[]{0x7FFFFFFFFFFFFFF0L,0x0000000000000003L});
    public static final BitSet FOLLOW_60_in_insert244 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_insert246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPDATE_in_update257 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000000000000003L});
    public static final BitSet FOLLOW_63_in_update265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALTER_in_alter276 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_TABLE_in_alter278 = new BitSet(new long[]{0x0000000100100010L});
    public static final BitSet FOLLOW_name_in_alter280 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ADD_in_alter282 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CONSTRAINT_in_alter284 = new BitSet(new long[]{0x0020410110100010L});
    public static final BitSet FOLLOW_name_in_alter286 = new BitSet(new long[]{0x0020410010000000L});
    public static final BitSet FOLLOW_key_in_alter289 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ON_in_alter293 = new BitSet(new long[]{0x0080000000400000L});
    public static final BitSet FOLLOW_set_in_alter295 = new BitSet(new long[]{0x0080000000000400L});
    public static final BitSet FOLLOW_set_in_alter305 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_alter317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATABASE_in_database329 = new BitSet(new long[]{0x0000000300100010L});
    public static final BitSet FOLLOW_IF_in_database333 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_NOT_in_database335 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_EXISTS_in_database337 = new BitSet(new long[]{0x0000000100100010L});
    public static final BitSet FOLLOW_name_in_database342 = new BitSet(new long[]{0x0000000100302912L});
    public static final BitSet FOLLOW_parameter_in_database344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCHEMA_in_schema356 = new BitSet(new long[]{0x0000000300100010L});
    public static final BitSet FOLLOW_IF_in_schema360 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_NOT_in_schema362 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_EXISTS_in_schema364 = new BitSet(new long[]{0x0000000100100010L});
    public static final BitSet FOLLOW_name_in_schema369 = new BitSet(new long[]{0x0000000100302912L});
    public static final BitSet FOLLOW_parameter_in_schema371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TABLE_in_table388 = new BitSet(new long[]{0x0000000300100010L});
    public static final BitSet FOLLOW_IF_in_table392 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_NOT_in_table394 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_EXISTS_in_table396 = new BitSet(new long[]{0x0000000100100010L});
    public static final BitSet FOLLOW_name_in_table401 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_table403 = new BitSet(new long[]{0x0020410930120010L});
    public static final BitSet FOLLOW_definition_in_table405 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_table407 = new BitSet(new long[]{0x0000000100302912L});
    public static final BitSet FOLLOW_parameter_in_table409 = new BitSet(new long[]{0x0000000100302912L});
    public static final BitSet FOLLOW_column_in_definition426 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_constraint_in_definition430 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_index_in_definition434 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_definition440 = new BitSet(new long[]{0x0020410930120010L});
    public static final BitSet FOLLOW_column_in_definition444 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_constraint_in_definition448 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_index_in_definition452 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_name_in_column468 = new BitSet(new long[]{0x0040000102100210L});
    public static final BitSet FOLLOW_type_in_column470 = new BitSet(new long[]{0x0020CD0010200102L});
    public static final BitSet FOLLOW_option_in_column472 = new BitSet(new long[]{0x0020CD0010200102L});
    public static final BitSet FOLLOW_CONSTRAINT_in_constraint487 = new BitSet(new long[]{0x0000000100100010L});
    public static final BitSet FOLLOW_name_in_constraint489 = new BitSet(new long[]{0x0020410010000000L});
    public static final BitSet FOLLOW_key_in_constraint491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRAINT_in_constraint496 = new BitSet(new long[]{0x0020410030000000L});
    public static final BitSet FOLLOW_FULLTEXT_in_constraint499 = new BitSet(new long[]{0x0020410010000000L});
    public static final BitSet FOLLOW_key_in_constraint502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRAINT_in_constraint509 = new BitSet(new long[]{0x0000000100100010L});
    public static final BitSet FOLLOW_name_in_constraint511 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_UNIQUE_in_constraint516 = new BitSet(new long[]{0x0800000100100012L});
    public static final BitSet FOLLOW_name_in_constraint518 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_constraint523 = new BitSet(new long[]{0x0000000100100010L});
    public static final BitSet FOLLOW_nameList_in_constraint525 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_constraint527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRAINT_in_constraint535 = new BitSet(new long[]{0x0000000100101010L});
    public static final BitSet FOLLOW_name_in_constraint537 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_CHECK_in_constraint540 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_constraint542 = new BitSet(new long[]{0x0000000100100010L});
    public static final BitSet FOLLOW_name_in_constraint544 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_IS_in_constraint546 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_NOT_in_constraint548 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NULL_in_constraint550 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_constraint552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDEX_in_index574 = new BitSet(new long[]{0x0800200100100010L});
    public static final BitSet FOLLOW_name_in_index576 = new BitSet(new long[]{0x0800200000000000L});
    public static final BitSet FOLLOW_ON_in_index581 = new BitSet(new long[]{0x0000000100100010L});
    public static final BitSet FOLLOW_name_in_index583 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_index588 = new BitSet(new long[]{0x0000000100100010L});
    public static final BitSet FOLLOW_nameList_in_index590 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_index592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FULLTEXT_in_index597 = new BitSet(new long[]{0x0000000100100010L});
    public static final BitSet FOLLOW_name_in_index599 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_index601 = new BitSet(new long[]{0x0000000100100010L});
    public static final BitSet FOLLOW_nameList_in_index603 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_index605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_in_key632 = new BitSet(new long[]{0x0800000100100012L});
    public static final BitSet FOLLOW_name_in_key634 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_key639 = new BitSet(new long[]{0x0000000100100010L});
    public static final BitSet FOLLOW_nameList_in_key641 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_key643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREIGN_in_key654 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_KEY_in_key656 = new BitSet(new long[]{0x0800800100100010L});
    public static final BitSet FOLLOW_name_in_key658 = new BitSet(new long[]{0x0800800000000000L});
    public static final BitSet FOLLOW_59_in_key663 = new BitSet(new long[]{0x0000000100100010L});
    public static final BitSet FOLLOW_nameList_in_key665 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_key667 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_reference_in_key672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_key_in_option686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_in_option691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_option696 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_NULL_in_option699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUTO_INC_in_option704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_option709 = new BitSet(new long[]{0x0000082100100010L,0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_option713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_option717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_empty_in_option721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REFERENCES_in_reference734 = new BitSet(new long[]{0x0800200100100012L});
    public static final BitSet FOLLOW_name_in_reference736 = new BitSet(new long[]{0x0800200000000002L});
    public static final BitSet FOLLOW_59_in_reference741 = new BitSet(new long[]{0x0000000100100010L});
    public static final BitSet FOLLOW_nameList_in_reference743 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_reference745 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_referenceOptions_in_reference750 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_ON_in_referenceOptions762 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_DELETE_in_referenceOptions764 = new BitSet(new long[]{0x0005020000000400L});
    public static final BitSet FOLLOW_CASCADE_in_referenceOptions768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESTRICT_in_referenceOptions772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NO_in_referenceOptions776 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ACTION_in_referenceOptions778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_referenceOptions782 = new BitSet(new long[]{0x0000080000200000L});
    public static final BitSet FOLLOW_set_in_referenceOptions784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_referenceOptions799 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_UPDATE_in_referenceOptions801 = new BitSet(new long[]{0x0004000000000400L});
    public static final BitSet FOLLOW_CASCADE_in_referenceOptions805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_referenceOptions809 = new BitSet(new long[]{0x0000080000200000L});
    public static final BitSet FOLLOW_set_in_referenceOptions811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_parameter849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_parameter851 = new BitSet(new long[]{0x0000002100100010L});
    public static final BitSet FOLLOW_value_in_parameter853 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_parameter855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_parameter863 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_CHARACTER_in_parameter868 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SET_in_parameter870 = new BitSet(new long[]{0x0000002100100010L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_parameter872 = new BitSet(new long[]{0x0000002100100010L});
    public static final BitSet FOLLOW_value_in_parameter875 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_parameter877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_parameter885 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_COLLATE_in_parameter890 = new BitSet(new long[]{0x0000002100100010L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_parameter892 = new BitSet(new long[]{0x0000002100100010L});
    public static final BitSet FOLLOW_value_in_parameter895 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_parameter897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUTO_INC_in_parameter903 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_parameter905 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_parameter908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_type930 = new BitSet(new long[]{0x0840000000000202L});
    public static final BitSet FOLLOW_59_in_type934 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_type936 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_61_in_type940 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_type942 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_type947 = new BitSet(new long[]{0x0040000000000202L});
    public static final BitSet FOLLOW_ENUM_in_type966 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_type968 = new BitSet(new long[]{0x0000000100100010L});
    public static final BitSet FOLLOW_nameList_in_type970 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_type972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BINARY_in_type977 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_type981 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_type983 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_type985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_nameList998 = new BitSet(new long[]{0x2800000100900092L});
    public static final BitSet FOLLOW_59_in_nameList1002 = new BitSet(new long[]{0x0000002100100010L});
    public static final BitSet FOLLOW_value_in_nameList1004 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_nameList1006 = new BitSet(new long[]{0x2000000100900092L});
    public static final BitSet FOLLOW_order_in_nameList1011 = new BitSet(new long[]{0x2000000100100012L});
    public static final BitSet FOLLOW_61_in_nameList1016 = new BitSet(new long[]{0x0000000100100010L});
    public static final BitSet FOLLOW_name_in_nameList1019 = new BitSet(new long[]{0x2800000100900092L});
    public static final BitSet FOLLOW_59_in_nameList1023 = new BitSet(new long[]{0x0000002100100010L});
    public static final BitSet FOLLOW_value_in_nameList1025 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_nameList1027 = new BitSet(new long[]{0x2000000100900092L});
    public static final BitSet FOLLOW_order_in_nameList1032 = new BitSet(new long[]{0x2000000100100012L});
    public static final BitSet FOLLOW_value_in_valueList1049 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_empty_in_valueList1053 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_valueList1058 = new BitSet(new long[]{0x0000002100100010L,0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_valueList1062 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_empty_in_valueList1066 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_name_in_value1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_value1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_empty1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_name1109 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_name1113 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_name1115 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_DEF_in_name1123 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_name1127 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DEF_in_name1129 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ACTION_in_name1137 = new BitSet(new long[]{0x0000000000000002L});

}