class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> rs = new ArrayList<>();
        for(int n1 : nums1) {
            if(map.getOrDefault(n1,0) > 0) {
                map.put(n1,map.get(n1)+1);
            } else {
                map.put(n1,1);
            }
        }
        
        for(int n2 : nums2) {
            if(map.getOrDefault(n2,0) > 0) {
                rs.add(n2);
                map.put(n2,map.get(n2)-1);
            }
        }
        
        int[] result = new int[rs.size()];
        for(int i=0;i<rs.size();i++) {
            result[i] = rs.get(i);
        }
        
        return result;
        
    }
}
