package LongestSubKDistinct1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class LongestSubKDistinct1 {
	
	public static void main(String...args){
		lengthOfLongestSubstringKDistinct("eeaakasssakkkk", 3);
//		int a = lengthOfLongestSubstringKDistinct("eeaakasssakkkk", 3);
//		System.out.print(a);
	}


	public static void lengthOfLongestSubstringKDistinct(String s, int k) {

		 HashMap<Character, Integer> map = new HashMap<>();
		    int left = 0;
		    int best = 0;
		    for(int i = 0; i < s.length(); i++) {
		        // character at the right pointer
		        char c = s.charAt(i);
		        map.put(c, map.getOrDefault(c, 0) + 1);
		        // make sure map size is valid, no need to check left pointer less than s.length()
		        while (map.size() > k) {
		            char leftChar = s.charAt(left);
		            map.put(leftChar, map.get(leftChar) - 1);  
//		            System.out.print(leftChar);
//		            System.out.print(map.get(leftChar) - 1);
//		            System.out.print("-------------------");
		            if (map.get(leftChar) == 0) { 
		                map.remove(leftChar);
		                Iterator it = map.entrySet().iterator();
		                while (it.hasNext()) {
		                    Map.Entry pair = (Map.Entry)it.next();
		                    System.out.println(pair.getKey() + " = " + pair.getValue());

		            }
		            left++;
		        }
		        best = Math.max(best, i - left + 1);
		    }
//		    return best;
	    }
	}

}

