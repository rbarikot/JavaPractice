package Miscellaneous;

public class PrintTheCharacterafterDecimal {

	public static void main(String[] args) {
		String str="12.358";
		String pat=".";
		int position=str.indexOf(pat);
		String dec="";
		System.out.println(position);
		if(position>=0)
		{
			dec=str.substring(position+1);
			System.out.println("The Value After Decimal is "+dec);
		}
		else
		{
			System.out.println("No Decimal Present");
		}


	}

}
