package binarySearch;

import java.util.Arrays;

public class binarySearch {
	public static void main(String...args){
		int [] numbers = {2,4,576, 1};
		int target = 20;
//		binSearch(numbers, 0, numbers.length-1, target);
		
//		int a = binSearch2(numbers,target);
//		System.out.print(a);
		
		int b = linearSearch(numbers,target); 
		System.out.print(b);
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
	
	public static int binSearch2(int[] nums, int target){ // time complexity of this is O(logn)
		Arrays.sort(nums);
		int start = 0;
		int end = nums.length-1;
		
		while(start <= end){
			int mid = (start + end)/2;
			if(nums[mid] == target){return mid;}
			else if(nums[mid] < target){start = mid + 1;}
			else if(nums[mid] > target){end = mid -1;}
		}
		return -1;
	}
	
	public static int linearSearch(int[] nums, int target){ //use linearSearch to compare it with binary search for time complexity. Time complexity of this is O(n)
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++){
			if(nums[i] == target){return i;}
		}
		return -1;
	}
}
