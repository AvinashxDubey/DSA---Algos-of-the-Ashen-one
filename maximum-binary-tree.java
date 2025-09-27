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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        TreeNode root = constructHelper(nums, 0, nums.length);
        return root;
    }

    public TreeNode constructHelper(int[] nums, int i, int j){
        if(i>=j) return null;
        int[] maxPair = findMax(nums, i, j);
        TreeNode root = new TreeNode(maxPair[1]);
        root.left = constructHelper(nums, i, maxPair[0]);
        root.right = constructHelper(nums, maxPair[0]+1, j);
        return root;
    }

    public int[] findMax(int[] nums, int start, int end){
        int maxVal = Integer.MIN_VALUE;
        int maxi = -1;
        for(int i=start; i<end; i++){
            if(nums[i]>maxVal){
                maxVal = nums[i];
                maxi = i;
            }
        }
        return new int[] {maxi, maxVal};
    }

    
}