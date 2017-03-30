package ClosestBinarySearchTreeValue;

/**
 * 
 * Description of the question
 * 
 * Given a non-empty binary search tree and a target value, find the value in the BST that is closest to the target. 
 * 
 * Note:
 * •Given target value is a floating point.
 * •You are guaranteed to have only one unique value in the BST that is closest to the target.
 * 
 * @author Mengyi
 *
 */

public class ClosestBinarySearchTreeValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int closestValue(TreeNode root, double target) {
        int res = root.val;
        while(root != null){
            if(Math.abs(target - root.val) < Math.abs(target - res)){
                res = root.val;
            }
            
            root = root.val > target ? root.left : root.right;
        }
        return res;
    }

}
