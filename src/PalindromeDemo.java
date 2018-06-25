import java.util.Scanner;

public final class PalindromeDemo {
	//1.ist main method
	public static void main(String[]args) {
		//6 write string reverse= empty
		String reverse= "";
		//2.print	
		System.out.println("enter input");
		//3.to input string use scanner class
		Scanner sc = new Scanner(System.in);
		
		//4.read input from scanner
		String original=sc.nextLine(); 
		//5. iterate string from enum of string.... taking last character of string and will append
		//for that we need one more variable
		if(int i=original.length()-1;i>=0;i--) {
			reverse = reverse+original.chatAt(i);//charAT takes character from end of string and append to the reverse of strng
		}
		if(original.equals(reverse)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println(" Not a palindrome");
		}
		}
}
