package Practice;

public class FindFactorial {

	public static void main(String[] args) {

		int num=4;
		long fact=findFactorialofNumber(num);
		System.out.println(fact);

	}
	
	public static long findFactorialofNumber(int num)
	{
		long fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}
