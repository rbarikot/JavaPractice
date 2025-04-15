package Interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class DhulipalaKrishna {
	public static void main(String[] args) {
	String s = "Hellho";	
	Map<Character,Integer> hm = new LinkedHashMap<Character,Integer>();
	
	for(int i=0;i<s.length()-1;i++) {
		if(hm.containsKey(s.charAt(i))) {
			hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
		}
		else {
			hm.put(s.charAt(i),1);
		}
	}
	for(Map.Entry<Character, Integer> e: hm.entrySet()) {
		if(e.getValue()==1) {
			System.out.println(""+e.getKey());
			break;
		}
	}		
}
}
/*
 * Program 1
 
 int[] A = {1,2,3,4,5,6};
 int temp = 0;

if(A.length > 0) {
for(int i=0,j=A.length-1;i<A.length-1;i++,j--) {
	if(i<j) {
		temp = A[j];
		A[j] = A[i];
		A[i] = temp;

	}
		}
}
else {
System.out.println("Not valid array");
}

for(int k=0;k<A.length;k++)
System.out.println(A[k]);
*/
