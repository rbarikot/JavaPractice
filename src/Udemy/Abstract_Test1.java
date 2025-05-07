package Udemy;

abstract class Test2
{
	abstract void method1();
	public void method2()
	{
		System.out.println("Method2");
	}
	@SuppressWarnings("unused")
	private static void method3()
	{
		System.out.println("Method3");
	}
	Test2()
	{
		System.out.println("Test2");
	}
	
}

class Test3 extends Test2
{

	@Override
	void method1() {
		
		System.out.println("Method2");
	}
	
}
public class Abstract_Test1 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Test2 ob=new Test3();
		ob.method1();
		


	}

}
