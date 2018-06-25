import java.util.Scanner;

public class PalindromeStringDemo {
	                                      //1.ist main method
public static void main(String[]args) {
	                                    //6 write string reverse= empty
			/*String reverse= " ";
	                                   //2.print	
	System.out.println("enter input");
	                                  //3.to input string use scanner class
	Scanner sc = new Scanner(System.in);
	
	                                        //4.read input from scanner
	String original=sc.nextLine(); 
	for(int i= original.length()-1; i>=0; i--) {
		reverse=reverse+original.charAt(i);
	}
	if(original.equals(reverse)) {
		System.out.println("palindrome");
	}else {
		System.out.println(" Not a palindrome");
	}
	}
	}*/
	String reverse ="";
	System.out.println("enter input");
	Scanner sc = new Scanner(System.in);
String original=sc.nextLine();
for(int i=original.length()-1;i>=0;i--) {
reverse=reverse+original.charAt(i);
}
if(original.equals(reverse)) {
System.out.println("Pallindrome");
}else {
	System.out.println(" Not a Pallindrome");
}}}