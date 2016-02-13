package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	int data;
	Node leftChild;
	Node rightChild;
	
	public Node(int data){
		this.data = data;
		
	}
}
public class BinaryTreeLevelOrderTraversal {
	public void levelOrderTraversal(Node root){
		Queue<Node> myQueue = new LinkedList<Node>();
		if(root == null){
			return;
		}
		myQueue.offer(root);
		while(!myQueue.isEmpty()){
			Node curr = myQueue.poll();
			if(!(curr.leftChild == null)){
				myQueue.offer(curr.leftChild);
			}
		    if	(!(curr.rightChild == null)){
				myQueue.offer(curr.rightChild);
			}
			System.out.println(curr.data);	
		}
	}
	//Another approach to print the values in level order with set containing each level values
/*	 public List<List<Integer>> levelOrder(TreeNode root) {
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
   }*/
}
