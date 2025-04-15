package StringTest;

public class StringTest2ProveStringisimmutable {

	public static void main(String[] args) {

		String str="hello";
		String str2=str.concat("world");
		System.out.println(str2);

	}

}
