package OfficeTimeSolve;

import java.util.Arrays;

public class CheckPalindromeArray {

	public static void main(String[] args) {
		int[] b= {1,2,3,2,1};
		
		int[] c=new int[b.length];
		
		for(int i=0;i<b.length;i++)
		{
			c[i]=b[b.length-1-i];
		}
		
		if(Arrays.equals(b, c))
		{
			System.out.println("Palindrome");
		}else
		{
			System.out.println("Not Palindrome");
		}


	}

}
