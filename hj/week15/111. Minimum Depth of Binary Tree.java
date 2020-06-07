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
    private int min = Integer.MAX_VALUE;

    public int minDepth(TreeNode root) {

        if(root == null) return 0;
        
        getLength(root, 1);
        
        return min;
    }
    
    
    public void getLength(TreeNode tree, int length) {
        
        if(length >= min || tree == null) return;
        
        if(tree.left == null && tree.right == null && min > length) {
            min = length;
        }
        
        getLength(tree.left, length+1);
        getLength(tree.right, length+1);
        
    }
}
