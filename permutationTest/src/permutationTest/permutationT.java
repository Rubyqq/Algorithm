package permutationTest;

import java.util.ArrayList;

public class permutationT {
	public static void main(String [] agrs){
		
		String a = "at";
		System.out.print(a.substring(0,0) + a.substring(1));
		
		
		System.out.println("---------------------------");
		
		for(String s : permutations("t")){
		System.out.println(s);
		}
	}
	
	public static ArrayList<String> permutations(String word){
		ArrayList<String> result = new ArrayList<String>();
		
		if (word.length() == 0){
			result.add(word);
			return result;
		}
		
		else{
			for(int i=0; i < word.length(); i++){
				String shorter = word.substring(0, i) + word.substring(i+1);
				ArrayList<String> shorterPermutations = permutations(shorter);
				
				for(String s : shorterPermutations){
					result.add(word.charAt(i) + s);
				}
			}
			
			return result;
		}
	}
}
