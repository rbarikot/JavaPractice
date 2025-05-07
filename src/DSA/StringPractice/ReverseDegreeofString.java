package DSA.StringPractice;

public class ReverseDegreeofString {

	public static void main(String[] args) {

		/*char ch='z';
		int val=(int) ch;
		
		int ac=121;
		char c=(char) ac;*/
		//int reverse=val-95-26;
		//System.out.println(c);
		//int rev=getIndexInReverse('a');
		//System.out.println(rev);
		 String s = "zaza";
		 ReverseDegreeofString ob = new ReverseDegreeofString();
	     int totalsum = ob.reverseDegree(s);
	     System.out.println(totalsum);
		

	}
	public static int getIndexInReverse(char ch)
	{
		int ac=(int) ch;
		int rev=219-ac-96;
		return rev;			
	}
	public int reverseDegree(String s) {
	       int sum=0;
			char[] ch=s.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				int temp=getIndexInReverse(ch[i]);
				sum=sum+(i+1)*temp;
			}
	        return sum; 
	    }
	
}
