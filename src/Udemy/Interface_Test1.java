package Udemy;

public interface Interface_Test1 {
	
	//Will have methods but no body
	
	public String name="Ranjit";
	
	@SuppressWarnings("unused")
	private static void m1() {
		System.out.println("m1");
	}
	
	public static  void m2()
	{
		m1();
		System.out.println("m2");
	}
	
	public static  int m3()
	{
		System.out.println("m3");
		return 5;
	}
	
	public void m4();
	public void m5();
	
	//For any Method to have Body inside an interface it must be having static keyword in it. So it can be called directly with the help of interface
	//For accessing any private method inside interface that must be called inside the public static method.
	//For having any variable can be accessed directly and should assign to new variable

}
