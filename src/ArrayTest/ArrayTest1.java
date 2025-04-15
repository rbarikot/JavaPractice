package ArrayTest;

public class ArrayTest1 {

	public static void main(String[] args) {

		//1- First way of Declaring array and assigning value
		int a[]=new int[5];
		a[0]=1;
		a[1]=1;
		a[2]=1;
		a[3]=1;
		a[4]=1;
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		//2 - Second way
		
		int b[]= {1,2,3,4,6,7};
		
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		String str[]= {"ABC","DEF","XYZ"};
		for(String d:str)
		{
			System.out.println(d);
		}
	}

}
