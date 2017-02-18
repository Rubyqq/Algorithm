package binarySearch;

import java.util.Arrays;

public class binarySearch {
	public static void main(String...args){
		int [] numbers = {2,4,576, 1};
		int target = 576;
		binSearch(numbers, 0, numbers.length-1, target);
	}
	
	public static int binSearch(int[] nums, int left, int right, int target){
		Arrays.sort(nums);
		if(left > right){
			return -1; //-1 means failure
		}
		else{
			int mid = (left + right)/2;
			if(nums[mid] == target){
				System.out.print(mid);
				return mid;
			}
			else if(nums[mid] < target){
				return binSearch(nums, mid+1, right, target);
			}
			else{
				return binSearch(nums, left, mid-1, target);
			}
		}
		
		
	}
}
