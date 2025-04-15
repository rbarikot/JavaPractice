package Practice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapPositionOfElementinArray {

	public static void main(String[] args) {

		List<Integer> l1=Arrays.asList(7, 9, 10, 4,6,5);
		List<Integer> l2=Arrays.asList(6, 4, 5, 9, 7, 10);
		for(int i=0;i<l1.size();i++)
		{
			for(int j=0;j<l2.size();j++)
			{
				if(l1.get(i)==l2.get(j))
				{
					System.out.println("The position of element : "+l1.get(i)+": is present in 2nd array at position:"+(j+1));
				}
			}
		}
		
		//using Map
		Map<Integer,Integer> mp=new LinkedHashMap<>();
		for(int i=0;i<l2.size();i++)
		{
			mp.put(l2.get(i),i+1);
		}
		System.out.println(mp);
		for(int num:l1)
		{
			System.out.println("The Position of elemenet "+mp.get(num)+" :"+num);
		}
		
		
		
		

	}

}
