package naveenAutomationLab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DuplicateElementsinArray {

	public static void main(String[] args) {
		int[] ar= {8,9,9,8,4,5,5,6,7,9,8};
		List<Integer> al=new ArrayList<>();
		Set<Integer> st=new HashSet<>();
		//This will cover all the duplicate elements from Array
		//This will also cover unique duplicate elements in Array
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j]) {
					al.add(ar[i]);
					st.add(ar[i]);
				}
			}
		}
		//Adding
		System.out.println(al);
		System.out.println(st);
		
		//The Above is o(n2) which is worst
		//To make it o(n) let's try that in one for loop
		Set<Integer> st1=new HashSet<>();
		for(int jk:ar)
		{
			if(st1.add(jk)==false)
			{
				System.out.println("Duplicate is: "+jk);
			}
		}
		
		System.out.println(st1);
		
		//Using HashMap
		
		Map<Integer,Integer> mp=new HashMap<>();
		
		for(int num:ar)
		{
			mp.put(num,mp.getOrDefault(num, 0)+1);
		}
		System.out.println("**********"+mp);
		for(Map.Entry<Integer, Integer>sl:mp.entrySet())
		{
			if(sl.getValue()>1)
			{
				System.out.println("The Duplicate Values are"+sl.getKey());
			}
		}
		
	}

}
