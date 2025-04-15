package Practice;

public class PatternSearchinString {

	public static void main(String[] args) {
		
		String str="hello hello ello";
		String pattern="ello";
		int position=str.indexOf(pattern);
		while(position>0)
		{
			System.out.println(position);
			position=str.indexOf(pattern,position+1);
			
		}

	}

}
