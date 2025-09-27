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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int leftMax = maxDepth(root.left);
        int rightMax = maxDepth(root.right);
        int d1 = leftMax+rightMax;
        int d2 = diameterOfBinaryTree(root.left);
        int d3 = diameterOfBinaryTree(root.right);

        return Math.max(d1, Math.max(d2, d3));
    }

    private int maxDepth(TreeNode root){
        if(root==null) return 0;

        return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}