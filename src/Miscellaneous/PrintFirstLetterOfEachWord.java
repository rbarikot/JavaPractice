package Miscellaneous;

import java.util.Arrays;

public class PrintFirstLetterOfEachWord {

	public static void main(String[] args) {

		String str="new hello world";
		String[] nw=str.trim().split("\\s+");
		System.out.println(Arrays.toString(nw));
		for(String st:nw)
		{
			System.out.println(st.charAt(0) + " ");
		}
	}

}
