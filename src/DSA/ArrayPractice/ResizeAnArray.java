package DSA.ArrayPractice;

import java.util.Arrays;

public class ResizeAnArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		//Original Size is 4 noe the new size wanted to have 8
		arr=increaseSize(arr,8);
		System.out.println(Arrays.toString(arr));

	}
	
	public static int[] increaseSize(int[] arr,int newsize)
	{
		int[] newArray=new int[newsize];
		for(int i=0;i<arr.length;i++)
		{
			newArray[i]=arr[i];
		}
		arr=newArray;
		return arr;
		
	}

}
