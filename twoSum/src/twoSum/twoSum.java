package twoSum;

import java.util.HashMap;
import java.util.Map;

public class twoSum {
	int target = 9;
	
	public static void main(String...args){
		int [] array = {11,7,15,2};
		twoSum t = new twoSum();
		for(int a = 0; a < t.myPractice(array, 9).length; a++){
			System.out.print(t.myPractice(array, 9)[a]);
		}
		//t.TwoSum();
		//t.bruceForce();
	}
	
	
	public int[] twoSum(int[] numbers, int target) {
	    int[] result = new int[2];
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for (int i = 0; i < numbers.length; i++) {
	        if (map.containsKey(target - numbers[i])) {
	            result[1] = i;
	            result[0] = map.get(target - numbers[i]);
	            return result;
	        }
	        map.put(numbers[i], i);
	    }
	    return result;
	}
	
	public int[] TwoSum(int[] numbers, int target) {
	    int[] result = new int[2];
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for(int i = 0; i < numbers.length; i++){
	    	map.put(numbers[i], i);
	    }
	    for (int i = 0; i < numbers.length; i++) {
	        if (map.containsKey(target - numbers[i])) {
	            result[1] = i;
	            result[0] = map.get(target - numbers[i]);
	            return result;
	        }
	    }
	    return result;
	}
	
	public int[] myPractice(int [] numbers, int target){
		int [] result = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		//map.put(numbers[0], 0); this step is omittable
		for(int i = 0; i < numbers.length; i++){
			int complement = target - numbers[i];
			if(map.containsKey(complement)){
				result[0] = map.get(complement);
				result[1] = i;
			};
			map.put(numbers[i], i);
			
		}
		return result;
	}
}
 