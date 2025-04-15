package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class groupofAnagram {

	public static void main(String[] args) {
		//String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};	
		String[] str = {"eat", "tea","ate","tan", "nat", "bat"};
		Map<String,ArrayList<String>> mp= new HashMap<>();
		
		for(String st:str)
		{
			char[] ch=st.toCharArray();
			Arrays.sort(ch);
			String newone=new String(ch);
			if(!mp.containsKey(newone)) {
				mp.put(newone,  new ArrayList<>());
			}
			mp.get(newone).add(st);
		}
		System.out.println(mp);
		


	}

}
