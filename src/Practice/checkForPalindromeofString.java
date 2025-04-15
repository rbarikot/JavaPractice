package Practice;

public class checkForPalindromeofString {

	public static void main(String[] args) {
		String str="hello";
		boolean result=checkPalindrome(str);
		System.out.println(result);

	}
	public static String reverseString(String str)
	{
		String rev="";
		char[] ch=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		return rev;
	}
	public static boolean checkPalindrome(String str)
	{
		String rev=reverseString(str);
		boolean result=false;
		if(str.equalsIgnoreCase(rev))
		{
			result=true;
		}
		else
		{
			result=false;
		}
		return result;
		
	}

}
