package Miscellaneous;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapPositionOfElementinTwoList {

	public static void main(String[] args) {
		List<Integer> l1=Arrays.asList(7, 9, 10, 4,6,5);
		List<Integer> l2=Arrays.asList(6, 4, 5, 9, 7, 10);
		Map<Integer,Integer> mp=new LinkedHashMap<>();
		for (int i = 0; i < l2.size(); i++) mp.put(l2.get(i), i+1);
		System.out.println(mp);
	    for (int num : l1) System.out.print(num + "=" + mp.get(num) + " ");
	    System.out.println();
	    
	    for(int i=0;i<l1.size();i++)
	    {
	    	for(int j=0;j<l2.size();j++)
	    	{
	    		if(l1.get(i)==l2.get(j))
	    		{
	    			System.out.println("The Position of :"+l1.get(i)+": is at "+(j+1));
	    		}
	    	}
	    }
				
		}
}
