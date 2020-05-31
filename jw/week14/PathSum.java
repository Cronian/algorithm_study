class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        sum = sum - root.val;
        if(sum == 0 && root.left == null && root.right == null) return true;
        return  hasPathSum(root.left,sum) ||  hasPathSum(root.right,sum);
    }
}
