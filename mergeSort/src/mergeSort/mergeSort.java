package mergeSort;

//time complexity: nlogn
public class mergeSort {
	
	public static void main(String[] args){
		int[] s1 = {2,4,1,6,8,5,3,7};
		mergeSort test1 = new mergeSort();
		test1.doMergeSort(s1);
		for(int i:s1){
            System.out.print(i);
            System.out.print(" ");
        }
	}

	//use recursion to do merge sort
	public void doMergeSort(int[]s){
		int length = s.length;
		if(length<2) return;
		else{
			int middleP = s.length/2;
			int left1[] = new int [middleP];
			int right1[] = new int[length-middleP];
			for (int i=0; i<middleP; i++){
				left1[i] = s[i];
				
			}
			for (int j=middleP; j<length; j++){
				right1[j-middleP] = s[j]; //trap
				
			}
			
			doMergeSort(left1);  //recursion the most difficult part to understand. Need more practice.
			doMergeSort(right1);
			merge(s, left1, right1);
	        }
		}

	//change the list to sort list
	public void merge(int[]s3, int left[], int right[]) {
		int a = 0,b = 0,c = 0;
		
		while(a<left.length && b<right.length){
			if(left[a] < right[b]){
				s3[c] = left[a];
				a++;
			}
			else{
				s3[c] = right[b];
				b++;
			}
			c++;
		}
		
		while(a < left.length){
			s3[c] = left[a];
			a++;
			c++;
		}
		while(b < right.length){
			s3[c] = right[b];
			b++;
			c++;
		}		
	}	
}
