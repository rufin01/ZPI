grammar Expr;

/* the grammar name and file name must match */

@header {
	package antlr;
}

// Start Symbol
prog: ( variableDecl | expr )+ EOF		# Program		// # - label -> gonna create visitors	//change expr to statement in later versions
	;
	
//decl: variableDecl	
//	| functionDecl
//	;
	
variableDecl: ID ':' TYPE ('=' expr)? END					# VariableDeclaration		// ()? - everything in parens is optional
	;
	
//// FUNCTION SECTOR------------------------------------
//functionDecl: ID ':' TYPE '(' formalParameters? ')' block	# FunctionDeclaration		// fun: VOID (x: INT, y: FLOAT) {...}
//	;
//	
//formalParameters: formalParameter (',' formalParameter)*
//	;
//	
//formalParameter: ID ':' TYPE
//	;
//// ---------------------------------------------------	
	
	
/* ANTLR resolves ambiguities in favor of the alternative given first.  */
expr: //ID '(' exprList? ')'			# FunctionExpression
	 '-' expr						# UnaryMinus
	| expr op=(GEQ|SEQ|EQU) expr	# BooleanBinary
	| '!' expr						# BoolNot
	| expr op=(MUL|DIV) expr		# MulDiv
	| expr op=(ADD|SUB) expr		# AddSub
	| ID							# Variable
	| NUM							# Number
	| BOOL							# TrueFalse
	| STRING						# String
	| gml							# GraphElement
	| map							# MapStructure
	| '(' expr ')'					# Parens
	;
	
	
//exprList: expr (',' expr)*;			// used mostly as function arguments list

//// stat - statement, implementation should look like a switch
//stat: block							# statementsBlock
//	| ifstat						# IfStatement
//	| whilestat						# WhileStatement
//	| 'return' expr? END			# returnExpression
//	| expr '=' expr END				# assignment
//	| expr END						# funcCall				// function call
//	| decl							# instatementDeclaration
//	;
//	
//block: '{' stat* '}' ;		// possibly empty statement block
//	
//ifstat:   'if' expr 'then' stat ('else' stat)?
//	;
//		
//whilestat: 	 'while' expr 'do' stat
//	;
	
map: BEGM tuples? ENDM;				// [("nazwaNode'a", nodeVariable), ...]

tuples: tuple ( SEP tuple )*;

tuple: '(' STRING ',' expr ')';


graph: 'graph(' expr SEP expr ')'					# GraphDeclaration
	;	

node: 'node(' expr SEP expr SEP expr ')'			# NodeDeclaration
	;				

edge: 'edge(' expr SEP expr ')'						# EdgeDeclaration
	;

point: 'point(' expr SEP expr SEP expr (SEP expr (SEP expr SEP expr SEP expr)?)? ')'		# PointDeclaration
	;

gml:  graph
	| node
	| edge
	| point
	;

BEGM: '[';
ENDM: ']';
SEP: ',';

		
	
/* Tokens */
ID : [a-z][a-zA-Z0-9_]*; // identifiers

NUM:  INT
	| FLOAT;
	
INT: '-'? ('0' | [1-9] DIGIT*);
FLOAT: 	  '-'? DIGIT+ '.' DIGIT*
		| '-'? 		  '.' DIGIT+
		;
		
//by `fragment` we tell ANTLR that the next rule will be used only by other lexical rules
fragment
DIGIT: [0-9];

STRING: '"' (ESC|.)*? '"'; // match anything in "..."
fragment
ESC: '\\"' | '\\\\';

BOOL: 'True' 
	| 'False'
	;


TYPE: BASIC_TYPE '[]'?	
	;
	
BASIC_TYPE
	  :	'INT'
	  | 'FLOAT'
	  | 'VOID'
	  | 'BOOL'
	  | 'GRAPH'
	  | 'NODE'
	  | 'EDGE'
	  | 'POINT'
	  | 'STRING'
	  ;
	  
COMMENT : '--' ~[\r\n]* -> skip; 	// anything thats not "character return" or "new line" skip
WHITE_SPACE : [ \t\r\n]+ -> skip;	// skip every " ", \t and \n \r - windows newline
END: ';';							// end sign, after every command

// operators
MUL:	'*';
DIV:	'/';
ADD:	'+';
SUB:	'-';
GEQ:	'>' '='?;
SEQ:	'<' '='?;
EQU:	'==';
