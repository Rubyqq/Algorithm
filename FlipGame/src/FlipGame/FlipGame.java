package FlipGame;

import java.awt.List;
import java.util.ArrayList;

/**
 * generatePossibleNextMoves: This is the slowest algorithm I have ever seen...lol Array is not necessary
 * generatePossibleNextMoves1 is much better
 * @author Mengyi
 *
 */

public class FlipGame {
	
	public static void main(String...args){
		generatePossibleNextMoves1("++++");
		for(String i : generatePossibleNextMoves1("++++")){
			System.out.println(i);
		}
	}
	
	public static ArrayList<String> generatePossibleNextMoves(String s) {
		
		ArrayList<String> list = new ArrayList<String>();
		int length = s.length();
		String [] s1;
		
		for(int i = 0; i < length-1; i++){
			s1 = s.split("");
			if(s1[i].equals(s1[i+1]) &&  s1[i].equals("+")){ //s1[i] and s1[i+1] should not be the same pointer
				s1[i] = "-"; 
				s1[i+1] = "-";
				
				String s2 = String.join("", s1);
				
				list.add(s2);
			}
			
		}
		
		return list;
		
	}
	
	public static ArrayList<String> generatePossibleNextMoves1(String s) {
		
		ArrayList<String> list = new ArrayList<String>();
		int length = s.length();
		String s1;
		
		for(int i = 1; i < length; i++){
			s1 = s;
			if(s.charAt(i) ==  s.charAt(i-1) && s.charAt(i-1) == '+'){
				s1 = s1.substring(0, i-1) + "--" + s1.substring(i+1);
				list.add(s1);
			}
		}
		return list;
	}
	   
}
