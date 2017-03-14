package NextGreaterElement;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {
	
	public static void main(String...args){
		int [] findNums = {4, 1, 2};
		int [] nums = {1,3,4,2};
		
		nextGreaterElement(findNums, nums);
	}
	
	public static int[] nextGreaterElement(int[] findNums, int[] nums) {
        
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        
        Stack<Integer> mystack = new Stack<Integer>();
        for(int num : nums){
            while(!mystack.isEmpty() && (mystack.peek() < num)){
                hash.put( mystack.pop(), num);
            }
            
            mystack.push(num);
        }
        for(int i = 0; i < findNums.length; i++){
        	System.out.print(hash.getOrDefault(1 , -1));
            findNums[i] = hash.getOrDefault(findNums[i] , -1);
        }
        
//        for (int name: hash.keySet()){
//
//            int key =name;
//            String value = hash.get(name).toString();  
//            System.out.println(key + " " + value);  


//		} 
        
        return findNums;
    }
}
