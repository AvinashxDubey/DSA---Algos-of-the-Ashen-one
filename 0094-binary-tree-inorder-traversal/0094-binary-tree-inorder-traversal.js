/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[]}
 */
var inorderTraversal = function(root) {
    let nums = [];
    inorderTraversalHelper(root, nums);
    return nums;
};

var inorderTraversalHelper = (root, nums) => {
    if(root==null) return;

    inorderTraversalHelper(root.left, nums);
    nums.push(root.val);
    inorderTraversalHelper(root.right, nums);
}