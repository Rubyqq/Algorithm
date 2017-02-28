package sentenceScreenFitting;

/**
 * This code is not a original code. The thought of the code is from someone in leetcode. The author understand the code and wrote the code with her thought with
 * reference of the original code.
 * @author Mengyi
 *
 */

public class sentenceScreenFitting {
	
	public static void main(String...args){
	
		String [] sentence = {"hello", "world"};
		int a = wordsTyping(sentence, 3, 6);
		System.out.print(a);
	}
	
	public static int wordsTyping(String[] sentence, int rows, int cols) {
		String s = String.join(" ", sentence) + " "; // change the array of strings into a string
		int length = s.length(); 
		int start = 0;
		for(int i = 0; i < rows; i++){
			start += cols; // calculate the start point of each row
			if(s.charAt(start % length) == ' '){
				start++; // if it is a space that means the next one is a start point
			}
			while(start % length > 0 && (s.charAt(start % length - 1)) != ' '){ // if it is not a space. Then it could be a char in a word or first char of the word. We need to judge if it is a first word. 
																				// If it is not, start point should minus one
				start--;
			}
		}
		return start/length; 
    }
}
