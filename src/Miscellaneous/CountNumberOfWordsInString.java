package Miscellaneous;

public class CountNumberOfWordsInString {

	public static void main(String[] args) {
		String str="new hello world do is ";
		String[] word=str.trim().split("\\s+");
		System.out.println("Number of Word : "+word.length);

	}
}
