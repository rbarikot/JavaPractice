package Miscellaneous;

public class ReverseAlphabetsOnlyInString {

	public static void main(String[] args) {

		String str="abc@123!de";		
		char[] ch=str.toCharArray();
		int left=0,right=ch.length-1;
		
		while(left<right)
		{
			if(!Character.isLetter(ch[left])) left++;
			else if(!Character.isLetter(ch[right]))right--;
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
