package Miscellaneous;

import java.util.Arrays;

public class ReverseAnArrayInSubsets {

	public static void main(String[] args) {

		int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 9};
		int subset =6;
		for(int i=0;i<arr.length;i+=subset)
		{
			int start=i, end=Math.min(i+subset-1, arr.length-1);
			while (start < end) {
	            int temp = arr[start];
	            arr[start++] = arr[end];
	            arr[end--] = temp;
	        }
		}
		System.out.println(Arrays.toString(arr));
		

	}

}
