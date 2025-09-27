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
    List<Integer> ls1 = new ArrayList<>();
    List<Integer> ls2 = new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        dfs(root1, ls1);
        dfs(root2, ls2);
        return Objects.equals(ls1, ls2);
    }

    private void dfs(TreeNode root, List<Integer> ls){
        if(root==null) return;
        if(root.left==null && root.right==null) ls.add(root.val);
        dfs(root.left, ls);
        dfs(root.right, ls);
    }
}