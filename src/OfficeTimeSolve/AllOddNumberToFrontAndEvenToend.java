package OfficeTimeSolve;

import java.util.Arrays;

public class AllOddNumberToFrontAndEvenToend {

	public static void main(String[] args) {
		int[] a= {2,3,9,10,7,5,4,2,1};
		int[] result=new int[a.length];
		int start=0,end=a.length-1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				result[start++]=a[i];
			}
			else
			{
				result[end--]=a[i];
			}
			
		}
		System.out.println(Arrays.toString(result));
		

	}

}
