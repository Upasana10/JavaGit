
public class ReverseAInteger {
public static void main (String[]args) {
	int number=12345;// number to be reversed
	int revNumber=0;//variable to be created
	int temp=0;//temporary variable
	while(number>0)
	{
		temp=number%10;//1234.5
	revNumber=revNumber*10+temp;//0
	number=number/10;//1234.5/10=12345
	}
	System.out.print("reverse number is:"+revNumber);
	
}
}
