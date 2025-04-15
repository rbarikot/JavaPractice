package CollectionTest;

import java.util.HashMap;
import java.util.Map;

public class GetOrDefaultTest {

	public static void main(String[] args) {

		Map<String, Integer> hm = new HashMap<>();
        hm.put("Geek1", 1);
        hm.put("Geek2", 2);
        
        int b=hm.getOrDefault("Geek2", 1);

        int a = hm.getOrDefault("Geek1", 0);
        System.out.println("Value for 'Geek1': " + a);

	}

}
