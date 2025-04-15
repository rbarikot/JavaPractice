package lambdaexpression;

import java.util.Arrays;
import java.util.List;

public class StreamAPIExamples {

	public static void main(String[] args) {

		List<String> name=Arrays.asList("Ranjit","Tentu","Mahesh","Poonam","Rello");
		//Print Name with Sorted
		//name.stream().sorted().forEach(s->System.out.println(s));
		//Print Name with reversed
		//name.reversed().stream().forEach(s->System.out.println(s));
		
		//Print the Name that start with R
		
		name.stream().filter(s->s.startsWith("R")).forEach(s->System.out.println(s));
		
		//Count how many start with R
		
		Long c=name.stream().filter(s->s.startsWith("R")).count();
		System.out.println("The count is "+c);
		
		//Sorting an Integer Array
		
		List<Integer> val=Arrays.asList(1,3,8,7,9,5,6,7,9);
		
		val.stream().sorted().forEach(s->System.out.println(s));

	}

}
