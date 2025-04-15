package Miscellaneous;

import java.util.Arrays;

public class ReverseAnArrayWithout2ndArray {

	public static void main(String[] args) {
		int b[]= {1,2,3,4,6,7};
		int left=0;int right=b.length-1;
		
		while(left<right)
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
