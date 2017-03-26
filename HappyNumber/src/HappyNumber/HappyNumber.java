package HappyNumber;

import java.util.HashSet;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(isHappy(20));
	}
	
	public static boolean isHappy(int n) {
        
        HashSet<Integer>set = new HashSet<Integer>();
        
        while(n != 1){
        	int a = 0;
        	
	        while(n != 0){
	            a += (n%10)*(n%10);
	            n = (n-n%10)/10;  
	        }
	        n = a;

	        if(set.contains(n)) return false;
	        set.add(n);
        }
        return true;
    }

}
