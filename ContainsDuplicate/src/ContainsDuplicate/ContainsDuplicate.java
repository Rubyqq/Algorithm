package ContainsDuplicate;

import java.util.Arrays;

/**
 * Given an array of integers, find if the array contains any duplicates. 
 * Your function should return true if any value appears at least twice in 
 * the array, and it should return false if every element is distinct.
 *
 * @author Mengyi
 *
 */

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stub
	}
	
	 public boolean containsDuplicate(int[] nums) {
	        
	        Arrays.sort(nums);
	        for(int i = 1; i < nums.length; i++){
	            if(nums[i-1] == nums[i]){
	                return true;
	            }
	        }
	        return false;
	    }

}
