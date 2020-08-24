class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] rs = new int[nums1.length];
        Map<Integer,Integer> hm = new HashMap<>();
        int size = nums2.length;
        for(int i=0;i<size;i++) {
            hm.put(nums2[i],i);
        }
        int cnt = 0;
        for(int t : nums1) {
            int r = -1;
            for(int i=hm.get(t);i<size;i++){
                if(t < nums2[i]) {
                    r = nums2[i];
                    break;
                }
            }
            rs[cnt++] = r;
        }
        return rs;
    }
}
