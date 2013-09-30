grammar DDL;

options { language = Java; }

start : ( sql_statement SQ? )+ EOF ;

sql_statement
    : ddl_statement
    | other_statement
    ;

ddl_statement
    : drop_statement
    | create_statement
    | alter_statement
    | update_statement
    ;

other_statement
    : insert_statement
    | namespace
    | commit
    | set
    ;

namespace : USE ident ;
commit    : COMMIT ;
set       : SET ident ( EQ ident )? ;

drop_statement
    : DROP ( TABLE | DATABASE ) IF EXISTS nameList PURGE?
    | DROP ( TABLE | DATABASE ) nameList PURGE? ( IF EXISTS )?
    ;
insert_statement : INSERT IGNORE? INTO table_name parNameList? VALUES parValueList (CO parValueList)* ;
create_statement : CREATE ( database | table | index | view | triger | pl_sql ) ;
alter_statement  : ALTER TABLE table_name ( ADD alter_constraint )+ ;

update_statement
    : UPDATE table_name SET col_name EQ value ( CO col_name EQ value)*
    ;

database
    : ( DATABASE | SCHEMA ) ( IF NOT EXISTS )? schema_name create_option*
    ;

create_option
    : DEFAULT? CHARACTER SET EQ? charset_name # char_set
    | DEFAULT? COLLATE EQ? collation_name     # collate
    ;

index
    : ( ( UNIQUE | FULLTEXT | SPATIAL )? ) INDEX
      index_name index_type? ON table_name parNameList index_option?
    ;

index_type : USING ( BTREE | HASH )? ;
index_option : KEY_BSIZE '='? value | index_type ;

view : VIEW ident parNameList AS LP ~RP* RP ;

triger : ( OR REPLACE )? TRIGGER triger_name consume_until_end ;
pl_sql : ( OR REPLACE )? ( FUNCTION | PROCEDURE ) ident consume_until_end ;

consume_until_end : ( ~(END) | END ~(SQ) )* END ;

table
    : TEMPORARY? TABLE ( IF NOT EXISTS )?
      table_name LP ( table_definition ( CO | SQ )? )* RP
      table_option*
    ;

table_definition : column | table_constraint ;

table_option
    : DEFAULT? CHARACTER SET EQ? ident
    | DEFAULT? ident ( EQ? ( ident | INT ) )? ;

column
    : col_name data_type data_option? create_option?
      ( column_option | line_constraint )*
      ( ON UPDATE ident )?
    ;
column_option : NOT? NULL | AUTO_INC | DEFAULT ( value | NULL ) ;

table_constraint : constraint ;
line_constraint : constraint ;
alter_constraint : constraint ;

constraint
    : CONSTRAINT? constr_name? PRIMARY KEY constr_name? index_type? parNameList? index_option*            #primary
    | ( INDEX | KEY ) index_name? ( ON col_name )? index_type? parNameList index_option*                  #index_key
    | CONSTRAINT? constr_name? UNIQUE ( INDEX | KEY )? index_name? index_type? parNameList? index_option* #unique
    | ( FULLTEXT | SPATIAL ) ( INDEX | KEY )? index_name? parNameList index_option*                       #fulltext
    | CONSTRAINT? constr_name? FOREIGN KEY index_name? parNameList reference_definition                   #foreign
    | CONSTRAINT constr_name CHECK consume_par                                                            #check
    | reference_definition                                                                                #reference
    ;

consume_par : LP ( ~(LP|RP) | consume_par )* RP ;

reference_definition : REFERENCES table_name parNameList reference_option* ;
reference_option : ON ( UPDATE | DELETE ) refs ;
refs : ( ( RESTRICT | CASCADE ) DEFERRABLE? ) | ( SET NULL ) | ( NO ACTION ) ;

data_type
    : ident+ size? ( ENUM parValueList )? # generic
    | ENUM parValueList                   # enum
    | SET parValueList                    # set_type
    ;

data_option : SIGNED | UNSIGNED | ZEROFILL | BINARY ;

