package DSA.ArrayPractice;

import java.util.Arrays;

public class FindSecondMaximumNumberinArray {

	public static void main(String[] args) {
		int[] arr= {2,3,5,8,9,1,18,10,7,18,18};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		int max=arr[arr.length-1];
		int counter=0;
		System.out.println("The max number is "+max);
		for(int num:arr)
		{
			if(num==max)
			{
				counter++;
			}
		}
		int secondhighest=arr[arr.length-counter-1];
		System.out.println("The 2nd highest number"+secondhighest);
		

	}

}
