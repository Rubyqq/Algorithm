package FizzBuzz;

import java.util.ArrayList;

public class FizzBuzz {
	public static void main(String...args){
		fizzBuzz(1);
		System.out.print(fizzBuzz(15));
	}
	
	public static ArrayList<String> fizzBuzz(int n) {
		ArrayList<String> string = new ArrayList<String>();
        for(int i = 0; i < n; i++){
             if(((i+1) % 5 == 0) && ((i+1) % 3 != 0)){
                 string.add("Buzz");
             }else if(((i+1) % 5 != 0) && ((i+1) % 3 == 0)){
                 string.add("Fizz");
             }else if(((i+1) % 5 == 0) && ((i+1) % 3 == 0)){
                 string.add("FizzBuzz");
             }
             else{
                string.add(Integer.toString(i+1));//Integer.toString(i+1)
             }
        }
	        
	        return string;
	}
}
