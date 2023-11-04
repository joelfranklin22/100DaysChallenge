%{
#include<stdio.h>
#include "lex.yy.c"
%}
%token LETTER DIGIT
%%
ID : LETTER  DIGIT {printf("\n valid Identifier");}
     ;
%%
void main()
{
	printf("\Enter string:");
	yyparse();
}
int yyerror(char *msg)
{
	printf("Invalid Identifier");
}
