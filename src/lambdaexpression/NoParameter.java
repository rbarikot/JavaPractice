package lambdaexpression;

public class NoParameter {
	
	public static void main(String[] args)
	{
	Runnable ru=	() ->  System.out.println("Hello");
	new Thread(ru).start();
	}

}
