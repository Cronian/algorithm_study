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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        return calc(root,1);
    }
    
    public int calc(TreeNode tree,int count) {
        if(tree.left == null && tree.right == null) return count;
        int left = tree.left != null ? calc(tree.left,count+1) : Integer.MAX_VALUE;
        int right = tree.right != null ? calc(tree.right,count+1) : Integer.MAX_VALUE;
        return Math.min(left,right);
    }
}
