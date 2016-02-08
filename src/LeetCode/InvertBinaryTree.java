package LeetCode;

import java.util.LinkedList;

public class InvertBinaryTree {
	class TreeNode {
		    int val;
		    TreeNode left;
		    TreeNode right;
		    TreeNode(int x) { val = x; }
		 }
		 
	 public TreeNode invertTree(TreeNode root) {
	        if(root == null) return null;
	        if(root != null){
	            TreeNode temp = root.left;
	            root.left = root.right;
	            root.right = temp;
	        }
	        if(root.left != null) {
	            invertTree(root.left);
	        }
	        if(root.right != null){
	            invertTree(root.right);
	        }
	        return root;
	    }
	 public TreeNode invertTreeIterative(TreeNode root) {
		    LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		 
		    if(root!=null){
		        queue.add(root);
		    }
		 
		    while(!queue.isEmpty()){
		        TreeNode p = queue.poll();
		        if(p.left!=null)
		            queue.add(p.left);
		        if(p.right!=null)
		            queue.add(p.right);
		 
		        TreeNode temp = p.left;
		        p.left = p.right;
		        p.right = temp;
		    }
		 
		    return root;    
		}
}
