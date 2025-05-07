package DSA.StringPractice;

public class LengthofLastWord {

	public static void main(String[] args) {
		String s="luffy is still joyboy";
		s=s.trim();
		String[] st=s.split(" ");
		System.out.println(st.length);
		char[] ch=st[st.length-1].toCharArray();
		System.out.println(ch.length);

	}

}
