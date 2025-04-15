package Miscellaneous;

import java.util.HashSet;
import java.util.Set;

public class LengthLongestSubstringWithoutRepeatingChar {

	public static void main(String[] args) {
		//Doubt in Implementation
		String str="aaaaabbbccabbccbbb";
		Set<Character> st= new HashSet<>();
		int maxlength=0, start=0;
		for (int end = 0; end < str.length(); end++) {
	        while (st.contains(str.charAt(end))) {
	            st.remove(str.charAt(start++));
	        }
	        st.add(str.charAt(end));
	        maxlength = Math.max(maxlength, end - start + 1);
	    }
	    System.out.println("Longest substring length: " + maxlength);

	}

}
