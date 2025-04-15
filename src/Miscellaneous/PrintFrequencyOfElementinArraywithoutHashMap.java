package Miscellaneous;

public class PrintFrequencyOfElementinArraywithoutHashMap {

	public static void main(String[] args) {
		int[] arr= {10,5,20,5,10,5};
		for(int i=0;i<arr.length;i++)
		{
			boolean flag=false;
			for(int j=0;j<i;j++)
			{
				if(arr[j]==arr[i])
				{
					flag=true;
					break;
				}
			}
			if(flag==true)
			continue;
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					count++;
			}
			System.out.println(arr[i]+":"+count);
			
		}

	}

}
