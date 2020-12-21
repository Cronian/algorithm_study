/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public int depth = 0;
    public int maxDepth(Node root) {
        if(root == null) {
            return 0;
        }
        maxDepth(root,depth);
        return depth;
    }
    
    public void maxDepth(Node nd,int dp) {
        dp += 1;
        if(nd.children.size() == 0) {
            if(depth < dp) {
                depth = dp;
            }
        } else {
            for(int i=0;i<nd.children.size();i++) {
                maxDepth(nd.children.get(i),dp);
            }
        }
    }
}
