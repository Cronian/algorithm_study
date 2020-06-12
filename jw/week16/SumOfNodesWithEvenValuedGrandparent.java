class Solution {
    private int sum = 0;
    public int sumEvenGrandparent(TreeNode root) {
        calc(root,0,0);
        return this.sum;
    }
    public void calc(TreeNode tree, int gp,int p) {
        if(tree != null) {
            int tmp = tree.val;
            if(gp != 0 && gp%2 == 0) this.sum += tmp;
            calc(tree.left,p,tmp);
            calc(tree.right,p,tmp);
        }
    }
}
