/* Program-3 for Assignment-4
*/
#include <stdio.h>

int func1(int num1, int num2)
{
	int result = 0;
	result = num1*num1 - num2*num2;
	return result;
}

int main(void)
{
	int num1 = 5, num2 = 6, result = 0;
	if (num1 < num2)
	{
		result = func1(num1, num2);
		printf("Result is %d.", result);
	}
	return 0;
}