package Udemy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collection_Test3 {

	public static void main(String[] args) {

		HashMap<Integer,String> hs= new HashMap<Integer,String>();
		hs.put(1, null);
		hs.put(2, "");
		hs.put(3, "Test");
		hs.put(null, "Test");
		hs.put(3, "Test1");
		System.out.println(hs);
		System.out.println(hs.get(2));
		Set<Entry<Integer, String>> st=hs.entrySet();
		System.out.println(st);
		Iterator<Entry<Integer, String>> it=st.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			Map.Entry mp= (Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		

	}

}
