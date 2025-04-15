package Miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupofAnargamFromList {

	public static void main(String[] args) {
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};		
		Map<String,List<String>> mp= new HashMap<>();
		for(String str:strs)
		{
			char[] ch=str.toCharArray();
			Arrays.sort(ch);
			String newone=new String(ch);
			if(!mp.containsKey(newone))
			{
				mp.put(newone, new ArrayList<>());
			}
			mp.get(newone).add(str);
			
		}
	
		System.out.println(new ArrayList<>(mp.values()));

	}

}
