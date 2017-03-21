package ValidAnagram;

/**
 * 
 * Description of the question
 * 
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false. 
 * Note:
 * You may assume the string contains only lowercase alphabets.
 * @author Mengyi
 *
 */

public class ValidAnagram {
	
	public boolean isAnagram(String s, String t) {
        int [] letters = new int [26];
        
        for(int i = 0; i < s.length(); i++){
            letters[s.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < t.length(); i++){
            letters[t.charAt(i) - 'a']--;
        }
        
        for(int i = 0; i < letters.length; i++){
            if(letters[i] != 0) return false;
        }
        
        return true;
    }

}
