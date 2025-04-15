package Interview;

import java.util.ArrayList;
import java.util.List;

public class Neeharika {

	public static void main(String[] args) {
		int input[]= {1,2,3,4,5};
		int larget= input[0];
		
		for(int i=0;i<input.length;i++)
		{
		if(input[i]>larget)
		{
			larget= input[i];
		}
			
		
		}
		System.out.println(larget);
		
		List<String> ls= new ArrayList<>();
		ls.add("Ranjit");
		ls.add("Niharika");
		ls.add("Shrirang");
		ls.add("Rocky");
		ls.stream().filter(s-> s.startsWith("R")).forEach(s-> System.out.println(s));		
		

	}

}
