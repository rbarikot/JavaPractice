package StringTest;

public class RandomStringSort {

	public static void main(String[] args) {
		String str="HEALBLOhealblo";
		char[] ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j]) 
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		System.out.println(new String(ch));
	}

}
