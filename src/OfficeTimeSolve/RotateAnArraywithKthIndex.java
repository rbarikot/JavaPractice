package OfficeTimeSolve;

import java.util.Arrays;

public class RotateAnArraywithKthIndex {

	public static void main(String[] args) {

		int b[]= {1, 2, 3, 4, 5};
		int k=2;
		rotate(b,k);

	}
	
	public static void reverseElement(int[] b, int left, int right)
	{
		
		while(right>left)
		{
			int temp=b[left];
			b[left]=b[right];
			b[right]=temp;
			left++;
			right--;
		}
	}
	
	public static void rotate(int[] ar,int k)
	{
		int n=ar.length;
		k=k%n;
		System.out.println("The Value of K"+k);
		//Reverse the Element
		reverseElement(ar,0,n-1); // 54321
		//Reverse 1st K element
		reverseElement(ar,0,k-1);//45321
		//Reverse Rest Element
		reverseElement(ar,k,n-1);//45123
		System.out.println(Arrays.toString(ar));
	
	}

}
