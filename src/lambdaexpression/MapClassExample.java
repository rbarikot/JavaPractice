package lambdaexpression;

import java.util.Arrays;
import java.util.List;

public class MapClassExample {

	public static void main(String[] args) {

		List<String> name=Arrays.asList("Ranjit","Tentu","Mahesh","Poonam","Rello");
		
		//Print the names with length more than 5 and change them to upper case
		
		name.stream().filter(s->s.length()>5).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}
}
