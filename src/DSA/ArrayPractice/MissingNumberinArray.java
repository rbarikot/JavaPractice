package DSA.ArrayPractice;

public class MissingNumberinArray {

	public static void main(String[] args) {

		
		int[] arr= {1,2,4,3};
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		for(int num:arr)
		{
			sum=sum-num;
		}
		System.out.println("Missing Number is: " +sum);
		
		

	}

}
