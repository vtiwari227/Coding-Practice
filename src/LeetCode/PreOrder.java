package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrder {
	class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	
	public ArrayList<Integer> preorderTraversal(TreeNode root){
		ArrayList<Integer> result = new ArrayList<Integer>();
		Stack<TreeNode> objStack = new Stack<TreeNode>();
		if(root == null) return result;
		objStack.push(root);
		while(!(objStack.isEmpty())){
			TreeNode node = objStack.pop();
			if(root.right != null){
				objStack.push(root.right);
				
			}
			// The idea is to keep the right element below in stack to pop left first and do the same 
			//across every level
			if(root.left != null){
				objStack.push(root.left);
				
			}
			
		}
		return result;
	}
}
