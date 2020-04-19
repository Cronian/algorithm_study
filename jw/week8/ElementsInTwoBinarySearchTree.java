class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        addElement(pq,root1);
        addElement(pq,root2);
        List<Integer> rs = new ArrayList<>();
        while(!pq.isEmpty()) {
            rs.add(pq.poll());
        }
        return rs;
    }
    
    public void addElement(PriorityQueue<Integer> pq,TreeNode node) {
        if( node != null) {
            pq.add(node.val);
            if(node.left != null) {
                addElement(pq,node.left);
            }
            if(node.right != null) {
                addElement(pq,node.right);
            }
        }
    }
}
