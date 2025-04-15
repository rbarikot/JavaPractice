package Linkedin;

import java.util.LinkedHashMap;
import java.util.Map;

public class RandomProgram1 {

	public static void main(String[] args) {

		Map<Character,Integer> mp=new LinkedHashMap<>();
		mp.put('E',10);
		mp.put('B',20);
		Map<Character,Object> mp2=new LinkedHashMap<>();
		mp2.put('A',5);
		mp2.put('G',mp);
		mp2.put('F',100);
		mp2.put('S',90);
		System.out.println(mp2);
		

	}

}
