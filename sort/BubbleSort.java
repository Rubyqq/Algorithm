package sort;

public class BubbleSort{

	public static void main(String[] args) {
		int[] arr = {1,5,3,9};
		String[] array = {"E", "B", "A", "D","F"};
		bubbleSort(array);
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}
	
	public static void bubbleSort(String []arr) {
		int n = arr.length;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < n-i-1; j++) {
				if(arr[j].compareTo(arr[j+1]) > 0) {
					String temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

}
