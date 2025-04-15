package StringTest;

public class StringTest8BitwiseXOROperationtofindExtraCharacter {

	public static void main(String[] args) {

		int res=0;
		String s1="abcd";
		String s2="abcde";
		int n=s1.length();
		for(int i=0;i<n;i++)
		{
			res=res^s1.charAt(i)^s2.charAt(i);
		}
		res=res^s2.charAt(n);
		
		System.out.println((char)(res));

	}

}
