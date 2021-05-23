class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> hm = new HashMap<>();
        Set<Integer> hs = new HashSet<>();
        for(int t : arr) {
            hm.put(t,hm.getOrDefault(t,0)+1);
        }
        for(int k : hm.keySet()) {
            if(hs.contains(hm.get(k))) return false;
            hs.add(hm.get(k));
        }
        return true;
    }
}
