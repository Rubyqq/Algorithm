package MaximumDepthofBinaryTree;

public class MaximumDepthofBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	  //Definition for a binary tree node.
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	 
	
    public int maxDepth(TreeNode root) {
        
        int result = 0;
        int leftDepth = 0;
        int rightDepth = 0;
        
        if(root == null) {
            return 0;
        }
        
        if(root.left == null && root.right == null){
            return 1;
        }
        
        if(root.left != null){
            leftDepth = maxDepth(root.left);
        }
        if(root.right != null){
            rightDepth = maxDepth(root.right);
        }
        
        return result = 1+ Math.max(leftDepth, rightDepth);

    }
	

}
