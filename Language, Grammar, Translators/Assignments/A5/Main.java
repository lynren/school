/* 
03-60-214
Assignment 5 Main
Lyndon Renaud
104 566 776
*/

import java.io.*;
import java_cup.runtime.Symbol;

class Main {
  public static void main(String[] args) throws Exception
  {
       File inputFile = new File (args[0]);
       A5Parser parser= new A5Parser(new A5_104566776_JF(new FileReader(inputFile)));
       String result = (String)parser.debug_parse().value;
       String outputFileName = args[0].replaceAll("input.c","output.java");
       //rename the class to match the name of output java file
       result = result.replaceFirst("public class A5", "public class "+outputFileName.replaceFirst(".java",""));
       FileWriter fw = new FileWriter(new File(outputFileName));
       fw.write(result);
       fw.close();
  }
}
