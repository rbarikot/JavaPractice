package Miscellaneous;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintSmallestElementinArray {

	public static void main(String[] args) {

		int[] arr= {1,2,3,8,9,7,8,3,16,9};
		//1st Approach
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("The min Number is "+min);
		
		//2nd Approach using Stream Function
		int min2=Arrays.stream(arr).min().orElseThrow();
		System.out.println("The min Number is "+min2);
		
		//3rd Approach		
		List<Integer> ls=Arrays.asList(1,2,3,8,9,7,8,3,16,9).stream().sorted().collect(Collectors.toList());
		System.out.println("The min Number is "+ls.get(0));
	}
}
