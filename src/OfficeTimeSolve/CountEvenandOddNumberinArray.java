package OfficeTimeSolve;

public class CountEvenandOddNumberinArray {

	public static void main(String[] args) {

		int b[]= {1,2,3,4,6,7};
		int odd=0,even=0;
		
		for(int num:b)
		{
			if(num%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}

		System.out.println("The Even count is "+even);
		System.out.println("The Odd Count is "+odd);
	}

}
