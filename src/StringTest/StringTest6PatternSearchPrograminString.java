package StringTest;

import java.util.Arrays;

public class StringTest6PatternSearchPrograminString {

	public static void main(String[] args) {
		String str="hello world hello";
		String pattern="hello";
		int position=str.indexOf(pattern);
		while(position>=0)
		{
			System.out.println(position + " ");
			position=str.indexOf(pattern,position+1);
		}
		
		String str2="12.358";
		String str3=".";
		int position1=str2.indexOf(str3);
		System.out.println(position1);
		String sub=str2.substring(position1+1);
		System.out.println("The Value After Decimal is "+sub);

	}

}
