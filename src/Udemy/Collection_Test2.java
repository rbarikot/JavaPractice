package Udemy;

import java.util.HashSet;
import java.util.Iterator;

public class Collection_Test2 {

	public static void main(String[] args) {

		HashSet<String> hs=new HashSet<String>();
		hs.add("Ranjit");
		hs.add("Test");
		hs.add("Test1");
		System.out.println(hs);
		
		//Iterator
		Iterator<String> st=hs.iterator();
		while(st.hasNext())
		{
			System.out.println(st.next());
		}

	}

}
