import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Pallindrome {
public static void main(String[]Args) throws IOException {
	
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter Number to check");
	String str=br.readLine();
	String temp = str;
	StringBuffer sb=new StringBuffer(str);
	sb.reverse();
	str=sb.toString();
	if (temp.equalsIgnoreCase(str)) {
	System.out.println("temp is a pallindrome");
	}
	else {
		System.out.println("temp is not a pallindrome");
	}
	}
	
	
}

