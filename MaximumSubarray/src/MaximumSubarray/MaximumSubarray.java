package MaximumSubarray;

/**
 * 
 * Description of the question
 * 
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum. 
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6. 
 * 
 * @author Mengyi
 *
 */

public class MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int a = maxSubArray(nums);
		System.out.print(a);
	}
	
//	public static int maxSubArray(int[] nums) { //Time complexity: O(n2) 
	                                            //This solution is slow therefore cannot pass the tests in leetcode with the reason of exceed time limitation 
//        
//        int max = 0, cur = Integer.MIN_VALUE, temp = 0;
//        
//        for(int i = 0; i < nums.length; i++){
//            for(int j = i; j >= 0; j--){
//                temp += nums[j];
//                cur = Math.max(cur, temp);
//            }
//            
//            temp = 0;
//            max = Math.max(max, cur);
//        }
//        
//        return max;
//    }
	
	public static int maxSubArray(int[] nums) { //Better solution with time complexity of O(n)
        
        int max = nums[0], cur = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            cur = Math.max(cur + nums[i], nums[i]);
            max = Math.max(cur, max);
        }
        
        return max;
    }

}
