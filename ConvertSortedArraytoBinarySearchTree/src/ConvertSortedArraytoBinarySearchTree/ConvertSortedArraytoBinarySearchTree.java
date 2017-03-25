package ConvertSortedArraytoBinarySearchTree;

/**
 * Description of the question
 * 
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 * @author Mengyi
 *
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class ConvertSortedArraytoBinarySearchTree {
	
	public TreeNode sortedArrayToBST(int[] nums) {
        
        if(nums.length == 0) return null;
        
        return helper(nums, 0, nums.length-1);
       
    }
    
    public TreeNode helper(int[]num, int left, int right){
        
        int mid = (left+right)/2;
        
        if(left > right) return null;
        
        TreeNode node = new TreeNode(num[mid]);
        
        node.left = helper(num, left, mid-1);
        node.right = helper(num, mid+1, right);
        
        return node;
        
    }
}
