package lambdaexpression;

@FunctionalInterface
interface Calculator
{
	//---- Only one abstarct method is allowed inside functional interface
	int calculate(int a, int b);
	default void showMessage()
	{
		System.out.println("Hello World");
	}
	static void showStaticMessage()
	{
		System.out.println("This is Static Method");
	}
	
}

public class MultipleParameter {

	public static void main(String[] args) {

		Calculator sum=(a,b) -> a+b;
		Calculator sub=(a,b) -> a-b;
		Calculator mul=(a,b) -> a*b;
		
		System.out.println(sum.calculate(5, 6));
		System.out.println(sub.calculate(7, 8));
		sub.showMessage();
		Calculator.showStaticMessage();
		

	}

}
