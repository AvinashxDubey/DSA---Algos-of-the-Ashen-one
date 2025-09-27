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
    /**
        levelOrder traversal is just bfs
        it can be done using queue
        start by adding root to the res list and queue
        then iterate over the queue until its empty
        each time run a for loop inside for queue.size()
        which traverses for one level at a time
        add left and right nodes to queue and a list
        if list is not empty add it to res list
     */
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