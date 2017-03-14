package LongestSubKDistinct;

import java.util.HashMap;

public class LongestSubKDistinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = lengthOfLongestSubstringKDistinct("a", 0);
		System.out.print(a);
	}
	public static int lengthOfLongestSubstringKDistinct(String s, int k) {
		int count = 1;
		int temp = 1;
		int max = 1;
		int times = 0;
		int bridge = 0;
		HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
		if(s.length() == 0){
		    return 0;
		}
		if(k == 0){return 0;}
		hash.put(s.charAt(0), 0);
		int j;
		int i = 1;
		while(i < s.length()){
			temp = 1;
			for(j = i; j < s.length(); j++){
				if(s.charAt(j-1) != s.charAt(j) && !hash.containsKey(s.charAt(j))){
					hash.put(s.charAt(j), j);
					count++;
					times = 0;
					if (count == 2 && times == 0){
						bridge = j;
						times++;
					}
					if (count > k){
						hash.clear(); 
						count = 1;
						break;
					}
				}
				temp++;
			}
			max = Math.max(max, temp);
			
			if(j == s.length()) break;
			i = bridge;
			hash.put(s.charAt(i), i);
			i++;	
		}
		
		return max;
	}

}
