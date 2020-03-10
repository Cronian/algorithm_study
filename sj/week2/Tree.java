// 2주차 트리 이지

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
    public boolean isSymmetric(TreeNode root) {
        
        //root가 null이면 할 필요 없음 
        if(root == null) return true;      
        
        return compareNode(root.left , root.right);
    }
        
        public boolean compareNode(TreeNode left, TreeNode right) {
      
            //자식 노드가 둘 다 없으면 무조건 true 이게 끝이니까.
            if(left == null && right == null) return true;
            //둘중 하나만 없으면 false
            if(left == null || right == null) return false;
            //두개 값이 다르면 false
            if(left.val != right.val) return false;
            
            // 재귀함수로 바꿈
            return compareNode(left.right , right.left) && compareNode(left.left,right.right);
        
            
    }
}
//while 문으로 하려다가 바꿈
