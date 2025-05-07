package OfficeTimeSolve;

import java.util.Arrays;

public class MovingAllOddandEvenNumber {

	public static void main(String[] args) {
		int a[] = {9,8,7,0,3,0,2,0,7,0,2,0,1};
		
		int result[]=new int[a.length];
		int start=0,end=a.length-1;
		
		for(int num:a)
		{
			if(num%2==0)
			{
				result[start++]=num;
			}
			else
			{
			result[end--]=num;
			}
		}
		System.out.println(Arrays.toString(result));

	}

}
