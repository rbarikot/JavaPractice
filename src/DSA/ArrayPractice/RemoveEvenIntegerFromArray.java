package DSA.ArrayPractice;

import java.util.Arrays;

public class RemoveEvenIntegerFromArray {

	public static void main(String[] args) {
		int[] arr= {2,3,5,8,9,10,7,18};
		int counteven=0;		
		for(int num:arr)
		{
			if(num%2==0)
			{
				counteven++;
			}
		}
		System.out.println("The Number of Even Number is "+counteven);
		int[] result=new int[arr.length-counteven];
		int idx=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				result[idx]=arr[i];
				idx++;
			}
		}
		System.out.println(Arrays.toString(result));
		
	}

}