schema_name   : ident ;
table_name    : ident ;
col_name      : ident ;
index_name    : ident ;
charset_name  : ident ;
collation_name: ident ;
constr_name   : ident ;
triger_name   : ident ;

nameList    : ident ( LP value RP )? ( CO ident ( LP value RP )? )* ;
parNameList : LP nameList RP ;
valueList   : value ( CO value )* ;
parValueList: LP valueList RP ;
valuesList  : LP parValueList* RP ;

size    : LP INT ( CO INT )? RP ;
order   : ASC | DESC ;

value      : number | NULL | ident | function ;
ident      : ID | restricted | quoted_rest | string ;
number     : INT | ( quote INT quote ) ;
quote      : QO | DQ | GR ;
quoted_rest: quote restricted quote ;
string     : STRING_G | STRING_D | STRING_Q ;

function : ident consume_par ;

special_char
    : EQ | LP | RP | SQ | CO | QO | US | AT | DA | HA | SL | ST | DQ | GR | CL
    | DO | SP | CA | VB | PL
    ; 

restricted
    : ACTION | ADD | ALTER | ASC | BIGINT | BINARY | BIT | BTREE | CASCADE
    | CHARACTER | CHAR | CHECK | COLLATE | COL_FORMAT | COMMIT
    | CREATE | DATABASE | DECIMAL | DELETE | DESC | DISK | DOUBLE
    | DYNAMIC | ENUM | EXISTS | FIXED | FOREIGN | FULLTEXT | HASH | IF | INSERT
    | INTEGER | INTO | IS | NUMERIC | REAL | REFERENCES | RESTRICT | SCHEMA
    | SET | SMALLINT | SPATIAL | STORAGE | TABLE | TEMPORARY | UNSIGNED
    | UPDATE | USE | USING | VALUES | VARBINARY | VARCHAR | YEAR | ZEROFILL
    | REPLACE | AUTO_INC | IGNORE | END | FUNCTION
    ;

STRING_G : '`'  ( '\\' '`'  | . )*? '`'  ;
STRING_Q : '"'  ( '\\' '"'  | . )*? '"'  ;
STRING_D : '\'' ( '\\' '\'' | '\'' '\'' | . )*? '\'' ;

WS          : [ \r\t\u000C\n]+ -> skip ;
COMMENT     : CommentStart .*? CommentStop -> skip ;
LINE_COMMENT: CommentLineStart ~[\r\n]* ('\r'? '\n' | EOF) -> skip ;

EQ : '=' ; LP : '(' ; RP : ')' ; SQ : ';' ; CO : ',' ; QO : '\'' ; US : '_' ;
AT : '@' ; DA : '-' ; HA : '#' ; SL : '/' ; ST : '*' ; DQ : '"' ;  GR : '`' ;
CL : ':' ; DO : '.' ; SP : ' ' ; CA : '$' ; VB : '|' ; PL : '+' ;
                                                       
CONFLICT_START : '<<<<<<<' ;
CONFLICT_END   : '>>>>>>>' ;

CONFLICT : CONFLICT_START .*? CONFLICT_END ~[\r\n]* ('\r'? '\n' | EOF) -> skip ;

