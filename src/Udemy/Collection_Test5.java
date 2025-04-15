package Udemy;

import java.util.HashSet;

public class Collection_Test5 {

	public static void main(String[] args) {
		
		//Print Unique Number
		int a[]= {4,5,7,8,4,8,9};
		
		HashSet<Integer> hs= new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			hs.add(a[i]);
		}
		System.out.println(hs);
		

	}

}
