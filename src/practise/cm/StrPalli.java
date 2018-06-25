package practise.cm;

import java.util.Scanner;

public class StrPalli {
public static void main (String[]Args) {
	/*String rev=" ";
	System.out.println("enter input");
	Scanner sc= new Scanner(System.in);
	String original=sc.nextLine();
	for(int i=original.length()-1;i>=0;i--);
	rev=rev+original.charAt(i);}

			if(original.equals(rev)) {
				System.out.println("pallindrome");
			}else {
				System.out.println("Np");
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