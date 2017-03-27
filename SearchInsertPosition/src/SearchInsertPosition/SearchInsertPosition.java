package SearchInsertPosition;

/**
 * 
 * Given a sorted array and a target value, return the index if the target is found. 
 * If not, return the index where it would be if it were inserted in order.
 * You may assume no duplicates in the array.
 * 
 * Here are few examples.
 * [1,3,5,6], 5 → 2
 * [1,3,5,6], 2 → 1
 * [1,3,5,6], 7 → 4
 * [1,3,5,6], 0 → 0 
 * 
 * @author Mengyi
 *
 */

public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 97;
		int[] nums = {};
		int a = searchInsert(nums, target);
		System.out.print(a);
	}
	
	public static int searchInsert(int[] nums, int target) {
        
        int start = 0;
        int end = nums.length-1;
        int mid = nums.length/2;
        int res = 0;
        
        if(nums.length == 0 || target<nums[start]) return 0;
        if(target > nums[end]) return end+1;
        
        while(start < end){
        	
        	mid = (start+end)/2;
        	
            if(target < nums[mid]){
                end = mid;
            }else if(target > nums[mid]){
                start = mid+1;
            }else return mid;
            
            if(start == end){
                if(nums[start] > target) res = end;
                else if(nums[end] < target) res = start+1;
                else if(nums[end] == target) res = start;
                break;
            }
        } 
        return res;
	}

}
