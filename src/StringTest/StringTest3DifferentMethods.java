package StringTest;

public class StringTest3DifferentMethods {

	public static void main(String[] args) {

		String s1="Test1";
		//length
		System.out.println(s1.length());//5
		//charAt
		System.out.println(s1.charAt(2));//s
		//substring
		System.out.println(s1.substring(2));//st1
		System.out.println(s1.substring(1, 4));//est
		
		//== method
		String s2="Test1";
		System.out.println(s1==s2);//true
		String s3=new String("Test1");
		System.out.println(s1==s3);//false . As content are same but the reference of s1 and s3 are different s1 refers to string pool where s3 refers to object memory
		
		//equals
		System.out.println(s2.equals(s3));//true
		//contains
		String s4="hello world";
		String s5="hello";
		System.out.println(s4.contains(s5));//true
		
		//compareTo
		System.out.println("Checking Compare To");
		String s6="hello World";
		String s7="hello";
		System.out.println(s6.compareTo(s7));//6
		System.out.println(s7.compareTo(s6));//-6
		String s8=new String("hello");
		System.out.println(s7.compareTo(s8));//0
		
		//indexOf
		System.out.println("Checking Index OF");
		String s9="hello World";
		String s10="hello";
		String s11="World";
		System.out.println(s9.indexOf(s10));//0 . since hello is present in that
		System.out.println(s10.indexOf(s9));//-1 . since hello world is not present in hello
		System.out.println(s9.indexOf(s11));//6 . World is present and start from index 6.	
		
	}

}
