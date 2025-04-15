package Test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicateElementinArray {

	public static void main(String[] args) {
		int[] arr= {2,4,8,9,7,4,5,6,7,7,5};
		
		//Code for Duplicate Element in Array
		/*Set<Integer> hs=new HashSet<>();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					hs.add(arr[i]);
				}
			}
		}
		System.out.println(hs);*/
		
		//Code for Finding the largest Number in Array
		
		/*int largest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(largest<arr[i]) {
				largest=arr[i];
			}
		}
		
		System.out.println(largest);
		List<Integer> ls=Arrays.asList(2,4,8,9,7,4,5,6,7,7,5).stream().sorted().collect(Collectors.toList());
		System.out.println(ls.get(ls.size()-1));*/
		
		//Program to find the Smallest Number
		/*int smallest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(smallest>arr[i]) {
				smallest=arr[i];
			}
		}
		
		System.out.println(smallest);
		List<Integer> ls=Arrays.asList(2,4,8,9,7,4,5,6,7,7,5).stream().sorted().collect(Collectors.toList());
		System.out.println(ls.get(0));*/
		
		//Program to find the 2nd largest Element
		/*List<Integer> ls=Arrays.asList(2,4,8,9,7,4,5,6,7,7,5).stream().sorted().distinct().collect(Collectors.toList());
		System.out.println(ls.get(ls.size()-2));*/
		
		//Code for Sorting the Element
		
		/*for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		Arrays.asList(2,4,8,9,7,4,5,6,7,7,5).stream().sorted().forEach(s->System.out.println(s));*/
		
		//Print odd and Even Number in Array
		List<Integer> ls1=new ArrayList<>();
		List<Integer> ls2=new ArrayList<>();
		
		/*for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				ls1.add(arr[i]);
			}
			else
			{
				ls2.add(arr[i]);
			}
		}
		System.out.println("The even :"+ls1);
		System.out.println("The odd :"+ls2);
		
		ls1=Arrays.asList(2,4,8,9,7,4,5,6,7,7,5).stream().filter(s->(s%2==0)).collect(Collectors.toList());
		ls2=Arrays.asList(2,4,8,9,7,4,5,6,7,7,5).stream().filter(s->(s%2!=0)).collect(Collectors.toList());
		System.out.println("The even :"+ls1);
		System.out.println("The odd :"+ls2);*/
		
		
	}

}
