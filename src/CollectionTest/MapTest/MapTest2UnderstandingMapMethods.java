package CollectionTest.MapTest;

import java.util.HashMap;
import java.util.Map;

public class MapTest2UnderstandingMapMethods {

	public static void main(String[] args) {

		Map<Integer,String> mp1=new HashMap<>();
		//1--> Put Method adding Value with key
		mp1.put(100, "Test1");
		mp1.put(50,"Test2");
		mp1.put(150,"Test3");
		mp1.put(25,"Test4");
		//2--> Get Method
		System.out.println(mp1.get(100)); //Returns Test1 based on Object Key the value is returned
		
		//3--> isEmpty which will tell whether Map is empty or not and will return  true or false
		System.out.println(mp1.isEmpty());// Returns False since it has some value
		
		//4-->remove --> removing any Value based on Key
		
		mp1.remove(50);
		System.out.println(mp1);//O/P will be {100=Test1, 150=Test3, 25=Test4}
		//Removing a Key which is not present, There won't be any error or compile time error it simply ignores
		mp1.remove(124); 
		
		//5-->containsKey -->It will return whether Key is present or not
		System.out.println(mp1.containsKey(100));//It will return boolean and o/p will be true
		System.out.println(mp1.containsKey(50)); //It will return false since we have already removed the value
		
		//6-->containsValue --> It will Check whether value is present inside the map or not
		System.out.println(mp1.containsValue("Test1"));//It will return boolean and o/p will be true
		System.out.println(mp1.containsValue("Hi"));////It will return false since we don't have the value
		
		//7 -->Replace --> Replace the Value based on Key
		mp1.replace(100, "Test10");
		System.out.println(mp1);//o/p is {100=Test10, 150=Test3, 25=Test4} since we replaced the value Test1 with Test 10 for Key 100
		
		//8 -->Size --> It will return the Size the map
		System.out.println(mp1.size()); //Op/ will be 3 
		
		//9-->KeySet It will return the set of Key. Since Key are unique so the return type of keySet will be Set
		System.out.println(mp1.keySet());//o/p will be [100, 150, 25]
		
		//10--> values -- It will return the collection of Values since value can be duplicate so the return type will be Collection of Value
		//Since Collection is the class which extends by List and other so it will return Collection
		System.out.println(mp1.values());//O/p will be [Test10, Test3, Test4]
		
		//11 -->getOrDefault --It takes the parameter as Object Key and Value which returns existing value or default
		System.out.println(mp1.getOrDefault(100, null)); //The O/p will be Test10 since it will return the default Value
		System.out.println(mp1.getOrDefault(100, "Test10"));//The O/p will be Test10 since it will return the default Value
		System.out.println(mp1.getOrDefault(100, "Test"));//The O/p will be Test10 since it will return the default Value irrespective of Value present or not
		
		//12--> Printing the Key and Value
		for(Map.Entry<Integer,String>e :mp1.entrySet())
		{
			System.out.println(e.getKey()+" : "+e.getValue());
		}
		
		}

}
