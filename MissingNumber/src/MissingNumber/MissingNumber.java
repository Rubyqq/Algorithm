package MissingNumber;



public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {0,1,3};
		missingNumber(nums);
	}
	
	public static int missingNumber(int[] nums) {
        
        int len = nums.length;
        int sum = (0+len)*(len+1)/2;
        for(int i=0; i<len; i++)
            sum-=nums[i];
        return sum;

        
    }

}
