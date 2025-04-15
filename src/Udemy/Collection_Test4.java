package Udemy;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collection_Test4 {

	public static void main(String[] args) {

		Hashtable<Integer,String> hs= new Hashtable<Integer,String>();
		hs.put(1, "Ranjit");
		hs.put(2, null);
		hs.put(3, "Test");
		hs.put(4, "Test");
		hs.put(3, "Test1");
		System.out.println(hs);
		/*System.out.println(hs.get(2));
		Set<Entry<Integer, String>> st=hs.entrySet();
		System.out.println(st);
		Iterator<Entry<Integer, String>> it=st.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			Map.Entry mp= (Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}*/
		

		//HashMap is not thread safe, No Synchronization.
		// Hash Table is thread safe and synchronization
		//Hash Map allows null key and Null Value
		//Hash Tab;e don't allow any null key and null value
		//Hashmap can use Iterator to iterate
		//Hashtable don't use Iterator to iterate
		
		

	}

}
