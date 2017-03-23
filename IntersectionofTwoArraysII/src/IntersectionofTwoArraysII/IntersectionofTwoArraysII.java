package IntersectionofTwoArraysII;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * Description of the question:
 * 
 * Given two arrays, write a function to compute their intersection. 
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2]. 
 * Note:
 * •Each element in the result should appear as many times as it shows in both arrays.
 * •The result can be in any order.
 * @author Mengyi
 *
 */

public class IntersectionofTwoArraysII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums1 = {1};
		int[] nums2 = {1,2,1};
		for(int num : intersect(nums1, nums2)){
			System.out.print(num);
		}

	}
	
	public static int[] intersect(int[] nums1, int[] nums2) {
		
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        ArrayList <Integer> arraylist = new ArrayList <Integer>();
        
        int i = 0;
        int j = 0;
        
        while(i < nums1.length && j < nums2.length){
        	if(nums1[i] < nums2[j]){
        		i++;
        	}
        	else if(nums1[i] == nums2[j]){
        		arraylist.add(nums1[i]);
        		i++;
        		j++;
        	}
        	else if(nums1[i] > nums2[j]){
        		j++;
        	}
        }
        
        int [] array = new int [arraylist.size()]; 
        
        for(int k = 0; k < arraylist.size(); k++){
			array[k] = arraylist.get(k);
		}
        
        return array;
    }

}
