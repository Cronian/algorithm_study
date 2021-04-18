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
    boolean rs = true;
    public boolean isSymmetric(TreeNode root) {
        calc(root.right,root.left);
        return rs;
    }
    
    public void calc(TreeNode r,TreeNode l) {
        if(r != null && l != null) {
            if(r.val != l.val) rs = false;
            else {                
                    calc(r.right,l.left);
                    calc(r.left,l.right);
            }
        } else if ( r== null && l == null) {
        } else if (r == null || l == null) rs = false;
    }
    
}
