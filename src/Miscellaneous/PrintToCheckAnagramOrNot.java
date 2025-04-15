package Miscellaneous;

import java.util.Arrays;

public class PrintToCheckAnagramOrNot {

	public static void main(String[] args) {
		String s1="hell";
		String s2="lelh";
		if(s1.length()==s2.length())
		{
			char[] ch1=s1.toLowerCase().toCharArray();
			Arrays.sort(ch1);
			char[] ch2=s2.toLowerCase().toCharArray();
			Arrays.sort(ch2);
			System.out.println(ch1);
			System.out.println(ch2);
			if(Arrays.equals(ch1, ch2))
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not Anagram");
			}
		}
		else
		{
			System.out.println("Not Considered for Anagram");
		}

	}

}
