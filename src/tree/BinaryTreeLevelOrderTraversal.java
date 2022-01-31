package tree;
import java.util.*;
//https://leetcode.com/problems/binary-tree-level-order-traversal/
public class BinaryTreeLevelOrderTraversal {
	 public List<List<Integer>> levelOrder(TreeNode root) {
	        List<List<Integer>> res = new ArrayList<>();
	        if(root==null)
	            return res;
	        
	        Queue<TreeNode> queue = new LinkedList<>();
	        queue.add(root);
	        
	        while(!queue.isEmpty()){
	            List<Integer> currentLevel = new ArrayList<>();
	            int size = queue.size();
	            for(int i=0;i<size;++i){
	                TreeNode currentNode = queue.remove();
	                currentLevel.add(currentNode.val);
	                if(currentNode.left!=null){
	                    queue.add(currentNode.left);
	                }
	                if(currentNode.right!=null){
	                    queue.add(currentNode.right);
	                }   
	            }
	            res.add(currentLevel);
	        }
	        return res;
	    }
}
