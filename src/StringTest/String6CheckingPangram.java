package StringTest;

import java.util.HashSet;
import java.util.Set;

public class String6CheckingPangram {

	public static void main(String[] args) {

		String str="The quick brown fox jumps over the lazy dog";
		str=str.toLowerCase();
		Set<Character> st = new HashSet<>();
		
		for(char c:str.toCharArray())
		{
			if(c>='a' &&c<='z')
			{
				st.add(c);
			}
		}
		
		if(st.size()==26)
		{
			System.out.println("String is pangram");
		}
		else
		{
			System.out.println("String is not Pangram");
		}
		

	}

}
