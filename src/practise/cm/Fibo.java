package practise.cm;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
int n,a=0,b=0,c=1;
System.out.print("enter value of n");
Scanner sc = new Scanner(System.in);
 n= sc.nextInt();
 for(int i=1;i<=n;i++) {
	 a=b;
	 b=c;
	 c=a+b;
	 System.out.print(a+" ");
	 
	 
 }


	}

}
