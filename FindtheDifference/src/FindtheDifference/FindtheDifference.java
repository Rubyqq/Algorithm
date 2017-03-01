package FindtheDifference;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindtheDifference {
	
	public static void main(String...args){
//		findTheDifference("adbc", "abcde");
		char b = findTheDifference("a", "aa");
		System.out.print(b);
	}
	
	public static char findTheDifference(String s, String t) {
		int charT = 0;
		int charS = 0;
		
        for(int i = 0; i < s.length(); i++) charS += (int)s.charAt(i);
        for(int i = 0; i < t.length(); i++) charT += (int)t.charAt(i);
        
        return (char)(charT - charS);
    } 
}
