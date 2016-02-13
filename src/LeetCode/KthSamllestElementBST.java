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
	 
    TreeNode p = root;
    int result = 0;
 
    while(!stack.isEmpty() || p!=null){
        if(p!=null){
            stack.push(p);
            p = p.left;
        }else{
            TreeNode t = stack.pop();
            k--;
            if(k==0)
                result = t.val;
            p = t.right;
        }
    }
 
    return result;
}
