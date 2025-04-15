package CollectionTest.MapTest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest1 {

	public static void main(String[] args) {
		Map<Integer,String> mp1=new HashMap<>();
		mp1.put(100, "Test1");
		mp1.put(50,"Test2");
		mp1.put(150,"Test3");
		mp1.put(25,"Test4");
		System.out.println("Implementing HashMap");
		System.out.println(mp1);
		//No Insertion Order is maintained
		
		Map<Integer,String> mp2=new LinkedHashMap<>();
		mp2.put(100, "Test1");
		mp2.put(50,"Test2");
		mp2.put(150,"Test3");
		mp2.put(25,"Test4");
		System.out.println("Implementing Linked HashMap");
		System.out.println(mp2);
		//Insertion Order is maintained
		
		Map<Integer,String> mp3=new TreeMap<>();
		mp3.put(100, "Test1");
		mp3.put(50,"Test2");
		mp3.put(150,"Test3");
		mp3.put(25,"Test4");
		System.out.println("Implementing Linked Tree Map");
		System.out.println(mp3);
		//It will be arranging Key in increasing Order
		
		Map<String,String> mp4=new TreeMap<>();
		mp4.put("test", "test1");
		mp4.put("test1", "test3");
		mp4.put("tes", "test4");
		System.out.println(mp4);
		
		
		
		
		
		
		

	}

}
