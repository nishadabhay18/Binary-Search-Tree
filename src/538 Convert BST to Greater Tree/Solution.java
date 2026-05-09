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
    // TC-> O(n) SC-> O(n)
    public void revInorderTraversal(TreeNode root, int[]sum){
        if(root == null) return;
        revInorderTraversal(root.right, sum);
        root.val += sum[0];
        sum[0] = root.val;
        revInorderTraversal(root.left, sum);
    }
    public TreeNode convertBST(TreeNode root){
        int[] sum = {0};
        revInorderTraversal(root, sum);
        return root;
    }
}