package Miscellaneous;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintSecondLargestElementinArray {

	public static void main(String[] args) {
		List<Integer> ls =Arrays.asList(1,2,3,8,9,7,8,3,16,9).stream().sorted().distinct().collect(Collectors.toList());
		System.out.println("The Second Largest Element in Array: " +ls.get(ls.size()-2));
	}

}
