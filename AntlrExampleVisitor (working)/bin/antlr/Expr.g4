grammar Expr;

/* the grammar name and file name must match */

@header {
	package antlr;
}

// Start Symbol
prog: ( decl | expr)+ EOF		# Program		// # - label -> gonna create visitors
	;
	
decl: ID ':' INT_TYPE '=' NUM	# Declaration	
	;
	
	
/* ANTLR resolves ambiguities in favor of the alternative given first.  */
expr: expr '*' expr				# Multiplication
	| expr '/' expr				# Division
	| expr '+' expr				# Addition
	| expr '-' expr				# Subtraction
	| ID						# Variable
	| NUM						# Number
	//| BOOL						# Boolean
	;
	
//cmd:  'if' BOOL 'then' cmd
//	| 'if' BOOL 'then' cmd 'else' cmd
//	;
	
/* Tokens */
ID : [a-z][a-zA-Z0-9_]*; // identifiers
NUM : '0' | '-'?[1-9][0-9]*;
INT_TYPE : 'INT';
COMMENT : '--' ~[\r\n]+ -> skip; // anything thats not "character return" or "new line" skip
WHITE_SPACE : [ \t\n]+ -> skip;	// skip every " ", \t and \n
