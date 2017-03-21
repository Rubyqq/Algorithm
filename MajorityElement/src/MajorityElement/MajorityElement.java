package MajorityElement;

/**
 * 
 * Description of the question:
 * 
 * Given an array of size n, find the majority element. 
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * 
 * The method is the voting method better than canceling method
 * 
 * Time complexity of the algorithm is O(n) and space complexity is O(1)
 * 
 * @author Mengyi
 *
 */

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,1,2,2,4};
		System.out.print(majorityElement(nums));
	}
	
	 public static int majorityElement(int[] nums) {

	        int flag = nums[0], count = 1;
	        for(int i = 1; i < nums.length; i++){
	            if(count == 0){
	                flag = nums[i];
	                count++;
	                }
	            else if(flag == nums[i]) count++;
	            else {
	                count--;
	            }
	        }
	        return flag;
	    }

}
