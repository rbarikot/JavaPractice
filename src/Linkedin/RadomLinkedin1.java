package Linkedin;

public class RadomLinkedin1 {

	public static void main(String[] args) {
		
		String str="tomorrow";
		StringBuffer sb= new StringBuffer(str);
		sb.delete(1,2);
		sb.insert(1, "$");
		System.out.println(sb);
	}

}
