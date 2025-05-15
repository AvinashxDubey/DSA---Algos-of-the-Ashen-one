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
    int sum=0;
    public TreeNode bstToGst(TreeNode root) {
        reverseInorder(root);
        return root;
    }

    public void reverseInorder(TreeNode node){
        if(node==null) return;
        
        reverseInorder(node.right);

        sum+=node.val;
        node.val=sum;

        reverseInorder(node.left);
    }
}