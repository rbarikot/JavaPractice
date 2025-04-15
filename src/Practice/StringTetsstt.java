package Practice;

public class StringTetsstt {

	public static void main(String[] args) {
		String str="hello world test";
		String[] st=str.trim().split(" ");
		for(int i=0;i<st.length;i++)
		{
			System.out.println(st[i].substring(0,1).toUpperCase()+" ");
		}
		
		//Remove All White Space
		String str2=" hello world ";
		str2=str2.replaceAll(" ", "");
		System.out.println("****************"+str2);
		
		//Remove All Leading Zero
		String str3="000000hello world00000";
		str3=str3.replaceFirst("^0+", "");
		System.out.println(str3);
	}

}
