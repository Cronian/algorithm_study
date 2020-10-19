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
    List<Integer> IOls = null;
    List<Integer> Ols = null;
    public void recoverTree(TreeNode root) {
        IOls = new ArrayList<>();
        calc(root,-1,"");
        Ols = new ArrayList<>(IOls);
        Collections.sort(IOls);
        replaceTree(root);
    }
    
    public void calc(TreeNode nd,int ex,String div) {
        if(ex != -1 && !div.equals("")) {
            int idx = 0;
            if(div.equals("L")) idx = IOls.indexOf(ex);
            else idx = IOls.indexOf(ex)+1;
            IOls.add(idx,nd.val);
            
        } else {
            IOls.add(nd.val);
        }
        if(nd.left != null) calc(nd.left,nd.val,"L");
        if(nd.right != null) calc(nd.right,nd.val,"R");
    }
    
    public void replaceTree(TreeNode nd) {
        int idx = Ols.indexOf(nd.val);
        if(IOls.get(idx) != Ols.get(idx) ) {
            nd.val = IOls.get(idx);
        }
        if(nd.left != null) replaceTree(nd.left);
        if(nd.right != null) replaceTree(nd.right);
    }
    
}
