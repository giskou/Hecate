// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g 2010-06-30 20:23:43

  package gr.uoi.cs.dmod.hecate.parser ;
  import gr.uoi.cs.dmod.hecate.sql.* ;
  import java.util.TreeMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class DDLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "USE", "DROP", "TABLE", "IF", "EXISTS", "CREATE", "SCHEMA", "NOT", "UNIQUE", "PRIMARY", "INDEX", "ON", "FULLTEXT", "KEY", "FOREIGN", "NULL", "AUTO_INC", "DEFAULT", "REFERENCES", "DELETE", "CASCADE", "RESTRICT", "NO", "ACTION", "SET", "UPDATE", "ASC", "DESC", "CHARACTER", "INT", "UNSIGNED", "BINARY", "ENUM", "ID", "DEF", "HASH", "COMMENT", "WS", "ESC_SEQ", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "';'", "'('", "')'", "','", "'\\'\\''", "'='", "'.'"
    };
    public static final int DEF=38;
    public static final int OCTAL_ESC=45;
    public static final int TABLE=6;
    public static final int UPDATE=29;
    public static final int NOT=11;
    public static final int ID=37;
    public static final int CASCADE=24;
    public static final int EOF=-1;
    public static final int FOREIGN=18;
    public static final int ACTION=27;
    public static final int CHARACTER=32;
    public static final int IF=7;
    public static final int INDEX=14;
    public static final int CREATE=9;
    public static final int ESC_SEQ=42;
    public static final int T__51=51;
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
    public static final int WS=41;
    public static final int SCHEMA=10;
    public static final int UNSIGNED=34;
    public static final int ENUM=36;
    public static final int DROP=5;
    public static final int USE=4;
    public static final int DESC=31;
    public static final int BINARY=35;

    // delegates
    // delegators


        public DDLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public DDLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return DDLParser.tokenNames; }
    public String getGrammarFileName() { return "/home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g"; }


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
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:33:1: start returns [Schema s] : ( drop | create | namespace )+ ;
    public final Schema start() throws RecognitionException {
        Schema s = null;

        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:34:2: ( ( drop | create | namespace )+ )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:34:4: ( drop | create | namespace )+
            {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:34:4: ( drop | create | namespace )+
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
            	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:34:6: drop
            	    {
            	    pushFollow(FOLLOW_drop_in_start51);
            	    drop();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:34:13: create
            	    {
            	    pushFollow(FOLLOW_create_in_start55);
            	    create();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:34:22: namespace
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
        }
        return s;
    }
    // $ANTLR end "start"


    // $ANTLR start "namespace"
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:40:1: namespace : USE name ';' ;
    public final void namespace() throws RecognitionException {
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:41:2: ( USE name ';' )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:41:4: USE name ';'
            {
            match(input,USE,FOLLOW_USE_in_namespace77); 
            pushFollow(FOLLOW_name_in_namespace79);
            name();

            state._fsp--;

            match(input,46,FOLLOW_46_in_namespace81); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "namespace"


    // $ANTLR start "drop"
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:44:1: drop : DROP TABLE ( IF EXISTS )? nameList ';' ;
    public final void drop() throws RecognitionException {
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:45:2: ( DROP TABLE ( IF EXISTS )? nameList ';' )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:45:4: DROP TABLE ( IF EXISTS )? nameList ';'
            {
            match(input,DROP,FOLLOW_DROP_in_drop92); 
            match(input,TABLE,FOLLOW_TABLE_in_drop94); 
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:45:15: ( IF EXISTS )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==IF) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:45:17: IF EXISTS
                    {
                    match(input,IF,FOLLOW_IF_in_drop98); 
                    match(input,EXISTS,FOLLOW_EXISTS_in_drop100); 

                    }
                    break;

            }

            pushFollow(FOLLOW_nameList_in_drop105);
            nameList();

            state._fsp--;

            match(input,46,FOLLOW_46_in_drop107); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "drop"


    // $ANTLR start "create"
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:48:1: create : ( CREATE schema ';' | CREATE table ';' | CREATE index ';' );
    public final void create() throws RecognitionException {
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:49:2: ( CREATE schema ';' | CREATE table ';' | CREATE index ';' )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==CREATE) ) {
                switch ( input.LA(2) ) {
                case TABLE:
                    {
                    alt3=2;
                    }
                    break;
                case SCHEMA:
                    {
                    alt3=1;
                    }
                    break;
                case UNIQUE:
                case PRIMARY:
                case INDEX:
                case FULLTEXT:
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:49:4: CREATE schema ';'
                    {
                    match(input,CREATE,FOLLOW_CREATE_in_create119); 
                    pushFollow(FOLLOW_schema_in_create121);
                    schema();

                    state._fsp--;

                    match(input,46,FOLLOW_46_in_create123); 

                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:50:4: CREATE table ';'
                    {
                    match(input,CREATE,FOLLOW_CREATE_in_create128); 
                    pushFollow(FOLLOW_table_in_create130);
                    table();

                    state._fsp--;

                    match(input,46,FOLLOW_46_in_create132); 

                    }
                    break;
                case 3 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:51:4: CREATE index ';'
                    {
                    match(input,CREATE,FOLLOW_CREATE_in_create137); 
                    pushFollow(FOLLOW_index_in_create139);
                    index();

                    state._fsp--;

                    match(input,46,FOLLOW_46_in_create141); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "create"


    // $ANTLR start "schema"
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:54:1: schema : SCHEMA ( IF NOT EXISTS )? name ( parameter )? ;
    public final void schema() throws RecognitionException {
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:55:2: ( SCHEMA ( IF NOT EXISTS )? name ( parameter )? )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:55:4: SCHEMA ( IF NOT EXISTS )? name ( parameter )?
            {
            match(input,SCHEMA,FOLLOW_SCHEMA_in_schema153); 
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:55:11: ( IF NOT EXISTS )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==IF) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:55:13: IF NOT EXISTS
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

            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:55:35: ( parameter )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==DEFAULT||(LA5_0>=ID && LA5_0<=DEF)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:55:35: parameter
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
        }
        return ;
    }
    // $ANTLR end "schema"


    // $ANTLR start "table"
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:58:1: table : TABLE ( IF NOT EXISTS )? name '(' definition ')' ( parameter )? ;
    public final void table() throws RecognitionException {
        DDLParser.name_return name1 = null;



        		am.clear();
        	
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:62:2: ( TABLE ( IF NOT EXISTS )? name '(' definition ')' ( parameter )? )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:62:4: TABLE ( IF NOT EXISTS )? name '(' definition ')' ( parameter )?
            {
            match(input,TABLE,FOLLOW_TABLE_in_table186); 
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:62:10: ( IF NOT EXISTS )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==IF) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:62:12: IF NOT EXISTS
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

            match(input,47,FOLLOW_47_in_table201); 
            pushFollow(FOLLOW_definition_in_table203);
            definition();

            state._fsp--;

            match(input,48,FOLLOW_48_in_table205); 
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:62:53: ( parameter )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==DEFAULT||(LA7_0>=ID && LA7_0<=DEF)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:62:53: parameter
                    {
                    pushFollow(FOLLOW_parameter_in_table207);
                    parameter();

                    state._fsp--;


                    }
                    break;

            }


            		tm.put((name1!=null?input.toString(name1.start,name1.stop):null), new Table((name1!=null?input.toString(name1.start,name1.stop):null), am, k)) ;
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "table"


    // $ANTLR start "definition"
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:68:1: definition : ( column | constraint | index ) ( ',' ( column | constraint | index ) )* ;
    public final void definition() throws RecognitionException {
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:69:2: ( ( column | constraint | index ) ( ',' ( column | constraint | index ) )* )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:69:4: ( column | constraint | index ) ( ',' ( column | constraint | index ) )*
            {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:69:4: ( column | constraint | index )
            int alt8=3;
            switch ( input.LA(1) ) {
            case ID:
            case DEF:
                {
                alt8=1;
                }
                break;
            case UNIQUE:
            case PRIMARY:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==INDEX) ) {
                    alt8=3;
                }
                else if ( (LA8_2==KEY) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case KEY:
            case FOREIGN:
                {
                alt8=2;
                }
                break;
            case INDEX:
            case FULLTEXT:
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:69:6: column
                    {
                    pushFollow(FOLLOW_column_in_definition225);
                    column();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:69:15: constraint
                    {
                    pushFollow(FOLLOW_constraint_in_definition229);
                    constraint();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:69:28: index
                    {
                    pushFollow(FOLLOW_index_in_definition233);
                    index();

                    state._fsp--;


                    }
                    break;

            }

            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:69:36: ( ',' ( column | constraint | index ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==49) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:69:38: ',' ( column | constraint | index )
            	    {
            	    match(input,49,FOLLOW_49_in_definition239); 
            	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:69:42: ( column | constraint | index )
            	    int alt9=3;
            	    switch ( input.LA(1) ) {
            	    case ID:
            	    case DEF:
            	        {
            	        alt9=1;
            	        }
            	        break;
            	    case UNIQUE:
            	    case PRIMARY:
            	        {
            	        int LA9_2 = input.LA(2);

            	        if ( (LA9_2==INDEX) ) {
            	            alt9=3;
            	        }
            	        else if ( (LA9_2==KEY) ) {
            	            alt9=2;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 9, 2, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case KEY:
            	    case FOREIGN:
            	        {
            	        alt9=2;
            	        }
            	        break;
            	    case INDEX:
            	    case FULLTEXT:
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
            	            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:69:44: column
            	            {
            	            pushFollow(FOLLOW_column_in_definition243);
            	            column();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:69:53: constraint
            	            {
            	            pushFollow(FOLLOW_constraint_in_definition247);
            	            constraint();

            	            state._fsp--;


            	            }
            	            break;
            	        case 3 :
            	            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:69:66: index
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
        }
        return ;
    }
    // $ANTLR end "definition"


    // $ANTLR start "column"
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:72:1: column : name type ( option )* ;
    public final void column() throws RecognitionException {
        DDLParser.name_return name2 = null;

        DDLParser.type_return type3 = null;


        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:73:2: ( name type ( option )* )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:73:4: name type ( option )*
            {
            pushFollow(FOLLOW_name_in_column268);
            name2=name();

            state._fsp--;

            pushFollow(FOLLOW_type_in_column270);
            type3=type();

            state._fsp--;

            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:73:14: ( option )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=NOT && LA11_0<=PRIMARY)||(LA11_0>=KEY && LA11_0<=REFERENCES)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:73:14: option
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


            		am.put((name2!=null?input.toString(name2.start,name2.stop):null), new Attribute((name2!=null?input.toString(name2.start,name2.stop):null), (type3!=null?input.toString(type3.start,type3.stop):null), false, null)) ;
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "column"


    // $ANTLR start "constraint"
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:79:1: constraint : key ;
    public final void constraint() throws RecognitionException {
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:80:2: ( key )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:80:4: key
            {
            pushFollow(FOLLOW_key_in_constraint288);
            key();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "constraint"


    // $ANTLR start "index"
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:83:1: index : ( ( UNIQUE | PRIMARY )? INDEX ( name )? ( ON name )? '(' nameList ')' | FULLTEXT name '(' nameList ')' );
    public final void index() throws RecognitionException {
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:84:2: ( ( UNIQUE | PRIMARY )? INDEX ( name )? ( ON name )? '(' nameList ')' | FULLTEXT name '(' nameList ')' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=UNIQUE && LA15_0<=INDEX)) ) {
                alt15=1;
            }
            else if ( (LA15_0==FULLTEXT) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:84:4: ( UNIQUE | PRIMARY )? INDEX ( name )? ( ON name )? '(' nameList ')'
                    {
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:84:4: ( UNIQUE | PRIMARY )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( ((LA12_0>=UNIQUE && LA12_0<=PRIMARY)) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:
                            {
                            if ( (input.LA(1)>=UNIQUE && input.LA(1)<=PRIMARY) ) {
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

                    match(input,INDEX,FOLLOW_INDEX_in_index311); 
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:84:32: ( name )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=ID && LA13_0<=DEF)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:84:32: name
                            {
                            pushFollow(FOLLOW_name_in_index313);
                            name();

                            state._fsp--;


                            }
                            break;

                    }

                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:84:38: ( ON name )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==ON) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:84:40: ON name
                            {
                            match(input,ON,FOLLOW_ON_in_index318); 
                            pushFollow(FOLLOW_name_in_index320);
                            name();

                            state._fsp--;


                            }
                            break;

                    }

                    match(input,47,FOLLOW_47_in_index325); 
                    pushFollow(FOLLOW_nameList_in_index327);
                    nameList();

                    state._fsp--;

                    match(input,48,FOLLOW_48_in_index329); 

                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:85:4: FULLTEXT name '(' nameList ')'
                    {
                    match(input,FULLTEXT,FOLLOW_FULLTEXT_in_index334); 
                    pushFollow(FOLLOW_name_in_index336);
                    name();

                    state._fsp--;

                    match(input,47,FOLLOW_47_in_index338); 
                    pushFollow(FOLLOW_nameList_in_index340);
                    nameList();

                    state._fsp--;

                    match(input,48,FOLLOW_48_in_index342); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "index"


    // $ANTLR start "key"
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:88:1: key : ( ( UNIQUE | PRIMARY )? KEY ( name )? ( '(' nameList ')' )? | FOREIGN KEY ( name )? ( '(' nameList ')' )? reference );
    public final void key() throws RecognitionException {
        DDLParser.nameList_return nameList4 = null;

        DDLParser.name_return name5 = null;



        		km.clear();
        	
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:92:2: ( ( UNIQUE | PRIMARY )? KEY ( name )? ( '(' nameList ')' )? | FOREIGN KEY ( name )? ( '(' nameList ')' )? reference )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=UNIQUE && LA21_0<=PRIMARY)||LA21_0==KEY) ) {
                alt21=1;
            }
            else if ( (LA21_0==FOREIGN) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:92:4: ( UNIQUE | PRIMARY )? KEY ( name )? ( '(' nameList ')' )?
                    {
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:92:4: ( UNIQUE | PRIMARY )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=UNIQUE && LA16_0<=PRIMARY)) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:
                            {
                            if ( (input.LA(1)>=UNIQUE && input.LA(1)<=PRIMARY) ) {
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

                    match(input,KEY,FOLLOW_KEY_in_key370); 
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:92:30: ( name )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0>=ID && LA17_0<=DEF)) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:92:30: name
                            {
                            pushFollow(FOLLOW_name_in_key372);
                            name5=name();

                            state._fsp--;


                            }
                            break;

                    }

                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:92:36: ( '(' nameList ')' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==47) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:92:38: '(' nameList ')'
                            {
                            match(input,47,FOLLOW_47_in_key377); 
                            pushFollow(FOLLOW_nameList_in_key379);
                            nameList4=nameList();

                            state._fsp--;

                            match(input,48,FOLLOW_48_in_key381); 

                            }
                            break;

                    }


                    		if ((nameList4!=null?input.toString(nameList4.start,nameList4.stop):null) != null) {
                    			String[] list = getArrayFromList((nameList4!=null?input.toString(nameList4.start,nameList4.stop):null));
                    			for (int i = 0; i < list.length; i++) {
                    //				km.put((name5!=null?input.toString(name5.start,name5.stop):null), new Attribute((name5!=null?input.toString(name5.start,name5.stop):null), $type.text, false, null)) ;
                    			}
                    		}
                    	

                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:101:4: FOREIGN KEY ( name )? ( '(' nameList ')' )? reference
                    {
                    match(input,FOREIGN,FOLLOW_FOREIGN_in_key392); 
                    match(input,KEY,FOLLOW_KEY_in_key394); 
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:101:16: ( name )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( ((LA19_0>=ID && LA19_0<=DEF)) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:101:16: name
                            {
                            pushFollow(FOLLOW_name_in_key396);
                            name();

                            state._fsp--;


                            }
                            break;

                    }

                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:101:22: ( '(' nameList ')' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==47) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:101:24: '(' nameList ')'
                            {
                            match(input,47,FOLLOW_47_in_key401); 
                            pushFollow(FOLLOW_nameList_in_key403);
                            nameList();

                            state._fsp--;

                            match(input,48,FOLLOW_48_in_key405); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_reference_in_key410);
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
        }
        return ;
    }
    // $ANTLR end "key"


    // $ANTLR start "option"
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:104:1: option : ( key | reference | ( NOT )? NULL | AUTO_INC | DEFAULT ( value | NULL | '\\'\\'' ) );
    public final void option() throws RecognitionException {
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:105:2: ( key | reference | ( NOT )? NULL | AUTO_INC | DEFAULT ( value | NULL | '\\'\\'' ) )
            int alt24=5;
            switch ( input.LA(1) ) {
            case UNIQUE:
            case PRIMARY:
            case KEY:
            case FOREIGN:
                {
                alt24=1;
                }
                break;
            case REFERENCES:
                {
                alt24=2;
                }
                break;
            case NOT:
            case NULL:
                {
                alt24=3;
                }
                break;
            case AUTO_INC:
                {
                alt24=4;
                }
                break;
            case DEFAULT:
                {
                alt24=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:105:4: key
                    {
                    pushFollow(FOLLOW_key_in_option422);
                    key();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:106:4: reference
                    {
                    pushFollow(FOLLOW_reference_in_option427);
                    reference();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:107:4: ( NOT )? NULL
                    {
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:107:4: ( NOT )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==NOT) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:107:4: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_option432); 

                            }
                            break;

                    }

                    match(input,NULL,FOLLOW_NULL_in_option435); 

                    }
                    break;
                case 4 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:108:4: AUTO_INC
                    {
                    match(input,AUTO_INC,FOLLOW_AUTO_INC_in_option440); 

                    }
                    break;
                case 5 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:109:4: DEFAULT ( value | NULL | '\\'\\'' )
                    {
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_option445); 
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:109:12: ( value | NULL | '\\'\\'' )
                    int alt23=3;
                    switch ( input.LA(1) ) {
                    case INT:
                    case ID:
                    case DEF:
                        {
                        alt23=1;
                        }
                        break;
                    case NULL:
                        {
                        alt23=2;
                        }
                        break;
                    case 50:
                        {
                        alt23=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }

                    switch (alt23) {
                        case 1 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:109:14: value
                            {
                            pushFollow(FOLLOW_value_in_option449);
                            value();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:109:22: NULL
                            {
                            match(input,NULL,FOLLOW_NULL_in_option453); 

                            }
                            break;
                        case 3 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:109:29: '\\'\\''
                            {
                            match(input,50,FOLLOW_50_in_option457); 

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
        }
        return ;
    }
    // $ANTLR end "option"


    // $ANTLR start "reference"
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:112:1: reference : REFERENCES ( name )? ( '(' nameList ')' )? ( referenceOptions )* ;
    public final void reference() throws RecognitionException {
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:113:2: ( REFERENCES ( name )? ( '(' nameList ')' )? ( referenceOptions )* )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:113:4: REFERENCES ( name )? ( '(' nameList ')' )? ( referenceOptions )*
            {
            match(input,REFERENCES,FOLLOW_REFERENCES_in_reference471); 
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:113:15: ( name )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=ID && LA25_0<=DEF)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:113:15: name
                    {
                    pushFollow(FOLLOW_name_in_reference473);
                    name();

                    state._fsp--;


                    }
                    break;

            }

            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:113:21: ( '(' nameList ')' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==47) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:113:23: '(' nameList ')'
                    {
                    match(input,47,FOLLOW_47_in_reference478); 
                    pushFollow(FOLLOW_nameList_in_reference480);
                    nameList();

                    state._fsp--;

                    match(input,48,FOLLOW_48_in_reference482); 

                    }
                    break;

            }

            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:113:43: ( referenceOptions )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==ON) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:113:43: referenceOptions
            	    {
            	    pushFollow(FOLLOW_referenceOptions_in_reference487);
            	    referenceOptions();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "reference"


    // $ANTLR start "referenceOptions"
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:116:1: referenceOptions : ( ON DELETE ( CASCADE | RESTRICT | NO ACTION | SET ( DEFAULT | NULL ) ) | ON UPDATE ( CASCADE | SET ( DEFAULT | NULL ) ) );
    public final void referenceOptions() throws RecognitionException {
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:117:2: ( ON DELETE ( CASCADE | RESTRICT | NO ACTION | SET ( DEFAULT | NULL ) ) | ON UPDATE ( CASCADE | SET ( DEFAULT | NULL ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==ON) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==DELETE) ) {
                    alt30=1;
                }
                else if ( (LA30_1==UPDATE) ) {
                    alt30=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:117:4: ON DELETE ( CASCADE | RESTRICT | NO ACTION | SET ( DEFAULT | NULL ) )
                    {
                    match(input,ON,FOLLOW_ON_in_referenceOptions500); 
                    match(input,DELETE,FOLLOW_DELETE_in_referenceOptions502); 
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:117:14: ( CASCADE | RESTRICT | NO ACTION | SET ( DEFAULT | NULL ) )
                    int alt28=4;
                    switch ( input.LA(1) ) {
                    case CASCADE:
                        {
                        alt28=1;
                        }
                        break;
                    case RESTRICT:
                        {
                        alt28=2;
                        }
                        break;
                    case NO:
                        {
                        alt28=3;
                        }
                        break;
                    case SET:
                        {
                        alt28=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }

                    switch (alt28) {
                        case 1 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:117:16: CASCADE
                            {
                            match(input,CASCADE,FOLLOW_CASCADE_in_referenceOptions506); 

                            }
                            break;
                        case 2 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:117:26: RESTRICT
                            {
                            match(input,RESTRICT,FOLLOW_RESTRICT_in_referenceOptions510); 

                            }
                            break;
                        case 3 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:117:37: NO ACTION
                            {
                            match(input,NO,FOLLOW_NO_in_referenceOptions514); 
                            match(input,ACTION,FOLLOW_ACTION_in_referenceOptions516); 

                            }
                            break;
                        case 4 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:117:49: SET ( DEFAULT | NULL )
                            {
                            match(input,SET,FOLLOW_SET_in_referenceOptions520); 
                            if ( input.LA(1)==NULL||input.LA(1)==DEFAULT ) {
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:118:4: ON UPDATE ( CASCADE | SET ( DEFAULT | NULL ) )
                    {
                    match(input,ON,FOLLOW_ON_in_referenceOptions537); 
                    match(input,UPDATE,FOLLOW_UPDATE_in_referenceOptions539); 
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:118:14: ( CASCADE | SET ( DEFAULT | NULL ) )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==CASCADE) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==SET) ) {
                        alt29=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;
                    }
                    switch (alt29) {
                        case 1 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:118:16: CASCADE
                            {
                            match(input,CASCADE,FOLLOW_CASCADE_in_referenceOptions543); 

                            }
                            break;
                        case 2 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:118:26: SET ( DEFAULT | NULL )
                            {
                            match(input,SET,FOLLOW_SET_in_referenceOptions547); 
                            if ( input.LA(1)==NULL||input.LA(1)==DEFAULT ) {
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
        }
        return ;
    }
    // $ANTLR end "referenceOptions"


    // $ANTLR start "order"
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:120:1: order : ( ASC | DESC );
    public final void order() throws RecognitionException {
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:121:2: ( ASC | DESC )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:
            {
            if ( (input.LA(1)>=ASC && input.LA(1)<=DESC) ) {
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
        }
        return ;
    }
    // $ANTLR end "order"


    // $ANTLR start "parameter"
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:125:1: parameter : ( name '=' value ( ( ',' )? name '=' value )* | DEFAULT CHARACTER SET ( '=' )? value );
    public final void parameter() throws RecognitionException {
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:126:2: ( name '=' value ( ( ',' )? name '=' value )* | DEFAULT CHARACTER SET ( '=' )? value )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=ID && LA34_0<=DEF)) ) {
                alt34=1;
            }
            else if ( (LA34_0==DEFAULT) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:126:4: name '=' value ( ( ',' )? name '=' value )*
                    {
                    pushFollow(FOLLOW_name_in_parameter587);
                    name();

                    state._fsp--;

                    match(input,51,FOLLOW_51_in_parameter589); 
                    pushFollow(FOLLOW_value_in_parameter591);
                    value();

                    state._fsp--;

                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:126:19: ( ( ',' )? name '=' value )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( ((LA32_0>=ID && LA32_0<=DEF)||LA32_0==49) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:126:21: ( ',' )? name '=' value
                    	    {
                    	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:126:21: ( ',' )?
                    	    int alt31=2;
                    	    int LA31_0 = input.LA(1);

                    	    if ( (LA31_0==49) ) {
                    	        alt31=1;
                    	    }
                    	    switch (alt31) {
                    	        case 1 :
                    	            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:126:21: ','
                    	            {
                    	            match(input,49,FOLLOW_49_in_parameter595); 

                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_name_in_parameter598);
                    	    name();

                    	    state._fsp--;

                    	    match(input,51,FOLLOW_51_in_parameter600); 
                    	    pushFollow(FOLLOW_value_in_parameter602);
                    	    value();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:127:4: DEFAULT CHARACTER SET ( '=' )? value
                    {
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_parameter610); 
                    match(input,CHARACTER,FOLLOW_CHARACTER_in_parameter612); 
                    match(input,SET,FOLLOW_SET_in_parameter614); 
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:127:26: ( '=' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==51) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:127:26: '='
                            {
                            match(input,51,FOLLOW_51_in_parameter616); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_value_in_parameter619);
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
        }
        return ;
    }
    // $ANTLR end "parameter"

    public static class type_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "type"
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:130:1: type : ( name ( '(' INT ( ',' INT )? ')' )? ( UNSIGNED | BINARY )? | ENUM '(' nameList ')' | BINARY ( '(' INT ')' ) );
    public final DDLParser.type_return type() throws RecognitionException {
        DDLParser.type_return retval = new DDLParser.type_return();
        retval.start = input.LT(1);

        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:131:2: ( name ( '(' INT ( ',' INT )? ')' )? ( UNSIGNED | BINARY )? | ENUM '(' nameList ')' | BINARY ( '(' INT ')' ) )
            int alt38=3;
            switch ( input.LA(1) ) {
            case ID:
            case DEF:
                {
                alt38=1;
                }
                break;
            case ENUM:
                {
                alt38=2;
                }
                break;
            case BINARY:
                {
                alt38=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:131:4: name ( '(' INT ( ',' INT )? ')' )? ( UNSIGNED | BINARY )?
                    {
                    pushFollow(FOLLOW_name_in_type631);
                    name();

                    state._fsp--;

                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:131:9: ( '(' INT ( ',' INT )? ')' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==47) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:131:11: '(' INT ( ',' INT )? ')'
                            {
                            match(input,47,FOLLOW_47_in_type635); 
                            match(input,INT,FOLLOW_INT_in_type637); 
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:131:19: ( ',' INT )?
                            int alt35=2;
                            int LA35_0 = input.LA(1);

                            if ( (LA35_0==49) ) {
                                alt35=1;
                            }
                            switch (alt35) {
                                case 1 :
                                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:131:21: ',' INT
                                    {
                                    match(input,49,FOLLOW_49_in_type641); 
                                    match(input,INT,FOLLOW_INT_in_type643); 

                                    }
                                    break;

                            }

                            match(input,48,FOLLOW_48_in_type648); 

                            }
                            break;

                    }

                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:131:39: ( UNSIGNED | BINARY )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( ((LA37_0>=UNSIGNED && LA37_0<=BINARY)) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:
                            {
                            if ( (input.LA(1)>=UNSIGNED && input.LA(1)<=BINARY) ) {
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:132:4: ENUM '(' nameList ')'
                    {
                    match(input,ENUM,FOLLOW_ENUM_in_type667); 
                    match(input,47,FOLLOW_47_in_type669); 
                    pushFollow(FOLLOW_nameList_in_type671);
                    nameList();

                    state._fsp--;

                    match(input,48,FOLLOW_48_in_type673); 

                    }
                    break;
                case 3 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:133:4: BINARY ( '(' INT ')' )
                    {
                    match(input,BINARY,FOLLOW_BINARY_in_type678); 
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:133:11: ( '(' INT ')' )
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:133:13: '(' INT ')'
                    {
                    match(input,47,FOLLOW_47_in_type682); 
                    match(input,INT,FOLLOW_INT_in_type684); 
                    match(input,48,FOLLOW_48_in_type686); 

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
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class nameList_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "nameList"
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:136:1: nameList : name ( '(' value ')' )? ( order )? ( ( ',' )? name ( '(' value ')' )? ( order )? )* ;
    public final DDLParser.nameList_return nameList() throws RecognitionException {
        DDLParser.nameList_return retval = new DDLParser.nameList_return();
        retval.start = input.LT(1);

        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:137:2: ( name ( '(' value ')' )? ( order )? ( ( ',' )? name ( '(' value ')' )? ( order )? )* )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:137:4: name ( '(' value ')' )? ( order )? ( ( ',' )? name ( '(' value ')' )? ( order )? )*
            {
            pushFollow(FOLLOW_name_in_nameList700);
            name();

            state._fsp--;

            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:137:9: ( '(' value ')' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==47) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:137:11: '(' value ')'
                    {
                    match(input,47,FOLLOW_47_in_nameList704); 
                    pushFollow(FOLLOW_value_in_nameList706);
                    value();

                    state._fsp--;

                    match(input,48,FOLLOW_48_in_nameList708); 

                    }
                    break;

            }

            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:137:28: ( order )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=ASC && LA40_0<=DESC)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:137:28: order
                    {
                    pushFollow(FOLLOW_order_in_nameList713);
                    order();

                    state._fsp--;


                    }
                    break;

            }

            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:137:35: ( ( ',' )? name ( '(' value ')' )? ( order )? )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=ID && LA44_0<=DEF)||LA44_0==49) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:137:37: ( ',' )? name ( '(' value ')' )? ( order )?
            	    {
            	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:137:37: ( ',' )?
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==49) ) {
            	        alt41=1;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:137:37: ','
            	            {
            	            match(input,49,FOLLOW_49_in_nameList718); 

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_name_in_nameList721);
            	    name();

            	    state._fsp--;

            	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:137:47: ( '(' value ')' )?
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==47) ) {
            	        alt42=1;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:137:49: '(' value ')'
            	            {
            	            match(input,47,FOLLOW_47_in_nameList725); 
            	            pushFollow(FOLLOW_value_in_nameList727);
            	            value();

            	            state._fsp--;

            	            match(input,48,FOLLOW_48_in_nameList729); 

            	            }
            	            break;

            	    }

            	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:137:66: ( order )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( ((LA43_0>=ASC && LA43_0<=DESC)) ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:137:66: order
            	            {
            	            pushFollow(FOLLOW_order_in_nameList734);
            	            order();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
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
        }
        return retval;
    }
    // $ANTLR end "nameList"


    // $ANTLR start "value"
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:140:1: value : ( name | INT );
    public final void value() throws RecognitionException {
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:141:2: ( name | INT )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=ID && LA45_0<=DEF)) ) {
                alt45=1;
            }
            else if ( (LA45_0==INT) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:141:4: name
                    {
                    pushFollow(FOLLOW_name_in_value750);
                    name();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:142:4: INT
                    {
                    match(input,INT,FOLLOW_INT_in_value755); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "value"

    public static class name_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "name"
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:145:1: name : ( ID ( '.' ID )* | DEF ( '.' DEF )* );
    public final DDLParser.name_return name() throws RecognitionException {
        DDLParser.name_return retval = new DDLParser.name_return();
        retval.start = input.LT(1);

        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:146:2: ( ID ( '.' ID )* | DEF ( '.' DEF )* )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==ID) ) {
                alt48=1;
            }
            else if ( (LA48_0==DEF) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:146:4: ID ( '.' ID )*
                    {
                    match(input,ID,FOLLOW_ID_in_name767); 
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:146:7: ( '.' ID )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==52) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:146:9: '.' ID
                    	    {
                    	    match(input,52,FOLLOW_52_in_name771); 
                    	    match(input,ID,FOLLOW_ID_in_name773); 

                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:147:4: DEF ( '.' DEF )*
                    {
                    match(input,DEF,FOLLOW_DEF_in_name781); 
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:147:8: ( '.' DEF )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==52) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:147:10: '.' DEF
                    	    {
                    	    match(input,52,FOLLOW_52_in_name785); 
                    	    match(input,DEF,FOLLOW_DEF_in_name787); 

                    	    }
                    	    break;

                    	default :
                    	    break loop47;
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
        }
        return retval;
    }
    // $ANTLR end "name"

    // Delegated rules


 

    public static final BitSet FOLLOW_drop_in_start51 = new BitSet(new long[]{0x0000000000000232L});
    public static final BitSet FOLLOW_create_in_start55 = new BitSet(new long[]{0x0000000000000232L});
    public static final BitSet FOLLOW_namespace_in_start59 = new BitSet(new long[]{0x0000000000000232L});
    public static final BitSet FOLLOW_USE_in_namespace77 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_name_in_namespace79 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_namespace81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop92 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_TABLE_in_drop94 = new BitSet(new long[]{0x0000006000000080L});
    public static final BitSet FOLLOW_IF_in_drop98 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EXISTS_in_drop100 = new BitSet(new long[]{0x0000006000000080L});
    public static final BitSet FOLLOW_nameList_in_drop105 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_drop107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create119 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_schema_in_create121 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_create123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create128 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_table_in_create130 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_create132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create137 = new BitSet(new long[]{0x0000000000017000L});
    public static final BitSet FOLLOW_index_in_create139 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_create141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCHEMA_in_schema153 = new BitSet(new long[]{0x0000006000000080L});
    public static final BitSet FOLLOW_IF_in_schema157 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NOT_in_schema159 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EXISTS_in_schema161 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_name_in_schema166 = new BitSet(new long[]{0x0000006000200002L});
    public static final BitSet FOLLOW_parameter_in_schema168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TABLE_in_table186 = new BitSet(new long[]{0x0000006000000080L});
    public static final BitSet FOLLOW_IF_in_table190 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NOT_in_table192 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EXISTS_in_table194 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_name_in_table199 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_table201 = new BitSet(new long[]{0x0000006000077000L});
    public static final BitSet FOLLOW_definition_in_table203 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_table205 = new BitSet(new long[]{0x0000006000200002L});
    public static final BitSet FOLLOW_parameter_in_table207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_in_definition225 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_constraint_in_definition229 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_index_in_definition233 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_definition239 = new BitSet(new long[]{0x0000006000077000L});
    public static final BitSet FOLLOW_column_in_definition243 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_constraint_in_definition247 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_index_in_definition251 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_name_in_column268 = new BitSet(new long[]{0x0000007800000000L});
    public static final BitSet FOLLOW_type_in_column270 = new BitSet(new long[]{0x00000000007E3802L});
    public static final BitSet FOLLOW_option_in_column272 = new BitSet(new long[]{0x00000000007E3802L});
    public static final BitSet FOLLOW_key_in_constraint288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_index300 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_INDEX_in_index311 = new BitSet(new long[]{0x0000806000008000L});
    public static final BitSet FOLLOW_name_in_index313 = new BitSet(new long[]{0x0000800000008000L});
    public static final BitSet FOLLOW_ON_in_index318 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_name_in_index320 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_index325 = new BitSet(new long[]{0x0000006000000080L});
    public static final BitSet FOLLOW_nameList_in_index327 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_index329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FULLTEXT_in_index334 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_name_in_index336 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_index338 = new BitSet(new long[]{0x0000006000000080L});
    public static final BitSet FOLLOW_nameList_in_index340 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_index342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_key359 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_KEY_in_key370 = new BitSet(new long[]{0x0000806000000002L});
    public static final BitSet FOLLOW_name_in_key372 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_key377 = new BitSet(new long[]{0x0000006000000080L});
    public static final BitSet FOLLOW_nameList_in_key379 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_key381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREIGN_in_key392 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_KEY_in_key394 = new BitSet(new long[]{0x0000806000400000L});
    public static final BitSet FOLLOW_name_in_key396 = new BitSet(new long[]{0x0000800000400000L});
    public static final BitSet FOLLOW_47_in_key401 = new BitSet(new long[]{0x0000006000000080L});
    public static final BitSet FOLLOW_nameList_in_key403 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_key405 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_reference_in_key410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_key_in_option422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_in_option427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_option432 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NULL_in_option435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUTO_INC_in_option440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_option445 = new BitSet(new long[]{0x0004006200080000L});
    public static final BitSet FOLLOW_value_in_option449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_option453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_option457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REFERENCES_in_reference471 = new BitSet(new long[]{0x0000806000008002L});
    public static final BitSet FOLLOW_name_in_reference473 = new BitSet(new long[]{0x0000800000008002L});
    public static final BitSet FOLLOW_47_in_reference478 = new BitSet(new long[]{0x0000006000000080L});
    public static final BitSet FOLLOW_nameList_in_reference480 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_reference482 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_referenceOptions_in_reference487 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ON_in_referenceOptions500 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_DELETE_in_referenceOptions502 = new BitSet(new long[]{0x0000000017000000L});
    public static final BitSet FOLLOW_CASCADE_in_referenceOptions506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESTRICT_in_referenceOptions510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NO_in_referenceOptions514 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ACTION_in_referenceOptions516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_referenceOptions520 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_set_in_referenceOptions522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_referenceOptions537 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_UPDATE_in_referenceOptions539 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_CASCADE_in_referenceOptions543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_referenceOptions547 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_set_in_referenceOptions549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_order0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_parameter587 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_parameter589 = new BitSet(new long[]{0x0000006200000000L});
    public static final BitSet FOLLOW_value_in_parameter591 = new BitSet(new long[]{0x0002006000000002L});
    public static final BitSet FOLLOW_49_in_parameter595 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_name_in_parameter598 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_parameter600 = new BitSet(new long[]{0x0000006200000000L});
    public static final BitSet FOLLOW_value_in_parameter602 = new BitSet(new long[]{0x0002006000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_parameter610 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_CHARACTER_in_parameter612 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_SET_in_parameter614 = new BitSet(new long[]{0x0008006200000000L});
    public static final BitSet FOLLOW_51_in_parameter616 = new BitSet(new long[]{0x0000006200000000L});
    public static final BitSet FOLLOW_value_in_parameter619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_type631 = new BitSet(new long[]{0x0000800C00000002L});
    public static final BitSet FOLLOW_47_in_type635 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_INT_in_type637 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_49_in_type641 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_INT_in_type643 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_type648 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_set_in_type653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_type667 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_type669 = new BitSet(new long[]{0x0000006000000080L});
    public static final BitSet FOLLOW_nameList_in_type671 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_type673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BINARY_in_type678 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_type682 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_INT_in_type684 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_type686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_nameList700 = new BitSet(new long[]{0x00028060C0000002L});
    public static final BitSet FOLLOW_47_in_nameList704 = new BitSet(new long[]{0x0000006200000000L});
    public static final BitSet FOLLOW_value_in_nameList706 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_nameList708 = new BitSet(new long[]{0x00020060C0000002L});
    public static final BitSet FOLLOW_order_in_nameList713 = new BitSet(new long[]{0x0002006000000002L});
    public static final BitSet FOLLOW_49_in_nameList718 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_name_in_nameList721 = new BitSet(new long[]{0x00028060C0000002L});
    public static final BitSet FOLLOW_47_in_nameList725 = new BitSet(new long[]{0x0000006200000000L});
    public static final BitSet FOLLOW_value_in_nameList727 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_nameList729 = new BitSet(new long[]{0x00020060C0000002L});
    public static final BitSet FOLLOW_order_in_nameList734 = new BitSet(new long[]{0x0002006000000002L});
    public static final BitSet FOLLOW_name_in_value750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_value755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_name767 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_name771 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ID_in_name773 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_DEF_in_name781 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_name785 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_DEF_in_name787 = new BitSet(new long[]{0x0010000000000002L});

}