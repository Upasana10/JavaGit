package practise.cm;

public class Armstrong {

	public static void main(String[] args) {
int n= 153;
int temp=n,sum=0;
int r;
while(n>0) {
	r=n%10;
	n=n/10;
	sum=sum+r*r*r;
	if(sum==temp) {
	System.out.println("armstrong"); 
		}else {
			System.out.println(" NOT an armstrong"); 
		}
}
	}

}
