package Miscellaneous;

public class ProveStringObjectsImmutable {

	public static void main(String[] args) {
		String str="hello";
		str.concat("world");//Even After concat str won't change
		String nwstr=str.concat("world");
		System.out.println(str);//hello
		System.out.println(nwstr);//hello world

	}

}
