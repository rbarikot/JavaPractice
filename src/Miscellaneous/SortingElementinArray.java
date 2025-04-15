package Miscellaneous;

import java.util.Arrays;

public class SortingElementinArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,8,9,7,8,3,16,9};
		//1st Approach
		Arrays.sort(arr);
		System.out.println("Sorted Array: "+Arrays.toString(arr));
		
		//2nd Approach
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int temp=0;
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
		}		

	}

}
