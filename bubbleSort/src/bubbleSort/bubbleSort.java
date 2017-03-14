package bubbleSort;

import java.util.ArrayList;

public class bubbleSort {
	public static void main(String[] args){
		int [] s = {2,7,4,1};
		
		for(int i=1; i<s.length; i++){
			int value = s[i];
			int hole = i;
			while(hole>0 && s[hole-1]>value){
				s[hole] = s[hole-1];
				hole--;
			}
			s[hole] = value;
		}
		
		for (int i : s){
			System.out.print(i);
		}
	
//		ArrayList test = new ArrayList();
//		test.add("s");
//		test.add(4);
//		for (int i = 0; i<test.size();i++){
//			System.out.print(test.get(i));
//		}
	}
}
