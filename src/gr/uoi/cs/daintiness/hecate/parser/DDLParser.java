// $ANTLR 3.4 DDL.g 2013-02-05 11:53:26

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACTION", "ASC", "AUTO_INC", "BINARY", "CASCADE", "CHARACTER", "CHECK", "COLLATE", "COMMENT", "COMMIT", "CONSTRAINT", "CREATE", "DEF", "DEFAULT", "DELETE", "DESC", "DROP", "ENUM", "ESC_SEQ", "EXISTS", "FOREIGN", "FULLTEXT", "HASH", "HEX_DIGIT", "ID", "IF", "INDEX", "INSERT", "INT", "INTO", "IS", "KEY", "NO", "NOT", "NULL", "OCTAL_ESC", "ON", "PRIMARY", "REFERENCES", "RESTRICT", "SCHEMA", "SET", "TABLE", "UNICODE_ESC", "UNIQUE", "UNSIGNED", "UPDATE", "USE", "VALUES", "WS", "'('", "')'", "','", "'.'", "';'", "'='", "'\\'\\''"
    };

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
    // DDL.g:33:1: start returns [Schema s] : ( drop | create | namespace | insert | commit )+ ;
    public final Schema start() throws RecognitionException {
        Schema s = null;


        try {
            // DDL.g:34:2: ( ( drop | create | namespace | insert | commit )+ )
            // DDL.g:34:4: ( drop | create | namespace | insert | commit )+
            {
            // DDL.g:34:4: ( drop | create | namespace | insert | commit )+
            int cnt1=0;
            loop1:
            do {
                int alt1=6;
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
                case COMMIT:
                    {
                    alt1=5;
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
            	    // DDL.g:34:43: commit
            	    {
            	    pushFollow(FOLLOW_commit_in_start67);
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
            match(input,USE,FOLLOW_USE_in_namespace85); 

            pushFollow(FOLLOW_name_in_namespace87);
            name();

            state._fsp--;


            match(input,58,FOLLOW_58_in_namespace89); 

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
            match(input,COMMIT,FOLLOW_COMMIT_in_commit101); 

            match(input,58,FOLLOW_58_in_commit103); 

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
    // DDL.g:48:1: drop : DROP TABLE ( IF EXISTS )? nameList ';' ;
    public final void drop() throws RecognitionException {
        try {
            // DDL.g:49:2: ( DROP TABLE ( IF EXISTS )? nameList ';' )
            // DDL.g:49:4: DROP TABLE ( IF EXISTS )? nameList ';'
            {
            match(input,DROP,FOLLOW_DROP_in_drop114); 

            match(input,TABLE,FOLLOW_TABLE_in_drop116); 

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
                    match(input,IF,FOLLOW_IF_in_drop120); 

                    match(input,EXISTS,FOLLOW_EXISTS_in_drop122); 

                    }
                    break;

            }


            pushFollow(FOLLOW_nameList_in_drop127);
            nameList();

            state._fsp--;


            match(input,58,FOLLOW_58_in_drop129); 

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
    // DDL.g:52:1: create : ( CREATE schema ';' | CREATE table ';' | CREATE index ';' );
    public final void create() throws RecognitionException {
        try {
            // DDL.g:53:2: ( CREATE schema ';' | CREATE table ';' | CREATE index ';' )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==CREATE) ) {
                switch ( input.LA(2) ) {
                case SCHEMA:
                    {
                    alt3=1;
                    }
                    break;
                case TABLE:
                    {
                    alt3=2;
                    }
                    break;
                case FULLTEXT:
                case INDEX:
                case PRIMARY:
                case UNIQUE:
                    {
                    alt3=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // DDL.g:53:4: CREATE schema ';'
                    {
                    match(input,CREATE,FOLLOW_CREATE_in_create141); 

                    pushFollow(FOLLOW_schema_in_create143);
                    schema();

                    state._fsp--;


                    match(input,58,FOLLOW_58_in_create145); 

                    }
                    break;
                case 2 :
                    // DDL.g:54:4: CREATE table ';'
                    {
                    match(input,CREATE,FOLLOW_CREATE_in_create150); 

                    pushFollow(FOLLOW_table_in_create152);
                    table();

                    state._fsp--;


                    match(input,58,FOLLOW_58_in_create154); 

                    }
                    break;
                case 3 :
                    // DDL.g:55:4: CREATE index ';'
                    {
                    match(input,CREATE,FOLLOW_CREATE_in_create159); 

                    pushFollow(FOLLOW_index_in_create161);
                    index();

                    state._fsp--;


                    match(input,58,FOLLOW_58_in_create163); 

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
    // DDL.g:58:1: insert : INSERT INTO name ( '(' nameList ')' )? VALUES '(' valueList ')' ';' ;
    public final void insert() throws RecognitionException {
        try {
            // DDL.g:59:2: ( INSERT INTO name ( '(' nameList ')' )? VALUES '(' valueList ')' ';' )
            // DDL.g:59:4: INSERT INTO name ( '(' nameList ')' )? VALUES '(' valueList ')' ';'
            {
            match(input,INSERT,FOLLOW_INSERT_in_insert175); 

            match(input,INTO,FOLLOW_INTO_in_insert177); 

            pushFollow(FOLLOW_name_in_insert179);
            name();

            state._fsp--;


            // DDL.g:59:21: ( '(' nameList ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==54) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // DDL.g:59:23: '(' nameList ')'
                    {
                    match(input,54,FOLLOW_54_in_insert183); 

                    pushFollow(FOLLOW_nameList_in_insert185);
                    nameList();

                    state._fsp--;


                    match(input,55,FOLLOW_55_in_insert187); 

                    }
                    break;

            }


            match(input,VALUES,FOLLOW_VALUES_in_insert192); 

            match(input,54,FOLLOW_54_in_insert194); 

            pushFollow(FOLLOW_valueList_in_insert196);
            valueList();

            state._fsp--;


            match(input,55,FOLLOW_55_in_insert198); 

            match(input,58,FOLLOW_58_in_insert200); 

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



    // $ANTLR start "schema"
    // DDL.g:62:1: schema : SCHEMA ( IF NOT EXISTS )? name ( parameter )? ;
    public final void schema() throws RecognitionException {
        try {
            // DDL.g:63:2: ( SCHEMA ( IF NOT EXISTS )? name ( parameter )? )
            // DDL.g:63:4: SCHEMA ( IF NOT EXISTS )? name ( parameter )?
            {
            match(input,SCHEMA,FOLLOW_SCHEMA_in_schema212); 

            // DDL.g:63:11: ( IF NOT EXISTS )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==IF) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // DDL.g:63:13: IF NOT EXISTS
                    {
                    match(input,IF,FOLLOW_IF_in_schema216); 

                    match(input,NOT,FOLLOW_NOT_in_schema218); 

                    match(input,EXISTS,FOLLOW_EXISTS_in_schema220); 

                    }
                    break;

            }


            pushFollow(FOLLOW_name_in_schema225);
            name();

            state._fsp--;


            // DDL.g:63:35: ( parameter )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==AUTO_INC||LA6_0==CHARACTER||LA6_0==COLLATE||(LA6_0 >= DEF && LA6_0 <= DEFAULT)||LA6_0==ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // DDL.g:63:35: parameter
                    {
                    pushFollow(FOLLOW_parameter_in_schema227);
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
    // DDL.g:66:1: table : TABLE ( IF NOT EXISTS )? name '(' definition ')' ( parameter )* ;
    public final void table() throws RecognitionException {
        DDLParser.name_return name1 =null;



        		am.clear();
        	
        try {
            // DDL.g:70:2: ( TABLE ( IF NOT EXISTS )? name '(' definition ')' ( parameter )* )
            // DDL.g:70:4: TABLE ( IF NOT EXISTS )? name '(' definition ')' ( parameter )*
            {
            match(input,TABLE,FOLLOW_TABLE_in_table245); 

            // DDL.g:70:10: ( IF NOT EXISTS )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==IF) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // DDL.g:70:12: IF NOT EXISTS
                    {
                    match(input,IF,FOLLOW_IF_in_table249); 

                    match(input,NOT,FOLLOW_NOT_in_table251); 

                    match(input,EXISTS,FOLLOW_EXISTS_in_table253); 

                    }
                    break;

            }


            pushFollow(FOLLOW_name_in_table258);
            name1=name();

            state._fsp--;


            match(input,54,FOLLOW_54_in_table260); 

            pushFollow(FOLLOW_definition_in_table262);
            definition();

            state._fsp--;


            match(input,55,FOLLOW_55_in_table264); 

            // DDL.g:70:53: ( parameter )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==AUTO_INC||LA8_0==CHARACTER||LA8_0==COLLATE||(LA8_0 >= DEF && LA8_0 <= DEFAULT)||LA8_0==ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // DDL.g:70:53: parameter
            	    {
            	    pushFollow(FOLLOW_parameter_in_table266);
            	    parameter();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);



            		tm.put((name1!=null?input.toString(name1.start,name1.stop):null).replace("`",""), new Table((name1!=null?input.toString(name1.start,name1.stop):null).replace("`",""), am, k)) ;
            	

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
    // DDL.g:76:1: definition : ( column | constraint | index ) ( ',' ( column | constraint | index ) )* ;
    public final void definition() throws RecognitionException {
        try {
            // DDL.g:77:2: ( ( column | constraint | index ) ( ',' ( column | constraint | index ) )* )
            // DDL.g:77:4: ( column | constraint | index ) ( ',' ( column | constraint | index ) )*
            {
            // DDL.g:77:4: ( column | constraint | index )
            int alt9=3;
            switch ( input.LA(1) ) {
            case DEF:
            case ID:
                {
                alt9=1;
                }
                break;
            case CONSTRAINT:
            case FOREIGN:
            case KEY:
                {
                alt9=2;
                }
                break;
            case FULLTEXT:
                {
                int LA9_3 = input.LA(2);

                if ( (LA9_3==FOREIGN||LA9_3==KEY||LA9_3==PRIMARY||LA9_3==UNIQUE) ) {
                    alt9=2;
                }
                else if ( (LA9_3==DEF||LA9_3==ID) ) {
                    alt9=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 3, input);

                    throw nvae;

                }
                }
                break;
            case UNIQUE:
                {
                int LA9_4 = input.LA(2);

                if ( (LA9_4==DEF||LA9_4==ID||LA9_4==KEY||(LA9_4 >= 54 && LA9_4 <= 56)) ) {
                    alt9=2;
                }
                else if ( (LA9_4==INDEX) ) {
                    alt9=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 4, input);

                    throw nvae;

                }
                }
                break;
            case PRIMARY:
                {
                int LA9_5 = input.LA(2);

                if ( (LA9_5==KEY) ) {
                    alt9=2;
                }
                else if ( (LA9_5==INDEX) ) {
                    alt9=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 5, input);

                    throw nvae;

                }
                }
                break;
            case INDEX:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // DDL.g:77:6: column
                    {
                    pushFollow(FOLLOW_column_in_definition284);
                    column();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // DDL.g:77:15: constraint
                    {
                    pushFollow(FOLLOW_constraint_in_definition288);
                    constraint();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // DDL.g:77:28: index
                    {
                    pushFollow(FOLLOW_index_in_definition292);
                    index();

                    state._fsp--;


                    }
                    break;

            }


            // DDL.g:77:36: ( ',' ( column | constraint | index ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==56) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // DDL.g:77:38: ',' ( column | constraint | index )
            	    {
            	    match(input,56,FOLLOW_56_in_definition298); 

            	    // DDL.g:77:42: ( column | constraint | index )
            	    int alt10=3;
            	    switch ( input.LA(1) ) {
            	    case DEF:
            	    case ID:
            	        {
            	        alt10=1;
            	        }
            	        break;
            	    case CONSTRAINT:
            	    case FOREIGN:
            	    case KEY:
            	        {
            	        alt10=2;
            	        }
            	        break;
            	    case FULLTEXT:
            	        {
            	        int LA10_3 = input.LA(2);

            	        if ( (LA10_3==FOREIGN||LA10_3==KEY||LA10_3==PRIMARY||LA10_3==UNIQUE) ) {
            	            alt10=2;
            	        }
            	        else if ( (LA10_3==DEF||LA10_3==ID) ) {
            	            alt10=3;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 10, 3, input);

            	            throw nvae;

            	        }
            	        }
            	        break;
            	    case UNIQUE:
            	        {
            	        int LA10_4 = input.LA(2);

            	        if ( (LA10_4==DEF||LA10_4==ID||LA10_4==KEY||(LA10_4 >= 54 && LA10_4 <= 56)) ) {
            	            alt10=2;
            	        }
            	        else if ( (LA10_4==INDEX) ) {
            	            alt10=3;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 10, 4, input);

            	            throw nvae;

            	        }
            	        }
            	        break;
            	    case PRIMARY:
            	        {
            	        int LA10_5 = input.LA(2);

            	        if ( (LA10_5==KEY) ) {
            	            alt10=2;
            	        }
            	        else if ( (LA10_5==INDEX) ) {
            	            alt10=3;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 10, 5, input);

            	            throw nvae;

            	        }
            	        }
            	        break;
            	    case INDEX:
            	        {
            	        alt10=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt10) {
            	        case 1 :
            	            // DDL.g:77:44: column
            	            {
            	            pushFollow(FOLLOW_column_in_definition302);
            	            column();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // DDL.g:77:53: constraint
            	            {
            	            pushFollow(FOLLOW_constraint_in_definition306);
            	            constraint();

            	            state._fsp--;


            	            }
            	            break;
            	        case 3 :
            	            // DDL.g:77:66: index
            	            {
            	            pushFollow(FOLLOW_index_in_definition310);
            	            index();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // DDL.g:80:1: column : name type ( option )* ;
    public final void column() throws RecognitionException {
        DDLParser.type_return type2 =null;

        DDLParser.name_return name3 =null;


        try {
            // DDL.g:81:2: ( name type ( option )* )
            // DDL.g:81:4: name type ( option )*
            {
            pushFollow(FOLLOW_name_in_column327);
            name3=name();

            state._fsp--;


            pushFollow(FOLLOW_type_in_column329);
            type2=type();

            state._fsp--;


            // DDL.g:81:14: ( option )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==AUTO_INC||LA12_0==DEFAULT||LA12_0==FOREIGN||LA12_0==KEY||(LA12_0 >= NOT && LA12_0 <= NULL)||(LA12_0 >= PRIMARY && LA12_0 <= REFERENCES)||LA12_0==UNIQUE) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // DDL.g:81:14: option
            	    {
            	    pushFollow(FOLLOW_option_in_column331);
            	    option();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);



            		String t = (type2!=null?input.toString(type2.start,type2.stop):null);
            		am.put((name3!=null?input.toString(name3.start,name3.stop):null).replace("`",""), new Attribute((name3!=null?input.toString(name3.start,name3.stop):null).replace("`",""), t.toUpperCase(), false, null)) ;
            	

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
    // DDL.g:88:1: constraint : ( CONSTRAINT name key | ( CONSTRAINT )? ( FULLTEXT )? key | ( CONSTRAINT name )? UNIQUE ( name )? ( '(' nameList ')' )? | CONSTRAINT ( name )? CHECK '(' name IS NOT NULL ')' );
    public final void constraint() throws RecognitionException {
        try {
            // DDL.g:89:2: ( CONSTRAINT name key | ( CONSTRAINT )? ( FULLTEXT )? key | ( CONSTRAINT name )? UNIQUE ( name )? ( '(' nameList ')' )? | CONSTRAINT ( name )? CHECK '(' name IS NOT NULL ')' )
            int alt19=4;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // DDL.g:89:4: CONSTRAINT name key
                    {
                    match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_constraint347); 

                    pushFollow(FOLLOW_name_in_constraint349);
                    name();

                    state._fsp--;


                    pushFollow(FOLLOW_key_in_constraint351);
                    key();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // DDL.g:90:4: ( CONSTRAINT )? ( FULLTEXT )? key
                    {
                    // DDL.g:90:4: ( CONSTRAINT )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==CONSTRAINT) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // DDL.g:90:4: CONSTRAINT
                            {
                            match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_constraint356); 

                            }
                            break;

                    }


                    // DDL.g:90:16: ( FULLTEXT )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==FULLTEXT) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // DDL.g:90:16: FULLTEXT
                            {
                            match(input,FULLTEXT,FOLLOW_FULLTEXT_in_constraint359); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_key_in_constraint362);
                    key();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // DDL.g:91:4: ( CONSTRAINT name )? UNIQUE ( name )? ( '(' nameList ')' )?
                    {
                    // DDL.g:91:4: ( CONSTRAINT name )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==CONSTRAINT) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // DDL.g:91:6: CONSTRAINT name
                            {
                            match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_constraint369); 

                            pushFollow(FOLLOW_name_in_constraint371);
                            name();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input,UNIQUE,FOLLOW_UNIQUE_in_constraint376); 

                    // DDL.g:91:32: ( name )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==DEF||LA16_0==ID) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // DDL.g:91:32: name
                            {
                            pushFollow(FOLLOW_name_in_constraint378);
                            name();

                            state._fsp--;


                            }
                            break;

                    }


                    // DDL.g:91:38: ( '(' nameList ')' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==54) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // DDL.g:91:40: '(' nameList ')'
                            {
                            match(input,54,FOLLOW_54_in_constraint383); 

                            pushFollow(FOLLOW_nameList_in_constraint385);
                            nameList();

                            state._fsp--;


                            match(input,55,FOLLOW_55_in_constraint387); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // DDL.g:92:4: CONSTRAINT ( name )? CHECK '(' name IS NOT NULL ')'
                    {
                    match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_constraint395); 

                    // DDL.g:92:15: ( name )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==DEF||LA18_0==ID) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // DDL.g:92:15: name
                            {
                            pushFollow(FOLLOW_name_in_constraint397);
                            name();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input,CHECK,FOLLOW_CHECK_in_constraint400); 

                    match(input,54,FOLLOW_54_in_constraint402); 

                    pushFollow(FOLLOW_name_in_constraint404);
                    name();

                    state._fsp--;


                    match(input,IS,FOLLOW_IS_in_constraint406); 

                    match(input,NOT,FOLLOW_NOT_in_constraint408); 

                    match(input,NULL,FOLLOW_NULL_in_constraint410); 

                    match(input,55,FOLLOW_55_in_constraint412); 

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
    // DDL.g:95:1: index : ( ( UNIQUE | PRIMARY )? INDEX ( name )? ( ON name )? '(' nameList ')' | FULLTEXT name '(' nameList ')' );
    public final void index() throws RecognitionException {
        try {
            // DDL.g:96:2: ( ( UNIQUE | PRIMARY )? INDEX ( name )? ( ON name )? '(' nameList ')' | FULLTEXT name '(' nameList ')' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==INDEX||LA23_0==PRIMARY||LA23_0==UNIQUE) ) {
                alt23=1;
            }
            else if ( (LA23_0==FULLTEXT) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // DDL.g:96:4: ( UNIQUE | PRIMARY )? INDEX ( name )? ( ON name )? '(' nameList ')'
                    {
                    // DDL.g:96:4: ( UNIQUE | PRIMARY )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==PRIMARY||LA20_0==UNIQUE) ) {
                        alt20=1;
                    }
                    switch (alt20) {
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


                    match(input,INDEX,FOLLOW_INDEX_in_index435); 

                    // DDL.g:96:32: ( name )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==DEF||LA21_0==ID) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // DDL.g:96:32: name
                            {
                            pushFollow(FOLLOW_name_in_index437);
                            name();

                            state._fsp--;


                            }
                            break;

                    }


                    // DDL.g:96:38: ( ON name )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==ON) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // DDL.g:96:40: ON name
                            {
                            match(input,ON,FOLLOW_ON_in_index442); 

                            pushFollow(FOLLOW_name_in_index444);
                            name();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input,54,FOLLOW_54_in_index449); 

                    pushFollow(FOLLOW_nameList_in_index451);
                    nameList();

                    state._fsp--;


                    match(input,55,FOLLOW_55_in_index453); 

                    }
                    break;
                case 2 :
                    // DDL.g:97:4: FULLTEXT name '(' nameList ')'
                    {
                    match(input,FULLTEXT,FOLLOW_FULLTEXT_in_index458); 

                    pushFollow(FOLLOW_name_in_index460);
                    name();

                    state._fsp--;


                    match(input,54,FOLLOW_54_in_index462); 

                    pushFollow(FOLLOW_nameList_in_index464);
                    nameList();

                    state._fsp--;


                    match(input,55,FOLLOW_55_in_index466); 

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
    // DDL.g:100:1: key : ( ( UNIQUE | PRIMARY )? KEY ( name )? ( '(' nameList ')' )? | FOREIGN KEY ( name )? ( '(' nameList ')' )? reference );
    public final void key() throws RecognitionException {
        DDLParser.nameList_return nameList4 =null;



        		km.clear();
        	
        try {
            // DDL.g:104:2: ( ( UNIQUE | PRIMARY )? KEY ( name )? ( '(' nameList ')' )? | FOREIGN KEY ( name )? ( '(' nameList ')' )? reference )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==KEY||LA29_0==PRIMARY||LA29_0==UNIQUE) ) {
                alt29=1;
            }
            else if ( (LA29_0==FOREIGN) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // DDL.g:104:4: ( UNIQUE | PRIMARY )? KEY ( name )? ( '(' nameList ')' )?
                    {
                    // DDL.g:104:4: ( UNIQUE | PRIMARY )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==PRIMARY||LA24_0==UNIQUE) ) {
                        alt24=1;
                    }
                    switch (alt24) {
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


                    match(input,KEY,FOLLOW_KEY_in_key494); 

                    // DDL.g:104:30: ( name )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==DEF||LA25_0==ID) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // DDL.g:104:30: name
                            {
                            pushFollow(FOLLOW_name_in_key496);
                            name();

                            state._fsp--;


                            }
                            break;

                    }


                    // DDL.g:104:36: ( '(' nameList ')' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==54) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // DDL.g:104:38: '(' nameList ')'
                            {
                            match(input,54,FOLLOW_54_in_key501); 

                            pushFollow(FOLLOW_nameList_in_key503);
                            nameList4=nameList();

                            state._fsp--;


                            match(input,55,FOLLOW_55_in_key505); 

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
                    // DDL.g:117:4: FOREIGN KEY ( name )? ( '(' nameList ')' )? reference
                    {
                    match(input,FOREIGN,FOLLOW_FOREIGN_in_key516); 

                    match(input,KEY,FOLLOW_KEY_in_key518); 

                    // DDL.g:117:16: ( name )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==DEF||LA27_0==ID) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // DDL.g:117:16: name
                            {
                            pushFollow(FOLLOW_name_in_key520);
                            name();

                            state._fsp--;


                            }
                            break;

                    }


                    // DDL.g:117:22: ( '(' nameList ')' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==54) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // DDL.g:117:24: '(' nameList ')'
                            {
                            match(input,54,FOLLOW_54_in_key525); 

                            pushFollow(FOLLOW_nameList_in_key527);
                            nameList();

                            state._fsp--;


                            match(input,55,FOLLOW_55_in_key529); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_reference_in_key534);
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
    // DDL.g:123:1: option : ( key | reference | ( NOT )? NULL | AUTO_INC | DEFAULT ( value | NULL | empty ) );
    public final void option() throws RecognitionException {
        try {
            // DDL.g:124:2: ( key | reference | ( NOT )? NULL | AUTO_INC | DEFAULT ( value | NULL | empty ) )
            int alt32=5;
            switch ( input.LA(1) ) {
            case FOREIGN:
            case KEY:
            case PRIMARY:
            case UNIQUE:
                {
                alt32=1;
                }
                break;
            case REFERENCES:
                {
                alt32=2;
                }
                break;
            case NOT:
            case NULL:
                {
                alt32=3;
                }
                break;
            case AUTO_INC:
                {
                alt32=4;
                }
                break;
            case DEFAULT:
                {
                alt32=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }

            switch (alt32) {
                case 1 :
                    // DDL.g:124:4: key
                    {
                    pushFollow(FOLLOW_key_in_option549);
                    key();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // DDL.g:125:4: reference
                    {
                    pushFollow(FOLLOW_reference_in_option554);
                    reference();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // DDL.g:126:4: ( NOT )? NULL
                    {
                    // DDL.g:126:4: ( NOT )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==NOT) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // DDL.g:126:4: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_option559); 

                            }
                            break;

                    }


                    match(input,NULL,FOLLOW_NULL_in_option562); 

                    }
                    break;
                case 4 :
                    // DDL.g:127:4: AUTO_INC
                    {
                    match(input,AUTO_INC,FOLLOW_AUTO_INC_in_option567); 

                    }
                    break;
                case 5 :
                    // DDL.g:128:4: DEFAULT ( value | NULL | empty )
                    {
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_option572); 

                    // DDL.g:128:12: ( value | NULL | empty )
                    int alt31=3;
                    switch ( input.LA(1) ) {
                    case DEF:
                    case ID:
                    case INT:
                        {
                        alt31=1;
                        }
                        break;
                    case NULL:
                        {
                        alt31=2;
                        }
                        break;
                    case 60:
                        {
                        alt31=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;

                    }

                    switch (alt31) {
                        case 1 :
                            // DDL.g:128:14: value
                            {
                            pushFollow(FOLLOW_value_in_option576);
                            value();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // DDL.g:128:22: NULL
                            {
                            match(input,NULL,FOLLOW_NULL_in_option580); 

                            }
                            break;
                        case 3 :
                            // DDL.g:128:29: empty
                            {
                            pushFollow(FOLLOW_empty_in_option584);
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
    // DDL.g:131:1: reference : REFERENCES ( name )? ( '(' nameList ')' )? ( referenceOptions )* ;
    public final void reference() throws RecognitionException {
        try {
            // DDL.g:132:2: ( REFERENCES ( name )? ( '(' nameList ')' )? ( referenceOptions )* )
            // DDL.g:132:4: REFERENCES ( name )? ( '(' nameList ')' )? ( referenceOptions )*
            {
            match(input,REFERENCES,FOLLOW_REFERENCES_in_reference598); 

            // DDL.g:132:15: ( name )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==DEF||LA33_0==ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // DDL.g:132:15: name
                    {
                    pushFollow(FOLLOW_name_in_reference600);
                    name();

                    state._fsp--;


                    }
                    break;

            }


            // DDL.g:132:21: ( '(' nameList ')' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==54) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // DDL.g:132:23: '(' nameList ')'
                    {
                    match(input,54,FOLLOW_54_in_reference605); 

                    pushFollow(FOLLOW_nameList_in_reference607);
                    nameList();

                    state._fsp--;


                    match(input,55,FOLLOW_55_in_reference609); 

                    }
                    break;

            }


            // DDL.g:132:43: ( referenceOptions )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==ON) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // DDL.g:132:43: referenceOptions
            	    {
            	    pushFollow(FOLLOW_referenceOptions_in_reference614);
            	    referenceOptions();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // DDL.g:135:1: referenceOptions : ( ON DELETE ( CASCADE | RESTRICT | NO ACTION | SET ( DEFAULT | NULL ) ) | ON UPDATE ( CASCADE | SET ( DEFAULT | NULL ) ) );
    public final void referenceOptions() throws RecognitionException {
        try {
            // DDL.g:136:2: ( ON DELETE ( CASCADE | RESTRICT | NO ACTION | SET ( DEFAULT | NULL ) ) | ON UPDATE ( CASCADE | SET ( DEFAULT | NULL ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==ON) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==DELETE) ) {
                    alt38=1;
                }
                else if ( (LA38_1==UPDATE) ) {
                    alt38=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }
            switch (alt38) {
                case 1 :
                    // DDL.g:136:4: ON DELETE ( CASCADE | RESTRICT | NO ACTION | SET ( DEFAULT | NULL ) )
                    {
                    match(input,ON,FOLLOW_ON_in_referenceOptions627); 

                    match(input,DELETE,FOLLOW_DELETE_in_referenceOptions629); 

                    // DDL.g:136:14: ( CASCADE | RESTRICT | NO ACTION | SET ( DEFAULT | NULL ) )
                    int alt36=4;
                    switch ( input.LA(1) ) {
                    case CASCADE:
                        {
                        alt36=1;
                        }
                        break;
                    case RESTRICT:
                        {
                        alt36=2;
                        }
                        break;
                    case NO:
                        {
                        alt36=3;
                        }
                        break;
                    case SET:
                        {
                        alt36=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;

                    }

                    switch (alt36) {
                        case 1 :
                            // DDL.g:136:16: CASCADE
                            {
                            match(input,CASCADE,FOLLOW_CASCADE_in_referenceOptions633); 

                            }
                            break;
                        case 2 :
                            // DDL.g:136:26: RESTRICT
                            {
                            match(input,RESTRICT,FOLLOW_RESTRICT_in_referenceOptions637); 

                            }
                            break;
                        case 3 :
                            // DDL.g:136:37: NO ACTION
                            {
                            match(input,NO,FOLLOW_NO_in_referenceOptions641); 

                            match(input,ACTION,FOLLOW_ACTION_in_referenceOptions643); 

                            }
                            break;
                        case 4 :
                            // DDL.g:136:49: SET ( DEFAULT | NULL )
                            {
                            match(input,SET,FOLLOW_SET_in_referenceOptions647); 

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
                    // DDL.g:137:4: ON UPDATE ( CASCADE | SET ( DEFAULT | NULL ) )
                    {
                    match(input,ON,FOLLOW_ON_in_referenceOptions664); 

                    match(input,UPDATE,FOLLOW_UPDATE_in_referenceOptions666); 

                    // DDL.g:137:14: ( CASCADE | SET ( DEFAULT | NULL ) )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==CASCADE) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==SET) ) {
                        alt37=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;

                    }
                    switch (alt37) {
                        case 1 :
                            // DDL.g:137:16: CASCADE
                            {
                            match(input,CASCADE,FOLLOW_CASCADE_in_referenceOptions670); 

                            }
                            break;
                        case 2 :
                            // DDL.g:137:26: SET ( DEFAULT | NULL )
                            {
                            match(input,SET,FOLLOW_SET_in_referenceOptions674); 

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
    // DDL.g:139:1: order : ( ASC | DESC );
    public final void order() throws RecognitionException {
        try {
            // DDL.g:140:2: ( ASC | DESC )
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
    // DDL.g:144:1: parameter : ( name '=' value ( ',' )? | ( DEFAULT )? CHARACTER SET ( '=' )? value ( ',' )? | ( DEFAULT )? COLLATE ( '=' )? value ( ',' )? | AUTO_INC ( '=' )? INT );
    public final void parameter() throws RecognitionException {
        try {
            // DDL.g:145:2: ( name '=' value ( ',' )? | ( DEFAULT )? CHARACTER SET ( '=' )? value ( ',' )? | ( DEFAULT )? COLLATE ( '=' )? value ( ',' )? | AUTO_INC ( '=' )? INT )
            int alt47=4;
            switch ( input.LA(1) ) {
            case DEF:
            case ID:
                {
                alt47=1;
                }
                break;
            case DEFAULT:
                {
                int LA47_2 = input.LA(2);

                if ( (LA47_2==CHARACTER) ) {
                    alt47=2;
                }
                else if ( (LA47_2==COLLATE) ) {
                    alt47=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 2, input);

                    throw nvae;

                }
                }
                break;
            case CHARACTER:
                {
                alt47=2;
                }
                break;
            case COLLATE:
                {
                alt47=3;
                }
                break;
            case AUTO_INC:
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
                    // DDL.g:145:4: name '=' value ( ',' )?
                    {
                    pushFollow(FOLLOW_name_in_parameter714);
                    name();

                    state._fsp--;


                    match(input,59,FOLLOW_59_in_parameter716); 

                    pushFollow(FOLLOW_value_in_parameter718);
                    value();

                    state._fsp--;


                    // DDL.g:145:19: ( ',' )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==56) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // DDL.g:145:19: ','
                            {
                            match(input,56,FOLLOW_56_in_parameter720); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // DDL.g:146:4: ( DEFAULT )? CHARACTER SET ( '=' )? value ( ',' )?
                    {
                    // DDL.g:146:4: ( DEFAULT )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==DEFAULT) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // DDL.g:146:6: DEFAULT
                            {
                            match(input,DEFAULT,FOLLOW_DEFAULT_in_parameter728); 

                            }
                            break;

                    }


                    match(input,CHARACTER,FOLLOW_CHARACTER_in_parameter733); 

                    match(input,SET,FOLLOW_SET_in_parameter735); 

                    // DDL.g:146:31: ( '=' )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==59) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // DDL.g:146:31: '='
                            {
                            match(input,59,FOLLOW_59_in_parameter737); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_value_in_parameter740);
                    value();

                    state._fsp--;


                    // DDL.g:146:42: ( ',' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==56) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // DDL.g:146:42: ','
                            {
                            match(input,56,FOLLOW_56_in_parameter742); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // DDL.g:147:4: ( DEFAULT )? COLLATE ( '=' )? value ( ',' )?
                    {
                    // DDL.g:147:4: ( DEFAULT )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==DEFAULT) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // DDL.g:147:6: DEFAULT
                            {
                            match(input,DEFAULT,FOLLOW_DEFAULT_in_parameter750); 

                            }
                            break;

                    }


                    match(input,COLLATE,FOLLOW_COLLATE_in_parameter755); 

                    // DDL.g:147:25: ( '=' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==59) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // DDL.g:147:25: '='
                            {
                            match(input,59,FOLLOW_59_in_parameter757); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_value_in_parameter760);
                    value();

                    state._fsp--;


                    // DDL.g:147:36: ( ',' )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==56) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // DDL.g:147:36: ','
                            {
                            match(input,56,FOLLOW_56_in_parameter762); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // DDL.g:148:4: AUTO_INC ( '=' )? INT
                    {
                    match(input,AUTO_INC,FOLLOW_AUTO_INC_in_parameter768); 

                    // DDL.g:148:13: ( '=' )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==59) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // DDL.g:148:13: '='
                            {
                            match(input,59,FOLLOW_59_in_parameter770); 

                            }
                            break;

                    }


                    match(input,INT,FOLLOW_INT_in_parameter773); 

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
    // DDL.g:151:1: type : ( name ( '(' INT ( ',' INT )? ')' )? ( UNSIGNED | BINARY )? | ENUM '(' nameList ')' | BINARY ( '(' INT ')' ) );
    public final DDLParser.type_return type() throws RecognitionException {
        DDLParser.type_return retval = new DDLParser.type_return();
        retval.start = input.LT(1);


        try {
            // DDL.g:152:2: ( name ( '(' INT ( ',' INT )? ')' )? ( UNSIGNED | BINARY )? | ENUM '(' nameList ')' | BINARY ( '(' INT ')' ) )
            int alt51=3;
            switch ( input.LA(1) ) {
            case DEF:
            case ID:
                {
                alt51=1;
                }
                break;
            case ENUM:
                {
                alt51=2;
                }
                break;
            case BINARY:
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
                    // DDL.g:152:4: name ( '(' INT ( ',' INT )? ')' )? ( UNSIGNED | BINARY )?
                    {
                    pushFollow(FOLLOW_name_in_type785);
                    name();

                    state._fsp--;


                    // DDL.g:152:9: ( '(' INT ( ',' INT )? ')' )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==54) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // DDL.g:152:11: '(' INT ( ',' INT )? ')'
                            {
                            match(input,54,FOLLOW_54_in_type789); 

                            match(input,INT,FOLLOW_INT_in_type791); 

                            // DDL.g:152:19: ( ',' INT )?
                            int alt48=2;
                            int LA48_0 = input.LA(1);

                            if ( (LA48_0==56) ) {
                                alt48=1;
                            }
                            switch (alt48) {
                                case 1 :
                                    // DDL.g:152:21: ',' INT
                                    {
                                    match(input,56,FOLLOW_56_in_type795); 

                                    match(input,INT,FOLLOW_INT_in_type797); 

                                    }
                                    break;

                            }


                            match(input,55,FOLLOW_55_in_type802); 

                            }
                            break;

                    }


                    // DDL.g:152:39: ( UNSIGNED | BINARY )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==BINARY||LA50_0==UNSIGNED) ) {
                        alt50=1;
                    }
                    switch (alt50) {
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
                    // DDL.g:153:4: ENUM '(' nameList ')'
                    {
                    match(input,ENUM,FOLLOW_ENUM_in_type821); 

                    match(input,54,FOLLOW_54_in_type823); 

                    pushFollow(FOLLOW_nameList_in_type825);
                    nameList();

                    state._fsp--;


                    match(input,55,FOLLOW_55_in_type827); 

                    }
                    break;
                case 3 :
                    // DDL.g:154:4: BINARY ( '(' INT ')' )
                    {
                    match(input,BINARY,FOLLOW_BINARY_in_type832); 

                    // DDL.g:154:11: ( '(' INT ')' )
                    // DDL.g:154:13: '(' INT ')'
                    {
                    match(input,54,FOLLOW_54_in_type836); 

                    match(input,INT,FOLLOW_INT_in_type838); 

                    match(input,55,FOLLOW_55_in_type840); 

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
    // DDL.g:157:1: nameList : name ( '(' value ')' )? ( order )? ( ( ',' )? name ( '(' value ')' )? ( order )? )* ;
    public final DDLParser.nameList_return nameList() throws RecognitionException {
        DDLParser.nameList_return retval = new DDLParser.nameList_return();
        retval.start = input.LT(1);


        try {
            // DDL.g:158:2: ( name ( '(' value ')' )? ( order )? ( ( ',' )? name ( '(' value ')' )? ( order )? )* )
            // DDL.g:158:4: name ( '(' value ')' )? ( order )? ( ( ',' )? name ( '(' value ')' )? ( order )? )*
            {
            pushFollow(FOLLOW_name_in_nameList854);
            name();

            state._fsp--;


            // DDL.g:158:9: ( '(' value ')' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==54) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // DDL.g:158:11: '(' value ')'
                    {
                    match(input,54,FOLLOW_54_in_nameList858); 

                    pushFollow(FOLLOW_value_in_nameList860);
                    value();

                    state._fsp--;


                    match(input,55,FOLLOW_55_in_nameList862); 

                    }
                    break;

            }


            // DDL.g:158:28: ( order )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==ASC||LA53_0==DESC) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // DDL.g:158:28: order
                    {
                    pushFollow(FOLLOW_order_in_nameList867);
                    order();

                    state._fsp--;


                    }
                    break;

            }


            // DDL.g:158:35: ( ( ',' )? name ( '(' value ')' )? ( order )? )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==DEF||LA57_0==ID||LA57_0==56) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // DDL.g:158:37: ( ',' )? name ( '(' value ')' )? ( order )?
            	    {
            	    // DDL.g:158:37: ( ',' )?
            	    int alt54=2;
            	    int LA54_0 = input.LA(1);

            	    if ( (LA54_0==56) ) {
            	        alt54=1;
            	    }
            	    switch (alt54) {
            	        case 1 :
            	            // DDL.g:158:37: ','
            	            {
            	            match(input,56,FOLLOW_56_in_nameList872); 

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_name_in_nameList875);
            	    name();

            	    state._fsp--;


            	    // DDL.g:158:47: ( '(' value ')' )?
            	    int alt55=2;
            	    int LA55_0 = input.LA(1);

            	    if ( (LA55_0==54) ) {
            	        alt55=1;
            	    }
            	    switch (alt55) {
            	        case 1 :
            	            // DDL.g:158:49: '(' value ')'
            	            {
            	            match(input,54,FOLLOW_54_in_nameList879); 

            	            pushFollow(FOLLOW_value_in_nameList881);
            	            value();

            	            state._fsp--;


            	            match(input,55,FOLLOW_55_in_nameList883); 

            	            }
            	            break;

            	    }


            	    // DDL.g:158:66: ( order )?
            	    int alt56=2;
            	    int LA56_0 = input.LA(1);

            	    if ( (LA56_0==ASC||LA56_0==DESC) ) {
            	        alt56=1;
            	    }
            	    switch (alt56) {
            	        case 1 :
            	            // DDL.g:158:66: order
            	            {
            	            pushFollow(FOLLOW_order_in_nameList888);
            	            order();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
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
    // DDL.g:161:1: valueList : ( value | empty ) ( ',' ( value | empty ) )* ;
    public final void valueList() throws RecognitionException {
        try {
            // DDL.g:162:2: ( ( value | empty ) ( ',' ( value | empty ) )* )
            // DDL.g:162:4: ( value | empty ) ( ',' ( value | empty ) )*
            {
            // DDL.g:162:4: ( value | empty )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==DEF||LA58_0==ID||LA58_0==INT) ) {
                alt58=1;
            }
            else if ( (LA58_0==60) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;

            }
            switch (alt58) {
                case 1 :
                    // DDL.g:162:6: value
                    {
                    pushFollow(FOLLOW_value_in_valueList906);
                    value();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // DDL.g:162:14: empty
                    {
                    pushFollow(FOLLOW_empty_in_valueList910);
                    empty();

                    state._fsp--;


                    }
                    break;

            }


            // DDL.g:162:22: ( ',' ( value | empty ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==56) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // DDL.g:162:23: ',' ( value | empty )
            	    {
            	    match(input,56,FOLLOW_56_in_valueList915); 

            	    // DDL.g:162:27: ( value | empty )
            	    int alt59=2;
            	    int LA59_0 = input.LA(1);

            	    if ( (LA59_0==DEF||LA59_0==ID||LA59_0==INT) ) {
            	        alt59=1;
            	    }
            	    else if ( (LA59_0==60) ) {
            	        alt59=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 59, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt59) {
            	        case 1 :
            	            // DDL.g:162:29: value
            	            {
            	            pushFollow(FOLLOW_value_in_valueList919);
            	            value();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // DDL.g:162:37: empty
            	            {
            	            pushFollow(FOLLOW_empty_in_valueList923);
            	            empty();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
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
    // DDL.g:165:1: value : ( name | INT );
    public final void value() throws RecognitionException {
        try {
            // DDL.g:166:2: ( name | INT )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==DEF||LA61_0==ID) ) {
                alt61=1;
            }
            else if ( (LA61_0==INT) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;

            }
            switch (alt61) {
                case 1 :
                    // DDL.g:166:4: name
                    {
                    pushFollow(FOLLOW_name_in_value939);
                    name();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // DDL.g:167:4: INT
                    {
                    match(input,INT,FOLLOW_INT_in_value944); 

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
    // DDL.g:170:2: empty : '\\'\\'' ;
    public final void empty() throws RecognitionException {
        try {
            // DDL.g:171:2: ( '\\'\\'' )
            // DDL.g:171:4: '\\'\\''
            {
            match(input,60,FOLLOW_60_in_empty957); 

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
    // DDL.g:174:1: name : ( ID ( '.' ID )* | DEF ( '.' DEF )* );
    public final DDLParser.name_return name() throws RecognitionException {
        DDLParser.name_return retval = new DDLParser.name_return();
        retval.start = input.LT(1);


        try {
            // DDL.g:175:2: ( ID ( '.' ID )* | DEF ( '.' DEF )* )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==ID) ) {
                alt64=1;
            }
            else if ( (LA64_0==DEF) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;

            }
            switch (alt64) {
                case 1 :
                    // DDL.g:175:4: ID ( '.' ID )*
                    {
                    match(input,ID,FOLLOW_ID_in_name969); 

                    // DDL.g:175:7: ( '.' ID )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==57) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // DDL.g:175:9: '.' ID
                    	    {
                    	    match(input,57,FOLLOW_57_in_name973); 

                    	    match(input,ID,FOLLOW_ID_in_name975); 

                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // DDL.g:176:4: DEF ( '.' DEF )*
                    {
                    match(input,DEF,FOLLOW_DEF_in_name983); 

                    // DDL.g:176:8: ( '.' DEF )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==57) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // DDL.g:176:10: '.' DEF
                    	    {
                    	    match(input,57,FOLLOW_57_in_name987); 

                    	    match(input,DEF,FOLLOW_DEF_in_name989); 

                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);


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


    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA19_eotS =
        "\16\uffff";
    static final String DFA19_eofS =
        "\16\uffff";
    static final String DFA19_minS =
        "\1\16\1\12\1\uffff\1\20\2\12\2\uffff\1\34\1\20\1\uffff\1\20\2\12";
    static final String DFA19_maxS =
        "\2\60\1\uffff\1\70\2\71\2\uffff\1\34\1\70\1\uffff\1\20\2\71";
    static final String DFA19_acceptS =
        "\2\uffff\1\2\3\uffff\1\4\1\3\2\uffff\1\1\3\uffff";
    static final String DFA19_specialS =
        "\16\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\1\11\uffff\2\2\11\uffff\1\2\5\uffff\1\2\6\uffff\1\3",
            "\1\6\5\uffff\1\5\7\uffff\2\2\2\uffff\1\4\6\uffff\1\2\5\uffff"+
            "\1\2\6\uffff\1\2",
            "",
            "\1\7\13\uffff\1\7\6\uffff\1\2\22\uffff\3\7",
            "\1\6\15\uffff\1\12\12\uffff\1\12\5\uffff\1\12\6\uffff\1\11"+
            "\10\uffff\1\10",
            "\1\6\15\uffff\1\12\12\uffff\1\12\5\uffff\1\12\6\uffff\1\11"+
            "\10\uffff\1\13",
            "",
            "",
            "\1\14",
            "\1\7\13\uffff\1\7\6\uffff\1\12\22\uffff\3\7",
            "",
            "\1\15",
            "\1\6\15\uffff\1\12\12\uffff\1\12\5\uffff\1\12\6\uffff\1\11"+
            "\10\uffff\1\10",
            "\1\6\15\uffff\1\12\12\uffff\1\12\5\uffff\1\12\6\uffff\1\11"+
            "\10\uffff\1\13"
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "88:1: constraint : ( CONSTRAINT name key | ( CONSTRAINT )? ( FULLTEXT )? key | ( CONSTRAINT name )? UNIQUE ( name )? ( '(' nameList ')' )? | CONSTRAINT ( name )? CHECK '(' name IS NOT NULL ')' );";
        }
    }
 

    public static final BitSet FOLLOW_drop_in_start51 = new BitSet(new long[]{0x000800008010A002L});
    public static final BitSet FOLLOW_create_in_start55 = new BitSet(new long[]{0x000800008010A002L});
    public static final BitSet FOLLOW_namespace_in_start59 = new BitSet(new long[]{0x000800008010A002L});
    public static final BitSet FOLLOW_insert_in_start63 = new BitSet(new long[]{0x000800008010A002L});
    public static final BitSet FOLLOW_commit_in_start67 = new BitSet(new long[]{0x000800008010A002L});
    public static final BitSet FOLLOW_USE_in_namespace85 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_name_in_namespace87 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_namespace89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMIT_in_commit101 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_commit103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop114 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_TABLE_in_drop116 = new BitSet(new long[]{0x0000000030010000L});
    public static final BitSet FOLLOW_IF_in_drop120 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_EXISTS_in_drop122 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_nameList_in_drop127 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_drop129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create141 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_schema_in_create143 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_create145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create150 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_table_in_create152 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_create154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create159 = new BitSet(new long[]{0x0001020042000000L});
    public static final BitSet FOLLOW_index_in_create161 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_create163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert175 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_INTO_in_insert177 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_name_in_insert179 = new BitSet(new long[]{0x0050000000000000L});
    public static final BitSet FOLLOW_54_in_insert183 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_nameList_in_insert185 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_insert187 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_VALUES_in_insert192 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_insert194 = new BitSet(new long[]{0x1000000110010000L});
    public static final BitSet FOLLOW_valueList_in_insert196 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_insert198 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_insert200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCHEMA_in_schema212 = new BitSet(new long[]{0x0000000030010000L});
    public static final BitSet FOLLOW_IF_in_schema216 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_NOT_in_schema218 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_EXISTS_in_schema220 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_name_in_schema225 = new BitSet(new long[]{0x0000000010030A42L});
    public static final BitSet FOLLOW_parameter_in_schema227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TABLE_in_table245 = new BitSet(new long[]{0x0000000030010000L});
    public static final BitSet FOLLOW_IF_in_table249 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_NOT_in_table251 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_EXISTS_in_table253 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_name_in_table258 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_table260 = new BitSet(new long[]{0x0001020853014000L});
    public static final BitSet FOLLOW_definition_in_table262 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_table264 = new BitSet(new long[]{0x0000000010030A42L});
    public static final BitSet FOLLOW_parameter_in_table266 = new BitSet(new long[]{0x0000000010030A42L});
    public static final BitSet FOLLOW_column_in_definition284 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_constraint_in_definition288 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_index_in_definition292 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_definition298 = new BitSet(new long[]{0x0001020853014000L});
    public static final BitSet FOLLOW_column_in_definition302 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_constraint_in_definition306 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_index_in_definition310 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_name_in_column327 = new BitSet(new long[]{0x0000000010210080L});
    public static final BitSet FOLLOW_type_in_column329 = new BitSet(new long[]{0x0001066801020042L});
    public static final BitSet FOLLOW_option_in_column331 = new BitSet(new long[]{0x0001066801020042L});
    public static final BitSet FOLLOW_CONSTRAINT_in_constraint347 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_name_in_constraint349 = new BitSet(new long[]{0x0001020801000000L});
    public static final BitSet FOLLOW_key_in_constraint351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRAINT_in_constraint356 = new BitSet(new long[]{0x0001020803000000L});
    public static final BitSet FOLLOW_FULLTEXT_in_constraint359 = new BitSet(new long[]{0x0001020801000000L});
    public static final BitSet FOLLOW_key_in_constraint362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRAINT_in_constraint369 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_name_in_constraint371 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_UNIQUE_in_constraint376 = new BitSet(new long[]{0x0040000010010002L});
    public static final BitSet FOLLOW_name_in_constraint378 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_constraint383 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_nameList_in_constraint385 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_constraint387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRAINT_in_constraint395 = new BitSet(new long[]{0x0000000010010400L});
    public static final BitSet FOLLOW_name_in_constraint397 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_CHECK_in_constraint400 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_constraint402 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_name_in_constraint404 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IS_in_constraint406 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_NOT_in_constraint408 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_NULL_in_constraint410 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_constraint412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDEX_in_index435 = new BitSet(new long[]{0x0040010010010000L});
    public static final BitSet FOLLOW_name_in_index437 = new BitSet(new long[]{0x0040010000000000L});
    public static final BitSet FOLLOW_ON_in_index442 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_name_in_index444 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_index449 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_nameList_in_index451 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_index453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FULLTEXT_in_index458 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_name_in_index460 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_index462 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_nameList_in_index464 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_index466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_in_key494 = new BitSet(new long[]{0x0040000010010002L});
    public static final BitSet FOLLOW_name_in_key496 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_key501 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_nameList_in_key503 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_key505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREIGN_in_key516 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_KEY_in_key518 = new BitSet(new long[]{0x0040040010010000L});
    public static final BitSet FOLLOW_name_in_key520 = new BitSet(new long[]{0x0040040000000000L});
    public static final BitSet FOLLOW_54_in_key525 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_nameList_in_key527 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_key529 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_reference_in_key534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_key_in_option549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_in_option554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_option559 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_NULL_in_option562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUTO_INC_in_option567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_option572 = new BitSet(new long[]{0x1000004110010000L});
    public static final BitSet FOLLOW_value_in_option576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_option580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_empty_in_option584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REFERENCES_in_reference598 = new BitSet(new long[]{0x0040010010010002L});
    public static final BitSet FOLLOW_name_in_reference600 = new BitSet(new long[]{0x0040010000000002L});
    public static final BitSet FOLLOW_54_in_reference605 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_nameList_in_reference607 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_reference609 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_referenceOptions_in_reference614 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ON_in_referenceOptions627 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_DELETE_in_referenceOptions629 = new BitSet(new long[]{0x0000281000000100L});
    public static final BitSet FOLLOW_CASCADE_in_referenceOptions633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESTRICT_in_referenceOptions637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NO_in_referenceOptions641 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ACTION_in_referenceOptions643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_referenceOptions647 = new BitSet(new long[]{0x0000004000020000L});
    public static final BitSet FOLLOW_set_in_referenceOptions649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_referenceOptions664 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_UPDATE_in_referenceOptions666 = new BitSet(new long[]{0x0000200000000100L});
    public static final BitSet FOLLOW_CASCADE_in_referenceOptions670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_referenceOptions674 = new BitSet(new long[]{0x0000004000020000L});
    public static final BitSet FOLLOW_set_in_referenceOptions676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_parameter714 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_parameter716 = new BitSet(new long[]{0x0000000110010000L});
    public static final BitSet FOLLOW_value_in_parameter718 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_parameter720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_parameter728 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_CHARACTER_in_parameter733 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_SET_in_parameter735 = new BitSet(new long[]{0x0800000110010000L});
    public static final BitSet FOLLOW_59_in_parameter737 = new BitSet(new long[]{0x0000000110010000L});
    public static final BitSet FOLLOW_value_in_parameter740 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_parameter742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_parameter750 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COLLATE_in_parameter755 = new BitSet(new long[]{0x0800000110010000L});
    public static final BitSet FOLLOW_59_in_parameter757 = new BitSet(new long[]{0x0000000110010000L});
    public static final BitSet FOLLOW_value_in_parameter760 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_parameter762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUTO_INC_in_parameter768 = new BitSet(new long[]{0x0800000100000000L});
    public static final BitSet FOLLOW_59_in_parameter770 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INT_in_parameter773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_type785 = new BitSet(new long[]{0x0042000000000082L});
    public static final BitSet FOLLOW_54_in_type789 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INT_in_type791 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_56_in_type795 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INT_in_type797 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_type802 = new BitSet(new long[]{0x0002000000000082L});
    public static final BitSet FOLLOW_ENUM_in_type821 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_type823 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_nameList_in_type825 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_type827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BINARY_in_type832 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_type836 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INT_in_type838 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_type840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_nameList854 = new BitSet(new long[]{0x0140000010090022L});
    public static final BitSet FOLLOW_54_in_nameList858 = new BitSet(new long[]{0x0000000110010000L});
    public static final BitSet FOLLOW_value_in_nameList860 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_nameList862 = new BitSet(new long[]{0x0100000010090022L});
    public static final BitSet FOLLOW_order_in_nameList867 = new BitSet(new long[]{0x0100000010010002L});
    public static final BitSet FOLLOW_56_in_nameList872 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_name_in_nameList875 = new BitSet(new long[]{0x0140000010090022L});
    public static final BitSet FOLLOW_54_in_nameList879 = new BitSet(new long[]{0x0000000110010000L});
    public static final BitSet FOLLOW_value_in_nameList881 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_nameList883 = new BitSet(new long[]{0x0100000010090022L});
    public static final BitSet FOLLOW_order_in_nameList888 = new BitSet(new long[]{0x0100000010010002L});
    public static final BitSet FOLLOW_value_in_valueList906 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_empty_in_valueList910 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_valueList915 = new BitSet(new long[]{0x1000000110010000L});
    public static final BitSet FOLLOW_value_in_valueList919 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_empty_in_valueList923 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_name_in_value939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_value944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_empty957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_name969 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_name973 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_name975 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_DEF_in_name983 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_name987 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DEF_in_name989 = new BitSet(new long[]{0x0200000000000002L});

}