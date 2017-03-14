package fibTest;

import java.util.Scanner;

public class fibTest {
	public static void main (String [] agrs){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = in.nextInt();
		
		for(int i=1; i <= n; i++){
			long f = fib(i);
			System.out.println("fib(" + i + ") = " + f);
		}
	}
	
	public static long fib(int n){
		if(n <= 2){return 1;}
		else{
			return fib(n-1) + fib(n-2);
		}
	}
}
