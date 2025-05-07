package DSA.ArrayPractice;

import java.util.Arrays;

public class MovingAllZerotoEnd {

	public static void main(String[] args) {
		int[] arr= {2,0,5,8,9,0,10,0,18};
		
		int[] result=new int[arr.length];
		int countzero=0;
		for(int num:arr)
		{
			if(num==0)
			{
				countzero++;
			}
		}
		System.out.println("The total zero is "+countzero);
		//Code Snippet to Move all Zero to end
		/*int idx=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				result[idx]=arr[i];
				idx++;
			}
		}
		System.out.println(Arrays.toString(result));*/
		
		//Code Snippet to Move All Zero start
		for(int i=0;i<countzero;i++)
		{
			result[i]=0;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				result[countzero]=arr[i];
				countzero++;
			}
		}
		System.out.println(Arrays.toString(result));

	}

}
