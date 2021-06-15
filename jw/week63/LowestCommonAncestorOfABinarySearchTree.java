/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int cnt = 0;
        TreeNode nd = root;
        if(root.val == p.val) return p;
        else if(root.val == q.val) return q;
        else {
            if(root.val > p.val) cnt++;
            if(root.val > q.val) cnt++;
            if(cnt == 1) return root;
            if(cnt == 2) nd = root.left;
            else if(cnt == 0) nd = root.right;
        }
        return lowestCommonAncestor(nd,p,q);
        
    }
}
