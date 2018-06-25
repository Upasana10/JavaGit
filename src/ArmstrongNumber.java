
public class ArmstrongNumber {
public static void main(String[] args) {
	int i=153;
	int temp =i;
	int r,sum=0;
	while(i>0)
	{
		r=i%10;
		i=i/10;
		sum=sum+r*r*r;
	}
		if(temp==sum) 
			System.out.println("armstrong");
		
			
	else 
		System.out.println(" not armstrong");
	}
		}
