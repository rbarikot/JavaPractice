package Practice;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class duplicateElementsinArray {

	public static void main(String[] args) {

		int[] arr= {1,2,1,3,4,5,2,6,8,2,9,9};
		Map<Integer,Integer> mp=new LinkedHashMap<>();
		
		for(int num:arr)
		{
			mp.put(num,mp.getOrDefault(num, 0)+1);
		}
		System.out.println(mp);
		for(Map.Entry<Integer,Integer> m:mp.entrySet())
		{
			if(m.getValue()>1)
			{
				System.out.println("The Repeating Elements are : "+m.getKey()+" : and the frequency are"+m.getValue());
			}
		}
		//First Repeating Element in Array
		for(Map.Entry<Integer,Integer> m:mp.entrySet())
		{
			if(m.getValue()==2)
			{
				System.out.println("The first Repeating Element is : "+m.getKey()+" : and the frequency are"+m.getValue());
			}
			break;
		}
		//Largest Number Not having Duplicate
		
		List<Integer> st= new LinkedList<>();
		for(Map.Entry<Integer,Integer> m:mp.entrySet())
		{
			if(m.getValue()==1)
			{

				st.add(m.getKey());
			}
		}
		System.out.println(st);
		System.out.println("The Largest Number Not having Duplicate is : "+st.get(st.size()-1));
		
	}

}
