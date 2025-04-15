package Linkedin;

import java.util.ArrayList;
import java.util.List;

public class RandomLinkedIn2 {

	public static void main(String[] args) {
		
		List<Character> ls1=new ArrayList<>();
		ls1.add('a');
		ls1.add('b');
		ls1.add('c');
		List<Integer> ls2=new ArrayList<>();
		ls2.add(1);
		ls2.add(2);
		ls2.add(3);
		List<Object> ls3=new ArrayList<>();
		for(int i=0;i<ls1.size();i++)
		{
			ls3.add(ls1.get(i));
			ls3.add(ls2.get(i));
		}
		
		System.out.println(ls3);

	}

}
