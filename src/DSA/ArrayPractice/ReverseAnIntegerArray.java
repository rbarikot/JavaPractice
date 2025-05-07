package DSA.ArrayPractice;

import java.util.Arrays;

public class ReverseAnIntegerArray {

	public static void main(String[] args) {
		int[] arr= {2,3,5,8,9,10,7,18};
		int start=0, end=arr.length-1;		
		reverseIntArray(arr,start,end);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void reverseIntArray(int[] arr,int start, int end)
	{
		while(start<end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}

}
