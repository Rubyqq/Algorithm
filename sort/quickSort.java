package sort;

public class quickSort {
	
	public static void main(String...args) {
		
		System.out.println("B".compareTo("A"));
		int arr[] = {1,5,9,3,2};
		String array[] = {"A","F","B","D","C"};
		quickSort(array, 0, array.length-1);
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	
	public static void quickSort(String []arr, int low, int high) {
		if(low < high) {
			int pi = partition(arr, low, high);
			quickSort(arr, pi+1, high);
			quickSort(arr, low, pi-1);
		}
	}
	
	public static int partition(String [] arr, int low, int high) {
		
		String pivot = arr[high];
		int i = low-1;
		String temp;
		
		for(int j = low; j <= high-1; j++) {
			if(arr[j].compareTo(pivot) < 0) {
				i++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
		
	}
	
	
	
}
