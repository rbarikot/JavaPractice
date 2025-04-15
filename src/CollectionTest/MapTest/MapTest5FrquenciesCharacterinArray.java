package CollectionTest.MapTest;

import java.util.LinkedHashMap;

public class MapTest5FrquenciesCharacterinArray {

	public static void main(String[] args) {

		//int[] arr= {10,5,20,5,10,5};
		//int[] arr= {10,5,20};
		int[] arr= {10,10,10};
		LinkedHashMap<Integer,Integer> ls=new LinkedHashMap<>();
		for(int a:arr)
		{
			ls.put(a, ls.getOrDefault(a,0)+1);
		}
		System.out.println(ls);
		

	}

}
