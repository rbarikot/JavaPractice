package Udemy;

public class Array_Test2 {

	public static void main(String[] args) {

		//Multi Dimensional Array -- Same Data type with value in X and Y format
		
		int a[][]= new int[3][2];
		a[0][0]=5;
		a[0][1]=8;
		a[1][0]=4;
		a[1][1]=9;
		a[2][0]=6;
		a[2][1]=7;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println(a[i][j]);	
			
			}
		}
		
		int b[][]= {{5,8},{4,9},{6,7}};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println(b[i][j]);	
			
			}
		}

	}

}
