package Udemy;

public class String_Test2 {

	public static void main(String[] args) {

		//Reverse
		
		String str="madam";
		char ch[]=str.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		System.out.println(rev);
		
		if(str.equals(rev))
		{
			System.out.println("This is palindrom");
		}
		else
		{
			System.out.println("This is not palindrom");
		}
	}

}
