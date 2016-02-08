package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class InorderBinaryTree {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int data){
			this.val = data;
			left = right = null;
		}
	}
	
	public List<Integer> inorderTraversal(TreeNode root){
		List<Integer> result = new ArrayList<Integer>();
		
		 while(true) {
			 if(root == null ) return result;
			 if(root != null){
				 root =root.left;
			 }
			  result.add(root.val);
			  root = root.right;
		 }
		
	}
}
