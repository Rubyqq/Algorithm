package FindAllNumbersDisappearedinanArray;

import java.util.ArrayList;

public class FindAllNumbersDisappearedinanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []nums = {4,3,2,7,8,2,3,1};
		findDisappearedNumbers(nums);
	}
	
	public static ArrayList<Integer> findDisappearedNumbers(int[] nums) {
        
		ArrayList<Integer> array = new ArrayList<Integer>();

       for(int i = 0; i < nums.length; i++){
           int temp = nums[i];
           if(nums[Math.abs(temp)-1] > 0){
               nums[Math.abs(temp)-1] = -nums[Math.abs(temp)-1];
           }
       }
       
       for(int j = 1; j <= nums.length; j++){
           if(nums[j-1] > 0){
               array.add(j);
           }
       }
       
       return array;
   }

}
