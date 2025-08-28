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
    public int findSecondMinimumValue(TreeNode root) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b-a);
        findSecondMin(root, maxHeap);
        return maxHeap.size()==2 ? maxHeap.poll() : -1;
    }

    public void findSecondMin(TreeNode node, PriorityQueue<Integer> pq){
        if(node==null) return;

        if(pq.isEmpty() || !pq.contains(node.val)){
            pq.offer(node.val);
        }
        if(!pq.isEmpty() && pq.size()>2) pq.poll();
        findSecondMin(node.left, pq);
        findSecondMin(node.right, pq);
    }
}