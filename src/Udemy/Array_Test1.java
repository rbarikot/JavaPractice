package Udemy;

public class Array_Test1 {

	public static void main(String[] args) {
		
		//Container which store multiple values of same data type
		
		int a[]= new int[5];// Define and declare Array traditional way
		a[0]=1;
		a[1]=2;
		a[2]=6;
		a[3]=9;
		a[4]=10;

		for(int i=0; i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
		//Array Declaring and allocating memory using array literal
		
		int b[]= {2,8,9,9,8,7};
		for(int i=0; i<=b.length-1;i++)
		{
			System.out.println(b[i]);
		}
		
		String str[]= {"ABC","DEF","XYZ"};
		
		//Foreach loop
		for(String ab:str)
		{
			System.out.println(ab);
		}
		
		
		
		
		

	}

}
