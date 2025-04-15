package Miscellaneous;

public class CapitaliseFirstLetterofEachWord {

	public static void main(String[] args) {

		String str="i love Open text";
		String[] st=str.split(" ");
		for(int i=0; i<st.length;i++)
		{
			st[i]=st[i].substring(0,1).toUpperCase()+st[i].substring(1);
		}
		
		System.out.println(String.join(" ", st));

	}

}
