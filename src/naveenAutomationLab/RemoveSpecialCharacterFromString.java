package naveenAutomationLab;

public class RemoveSpecialCharacterFromString {

	public static void main(String[] args) {

		String str="hello@#$$$$$$$obss";
		str=str.replaceAll("[^0-9a-zA_Z]", "");
		System.out.println(str);

	}

}
