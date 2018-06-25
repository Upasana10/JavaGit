
public class DynamicPasParameter {
	//add static method
	public static String getFullname(String firstName,String LastName) {
	String fullName=firstName+""+LastName;
	return fullName;
	}
//these two are non static method
	public int john(int a ,int b) {
		int salary=a+b;
		System.out.println("res is"+salary);
		return salary;
	}
	public double smith(double x ,double y) {
		double salary1=x-y;
		System.out.println("res is"+salary1);
       return salary1;
		

	}

}
