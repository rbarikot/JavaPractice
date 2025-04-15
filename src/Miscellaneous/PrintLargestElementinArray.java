package Miscellaneous;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintLargestElementinArray {

	public static void main(String[] args) {

		int[] arr= {1,2,3,8,9,7,8,3,16,9};
		//1st Approach
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("The max Number is "+max);
		
		//2nd Approach using Stream Function
		int max2=Arrays.stream(arr).max().orElseThrow();
		System.out.println("The max Number is "+max2);
		
		//3rd Approach		
		List<Integer> ls=Arrays.asList(1,2,3,8,9,7,8,3,16,9).stream().sorted().collect(Collectors.toList());
		System.out.println("The max Number is "+ls.get(ls.size()-1));
	}
}
