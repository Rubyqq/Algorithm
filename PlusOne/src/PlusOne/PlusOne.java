package PlusOne;

public class PlusOne {
	public static void main(String...args){
		int [] array = {6,9,9,9,9};
		for(int i: plusOne(array)){
		System.out.print(i);
		}
	}
	
	public static int[] plusOne(int[] digits) {
		if(digits[digits.length-1] == 9){
	        for(int i = digits.length-1; i >= 0; i--){
	        	if(digits[i] == 9){
	        		digits[i] = 0;
	        		if(digits[0] == 0){
	        			int [] newdigits = new int [digits.length+1];
	        			newdigits[0] = 1;
	        			for(int j = 1; j < newdigits.length; j++){
	        				newdigits[i] = 1;
	        			}
	        			return newdigits;
	        		}
	        	}
	        	else{
	        		digits[i]++;
	        		break;
	        	}
	        }
		}
		else{
			digits[digits.length-1]++;
		}
		
		return digits;
	}
	    
}
