package StringTest;

public class StringTest5StringBuilderandBuffer {

	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder("hello");
		
		//append
		System.out.println("Append Functionality");
		StringBuilder sb2=sb.append("World");
		System.out.println(sb);//helloWorld
		System.out.println(sb2);//helloWorld
		
		//Insert
		System.out.println("Insert Functionality");
		sb2.insert(1, "wloo");
		System.out.println(sb2);//hwlooelloWorld
		
		//setCharAt
		System.out.println("setCharAt Function");
		sb2.setCharAt(1, 'S');
		System.out.println(sb2);//hSlooelloWorld
		
		//Reverse
		System.out.println("Reverse Function");
		System.out.println(sb2.reverse());//dlroWolleoolSh
		
		//deleteCharAt
		System.out.println("deleteCharAt Function");
		System.out.println(sb2.deleteCharAt(2));//dloWolleoolSh
		
		//delete
		System.out.println("Delete Function");
		System.out.println(sb2.delete(1, 3));//dWolleoolSh
		
		//Capacity
		System.out.println("Capacity Function");
		System.out.println(sb2.capacity());//21
		
		//Replace
		System.out.println("Replace Function");
		System.out.println(sb2.replace(1, 5, "helooow"));//dheloooweoolSh
		
	}

}
