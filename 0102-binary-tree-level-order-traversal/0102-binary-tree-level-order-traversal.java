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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        res.add(Arrays.asList(root.val));
        while (!q.isEmpty()) {
            List<Integer> ls = new ArrayList<>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode currNode = q.poll();
                if (currNode.left != null) {
                    q.offer(currNode.left);
                    ls.add(currNode.left.val);
                }
                if (currNode.right != null) {
                    q.offer(currNode.right);
                    ls.add(currNode.right.val);
                }
            }
            if(!ls.isEmpty()){
                res.add(ls);
            }
        }
        return res;
    }
}