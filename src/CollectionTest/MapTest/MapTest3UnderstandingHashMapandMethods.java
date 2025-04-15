package CollectionTest.MapTest;

import java.util.HashMap;
import java.util.Map;

public class MapTest3UnderstandingHashMapandMethods {

	public static void main(String[] args) {
		Map<String,Integer> mp=new HashMap<>();
		mp.put("Test1", 100);
		mp.put("Test2", 150);
		mp.put("Test3", 75);
		mp.put("Test4", 200);
		
		//Print the Map
		System.out.println(mp);
		
		//Get the Size
		System.out.println(mp.size());
		
		for(Map.Entry<String, Integer>m:mp.entrySet())
		{
			System.out.println(m.getKey()+":"+m.getValue());
		}
		
		//containsKey
		if(mp.containsKey("Test1"))
		{
			System.out.println("Yes");
		}else System.out.println("False");
		
		//containsValue
		if(mp.containsValue(100))
		{
			System.out.println("Yes");
		}else System.out.println("False");
		
		//get --> Get Key will return the value based on Key
		System.out.println(mp.get("Test1"));

	}

}
