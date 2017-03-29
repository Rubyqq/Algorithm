package BinaryTreeLevelOrderTraversalII;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * Description of the question
 * 
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. 
 * (ie, from left to right, level by level from leaf to root).
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7

* return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]
 * @author Mengyi
 *
 */

public class BinaryTreeLevelOrderTraversalII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public LinkedList<LinkedList<Integer>> levelOrderBottom(TreeNode root) {
		LinkedList<LinkedList<Integer>> list = new LinkedList<LinkedList<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        if(root == null) return list;
        
        queue.add(root);
        while(!queue.isEmpty()){
        	int addTime = queue.size();
        	LinkedList<Integer> subList = new LinkedList<Integer>();
            for(int i = 0; i < addTime; i++){
                TreeNode node = queue.peek();
            	if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            	subList.add(queue.remove().val);
            } 
            
            list.add(0,subList);
        }
        return list;
    }
}
