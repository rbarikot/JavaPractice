package DSA.ArrayPractice;

import java.util.Arrays;

public class ArrayPracticeTest1 {

	public static void main(String[] args) {
		int[] arr= new int[5];
		
		System.out.println("Print Default Values of int Array"+Arrays.toString(arr));//0,0,0,0,0
		
		double[] arr1=new double[5];
		System.out.println("Print Default Values of double Array"+Arrays.toString(arr1));//0.0,0.0,0.0,0.0,0.0
		
		float[] arr2= new float[5];
		
		System.out.println("Print Default Values of float Array"+Arrays.toString(arr2));//0.0,0.0,0.0,0.0,0.0
		char[] arr3= new char[5];
		
		System.out.println("Print Default Values of char Array"+Arrays.toString(arr3));//[ , , , , , ]
		String[] arr4= new String[5];
		
		System.out.println("Print Default Values of String Array"+Arrays.toString(arr4));//null,null,null,null,null
		
		boolean[] arr5= new boolean[5];
		
		System.out.println("Print Default Values of boolean Array"+Arrays.toString(arr5));
	}

}
