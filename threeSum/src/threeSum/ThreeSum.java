package threeSum;

import java.util.Arrays;

public class ThreeSum {
	
	public static void main(String [] args){
		int [] s = {-1, 0, 1, 2, -1, -4};
		int result[] = new int[3];
		int resultC [][] = new int [100][3];
		int target = 0;
		Arrays.sort(s);
		if(s.length < 4){
			System.out.print("This array is not long enough!");
		}
		if(3*s[0] > target){
			System.out.print("The target failed!");
		}
		if(3*s[s.length - 1] < target){
			System.out.print("The target failed!");
		}
		for(int i = 0; i < s.length-2; i++){
			while(i > 1 && s[i] == s[i-1]) i++; //very easy to skip!!!!!
			int sum = target - s[i];
			int start = i+1;
			int end = s.length-1;
			while(start < end){
				if(s[start] + s[end] < sum){
					start++;
				}
				else if(s[start] + s[end] > sum){
					end--;
				}
				else if(s[start] + s[end] == sum){
					result[0] = s[i];
					result[1] = s[start];
					result[2] = s[end];
					for (int g = 0; g < 1; g++){
						System.out.print("[");
						for(int k = 0; k < result.length; k++){
							System.out.print(result[k] + ",");
						}
						System.out.println("]");
					}
					
					start++;
					end--;
					while(start < end && s[start] == s[start-1]){
						start++; //difficult part, the two while loop should be seperated!!!
					}				
					while(start < end && s[end] == s[end+1]){
						end--;
					}
				}
			}
		}
	}	
}

