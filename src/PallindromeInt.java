import java.util.Scanner;

public class PallindromeInt {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
				
		System.out.println("enter input");
		int n= sc.nextInt();//scans the next token as input as int
		int temp=n,reverse=0;//take a temporary variable(temp) for storing number
		while(temp!=0)
		{
			reverse=reverse*10;
			reverse=reverse+temp%10;
			temp=temp/10;
		}
		if(n==reverse)
		{
			System.out.println("pallindrome");
			
		}else {
			System.out.println(" Not pallindrome");
		}
		}
}
