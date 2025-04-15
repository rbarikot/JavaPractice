package OfficeTimeSolve;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacterFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello";
		Set<Character> st= new LinkedHashSet<>();
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			st.add(ch[i]);
		}
		System.out.println(st);
		String req="";
		for(char c:st)
		{
			req=req+c;
		}
		System.out.println(req);
		String str2="hello";
		String ab="";
		char[] ch2=str2.toCharArray();
		for(int i=0;i<ch2.length;i++)
		{
			for(int j=i+1;j<ch2.length;j++)
			{
				if(ch2[i]!=ch2[j])
				{
					ab=ab+ch2[i];
				}
			}
		}
		System.out.println(ab);
		
		

	}

}
