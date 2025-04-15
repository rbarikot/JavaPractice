package naveenAutomationLab;

import java.util.Arrays;

public class FindMissingNumberArray {

	public static void main(String[] args) {

		int[] a= {1,2,4,5};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int tot=0;
		int act=0;
		for(int i=a[0];i<=a[a.length-1];i++)
		{
			tot=tot+i;
		}
		System.out.println(tot);
		
		for(int i=0;i<a.length;i++)
		{
			act=act+a[i];
		}
		System.out.println("Sum in Array is"+act);
		
		System.out.println("The Missing Number is : "+(tot-act));
		

	}

}
