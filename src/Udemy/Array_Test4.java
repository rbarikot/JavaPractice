package Udemy;

import java.util.Arrays;

public class Array_Test4 {

	public static void main(String[] args) {
		
		//Swapping Two Variable using 3rd Variable
		int X=5;
		int Y=7;
		int temp;
		temp=X;
		X=Y;
		Y=temp;
		System.out.println("After swapping X is "+X);
		System.out.println("After swapping Y is "+Y);
		
		//Sorting an array without sort method
		int b[]= {2,8,9,9,8,7};
		int temp2;
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]>=b[j])
				{
					temp2=b[i];
					b[i]=b[j];
					b[j]=temp2;
				}
			}
			
		}
		for(int abc : b)
		{
			System.out.println(abc);
		}
		
		//Sorting an array with sort method
		Arrays.sort(b);
		for(int abc : b)
		{
			System.out.println(abc);
		}
		
		

	}

}
