package DSA.ArrayPractice;

import java.util.Arrays;

public class RemoveElementAndCountElement {

	public static void main(String[] args) {
		
		int[] nums= {3,2,2,3};
		int val=3;
		RemoveElementAndCountElement ob = new RemoveElementAndCountElement();
		ob.removeElement(nums,val);
		
		

	}
	public int removeElement(int[] nums, int val) {
		int[] result=new int[nums.length];
		int k=0;
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=val)
			{
				result[k++]=nums[i];
			}
		}
		int[] result1=new int[k];
		for(int i=0;i<result1.length;i++)
		{
			result1[i]=result[i];
		}
		System.out.println(Arrays.toString(result1));
		System.out.println(k);
		return k;
    }

}
