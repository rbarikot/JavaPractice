package Udemy;

public class String_Test1 {

	public static void main(String[] args) {

		//String is a class of pre-built in java
		
		String a="hello test";
		
		System.out.println(a.charAt(4));
		System.out.println(a.indexOf('l'));
		System.out.println(a.substring(2));
		System.out.println(a.concat("World"));
		System.out.println(a.toUpperCase());
		String arr[]=a.split(" ");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		//equal matches the content 
		//== matches the reference
		
		String c="hello";
		String d="hello";
		String s1= new String("hello");
		String s2=new String("hello");
		
		
		System.out.println(c.equals(d));//true
		System.out.println(c==d);//true
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
		System.out.println(s1==c);//false
		System.out.println(s1.equals(c));//true
		
	}

}
