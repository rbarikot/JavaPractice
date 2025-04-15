package Miscellaneous;

import java.util.Arrays;

public class MoveallZerotoEnd {

	public static void main(String[] args) {

		int a[] = {9,8,7,0,3,0,2,0,7,0,2,0,1};
		
		int index=0;
		for(int num:a)
		{
			if(num!=0)
			{
				a[index ++]=num;
			}
		}
		while(index<a.length)
		{
			a[index ++]=0;
		}
		
		System.out.println(Arrays.toString(a));

	}

}
