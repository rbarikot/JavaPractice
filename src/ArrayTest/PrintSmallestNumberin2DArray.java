package ArrayTest;

public class PrintSmallestNumberin2DArray {

	public static void main(String[] args) {
		int b[][]= {{2,5,7},{6,2,9},{8,9,7}};
		
		int smal=b[0][0];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(smal>b[i][j])
				{
					smal=b[i][j];
				}
			}
		}
		System.out.println(smal);
		
		

	}

}
