class Solution {
    Map<Integer,List<Integer>> hm;
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        hm = new HashMap<>();
        calc(root,0);
        List<List<Integer>> ls = new ArrayList<>();
        Iterator it = hm.keySet().iterator();
        while(it.hasNext()) {
            ls.add(0,hm.get(it.next()));
        }
        return ls;
    }
    
    public void calc(TreeNode root,int depth) {
        if(root != null) {
            List<Integer> arr = hm.getOrDefault(depth,new ArrayList<Integer>());
            arr.add(root.val);
            hm.put(depth,arr);
            if(root.left != null) calc(root.left,depth+1);
            if(root.right != null) calc(root.right,depth+1);
        }
    }
}
