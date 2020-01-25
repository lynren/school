public class A51_output {
public static int  func1(int  num1, int  num2){
int  result;
 result = num1*num1-num2*num2;
 return result;
}
	public static void main(String [] args)
{
int  num1 = 5, num2 = 6, result = 0;
 result = func1(num1, num2);
 System.out.printf("Result is %d",result);
 return  ;
}
}