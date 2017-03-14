package SingleNumber;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
	
	public static void main(String...args){
		int [] nums = {2, -1,-1};
		System.out.print(singleNumber(nums));
	}
	public static int singleNumber(int[] nums) {
        
//        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
//        int result = 0;
//        
//        for(int i = 0; i < nums.length; i++){
//        	
////        	if(nums[i] < 0) {nums[i] = -nums[i];}
//            if(hash.containsKey(nums[i])){
//                hash.remove(nums[i]);
//            }else{
//                hash.put(nums[i], nums[i]);
//            }
//        }
//        
//        for (int name: hash.keySet()){
//            result =name;    
//    	} 
//        	        
//        
//        return result;
//        
        
        int result = 0; //Better solution with bit manipulation
        
        for(int i = 0; i < nums.length; i++){
            result ^= nums[i];
        }
        return result;
    }
	
	
}
