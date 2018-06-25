package practise.cm;

import java.util.Scanner;

public class PrimeOrNot {
public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter input");
	int n=sc.nextInt();
	int c=0;
	for(int i=2;i<n;i++) {
	if(n%1==0) {
		c=1;
		break;
	}
	}
	if(c==1) {
		System.out.println("is not prime");
	}else {
		System.out.println("is prime");
	}
}
}
