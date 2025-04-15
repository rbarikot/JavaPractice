package Miscellaneous;

import java.util.HashSet;
import java.util.Set;

public class DupliacateElementsofArray {

	public static void main(String[] args) {

		int[] arr= {1,2,1,3,4,5,2,6,8,2,9,9};
		Set<Integer> st= new HashSet<>();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					st.add(arr[j]);
				}
			}
		}
		
		System.out.println(st);
	}
}
