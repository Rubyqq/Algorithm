package powerOfTwo;

/**
 * 
 * Description of the question
 * 
 * Given an integer, write a function to determine if it is a power of two. 
 * 
 * @author Mengyi
 *
 */

public class powerOfTwo {
	
	public static void main(String...args){
		System.out.print(isPowerOfTwo(2));
	}
	
	public static boolean isPowerOfTwo(int n) {
        // return (n > 0 && 1073741824 % n == 0); //cheating method
		//return (n>0 && Integer.bitCount(n) == 1); //better solution
        
        int count = 0;
        
        while(n > 0){
            if((n & 1) == 1) count++;
            n = n >>> 1;
        }
        
        if(count == 1) return true;
        else return false;
    }
}
