package PathSumIII;

/**
 * Description of the question
 * 
 * You are given a binary tree in which each node contains an integer value.
 * Find the number of paths that sum to a given value.
 * The path does not need to start or end at the root or a leaf, 
 * but it must go downwards (traveling only from parent nodes to child nodes).
 * The tree has no more than 1,000 nodes and the values are in the range -1,000,000 to 1,000,000. 
 * Example: 
 * root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8
 * 
 *     10
 *    /  \
 *   5   -3
 *  / \    \
 *  3   2   11
 * / \   \
 * 3  -2   1
 * Return 3. The paths that sum to 8 are:
 * 1.  5 -> 3
 * 2.  5 -> 2 -> 1
 * 3. -3 -> 11
 * @author Mengyi
 *
 */

public class PathSumIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int pathSum(TreeNode root, int sum) {
	        
	        if(root == null) return 0;
	        int res = Sum(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
	        return res;
	    }
	    
	    public int Sum(TreeNode root, int sum1) {
	        
	        if(root == null) return 0;
	        
	        int count = 0;
	        int temp = 0;
	        sum1 = sum1 - root.val;
	        if(sum1 == 0) {
	            count++;
	        }
	        count = count + Sum(root.left, sum1) + Sum(root.right, sum1);
	        return count;
	    }
    

}
