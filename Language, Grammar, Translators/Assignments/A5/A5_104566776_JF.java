/* The following code was generated by JFlex 1.4.3 on 4/1/18 8:14 PM */

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


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 4/1/18 8:14 PM from the specification file
 * <tt>A5_104566776_JF.flex</tt>
 */
class A5_104566776_JF implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int RET = 10;
  public static final int DO = 12;
  public static final int HASH = 6;
  public static final int INLINECOMMENTS = 4;
  public static final int YYINITIAL = 0;
  public static final int MAIN = 8;
  public static final int COMMENTS = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  2,  2,  3,  3,  4,  4,  5, 5
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\12\0\1\56\2\0\1\56\24\0\1\50\1\46\4\0\1\36\1\37"+
    "\1\32\1\6\1\35\1\3\1\4\1\33\12\2\1\31\1\34\1\44"+
    "\1\42\1\43\2\0\4\1\1\5\11\1\1\53\1\1\1\51\1\1"+
    "\1\55\1\54\1\52\5\1\4\0\1\1\1\0\1\25\1\27\1\23"+
    "\1\12\1\16\1\15\1\1\1\24\1\11\1\1\1\30\1\17\1\47"+
    "\1\13\1\10\1\45\1\1\1\21\1\20\1\14\1\26\1\7\1\22"+
    "\3\1\1\40\1\0\1\41\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\6\0\1\1\1\2\1\3\1\4\1\5\12\2\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\2\1\22\1\2\1\1\2\23"+
    "\3\1\1\24\1\2\1\25\1\1\1\2\2\0\2\2"+
    "\1\26\1\27\10\2\1\30\1\31\2\2\1\0\1\32"+
    "\3\0\1\2\2\0\1\2\1\3\1\0\1\2\1\33"+
    "\1\2\1\34\10\2\1\23\2\0\1\2\1\25\1\0"+
    "\1\2\1\3\1\35\1\2\1\36\3\2\1\37\2\2"+
    "\1\40\1\23\1\0\1\2\1\25\4\2\1\41\1\42"+
    "\1\2\1\0\1\2\1\43\1\2\1\44\1\45\1\2"+
    "\1\0\1\46\1\47\1\50\1\0\1\23";

  private static int [] zzUnpackAction() {
    int [] result = new int[130];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\57\0\136\0\215\0\274\0\353\0\u011a\0\u0149"+
    "\0\u0178\0\u01a7\0\u011a\0\u01d6\0\u0205\0\u0234\0\u0263\0\u0292"+
    "\0\u02c1\0\u02f0\0\u031f\0\u034e\0\u037d\0\u011a\0\u011a\0\u03ac"+
    "\0\u011a\0\u011a\0\u011a\0\u011a\0\u011a\0\u011a\0\u011a\0\u011a"+
    "\0\u011a\0\u03db\0\u011a\0\u040a\0\u0439\0\u0468\0\u0497\0\u04c6"+
    "\0\u04f5\0\u0524\0\u011a\0\u0553\0\u0582\0\u05b1\0\u05e0\0\u060f"+
    "\0\u063e\0\u066d\0\u069c\0\u0149\0\u0149\0\u06cb\0\u06fa\0\u0729"+
    "\0\u0758\0\u0787\0\u07b6\0\u07e5\0\u0814\0\u011a\0\u011a\0\u0843"+
    "\0\u0872\0\u0439\0\u011a\0\u08a1\0\u08d0\0\u08ff\0\u092e\0\u095d"+
    "\0\u098c\0\u09bb\0\u09ea\0\u0a19\0\u0a48\0\u0149\0\u0a77\0\u0149"+
    "\0\u0aa6\0\u0ad5\0\u0b04\0\u0b33\0\u0b62\0\u0b91\0\u0bc0\0\u0bef"+
    "\0\u0c1e\0\u0c4d\0\u0c7c\0\u0cab\0\u0cda\0\u0d09\0\u0d38\0\u0a19"+
    "\0\u0149\0\u0d67\0\u0149\0\u0d96\0\u0dc5\0\u0df4\0\u0149\0\u0e23"+
    "\0\u0e52\0\u0149\0\u0c4d\0\u0e81\0\u0eb0\0\u0d09\0\u0edf\0\u0f0e"+
    "\0\u0f3d\0\u0f6c\0\u0149\0\u0149\0\u0f9b\0\u0fca\0\u0ff9\0\u0149"+
    "\0\u1028\0\u0149\0\u0149\0\u1057\0\u1086\0\u0149\0\u0149\0\u011a"+
    "\0\u10b5\0\u011a";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[130];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\7\1\10\1\11\1\12\1\7\1\10\1\13\1\14"+
    "\1\10\1\15\1\16\2\10\1\17\1\20\1\10\1\21"+
    "\1\22\1\23\1\24\3\10\1\25\1\10\1\26\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\1\45\5\10\2\7"+
    "\1\46\1\47\1\50\1\7\1\46\1\7\22\46\1\7"+
    "\1\51\11\7\1\52\1\46\1\7\1\46\1\7\5\46"+
    "\2\7\1\46\1\47\1\50\1\7\1\46\1\7\22\46"+
    "\13\7\1\52\1\46\1\7\1\46\1\7\5\46\1\53"+
    "\1\7\1\10\1\11\1\12\1\7\1\10\1\13\1\14"+
    "\1\10\1\15\1\16\2\10\1\17\1\20\1\10\1\21"+
    "\1\54\1\23\1\24\3\10\1\25\1\10\1\26\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\1\41\1\42\1\43\1\10\1\45\5\10\3\7"+
    "\1\55\1\56\54\7\1\10\1\11\1\12\1\7\1\10"+
    "\1\13\1\14\1\10\1\15\1\16\2\10\1\17\1\20"+
    "\1\10\1\21\1\10\1\57\1\24\3\10\1\25\1\10"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\10\1\45"+
    "\5\10\1\7\60\0\2\10\2\0\1\10\1\0\22\10"+
    "\14\0\1\10\1\0\1\10\1\0\5\10\3\0\1\11"+
    "\1\0\1\60\1\61\10\0\1\61\42\0\1\11\55\0"+
    "\2\10\2\0\1\10\1\0\1\10\1\62\20\10\14\0"+
    "\1\10\1\0\1\10\1\0\5\10\2\0\2\10\2\0"+
    "\1\10\1\0\4\10\1\63\1\10\1\64\13\10\14\0"+
    "\1\10\1\0\1\10\1\0\5\10\2\0\2\10\2\0"+
    "\1\10\1\0\1\10\1\65\5\10\1\66\12\10\14\0"+
    "\1\10\1\0\1\10\1\0\5\10\2\0\2\10\2\0"+
    "\1\10\1\0\1\10\1\67\20\10\14\0\1\10\1\0"+
    "\1\10\1\0\5\10\2\0\2\10\2\0\1\10\1\0"+
    "\10\10\1\70\11\10\14\0\1\10\1\0\1\10\1\0"+
    "\5\10\2\0\2\10\2\0\1\10\1\0\13\10\1\71"+
    "\6\10\14\0\1\10\1\0\1\10\1\0\5\10\2\0"+
    "\2\10\2\0\1\10\1\0\7\10\1\72\12\10\14\0"+
    "\1\10\1\0\1\10\1\0\5\10\2\0\2\10\2\0"+
    "\1\10\1\0\15\10\1\73\4\10\14\0\1\10\1\0"+
    "\1\10\1\0\5\10\2\0\2\10\2\0\1\10\1\0"+
    "\16\10\1\74\3\10\14\0\1\10\1\0\1\10\1\0"+
    "\5\10\2\0\2\10\2\0\1\10\1\0\12\10\1\75"+
    "\7\10\14\0\1\10\1\0\1\10\1\0\5\10\33\0"+
    "\1\76\1\77\24\0\2\10\2\0\1\10\1\0\12\10"+
    "\1\100\7\10\14\0\1\10\1\0\1\10\1\0\5\10"+
    "\2\0\2\10\2\0\1\10\1\0\16\10\1\101\3\10"+
    "\14\0\1\10\1\0\1\10\1\0\5\10\1\0\50\102"+
    "\1\103\6\102\1\0\2\46\2\0\1\46\1\0\22\46"+
    "\14\0\1\46\1\0\1\46\1\0\5\46\3\0\1\47"+
    "\1\0\1\104\1\105\10\0\1\105\42\0\1\47\107\0"+
    "\1\53\74\0\1\106\6\0\2\10\2\0\1\10\1\0"+
    "\7\10\1\107\12\10\14\0\1\10\1\0\1\10\1\0"+
    "\5\10\3\0\1\55\1\0\1\110\1\111\10\0\1\111"+
    "\42\0\1\55\55\0\2\10\2\0\1\10\1\0\15\10"+
    "\1\112\4\10\14\0\1\10\1\0\1\10\1\0\5\10"+
    "\3\0\1\113\57\0\1\114\2\0\1\114\51\0\2\10"+
    "\2\0\1\10\1\0\2\10\1\115\17\10\14\0\1\10"+
    "\1\0\1\10\1\0\5\10\2\0\2\10\2\0\1\10"+
    "\1\0\5\10\1\116\14\10\14\0\1\10\1\0\1\10"+
    "\1\0\5\10\2\0\2\10\2\0\1\10\1\0\6\10"+
    "\1\117\13\10\14\0\1\10\1\0\1\10\1\0\5\10"+
    "\2\0\2\10\2\0\1\10\1\0\12\10\1\120\7\10"+
    "\14\0\1\10\1\0\1\10\1\0\5\10\2\0\2\10"+
    "\2\0\1\10\1\0\11\10\1\121\10\10\14\0\1\10"+
    "\1\0\1\10\1\0\5\10\2\0\2\10\2\0\1\10"+
    "\1\0\2\10\1\122\17\10\14\0\1\10\1\0\1\10"+
    "\1\0\5\10\2\0\2\10\2\0\1\10\1\0\5\10"+
    "\1\123\14\10\14\0\1\10\1\0\1\10\1\0\5\10"+
    "\2\0\2\10\2\0\1\10\1\0\2\10\1\124\17\10"+
    "\14\0\1\10\1\0\1\10\1\0\5\10\2\0\2\10"+
    "\2\0\1\10\1\0\11\10\1\125\10\10\14\0\1\10"+
    "\1\0\1\10\1\0\5\10\2\0\2\10\2\0\1\10"+
    "\1\0\7\10\1\126\12\10\14\0\1\10\1\0\1\10"+
    "\1\0\5\10\2\0\2\10\2\0\1\10\1\0\2\10"+
    "\1\127\17\10\14\0\1\10\1\0\1\10\1\0\5\10"+
    "\2\0\2\10\2\0\1\10\1\0\2\10\1\130\17\10"+
    "\14\0\1\10\1\0\1\10\1\0\5\10\3\0\1\131"+
    "\57\0\1\132\2\0\1\132\122\0\1\133\5\0\2\10"+
    "\2\0\1\10\1\0\5\10\1\134\14\10\14\0\1\10"+
    "\1\0\1\10\1\0\5\10\3\0\1\135\57\0\1\136"+
    "\2\0\1\136\51\0\2\10\2\0\1\10\1\0\2\10"+
    "\1\137\17\10\14\0\1\10\1\0\1\10\1\0\5\10"+
    "\3\0\1\113\2\0\1\61\10\0\1\61\42\0\1\140"+
    "\55\0\2\10\2\0\1\10\1\0\3\10\1\141\16\10"+
    "\14\0\1\10\1\0\1\10\1\0\5\10\2\0\2\10"+
    "\2\0\1\10\1\0\16\10\1\142\3\10\14\0\1\10"+
    "\1\0\1\10\1\0\5\10\2\0\2\10\2\0\1\10"+
    "\1\0\7\10\1\143\12\10\14\0\1\10\1\0\1\10"+
    "\1\0\5\10\2\0\2\10\2\0\1\10\1\0\5\10"+
    "\1\144\14\10\14\0\1\10\1\0\1\10\1\0\5\10"+
    "\2\0\2\10\2\0\1\10\1\0\17\10\1\145\2\10"+
    "\14\0\1\10\1\0\1\10\1\0\5\10\2\0\2\10"+
    "\2\0\1\10\1\0\10\10\1\146\11\10\14\0\1\10"+
    "\1\0\1\10\1\0\5\10\2\0\2\10\2\0\1\10"+
    "\1\0\7\10\1\147\12\10\14\0\1\10\1\0\1\10"+
    "\1\0\5\10\2\0\2\10\2\0\1\10\1\0\16\10"+
    "\1\150\3\10\14\0\1\10\1\0\1\10\1\0\5\10"+
    "\2\0\2\10\2\0\1\10\1\0\4\10\1\151\15\10"+
    "\14\0\1\10\1\0\1\10\1\0\5\10\2\0\2\10"+
    "\2\0\1\10\1\0\4\10\1\152\15\10\14\0\1\10"+
    "\1\0\1\10\1\0\5\10\3\0\1\131\2\0\1\105"+
    "\10\0\1\105\42\0\1\153\127\0\1\154\4\0\2\10"+
    "\2\0\1\10\1\0\17\10\1\155\2\10\14\0\1\10"+
    "\1\0\1\10\1\0\5\10\3\0\1\135\2\0\1\111"+
    "\10\0\1\111\42\0\1\156\55\0\2\10\2\0\1\10"+
    "\1\0\10\10\1\157\11\10\14\0\1\10\1\0\1\10"+
    "\1\0\5\10\2\0\2\10\2\0\1\10\1\0\17\10"+
    "\1\160\2\10\14\0\1\10\1\0\1\10\1\0\5\10"+
    "\2\0\2\10\2\0\1\10\1\0\14\10\1\161\5\10"+
    "\14\0\1\10\1\0\1\10\1\0\5\10\2\0\2\10"+
    "\2\0\1\10\1\0\12\10\1\162\7\10\14\0\1\10"+
    "\1\0\1\10\1\0\5\10\2\0\2\10\2\0\1\10"+
    "\1\0\7\10\1\163\12\10\14\0\1\10\1\0\1\10"+
    "\1\0\5\10\2\0\2\10\2\0\1\10\1\0\21\10"+
    "\1\164\14\0\1\10\1\0\1\10\1\0\5\10\2\0"+
    "\2\10\2\0\1\10\1\0\5\10\1\165\14\10\14\0"+
    "\1\10\1\0\1\10\1\0\5\10\55\0\1\166\3\0"+
    "\2\10\2\0\1\10\1\0\12\10\1\167\7\10\14\0"+
    "\1\10\1\0\1\10\1\0\5\10\2\0\2\10\2\0"+
    "\1\10\1\0\7\10\1\170\12\10\14\0\1\10\1\0"+
    "\1\10\1\0\5\10\2\0\2\10\2\0\1\10\1\0"+
    "\10\10\1\171\11\10\14\0\1\10\1\0\1\10\1\0"+
    "\5\10\2\0\2\10\2\0\1\10\1\0\15\10\1\172"+
    "\4\10\14\0\1\10\1\0\1\10\1\0\5\10\2\0"+
    "\2\10\2\0\1\10\1\0\4\10\1\173\15\10\14\0"+
    "\1\10\1\0\1\10\1\0\5\10\2\0\2\10\2\0"+
    "\1\10\1\0\6\10\1\174\13\10\14\0\1\10\1\0"+
    "\1\10\1\0\5\10\6\0\1\175\52\0\2\10\2\0"+
    "\1\10\1\0\4\10\1\176\15\10\14\0\1\10\1\0"+
    "\1\10\1\0\5\10\2\0\2\10\2\0\1\10\1\0"+
    "\5\10\1\177\14\10\14\0\1\10\1\0\1\10\1\0"+
    "\5\10\2\0\2\10\2\0\1\10\1\0\22\10\5\0"+
    "\1\200\6\0\1\10\1\0\1\10\1\0\5\10\56\0"+
    "\1\201\44\0\1\202\13\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4324];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\6\0\1\11\3\1\1\11\12\1\2\11\1\1\11\11"+
    "\1\1\1\11\7\1\1\11\4\1\2\0\14\1\2\11"+
    "\2\1\1\0\1\11\3\0\1\1\2\0\2\1\1\0"+
    "\15\1\2\0\2\1\1\0\15\1\1\0\11\1\1\0"+
    "\6\1\1\0\2\1\1\11\1\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[130];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  A5_104566776_JF(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  A5_104566776_JF(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 130) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 33: 
          { return new java_cup.runtime.Symbol( A5_104566776_Symbol.WHILE);
          }
        case 41: break;
        case 36: 
          { return new java_cup.runtime.Symbol( A5_104566776_Symbol.SWITCH);
          }
        case 42: break;
        case 23: 
          { yybegin(DO);return new java_cup.runtime.Symbol( A5_104566776_Symbol.DO);
          }
        case 43: break;
        case 5: 
          { return new java_cup.runtime.Symbol( A5_104566776_Symbol.PLUS);
          }
        case 44: break;
        case 28: 
          { return new java_cup.runtime.Symbol( A5_104566776_Symbol.FOR);
          }
        case 45: break;
        case 17: 
          { return new java_cup.runtime.Symbol( A5_104566776_Symbol.LESS);
          }
        case 46: break;
        case 4: 
          { return new java_cup.runtime.Symbol( A5_104566776_Symbol.MINUS);
          }
        case 47: break;
        case 32: 
          { yybegin(MAIN);return new java_cup.runtime.Symbol( A5_104566776_Symbol.MAIN);
          }
        case 48: break;
        case 29: 
          { return new java_cup.runtime.Symbol( A5_104566776_Symbol.VOID);
          }
        case 49: break;
        case 35: 
          { yybegin(MAIN);return new java_cup.runtime.Symbol( A5_104566776_Symbol.WHILECOND);
          }
        case 50: break;
        case 31: 
          { return new java_cup.runtime.Symbol( A5_104566776_Symbol.CASE);
          }
        case 51: break;
        case 38: 
          { yybegin(RET);return new java_cup.runtime.Symbol( A5_104566776_Symbol.RETURN);
          }
        case 52: break;
        case 30: 
          { return new java_cup.runtime.Symbol( A5_104566776_Symbol.ELSE);
          }
        case 53: break;
        case 8: 
          { return new java_cup.runtime.Symbol( A5_104566776_Symbol.DIVIDE);
          }
        case 54: break;
        case 10: 
          { return new java_cup.runtime.Symbol( A5_104566776_Symbol.COMMA);
          }
        case 55: break;
        case 20: 
          { yybegin(YYINITIAL);
          }
        case 56: break;
        case 25: 
          { yybegin(INLINECOMMENTS);
          }
        case 57: break;
        case 9: 
          { return new java_cup.runtime.Symbol( A5_104566776_Symbol.SEMI);
          }
        case 58: break;
        case 1: 
          { /* Do nothing */
          }
        case 59: break;
        case 26: 
          { return new Symbol( A5_104566776_Symbol.QUOTES,yytext());
          }
        case 60: break;
        case 40: 
          { return new java_cup.runtime.Symbol( A5_104566776_Symbol.PRINTF);
          }
        case 61: break;
        case 16: 
          { return new java_cup.runtime.Symbol( A5_104566776_Symbol.GREATER);
          }
        case 62: break;
        case 13: 
          { return new java_cup.runtime.Symbol( A5_104566776_Symbol.LBRA);
          }
        case 63: break;
        case 27: 
          { return new java_cup.runtime.Symbol( A5_104566776_Symbol.INT);
          }
        case 64: break;
        case 39: 
          { return new java_cup.runtime.Symbol( A5_104566776_Symbol.DEFAULT);
          }
        case 65: break;
        case 24: 
          { yybegin(COMMENTS);
          }
        case 66: break;
        case 21: 
          { yybegin(YYINITIAL);return new java_cup.runtime.Symbol(A5_104566776_Symbol.NUMBER,"");
          }
        case 67: break;
        case 3: 
          { return new java_cup.runtime.Symbol(A5_104566776_Symbol.NUMBER,yytext());
          }
        case 68: break;
        case 14: 
          { return new java_cup.runtime.Symbol( A5_104566776_Symbol.RBRA);
          }
        case 69: break;
        case 37: 
          { return new java_cup.runtime.Symbol( A5_104566776_Symbol.RETURN);
          }
        case 70: break;
        case 22: 
          { return new java_cup.runtime.Symbol( A5_104566776_Symbol.IF);
          }
        case 71: break;
        case 11: 
          { return new java_cup.runtime.Symbol( A5_104566776_Symbol.LPAR);
          }
        case 72: break;
        case 7: 
          { return new java_cup.runtime.Symbol( A5_104566776_Symbol.TIMES);
          }
        case 73: break;
        case 18: 
          { yybegin(HASH);
          }
        case 74: break;
        case 6: 
          { return new java_cup.runtime.Symbol( A5_104566776_Symbol.COLON);
          }
        case 75: break;
        case 12: 
          { return new java_cup.runtime.Symbol( A5_104566776_Symbol.RPAR);
          }
        case 76: break;
        case 15: 
          { return new java_cup.runtime.Symbol( A5_104566776_Symbol.EQUAL);
          }
        case 77: break;
        case 19: 
          { 
          }
        case 78: break;
        case 34: 
          { return new java_cup.runtime.Symbol( A5_104566776_Symbol.BREAK);
          }
        case 79: break;
        case 2: 
          { return new java_cup.runtime.Symbol( A5_104566776_Symbol.ID,yytext());
          }
        case 80: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              {           return null;
 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
