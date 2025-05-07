package DSA.StringPractice;

public class ReverseOnlyLetter {

	public static void main(String[] args) {
		String s="ab-cd";
		char[] ch=s.toCharArray();
		int left=0,right=ch.length-1;
		while(left<right)
		{
			if(!Character.isLetter(ch[left])) left++;
			else if(!Character.isLetter(ch[right])) right--;
			else
			{
				char temp=ch[left];
				ch[left++]=ch[right];
				ch[right--]=temp;
			}
		}
		System.out.println(new String(ch));
		

	}

}