ACTION    : A C T I O N ;
ADD       : A D D ;
ALTER     : A L T E R ;
AS        : A S ;
ASC       : A S C ;
AUTO_INC  : A U T O US I N C R E M E N T ;
BIGINT    : B I G I N T ;
BINARY    : B I N A R Y ;
BIT       : B I T ;
BTREE     : B T R E E ;
CASCADE   : C A S C A D E ;
CHARACTER : C H A R A C T E R ;
CHAR      : C H A R ;
CHECK     : C H E C K ;
COLLATE   : C O L L A T E ;
COL_FORMAT: C O L U M N US F O R M A T ;
COMMIT    : C O M M I T ;
CONSTRAINT: C O N S T R A I N T ;
CREATE    : C R E A T E ;
DATABASE  : D A T A B A S E ;
DECIMAL   : D E M I C A L ;
DEFAULT   : D E F A U L T ;
DEFERRABLE: D E F E R R A B L E ;
DELETE    : D E L E T E ;
DESC      : D E S C ;
DISK      : D I S K ;
DOUBLE    : D O U B L E ;
DROP      : D R O P ;
DYNAMIC   : D Y N A M I C ;
END       : E N D ;
ENUM      : E N U M ;
EXISTS    : E X I S T S ;
FIXED     : F I X E D ;
FOREIGN   : F O R E I G N ;
FULLTEXT  : F U L L T E X T ;
FUNCTION  : F U N C T I O N ;
HASH      : H A S H ;
IF        : I F ;
IGNORE    : I G N O R E ;
INDEX     : I N D E X ;
INSERT    : I N S E R T ;
INTEGER   : ( I N T E G E R ) | ( I N T ) ;
INTO      : I N T O ;
IS        : I S ;
KEY       : K E Y ;
KEY_BSIZE : K E Y US B L O C K US S I Z E ;
MEMORY    : M E M O R Y ;
NO        : N O ;
NOT       : N O T ;
NULL      : N U L L ;
NUMERIC   : N U M E R I C ;
ON        : O N ;
OR        : O R ;
PRECISION : P R E C I S I O N ;
PROCEDURE : P R O C E D U R E ;
PRIMARY   : P R I M A R Y ;
PURGE     : P U R G E ;
REAL      : R E A L ;
REFERENCES: R E F E R E N C E S ;
REPLACE   : R E P L A C E ;
RESTRICT  : R E S T R I C T ;
SCHEMA    : S C H E M A ;
SET       : S E T ;
SIGNED    : S I G N E D ;
SMALLINT  : S M A L L I N T ;
SPATIAL   : S P A T I A L ;
STORAGE   : S T O R A G E ;
TABLE     : T A B L E ;
TEMPORARY : T E M P O R A R Y ;
TRIGGER    : T R I G G E R ;
UNIQUE    : U N I Q U E ;
UNSIGNED  : U N S I G N E D ;
UPDATE    : U P D A T E ;
USE       : U S E ;
USING     : U S I N G ;
VALUES    : V A L U E S? ;
VARBINARY : V A R B I N A R Y ;
VARCHAR   : V A R C H A R ;
VIEW      : V I E W ;
WHERE     : W H E R E ;
YEAR      : Y E A R ;
ZEROFILL  : Z E R O F I L L ;

INT      : ( DA? POS_DIGIT DIGIT* ( DO DIGIT* )? ) | ZERO+ DO? ZERO* ;
ID       : ID_FIRST ID_REST* ;
OTHER    : . ;

fragment ID_FIRST   : AnyLetter | US | DA | AT | HA | CL | DO ;
fragment ID_REST    : AnyLetter | DIGIT | US | DA | AT | HA | CL | DO ;
fragment DIGIT      : [0-9] ;
fragment POS_DIGIT  : [1-9] ;
fragment ZERO       : '0' ;
fragment AnyLetter  : LowerCase | UpperCase ;
fragment LowerCase  : [a-z] ;
fragment UpperCase  : [A-Z] ;
fragment CommentLineStart : ( SL SL ) | ( DA DA ) | HA ;
fragment CommentStart : SL ST ;
fragment CommentStop : ST SL ;

fragment A : [Aa] ; fragment B : [Bb] ; fragment C : [Cc] ; fragment D : [Dd] ;
fragment E : [Ee] ; fragment F : [Ff] ; fragment G : [Gg] ; fragment H : [Hh] ;
fragment I : [Ii] ; fragment J : [Jj] ; fragment K : [Kk] ; fragment L : [Ll] ;
fragment M : [Mm] ; fragment N : [Nn] ; fragment O : [Oo] ; fragment P : [Pp] ;
fragment Q : [Qq] ; fragment R : [Rr] ; fragment S : [Ss] ; fragment T : [Tt] ;
fragment U : [Uu] ; fragment V : [Vv] ; fragment W : [Ww] ; fragment X : [Xx] ;
fragment Y : [Yy] ; fragment Z : [Zz] ;
