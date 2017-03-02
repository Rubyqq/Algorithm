package BinaryTree;

import java.util.ArrayList;

/**
 * This solution is based on the thought of someone from leetcode. Author understand the reference code and write the code on her own
 * @author Mengyi
 *
 */

public class BinaryTree {

	public ArrayList<ArrayList<Integer>> findLeaves(TreeNode root) {
		
		ArrayList<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>();
		findHeight(root, array);
		return array;
    }
	
	public static int findHeight(TreeNode node, ArrayList<ArrayList<Integer>> array){
		if(node == null) return -1;
		int level = 1 + Math.max(findHeight(node.left, array), findHeight(node.right, array));
		if(array.size() == level) array.add(new ArrayList<Integer>());
		array.get(level).add(node.val);
		return level;
	}
   

}
