package Test1;

import java.util.Arrays;

public class DateTest {

	public static void main(String[] args) {

		String ip="5/2/2024";
		
		String[] str=ip.split("/");
		System.out.println(Arrays.toString(str));
		
		for(int i=0;i<str.length-1;i++)
		{
			if(str[i].length()==1)
			{
				str[i]="0"+str[i];
			}
			
		}
		String formattedDate = String.join("/", str);
		System.out.println(formattedDate);

	}

}
