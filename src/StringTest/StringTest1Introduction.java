package StringTest;

public class StringTest1Introduction {

	public static void main(String[] args) {

		//Different ways to Create String
		//1- Through Character Array
		char[] ch = {'f','e','j','k','l'};
		System.out.println(ch);
		//Through String Class
		String str="Hello";
		System.out.println(str);
		String str2=new String("World");
		System.out.println(str2);
		
		//Through String Buffer
		StringBuffer strbf=new StringBuffer("India");
		System.out.println(strbf);
		
		//Through String Builder
		
		StringBuilder strbld=new StringBuilder("Hell");
		System.out.println(strbld);
		

	}

}
