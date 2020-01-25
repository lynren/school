/* 
* 03-60-214
* Assignment 2
* Lyndon Renaud
* 104 566 776
*/

/* imports */
import java.util.*;
import java.io.*;

%%
/*Options/Declarations*/

%integer
%class A2_104566776

/* main function */
%{
  public static void main(String [] args) throws java.io.IOException 
  {
    A2_104566776 yy = new A2_104566776(new FileReader(args[0]));
    //output file name
	Writer.outputFile = args[0].replaceAll("input", "output");
    while (0<=yy.yylex());
  }
%}

%{
	//Collection of unique tokens
	List<String> identifiers = new ArrayList();
	List<String> numbers = new ArrayList();
	List<String> keyList = new ArrayList();

	//Comment and string literal count
	int comms = 0;
	int strings = 0;
%}

/* File writer */
%{
	static class Writer
	{
		public static String outputFile;
			FileWriter w;
				Writer()
				{
					try
					{
						w = new FileWriter(outputFile);
					}
					catch(Exception e)
					{}
				}
	}
%}

/* check if token is unique */
%{
	public static void uniqueChecker(List<String> tokenList, String tok)
	{
		if(tokenList.contains(tok))	//if token is not unique, return
			return;
		tokenList.add(tok);	//else add unique token to the token list
		return;
	}
%}

/* Write to output when eof is reached */
%eof{
	try{
		Writer x= new Writer();
		x.w.write("identifiers: "+identifiers.size()+ "\r\n");
		x.w.write("keywords: "+keyList.size()+"\r\n");
		x.w.write("numbers: "+numbers.size()+ "\r\n");
		x.w.write("comments: "+comms+"\r\n");
		x.w.write("stringLiterals: "+strings+"\r\n");

		x.w.close();
	}catch(Exception e){
		System.out.println("output writing error");
	}
	return;
%eof}

/* IDs, nums */
Identifiers = [A-Za-z_][A-Za-z0-9_]*
Numbers = [^A-Za-z_][0-9.]+
sciNumber = [^A-Za-z_][0-9.]+(E(\+|-))[0-9]+

/* Comments */
Multicomms = {Documentation} | {oldC}
oldC = \/\*
Documentation = \/\*\*
inlinecomm = \/\/.*

/* String Literal */
stringLit = \".*\" 

/* Keywords */
keywords = {types} | {reserved}
types = int | float | double | char 
reserved = while | for | do | if | else | switch | case

/* States */
%xstate COMMENT, MULTICOMMENT

%%

/* initial state */
<YYINITIAL>
{
printf			{}
{stringLit}		{strings++;}
{sciNumber}		{uniqueChecker(numbers, yytext());}
{keywords}		{uniqueChecker(keyList, yytext());}
{Identifiers}	{uniqueChecker(identifiers, yytext());}
{Numbers}		{uniqueChecker(numbers, yytext());}
{Multicomms}	{comms++; yybegin(MULTICOMMENT);}
{inlinecomm}	{comms++; yybegin(COMMENT);}

\n 				{/*Do nothing*/}
.				{/*Do nothing*/}

[^]				{}
}

/* state when scanning an inline comment */
<COMMENT>
{	
	\n | \r | \r\n	{yybegin(YYINITIAL);}	//end of inline comment 
}

/* state when scanning a multiline comment */
<MULTICOMMENT>
{
	\*\/	{yybegin(YYINITIAL);}	//end of multiline comment
	[^]		{}
}