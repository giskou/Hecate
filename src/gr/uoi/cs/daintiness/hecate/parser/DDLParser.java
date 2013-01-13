// $ANTLR 3.4 DDL.g 2013-01-13 15:06:45

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACTION", "ASC", "AUTO_INC", "BINARY", "CASCADE", "CHARACTER", "COMMENT", "CREATE", "DEF", "DEFAULT", "DELETE", "DESC", "DROP", "ENUM", "ESC_SEQ", "EXISTS", "FOREIGN", "FULLTEXT", "HASH", "HEX_DIGIT", "ID", "IF", "INDEX", "INT", "KEY", "NO", "NOT", "NULL", "OCTAL_ESC", "ON", "PRIMARY", "REFERENCES", "RESTRICT", "SCHEMA", "SET", "TABLE", "UNICODE_ESC", "UNIQUE", "UNSIGNED", "UPDATE", "USE", "WS", "'('", "')'", "','", "'.'", "';'", "'='", "'\\'\\''"
    };

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
    // DDL.g:33:1: start returns [Schema s] : ( drop | create | namespace )+ ;
    public final Schema start() throws RecognitionException {
        Schema s = null;


        try {
            // DDL.g:34:2: ( ( drop | create | namespace )+ )
            // DDL.g:34:4: ( drop | create | namespace )+
            {
            // DDL.g:34:4: ( drop | create | namespace )+
            int cnt1=0;
            loop1:
            do {
                int alt1=4;
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
            match(input,USE,FOLLOW_USE_in_namespace77); 

            pushFollow(FOLLOW_name_in_namespace79);
            name();

            state._fsp--;


            match(input,50,FOLLOW_50_in_namespace81); 

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
            match(input,DROP,FOLLOW_DROP_in_drop92); 

            match(input,TABLE,FOLLOW_TABLE_in_drop94); 

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
                    match(input,IF,FOLLOW_IF_in_drop98); 

                    match(input,EXISTS,FOLLOW_EXISTS_in_drop100); 

                    }
                    break;

            }


            pushFollow(FOLLOW_nameList_in_drop105);
            nameList();

            state._fsp--;


            match(input,50,FOLLOW_50_in_drop107); 

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
                    match(input,CREATE,FOLLOW_CREATE_in_create119); 

                    pushFollow(FOLLOW_schema_in_create121);
                    schema();

                    state._fsp--;


                    match(input,50,FOLLOW_50_in_create123); 

                    }
                    break;
                case 2 :
                    // DDL.g:50:4: CREATE table ';'
                    {
                    match(input,CREATE,FOLLOW_CREATE_in_create128); 

                    pushFollow(FOLLOW_table_in_create130);
                    table();

                    state._fsp--;


                    match(input,50,FOLLOW_50_in_create132); 

                    }
                    break;
                case 3 :
                    // DDL.g:51:4: CREATE index ';'
                    {
                    match(input,CREATE,FOLLOW_CREATE_in_create137); 

                    pushFollow(FOLLOW_index_in_create139);
                    index();

                    state._fsp--;


                    match(input,50,FOLLOW_50_in_create141); 

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



    // $ANTLR start "schema"
    // DDL.g:54:1: schema : SCHEMA ( IF NOT EXISTS )? name ( parameter )? ;
    public final void schema() throws RecognitionException {
        try {
            // DDL.g:55:2: ( SCHEMA ( IF NOT EXISTS )? name ( parameter )? )
            // DDL.g:55:4: SCHEMA ( IF NOT EXISTS )? name ( parameter )?
            {
            match(input,SCHEMA,FOLLOW_SCHEMA_in_schema153); 

            // DDL.g:55:11: ( IF NOT EXISTS )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==IF) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // DDL.g:55:13: IF NOT EXISTS
                    {
                    match(input,IF,FOLLOW_IF_in_schema157); 

                    match(input,NOT,FOLLOW_NOT_in_schema159); 

                    match(input,EXISTS,FOLLOW_EXISTS_in_schema161); 

                    }
                    break;

            }


            pushFollow(FOLLOW_name_in_schema166);
            name();

            state._fsp--;


            // DDL.g:55:35: ( parameter )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0 >= DEF && LA5_0 <= DEFAULT)||LA5_0==ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // DDL.g:55:35: parameter
                    {
                    pushFollow(FOLLOW_parameter_in_schema168);
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
    // DDL.g:58:1: table : TABLE ( IF NOT EXISTS )? name '(' definition ')' ( parameter )? ;
    public final void table() throws RecognitionException {
        DDLParser.name_return name1 =null;



        		am.clear();
        	
        try {
            // DDL.g:62:2: ( TABLE ( IF NOT EXISTS )? name '(' definition ')' ( parameter )? )
            // DDL.g:62:4: TABLE ( IF NOT EXISTS )? name '(' definition ')' ( parameter )?
            {
            match(input,TABLE,FOLLOW_TABLE_in_table186); 

            // DDL.g:62:10: ( IF NOT EXISTS )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==IF) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // DDL.g:62:12: IF NOT EXISTS
                    {
                    match(input,IF,FOLLOW_IF_in_table190); 

                    match(input,NOT,FOLLOW_NOT_in_table192); 

                    match(input,EXISTS,FOLLOW_EXISTS_in_table194); 

                    }
                    break;

            }


            pushFollow(FOLLOW_name_in_table199);
            name1=name();

            state._fsp--;


            match(input,46,FOLLOW_46_in_table201); 

            pushFollow(FOLLOW_definition_in_table203);
            definition();

            state._fsp--;


            match(input,47,FOLLOW_47_in_table205); 

            // DDL.g:62:53: ( parameter )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0 >= DEF && LA7_0 <= DEFAULT)||LA7_0==ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // DDL.g:62:53: parameter
                    {
                    pushFollow(FOLLOW_parameter_in_table207);
                    parameter();

                    state._fsp--;


                    }
                    break;

            }



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
    // DDL.g:68:1: definition : ( column | constraint | index ) ( ',' ( column | constraint | index ) )* ;
    public final void definition() throws RecognitionException {
        try {
            // DDL.g:69:2: ( ( column | constraint | index ) ( ',' ( column | constraint | index ) )* )
            // DDL.g:69:4: ( column | constraint | index ) ( ',' ( column | constraint | index ) )*
            {
            // DDL.g:69:4: ( column | constraint | index )
            int alt8=3;
            switch ( input.LA(1) ) {
            case DEF:
            case ID:
                {
                alt8=1;
                }
                break;
            case UNIQUE:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==DEF||LA8_2==ID||LA8_2==KEY||(LA8_2 >= 46 && LA8_2 <= 48)) ) {
                    alt8=2;
                }
                else if ( (LA8_2==INDEX) ) {
                    alt8=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

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
                int LA8_4 = input.LA(2);

                if ( (LA8_4==KEY) ) {
                    alt8=2;
                }
                else if ( (LA8_4==INDEX) ) {
                    alt8=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 4, input);

                    throw nvae;

                }
                }
                break;
            case FULLTEXT:
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
                    // DDL.g:69:6: column
                    {
                    pushFollow(FOLLOW_column_in_definition225);
                    column();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // DDL.g:69:15: constraint
                    {
                    pushFollow(FOLLOW_constraint_in_definition229);
                    constraint();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // DDL.g:69:28: index
                    {
                    pushFollow(FOLLOW_index_in_definition233);
                    index();

                    state._fsp--;


                    }
                    break;

            }


            // DDL.g:69:36: ( ',' ( column | constraint | index ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==48) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // DDL.g:69:38: ',' ( column | constraint | index )
            	    {
            	    match(input,48,FOLLOW_48_in_definition239); 

            	    // DDL.g:69:42: ( column | constraint | index )
            	    int alt9=3;
            	    switch ( input.LA(1) ) {
            	    case DEF:
            	    case ID:
            	        {
            	        alt9=1;
            	        }
            	        break;
            	    case UNIQUE:
            	        {
            	        int LA9_2 = input.LA(2);

            	        if ( (LA9_2==DEF||LA9_2==ID||LA9_2==KEY||(LA9_2 >= 46 && LA9_2 <= 48)) ) {
            	            alt9=2;
            	        }
            	        else if ( (LA9_2==INDEX) ) {
            	            alt9=3;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 9, 2, input);

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
            	        int LA9_4 = input.LA(2);

            	        if ( (LA9_4==KEY) ) {
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
            	    case FULLTEXT:
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
            	            // DDL.g:69:44: column
            	            {
            	            pushFollow(FOLLOW_column_in_definition243);
            	            column();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // DDL.g:69:53: constraint
            	            {
            	            pushFollow(FOLLOW_constraint_in_definition247);
            	            constraint();

            	            state._fsp--;


            	            }
            	            break;
            	        case 3 :
            	            // DDL.g:69:66: index
            	            {
            	            pushFollow(FOLLOW_index_in_definition251);
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
    // DDL.g:72:1: column : name type ( option )* ;
    public final void column() throws RecognitionException {
        DDLParser.type_return type2 =null;

        DDLParser.name_return name3 =null;


        try {
            // DDL.g:73:2: ( name type ( option )* )
            // DDL.g:73:4: name type ( option )*
            {
            pushFollow(FOLLOW_name_in_column268);
            name3=name();

            state._fsp--;


            pushFollow(FOLLOW_type_in_column270);
            type2=type();

            state._fsp--;


            // DDL.g:73:14: ( option )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==AUTO_INC||LA11_0==DEFAULT||LA11_0==FOREIGN||LA11_0==KEY||(LA11_0 >= NOT && LA11_0 <= NULL)||(LA11_0 >= PRIMARY && LA11_0 <= REFERENCES)||LA11_0==UNIQUE) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // DDL.g:73:14: option
            	    {
            	    pushFollow(FOLLOW_option_in_column272);
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
    // DDL.g:80:1: constraint : ( key | UNIQUE ( name )? ( '(' nameList ')' )? );
    public final void constraint() throws RecognitionException {
        try {
            // DDL.g:81:2: ( key | UNIQUE ( name )? ( '(' nameList ')' )? )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==UNIQUE) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==KEY) ) {
                    alt14=1;
                }
                else if ( (LA14_1==DEF||LA14_1==ID||(LA14_1 >= 46 && LA14_1 <= 48)) ) {
                    alt14=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA14_0==FOREIGN||LA14_0==KEY||LA14_0==PRIMARY) ) {
                alt14=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // DDL.g:81:4: key
                    {
                    pushFollow(FOLLOW_key_in_constraint288);
                    key();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // DDL.g:82:4: UNIQUE ( name )? ( '(' nameList ')' )?
                    {
                    match(input,UNIQUE,FOLLOW_UNIQUE_in_constraint293); 

                    // DDL.g:82:11: ( name )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==DEF||LA12_0==ID) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // DDL.g:82:11: name
                            {
                            pushFollow(FOLLOW_name_in_constraint295);
                            name();

                            state._fsp--;


                            }
                            break;

                    }


                    // DDL.g:82:17: ( '(' nameList ')' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==46) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // DDL.g:82:19: '(' nameList ')'
                            {
                            match(input,46,FOLLOW_46_in_constraint300); 

                            pushFollow(FOLLOW_nameList_in_constraint302);
                            nameList();

                            state._fsp--;


                            match(input,47,FOLLOW_47_in_constraint304); 

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
    // DDL.g:85:1: index : ( ( UNIQUE | PRIMARY )? INDEX ( name )? ( ON name )? '(' nameList ')' | FULLTEXT name '(' nameList ')' );
    public final void index() throws RecognitionException {
        try {
            // DDL.g:86:2: ( ( UNIQUE | PRIMARY )? INDEX ( name )? ( ON name )? '(' nameList ')' | FULLTEXT name '(' nameList ')' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==INDEX||LA18_0==PRIMARY||LA18_0==UNIQUE) ) {
                alt18=1;
            }
            else if ( (LA18_0==FULLTEXT) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // DDL.g:86:4: ( UNIQUE | PRIMARY )? INDEX ( name )? ( ON name )? '(' nameList ')'
                    {
                    // DDL.g:86:4: ( UNIQUE | PRIMARY )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==PRIMARY||LA15_0==UNIQUE) ) {
                        alt15=1;
                    }
                    switch (alt15) {
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


                    match(input,INDEX,FOLLOW_INDEX_in_index330); 

                    // DDL.g:86:32: ( name )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==DEF||LA16_0==ID) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // DDL.g:86:32: name
                            {
                            pushFollow(FOLLOW_name_in_index332);
                            name();

                            state._fsp--;


                            }
                            break;

                    }


                    // DDL.g:86:38: ( ON name )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==ON) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // DDL.g:86:40: ON name
                            {
                            match(input,ON,FOLLOW_ON_in_index337); 

                            pushFollow(FOLLOW_name_in_index339);
                            name();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input,46,FOLLOW_46_in_index344); 

                    pushFollow(FOLLOW_nameList_in_index346);
                    nameList();

                    state._fsp--;


                    match(input,47,FOLLOW_47_in_index348); 

                    }
                    break;
                case 2 :
                    // DDL.g:87:4: FULLTEXT name '(' nameList ')'
                    {
                    match(input,FULLTEXT,FOLLOW_FULLTEXT_in_index353); 

                    pushFollow(FOLLOW_name_in_index355);
                    name();

                    state._fsp--;


                    match(input,46,FOLLOW_46_in_index357); 

                    pushFollow(FOLLOW_nameList_in_index359);
                    nameList();

                    state._fsp--;


                    match(input,47,FOLLOW_47_in_index361); 

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
    // DDL.g:90:1: key : ( ( UNIQUE | PRIMARY )? KEY ( name )? ( '(' nameList ')' )? | FOREIGN KEY ( name )? ( '(' nameList ')' )? reference );
    public final void key() throws RecognitionException {
        DDLParser.nameList_return nameList4 =null;



        		km.clear();
        	
        try {
            // DDL.g:94:2: ( ( UNIQUE | PRIMARY )? KEY ( name )? ( '(' nameList ')' )? | FOREIGN KEY ( name )? ( '(' nameList ')' )? reference )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==KEY||LA24_0==PRIMARY||LA24_0==UNIQUE) ) {
                alt24=1;
            }
            else if ( (LA24_0==FOREIGN) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // DDL.g:94:4: ( UNIQUE | PRIMARY )? KEY ( name )? ( '(' nameList ')' )?
                    {
                    // DDL.g:94:4: ( UNIQUE | PRIMARY )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==PRIMARY||LA19_0==UNIQUE) ) {
                        alt19=1;
                    }
                    switch (alt19) {
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


                    match(input,KEY,FOLLOW_KEY_in_key389); 

                    // DDL.g:94:30: ( name )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==DEF||LA20_0==ID) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // DDL.g:94:30: name
                            {
                            pushFollow(FOLLOW_name_in_key391);
                            name();

                            state._fsp--;


                            }
                            break;

                    }


                    // DDL.g:94:36: ( '(' nameList ')' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==46) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // DDL.g:94:38: '(' nameList ')'
                            {
                            match(input,46,FOLLOW_46_in_key396); 

                            pushFollow(FOLLOW_nameList_in_key398);
                            nameList4=nameList();

                            state._fsp--;


                            match(input,47,FOLLOW_47_in_key400); 

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
                    // DDL.g:107:4: FOREIGN KEY ( name )? ( '(' nameList ')' )? reference
                    {
                    match(input,FOREIGN,FOLLOW_FOREIGN_in_key411); 

                    match(input,KEY,FOLLOW_KEY_in_key413); 

                    // DDL.g:107:16: ( name )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==DEF||LA22_0==ID) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // DDL.g:107:16: name
                            {
                            pushFollow(FOLLOW_name_in_key415);
                            name();

                            state._fsp--;


                            }
                            break;

                    }


                    // DDL.g:107:22: ( '(' nameList ')' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==46) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // DDL.g:107:24: '(' nameList ')'
                            {
                            match(input,46,FOLLOW_46_in_key420); 

                            pushFollow(FOLLOW_nameList_in_key422);
                            nameList();

                            state._fsp--;


                            match(input,47,FOLLOW_47_in_key424); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_reference_in_key429);
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
    // DDL.g:110:1: option : ( key | reference | ( NOT )? NULL | AUTO_INC | DEFAULT ( value | NULL | '\\'\\'' ) );
    public final void option() throws RecognitionException {
        try {
            // DDL.g:111:2: ( key | reference | ( NOT )? NULL | AUTO_INC | DEFAULT ( value | NULL | '\\'\\'' ) )
            int alt27=5;
            switch ( input.LA(1) ) {
            case FOREIGN:
            case KEY:
            case PRIMARY:
            case UNIQUE:
                {
                alt27=1;
                }
                break;
            case REFERENCES:
                {
                alt27=2;
                }
                break;
            case NOT:
            case NULL:
                {
                alt27=3;
                }
                break;
            case AUTO_INC:
                {
                alt27=4;
                }
                break;
            case DEFAULT:
                {
                alt27=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }

            switch (alt27) {
                case 1 :
                    // DDL.g:111:4: key
                    {
                    pushFollow(FOLLOW_key_in_option441);
                    key();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // DDL.g:112:4: reference
                    {
                    pushFollow(FOLLOW_reference_in_option446);
                    reference();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // DDL.g:113:4: ( NOT )? NULL
                    {
                    // DDL.g:113:4: ( NOT )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==NOT) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // DDL.g:113:4: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_option451); 

                            }
                            break;

                    }


                    match(input,NULL,FOLLOW_NULL_in_option454); 

                    }
                    break;
                case 4 :
                    // DDL.g:114:4: AUTO_INC
                    {
                    match(input,AUTO_INC,FOLLOW_AUTO_INC_in_option459); 

                    }
                    break;
                case 5 :
                    // DDL.g:115:4: DEFAULT ( value | NULL | '\\'\\'' )
                    {
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_option464); 

                    // DDL.g:115:12: ( value | NULL | '\\'\\'' )
                    int alt26=3;
                    switch ( input.LA(1) ) {
                    case DEF:
                    case ID:
                    case INT:
                        {
                        alt26=1;
                        }
                        break;
                    case NULL:
                        {
                        alt26=2;
                        }
                        break;
                    case 52:
                        {
                        alt26=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;

                    }

                    switch (alt26) {
                        case 1 :
                            // DDL.g:115:14: value
                            {
                            pushFollow(FOLLOW_value_in_option468);
                            value();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // DDL.g:115:22: NULL
                            {
                            match(input,NULL,FOLLOW_NULL_in_option472); 

                            }
                            break;
                        case 3 :
                            // DDL.g:115:29: '\\'\\''
                            {
                            match(input,52,FOLLOW_52_in_option476); 

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
    // DDL.g:118:1: reference : REFERENCES ( name )? ( '(' nameList ')' )? ( referenceOptions )* ;
    public final void reference() throws RecognitionException {
        try {
            // DDL.g:119:2: ( REFERENCES ( name )? ( '(' nameList ')' )? ( referenceOptions )* )
            // DDL.g:119:4: REFERENCES ( name )? ( '(' nameList ')' )? ( referenceOptions )*
            {
            match(input,REFERENCES,FOLLOW_REFERENCES_in_reference490); 

            // DDL.g:119:15: ( name )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==DEF||LA28_0==ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // DDL.g:119:15: name
                    {
                    pushFollow(FOLLOW_name_in_reference492);
                    name();

                    state._fsp--;


                    }
                    break;

            }


            // DDL.g:119:21: ( '(' nameList ')' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==46) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // DDL.g:119:23: '(' nameList ')'
                    {
                    match(input,46,FOLLOW_46_in_reference497); 

                    pushFollow(FOLLOW_nameList_in_reference499);
                    nameList();

                    state._fsp--;


                    match(input,47,FOLLOW_47_in_reference501); 

                    }
                    break;

            }


            // DDL.g:119:43: ( referenceOptions )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==ON) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // DDL.g:119:43: referenceOptions
            	    {
            	    pushFollow(FOLLOW_referenceOptions_in_reference506);
            	    referenceOptions();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // DDL.g:122:1: referenceOptions : ( ON DELETE ( CASCADE | RESTRICT | NO ACTION | SET ( DEFAULT | NULL ) ) | ON UPDATE ( CASCADE | SET ( DEFAULT | NULL ) ) );
    public final void referenceOptions() throws RecognitionException {
        try {
            // DDL.g:123:2: ( ON DELETE ( CASCADE | RESTRICT | NO ACTION | SET ( DEFAULT | NULL ) ) | ON UPDATE ( CASCADE | SET ( DEFAULT | NULL ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==ON) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==DELETE) ) {
                    alt33=1;
                }
                else if ( (LA33_1==UPDATE) ) {
                    alt33=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // DDL.g:123:4: ON DELETE ( CASCADE | RESTRICT | NO ACTION | SET ( DEFAULT | NULL ) )
                    {
                    match(input,ON,FOLLOW_ON_in_referenceOptions519); 

                    match(input,DELETE,FOLLOW_DELETE_in_referenceOptions521); 

                    // DDL.g:123:14: ( CASCADE | RESTRICT | NO ACTION | SET ( DEFAULT | NULL ) )
                    int alt31=4;
                    switch ( input.LA(1) ) {
                    case CASCADE:
                        {
                        alt31=1;
                        }
                        break;
                    case RESTRICT:
                        {
                        alt31=2;
                        }
                        break;
                    case NO:
                        {
                        alt31=3;
                        }
                        break;
                    case SET:
                        {
                        alt31=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;

                    }

                    switch (alt31) {
                        case 1 :
                            // DDL.g:123:16: CASCADE
                            {
                            match(input,CASCADE,FOLLOW_CASCADE_in_referenceOptions525); 

                            }
                            break;
                        case 2 :
                            // DDL.g:123:26: RESTRICT
                            {
                            match(input,RESTRICT,FOLLOW_RESTRICT_in_referenceOptions529); 

                            }
                            break;
                        case 3 :
                            // DDL.g:123:37: NO ACTION
                            {
                            match(input,NO,FOLLOW_NO_in_referenceOptions533); 

                            match(input,ACTION,FOLLOW_ACTION_in_referenceOptions535); 

                            }
                            break;
                        case 4 :
                            // DDL.g:123:49: SET ( DEFAULT | NULL )
                            {
                            match(input,SET,FOLLOW_SET_in_referenceOptions539); 

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
                    // DDL.g:124:4: ON UPDATE ( CASCADE | SET ( DEFAULT | NULL ) )
                    {
                    match(input,ON,FOLLOW_ON_in_referenceOptions556); 

                    match(input,UPDATE,FOLLOW_UPDATE_in_referenceOptions558); 

                    // DDL.g:124:14: ( CASCADE | SET ( DEFAULT | NULL ) )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==CASCADE) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==SET) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;

                    }
                    switch (alt32) {
                        case 1 :
                            // DDL.g:124:16: CASCADE
                            {
                            match(input,CASCADE,FOLLOW_CASCADE_in_referenceOptions562); 

                            }
                            break;
                        case 2 :
                            // DDL.g:124:26: SET ( DEFAULT | NULL )
                            {
                            match(input,SET,FOLLOW_SET_in_referenceOptions566); 

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
    // DDL.g:126:1: order : ( ASC | DESC );
    public final void order() throws RecognitionException {
        try {
            // DDL.g:127:2: ( ASC | DESC )
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
    // DDL.g:131:1: parameter : ( name '=' value ( ( ',' )? name '=' value )* | DEFAULT CHARACTER SET ( '=' )? value );
    public final void parameter() throws RecognitionException {
        try {
            // DDL.g:132:2: ( name '=' value ( ( ',' )? name '=' value )* | DEFAULT CHARACTER SET ( '=' )? value )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==DEF||LA37_0==ID) ) {
                alt37=1;
            }
            else if ( (LA37_0==DEFAULT) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }
            switch (alt37) {
                case 1 :
                    // DDL.g:132:4: name '=' value ( ( ',' )? name '=' value )*
                    {
                    pushFollow(FOLLOW_name_in_parameter606);
                    name();

                    state._fsp--;


                    match(input,51,FOLLOW_51_in_parameter608); 

                    pushFollow(FOLLOW_value_in_parameter610);
                    value();

                    state._fsp--;


                    // DDL.g:132:19: ( ( ',' )? name '=' value )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==DEF||LA35_0==ID||LA35_0==48) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // DDL.g:132:21: ( ',' )? name '=' value
                    	    {
                    	    // DDL.g:132:21: ( ',' )?
                    	    int alt34=2;
                    	    int LA34_0 = input.LA(1);

                    	    if ( (LA34_0==48) ) {
                    	        alt34=1;
                    	    }
                    	    switch (alt34) {
                    	        case 1 :
                    	            // DDL.g:132:21: ','
                    	            {
                    	            match(input,48,FOLLOW_48_in_parameter614); 

                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_name_in_parameter617);
                    	    name();

                    	    state._fsp--;


                    	    match(input,51,FOLLOW_51_in_parameter619); 

                    	    pushFollow(FOLLOW_value_in_parameter621);
                    	    value();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // DDL.g:133:4: DEFAULT CHARACTER SET ( '=' )? value
                    {
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_parameter629); 

                    match(input,CHARACTER,FOLLOW_CHARACTER_in_parameter631); 

                    match(input,SET,FOLLOW_SET_in_parameter633); 

                    // DDL.g:133:26: ( '=' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==51) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // DDL.g:133:26: '='
                            {
                            match(input,51,FOLLOW_51_in_parameter635); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_value_in_parameter638);
                    value();

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
    // $ANTLR end "parameter"


    public static class type_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "type"
    // DDL.g:136:1: type : ( name ( '(' INT ( ',' INT )? ')' )? ( UNSIGNED | BINARY )? | ENUM '(' nameList ')' | BINARY ( '(' INT ')' ) );
    public final DDLParser.type_return type() throws RecognitionException {
        DDLParser.type_return retval = new DDLParser.type_return();
        retval.start = input.LT(1);


        try {
            // DDL.g:137:2: ( name ( '(' INT ( ',' INT )? ')' )? ( UNSIGNED | BINARY )? | ENUM '(' nameList ')' | BINARY ( '(' INT ')' ) )
            int alt41=3;
            switch ( input.LA(1) ) {
            case DEF:
            case ID:
                {
                alt41=1;
                }
                break;
            case ENUM:
                {
                alt41=2;
                }
                break;
            case BINARY:
                {
                alt41=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;

            }

            switch (alt41) {
                case 1 :
                    // DDL.g:137:4: name ( '(' INT ( ',' INT )? ')' )? ( UNSIGNED | BINARY )?
                    {
                    pushFollow(FOLLOW_name_in_type650);
                    name();

                    state._fsp--;


                    // DDL.g:137:9: ( '(' INT ( ',' INT )? ')' )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==46) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // DDL.g:137:11: '(' INT ( ',' INT )? ')'
                            {
                            match(input,46,FOLLOW_46_in_type654); 

                            match(input,INT,FOLLOW_INT_in_type656); 

                            // DDL.g:137:19: ( ',' INT )?
                            int alt38=2;
                            int LA38_0 = input.LA(1);

                            if ( (LA38_0==48) ) {
                                alt38=1;
                            }
                            switch (alt38) {
                                case 1 :
                                    // DDL.g:137:21: ',' INT
                                    {
                                    match(input,48,FOLLOW_48_in_type660); 

                                    match(input,INT,FOLLOW_INT_in_type662); 

                                    }
                                    break;

                            }


                            match(input,47,FOLLOW_47_in_type667); 

                            }
                            break;

                    }


                    // DDL.g:137:39: ( UNSIGNED | BINARY )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==BINARY||LA40_0==UNSIGNED) ) {
                        alt40=1;
                    }
                    switch (alt40) {
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
                    // DDL.g:138:4: ENUM '(' nameList ')'
                    {
                    match(input,ENUM,FOLLOW_ENUM_in_type686); 

                    match(input,46,FOLLOW_46_in_type688); 

                    pushFollow(FOLLOW_nameList_in_type690);
                    nameList();

                    state._fsp--;


                    match(input,47,FOLLOW_47_in_type692); 

                    }
                    break;
                case 3 :
                    // DDL.g:139:4: BINARY ( '(' INT ')' )
                    {
                    match(input,BINARY,FOLLOW_BINARY_in_type697); 

                    // DDL.g:139:11: ( '(' INT ')' )
                    // DDL.g:139:13: '(' INT ')'
                    {
                    match(input,46,FOLLOW_46_in_type701); 

                    match(input,INT,FOLLOW_INT_in_type703); 

                    match(input,47,FOLLOW_47_in_type705); 

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
    // DDL.g:142:1: nameList : name ( '(' value ')' )? ( order )? ( ( ',' )? name ( '(' value ')' )? ( order )? )* ;
    public final DDLParser.nameList_return nameList() throws RecognitionException {
        DDLParser.nameList_return retval = new DDLParser.nameList_return();
        retval.start = input.LT(1);


        try {
            // DDL.g:143:2: ( name ( '(' value ')' )? ( order )? ( ( ',' )? name ( '(' value ')' )? ( order )? )* )
            // DDL.g:143:4: name ( '(' value ')' )? ( order )? ( ( ',' )? name ( '(' value ')' )? ( order )? )*
            {
            pushFollow(FOLLOW_name_in_nameList719);
            name();

            state._fsp--;


            // DDL.g:143:9: ( '(' value ')' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==46) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // DDL.g:143:11: '(' value ')'
                    {
                    match(input,46,FOLLOW_46_in_nameList723); 

                    pushFollow(FOLLOW_value_in_nameList725);
                    value();

                    state._fsp--;


                    match(input,47,FOLLOW_47_in_nameList727); 

                    }
                    break;

            }


            // DDL.g:143:28: ( order )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==ASC||LA43_0==DESC) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // DDL.g:143:28: order
                    {
                    pushFollow(FOLLOW_order_in_nameList732);
                    order();

                    state._fsp--;


                    }
                    break;

            }


            // DDL.g:143:35: ( ( ',' )? name ( '(' value ')' )? ( order )? )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==DEF||LA47_0==ID||LA47_0==48) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // DDL.g:143:37: ( ',' )? name ( '(' value ')' )? ( order )?
            	    {
            	    // DDL.g:143:37: ( ',' )?
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==48) ) {
            	        alt44=1;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // DDL.g:143:37: ','
            	            {
            	            match(input,48,FOLLOW_48_in_nameList737); 

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_name_in_nameList740);
            	    name();

            	    state._fsp--;


            	    // DDL.g:143:47: ( '(' value ')' )?
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==46) ) {
            	        alt45=1;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // DDL.g:143:49: '(' value ')'
            	            {
            	            match(input,46,FOLLOW_46_in_nameList744); 

            	            pushFollow(FOLLOW_value_in_nameList746);
            	            value();

            	            state._fsp--;


            	            match(input,47,FOLLOW_47_in_nameList748); 

            	            }
            	            break;

            	    }


            	    // DDL.g:143:66: ( order )?
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==ASC||LA46_0==DESC) ) {
            	        alt46=1;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // DDL.g:143:66: order
            	            {
            	            pushFollow(FOLLOW_order_in_nameList753);
            	            order();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
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



    // $ANTLR start "value"
    // DDL.g:146:1: value : ( name | INT );
    public final void value() throws RecognitionException {
        try {
            // DDL.g:147:2: ( name | INT )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==DEF||LA48_0==ID) ) {
                alt48=1;
            }
            else if ( (LA48_0==INT) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;

            }
            switch (alt48) {
                case 1 :
                    // DDL.g:147:4: name
                    {
                    pushFollow(FOLLOW_name_in_value769);
                    name();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // DDL.g:148:4: INT
                    {
                    match(input,INT,FOLLOW_INT_in_value774); 

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


    public static class name_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "name"
    // DDL.g:151:1: name : ( ID ( '.' ID )* | DEF ( '.' DEF )* );
    public final DDLParser.name_return name() throws RecognitionException {
        DDLParser.name_return retval = new DDLParser.name_return();
        retval.start = input.LT(1);


        try {
            // DDL.g:152:2: ( ID ( '.' ID )* | DEF ( '.' DEF )* )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==ID) ) {
                alt51=1;
            }
            else if ( (LA51_0==DEF) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;

            }
            switch (alt51) {
                case 1 :
                    // DDL.g:152:4: ID ( '.' ID )*
                    {
                    match(input,ID,FOLLOW_ID_in_name786); 

                    // DDL.g:152:7: ( '.' ID )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==49) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // DDL.g:152:9: '.' ID
                    	    {
                    	    match(input,49,FOLLOW_49_in_name790); 

                    	    match(input,ID,FOLLOW_ID_in_name792); 

                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // DDL.g:153:4: DEF ( '.' DEF )*
                    {
                    match(input,DEF,FOLLOW_DEF_in_name800); 

                    // DDL.g:153:8: ( '.' DEF )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==49) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // DDL.g:153:10: '.' DEF
                    	    {
                    	    match(input,49,FOLLOW_49_in_name804); 

                    	    match(input,DEF,FOLLOW_DEF_in_name806); 

                    	    }
                    	    break;

                    	default :
                    	    break loop50;
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


 

    public static final BitSet FOLLOW_drop_in_start51 = new BitSet(new long[]{0x0000100000010802L});
    public static final BitSet FOLLOW_create_in_start55 = new BitSet(new long[]{0x0000100000010802L});
    public static final BitSet FOLLOW_namespace_in_start59 = new BitSet(new long[]{0x0000100000010802L});
    public static final BitSet FOLLOW_USE_in_namespace77 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_name_in_namespace79 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_namespace81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop92 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_TABLE_in_drop94 = new BitSet(new long[]{0x0000000003001000L});
    public static final BitSet FOLLOW_IF_in_drop98 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_EXISTS_in_drop100 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_nameList_in_drop105 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_drop107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create119 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_schema_in_create121 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_create123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create128 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_table_in_create130 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_create132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create137 = new BitSet(new long[]{0x0000020404200000L});
    public static final BitSet FOLLOW_index_in_create139 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_create141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCHEMA_in_schema153 = new BitSet(new long[]{0x0000000003001000L});
    public static final BitSet FOLLOW_IF_in_schema157 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_NOT_in_schema159 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_EXISTS_in_schema161 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_name_in_schema166 = new BitSet(new long[]{0x0000000001003002L});
    public static final BitSet FOLLOW_parameter_in_schema168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TABLE_in_table186 = new BitSet(new long[]{0x0000000003001000L});
    public static final BitSet FOLLOW_IF_in_table190 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_NOT_in_table192 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_EXISTS_in_table194 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_name_in_table199 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_table201 = new BitSet(new long[]{0x0000020415301000L});
    public static final BitSet FOLLOW_definition_in_table203 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_table205 = new BitSet(new long[]{0x0000000001003002L});
    public static final BitSet FOLLOW_parameter_in_table207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_in_definition225 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_constraint_in_definition229 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_index_in_definition233 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_definition239 = new BitSet(new long[]{0x0000020415301000L});
    public static final BitSet FOLLOW_column_in_definition243 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_constraint_in_definition247 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_index_in_definition251 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_name_in_column268 = new BitSet(new long[]{0x0000000001021080L});
    public static final BitSet FOLLOW_type_in_column270 = new BitSet(new long[]{0x0000020CD0102042L});
    public static final BitSet FOLLOW_option_in_column272 = new BitSet(new long[]{0x0000020CD0102042L});
    public static final BitSet FOLLOW_key_in_constraint288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_in_constraint293 = new BitSet(new long[]{0x0000400001001002L});
    public static final BitSet FOLLOW_name_in_constraint295 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_constraint300 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_nameList_in_constraint302 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_constraint304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDEX_in_index330 = new BitSet(new long[]{0x0000400201001000L});
    public static final BitSet FOLLOW_name_in_index332 = new BitSet(new long[]{0x0000400200000000L});
    public static final BitSet FOLLOW_ON_in_index337 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_name_in_index339 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_index344 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_nameList_in_index346 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_index348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FULLTEXT_in_index353 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_name_in_index355 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_index357 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_nameList_in_index359 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_index361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_in_key389 = new BitSet(new long[]{0x0000400001001002L});
    public static final BitSet FOLLOW_name_in_key391 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_key396 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_nameList_in_key398 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_key400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREIGN_in_key411 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_KEY_in_key413 = new BitSet(new long[]{0x0000400801001000L});
    public static final BitSet FOLLOW_name_in_key415 = new BitSet(new long[]{0x0000400800000000L});
    public static final BitSet FOLLOW_46_in_key420 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_nameList_in_key422 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_key424 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_reference_in_key429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_key_in_option441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_in_option446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_option451 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_NULL_in_option454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUTO_INC_in_option459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_option464 = new BitSet(new long[]{0x0010000089001000L});
    public static final BitSet FOLLOW_value_in_option468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_option472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_option476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REFERENCES_in_reference490 = new BitSet(new long[]{0x0000400201001002L});
    public static final BitSet FOLLOW_name_in_reference492 = new BitSet(new long[]{0x0000400200000002L});
    public static final BitSet FOLLOW_46_in_reference497 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_nameList_in_reference499 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_reference501 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_referenceOptions_in_reference506 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ON_in_referenceOptions519 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_DELETE_in_referenceOptions521 = new BitSet(new long[]{0x0000005020000100L});
    public static final BitSet FOLLOW_CASCADE_in_referenceOptions525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESTRICT_in_referenceOptions529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NO_in_referenceOptions533 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ACTION_in_referenceOptions535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_referenceOptions539 = new BitSet(new long[]{0x0000000080002000L});
    public static final BitSet FOLLOW_set_in_referenceOptions541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_referenceOptions556 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_UPDATE_in_referenceOptions558 = new BitSet(new long[]{0x0000004000000100L});
    public static final BitSet FOLLOW_CASCADE_in_referenceOptions562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_referenceOptions566 = new BitSet(new long[]{0x0000000080002000L});
    public static final BitSet FOLLOW_set_in_referenceOptions568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_parameter606 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_parameter608 = new BitSet(new long[]{0x0000000009001000L});
    public static final BitSet FOLLOW_value_in_parameter610 = new BitSet(new long[]{0x0001000001001002L});
    public static final BitSet FOLLOW_48_in_parameter614 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_name_in_parameter617 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_parameter619 = new BitSet(new long[]{0x0000000009001000L});
    public static final BitSet FOLLOW_value_in_parameter621 = new BitSet(new long[]{0x0001000001001002L});
    public static final BitSet FOLLOW_DEFAULT_in_parameter629 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_CHARACTER_in_parameter631 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_SET_in_parameter633 = new BitSet(new long[]{0x0008000009001000L});
    public static final BitSet FOLLOW_51_in_parameter635 = new BitSet(new long[]{0x0000000009001000L});
    public static final BitSet FOLLOW_value_in_parameter638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_type650 = new BitSet(new long[]{0x0000440000000082L});
    public static final BitSet FOLLOW_46_in_type654 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_INT_in_type656 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_48_in_type660 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_INT_in_type662 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_type667 = new BitSet(new long[]{0x0000040000000082L});
    public static final BitSet FOLLOW_ENUM_in_type686 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_type688 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_nameList_in_type690 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_type692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BINARY_in_type697 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_type701 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_INT_in_type703 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_type705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_nameList719 = new BitSet(new long[]{0x0001400001009022L});
    public static final BitSet FOLLOW_46_in_nameList723 = new BitSet(new long[]{0x0000000009001000L});
    public static final BitSet FOLLOW_value_in_nameList725 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_nameList727 = new BitSet(new long[]{0x0001000001009022L});
    public static final BitSet FOLLOW_order_in_nameList732 = new BitSet(new long[]{0x0001000001001002L});
    public static final BitSet FOLLOW_48_in_nameList737 = new BitSet(new long[]{0x0000000001001000L});
    public static final BitSet FOLLOW_name_in_nameList740 = new BitSet(new long[]{0x0001400001009022L});
    public static final BitSet FOLLOW_46_in_nameList744 = new BitSet(new long[]{0x0000000009001000L});
    public static final BitSet FOLLOW_value_in_nameList746 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_nameList748 = new BitSet(new long[]{0x0001000001009022L});
    public static final BitSet FOLLOW_order_in_nameList753 = new BitSet(new long[]{0x0001000001001002L});
    public static final BitSet FOLLOW_name_in_value769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_value774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_name786 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_name790 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ID_in_name792 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_DEF_in_name800 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_name804 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_DEF_in_name806 = new BitSet(new long[]{0x0002000000000002L});

}