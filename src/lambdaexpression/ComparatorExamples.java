package lambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Student
{
	int age;
	String name;
	
	Student(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
	
	public String toString()
	{
		return name +"("+age+")";
		
	}
}

public class ComparatorExamples {

	public static void main(String[] args) {
		
		//Sorting with Comparator
		List<String> name = Arrays.asList("Ranjit","Hari","Ram","Prabhu");
		name.sort((s1,s2)->Integer.compare(s1.length(), s2.length()));
			
		//name.sort(Comparator.reverseOrder());
		System.out.println(name);
		
		List<Student> ls= new ArrayList<>();
		ls.add(new Student(12,"Ranjit"));
		ls.add(new Student(10,"Hari"));
		ls.add(new Student(8,"Ram"));
		ls.add(new Student(9,"Sam"));
		ls.add(new Student(12,"Prabhu"));
		
		//Sort By Age
		
		//ls.sort((p1,p2)->Integer.compare(p1.age, p2.age));
		
		//Chain comparator First By AGe then By name
		
		//ls.sort(Comparator.comparingInt((Student s)->s.age).thenComparing(s->s.name));
		
		//Sort by Age in Reverse Order
		
			
		ls.sort(Comparator.comparingInt((Student p) -> p.age).reversed());
		System.out.println(ls);
		
		

	}

}
