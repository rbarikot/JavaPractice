package CollectionTest.MapTest;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstRepeatingElementinArray {

	public static void main(String[] args) {

		int[] arr= {10,5,20,5,5,10};
		//int[] arr= {10,5,20};
		//int[] arr= {10,10,10};
		LinkedHashMap<Integer,Integer> ls=new LinkedHashMap<>();
		for(int a:arr)
		{
			ls.put(a, ls.getOrDefault(a,0)+1);
		}
		System.out.println(ls);
		
		//This code is for 1st Repeating Character
		for(Map.Entry<Integer, Integer>e:ls.entrySet())
		{
			if(e.getValue()>1)
			{
				System.out.println("The FirstRepeating Character is :"+e.getKey());
				break;
			}
			
		}
		//This is for 1st Non Repeating Character
		for(Map.Entry<Integer, Integer>e:ls.entrySet())
		{
			if(e.getValue()==1)
			{
				System.out.println("The First Non Repeating Character is :"+e.getKey());
				break;
			}
			
		}
		
	}

}
