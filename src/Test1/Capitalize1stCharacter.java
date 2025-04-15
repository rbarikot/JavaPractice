package Test1;

public class Capitalize1stCharacter {

	public static void main(String[] args) {
		
		String st="hello world danger hyee";
		String[] ut=st.split(" ");
		String act=" ";
		for(int i=0;i<ut.length;i++)
		{
			act=act+ut[i].substring(0, 1).toUpperCase()+ut[i].substring(1)+" ";
		}
		
		System.out.println(act);
	}

}
