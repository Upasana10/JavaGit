
public class PassingParameter {


public static void main(String[]args) {
PassingParameter obj=new PassingParameter() ;
obj.john(23,45);
obj.smith(34.55, 33.99);}
	public void john(int a ,int b) {
	int salary=a+b;
	System.out.println("res is"+salary);
	
}
public void smith(double x ,double y) {
	double salary=x-y;
	System.out.println("res is"+salary);

	
	
}
}