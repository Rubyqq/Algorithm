package ShortestWordDistance;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ShortestWordDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] words = {"a", "b"};
		
		int b = shortestDistance(words, "b", "a");
		
		System.out.print(b);
	}
	
	public static int shortestDistance(String[] words, String word1, String word2) {
		
//		int temp = 0;
//		int temp1 = 0;
//		int temp3 = 0;
//		int min = Integer.MAX_VALUE;
//		
//		for(int i = 0; i < words.length; i++){ //worse solution 1
//			
//			for(int j = 0; j < words.length; j++){
//				
//				if(word1.equals(words[i]) && word2.equals(words[j])){
//					temp = i;
//					temp1 = j;
//					temp3 = Math.abs(temp1 - temp);
//					min = Math.min(min, temp3);
//				}
//				
//				temp3 = Math.abs(temp1 - temp);
//				System.out.println(temp1 + temp + "-----");
//				min = Math.min(min, temp3);
//			}
//			
//		}
//		
//
//    	
//    	return min;
    	
		int min = Integer.MAX_VALUE, index1 = -1, index2 = -1; //better solution 2
        
	        for(int i = 0; i < words.length; i++){
	            if(words[i].equals(word1)){
	                index1 = i;
	            }
	            if(words[i].equals(word2)){
	                index2 = i;
	            }
	            if(index1 >= 0 && index2 >= 0){
	                min = Math.min(min, Math.abs(index1 - index2));
	            }
	        }
        
        return min;
    	
        
    }

}
