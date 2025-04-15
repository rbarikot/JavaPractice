package lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectStreamExample {

	public static void main(String[] args) {
		
		List<String> name1 = Arrays.asList("Ranjit","Hari","Ram","Prabhu");

		List<String> ls=name1.stream().filter(s->s.startsWith("R")).collect(Collectors.toList());
		System.out.println(ls.get(0));
	}

}
