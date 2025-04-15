package Test1;

class Singleton
{
	//1. private Constructor 2.Static Member 3.Static Factory Method
	
	private Singleton() {}
	
	private static Singleton obj= null;
	
	public static Singleton getInstance()
	{
		if(obj==null)
		{
			obj=new Singleton();
		}
		return obj;
		
	}
}

public class SingletonClassTest {

	public static void main(String[] args) {

		Singleton obj1=Singleton.getInstance();
		System.out.println(obj1.hashCode());
		Singleton obj2=Singleton.getInstance();
		System.out.println(obj2.hashCode());

	}

}
