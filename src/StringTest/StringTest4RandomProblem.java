package StringTest;

public class StringTest4RandomProblem {

	public static void main(String[] args) {

		String s1="hello";
		String s2=s1;
		s1=s1+"world";
		System.out.println(s1);//hello world
		System.out.println(s2);//hello
		System.out.println(s1==s2);//false
		
		StringBuffer s3=new StringBuffer("hello");
		StringBuffer s4=s3;
		s3=s3.append("world");
		System.out.println(s3);//hello world
		System.out.println(s4);//hello world
		System.out.println(s3==s4);//true		

	}

}
