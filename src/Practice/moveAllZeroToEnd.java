package Practice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class moveAllZeroToEnd {

	public static void main(String[] args) {
		int a[] = {9,8,7,0,3,0,2,0,7,0,2,0,1};
		int arrayleng=a.length;
		List<Integer> ls=new LinkedList<>();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				ls.add(a[i]);
			}
		}
		int listsize=ls.size();
		int dif=arrayleng-listsize;
		
		for(int i=1;i<=dif;i++)
		{
			ls.add(0);
		}
		System.out.println(ls);

	}

}
