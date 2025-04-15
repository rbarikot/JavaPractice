package CollectionTest.MapTest;

import java.util.LinkedHashMap;

public class MapTest4UnderstandingLinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
		lhm.put(100, "Test1");
		lhm.put(20, "Test2");
		lhm.put(40, "Test3");
		lhm.put(60, "Test4");
		lhm.put(50, "Test5");
		System.out.println(lhm);
		
		//remove and put to understand more of Insertion order
		
		lhm.remove(20);
		System.out.println(lhm); //O/p {100=Test1, 40=Test3, 60=Test4, 50=Test5}
		lhm.put(20, "Test2");
		System.out.println(lhm); //o/p {100=Test1, 40=Test3, 60=Test4, 50=Test5, 20=Test2}
		//since here we have added 20 now the insertion order is maintained so it will add to last element
		//get --> get Value based on key
		System.out.println(lhm.get(40));//Test3
		
		//containsKey
		System.out.println(lhm.containsKey(40));//True
		
		//size
		System.out.println(lhm.size());//5
		
		//isEmpty
		System.out.println(lhm.isEmpty());//false
		
		//containsValue
		System.out.println(lhm.containsValue("Test5"));//True
		
		
		
		//Special Construction to have lru cache
		//4-->Initial Capacity, 0.6f --> Load Factor (number of entries in hash table divided by total number of slots in Hashtable)
		//0.6F means once the total entry is 60% it will start creating hashing means it will increase the length of Hashtable
		//true -->Access Order
		LinkedHashMap<Integer,String> lhm1=new LinkedHashMap<>(4,0.6f,true);
		lhm1.put(100, "Test1");
		lhm1.put(20, "Test2");
		lhm1.put(40, "Test3");
		lhm1.put(60, "Test4");
		lhm1.put(50, "Test5");
		System.out.println("*****************************************");
		System.out.println(lhm1);//{100=Test1, 20=Test2, 40=Test3, 60=Test4, 50=Test5}
		System.out.println(lhm1.get(20));//Test2
		//Once we try to get any value through key it will change the order and will make it as last element which says of the 
		//3rd parameter which is Access Order is true then it will maintain order as per Access order not as per Insertion order
		System.out.println(lhm1);//{100=Test1, 40=Test3, 60=Test4, 50=Test5, 20=Test2}
		lhm1.put(40,"Test6");
		System.out.println(lhm1);//{100=Test1, 60=Test4, 50=Test5, 20=Test2, 40=Test6}
		
		
	}

}
