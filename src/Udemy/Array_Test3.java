package Udemy;

public class Array_Test3 {

	public static void main(String[] args) {
		
		//Find smallest number in the 2D Array
		//Then Where the small number is found find the maximum number in that column
		
		int a[][]= new int[3][3];
		a[0][0]=5;
		a[0][1]=11;
		a[0][2]=10;
		a[1][0]=4;
		a[1][1]=9;
		a[1][2]=12;
		a[2][0]=6;
		a[2][1]=7;
		a[2][2]=3;
		int smallnum=a[0][0];
		int column=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]<smallnum)
				{
					smallnum=a[i][j];
					column=j;
				}
			
			}
		}
		System.out.println("Smallest number in the Array is"+smallnum);
		System.out.println(column);
		int maxnum=a[0][column];
		for(int i=0;i<3;i++)
		{
			if(a[i][column]>maxnum)
			{
				maxnum=a[i][column];
			}
			
		}
		System.out.println("Max Number in the column "+maxnum);
		
		

	}

}
