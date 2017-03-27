package StrobogrammaticNumber;

import java.util.HashSet;

/**
 * 
 * Description of the question
 * 
 * A strobogrammatic number is a number that looks the same when rotated 180 degrees (looked at upside down).
 * Write a function to determine if a number is strobogrammatic. The number is represented as a string.
 * For example, the numbers "69", "88", and "818" are all strobogrammatic.
 * 
 * @author Mengyi
 *
 */

public class StrobogrammaticNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stub
	}
	
	public boolean isStrobogrammatic(String num) {
        
        if(num.equals("")) return true;
        HashSet<String> set = new HashSet<String>();
        set.add("00");
        set.add("11");
        set.add("88");
        set.add("69");
        set.add("96");
        
        int i = 0, j = num.length()-1;
        while(i <= j){
            if(!set.contains((num.charAt(i) + "" + num.charAt(j)))){
                return false;
            }
            i++;
            j--;
        }
        
        return true;
    }
}
