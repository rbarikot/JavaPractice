package Udemy;

import java.util.ArrayList;

public class Lambda_Test1 {

	public static void main(String[] args) {

		ArrayList<String> al= new ArrayList<String>();
		al.add("Ranjit");
		al.add("Poonam");
		al.add("Suman");
		al.add("Uphar");
		al.add("Ravi");
		int count =0;
		for(int i=0;i<al.size();i++)
		{
			String actual=al.get(i);
			if(actual.startsWith("R"))
			{
				count++;
			}
		}
		
		System.out.println(count);
		
		//Assign the List to stream
		//Create a lambda expression for intermediate expression like filter
		//Then Execution
		//Lamda Expression --> Left side is parameter and Right side is the lambda body which specifies the actions of the lambda expression
		
		//Count the Name starting with R
		int countR=(int) al.stream().filter(s->s.startsWith("R")).count();
		System.out.println(countR);	
		
		//Print the Name having more than character 4
		al.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
		//Print the Name having more than character 4 but limit to only 2
		System.out.println("Print the Name having more than character 4 but limit to only 2");
		al.stream().filter(s->s.length()>4).limit(2).forEach(s->System.out.println(s));
		
		//Map 
		System.out.println("Map Implementation");
		al.stream().filter(s->s.startsWith("R")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		

	}

}
