package MinimumAbsoluteDifferenceinBST;

public class MinimumAbsoluteDifferenceinBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stub
	}
	
	 TreeNode rt;
	 int min = Integer.MAX_VALUE;
	 
	    public int getMinimumDifference(TreeNode root) {
	        
	        inOrder(root);
	        return min;
	    }
	    
	    public void inOrder(TreeNode root) {
	        
	        if(root == null) return;
	        
	        inOrder(root.left);
	        
	        if(rt != null) min = Math.min(min , root.val - rt.val);
	        rt = root;
	        
	        inOrder(root.right);
	        
	    }

}
