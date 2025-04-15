package StringTest;

import java.util.HashSet;
import java.util.Set;

public class StringTest9CountDistinctVowel {

	public static void main(String[] args) {

		String str="hello WOrld to EAgypt";
		char[] ch=str.toLowerCase().toCharArray();
		Set<Character> st=new HashSet<>();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='o'||ch[i]=='i'||ch[i]=='u')
			{
				st.add(ch[i]);
			}
		}
		
		System.out.println(st);

	}

}
