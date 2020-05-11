class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        boolean result = true;
        Map<Integer,Integer> hm = new HashMap<>();
        for(int v : arr ) {
            int tmp = hm.getOrDefault(v,0);
            hm.put(v,tmp+1);
        }
        Map<Integer,Integer> rs = new HashMap<>();
        Iterator it = hm.keySet().iterator();
        while(it.hasNext()) {
            // HashMap(hm) Key
            int tmp = (int) it.next();
            // HashMap(hm) Value
            int v =  rs.getOrDefault(hm.get(tmp),0);
            // HashMap(rs) Setting
            rs.put(hm.get(tmp),v+1);
            if(v != 0) {
                result = false;
            }
        }
        return result;
    }
}
