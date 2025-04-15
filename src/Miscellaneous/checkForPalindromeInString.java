package Miscellaneous;

public class checkForPalindromeInString {

	public static void main(String[] args) {
		String str="abba";
		int start=0;
		int end=str.length()-1;
		boolean ispal=true;
		while(start<end)
		{
			if(str.charAt(start)!=str.charAt(end))
			{
				ispal=false;
				break;
			}
			start++;end--;
		}
		if(ispal==true)
		{
			System.out.println("The String is palindome");
		}
		else
		{
			System.out.println("The String is not palindrome");
		}
	}

}
