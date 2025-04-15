package Practice;

import java.util.Arrays;

public class capitalisefirstletterofeachword {

	public static void main(String[] args) {
		String str= "i love you poonam";
		String[] str2=str.split(" ");
		System.out.println(Arrays.toString(str2));
		String str3="";
		for(int i=0;i<str2.length;i++)
		{
			str3=str3+str2[i].substring(0,1).toUpperCase()+str2[i].substring(1)+" ";
		}
		System.out.println(str3);
	}

}
