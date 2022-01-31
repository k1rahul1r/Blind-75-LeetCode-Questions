package tree;

//https://leetcode.com/problems/subtree-of-another-tree/
public class SubtreeofAnotherTree {
	public boolean isSubtree(TreeNode root, TreeNode subRoot) {
		if (root == null)
			return false;
		else if (checkSubtree(root, subRoot))
			return true;
		else
			return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
	}

	private boolean checkSubtree(TreeNode m, TreeNode s) {
		if (m == null || s == null)
			return m == null && s == null;
		else if (m.val == s.val)
			return checkSubtree(m.left, s.left) && checkSubtree(m.right, s.right);
		else
			return false;
	}
}
