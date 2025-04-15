package Practice;

import java.util.HashSet;
import java.util.Set;

public class CheckStringisPanagram {

	public static void main(String[] args) {
		String str="The quick brown fox $&&jumps over the lazy dog";
		checkPanagram(str);
		int sixe=countNumberOfWords(str);
		System.out.println(sixe);

	}
	public static void checkPanagram(String str)
	{
		str=str.toLowerCase();
		System.out.println(str);
		Set<Character> st=new HashSet<>();
		for(char ch:str.toCharArray())
		{
			if(ch>='a'&&ch<='z')
			{
			st.add(ch);
			}
		}

		if(st.size()==26)
		{
			System.out.println("This is Panagram");
		}
		else
		{
			System.out.println("This is not a Panagram");
		}
		
	}
	public static int countNumberOfWords(String str)
	{
		String[] st=str.split(" ");
		int sizeofWord=st.length;
		return sizeofWord;
	}
	

}
