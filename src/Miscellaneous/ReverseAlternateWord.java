package Miscellaneous;



public class ReverseAlternateWord {

	public static void main(String[] args) {				
		
		String original="Hello World is Danger";		
		String[] word=original.split(" ");
		for(int i=1;i< word.length;i+=2)
		{
			word[i]= new String(ReverseString(word[i]).toString());
		}
		System.out.println(String.join(" ", word));

	}
	
	public static String ReverseString(String str) 
	
	{
		String rev="";
		char[] ch =str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		return rev;
		
	}

}
