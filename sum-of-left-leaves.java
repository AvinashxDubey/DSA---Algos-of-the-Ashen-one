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
    private int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        sumOfLeftLeavesHelper(root, false);
        return sum;
    }

    public void sumOfLeftLeavesHelper(TreeNode root, boolean left){
        if(root==null) return;
        if(root.left==null && root.right==null){
            if(left) sum+=root.val;
            else return;
        }
        sumOfLeftLeavesHelper(root.left, true);
        sumOfLeftLeavesHelper(root.right, false);
    }
}