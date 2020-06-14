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
    private int sum = 0;
    
    public int sumEvenGrandparent(TreeNode root) {
        checkGP(root, 0, 0); 
        
        return sum;
    }
    
    public void checkGP(TreeNode root, int grandParent, int parent) {
        
        if (parent == 0) {
            if(root.left != null) { 
                checkGP(root.left, 0, root.val);    
            }            
            if(root.right != null) { 
                checkGP(root.right, 0, root.val);    
            }
            
        } else if(grandParent == 0) {
            if(root.left != null) { 
                checkGP(root.left, parent, root.val);    
            }
            
            if(root.right != null) { 
                checkGP(root.right, parent, root.val);    
            }
        } else {            
            if (grandParent % 2 == 0) {
                sum += root.val;
            }

            if(root.left != null) { 
                checkGP(root.left, parent, root.val);    
            }
            
            if(root.right != null) { 
                checkGP(root.right, parent, root.val);    
            }
        }   
    }
}
