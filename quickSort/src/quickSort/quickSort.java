package quickSort;

/**
 * This is the algorithm for the quick sort by using recursion method
 * @author Mengyi
 *
 */

public class quickSort {
	public static void main(String [] args){
		
		/**
		 * Given the list in the code and the method of quickSort will do the quick sort method
		 * print the result of the method
		 */
		int s1 [] = {0,2,4,1,6,8,9,3,7,7}; 
		quickSort qs = new quickSort();
		qs.quickSort1(s1,0,s1.length-1);
		for(int i : s1){
			System.out.print(i);
		}
	}
	
	public void quickSort1(int []s, int start, int end){
		int pivot = s[end]; // pivot represents the last number of the list
		int length = s.length;//end - start; //the length of the list and sublist 
		int pIndex = start;  // the pIndex will change with the start number in the list
		int temp; // will be used in the swap method below
		if(start < end){
			
			int i = start;
			while(i < end){ 
				if(s[i] < pivot){
					temp = s[pIndex];
					s[pIndex] = s[i];
					s[i] = temp;
					pIndex++; 
				}
				i++;
			}
			temp = s[pIndex];
			s[pIndex] = s[end];
			s[end] = temp;			
			
			quickSort1(s, start, pIndex-1); // recursion method 
			quickSort1(s, pIndex+1, end);  // recursion method
			
			
		}
		
		else return;
	}

}
