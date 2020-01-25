import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.FileWriter;
import java.io.FileReader;

public class A1_104566776 
{

	public static void main(String[] args) 
	{
		try {
			BufferedReader in = new BufferedReader(new FileReader(args[0]));
		}
		catch(FileNotFoundException e) {
			System.out.println("File not Found");
			System.exit(0);
		}

		String inputStr = null; //(?<!%)
		String regex = "[a-zA-Z_]+[a-zA-Z0-9_]*";
		String quotes = "\"[^\"]*\"";
		String[] reserve = {"int", "string", "main", "printf", "return", "while", "if", "else"};
		ArrayList<String> varFound = new ArrayList<String>();
		     
		int varCount = 0;
   
		try {
			while ((inputStr = in.readLine()) != null) {
				//remove string literals
				inputStr = inputStr.replaceAll(quotes, " ");

				Pattern p = Pattern.compile(regex);
				Matcher matcher = p.matcher(inputStr);
				String id;
				int flag = 0;
	          
				while(matcher.find()) {
					flag = 0;
					id = matcher.group();

					//check if ID found is part of reserve list
					for(int i = 0; i < reserve.length; i++)
						if(id.equals(reserve[i]))
							flag = 1;

					//check if ID has already been seen
					for(int i = 0; i < varFound.size(); i++)
						if(id.equals(varFound.get(i)))
							flag = 1;
	            
					if(flag == 0) {
						varCount++;
						varFound.add(id);
					}
				}
			}

			System.out.println("distinct/unique identifiers: " +varCount);
		} 
     
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
