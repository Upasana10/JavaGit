
public class AscendingOrder {
public static void main(String[] args) {
	int a[]= {30,25,27,15,11,8};
	int temp;
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			
		if( a[i]>a[j]) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		}
	System.out.println("ascending"+a[i]);	
	}
}
}
