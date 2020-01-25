public class A52_output {
public static int  func1(int  num1, int  num2){
int  result = 0;
 result = num1*num1-num2*num2;
 return result;
}
	public static void main(String [] args)
{
int  num1 = 5, num2 = 6, result = 0;
 if(num1>num2){
result = func1(num1, num2);

}

else{
result = func1(num2, num1);

}
 System.out.printf("Result is %d",result);
 return  ;
}
}