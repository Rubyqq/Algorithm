package keyBoardRow;

import java.util.ArrayList;

public class keyBoardRow {
	public static void main(String...args){
		String [] s = {"Hello","Alaska","Dad","Peace"};
 		String[] a = findWords(s);
		
	}
	
	 public static String[] findWords(String[] words) {
	        int count = 0;
	        for(int i = 0; i < words.length; i++){
	            if(words[i].toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*")){
	                count++;
	            }
	            
	        }
	        String[] string = new String[count];
	        count = 0;
	        for(int i = 0; i < words.length; i++){
	            if(words[i].toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*")){
	                string[count] = words[i];
	                count++;
	            }
	            
	        }
	        
	        return string;
	    }
}
