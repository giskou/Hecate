// $ANTLR 3.4 DDL.g 2013-01-24 17:05:58

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACTION", "ASC", "AUTO_INC", "BINARY", "CASCADE", "CHARACTER", "COLLATE", "COMMENT", "CREATE", "DEF", "DEFAULT", "DELETE", "DESC", "DROP", "ENUM", "ESC_SEQ", "EXISTS", "FOREIGN", "FULLTEXT", "HASH", "HEX_DIGIT", "ID", "IF", "INDEX", "INSERT", "INT", "INTO", "KEY", "NO", "NOT", "NULL", "OCTAL_ESC", "ON", "PRIMARY", "REFERENCES", "RESTRICT", "SCHEMA", "SET", "TABLE", "UNICODE_ESC", "UNIQUE", "UNSIGNED", "UPDATE", "USE", "VALUES", "WS", "'('", "')'", "','", "'.'", "';'", "'='", "'\\'\\''"
    };

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
    // DDL.g:33:1: start returns [Schema s] : ( drop | create | namespace | insert )+ ;
    public final Schema start() throws RecognitionException {
        Schema s = null;


        try {
            // DDL.g:34:2: ( ( drop | create | namespace | insert )+ )
            // DDL.g:34:4: ( drop | create | namespace | insert )+
            {
            // DDL.g:34:4: ( drop | create | namespace | insert )+
            int cnt1=0;
            loop1:
            do {
                int alt1=5;
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
            match(input,USE,FOLLOW_USE_in_namespace81); 

            pushFollow(FOLLOW_name_in_namespace83);
            name();

            state._fsp--;


            match(input,54,FOLLOW_54_in_namespace85); 

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



    // $ANTLR start "drop"
    // DDL.g:44:1: drop : DROP TABLE ( IF EXISTS )? nameList ';' ;
    public final void drop() throws RecognitionException {
        try {
            // DDL.g:45:2: ( DROP TABLE ( IF EXISTS )? nameList ';' )
            // DDL.g:45:4: DROP TABLE ( IF EXISTS )? nameList ';'
            {
            match(input,DROP,FOLLOW_DROP_in_drop96); 

            match(input,TABLE,FOLLOW_TABLE_in_drop98); 

            // DDL.g:45:15: ( IF EXISTS )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==IF) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // DDL.g:45:17: IF EXISTS
                    {
                    match(input,IF,FOLLOW_IF_in_drop102); 

                    match(input,EXISTS,FOLLOW_EXISTS_in_drop104); 

                    }
                    break;

            }


            pushFollow(FOLLOW_nameList_in_drop109);
            nameList();

            state._fsp--;


            match(input,54,FOLLOW_54_in_drop111); 

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
    // DDL.g:48:1: create : ( CREATE schema ';' | CREATE table ';' | CREATE index ';' );
    public final void create() throws RecognitionException {
        try {
            // DDL.g:49:2: ( CREATE schema ';' | CREATE table ';' | CREATE index ';' )
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
                    // DDL.g:49:4: CREATE schema ';'
                    {
                    match(input,CREATE,FOLLOW_CREATE_in_create123); 

                    pushFollow(FOLLOW_schema_in_create125);
                    schema();

                    state._fsp--;


                    match(input,54,FOLLOW_54_in_create127); 

                    }
                    break;
                case 2 :
                    // DDL.g:50:4: CREATE table ';'
                    {
                    match(input,CREATE,FOLLOW_CREATE_in_create132); 

                    pushFollow(FOLLOW_table_in_create134);
                    table();

                    state._fsp--;


                    match(input,54,FOLLOW_54_in_create136); 

                    }
                    break;
                case 3 :
                    // DDL.g:51:4: CREATE index ';'
                    {
                    match(input,CREATE,FOLLOW_CREATE_in_create141); 

                    pushFollow(FOLLOW_index_in_create143);
                    index();

                    state._fsp--;


                    match(input,54,FOLLOW_54_in_create145); 

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
    // DDL.g:54:1: insert : INSERT INTO name VALUES '(' valueList ')' ';' ;
    public final void insert() throws RecognitionException {
        try {
            // DDL.g:55:2: ( INSERT INTO name VALUES '(' valueList ')' ';' )
            // DDL.g:55:4: INSERT INTO name VALUES '(' valueList ')' ';'
            {
            match(input,INSERT,FOLLOW_INSERT_in_insert157); 

            match(input,INTO,FOLLOW_INTO_in_insert159); 

            pushFollow(FOLLOW_name_in_insert161);
            name();

            state._fsp--;


            match(input,VALUES,FOLLOW_VALUES_in_insert163); 

            match(input,50,FOLLOW_50_in_insert165); 

            pushFollow(FOLLOW_valueList_in_insert167);
            valueList();

            state._fsp--;


            match(input,51,FOLLOW_51_in_insert169); 

            match(input,54,FOLLOW_54_in_insert171); 

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
    // DDL.g:58:1: schema : SCHEMA ( IF NOT EXISTS )? name ( parameter )? ;
    public final void schema() throws RecognitionException {
        try {
            // DDL.g:59:2: ( SCHEMA ( IF NOT EXISTS )? name ( parameter )? )
            // DDL.g:59:4: SCHEMA ( IF NOT EXISTS )? name ( parameter )?
            {
            match(input,SCHEMA,FOLLOW_SCHEMA_in_schema183); 

            // DDL.g:59:11: ( IF NOT EXISTS )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==IF) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // DDL.g:59:13: IF NOT EXISTS
                    {
                    match(input,IF,FOLLOW_IF_in_schema187); 

                    match(input,NOT,FOLLOW_NOT_in_schema189); 

                    match(input,EXISTS,FOLLOW_EXISTS_in_schema191); 

                    }
                    break;

            }


            pushFollow(FOLLOW_name_in_schema196);
            name();

            state._fsp--;


            // DDL.g:59:35: ( parameter )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==AUTO_INC||(LA5_0 >= CHARACTER && LA5_0 <= COLLATE)||(LA5_0 >= DEF && LA5_0 <= DEFAULT)||LA5_0==ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // DDL.g:59:35: parameter
                    {
                    pushFollow(FOLLOW_parameter_in_schema198);
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
    // DDL.g:62:1: table : TABLE ( IF NOT EXISTS )? name '(' definition ')' ( parameter )* ;
    public final void table() throws RecognitionException {
        DDLParser.name_return name1 =null;



        		am.clear();
        	
        try {
            // DDL.g:66:2: ( TABLE ( IF NOT EXISTS )? name '(' definition ')' ( parameter )* )
            // DDL.g:66:4: TABLE ( IF NOT EXISTS )? name '(' definition ')' ( parameter )*
            {
            match(input,TABLE,FOLLOW_TABLE_in_table216); 

            // DDL.g:66:10: ( IF NOT EXISTS )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==IF) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // DDL.g:66:12: IF NOT EXISTS
                    {
                    match(input,IF,FOLLOW_IF_in_table220); 

                    match(input,NOT,FOLLOW_NOT_in_table222); 

                    match(input,EXISTS,FOLLOW_EXISTS_in_table224); 

                    }
                    break;

            }


            pushFollow(FOLLOW_name_in_table229);
            name1=name();

            state._fsp--;


            match(input,50,FOLLOW_50_in_table231); 

            pushFollow(FOLLOW_definition_in_table233);
            definition();

            state._fsp--;


            match(input,51,FOLLOW_51_in_table235); 

            // DDL.g:66:53: ( parameter )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==AUTO_INC||(LA7_0 >= CHARACTER && LA7_0 <= COLLATE)||(LA7_0 >= DEF && LA7_0 <= DEFAULT)||LA7_0==ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // DDL.g:66:53: parameter
            	    {
            	    pushFollow(FOLLOW_parameter_in_table237);
            	    parameter();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // DDL.g:72:1: definition : ( column | constraint | index ) ( ',' ( column | constraint | index ) )* ;
    public final void definition() throws RecognitionException {
        try {
            // DDL.g:73:2: ( ( column | constraint | index ) ( ',' ( column | constraint | index ) )* )
            // DDL.g:73:4: ( column | constraint | index ) ( ',' ( column | constraint | index ) )*
            {
            // DDL.g:73:4: ( column | constraint | index )
            int alt8=3;
            switch ( input.LA(1) ) {
            case DEF:
            case ID:
                {
                alt8=1;
                }
                break;
            case FULLTEXT:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==FOREIGN||LA8_2==KEY||LA8_2==PRIMARY||LA8_2==UNIQUE) ) {
                    alt8=2;
                }
                else if ( (LA8_2==DEF||LA8_2==ID) ) {
                    alt8=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;

                }
                }
                break;
            case UNIQUE:
                {
                int LA8_3 = input.LA(2);

                if ( (LA8_3==DEF||LA8_3==ID||LA8_3==KEY||(LA8_3 >= 50 && LA8_3 <= 52)) ) {
                    alt8=2;
                }
                else if ( (LA8_3==INDEX) ) {
                    alt8=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 3, input);

                    throw nvae;

                }
                }
                break;
            case FOREIGN:
            case KEY:
                {
                alt8=2;
                }
                break;
            case PRIMARY:
                {
                int LA8_5 = input.LA(2);

                if ( (LA8_5==KEY) ) {
                    alt8=2;
                }
                else if ( (LA8_5==INDEX) ) {
                    alt8=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 5, input);

                    throw nvae;

                }
                }
                break;
            case INDEX:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // DDL.g:73:6: column
                    {
                    pushFollow(FOLLOW_column_in_definition255);
                    column();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // DDL.g:73:15: constraint
                    {
                    pushFollow(FOLLOW_constraint_in_definition259);
                    constraint();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // DDL.g:73:28: index
                    {
                    pushFollow(FOLLOW_index_in_definition263);
                    index();

                    state._fsp--;


                    }
                    break;

            }


            // DDL.g:73:36: ( ',' ( column | constraint | index ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==52) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // DDL.g:73:38: ',' ( column | constraint | index )
            	    {
            	    match(input,52,FOLLOW_52_in_definition269); 

            	    // DDL.g:73:42: ( column | constraint | index )
            	    int alt9=3;
            	    switch ( input.LA(1) ) {
            	    case DEF:
            	    case ID:
            	        {
            	        alt9=1;
            	        }
            	        break;
            	    case FULLTEXT:
            	        {
            	        int LA9_2 = input.LA(2);

            	        if ( (LA9_2==FOREIGN||LA9_2==KEY||LA9_2==PRIMARY||LA9_2==UNIQUE) ) {
            	            alt9=2;
            	        }
            	        else if ( (LA9_2==DEF||LA9_2==ID) ) {
            	            alt9=3;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 9, 2, input);

            	            throw nvae;

            	        }
            	        }
            	        break;
            	    case UNIQUE:
            	        {
            	        int LA9_3 = input.LA(2);

            	        if ( (LA9_3==DEF||LA9_3==ID||LA9_3==KEY||(LA9_3 >= 50 && LA9_3 <= 52)) ) {
            	            alt9=2;
            	        }
            	        else if ( (LA9_3==INDEX) ) {
            	            alt9=3;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 9, 3, input);

            	            throw nvae;

            	        }
            	        }
            	        break;
            	    case FOREIGN:
            	    case KEY:
            	        {
            	        alt9=2;
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
            	            // DDL.g:73:44: column
            	            {
            	            pushFollow(FOLLOW_column_in_definition273);
            	            column();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // DDL.g:73:53: constraint
            	            {
            	            pushFollow(FOLLOW_constraint_in_definition277);
            	            constraint();

            	            state._fsp--;


            	            }
            	            break;
            	        case 3 :
            	            // DDL.g:73:66: index
            	            {
            	            pushFollow(FOLLOW_index_in_definition281);
            	            index();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // DDL.g:76:1: column : name type ( option )* ;
    public final void column() throws RecognitionException {
        DDLParser.type_return type2 =null;

        DDLParser.name_return name3 =null;


        try {
            // DDL.g:77:2: ( name type ( option )* )
            // DDL.g:77:4: name type ( option )*
            {
            pushFollow(FOLLOW_name_in_column298);
            name3=name();

            state._fsp--;


            pushFollow(FOLLOW_type_in_column300);
            type2=type();

            state._fsp--;


            // DDL.g:77:14: ( option )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==AUTO_INC||LA11_0==DEFAULT||LA11_0==FOREIGN||LA11_0==KEY||(LA11_0 >= NOT && LA11_0 <= NULL)||(LA11_0 >= PRIMARY && LA11_0 <= REFERENCES)||LA11_0==UNIQUE) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // DDL.g:77:14: option
            	    {
            	    pushFollow(FOLLOW_option_in_column302);
            	    option();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // DDL.g:84:1: constraint : ( ( FULLTEXT )? key | UNIQUE ( name )? ( '(' nameList ')' )? );
    public final void constraint() throws RecognitionException {
        try {
            // DDL.g:85:2: ( ( FULLTEXT )? key | UNIQUE ( name )? ( '(' nameList ')' )? )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0 >= FOREIGN && LA15_0 <= FULLTEXT)||LA15_0==KEY||LA15_0==PRIMARY) ) {
                alt15=1;
            }
            else if ( (LA15_0==UNIQUE) ) {
                int LA15_2 = input.LA(2);

                if ( (LA15_2==KEY) ) {
                    alt15=1;
                }
                else if ( (LA15_2==DEF||LA15_2==ID||(LA15_2 >= 50 && LA15_2 <= 52)) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // DDL.g:85:4: ( FULLTEXT )? key
                    {
                    // DDL.g:85:4: ( FULLTEXT )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==FULLTEXT) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // DDL.g:85:4: FULLTEXT
                            {
                            match(input,FULLTEXT,FOLLOW_FULLTEXT_in_constraint318); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_key_in_constraint321);
                    key();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // DDL.g:86:4: UNIQUE ( name )? ( '(' nameList ')' )?
                    {
                    match(input,UNIQUE,FOLLOW_UNIQUE_in_constraint326); 

                    // DDL.g:86:11: ( name )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==DEF||LA13_0==ID) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // DDL.g:86:11: name
                            {
                            pushFollow(FOLLOW_name_in_constraint328);
                            name();

                            state._fsp--;


                            }
                            break;

                    }


                    // DDL.g:86:17: ( '(' nameList ')' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==50) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // DDL.g:86:19: '(' nameList ')'
                            {
                            match(input,50,FOLLOW_50_in_constraint333); 

                            pushFollow(FOLLOW_nameList_in_constraint335);
                            nameList();

                            state._fsp--;


                            match(input,51,FOLLOW_51_in_constraint337); 

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
    // $ANTLR end "constraint"



    // $ANTLR start "index"
    // DDL.g:89:1: index : ( ( UNIQUE | PRIMARY )? INDEX ( name )? ( ON name )? '(' nameList ')' | FULLTEXT name '(' nameList ')' );
    public final void index() throws RecognitionException {
        try {
            // DDL.g:90:2: ( ( UNIQUE | PRIMARY )? INDEX ( name )? ( ON name )? '(' nameList ')' | FULLTEXT name '(' nameList ')' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==INDEX||LA19_0==PRIMARY||LA19_0==UNIQUE) ) {
                alt19=1;
            }
            else if ( (LA19_0==FULLTEXT) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // DDL.g:90:4: ( UNIQUE | PRIMARY )? INDEX ( name )? ( ON name )? '(' nameList ')'
                    {
                    // DDL.g:90:4: ( UNIQUE | PRIMARY )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==PRIMARY||LA16_0==UNIQUE) ) {
                        alt16=1;
                    }
                    switch (alt16) {
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


                    match(input,INDEX,FOLLOW_INDEX_in_index363); 

                    // DDL.g:90:32: ( name )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==DEF||LA17_0==ID) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // DDL.g:90:32: name
                            {
                            pushFollow(FOLLOW_name_in_index365);
                            name();

                            state._fsp--;


                            }
                            break;

                    }


                    // DDL.g:90:38: ( ON name )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==ON) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // DDL.g:90:40: ON name
                            {
                            match(input,ON,FOLLOW_ON_in_index370); 

                            pushFollow(FOLLOW_name_in_index372);
                            name();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input,50,FOLLOW_50_in_index377); 

                    pushFollow(FOLLOW_nameList_in_index379);
                    nameList();

                    state._fsp--;


                    match(input,51,FOLLOW_51_in_index381); 

                    }
                    break;
                case 2 :
                    // DDL.g:91:4: FULLTEXT name '(' nameList ')'
                    {
                    match(input,FULLTEXT,FOLLOW_FULLTEXT_in_index386); 

                    pushFollow(FOLLOW_name_in_index388);
                    name();

                    state._fsp--;


                    match(input,50,FOLLOW_50_in_index390); 

                    pushFollow(FOLLOW_nameList_in_index392);
                    nameList();

                    state._fsp--;


                    match(input,51,FOLLOW_51_in_index394); 

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
    // DDL.g:94:1: key : ( ( UNIQUE | PRIMARY )? KEY ( name )? ( '(' nameList ')' )? | FOREIGN KEY ( name )? ( '(' nameList ')' )? reference );
    public final void key() throws RecognitionException {
        DDLParser.nameList_return nameList4 =null;



        		km.clear();
        	
        try {
            // DDL.g:98:2: ( ( UNIQUE | PRIMARY )? KEY ( name )? ( '(' nameList ')' )? | FOREIGN KEY ( name )? ( '(' nameList ')' )? reference )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==KEY||LA25_0==PRIMARY||LA25_0==UNIQUE) ) {
                alt25=1;
            }
            else if ( (LA25_0==FOREIGN) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // DDL.g:98:4: ( UNIQUE | PRIMARY )? KEY ( name )? ( '(' nameList ')' )?
                    {
                    // DDL.g:98:4: ( UNIQUE | PRIMARY )?
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


                    match(input,KEY,FOLLOW_KEY_in_key422); 

                    // DDL.g:98:30: ( name )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==DEF||LA21_0==ID) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // DDL.g:98:30: name
                            {
                            pushFollow(FOLLOW_name_in_key424);
                            name();

                            state._fsp--;


                            }
                            break;

                    }


                    // DDL.g:98:36: ( '(' nameList ')' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==50) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // DDL.g:98:38: '(' nameList ')'
                            {
                            match(input,50,FOLLOW_50_in_key429); 

                            pushFollow(FOLLOW_nameList_in_key431);
                            nameList4=nameList();

                            state._fsp--;


                            match(input,51,FOLLOW_51_in_key433); 

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
                    // DDL.g:111:4: FOREIGN KEY ( name )? ( '(' nameList ')' )? reference
                    {
                    match(input,FOREIGN,FOLLOW_FOREIGN_in_key444); 

                    match(input,KEY,FOLLOW_KEY_in_key446); 

                    // DDL.g:111:16: ( name )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==DEF||LA23_0==ID) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // DDL.g:111:16: name
                            {
                            pushFollow(FOLLOW_name_in_key448);
                            name();

                            state._fsp--;


                            }
                            break;

                    }


                    // DDL.g:111:22: ( '(' nameList ')' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==50) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // DDL.g:111:24: '(' nameList ')'
                            {
                            match(input,50,FOLLOW_50_in_key453); 

                            pushFollow(FOLLOW_nameList_in_key455);
                            nameList();

                            state._fsp--;


                            match(input,51,FOLLOW_51_in_key457); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_reference_in_key462);
                    reference();

                    state._fsp--;


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
    // DDL.g:114:1: option : ( key | reference | ( NOT )? NULL | AUTO_INC | DEFAULT ( value | NULL | empty ) );
    public final void option() throws RecognitionException {
        try {
            // DDL.g:115:2: ( key | reference | ( NOT )? NULL | AUTO_INC | DEFAULT ( value | NULL | empty ) )
            int alt28=5;
            switch ( input.LA(1) ) {
            case FOREIGN:
            case KEY:
            case PRIMARY:
            case UNIQUE:
                {
                alt28=1;
                }
                break;
            case REFERENCES:
                {
                alt28=2;
                }
                break;
            case NOT:
            case NULL:
                {
                alt28=3;
                }
                break;
            case AUTO_INC:
                {
                alt28=4;
                }
                break;
            case DEFAULT:
                {
                alt28=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }

            switch (alt28) {
                case 1 :
                    // DDL.g:115:4: key
                    {
                    pushFollow(FOLLOW_key_in_option474);
                    key();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // DDL.g:116:4: reference
                    {
                    pushFollow(FOLLOW_reference_in_option479);
                    reference();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // DDL.g:117:4: ( NOT )? NULL
                    {
                    // DDL.g:117:4: ( NOT )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==NOT) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // DDL.g:117:4: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_option484); 

                            }
                            break;

                    }


                    match(input,NULL,FOLLOW_NULL_in_option487); 

                    }
                    break;
                case 4 :
                    // DDL.g:118:4: AUTO_INC
                    {
                    match(input,AUTO_INC,FOLLOW_AUTO_INC_in_option492); 

                    }
                    break;
                case 5 :
                    // DDL.g:119:4: DEFAULT ( value | NULL | empty )
                    {
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_option497); 

                    // DDL.g:119:12: ( value | NULL | empty )
                    int alt27=3;
                    switch ( input.LA(1) ) {
                    case DEF:
                    case ID:
                    case INT:
                        {
                        alt27=1;
                        }
                        break;
                    case NULL:
                        {
                        alt27=2;
                        }
                        break;
                    case 56:
                        {
                        alt27=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;

                    }

                    switch (alt27) {
                        case 1 :
                            // DDL.g:119:14: value
                            {
                            pushFollow(FOLLOW_value_in_option501);
                            value();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // DDL.g:119:22: NULL
                            {
                            match(input,NULL,FOLLOW_NULL_in_option505); 

                            }
                            break;
                        case 3 :
                            // DDL.g:119:29: empty
                            {
                            pushFollow(FOLLOW_empty_in_option509);
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
    // DDL.g:122:1: reference : REFERENCES ( name )? ( '(' nameList ')' )? ( referenceOptions )* ;
    public final void reference() throws RecognitionException {
        try {
            // DDL.g:123:2: ( REFERENCES ( name )? ( '(' nameList ')' )? ( referenceOptions )* )
            // DDL.g:123:4: REFERENCES ( name )? ( '(' nameList ')' )? ( referenceOptions )*
            {
            match(input,REFERENCES,FOLLOW_REFERENCES_in_reference523); 

            // DDL.g:123:15: ( name )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==DEF||LA29_0==ID) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // DDL.g:123:15: name
                    {
                    pushFollow(FOLLOW_name_in_reference525);
                    name();

                    state._fsp--;


                    }
                    break;

            }


            // DDL.g:123:21: ( '(' nameList ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==50) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // DDL.g:123:23: '(' nameList ')'
                    {
                    match(input,50,FOLLOW_50_in_reference530); 

                    pushFollow(FOLLOW_nameList_in_reference532);
                    nameList();

                    state._fsp--;


                    match(input,51,FOLLOW_51_in_reference534); 

                    }
                    break;

            }


            // DDL.g:123:43: ( referenceOptions )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==ON) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // DDL.g:123:43: referenceOptions
            	    {
            	    pushFollow(FOLLOW_referenceOptions_in_reference539);
            	    referenceOptions();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // DDL.g:126:1: referenceOptions : ( ON DELETE ( CASCADE | RESTRICT | NO ACTION | SET ( DEFAULT | NULL ) ) | ON UPDATE ( CASCADE | SET ( DEFAULT | NULL ) ) );
    public final void referenceOptions() throws RecognitionException {
        try {
            // DDL.g:127:2: ( ON DELETE ( CASCADE | RESTRICT | NO ACTION | SET ( DEFAULT | NULL ) ) | ON UPDATE ( CASCADE | SET ( DEFAULT | NULL ) ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==ON) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==DELETE) ) {
                    alt34=1;
                }
                else if ( (LA34_1==UPDATE) ) {
                    alt34=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }
            switch (alt34) {
                case 1 :
                    // DDL.g:127:4: ON DELETE ( CASCADE | RESTRICT | NO ACTION | SET ( DEFAULT | NULL ) )
                    {
                    match(input,ON,FOLLOW_ON_in_referenceOptions552); 

                    match(input,DELETE,FOLLOW_DELETE_in_referenceOptions554); 

                    // DDL.g:127:14: ( CASCADE | RESTRICT | NO ACTION | SET ( DEFAULT | NULL ) )
                    int alt32=4;
                    switch ( input.LA(1) ) {
                    case CASCADE:
                        {
                        alt32=1;
                        }
                        break;
                    case RESTRICT:
                        {
                        alt32=2;
                        }
                        break;
                    case NO:
                        {
                        alt32=3;
                        }
                        break;
                    case SET:
                        {
                        alt32=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;

                    }

                    switch (alt32) {
                        case 1 :
                            // DDL.g:127:16: CASCADE
                            {
                            match(input,CASCADE,FOLLOW_CASCADE_in_referenceOptions558); 

                            }
                            break;
                        case 2 :
                            // DDL.g:127:26: RESTRICT
                            {
                            match(input,RESTRICT,FOLLOW_RESTRICT_in_referenceOptions562); 

                            }
                            break;
                        case 3 :
                            // DDL.g:127:37: NO ACTION
                            {
                            match(input,NO,FOLLOW_NO_in_referenceOptions566); 

                            match(input,ACTION,FOLLOW_ACTION_in_referenceOptions568); 

                            }
                            break;
                        case 4 :
                            // DDL.g:127:49: SET ( DEFAULT | NULL )
                            {
                            match(input,SET,FOLLOW_SET_in_referenceOptions572); 

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
                    // DDL.g:128:4: ON UPDATE ( CASCADE | SET ( DEFAULT | NULL ) )
                    {
                    match(input,ON,FOLLOW_ON_in_referenceOptions589); 

                    match(input,UPDATE,FOLLOW_UPDATE_in_referenceOptions591); 

                    // DDL.g:128:14: ( CASCADE | SET ( DEFAULT | NULL ) )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==CASCADE) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==SET) ) {
                        alt33=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;

                    }
                    switch (alt33) {
                        case 1 :
                            // DDL.g:128:16: CASCADE
                            {
                            match(input,CASCADE,FOLLOW_CASCADE_in_referenceOptions595); 

                            }
                            break;
                        case 2 :
                            // DDL.g:128:26: SET ( DEFAULT | NULL )
                            {
                            match(input,SET,FOLLOW_SET_in_referenceOptions599); 

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
    // DDL.g:130:1: order : ( ASC | DESC );
    public final void order() throws RecognitionException {
        try {
            // DDL.g:131:2: ( ASC | DESC )
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
    // DDL.g:135:1: parameter : ( name '=' value ( ',' )? | ( DEFAULT )? CHARACTER SET ( '=' )? value ( ',' )? | ( DEFAULT )? COLLATE ( '=' )? value ( ',' )? | AUTO_INC ( '=' )? INT );
    public final void parameter() throws RecognitionException {
        try {
            // DDL.g:136:2: ( name '=' value ( ',' )? | ( DEFAULT )? CHARACTER SET ( '=' )? value ( ',' )? | ( DEFAULT )? COLLATE ( '=' )? value ( ',' )? | AUTO_INC ( '=' )? INT )
            int alt43=4;
            switch ( input.LA(1) ) {
            case DEF:
            case ID:
                {
                alt43=1;
                }
                break;
            case DEFAULT:
                {
                int LA43_2 = input.LA(2);

                if ( (LA43_2==CHARACTER) ) {
                    alt43=2;
                }
                else if ( (LA43_2==COLLATE) ) {
                    alt43=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 2, input);

                    throw nvae;

                }
                }
                break;
            case CHARACTER:
                {
                alt43=2;
                }
                break;
            case COLLATE:
                {
                alt43=3;
                }
                break;
            case AUTO_INC:
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
                    // DDL.g:136:4: name '=' value ( ',' )?
                    {
                    pushFollow(FOLLOW_name_in_parameter639);
                    name();

                    state._fsp--;


                    match(input,55,FOLLOW_55_in_parameter641); 

                    pushFollow(FOLLOW_value_in_parameter643);
                    value();

                    state._fsp--;


                    // DDL.g:136:19: ( ',' )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==52) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // DDL.g:136:19: ','
                            {
                            match(input,52,FOLLOW_52_in_parameter645); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // DDL.g:137:4: ( DEFAULT )? CHARACTER SET ( '=' )? value ( ',' )?
                    {
                    // DDL.g:137:4: ( DEFAULT )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==DEFAULT) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // DDL.g:137:6: DEFAULT
                            {
                            match(input,DEFAULT,FOLLOW_DEFAULT_in_parameter653); 

                            }
                            break;

                    }


                    match(input,CHARACTER,FOLLOW_CHARACTER_in_parameter658); 

                    match(input,SET,FOLLOW_SET_in_parameter660); 

                    // DDL.g:137:31: ( '=' )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==55) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // DDL.g:137:31: '='
                            {
                            match(input,55,FOLLOW_55_in_parameter662); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_value_in_parameter665);
                    value();

                    state._fsp--;


                    // DDL.g:137:42: ( ',' )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==52) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // DDL.g:137:42: ','
                            {
                            match(input,52,FOLLOW_52_in_parameter667); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // DDL.g:138:4: ( DEFAULT )? COLLATE ( '=' )? value ( ',' )?
                    {
                    // DDL.g:138:4: ( DEFAULT )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==DEFAULT) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // DDL.g:138:6: DEFAULT
                            {
                            match(input,DEFAULT,FOLLOW_DEFAULT_in_parameter675); 

                            }
                            break;

                    }


                    match(input,COLLATE,FOLLOW_COLLATE_in_parameter680); 

                    // DDL.g:138:25: ( '=' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==55) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // DDL.g:138:25: '='
                            {
                            match(input,55,FOLLOW_55_in_parameter682); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_value_in_parameter685);
                    value();

                    state._fsp--;


                    // DDL.g:138:36: ( ',' )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==52) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // DDL.g:138:36: ','
                            {
                            match(input,52,FOLLOW_52_in_parameter687); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // DDL.g:139:4: AUTO_INC ( '=' )? INT
                    {
                    match(input,AUTO_INC,FOLLOW_AUTO_INC_in_parameter693); 

                    // DDL.g:139:13: ( '=' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==55) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // DDL.g:139:13: '='
                            {
                            match(input,55,FOLLOW_55_in_parameter695); 

                            }
                            break;

                    }


                    match(input,INT,FOLLOW_INT_in_parameter698); 

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
    // DDL.g:142:1: type : ( name ( '(' INT ( ',' INT )? ')' )? ( UNSIGNED | BINARY )? | ENUM '(' nameList ')' | BINARY ( '(' INT ')' ) );
    public final DDLParser.type_return type() throws RecognitionException {
        DDLParser.type_return retval = new DDLParser.type_return();
        retval.start = input.LT(1);


        try {
            // DDL.g:143:2: ( name ( '(' INT ( ',' INT )? ')' )? ( UNSIGNED | BINARY )? | ENUM '(' nameList ')' | BINARY ( '(' INT ')' ) )
            int alt47=3;
            switch ( input.LA(1) ) {
            case DEF:
            case ID:
                {
                alt47=1;
                }
                break;
            case ENUM:
                {
                alt47=2;
                }
                break;
            case BINARY:
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
                    // DDL.g:143:4: name ( '(' INT ( ',' INT )? ')' )? ( UNSIGNED | BINARY )?
                    {
                    pushFollow(FOLLOW_name_in_type710);
                    name();

                    state._fsp--;


                    // DDL.g:143:9: ( '(' INT ( ',' INT )? ')' )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==50) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // DDL.g:143:11: '(' INT ( ',' INT )? ')'
                            {
                            match(input,50,FOLLOW_50_in_type714); 

                            match(input,INT,FOLLOW_INT_in_type716); 

                            // DDL.g:143:19: ( ',' INT )?
                            int alt44=2;
                            int LA44_0 = input.LA(1);

                            if ( (LA44_0==52) ) {
                                alt44=1;
                            }
                            switch (alt44) {
                                case 1 :
                                    // DDL.g:143:21: ',' INT
                                    {
                                    match(input,52,FOLLOW_52_in_type720); 

                                    match(input,INT,FOLLOW_INT_in_type722); 

                                    }
                                    break;

                            }


                            match(input,51,FOLLOW_51_in_type727); 

                            }
                            break;

                    }


                    // DDL.g:143:39: ( UNSIGNED | BINARY )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==BINARY||LA46_0==UNSIGNED) ) {
                        alt46=1;
                    }
                    switch (alt46) {
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
                    // DDL.g:144:4: ENUM '(' nameList ')'
                    {
                    match(input,ENUM,FOLLOW_ENUM_in_type746); 

                    match(input,50,FOLLOW_50_in_type748); 

                    pushFollow(FOLLOW_nameList_in_type750);
                    nameList();

                    state._fsp--;


                    match(input,51,FOLLOW_51_in_type752); 

                    }
                    break;
                case 3 :
                    // DDL.g:145:4: BINARY ( '(' INT ')' )
                    {
                    match(input,BINARY,FOLLOW_BINARY_in_type757); 

                    // DDL.g:145:11: ( '(' INT ')' )
                    // DDL.g:145:13: '(' INT ')'
                    {
                    match(input,50,FOLLOW_50_in_type761); 

                    match(input,INT,FOLLOW_INT_in_type763); 

                    match(input,51,FOLLOW_51_in_type765); 

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
    // DDL.g:148:1: nameList : name ( '(' value ')' )? ( order )? ( ( ',' )? name ( '(' value ')' )? ( order )? )* ;
    public final DDLParser.nameList_return nameList() throws RecognitionException {
        DDLParser.nameList_return retval = new DDLParser.nameList_return();
        retval.start = input.LT(1);


        try {
            // DDL.g:149:2: ( name ( '(' value ')' )? ( order )? ( ( ',' )? name ( '(' value ')' )? ( order )? )* )
            // DDL.g:149:4: name ( '(' value ')' )? ( order )? ( ( ',' )? name ( '(' value ')' )? ( order )? )*
            {
            pushFollow(FOLLOW_name_in_nameList779);
            name();

            state._fsp--;


            // DDL.g:149:9: ( '(' value ')' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==50) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // DDL.g:149:11: '(' value ')'
                    {
                    match(input,50,FOLLOW_50_in_nameList783); 

                    pushFollow(FOLLOW_value_in_nameList785);
                    value();

                    state._fsp--;


                    match(input,51,FOLLOW_51_in_nameList787); 

                    }
                    break;

            }


            // DDL.g:149:28: ( order )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==ASC||LA49_0==DESC) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // DDL.g:149:28: order
                    {
                    pushFollow(FOLLOW_order_in_nameList792);
                    order();

                    state._fsp--;


                    }
                    break;

            }


            // DDL.g:149:35: ( ( ',' )? name ( '(' value ')' )? ( order )? )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==DEF||LA53_0==ID||LA53_0==52) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // DDL.g:149:37: ( ',' )? name ( '(' value ')' )? ( order )?
            	    {
            	    // DDL.g:149:37: ( ',' )?
            	    int alt50=2;
            	    int LA50_0 = input.LA(1);

            	    if ( (LA50_0==52) ) {
            	        alt50=1;
            	    }
            	    switch (alt50) {
            	        case 1 :
            	            // DDL.g:149:37: ','
            	            {
            	            match(input,52,FOLLOW_52_in_nameList797); 

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_name_in_nameList800);
            	    name();

            	    state._fsp--;


            	    // DDL.g:149:47: ( '(' value ')' )?
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( (LA51_0==50) ) {
            	        alt51=1;
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // DDL.g:149:49: '(' value ')'
            	            {
            	            match(input,50,FOLLOW_50_in_nameList804); 

            	            pushFollow(FOLLOW_value_in_nameList806);
            	            value();

            	            state._fsp--;


            	            match(input,51,FOLLOW_51_in_nameList808); 

            	            }
            	            break;

            	    }


            	    // DDL.g:149:66: ( order )?
            	    int alt52=2;
            	    int LA52_0 = input.LA(1);

            	    if ( (LA52_0==ASC||LA52_0==DESC) ) {
            	        alt52=1;
            	    }
            	    switch (alt52) {
            	        case 1 :
            	            // DDL.g:149:66: order
            	            {
            	            pushFollow(FOLLOW_order_in_nameList813);
            	            order();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
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
    // DDL.g:152:1: valueList : ( value | empty ) ( ',' ( value | empty ) )* ;
    public final void valueList() throws RecognitionException {
        try {
            // DDL.g:153:2: ( ( value | empty ) ( ',' ( value | empty ) )* )
            // DDL.g:153:4: ( value | empty ) ( ',' ( value | empty ) )*
            {
            // DDL.g:153:4: ( value | empty )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==DEF||LA54_0==ID||LA54_0==INT) ) {
                alt54=1;
            }
            else if ( (LA54_0==56) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;

            }
            switch (alt54) {
                case 1 :
                    // DDL.g:153:6: value
                    {
                    pushFollow(FOLLOW_value_in_valueList831);
                    value();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // DDL.g:153:14: empty
                    {
                    pushFollow(FOLLOW_empty_in_valueList835);
                    empty();

                    state._fsp--;


                    }
                    break;

            }


            // DDL.g:153:22: ( ',' ( value | empty ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==52) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // DDL.g:153:23: ',' ( value | empty )
            	    {
            	    match(input,52,FOLLOW_52_in_valueList840); 

            	    // DDL.g:153:27: ( value | empty )
            	    int alt55=2;
            	    int LA55_0 = input.LA(1);

            	    if ( (LA55_0==DEF||LA55_0==ID||LA55_0==INT) ) {
            	        alt55=1;
            	    }
            	    else if ( (LA55_0==56) ) {
            	        alt55=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 55, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt55) {
            	        case 1 :
            	            // DDL.g:153:29: value
            	            {
            	            pushFollow(FOLLOW_value_in_valueList844);
            	            value();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // DDL.g:153:37: empty
            	            {
            	            pushFollow(FOLLOW_empty_in_valueList848);
            	            empty();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
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
    // DDL.g:156:1: value : ( name | INT );
    public final void value() throws RecognitionException {
        try {
            // DDL.g:157:2: ( name | INT )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==DEF||LA57_0==ID) ) {
                alt57=1;
            }
            else if ( (LA57_0==INT) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;

            }
            switch (alt57) {
                case 1 :
                    // DDL.g:157:4: name
                    {
                    pushFollow(FOLLOW_name_in_value864);
                    name();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // DDL.g:158:4: INT
                    {
                    match(input,INT,FOLLOW_INT_in_value869); 

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
    // DDL.g:161:2: empty : '\\'\\'' ;
    public final void empty() throws RecognitionException {
        try {
            // DDL.g:162:2: ( '\\'\\'' )
            // DDL.g:162:4: '\\'\\''
            {
            match(input,56,FOLLOW_56_in_empty882); 

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
    // DDL.g:165:1: name : ( ID ( '.' ID )* | DEF ( '.' DEF )* );
    public final DDLParser.name_return name() throws RecognitionException {
        DDLParser.name_return retval = new DDLParser.name_return();
        retval.start = input.LT(1);


        try {
            // DDL.g:166:2: ( ID ( '.' ID )* | DEF ( '.' DEF )* )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==ID) ) {
                alt60=1;
            }
            else if ( (LA60_0==DEF) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;

            }
            switch (alt60) {
                case 1 :
                    // DDL.g:166:4: ID ( '.' ID )*
                    {
                    match(input,ID,FOLLOW_ID_in_name894); 

                    // DDL.g:166:7: ( '.' ID )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==53) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // DDL.g:166:9: '.' ID
                    	    {
                    	    match(input,53,FOLLOW_53_in_name898); 

                    	    match(input,ID,FOLLOW_ID_in_name900); 

                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // DDL.g:167:4: DEF ( '.' DEF )*
                    {
                    match(input,DEF,FOLLOW_DEF_in_name908); 

                    // DDL.g:167:8: ( '.' DEF )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==53) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // DDL.g:167:10: '.' DEF
                    	    {
                    	    match(input,53,FOLLOW_53_in_name912); 

                    	    match(input,DEF,FOLLOW_DEF_in_name914); 

                    	    }
                    	    break;

                    	default :
                    	    break loop59;
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


 

    public static final BitSet FOLLOW_drop_in_start51 = new BitSet(new long[]{0x0000800010021002L});
    public static final BitSet FOLLOW_create_in_start55 = new BitSet(new long[]{0x0000800010021002L});
    public static final BitSet FOLLOW_namespace_in_start59 = new BitSet(new long[]{0x0000800010021002L});
    public static final BitSet FOLLOW_insert_in_start63 = new BitSet(new long[]{0x0000800010021002L});
    public static final BitSet FOLLOW_USE_in_namespace81 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_name_in_namespace83 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_namespace85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop96 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_TABLE_in_drop98 = new BitSet(new long[]{0x0000000006002000L});
    public static final BitSet FOLLOW_IF_in_drop102 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_EXISTS_in_drop104 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_nameList_in_drop109 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_drop111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create123 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_schema_in_create125 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_create127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create132 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_table_in_create134 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_create136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create141 = new BitSet(new long[]{0x0000102008400000L});
    public static final BitSet FOLLOW_index_in_create143 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_create145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insert157 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_INTO_in_insert159 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_name_in_insert161 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_VALUES_in_insert163 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_insert165 = new BitSet(new long[]{0x0100000022002000L});
    public static final BitSet FOLLOW_valueList_in_insert167 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_insert169 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_insert171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCHEMA_in_schema183 = new BitSet(new long[]{0x0000000006002000L});
    public static final BitSet FOLLOW_IF_in_schema187 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_NOT_in_schema189 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_EXISTS_in_schema191 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_name_in_schema196 = new BitSet(new long[]{0x0000000002006642L});
    public static final BitSet FOLLOW_parameter_in_schema198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TABLE_in_table216 = new BitSet(new long[]{0x0000000006002000L});
    public static final BitSet FOLLOW_IF_in_table220 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_NOT_in_table222 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_EXISTS_in_table224 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_name_in_table229 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_table231 = new BitSet(new long[]{0x000010208A602000L});
    public static final BitSet FOLLOW_definition_in_table233 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_table235 = new BitSet(new long[]{0x0000000002006642L});
    public static final BitSet FOLLOW_parameter_in_table237 = new BitSet(new long[]{0x0000000002006642L});
    public static final BitSet FOLLOW_column_in_definition255 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_constraint_in_definition259 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_index_in_definition263 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_definition269 = new BitSet(new long[]{0x000010208A602000L});
    public static final BitSet FOLLOW_column_in_definition273 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_constraint_in_definition277 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_index_in_definition281 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_name_in_column298 = new BitSet(new long[]{0x0000000002042080L});
    public static final BitSet FOLLOW_type_in_column300 = new BitSet(new long[]{0x0000106680204042L});
    public static final BitSet FOLLOW_option_in_column302 = new BitSet(new long[]{0x0000106680204042L});
    public static final BitSet FOLLOW_FULLTEXT_in_constraint318 = new BitSet(new long[]{0x0000102080200000L});
    public static final BitSet FOLLOW_key_in_constraint321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_in_constraint326 = new BitSet(new long[]{0x0004000002002002L});
    public static final BitSet FOLLOW_name_in_constraint328 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_constraint333 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_nameList_in_constraint335 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_constraint337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDEX_in_index363 = new BitSet(new long[]{0x0004001002002000L});
    public static final BitSet FOLLOW_name_in_index365 = new BitSet(new long[]{0x0004001000000000L});
    public static final BitSet FOLLOW_ON_in_index370 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_name_in_index372 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_index377 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_nameList_in_index379 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_index381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FULLTEXT_in_index386 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_name_in_index388 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_index390 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_nameList_in_index392 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_index394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_in_key422 = new BitSet(new long[]{0x0004000002002002L});
    public static final BitSet FOLLOW_name_in_key424 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_key429 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_nameList_in_key431 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_key433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREIGN_in_key444 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_KEY_in_key446 = new BitSet(new long[]{0x0004004002002000L});
    public static final BitSet FOLLOW_name_in_key448 = new BitSet(new long[]{0x0004004000000000L});
    public static final BitSet FOLLOW_50_in_key453 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_nameList_in_key455 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_key457 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_reference_in_key462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_key_in_option474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_in_option479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_option484 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_NULL_in_option487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUTO_INC_in_option492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_option497 = new BitSet(new long[]{0x0100000422002000L});
    public static final BitSet FOLLOW_value_in_option501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_option505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_empty_in_option509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REFERENCES_in_reference523 = new BitSet(new long[]{0x0004001002002002L});
    public static final BitSet FOLLOW_name_in_reference525 = new BitSet(new long[]{0x0004001000000002L});
    public static final BitSet FOLLOW_50_in_reference530 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_nameList_in_reference532 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_reference534 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_referenceOptions_in_reference539 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ON_in_referenceOptions552 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DELETE_in_referenceOptions554 = new BitSet(new long[]{0x0000028100000100L});
    public static final BitSet FOLLOW_CASCADE_in_referenceOptions558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESTRICT_in_referenceOptions562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NO_in_referenceOptions566 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ACTION_in_referenceOptions568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_referenceOptions572 = new BitSet(new long[]{0x0000000400004000L});
    public static final BitSet FOLLOW_set_in_referenceOptions574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_referenceOptions589 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_UPDATE_in_referenceOptions591 = new BitSet(new long[]{0x0000020000000100L});
    public static final BitSet FOLLOW_CASCADE_in_referenceOptions595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_referenceOptions599 = new BitSet(new long[]{0x0000000400004000L});
    public static final BitSet FOLLOW_set_in_referenceOptions601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_parameter639 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_parameter641 = new BitSet(new long[]{0x0000000022002000L});
    public static final BitSet FOLLOW_value_in_parameter643 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_parameter645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_parameter653 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_CHARACTER_in_parameter658 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_SET_in_parameter660 = new BitSet(new long[]{0x0080000022002000L});
    public static final BitSet FOLLOW_55_in_parameter662 = new BitSet(new long[]{0x0000000022002000L});
    public static final BitSet FOLLOW_value_in_parameter665 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_parameter667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_parameter675 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COLLATE_in_parameter680 = new BitSet(new long[]{0x0080000022002000L});
    public static final BitSet FOLLOW_55_in_parameter682 = new BitSet(new long[]{0x0000000022002000L});
    public static final BitSet FOLLOW_value_in_parameter685 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_parameter687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUTO_INC_in_parameter693 = new BitSet(new long[]{0x0080000020000000L});
    public static final BitSet FOLLOW_55_in_parameter695 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_INT_in_parameter698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_type710 = new BitSet(new long[]{0x0004200000000082L});
    public static final BitSet FOLLOW_50_in_type714 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_INT_in_type716 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_52_in_type720 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_INT_in_type722 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_type727 = new BitSet(new long[]{0x0000200000000082L});
    public static final BitSet FOLLOW_ENUM_in_type746 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_type748 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_nameList_in_type750 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_type752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BINARY_in_type757 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_type761 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_INT_in_type763 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_type765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_nameList779 = new BitSet(new long[]{0x0014000002012022L});
    public static final BitSet FOLLOW_50_in_nameList783 = new BitSet(new long[]{0x0000000022002000L});
    public static final BitSet FOLLOW_value_in_nameList785 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_nameList787 = new BitSet(new long[]{0x0010000002012022L});
    public static final BitSet FOLLOW_order_in_nameList792 = new BitSet(new long[]{0x0010000002002002L});
    public static final BitSet FOLLOW_52_in_nameList797 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_name_in_nameList800 = new BitSet(new long[]{0x0014000002012022L});
    public static final BitSet FOLLOW_50_in_nameList804 = new BitSet(new long[]{0x0000000022002000L});
    public static final BitSet FOLLOW_value_in_nameList806 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_nameList808 = new BitSet(new long[]{0x0010000002012022L});
    public static final BitSet FOLLOW_order_in_nameList813 = new BitSet(new long[]{0x0010000002002002L});
    public static final BitSet FOLLOW_value_in_valueList831 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_empty_in_valueList835 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_valueList840 = new BitSet(new long[]{0x0100000022002000L});
    public static final BitSet FOLLOW_value_in_valueList844 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_empty_in_valueList848 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_name_in_value864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_value869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_empty882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_name894 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_name898 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ID_in_name900 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_DEF_in_name908 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_name912 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DEF_in_name914 = new BitSet(new long[]{0x0020000000000002L});

}