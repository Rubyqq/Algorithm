package ClimbingStairs;

/**
 * 
 * Description of the question
 * 
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top? 
 * Note: Given n will be a positive integer. 
 * @author Mengyi
 *
 */

public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(climbStairs(44));
	}
	
//	public static int climbStairs(int n) { // This solution is slow when the number n is large
//        
//        int count = 0;
//        if(n == 0 || n == 1) count++;
//        else{count = climbStairs(n-2) +  climbStairs(n-1);}
//        return count;
//     
//    }
	
	public static int climbStairs(int n) {
        
        if(n == 0 || n == 1 || n == 2) {return n;}

        int [] num = new int[n];
        num[0] = 1;
        num[1] = 2;
        for(int i = 2; i < n; i++){
            num[i] = num[i-1] + num[i-2];
        }
        
        return num[n-1];
    }

}
