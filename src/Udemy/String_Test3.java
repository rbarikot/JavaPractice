package Udemy;

public class String_Test3 {

	public static void main(String[] args) {


		StringBuffer sb= new StringBuffer("Hello World");
		sb.append("test");
		System.out.println(sb);
		sb.insert(2,"he");
		System.out.println(sb);
		sb.deleteCharAt(2);
		System.out.println(sb);
		
		//StringBuilder is not thread safe whereas String Buffer is thread safe
		//String Builder is Non Synchronised.
		//It is faster
		

	}

}
