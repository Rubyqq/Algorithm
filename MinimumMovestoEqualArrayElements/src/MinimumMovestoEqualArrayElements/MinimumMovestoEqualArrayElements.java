package MinimumMovestoEqualArrayElements;

import java.util.Arrays;

/**
 * Description of the question 
 * Given a non-empty integer array of size n, find the minimum number 
 * of moves required to make all array elements equal, where a move is 
 * incrementing n - 1 elements by 1.
 * 
 * @author Mengyi
 * 
 * Adding 1 to n - 1 elements is the same as subtracting 1 from one element, 
 * with the goal of making the elements in the array equal.
 * So, best way to do this is make all the elements in the array equal to the min element.--thought from leetcode
 * author learn the idea and implement the code by herself
 *
 */

public class MinimumMovestoEqualArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1,2,3,4};
		minMoves(nums);
	}
	
	public static int minMoves(int[] nums) {
        
        Arrays.sort(nums);
        int count = 0;
        
        for(int i = nums.length-1; i > 0; i--){
            
            count += (nums[i]-nums[0]);
        }
        
        return count;
    }

}
