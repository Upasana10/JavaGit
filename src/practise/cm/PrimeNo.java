package practise.cm;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args){
int t;
Boolean isPrime=true;
Scanner sc= new Scanner(System.in);
int num=sc.nextInt();
sc.close();
for(int i=2;i<num/2;i++);
{
	t=num%1;
	if(t==0)
	{ 
		isPrime=false;
		break;
		}}
if(isPrime) {
System.out.println("prime");
}
else {
	System.out.println("not prime");
}
	}
		}


