package PalindromePermutation;

import java.util.HashMap;

public class PalindromePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(canPermutePalindrome("aab"));
	}
	
public static boolean canPermutePalindrome(String s) {
        
        HashMap <Character, Integer> hash = new HashMap <Character, Integer>();
        
        for(int i = 0; i < s.length(); i++){
            if(hash.containsKey(s.charAt(i))) hash.remove(s.charAt(i));
            else hash.put(s.charAt(i), i);
        } 
        
       return hash.size() <= 1;
    }

}
