
public class PassParameterReturnVale {
	public static void main(String[]args) {
		//call through classname if static
DynamicPasParameter obj=new DynamicPasParameter() ;
int salary=	obj.john(23,45);
System.out.println("salary is"+salary);
double salary1=	obj.smith(34.55, 33.99);
System.out.println("salary is"+salary1);
}
		/*public void john(int a ,int b) {
		int salary=a+b;
		System.out.println("res is"+salary);
		//return salary;
	}
	public void smith(double x ,double y) {
		double salary1=x-y;
		System.out.println("res is"+salary1);*/

		
		
	}
	

