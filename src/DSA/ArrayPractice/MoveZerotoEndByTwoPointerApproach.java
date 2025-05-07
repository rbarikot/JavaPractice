package DSA.ArrayPractice;

import java.util.Arrays;

public class MoveZerotoEndByTwoPointerApproach {

	public static void main(String[] args) {
		
		int[] arr= {2,0,5,8,9,0,10,0,18};
		int j=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0 && arr[j]==0)
			{
				arr=swapNumber(arr,i,j);
			}
			if(arr[j]!=0)
			{
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));

	}
	
	public static int[] swapNumber(int arr[],int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		return arr;
	}

}
