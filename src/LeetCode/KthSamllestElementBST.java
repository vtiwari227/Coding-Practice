package LeetCode;

import java.util.ArrayList;
import java.util.Stack;

public class KthSamllestElementBST {
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode(int data) {
		this.val = data;
		left = right = null;
	}
}
public int kthSmallest(TreeNode root, int k) {
    Stack<TreeNode> stack = new Stack<TreeNode>();
    ArrayList<Integer> result = new ArrayList<Integer>();
     stack.push(root);
     while(!(stack.isEmpty())){
    	  TreeNode node = stack.pop();
    	  if(node.left != null){
    		  stack.push(node.left);
    		  
    	  }
    	  
     }
	return k;
}
}
