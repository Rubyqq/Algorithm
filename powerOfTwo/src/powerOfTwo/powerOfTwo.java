package powerOfTwo;

public class powerOfTwo {
	public static void main (String [] args){
		powerOfTwo T = new powerOfTwo();
		T.pow2(2);
		System.out.println(T.pow2(4));
	}

	public static int pow2(int n){
		if (n <= 0){return 0;}
		else{
			int smaller = n-1;
			return pow2(smaller) + n*n;
		}
	}
}
