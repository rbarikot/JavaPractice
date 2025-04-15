package Practice;

import java.util.Arrays;

public class ArrayElementinReverseOrder {

	public static void main(String[] args) {
		int[] arr= {2,5,6,7,8,9,7};
		int start=0,end=arr.length-1;
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

}
