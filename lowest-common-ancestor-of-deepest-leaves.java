/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        int leftDepth = findMaxDepth(root.left);
        int rightDepth = findMaxDepth(root.right);
        
        if(leftDepth==rightDepth) return root;

        if(leftDepth>rightDepth)  return lcaDeepestLeaves(root.left);

        return lcaDeepestLeaves(root.right);
    }

    private int findMaxDepth(TreeNode root){
        if(root==null) return 0;
        return 1+ Math.max(findMaxDepth(root.left), findMaxDepth(root.right));
    }
}