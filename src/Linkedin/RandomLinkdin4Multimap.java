package Linkedin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RandomLinkdin4Multimap {

	public static void main(String[] args) {

		Map<String, ArrayList<String>> mp= new HashMap<>();
		mp.computeIfAbsent("fruit",k ->new ArrayList<String>()).add("apple");
		mp.computeIfAbsent("fruit",k ->new ArrayList<String>()).add("Orange");
		
		System.out.println(mp);
	}

}
