package Miscellaneous;

import java.util.Arrays;

public class PrintExtraCharacterInTwoString {

	public static void main(String[] args) {
		String s1="abcd";
		String s2="abecd";
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		char extra=' ';
		
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]!=ch2[i])
			{
				extra=ch2[i];
			}
			else
			{
				extra=ch2[ch1.length];
			}
		}
		
		System.out.println("The Extra Character is: "+extra);
		

	}

}
