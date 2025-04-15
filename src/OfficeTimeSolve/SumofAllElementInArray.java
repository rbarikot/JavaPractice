package OfficeTimeSolve;

public class SumofAllElementInArray {

	public static void main(String[] args) {
		int b[]= {1,2,3,4,6,7};
		int sum=sumOfAllElementInArray(b);
		System.out.println(sum);
		

	}
	
	public static int sumOfAllElementInArray(int[] arr)
	{
		int sum=0;
		for(int b:arr)
		{
			sum=sum+b;
		}
		return sum;
	}

}
