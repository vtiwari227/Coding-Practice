package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode(int data){
		this.val =data;
		left = right =null;
	}
}
	 public List<List<Integer>> levelOrder(TreeNode root) {
	        Queue<TreeNode> queue = new LinkedList<TreeNode>();
	        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();

	        if(root == null) return wrapList;

	        queue.offer(root);
	        while(!queue.isEmpty()){
	            int levelNum = queue.size();
	            List<Integer> subList = new LinkedList<Integer>();
	            for(int i=0; i<levelNum; i++) {
	                if(queue.peek().left != null) queue.offer(queue.peek().left);
	                if(queue.peek().right != null) queue.offer(queue.peek().right);
	                subList.add(queue.poll().val);
	            } 
	            wrapList.add(subList);
	        }
	        return wrapList;
	    }
}
