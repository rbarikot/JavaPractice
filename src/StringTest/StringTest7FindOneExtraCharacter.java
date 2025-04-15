package StringTest;

import java.util.Arrays;

public class StringTest7FindOneExtraCharacter {

	public static void main(String[] args) {

		String s1="abcd";
		String s2="aebcd";
		char[] ch1=s1.toCharArray();
		Arrays.sort(ch1);
		char[] ch2=s2.toCharArray();
		Arrays.sort(ch2);
		char extra=' ';
		
		int n=ch1.length;
		for(int i=0;i<n;i++)
		{
			if(ch1[i]!=ch2[i])
			{
				extra=ch2[i];
			}
			else
			{
				extra=ch2[n];
			}
		}
		
		System.out.println("The Extra Character is "+extra);

	}

}
