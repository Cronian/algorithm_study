/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number}
 */
var distributeCoins = function(root) {
    
    let res = 0;
    
    const Tree = node => {
        
        if(!node)
            {
                return 0;
            }
        
        const left = Tree(node.left);
        const right = Tree(node.right);
        
        res += Math.abs(left) + Math.abs(right);
        
        return left + right + node.val - 1;
        
    
    }
    
    Tree(root);
    
    return res;
};
