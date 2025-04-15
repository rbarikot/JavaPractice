package Interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RahulNavgire {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int[] reveresed= new int[arr.length];
		
		
		for(int i =0;i<arr.length;i++) {
			reveresed[i]=arr[arr.length-1-i];
			
		}
		
	for(int i=0;i<reveresed.length;i++) {
		System.out.println(reveresed[i]);
	}
		
		List<String> ls= new ArrayList<>();
		ls.add("Ranjit");
		ls.add("Niharika");
		ls.add("Shrirang");
		ls.add("Rocky");
		//Starts with R and then convert to uppercase and print

		for(int i=0;i<ls.size();i++) {
			if (ls.get(i).startsWith("R")) {
				String s= ls.get(i).toUpperCase();
				System.out.println(s);
				ls.remove(i);
				ls.add(s);
			}
		}
		System.out.println(ls);
		
	}

}
