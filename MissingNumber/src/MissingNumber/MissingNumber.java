package MissingNumber;

/**
 * 
 * Description of the question
 * 
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array. 
 * For example,
 * Given nums = [0, 1, 3] return 2. 
 * @author Mengyi
 *
 */

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {0,1,3};
		missingNumber(nums);
	}
	
	public static int missingNumber(int[] nums) {
        
        int len = nums.length;
        int sum = (0+len)*(len+1)/2;
        for(int i=0; i<len; i++)
            sum-=nums[i];
        return sum;

        
    }

}
