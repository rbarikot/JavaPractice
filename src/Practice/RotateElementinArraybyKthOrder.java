package Practice;

import java.util.Arrays;

public class RotateElementinArraybyKthOrder {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int k=2;
		rotate(arr,k);
		
		
	}
	
	public static void reverseElement(int [] arr,int start,int end)
	{
		while(start<end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void rotate(int[] arr, int k)
	{
		int n=arr.length;
		k=k%n;
		reverseElement(arr,0,n-1);//54321
		reverseElement(arr,0,k-1);//45321
		reverseElement(arr,k,n-1);//45123
	}

}
