package Miscellaneous;

import java.util.ArrayList;
import java.util.List;

public class ArrayElementInReverseOrder {

	public static void main(String[] args) {
			
		int[] arr= {1,2,4,8,9,5,7,9};
		List<Integer> ls=new ArrayList<>();
		for(int i=arr.length-1;i>=0;i--)
		{
			ls.add(arr[i]);
		}
		System.out.println(ls);		
			
	}
}
