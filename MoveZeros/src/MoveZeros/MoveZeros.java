package MoveZeros;

public class MoveZeros {
	
	 public static void main(String...args){
		 //stub
	 }
 
	 public void moveZeroes(int[] nums) {
	        
	        // for(int i = 0; i < nums.length-1; i++){
	        //     if(nums[i] == 0){
	        //         for(int j = i+1; j < nums.length; j++){
	        //             if(nums[j] != 0){
	        //                 nums[i] = nums[j];
	        //                 nums[j] = 0;
	        //                 break;
	        //             }
	        //         }
	        //     }
	        // }
	        
	        // return;
	        
	        int temp = 0; //better solution
	        
	        for(int i = 0; i < nums.length; i++){
	            if(nums[i] != 0){
	                nums[temp++] = nums[i];
	            }
	        }
	        
	        while(temp < nums.length){
	            nums[temp++] = 0;
	        }
	    }
}
