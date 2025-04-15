package Test1;

public class ReversealternateString {

	public static void main(String[] args) {

		String st="hello world danger hyee";
		String[] ut=st.split(" ");
		String re=" ";
		
		for(int i=0;i<ut.length;i++)
		{
			if(i%2==0)
			{
				re=re+ut[i]+" ";
			}
			else
			{
				re=re+ReverseString(ut[i])+" ";
				
			}
			
		}
		System.out.println(re);

	}
	
	public static String ReverseString(String str)
	{
		char[] ch=str.toCharArray();
		String rev=" ";
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		return rev;
		
	}

}
