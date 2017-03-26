package PowerOfThree;

/**
 * Description of the question
 * 
 * Given an integer, write a function to determine if it is a power of three. 
 * Follow up:
 * 
 * Could you do it without using any loop / recursion? 
 * @author Mengyi
 * 
 * This method if cheating...lol...
 *
 */
		

public class PowerOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stub
	}
	
	public static boolean isPowerOfThree(int n) {
        return (n > 0 && 1162261467%n == 0);
    }

}
