package OfficeTimeSolve;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElementinArray {

	public static void main(String[] args) {
		int[] ip= {1,1, 2, 2, 3, 4, 4, 4};
		Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
		for(int num:ip)
		{
			mp.put(num,mp.getOrDefault(num, 0)+1);
		}
		System.out.println(mp);

	}

}
