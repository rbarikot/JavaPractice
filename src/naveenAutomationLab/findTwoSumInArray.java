package naveenAutomationLab;

import java.util.HashSet;
import java.util.Set;

public class findTwoSumInArray {

	public static void main(String[] args) {
		int[] num= {2,5,6,7,9,8,6,4,3};
		int target=7;
		Set<Integer> mp= new HashSet<Integer>();
		for(int i=0;i<num.length;i++)
		{
			int extra=target-num[i];
			if(mp.contains(extra))
			{
				System.out.println(extra+": "+num[i]);
			}
			mp.add(num[i]);
		}
		
		System.out.println(mp);
		
	}

}
