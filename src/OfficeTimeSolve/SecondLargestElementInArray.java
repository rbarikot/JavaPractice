package OfficeTimeSolve;

import java.util.Arrays;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6,7,6,7};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		int max=arr[arr.length-1];
		int count=0;
		System.out.println(max);
		for(int i=0;i<arr.length;i++)
		{
			if(max==arr[i])
			{
				count++;
			}
		}
		System.out.println("The Count is: "+count);
		
		System.out.println("The Second Largest Element is :"+arr[arr.length-(count+1)]);
		
		
		

	}

}
