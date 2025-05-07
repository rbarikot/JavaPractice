package DSA.StringPractice;

public class MultiplyString {

	public static void main(String[] args) {
		String num1 = "123";
		String num2 = "456";
		long n1= Integer.parseInt(num1);
		long n2=Integer.parseInt(num2);
		long n=n1*n2;
		String st=Integer.toString((int) n);
		st=st.replaceAll("[^0-9]","");
		System.out.println(st);
	}

}
