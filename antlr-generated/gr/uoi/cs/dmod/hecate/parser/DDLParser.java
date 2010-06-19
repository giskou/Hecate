// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g 2010-06-19 19:14:18

  package gr.uoi.cs.dmod.hecate.parser ;


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


    	



    // $ANTLR start "start"
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:19:1: start : ( drop | create | namespace )+ ;
    public final void start() throws RecognitionException {
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:20:2: ( ( drop | create | namespace )+ )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:20:4: ( drop | create | namespace )+
            {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:20:4: ( drop | create | namespace )+
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
            	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:20:6: drop
            	    {
            	    pushFollow(FOLLOW_drop_in_start47);
            	    drop();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:20:13: create
            	    {
            	    pushFollow(FOLLOW_create_in_start51);
            	    create();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:20:22: namespace
            	    {
            	    pushFollow(FOLLOW_namespace_in_start55);
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
    // $ANTLR end "start"


    // $ANTLR start "namespace"
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:23:1: namespace : USE name ';' ;
    public final void namespace() throws RecognitionException {
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:24:2: ( USE name ';' )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:24:4: USE name ';'
            {
            match(input,USE,FOLLOW_USE_in_namespace70); 
            pushFollow(FOLLOW_name_in_namespace72);
            name();

            state._fsp--;

            match(input,46,FOLLOW_46_in_namespace74); 

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
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:27:1: drop : DROP TABLE ( IF EXISTS )? nameList ';' ;
    public final void drop() throws RecognitionException {
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:28:2: ( DROP TABLE ( IF EXISTS )? nameList ';' )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:28:4: DROP TABLE ( IF EXISTS )? nameList ';'
            {
            match(input,DROP,FOLLOW_DROP_in_drop85); 
            match(input,TABLE,FOLLOW_TABLE_in_drop87); 
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:28:15: ( IF EXISTS )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==IF) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:28:17: IF EXISTS
                    {
                    match(input,IF,FOLLOW_IF_in_drop91); 
                    match(input,EXISTS,FOLLOW_EXISTS_in_drop93); 

                    }
                    break;

            }

            pushFollow(FOLLOW_nameList_in_drop98);
            nameList();

            state._fsp--;

            match(input,46,FOLLOW_46_in_drop100); 

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
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:31:1: create : ( CREATE schema ';' | CREATE table ';' | CREATE index ';' );
    public final void create() throws RecognitionException {
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:32:2: ( CREATE schema ';' | CREATE table ';' | CREATE index ';' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:32:4: CREATE schema ';'
                    {
                    match(input,CREATE,FOLLOW_CREATE_in_create112); 
                    pushFollow(FOLLOW_schema_in_create114);
                    schema();

                    state._fsp--;

                    match(input,46,FOLLOW_46_in_create116); 

                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:33:4: CREATE table ';'
                    {
                    match(input,CREATE,FOLLOW_CREATE_in_create121); 
                    pushFollow(FOLLOW_table_in_create123);
                    table();

                    state._fsp--;

                    match(input,46,FOLLOW_46_in_create125); 
                    System.out.println("New Table created");

                    }
                    break;
                case 3 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:35:4: CREATE index ';'
                    {
                    match(input,CREATE,FOLLOW_CREATE_in_create133); 
                    pushFollow(FOLLOW_index_in_create135);
                    index();

                    state._fsp--;

                    match(input,46,FOLLOW_46_in_create137); 

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
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:38:1: schema : SCHEMA ( IF NOT EXISTS )? name ( parameter )? ;
    public final void schema() throws RecognitionException {
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:39:2: ( SCHEMA ( IF NOT EXISTS )? name ( parameter )? )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:39:4: SCHEMA ( IF NOT EXISTS )? name ( parameter )?
            {
            match(input,SCHEMA,FOLLOW_SCHEMA_in_schema149); 
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:39:11: ( IF NOT EXISTS )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==IF) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:39:13: IF NOT EXISTS
                    {
                    match(input,IF,FOLLOW_IF_in_schema153); 
                    match(input,NOT,FOLLOW_NOT_in_schema155); 
                    match(input,EXISTS,FOLLOW_EXISTS_in_schema157); 

                    }
                    break;

            }

            pushFollow(FOLLOW_name_in_schema162);
            name();

            state._fsp--;

            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:39:35: ( parameter )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==DEFAULT||(LA5_0>=ID && LA5_0<=DEF)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:39:35: parameter
                    {
                    pushFollow(FOLLOW_parameter_in_schema164);
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
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:42:1: table : TABLE ( IF NOT EXISTS )? name '(' definition ')' ( parameter )? ;
    public final void table() throws RecognitionException {
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:43:2: ( TABLE ( IF NOT EXISTS )? name '(' definition ')' ( parameter )? )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:43:4: TABLE ( IF NOT EXISTS )? name '(' definition ')' ( parameter )?
            {
            match(input,TABLE,FOLLOW_TABLE_in_table177); 
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:43:10: ( IF NOT EXISTS )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==IF) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:43:12: IF NOT EXISTS
                    {
                    match(input,IF,FOLLOW_IF_in_table181); 
                    match(input,NOT,FOLLOW_NOT_in_table183); 
                    match(input,EXISTS,FOLLOW_EXISTS_in_table185); 

                    }
                    break;

            }

            pushFollow(FOLLOW_name_in_table190);
            name();

            state._fsp--;

            match(input,47,FOLLOW_47_in_table192); 
            pushFollow(FOLLOW_definition_in_table194);
            definition();

            state._fsp--;

            match(input,48,FOLLOW_48_in_table196); 
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:43:53: ( parameter )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==DEFAULT||(LA7_0>=ID && LA7_0<=DEF)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:43:53: parameter
                    {
                    pushFollow(FOLLOW_parameter_in_table198);
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
    // $ANTLR end "table"


    // $ANTLR start "definition"
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:46:1: definition : ( column | constraint | index ) ( ',' ( column | constraint | index ) )* ;
    public final void definition() throws RecognitionException {
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:47:2: ( ( column | constraint | index ) ( ',' ( column | constraint | index ) )* )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:47:4: ( column | constraint | index ) ( ',' ( column | constraint | index ) )*
            {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:47:4: ( column | constraint | index )
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

                if ( (LA8_2==KEY) ) {
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:47:6: column
                    {
                    pushFollow(FOLLOW_column_in_definition213);
                    column();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:47:15: constraint
                    {
                    pushFollow(FOLLOW_constraint_in_definition217);
                    constraint();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:47:28: index
                    {
                    pushFollow(FOLLOW_index_in_definition221);
                    index();

                    state._fsp--;


                    }
                    break;

            }

            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:47:36: ( ',' ( column | constraint | index ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==49) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:47:38: ',' ( column | constraint | index )
            	    {
            	    match(input,49,FOLLOW_49_in_definition227); 
            	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:47:42: ( column | constraint | index )
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

            	        if ( (LA9_2==KEY) ) {
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
            	            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:47:44: column
            	            {
            	            pushFollow(FOLLOW_column_in_definition231);
            	            column();

            	            state._fsp--;


            	            }
            	            break;
            	        case 2 :
            	            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:47:53: constraint
            	            {
            	            pushFollow(FOLLOW_constraint_in_definition235);
            	            constraint();

            	            state._fsp--;


            	            }
            	            break;
            	        case 3 :
            	            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:47:66: index
            	            {
            	            pushFollow(FOLLOW_index_in_definition239);
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
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:50:1: column : name type ( option )* ;
    public final void column() throws RecognitionException {
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:51:2: ( name type ( option )* )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:51:4: name type ( option )*
            {
            pushFollow(FOLLOW_name_in_column256);
            name();

            state._fsp--;

            pushFollow(FOLLOW_type_in_column258);
            type();

            state._fsp--;

            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:51:14: ( option )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=NOT && LA11_0<=PRIMARY)||(LA11_0>=KEY && LA11_0<=REFERENCES)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:51:14: option
            	    {
            	    pushFollow(FOLLOW_option_in_column260);
            	    option();

            	    state._fsp--;


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
        }
        return ;
    }
    // $ANTLR end "column"


    // $ANTLR start "constraint"
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:54:1: constraint : key ;
    public final void constraint() throws RecognitionException {
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:55:2: ( key )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:55:4: key
            {
            pushFollow(FOLLOW_key_in_constraint273);
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
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:58:1: index : ( ( UNIQUE | PRIMARY )? INDEX ( name )? ( ON name )? '(' nameList ')' | FULLTEXT name '(' nameList ')' );
    public final void index() throws RecognitionException {
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:59:2: ( ( UNIQUE | PRIMARY )? INDEX ( name )? ( ON name )? '(' nameList ')' | FULLTEXT name '(' nameList ')' )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:59:4: ( UNIQUE | PRIMARY )? INDEX ( name )? ( ON name )? '(' nameList ')'
                    {
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:59:4: ( UNIQUE | PRIMARY )?
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

                    match(input,INDEX,FOLLOW_INDEX_in_index296); 
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:59:32: ( name )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=ID && LA13_0<=DEF)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:59:32: name
                            {
                            pushFollow(FOLLOW_name_in_index298);
                            name();

                            state._fsp--;


                            }
                            break;

                    }

                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:59:38: ( ON name )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==ON) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:59:40: ON name
                            {
                            match(input,ON,FOLLOW_ON_in_index303); 
                            pushFollow(FOLLOW_name_in_index305);
                            name();

                            state._fsp--;


                            }
                            break;

                    }

                    match(input,47,FOLLOW_47_in_index310); 
                    pushFollow(FOLLOW_nameList_in_index312);
                    nameList();

                    state._fsp--;

                    match(input,48,FOLLOW_48_in_index314); 

                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:60:4: FULLTEXT name '(' nameList ')'
                    {
                    match(input,FULLTEXT,FOLLOW_FULLTEXT_in_index319); 
                    pushFollow(FOLLOW_name_in_index321);
                    name();

                    state._fsp--;

                    match(input,47,FOLLOW_47_in_index323); 
                    pushFollow(FOLLOW_nameList_in_index325);
                    nameList();

                    state._fsp--;

                    match(input,48,FOLLOW_48_in_index327); 

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
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:63:1: key : ( ( UNIQUE | PRIMARY )? KEY ( name )? ( '(' nameList ')' )? | FOREIGN KEY ( name )? ( '(' nameList ')' )? reference );
    public final void key() throws RecognitionException {
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:64:2: ( ( UNIQUE | PRIMARY )? KEY ( name )? ( '(' nameList ')' )? | FOREIGN KEY ( name )? ( '(' nameList ')' )? reference )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:64:4: ( UNIQUE | PRIMARY )? KEY ( name )? ( '(' nameList ')' )?
                    {
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:64:4: ( UNIQUE | PRIMARY )?
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

                    match(input,KEY,FOLLOW_KEY_in_key350); 
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:64:30: ( name )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0>=ID && LA17_0<=DEF)) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:64:30: name
                            {
                            pushFollow(FOLLOW_name_in_key352);
                            name();

                            state._fsp--;


                            }
                            break;

                    }

                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:64:36: ( '(' nameList ')' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==47) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:64:38: '(' nameList ')'
                            {
                            match(input,47,FOLLOW_47_in_key357); 
                            pushFollow(FOLLOW_nameList_in_key359);
                            nameList();

                            state._fsp--;

                            match(input,48,FOLLOW_48_in_key361); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:65:4: FOREIGN KEY ( name )? ( '(' nameList ')' )? reference
                    {
                    match(input,FOREIGN,FOLLOW_FOREIGN_in_key369); 
                    match(input,KEY,FOLLOW_KEY_in_key371); 
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:65:16: ( name )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( ((LA19_0>=ID && LA19_0<=DEF)) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:65:16: name
                            {
                            pushFollow(FOLLOW_name_in_key373);
                            name();

                            state._fsp--;


                            }
                            break;

                    }

                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:65:22: ( '(' nameList ')' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==47) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:65:24: '(' nameList ')'
                            {
                            match(input,47,FOLLOW_47_in_key378); 
                            pushFollow(FOLLOW_nameList_in_key380);
                            nameList();

                            state._fsp--;

                            match(input,48,FOLLOW_48_in_key382); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_reference_in_key387);
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
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:68:1: option : ( key | reference | ( NOT )? NULL | AUTO_INC | DEFAULT ( value | NULL | '\\'\\'' ) );
    public final void option() throws RecognitionException {
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:69:2: ( key | reference | ( NOT )? NULL | AUTO_INC | DEFAULT ( value | NULL | '\\'\\'' ) )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:69:4: key
                    {
                    pushFollow(FOLLOW_key_in_option399);
                    key();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:70:4: reference
                    {
                    pushFollow(FOLLOW_reference_in_option404);
                    reference();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:71:4: ( NOT )? NULL
                    {
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:71:4: ( NOT )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==NOT) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:71:4: NOT
                            {
                            match(input,NOT,FOLLOW_NOT_in_option409); 

                            }
                            break;

                    }

                    match(input,NULL,FOLLOW_NULL_in_option412); 

                    }
                    break;
                case 4 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:72:4: AUTO_INC
                    {
                    match(input,AUTO_INC,FOLLOW_AUTO_INC_in_option417); 

                    }
                    break;
                case 5 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:73:4: DEFAULT ( value | NULL | '\\'\\'' )
                    {
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_option422); 
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:73:12: ( value | NULL | '\\'\\'' )
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
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:73:14: value
                            {
                            pushFollow(FOLLOW_value_in_option426);
                            value();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:73:22: NULL
                            {
                            match(input,NULL,FOLLOW_NULL_in_option430); 

                            }
                            break;
                        case 3 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:73:29: '\\'\\''
                            {
                            match(input,50,FOLLOW_50_in_option434); 

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
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:76:1: reference : REFERENCES ( name )? ( '(' nameList ')' )? ( referenceOptions )* ;
    public final void reference() throws RecognitionException {
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:77:2: ( REFERENCES ( name )? ( '(' nameList ')' )? ( referenceOptions )* )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:77:4: REFERENCES ( name )? ( '(' nameList ')' )? ( referenceOptions )*
            {
            match(input,REFERENCES,FOLLOW_REFERENCES_in_reference448); 
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:77:15: ( name )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=ID && LA25_0<=DEF)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:77:15: name
                    {
                    pushFollow(FOLLOW_name_in_reference450);
                    name();

                    state._fsp--;


                    }
                    break;

            }

            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:77:21: ( '(' nameList ')' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==47) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:77:23: '(' nameList ')'
                    {
                    match(input,47,FOLLOW_47_in_reference455); 
                    pushFollow(FOLLOW_nameList_in_reference457);
                    nameList();

                    state._fsp--;

                    match(input,48,FOLLOW_48_in_reference459); 

                    }
                    break;

            }

            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:77:43: ( referenceOptions )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==ON) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:77:43: referenceOptions
            	    {
            	    pushFollow(FOLLOW_referenceOptions_in_reference464);
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
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:80:1: referenceOptions : ( ON DELETE ( CASCADE | RESTRICT | NO ACTION | SET ( DEFAULT | NULL ) ) | ON UPDATE ( CASCADE | SET ( DEFAULT | NULL ) ) );
    public final void referenceOptions() throws RecognitionException {
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:81:2: ( ON DELETE ( CASCADE | RESTRICT | NO ACTION | SET ( DEFAULT | NULL ) ) | ON UPDATE ( CASCADE | SET ( DEFAULT | NULL ) ) )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:81:4: ON DELETE ( CASCADE | RESTRICT | NO ACTION | SET ( DEFAULT | NULL ) )
                    {
                    match(input,ON,FOLLOW_ON_in_referenceOptions477); 
                    match(input,DELETE,FOLLOW_DELETE_in_referenceOptions479); 
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:81:14: ( CASCADE | RESTRICT | NO ACTION | SET ( DEFAULT | NULL ) )
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
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:81:16: CASCADE
                            {
                            match(input,CASCADE,FOLLOW_CASCADE_in_referenceOptions483); 

                            }
                            break;
                        case 2 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:81:26: RESTRICT
                            {
                            match(input,RESTRICT,FOLLOW_RESTRICT_in_referenceOptions487); 

                            }
                            break;
                        case 3 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:81:37: NO ACTION
                            {
                            match(input,NO,FOLLOW_NO_in_referenceOptions491); 
                            match(input,ACTION,FOLLOW_ACTION_in_referenceOptions493); 

                            }
                            break;
                        case 4 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:81:49: SET ( DEFAULT | NULL )
                            {
                            match(input,SET,FOLLOW_SET_in_referenceOptions497); 
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:82:4: ON UPDATE ( CASCADE | SET ( DEFAULT | NULL ) )
                    {
                    match(input,ON,FOLLOW_ON_in_referenceOptions514); 
                    match(input,UPDATE,FOLLOW_UPDATE_in_referenceOptions516); 
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:82:14: ( CASCADE | SET ( DEFAULT | NULL ) )
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
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:82:16: CASCADE
                            {
                            match(input,CASCADE,FOLLOW_CASCADE_in_referenceOptions520); 

                            }
                            break;
                        case 2 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:82:26: SET ( DEFAULT | NULL )
                            {
                            match(input,SET,FOLLOW_SET_in_referenceOptions524); 
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
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:84:1: order : ( ASC | DESC );
    public final void order() throws RecognitionException {
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:85:2: ( ASC | DESC )
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
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:89:1: parameter : ( name '=' value ( ( ',' )? name '=' value )* | DEFAULT CHARACTER SET ( '=' )? value );
    public final void parameter() throws RecognitionException {
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:90:2: ( name '=' value ( ( ',' )? name '=' value )* | DEFAULT CHARACTER SET ( '=' )? value )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:90:4: name '=' value ( ( ',' )? name '=' value )*
                    {
                    pushFollow(FOLLOW_name_in_parameter564);
                    name();

                    state._fsp--;

                    match(input,51,FOLLOW_51_in_parameter566); 
                    pushFollow(FOLLOW_value_in_parameter568);
                    value();

                    state._fsp--;

                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:90:19: ( ( ',' )? name '=' value )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( ((LA32_0>=ID && LA32_0<=DEF)||LA32_0==49) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:90:21: ( ',' )? name '=' value
                    	    {
                    	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:90:21: ( ',' )?
                    	    int alt31=2;
                    	    int LA31_0 = input.LA(1);

                    	    if ( (LA31_0==49) ) {
                    	        alt31=1;
                    	    }
                    	    switch (alt31) {
                    	        case 1 :
                    	            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:90:21: ','
                    	            {
                    	            match(input,49,FOLLOW_49_in_parameter572); 

                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_name_in_parameter575);
                    	    name();

                    	    state._fsp--;

                    	    match(input,51,FOLLOW_51_in_parameter577); 
                    	    pushFollow(FOLLOW_value_in_parameter579);
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:91:4: DEFAULT CHARACTER SET ( '=' )? value
                    {
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_parameter587); 
                    match(input,CHARACTER,FOLLOW_CHARACTER_in_parameter589); 
                    match(input,SET,FOLLOW_SET_in_parameter591); 
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:91:26: ( '=' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==51) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:91:26: '='
                            {
                            match(input,51,FOLLOW_51_in_parameter593); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_value_in_parameter596);
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


    // $ANTLR start "type"
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:94:1: type : ( name ( '(' INT ( ',' INT )? ')' )? ( UNSIGNED | BINARY )? | ENUM '(' nameList ')' | BINARY ( '(' INT ')' ) );
    public final void type() throws RecognitionException {
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:95:2: ( name ( '(' INT ( ',' INT )? ')' )? ( UNSIGNED | BINARY )? | ENUM '(' nameList ')' | BINARY ( '(' INT ')' ) )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:95:4: name ( '(' INT ( ',' INT )? ')' )? ( UNSIGNED | BINARY )?
                    {
                    pushFollow(FOLLOW_name_in_type608);
                    name();

                    state._fsp--;

                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:95:9: ( '(' INT ( ',' INT )? ')' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==47) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:95:11: '(' INT ( ',' INT )? ')'
                            {
                            match(input,47,FOLLOW_47_in_type612); 
                            match(input,INT,FOLLOW_INT_in_type614); 
                            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:95:19: ( ',' INT )?
                            int alt35=2;
                            int LA35_0 = input.LA(1);

                            if ( (LA35_0==49) ) {
                                alt35=1;
                            }
                            switch (alt35) {
                                case 1 :
                                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:95:21: ',' INT
                                    {
                                    match(input,49,FOLLOW_49_in_type618); 
                                    match(input,INT,FOLLOW_INT_in_type620); 

                                    }
                                    break;

                            }

                            match(input,48,FOLLOW_48_in_type625); 

                            }
                            break;

                    }

                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:95:39: ( UNSIGNED | BINARY )?
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:96:4: ENUM '(' nameList ')'
                    {
                    match(input,ENUM,FOLLOW_ENUM_in_type644); 
                    match(input,47,FOLLOW_47_in_type646); 
                    pushFollow(FOLLOW_nameList_in_type648);
                    nameList();

                    state._fsp--;

                    match(input,48,FOLLOW_48_in_type650); 

                    }
                    break;
                case 3 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:97:4: BINARY ( '(' INT ')' )
                    {
                    match(input,BINARY,FOLLOW_BINARY_in_type655); 
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:97:11: ( '(' INT ')' )
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:97:13: '(' INT ')'
                    {
                    match(input,47,FOLLOW_47_in_type659); 
                    match(input,INT,FOLLOW_INT_in_type661); 
                    match(input,48,FOLLOW_48_in_type663); 

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
    // $ANTLR end "type"


    // $ANTLR start "nameList"
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:100:1: nameList : name ( '(' value ')' )? ( order )? ( ( ',' )? name ( '(' value ')' )? ( order )? )* ;
    public final void nameList() throws RecognitionException {
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:101:2: ( name ( '(' value ')' )? ( order )? ( ( ',' )? name ( '(' value ')' )? ( order )? )* )
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:101:4: name ( '(' value ')' )? ( order )? ( ( ',' )? name ( '(' value ')' )? ( order )? )*
            {
            pushFollow(FOLLOW_name_in_nameList677);
            name();

            state._fsp--;

            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:101:9: ( '(' value ')' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==47) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:101:11: '(' value ')'
                    {
                    match(input,47,FOLLOW_47_in_nameList681); 
                    pushFollow(FOLLOW_value_in_nameList683);
                    value();

                    state._fsp--;

                    match(input,48,FOLLOW_48_in_nameList685); 

                    }
                    break;

            }

            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:101:28: ( order )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=ASC && LA40_0<=DESC)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:101:28: order
                    {
                    pushFollow(FOLLOW_order_in_nameList690);
                    order();

                    state._fsp--;


                    }
                    break;

            }

            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:101:35: ( ( ',' )? name ( '(' value ')' )? ( order )? )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=ID && LA44_0<=DEF)||LA44_0==49) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:101:37: ( ',' )? name ( '(' value ')' )? ( order )?
            	    {
            	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:101:37: ( ',' )?
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==49) ) {
            	        alt41=1;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:101:37: ','
            	            {
            	            match(input,49,FOLLOW_49_in_nameList695); 

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_name_in_nameList698);
            	    name();

            	    state._fsp--;

            	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:101:47: ( '(' value ')' )?
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==47) ) {
            	        alt42=1;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:101:49: '(' value ')'
            	            {
            	            match(input,47,FOLLOW_47_in_nameList702); 
            	            pushFollow(FOLLOW_value_in_nameList704);
            	            value();

            	            state._fsp--;

            	            match(input,48,FOLLOW_48_in_nameList706); 

            	            }
            	            break;

            	    }

            	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:101:66: ( order )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( ((LA43_0>=ASC && LA43_0<=DESC)) ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:101:66: order
            	            {
            	            pushFollow(FOLLOW_order_in_nameList711);
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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "nameList"


    // $ANTLR start "value"
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:104:1: value : ( name | INT );
    public final void value() throws RecognitionException {
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:105:2: ( name | INT )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:105:4: name
                    {
                    pushFollow(FOLLOW_name_in_value727);
                    name();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:106:4: INT
                    {
                    match(input,INT,FOLLOW_INT_in_value732); 

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


    // $ANTLR start "name"
    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:109:1: name : ( ID ( '.' ID )* | DEF ( '.' DEF )* );
    public final void name() throws RecognitionException {
        try {
            // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:110:2: ( ID ( '.' ID )* | DEF ( '.' DEF )* )
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
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:110:4: ID ( '.' ID )*
                    {
                    match(input,ID,FOLLOW_ID_in_name744); 
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:110:7: ( '.' ID )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==52) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:110:9: '.' ID
                    	    {
                    	    match(input,52,FOLLOW_52_in_name748); 
                    	    match(input,ID,FOLLOW_ID_in_name750); 

                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:111:4: DEF ( '.' DEF )*
                    {
                    match(input,DEF,FOLLOW_DEF_in_name758); 
                    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:111:8: ( '.' DEF )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==52) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // /home/lensman/Projects/Hecate/src/gr/uoi/cs/dmod/hecate/parser/DDL.g:111:10: '.' DEF
                    	    {
                    	    match(input,52,FOLLOW_52_in_name762); 
                    	    match(input,DEF,FOLLOW_DEF_in_name764); 

                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);


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
    // $ANTLR end "name"

    // Delegated rules


 

    public static final BitSet FOLLOW_drop_in_start47 = new BitSet(new long[]{0x0000000000000232L});
    public static final BitSet FOLLOW_create_in_start51 = new BitSet(new long[]{0x0000000000000232L});
    public static final BitSet FOLLOW_namespace_in_start55 = new BitSet(new long[]{0x0000000000000232L});
    public static final BitSet FOLLOW_USE_in_namespace70 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_name_in_namespace72 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_namespace74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_drop85 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_TABLE_in_drop87 = new BitSet(new long[]{0x0000006000000080L});
    public static final BitSet FOLLOW_IF_in_drop91 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EXISTS_in_drop93 = new BitSet(new long[]{0x0000006000000080L});
    public static final BitSet FOLLOW_nameList_in_drop98 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_drop100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create112 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_schema_in_create114 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_create116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create121 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_table_in_create123 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_create125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CREATE_in_create133 = new BitSet(new long[]{0x0000000000017000L});
    public static final BitSet FOLLOW_index_in_create135 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_create137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCHEMA_in_schema149 = new BitSet(new long[]{0x0000006000000080L});
    public static final BitSet FOLLOW_IF_in_schema153 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NOT_in_schema155 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EXISTS_in_schema157 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_name_in_schema162 = new BitSet(new long[]{0x0000006000200002L});
    public static final BitSet FOLLOW_parameter_in_schema164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TABLE_in_table177 = new BitSet(new long[]{0x0000006000000080L});
    public static final BitSet FOLLOW_IF_in_table181 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_NOT_in_table183 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EXISTS_in_table185 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_name_in_table190 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_table192 = new BitSet(new long[]{0x0000006000077000L});
    public static final BitSet FOLLOW_definition_in_table194 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_table196 = new BitSet(new long[]{0x0000006000200002L});
    public static final BitSet FOLLOW_parameter_in_table198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_in_definition213 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_constraint_in_definition217 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_index_in_definition221 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_definition227 = new BitSet(new long[]{0x0000006000077000L});
    public static final BitSet FOLLOW_column_in_definition231 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_constraint_in_definition235 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_index_in_definition239 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_name_in_column256 = new BitSet(new long[]{0x0000007800000000L});
    public static final BitSet FOLLOW_type_in_column258 = new BitSet(new long[]{0x00000000007E3802L});
    public static final BitSet FOLLOW_option_in_column260 = new BitSet(new long[]{0x00000000007E3802L});
    public static final BitSet FOLLOW_key_in_constraint273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_index285 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_INDEX_in_index296 = new BitSet(new long[]{0x0000806000008000L});
    public static final BitSet FOLLOW_name_in_index298 = new BitSet(new long[]{0x0000800000008000L});
    public static final BitSet FOLLOW_ON_in_index303 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_name_in_index305 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_index310 = new BitSet(new long[]{0x0000006000000080L});
    public static final BitSet FOLLOW_nameList_in_index312 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_index314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FULLTEXT_in_index319 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_name_in_index321 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_index323 = new BitSet(new long[]{0x0000006000000080L});
    public static final BitSet FOLLOW_nameList_in_index325 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_index327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_key339 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_KEY_in_key350 = new BitSet(new long[]{0x0000806000000002L});
    public static final BitSet FOLLOW_name_in_key352 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_key357 = new BitSet(new long[]{0x0000006000000080L});
    public static final BitSet FOLLOW_nameList_in_key359 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_key361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREIGN_in_key369 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_KEY_in_key371 = new BitSet(new long[]{0x0000806000400000L});
    public static final BitSet FOLLOW_name_in_key373 = new BitSet(new long[]{0x0000800000400000L});
    public static final BitSet FOLLOW_47_in_key378 = new BitSet(new long[]{0x0000006000000080L});
    public static final BitSet FOLLOW_nameList_in_key380 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_key382 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_reference_in_key387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_key_in_option399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_in_option404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_option409 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NULL_in_option412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AUTO_INC_in_option417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_option422 = new BitSet(new long[]{0x0004006200080000L});
    public static final BitSet FOLLOW_value_in_option426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_option430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_option434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REFERENCES_in_reference448 = new BitSet(new long[]{0x0000806000008002L});
    public static final BitSet FOLLOW_name_in_reference450 = new BitSet(new long[]{0x0000800000008002L});
    public static final BitSet FOLLOW_47_in_reference455 = new BitSet(new long[]{0x0000006000000080L});
    public static final BitSet FOLLOW_nameList_in_reference457 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_reference459 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_referenceOptions_in_reference464 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ON_in_referenceOptions477 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_DELETE_in_referenceOptions479 = new BitSet(new long[]{0x0000000017000000L});
    public static final BitSet FOLLOW_CASCADE_in_referenceOptions483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESTRICT_in_referenceOptions487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NO_in_referenceOptions491 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ACTION_in_referenceOptions493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_referenceOptions497 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_set_in_referenceOptions499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_referenceOptions514 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_UPDATE_in_referenceOptions516 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_CASCADE_in_referenceOptions520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_referenceOptions524 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_set_in_referenceOptions526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_order0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_parameter564 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_parameter566 = new BitSet(new long[]{0x0000006200000000L});
    public static final BitSet FOLLOW_value_in_parameter568 = new BitSet(new long[]{0x0002006000000002L});
    public static final BitSet FOLLOW_49_in_parameter572 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_name_in_parameter575 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_parameter577 = new BitSet(new long[]{0x0000006200000000L});
    public static final BitSet FOLLOW_value_in_parameter579 = new BitSet(new long[]{0x0002006000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_parameter587 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_CHARACTER_in_parameter589 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_SET_in_parameter591 = new BitSet(new long[]{0x0008006200000000L});
    public static final BitSet FOLLOW_51_in_parameter593 = new BitSet(new long[]{0x0000006200000000L});
    public static final BitSet FOLLOW_value_in_parameter596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_type608 = new BitSet(new long[]{0x0000800C00000002L});
    public static final BitSet FOLLOW_47_in_type612 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_INT_in_type614 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_49_in_type618 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_INT_in_type620 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_type625 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_set_in_type630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_type644 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_type646 = new BitSet(new long[]{0x0000006000000080L});
    public static final BitSet FOLLOW_nameList_in_type648 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_type650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BINARY_in_type655 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_type659 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_INT_in_type661 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_type663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_nameList677 = new BitSet(new long[]{0x00028060C0000002L});
    public static final BitSet FOLLOW_47_in_nameList681 = new BitSet(new long[]{0x0000006200000000L});
    public static final BitSet FOLLOW_value_in_nameList683 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_nameList685 = new BitSet(new long[]{0x00020060C0000002L});
    public static final BitSet FOLLOW_order_in_nameList690 = new BitSet(new long[]{0x0002006000000002L});
    public static final BitSet FOLLOW_49_in_nameList695 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_name_in_nameList698 = new BitSet(new long[]{0x00028060C0000002L});
    public static final BitSet FOLLOW_47_in_nameList702 = new BitSet(new long[]{0x0000006200000000L});
    public static final BitSet FOLLOW_value_in_nameList704 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_nameList706 = new BitSet(new long[]{0x00020060C0000002L});
    public static final BitSet FOLLOW_order_in_nameList711 = new BitSet(new long[]{0x0002006000000002L});
    public static final BitSet FOLLOW_name_in_value727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_value732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_name744 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_name748 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ID_in_name750 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_DEF_in_name758 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_name762 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_DEF_in_name764 = new BitSet(new long[]{0x0010000000000002L});

}