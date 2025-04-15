package Test1;

import java.util.Arrays;
import java.util.List;

public class MapPositionPractice {

	public static void main(String[] args) {

		List<Integer> l1=Arrays.asList(7, 9, 10, 4,6,5);
		List<Integer> l2=Arrays.asList(6, 4, 5, 9, 7, 10);
		for(int i=0;i<l1.size();i++)
		{
			for(int j=0;j<l2.size();j++)
				{
					if(l1.get(i)==l2.get(j))
						{
						
							System.out.println(l1.get(i) + "Position "+(j+1));
							
						}	 
				}
			}
	}

}
