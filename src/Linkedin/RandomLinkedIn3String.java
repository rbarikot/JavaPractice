package Linkedin;

public class RandomLinkedIn3String {

	public static void main(String[] args) {

		String str="I love Java";
		String[] str2=str.split(" ");
		String rev="";
		for(int i=str2.length-1;i>=0;i--)
		{
			rev=rev+str2[i]+" ";
		}
		System.out.println(rev);
				
	}

}
