import java_cup.runtime.*;
import java.util.*;
import java.io.*;
import java.lang.System;

%%

%function next_token
%class A4Scanner
%cup

%{
	static HashMap methodList = new HashMap();
	static int params = 0;
	static String method;
%}

%{ 
	public static boolean methodCheck()
	{
		System.out.println("method: "+method+" params: "+params);
		if(methodList.containsKey(method))
		{
			if((Integer)methodList.get(method) != params)
			{
				System.out.println("\nmethod parameters error\n");
				return false;
			}
		}
		else
		{
			methodList.put(method, params);
		}
		params=0;

		return true;
	}
	
%}

%eofval{
          return null;
%eofval}
%state COMMENTS, INLINECOMMENTS, HASH, FUNCTION


ID = [a-zA-Z_][a-zA-Z0-9_]*
METHOD = [a-zA-Z_][a-zA-Z0-9_]*\(
NUMBER = -?[0-9]+(\.[0-9]+)?([eE][\-\+][0-9]+)?

%%

<YYINITIAL>"void"		{ return new java_cup.runtime.Symbol( A4Symbol.VOID); }
<YYINITIAL, FUNCTION>"int"		{return new java_cup.runtime.Symbol( A4Symbol.INT); }
<YYINITIAL>"return"		{ return new java_cup.runtime.Symbol( A4Symbol.RETURN); }
<YYINITIAL>"main("		{return new java_cup.runtime.Symbol( A4Symbol.MAIN); }
<YYINITIAL>"if"			{return new java_cup.runtime.Symbol( A4Symbol.IF);}
<YYINITIAL>"for"		{return new java_cup.runtime.Symbol( A4Symbol.FOR);}
<YYINITIAL>"*"			{return new java_cup.runtime.Symbol( A4Symbol.TIMES);}
<YYINITIAL>"/"			{return new java_cup.runtime.Symbol( A4Symbol.DIVIDE);}
<YYINITIAL>"+"          {return new java_cup.runtime.Symbol( A4Symbol.PLUS); }
<YYINITIAL>"-"          {return new java_cup.runtime.Symbol( A4Symbol.MINUS); }
<YYINITIAL>";"          {return new java_cup.runtime.Symbol( A4Symbol.SEMI); }
<YYINITIAL, FUNCTION>"," {System.out.println(yytext()); return new java_cup.runtime.Symbol( A4Symbol.COMMA); }
<YYINITIAL>"("          {System.out.println(yytext()); return new java_cup.runtime.Symbol( A4Symbol.LPAR); }
<FUNCTION>")"			{yybegin(YYINITIAL); if(methodCheck()){return new java_cup.runtime.Symbol( A4Symbol.RPAR);}else{return new java_cup.runtime.Symbol( A4Symbol.METHODERR);} }
<YYINITIAL>")"          {System.out.println(yytext()); return new java_cup.runtime.Symbol( A4Symbol.RPAR); }
<YYINITIAL>"{"          {System.out.println(yytext()); return new java_cup.runtime.Symbol( A4Symbol.LBRA); }
<YYINITIAL>"}"          {System.out.println(yytext()); return new java_cup.runtime.Symbol( A4Symbol.RBRA); }
<YYINITIAL>"="			{System.out.println(yytext()); return new java_cup.runtime.Symbol( A4Symbol.EQUAL); }
<YYINITIAL>">"			{System.out.println(yytext()); return new java_cup.runtime.Symbol( A4Symbol.GREATER); }
<YYINITIAL>"<"			{System.out.println(yytext()); return new java_cup.runtime.Symbol( A4Symbol.LESS); }
<YYINITIAL>"printf("		{System.out.println(yytext()); return new java_cup.runtime.Symbol( A4Symbol.PRINTF); }
<YYINITIAL>{METHOD}		{System.out.println(yytext());method=yytext();yybegin(FUNCTION);return new java_cup.runtime.Symbol( A4Symbol.METHOD);}
<FUNCTION>{ID}			{System.out.println("func "+yytext());params++; return new java_cup.runtime.Symbol( A4Symbol.ID); }
<FUNCTION>")"			{yybegin(YYINITIAL);}
<YYINITIAL>{ID}         {System.out.println("ID: "+yytext()); return new java_cup.runtime.Symbol( A4Symbol.ID); }
<YYINITIAL>{NUMBER}		{System.out.println(yytext()); return new java_cup.runtime.Symbol(A4Symbol.NUMBER); }
<YYINITIAL>\"[^\"]*\"   { return new Symbol( A4Symbol.QUOTES); }

<YYINITIAL>"/*" {yybegin(COMMENTS);}
<COMMENTS>"*/" {yybegin(YYINITIAL); }
<COMMENTS>{ID}|{NUMBER}|<QUOTES> {}

<YYINITIAL>"//" {yybegin(INLINECOMMENTS);}
<INLINECOMMENTS>"\r"|"\n" {yybegin(YYINITIAL); }
<INLINECOMMENTS>{ID}|{NUMBER}|<QUOTES> {}

<YYINITIAL>"#" {yybegin(HASH);}
<HASH>"\r"|"\n" {yybegin(YYINITIAL); }
<HASH>{ID}|{NUMBER}|<QUOTES> {}

\r|\n {/* Do nothing */}
. {/* Do nothing */}
