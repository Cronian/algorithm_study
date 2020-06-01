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
    
    private int goal;
    private int resultNum;
    
    public boolean hasPathSum(TreeNode root, int sum) {
        this.resultNum = 0;
        if(root == null) {
            return false;   
        }
        
        this.goal = sum;
        
        getSum(root, 0);
        
        if(resultNum == 1) {
            System.out.println("1");
            return true;
        }
        else {
            System.out.println("0");
            return false;
        }
        
    }
    
    
    public void getSum(TreeNode tree, int sum) {
        
        sum = sum + tree.val;
        
        if(tree.left != null || tree.right != null) {
            
            if(tree.left != null) {
                getSum(tree.left, sum);                
            }
            
            if(tree.right != null) {
                getSum(tree.right, sum);
            }            
        } else if(this.goal == sum) {         
            System.out.println("aa");
            this.resultNum = 1;
        }
        
        
    }
}
