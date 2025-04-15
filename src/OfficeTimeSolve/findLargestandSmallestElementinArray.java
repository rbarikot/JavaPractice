package OfficeTimeSolve;

public class findLargestandSmallestElementinArray {

	public static void main(String[] args) {

		int b[]= {1,2,3,4,6,7};
		int max=b[0];
		int min=b[0];
		
		for(int i=0;i<b.length;i++)
		{
			if(max<b[i])
			{
				max=b[i];
			}
			else if(min>b[i]) {
				min=b[i];
			}
		}
		System.out.println("The Maximum Number is :"+max);
		System.out.println("The Minimum Number is :"+min);

	}

}
