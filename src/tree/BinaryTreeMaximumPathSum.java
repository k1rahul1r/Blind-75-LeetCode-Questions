package tree;

//https://leetcode.com/problems/binary-tree-maximum-path-sum/
public class BinaryTreeMaximumPathSum {
	int max = Integer.MIN_VALUE;

	public int maxPathSum(TreeNode root) {
		postOrderTraversal(root);
		return max;
	}

	public int postOrderTraversal(TreeNode node) {
		if (node == null)
			return 0;

		int left = Math.max(postOrderTraversal(node.left), 0);
		int right = Math.max(postOrderTraversal(node.right), 0);
		max = Math.max(max, left + right + node.val);
		return Math.max(left, right) + node.val;
	}
}
