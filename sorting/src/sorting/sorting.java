package sorting;

public class sorting {
	public static void main(String [] args){
		int []s1 = {2,4,5,64,3,7};
		sorting T = new sorting();
		T.recursionSort(s1);
		for (int i:s1){
			System.out.print(i);
			System.out.print(" ");
		}
	}
	
	public void recursionSort(int [] s){
		int length = s.length;
		int middleP = s.length/2;
		
		if (s.length<2) return;
		else{
			int left[] = new int[middleP];
			int right[] = new int[length-middleP];
			
			for(int i = 0; i < middleP; i++){
				left[i] = s[i];
				
			}
			
			for(int j = middleP; j<length; j++){
				right[j - middleP] = s[j];
			}
				
			recursionSort(left);
			recursionSort(right);
			doMergeSort(s, left, right);
		}
	}
	
	public void doMergeSort(int []s, int []left, int []right){
		int a = 0, b = 0, c = 0;
		while(a < left.length && b < right.length){
			if(left[a] < right[b]){
				s[c] = left[a];
				a++;
			}
			else{
				s[c] = right[b];
				b++;
			}
			c++;
		}
		while(a < left.length){
			s[c] = left[a];
			a++;
			c++;
		}
		
		while(b < right.length){
			s[c] = right[b];
			b++;
			c++;
		}
	}
}
    

