class Solution {
    public int searchInsert(int[] nums, int target) {
        int idx = 0;
        int size = nums.length;
        for(;idx<size;idx++) {
            if(nums[idx] >= target) {
                return idx;
            }
        }
        return idx;
    }
}
