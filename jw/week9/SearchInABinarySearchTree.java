class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode rs = null;
        if(root == null) {
            return null;
        } else {
            if(root.val == val) rs = root;
            else if(root.val > val) rs = searchBST(root.left,val);
            else rs = searchBST(root.right,val);
        }
        return rs;
    }
    
}
