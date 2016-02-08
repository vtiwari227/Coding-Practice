package LeetCode;

public class LCABST {
 class TreeNode {
	 int data;
	 TreeNode left;
	 TreeNode right;
 }
 public TreeNode LCA(TreeNode root, TreeNode p , TreeNode q){
	 TreeNode m = root;
	 if((m.data > p.data)  && (m.data < q.data)){
		 return m;
	 }
	 else if((m.data > p.data) && (m.data > q.data) ){
		 return LCA(root.left,p,q);
	 } else if((m.data <p.data)&& (m.data < q.data)){
		 return LCA(root.right,p,q);
	 }
	 return root;
 }
}
