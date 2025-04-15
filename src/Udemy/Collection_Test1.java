package Udemy;

import java.util.ArrayList;

class Employee{
	int id;
	String name;
	String dob;
	public Employee(int id, String name,String dob)
	{
		System.out.println("Id is"+id+"Name is "+name+"Dob is"+dob);
	}
}

public class Collection_Test1 {

	public static void main(String[] args) {
		
		//List -->Array List , Linked List, Vector
		//Set -->Hashset, Linked Hashset, treeset
		//Map-->Hashmap, Tree Map, linked Hashmap
		
		ArrayList<Employee> ob = new ArrayList<Employee>();
		ob.add(new Employee(1,"Ranjit","25011991"));
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(23);
		al.add(25);
		al.add(34);
		System.out.println(al);
		
		int a[]= {2,3,4,5};
		
		for(int i=0;i<a.length;i++)
		{
			al.add(a[i]);
		}
		
		System.out.println(al);
		
		int b[]= new int[al.size()];
		for(int i=0;i<al.size();i++)
		{
			b[i]=al.get(i);
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		

	}

}
