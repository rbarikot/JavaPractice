package Miscellaneous;

public class RemoveAllWhiteSpaceinString {

	public static void main(String[] args) {
		
		String str="  Hello World  ";
		System.out.println(str.replaceAll("\\s",""));
		}
}
