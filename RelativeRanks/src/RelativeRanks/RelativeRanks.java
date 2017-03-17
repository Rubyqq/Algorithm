package RelativeRanks;

import java.util.Arrays;

public class RelativeRanks {
	
	public static void main(String...agrs){
		
		int [] nums = {3,1,2,4,5};
		findRelativeRanks(nums);
		
//			System.out.print(Arrays.toString(findRelativeRanks(nums)));
		
	}
	
	public static String[] findRelativeRanks(int[] nums) {

		int[][] pair = new int[nums.length][2]; 
		
		for(int i = 0; i < nums.length; i++){
			pair[i][0] = nums[i];
			pair[i][1] = i;
		}

		java.util.Arrays.sort(pair, new java.util.Comparator<int[]>() {
		    public int compare(int [] a, int [] b) {
		        return Integer.compare(a[0], b[0]);
		    }
		});

		String [] string = new String[pair.length];
		
		for(int i = 0; i < pair.length; i++){
			
			if(pair.length-i == 1) string[pair[i][1]] = "Gold Medal";
			else if(pair.length-i == 2) string[pair[i][1]] = "Silver Medal";
			else if(pair.length-i == 3) string[pair[i][1]] = "Bronze Medal";
			else{string[pair[i][1]] = Integer.toString(pair.length-i);}
			
		}
        return string;
    }
}
