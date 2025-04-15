package lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MiscProgram {

	public static void main(String[] args) {

		List<Integer> val=Arrays.asList(1,3,8,7,9,5,6,7,9,10);
		
		//Sort The Array
		
		//val.stream().sorted().forEach(s->System.out.println(s));
		
		//Unique Number
		
		//val.stream().distinct().forEach(s->System.out.println(s));
		
		//2nd Largest Number of Array
		
		List<Integer> ls=val.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("The 2nd largest Number is"+ls.get(ls.size()-2));
		

	}

}
