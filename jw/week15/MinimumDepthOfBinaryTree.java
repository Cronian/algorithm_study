class Solution {
    int min = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        calc(root,1);
        return min;
    }
    
    public void calc(TreeNode root,int depth) {
        if(root.left != null) calc(root.left,depth+1);
        if(root.right != null) calc(root.right,depth+1);
        
        if(root.left == null && root.right == null) {
            if(depth < min) min = depth;
        }
    }
}
