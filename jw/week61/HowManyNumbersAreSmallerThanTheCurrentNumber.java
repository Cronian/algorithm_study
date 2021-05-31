class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        Map<Integer,Integer> hm = new HashMap<>();
        
        int size = nums.length;
        for(int i=0;i<size;i++) {
            hm.put(sorted[i],hm.getOrDefault(sorted[i],i));
        }
        for(int i=0;i<size;i++) {
            sorted[i] = hm.get(nums[i]);
        }
        return sorted;
    }
}
