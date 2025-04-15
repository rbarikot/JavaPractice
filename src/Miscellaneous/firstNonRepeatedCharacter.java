package Miscellaneous;

import java.util.LinkedHashMap;
import java.util.Map;

public class firstNonRepeatedCharacter {

	public static void main(String[] args) {

		String str="sillyspiders";
		
		Map<Character,Integer> countmap=new LinkedHashMap<>();
		for(char c: str.toCharArray())
		{
			countmap.put(c, countmap.getOrDefault(c,0)+1);
		}
		for(Map.Entry<Character,Integer> entry:countmap.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.println(entry.getKey());
				return;
			}
		}
		System.out.println("No Unique Character Found");

	}

}
