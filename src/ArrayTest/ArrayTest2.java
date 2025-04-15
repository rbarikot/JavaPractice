package ArrayTest;

public class ArrayTest2 {

	public static void main(String[] args) {

		int arr[][]=new int[3][2];
		arr[0][0]=2;
		arr[0][1]=5;
		arr[1][0]=6;
		arr[1][1]=2;
		arr[2][0]=8;
		arr[2][1]=9;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println(arr[i][j]);
			}
		}
		
		int b[][]= {{2,5},{6,2},{8,9}};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println(b[i][j]);
			}
		}

	}

}
