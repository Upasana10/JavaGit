
public class ReverseAString {
//private static final int i = 0;

public static void main(String[]args) {
	String reverse="lipi";
	//using for loop
//	for(int i=reverse.length()-1;i>=0;i--) {
//	System.out.print(reverse.charAt(i)+" ");
	
	
	
	
	//using while loop
	/*int i= reverse.length()-1;
	while(i>=0) {
		System.out.println(reverse.charAt(i)+" ");
		i--;*/
		
		
		
		
		
//		using string buffer class
		StringBuffer sb= new StringBuffer(reverse);
		System.out.println(sb.reverse());
	}

}
//}
