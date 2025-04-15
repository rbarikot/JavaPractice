package Miscellaneous;

import java.util.ArrayList;
import java.util.List;

public class PrintOddAndEvenNumberFromArray {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,8,9,7,8,3,16,9};
		List<Integer> ls_odd=new ArrayList<>();
		List<Integer> ls_even=new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				ls_even.add(arr[i]);
			}
			else
			{
				ls_odd.add(arr[i]);
			}				
		}
		
		System.out.println("The Even number are: "+ls_even);
		System.out.println("The Odd Number are : "+ls_odd);
	}
}
