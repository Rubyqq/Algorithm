package RansomNote;

public class RansomNote {
	
	/**
	 * Description of the question:
	 * Given an arbitrary ransom note string and another string containing letters 
	 * from all the magazines, write a function that will return true if the ransom note 
	 * can be constructed from the magazines ; otherwise, it will return false. 
	 * Each letter in the magazine string can only be used once in your ransom note. 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(canConstruct("as", ""));
//		"bdjijj"
//		"aifbigejbibiefgeffhabgeejdbiajgaahjefhdegafhfcigjaecbfiechadiehhfcejhhfbbdjheecfaijdba"
	}
	public static  boolean canConstruct(String ransomNote, String magazine) {
        
		 StringBuilder sb = new StringBuilder(magazine);
	        StringBuilder sb1 = new StringBuilder(ransomNote);
	        int length = sb.length();
	        int i = 0;
	        int j = 0;
	        int count = 0;
	        
	        if(sb1.length() == 0) return true;
	        if(sb1.length() > length) return false;
	        
	        while(true){
	            if(sb1.charAt(i) != sb.charAt(j)){
	                j++;
	            	if(j > length-1) return false;
	            }else{
	               
	               sb.deleteCharAt(j);
	               length = sb.length();
	               count++;
	               if(count == ransomNote.length()) return true;
	               i++;
	               j=0;
	            }
	        }
	        
    }
}
