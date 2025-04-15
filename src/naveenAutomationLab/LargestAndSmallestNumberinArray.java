package naveenAutomationLab;

public class LargestAndSmallestNumberinArray {

	public static void main(String[] args) {
		int[] ar= {8,9,9,8,4,5,5,6,7,9,8,-10,287657};
		int max=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(max<ar[i]) 
			{
				max=ar[i];
			}
		}
		
		System.out.println("The Maximum Number is :"+max);


	}

}
