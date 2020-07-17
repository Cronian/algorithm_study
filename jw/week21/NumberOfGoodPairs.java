class Solution {
    public int numIdenticalPairs(int[] nums) {
        int rs = 0;
        Map<Integer,Integer> hm = new HashMap<>();
        for(int tmp : nums) {
            hm.put(tmp,hm.getOrDefault(tmp,0)+1);
        }
        Iterator it = hm.keySet().iterator();
        while(it.hasNext()) {
            int key =(int) it.next();
            int val = hm.get(key);
            if(val > 1) {
                rs +=val*(val-1)/2;
            }
        }
        return rs;
    }
}
