package OfficeTimeSolve;

import java.util.Arrays;

public class ReverseAnArraywithout2ndArray {

	public static void main(String[] args) {

		int b[]= {1,2,3,4,5};
		int left=0, right=b.length-1;
		
		while(right>left)
		{
			int temp=b[left];
			b[left]=b[right];
			b[right]=temp;
			left++;
			right--;
		}
		
		System.out.println(Arrays.toString(b));
	}

}
