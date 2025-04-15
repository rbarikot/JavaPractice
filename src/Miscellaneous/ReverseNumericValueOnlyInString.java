package Miscellaneous;

public class ReverseNumericValueOnlyInString {

	public static void main(String[] args) {

		String str="abc@123!de";
		int left=0,right=str.length()-1;
		char[] ch=str.toCharArray();
		while(left<right)
		{
			if(!Character.isDigit(ch[left])) left++;
			else if(!Character.isDigit(ch[right])) right--;
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
