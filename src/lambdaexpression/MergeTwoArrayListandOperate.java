package lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeTwoArrayListandOperate {

	public static void main(String[] args) {
		
		List<String> name1 = Arrays.asList("Ranjit","Hari","Ram","Prabhu");
		List<String> name2 = Arrays.asList("Poonam","Test","Ramba","Samba");
		Stream<String> cn=Stream.concat(name1.stream(), name2.stream());
		//cn.sorted().forEach(s->System.out.println(s));
		
		System.out.println(cn.anyMatch(s->s.equalsIgnoreCase("Poonam")));
		

	}

}
