package Miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class FindLargestNumberfromNothavingDuplicate {

	public static void main(String[] args) {
		List<Integer> ls1=Arrays.asList(4,3,2,7,3,4,8);
		List<Integer> ls2=ls1.stream().distinct().collect(Collectors.toList());
		
		Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
		for(int num:ls1)
		{
			mp.put(num, mp.getOrDefault(num,0)+1);
		}
		System.out.println(mp);
		
		List<Integer> result = new ArrayList<>();
		for (int num : ls2) {
            if (mp.getOrDefault(num, 0) < 2) 
            { 
                result.add(num);
            }
        }
		
		System.out.println(result);
		
		List<Integer> ls3=Arrays.asList(4,3,2,7,3,4,8);
		Map<Integer,Integer> mp2=new TreeMap<Integer,Integer>();
		for(int m:ls3)
		{
			mp2.put(m,mp2.getOrDefault(m,0)+1);
		}
		System.out.println("+++++++++++++++++++++"+mp2);
		System.out.println("The List of Non Repeating Character");
		List<Integer> ls4=new ArrayList<>();
		for(Map.Entry<Integer,Integer> gh:mp2.entrySet())
		{
			if(gh.getValue()==1)
			{
				
				ls4.add(gh.getKey());
			}
		}
		System.out.println("The Non Repeating Character are"+ls4);
		//The Largest of Non Repeating Character
		System.out.println(ls4.get(ls4.size()-1));
	}
}
