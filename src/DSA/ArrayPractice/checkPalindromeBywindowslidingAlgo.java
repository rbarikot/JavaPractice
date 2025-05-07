package DSA.ArrayPractice;

public class checkPalindromeBywindowslidingAlgo {

	public static void main(String[] args) {

		String str="qwerty";
		char[] ch=str.toCharArray();
		int start=0, end=ch.length-1;
		boolean counter=true;
		while(start<end)
		{
			if(ch[start]!=ch[end])
			{
				counter=false;
			}
			start++;
			end--;
		}
		
		if(counter==true)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");

	}

}
