package Miscellaneous;

public class PatternSearchProgramminginString {

	public static void main(String[] args) {

		String str="hello world hello";
		String pattern="hello";
		int position=str.indexOf(pattern);
		
		while(position>=0)
		{
			System.out.println(position + " ");
			position=str.indexOf(pattern,position+1);
		}
		

	}

}
