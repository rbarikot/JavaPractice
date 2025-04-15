package Miscellaneous;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintCharacterwithOccurance {

	public static void main(String[] args) {
		String str="aabbbccccbddddd";
		
		Map<Character,Integer> countmap=new LinkedHashMap<>();
		for(char c:str.toCharArray())
		{
			countmap.put(c, countmap.getOrDefault(c,0)+1);
		}
		countmap.forEach((key,value)->System.out.println(key+ ""+value));	

	}

}
