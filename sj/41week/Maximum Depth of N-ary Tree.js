/**
 * // Definition for a Node.
 * function Node(val,children) {
 *    this.val = val;
 *    this.children = children;
 * };
 */

/**
 * @param {Node} root
 * @return {number}
 */
var maxDepth = function(root) {
    
    let res = 0;
    
    if(!root)
        {
            return 0;
        }
    
    for(let child of root.children )
        {
            res = Math.max(res,maxDepth(child));
        }
  
    return res+1;
};
