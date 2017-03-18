package IntersectionofTwoArrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


/**
 * Description of the question:
 * Given two arrays, write a function to compute their intersection. 
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2]. 
 * Note:
 * •Each element in the result must be unique
 * •The result can be in any order.
 * @author Mengyi
 *
 */

public class IntersectionofTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums1 = {1};
		int [] nums2 = {1};
		
		for(int i = 0; i < intersection(nums1, nums2).length; i++){
			System.out.print(intersection(nums1, nums2)[i]);
		}
	}
	
	public static int[] intersection(int[] nums1, int[] nums2) {
		
		HashSet <Integer> set = new HashSet <Integer> ();
		ArrayList <Integer> arraylist = new ArrayList<Integer>();
		
		
        for (int i = 0; i < nums1.length; i++){
        		set.add(nums1[i]);
        		

        }
        
        for(int j = 0; j < nums2.length; j++){
        	if(set.contains(nums2[j])){
        		arraylist.add(nums2[j]);
        		set.remove(nums2[j]);
        		
        	}
        }
        
        int [] array = new int[arraylist.size()];
        
        for(int k = 0; k < array.length; k++){
        	array[k] = arraylist.get(k);
        }
        
        return array;
    }

}
