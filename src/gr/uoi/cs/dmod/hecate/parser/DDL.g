grammar DDL;

options {
  language = Java;
}

@header {
  package gr.uoi.cs.dmod.hecate.parser ;
  import gr.uoi.cs.dmod.hecate.sql.* ;
  import java.util.TreeMap;
}

@lexer::header {
  package gr.uoi.cs.dmod.hecate.parser ;
}

@members{
	Schema s ;
	TreeMap<String, Table> tm = new TreeMap<String, Table>();
	TreeMap<String, Attribute> km = new TreeMap<String, Attribute>();
	TreeMap<String, Attribute> am = new TreeMap<String, Attribute>();
	Key k = null;
}

start returns [Schema s]
	:	( drop | create | namespace )+
	{
		s = new Schema(tm) ;
	}
	;
	
namespace
	:	USE name ';'
	;

drop
	:	DROP TABLE ( IF EXISTS )? nameList ';'
	;
	
create
	:	CREATE schema ';'
	|	CREATE table ';'
	|	CREATE index ';'
	;
	
schema
	: SCHEMA ( IF NOT EXISTS )? name parameter?
	;
	
table
	@init{
		am.clear();
	}
	: TABLE ( IF NOT EXISTS )? name '(' definition ')' parameter?
	{
		tm.put($name.text, new Table($name.text, am, k)) ;
	}
	;
	
definition
	:	( column | constraint | index ) ( ',' ( column | constraint | index ) )*
	;
	
column
	:	name type option*
	{
		am.put($name.text, new Attribute($name.text, $type.text, false, null)) ;
	}
	;
	
constraint
	:	key
	;
	
index
	:	( UNIQUE | PRIMARY )? INDEX name? ( ON name )? '(' nameList ')'
	|	FULLTEXT name '(' nameList ')'
	;
	
key
	:	( UNIQUE | PRIMARY )? KEY name? ( '(' nameList ')' )?
	|	FOREIGN KEY name? ( '(' nameList ')' )? reference
	;
	
option
	:	key
	|	reference
	|	NOT? NULL
	|	AUTO_INC
	|	DEFAULT ( value | NULL | '\'\'' )
	;
	
reference
	:	REFERENCES name? ( '(' nameList ')' )? referenceOptions*
	;
	
referenceOptions
	:	ON DELETE ( CASCADE | RESTRICT | NO ACTION | SET ( DEFAULT | NULL ) )
	|	ON UPDATE ( CASCADE | SET ( DEFAULT | NULL )  );
	
order
	:	ASC
	|	DESC
	;
	
parameter
	:	name '=' value ( ','? name '=' value )*
	|	DEFAULT CHARACTER SET '='? value
	;
	
type
	:	name ( '(' INT ( ',' INT )? ')' )? ( UNSIGNED | BINARY )?
	|	ENUM '(' nameList ')'
	|	BINARY ( '(' INT ')' )
	;
	
nameList
	:	name ( '(' value ')' )? order? ( ','? name ( '(' value ')' )? order? )*
	;
	
value
	:	name
	|	INT
	;
	
name
	:	ID ( '.' ID )*
	|	DEF ( '.' DEF )*
	;

DROP : 'DROP' | 'drop' ;
CREATE : 'CREATE' | 'create' ;
TABLE : 'TABLE' | 'table' ;
IF : 'IF' | 'if' ;
NOT : 'NOT' | 'not' ;
EXISTS : 'EXISTS' | 'exists' ;
ENUM : 'ENUM' | 'enum' ;
NULL : ('NULL' | 'null')? ;
DEFAULT : 'DEFAULT' | 'default' ;
KEY : 'KEY' | 'key' ;
HASH : 'HASH' 'hash' ;
UNIQUE : 'UNIQUE' | 'unique' ;
PRIMARY : 'PRIMARY' | 'primary' ;
FOREIGN : 'FOREIGN' | 'foreign' ;
INDEX : 'INDEX' | 'index' ;
FULLTEXT : 'FULLTEXT' | 'fulltext' ;
REFERENCES : 'REFERENCES' | 'references' ;
ON : 'ON' | 'on' ;
DELETE : 'DELETE' | 'delete' ;
CASCADE : 'CASCADE' | 'cascade' ;
RESTRICT : 'RESTRICT' | 'restrict' ;
ACTION : 'ACTION' | 'action' ;
NO : 'NO' | 'no' ;
SET : 'SET' | 'set' ;
UPDATE : 'UPDATE' | 'update' ;
UNSIGNED : 'UNSIGNED' | 'unsigned' ;
BINARY : 'BINARY' | 'binary' ;
AUTO_INC : 'AUTO_INCREMENT' | 'auto_increment' ;
ASC : 'ASC' | 'asc' ;
DESC : 'DESC' | 'desc' ;
CHARACTER : 'CHARACTER' | 'character' ;
USE : 'USE' | 'use' ;
SCHEMA : 'SCHEMA' | 'schema' ;

ID	:	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;

INT	:	'0'..'9'+ ;

COMMENT
	:	'//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	|	'/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	|	'--' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	;

WS  :	( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;} ;

DEF	:	( '\'' ( ESC_SEQ | ~('\\'|'\'') )+ '\'' )
	|	( '"' ( ESC_SEQ | ~('\\'|'"') )+ '"' )
	|	( '`' ( ESC_SEQ | ~('\\'|'`') )+ '`' )
	;

fragment
HEX_DIGIT
	:	('0'..'9'|'a'..'f'|'A'..'F')
	;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
