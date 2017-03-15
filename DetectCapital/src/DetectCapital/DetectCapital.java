package DetectCapital;

public class DetectCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(detectCapitalUse("apdf"));
	}
	
	 public static boolean detectCapitalUse(String word) {

	        int count = 0;
	        for(int i = 0; i < word.length(); i++){
	            if(Character.isLowerCase(word.charAt(i))) count++;
	            else count--;
	            
	        }
	        
	        if(count == word.length() || count == -word.length()) return true;
	        else if(word.length() > 1 && count == word.length()-2 && Character.isUpperCase(word.charAt(0))) return true;
	        else return false;
	        
	        
	    }

}
