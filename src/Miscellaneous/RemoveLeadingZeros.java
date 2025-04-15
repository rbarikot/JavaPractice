package Miscellaneous;

public class RemoveLeadingZeros {

	public static void main(String[] args) {
		String str="00002345trws00";
		String str2=str.replaceFirst("^0+","");
		System.out.println(str2);

	}

}
