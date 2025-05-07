package DSA.ArrayPractice;

public class FindMinimuminAnArray {

	public static void main(String[] args) {
		int[] arr= {2,3,5,8,9,1,10,7,18};
		int min=findMinimumNumber(arr);		
		System.out.println("The minimum number is "+min);

	}
	
	public static int findMinimumNumber(int[] arr)
	{
		int min=arr[0];
		for(int num:arr)
		{
			if(num<min)
			{
				min=num;
			}
		}
		return min;
	}

}
