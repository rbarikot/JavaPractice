package DSA.StringPractice;

public class checkPalindrome {

	public static void main(String[] args) {
		String s="A man, a plan, a canal: Panama";
		s=s.replaceAll("[^a-zA-Z]","");
		System.out.println(s);
		System.out.println(reverse(s));
		boolean counter=false;
		if(s.equalsIgnoreCase(reverse(s)))
		{
			counter=true;
		}
		else
		{
			counter=false;
		}
		System.out.println(counter);

	}
	
	public static String reverse(String s)
	{
		char[] ch= s.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		return rev;
	}

}
