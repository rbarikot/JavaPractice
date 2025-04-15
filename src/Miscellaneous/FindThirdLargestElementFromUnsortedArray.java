package Miscellaneous;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindThirdLargestElementFromUnsortedArray {

	public static void main(String[] args) {
		/*
		Given an unsorted array of integers, find the third largest number in the array. If the array has less than 3 distinct numbers 
		 return the largest number ? 
		 Example 
		 Input:
		 arr=[2,4,1,5,3,6]
		 Output:
		 4*/
		//int[] arr= {2,4,1,5,3,6};
		List<Integer> st=Arrays.asList(2,4,1,5,3,6,4,3,2,8).stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(st);
		System.out.println("The Size of List is "+st.size());
		if(st.size()<=3)
		{
			System.out.println("The Largest Number is when less than 3 distinct number is there "+st.get(st.size()-1));
		}
		else
		{
			System.out.println("The 3rd Largest Number is "+st.get(st.size()-3));
		}	
		
	}

}
