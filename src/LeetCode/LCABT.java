package LeetCode;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import LeetCode.TreeNode;
/*class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode(int data){
		this.val = data;
		left = right =null;
	}
}*/

public class LCABT {
	public TreeNode LCA(TreeNode root, TreeNode p , TreeNode q) {
	Map<TreeNode, TreeNode> parent = new HashMap<>();
	Stack<TreeNode> stack = new	Stack();
	parent.put(root, null);
	stack.push(root);
	while (!parent.containsKey(p) || !parent.containsKey(q)) {
        TreeNode node = stack.pop();
        if (node.left != null) {
            parent.put(node.left, node);
            stack.push(node.left);
        }
        if (node.right != null) {
            parent.put(node.right, node);
            stack.push(node.right);
        }
    }
    Set<TreeNode> ancestors = new HashSet<>();
    while (p != null) {
        ancestors.add(p);
        p = parent.get(p);
    }
    while (!ancestors.contains(q))
        q = parent.get(q);
    return q;
}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		// if any of the element is the the head of subtree then will return that
        if(root == null || root == p || root == q)  return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        //If both are not null then the root value
        if(left != null && right != null)   return root;
        // if any of the part is null then return other part .
        return left != null ? left : right;
    }
	
}
