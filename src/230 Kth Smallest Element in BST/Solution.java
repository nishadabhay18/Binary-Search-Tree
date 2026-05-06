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
    // TC-> O(n) SC-> O(n)+O(h)
    public void inorderTraversal(TreeNode root, ArrayList<Integer> list){
        if(root == null) return;
        inorderTraversal(root.left, list);
        list.add(root.val);
        inorderTraversal(root.right, list);
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        inorderTraversal(root, list);
        for(int i = 0; i<list.size(); i++){
            if(i == k-1) return list.get(i);
        }
        return 0;
    }
}