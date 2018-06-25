package practise.cm;

import java.util.Scanner;

public class Intpalli {
public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter input ");
	int n=sc.nextInt();
	int temp=n,rev=0;
	while(temp!=0) {
		rev=rev*10;
	rev=rev+temp%10;
	temp=temp/10;
	}
	if(n==(rev)) {
		System.out.println("pall");
	}else {
		System.out.println("not palli");
	}
	
}
}
