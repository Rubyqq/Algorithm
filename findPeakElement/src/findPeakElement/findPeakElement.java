package findPeakElement;

public class findPeakElement {
	static int array[] = {4, 2, 1, 0};
	
	
	public static void main(String...args){
		findPeakElement fpe = new findPeakElement();
//		fpe.findPE(0, array.length-1); //recursion method 
		int number = fpe.findPeak(array); // iteration method
		System.out.print(number);
	}
	
	public int findPeak(int [] nums){
		int start = 0;
		int end = nums.length-1;
		
		if(nums.length == 1){
			return 0;
		}
		else if(nums.length == 2){
			int a = (nums[start] < nums[end])? end: start;
			return a;
		}
		else{
			while(end - start > 1){
				int mid = (start + end)/2;
				if(nums[mid-1] > nums[mid]){
					end = mid - 1;
				}
				else if(nums[mid-1] < nums[mid]){
					start = mid;
				}
			}
			int a = (nums[start] < nums[end])? end: start;
			return a;
		}
		
	}
	
	
	public void findPE(int start, int end){
		if (array.length == 1){
			System.out.print (0);
		}
		
		else if(array.length == 2){
			int a = (array[start] < array[end])? end: start;
			System.out.print(a);
		}
		else if(array.length > 2){
			int mid = (start + end)/2;
			
			if(end - start <= 1){
				int a = (array[start] < array[end])? end: start;
				System.out.print(a);
			}
			else if(array[mid-1] > array[mid]){
				end = mid - 1;
				findPE(start, end);
			}
			else if(array[mid-1] < array[mid]){
				start = mid;
				findPE(start, end);
			}
		}
		
	}
}
