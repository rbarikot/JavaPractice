package OfficeTimeSolve;

public class ProgramtoSearchanElementinArrayandReturnIndex {

	public static void main(String[] args) {
		int b[]= {1,2,3,4,6,7,3,3,2};
		int search=3;
		int count=0;
		
		for(int i=0;i<b.length;i++)
		{
			if(search==b[i])
			{
				System.out.println("The Number :"+search+": is found at "+(i+1));
				count++;
			}
		}
		
		if(count==0)
		{
			System.out.println("The Number : "+search+" :  is not Present in An Array");
		}
		
		
		
		

	}

}
