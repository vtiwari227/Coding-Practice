package LeetCode;

import java.util.ArrayList;

class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;
	
	TreeNode( int data) {
		this.data = data;
		left = right = null;
	}
}
public class ValidateBST {
	public boolean isBST(TreeNode root){
		ArrayList<Integer> list = Inorder(root);
		for(int i= 0; i < list.size()-2;i++){
			if (!(list.get(i) > list.get(i+1))) return false;
			
		}
		return true;
	}
	
 public ArrayList<Integer> Inorder(TreeNode root){
	 ArrayList<Integer> inorderValues = null;
	 if(root != null){
	 		Inorder(root.left);
	 		inorderValues.add(root.data);
	 		Inorder(root.right);
	 	}
	 return inorderValues;
 }
 
 public boolean isValidBST(TreeNode root) {
     return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
 }

 public boolean isValidBST(TreeNode root, long minVal, long maxVal) {
     if (root == null) return true;
     if (root.data >= maxVal || root.data <= minVal) return false;
     return isValidBST(root.left, minVal, root.data) && isValidBST(root.right, root.data, maxVal);
 }
}

