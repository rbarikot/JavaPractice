package Miscellaneous;

import java.util.Arrays;

public class PrintSumAllElementinArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,8,9,7,8,3,16,9};
		//1st Approach
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("The Sum of All Array is: "+sum);
		
		//2nd Approach
		int sum2=Arrays.stream(arr).sum();
		System.out.println("The Sum of All Array is: "+sum2);		

	}

}
