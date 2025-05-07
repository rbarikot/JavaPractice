package DSA.ArrayPractice;

import java.util.Arrays;

public class TwoSumAndTarget {

	public static void main(String[] args) {

		int[] nums= {3,2,4};
		TwoSumAndTarget ob= new TwoSumAndTarget();
		ob.twoSum(nums,6);

	}
	public int[] twoSum(int[] nums, int target) {
		int[] result=new int[2];
		int x = 0,y = 0;
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(target-nums[i]==nums[j])
				{
					x=i;
					y=j;
				}
			}
		}
		result[0]=x;
		result[1]=y;
		System.out.println(Arrays.toString(result));
		return result;
        
    }
	

}
