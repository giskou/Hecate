grammar DDL;

options {
  language = Java;
}

@header {
  package gr.uoi.cs.daintiness.hecate.parser ;
  import gr.uoi.cs.daintiness.hecate.sql.* ;
  import java.util.TreeMap;
}

@lexer::header {
  package gr.uoi.cs.daintiness.hecate.parser ;
}

@members{
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
}

start returns [Schema s]
	:	( drop | create | namespace | insert | update | alter | commit )+
	{
		s = new Schema(tm) ;
	}
	;

namespace
	:	USE name ';'
	;
	
commit
	:	COMMIT ';'
	;

drop
	:	DROP TABLE ( IF EXISTS )? nameList ';'
	|	DROP DATABASE ( IF EXISTS )? nameList ';'
	;
	
create
	:	CREATE database ';'?
	|	CREATE schema ';'?
	|	CREATE table ';'?
	|	CREATE index ';'?
	;

insert
	:	INSERT IGNORE? INTO name ( '(' nameList ')' )? VALUES '(' (~';')* ')' ';'
	;

update
	:	UPDATE (~';')* ';'
	;

alter
	:	ALTER TABLE name ADD CONSTRAINT name? key ( ON ( UPDATE | DELETE ) ( CASCADE | UPDATE ) ) ';'
	;


database
	:	DATABASE ( IF NOT EXISTS )? name parameter?
	;

schema
	:	SCHEMA ( IF NOT EXISTS )? name parameter?
	;

table
	@init{
		am.clear();
	}
	:	TABLE ( IF NOT EXISTS )? name '(' definition ')' parameter*
	{
		String n = $name.text.replace("`","");
		tm.put(n, new Table(n, am, k)) ;
	}
	;

definition
	:	( column | constraint | index ) ( ',' ( column | constraint | index ) )*
	;

column
	:	name type option*
	{
		String t = $type.text;
		String n = $name.text.replace("`","");
		if ( (t != null) & (n != null) )
			am.put(n, new Attribute(n, t.toUpperCase(), false, null)) ;
	}
	;

constraint
	:	CONSTRAINT name key
	|	CONSTRAINT? FULLTEXT? key
	|	( CONSTRAINT name )? UNIQUE name? ( '(' nameList ')' )?
	|	CONSTRAINT name? CHECK '(' name IS NOT NULL ')'
	;

index
	:	( UNIQUE | PRIMARY )? INDEX name? ( ON name )? '(' nameList ')'
	|	FULLTEXT name '(' nameList ')'
	;

key
	@init{
		km.clear();
	}
	:	( UNIQUE | PRIMARY )? KEY name? ( '(' nameList ')' )?
	{
		if ($nameList.text != null) {
			String[] list = getArrayFromList($nameList.text);
			for (int i = 0; i < list.length; i++) {
				if (am.containsKey(list[i])) {
					Attribute a = am.get(list[i]);
					a.setToKey();
					km.put(list[i], a);
				}
			}
		}
	}
	|	FOREIGN KEY name? ( '(' nameList ')' )? reference
	{
		//TODO
	}
	;

option
	:	key
	|	reference
	|	NOT? NULL
	|	AUTO_INC
	|	DEFAULT ( value | NULL | empty )
	;

reference
	:	REFERENCES name? ( '(' nameList ')' )? referenceOptions*
	;

referenceOptions
	:	ON DELETE ( CASCADE | RESTRICT | NO ACTION | SET ( DEFAULT | NULL ) )
	|	ON UPDATE ( CASCADE | SET ( DEFAULT | NULL )  )
	;

order
	:	ASC
	|	DESC
	;

parameter
	:	name '=' value ','?
	|	( DEFAULT )? CHARACTER SET '='? value ','?
	|	( DEFAULT )? COLLATE '='? value ','?
	|	AUTO_INC '='? INT
	;

type
	:	( UNSIGNED | BINARY )? name ( '(' INT ( ',' INT )? ')' )? ( UNSIGNED | BINARY )?
	|	ENUM '(' nameList ')'
	|	BINARY ( '(' INT ')' )
	;

nameList
	:	name ( '(' value ')' )? order? ( ','? name ( '(' value ')' )? order? )*
	;

valueList
	:	( value | empty ) (',' ( value | empty ))*
	;

value
	:	name
	|	INT
	;

	empty
	:	'\'\''
	;

name
	:	ID ( '.' ID )*
	|	DEF ( '.' DEF )*
	|	ACTION
	;

DROP : 'DROP' | 'drop' ;
CREATE : 'CREATE' | 'create' ;
DATABASE : 'DATABASE' | 'database' ;
TABLE : 'TABLE' | 'table' ;
IF : 'IF' | 'if' ;
NOT : 'NOT' | 'not' ;
EXISTS : 'EXISTS' | 'exists' ;
ENUM : 'ENUM' | 'enum' ;
NULL : ('NULL' | 'null' | 'Null' )? ;
DEFAULT : 'DEFAULT' | 'default' ;
KEY : 'KEY' | 'key' ;
HASH : 'HASH' 'hash' ;
UNIQUE : 'UNIQUE' | 'unique' ;
PRIMARY : 'PRIMARY' | 'primary' ;
FOREIGN : 'FOREIGN' | 'foreign' ;
INDEX : 'INDEX' | 'index' ;
CONSTRAINT : 'CONSTRAINT' | 'constraint' ;
FULLTEXT : 'FULLTEXT' | 'fulltext' ;
REFERENCES : 'REFERENCES' | 'references' ;
ALTER : 'ALTER' | 'alter' ;
ON : 'ON' | 'on' ;
INTO : 'INTO' | 'into' ;
VALUES : 'VALUES' | 'values' ;
ADD : 'ADD' | 'add' ;
DELETE : 'DELETE' | 'delete' ;
CASCADE : 'CASCADE' | 'cascade' ;
RESTRICT : 'RESTRICT' | 'restrict' ;
ACTION : 'ACTION' | 'action' ;
NO : 'NO' | 'no' ;
SET : 'SET' | 'set' ;
INSERT : 'INSERT' | 'insert' ;
UPDATE : 'UPDATE' | 'update' ;
UNSIGNED : 'UNSIGNED' | 'unsigned' ;
BINARY : 'BINARY' | 'binary' ;
AUTO_INC : 'AUTO_INCREMENT' | 'auto_increment' ;
ASC : 'ASC' | 'asc' ;
DESC : 'DESC' | 'desc' ;
CHARACTER : 'CHARACTER' | 'character' ;
COLLATE : 'COLLATE' | 'collate' ;
USE : 'USE' | 'use' ;
SCHEMA : 'SCHEMA' | 'schema' ;
COMMIT : 'COMMIT' | 'commit' ;
IS : 'IS' | 'is' ;
CHECK : 'CHECK' | 'check' ;
IGNORE : 'IGNORE' | 'ignore' ;

ID	:	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;

INT	:	'-'? '0'..'9'+ ;

COMMENT
	:	'//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	|	'/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	|	'--' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	|  '#' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	;

CONFLICT	:	'<<<<<<<' ( options {greedy=false;} : . )* '>>>>>>>' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;} ;

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
	:	'\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
	|	UNICODE_ESC
	|	OCTAL_ESC
	;

fragment
OCTAL_ESC
	:	'\\' ('0'..'3') ('0'..'7') ('0'..'7')
	|	'\\' ('0'..'7') ('0'..'7')
	|	'\\' ('0'..'7')
	;

fragment
UNICODE_ESC
	:	'\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
	;
