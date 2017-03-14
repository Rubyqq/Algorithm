package recursionTest;

public class recursionT {
	public static void main(String [] args){
		int s1 [] = {0,2,4,1,6,8,9,3,7};
		recursionT t = new recursionT();
		t.recursionTest(s1, 0, s1.length-1);
		for(int i: s1){
			System.out.print(i);
		}
 	
	}
	
	public void recursionTest(int[]s, int start, int end){
		if(start < end){
			int pivot = s[end];
			int length = end-start;
			int pIndex = start;
			int i = start;
			int temp;
			while(i < end){
				if(s[i] < pivot){
					temp = s[pIndex];
					s[pIndex] = s[i];
					s[i] = temp;
					pIndex++;
				}	
				i++;
			}
			
			temp = s[end];
			s[end] = s[pIndex];
			s[pIndex] = temp;
			
			recursionTest(s, start, pIndex-1);
			recursionTest(s, pIndex+1, end);
		}
		
		else return;
			
	}
		
}		
	

