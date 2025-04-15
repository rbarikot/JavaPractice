package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Avinash {

	public static void main(String[] args) {
		
		/*List<String> ls= new ArrayList<>();
		ls.add("Ranjit");
		ls.add("Niharika");
		ls.add("Shrirang");
		ls.add("Rocky");
		
		for(int j=0;j<ls.size();j++) {
			
			if(ls.get(j).startsWith("R")) {
				String name=ls.get(j).toUpperCase();
				System.out.println(name);
			}
	
		System.out.println(new ArrayList<>(mp.values()));
		}*/
		
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};	
		
		HashMap<String,ArrayList<String>> hm= new HashMap<>();
		
		for(String sName : strs) {
			char[] ch= sName.toCharArray();
			Arrays.sort(ch);
			String name = new String(ch);
			if(!hm.containsKey(name)) {
				hm.put(name, new ArrayList<String>());
				
			}			
			hm.get(name).add(sName);
			
		}
		
		System.out.println(hm.values());
			
	
		
		
	}

}
















