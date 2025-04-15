package Miscellaneous;

public class RemoveSpecialCharacterAndJunkFromString {

	public static void main(String[] args) {

		String str="Hello@# World!123";
		String str2=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str2);

	}

}
