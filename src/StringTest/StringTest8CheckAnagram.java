package StringTest;

import java.util.Arrays;

public class StringTest8CheckAnagram {

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
		
		//2nd Using Bitwise XOR 
		
		String s3="hell";
		String s4="lehh";
		char[] ch3=s3.toLowerCase().toCharArray();
		char[] ch4=s4.toLowerCase().toCharArray();
		int result=0;
		for(int i=0;i<ch3.length;i++)
		{
			result=result^ch3[i]^ch4[i];
		}
		System.out.println(result);
		

	}

}
