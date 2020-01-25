/*
03-60-214
Assignment 5
JFlex specification
Lyndon Renaud
104 566 776
*/

import java_cup.runtime.*;
import java.util.*;
import java.io.*;
import java.lang.System;

%%

%function next_token
%class A5_104566776_JF
%cup

%eofval{
          return null;
%eofval}

%state COMMENTS, INLINECOMMENTS, HASH, MAIN, RET, DO

ID = [a-zA-Z_][a-zA-Z0-9_]*
NUMBER = -?[0-9]+(\.[0-9]+)?([eE][\-\+][0-9]+)?

%%

<YYINITIAL,MAIN,DO>
{
"void"		{return new java_cup.runtime.Symbol( A5_104566776_Symbol.VOID); }
"int"		{return new java_cup.runtime.Symbol( A5_104566776_Symbol.INT); }
"do"		{yybegin(DO);return new java_cup.runtime.Symbol( A5_104566776_Symbol.DO);}
"if"		{return new java_cup.runtime.Symbol( A5_104566776_Symbol.IF);}
"else"		{return new java_cup.runtime.Symbol( A5_104566776_Symbol.ELSE);}
"for"		{return new java_cup.runtime.Symbol( A5_104566776_Symbol.FOR);}
"switch"	{return new java_cup.runtime.Symbol( A5_104566776_Symbol.SWITCH);}
"case"		{return new java_cup.runtime.Symbol( A5_104566776_Symbol.CASE);}
"default"	{return new java_cup.runtime.Symbol( A5_104566776_Symbol.DEFAULT);}
"break"		{return new java_cup.runtime.Symbol( A5_104566776_Symbol.BREAK);}
":"			{return new java_cup.runtime.Symbol( A5_104566776_Symbol.COLON);}
"*"			{return new java_cup.runtime.Symbol( A5_104566776_Symbol.TIMES);}
"/"			{return new java_cup.runtime.Symbol( A5_104566776_Symbol.DIVIDE);}
"+"         {return new java_cup.runtime.Symbol( A5_104566776_Symbol.PLUS); }
"-"         {return new java_cup.runtime.Symbol( A5_104566776_Symbol.MINUS); }
";"         {return new java_cup.runtime.Symbol( A5_104566776_Symbol.SEMI); }
"," 		{return new java_cup.runtime.Symbol( A5_104566776_Symbol.COMMA); }
"("         {return new java_cup.runtime.Symbol( A5_104566776_Symbol.LPAR); }
")"         {return new java_cup.runtime.Symbol( A5_104566776_Symbol.RPAR); }
"{"         {return new java_cup.runtime.Symbol( A5_104566776_Symbol.LBRA); }
"}"         {return new java_cup.runtime.Symbol( A5_104566776_Symbol.RBRA); }
"="			{return new java_cup.runtime.Symbol( A5_104566776_Symbol.EQUAL); }
">"			{return new java_cup.runtime.Symbol( A5_104566776_Symbol.GREATER);}
"<"			{return new java_cup.runtime.Symbol( A5_104566776_Symbol.LESS); }
"printf("	{ return new java_cup.runtime.Symbol( A5_104566776_Symbol.PRINTF);}
"/*"		{yybegin(COMMENTS);}
"//" 		{yybegin(INLINECOMMENTS);}
"#" 		{yybegin(HASH);}
}
<YYINITIAL, MAIN>"while"		{return new java_cup.runtime.Symbol( A5_104566776_Symbol.WHILE);}
<DO>"while"	{yybegin(MAIN);return new java_cup.runtime.Symbol( A5_104566776_Symbol.WHILECOND);}

<MAIN>"return"			{yybegin(RET);return new java_cup.runtime.Symbol( A5_104566776_Symbol.RETURN);}
<YYINITIAL>"return"		{return new java_cup.runtime.Symbol( A5_104566776_Symbol.RETURN); }
<YYINITIAL>"main"		{yybegin(MAIN);return new java_cup.runtime.Symbol( A5_104566776_Symbol.MAIN); }



<YYINITIAL,MAIN, DO>{ID}         {return new java_cup.runtime.Symbol( A5_104566776_Symbol.ID,yytext()); }

/* Do not return a return value for main method */
<RET>{NUMBER}			{yybegin(YYINITIAL);return new java_cup.runtime.Symbol(A5_104566776_Symbol.NUMBER,""); }

<YYINITIAL,MAIN, DO>{NUMBER}		{return new java_cup.runtime.Symbol(A5_104566776_Symbol.NUMBER,yytext()); }
<YYINITIAL,MAIN, DO>\"[^\"]*\"   {return new Symbol( A5_104566776_Symbol.QUOTES,yytext()); }


<COMMENTS>"*/" {yybegin(YYINITIAL); }
<COMMENTS>{ID}|{NUMBER}|<QUOTES> {}

<INLINECOMMENTS>"\r"|"\n" {yybegin(YYINITIAL); }
<INLINECOMMENTS>{ID}|{NUMBER}|<QUOTES> {}

<HASH>"\r"|"\n" {yybegin(YYINITIAL); }
<HASH>{ID}|{NUMBER}|<QUOTES> {}

\r|\n {/* Do nothing */}
. {/* Do nothing */}
