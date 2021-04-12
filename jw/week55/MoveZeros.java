class Solution {
    public void moveZeroes(int[] nums) {
        int idx = 0;
        int size = nums.length;
        for(int i=0;idx<size;i++) {
            if(i>=size) nums[idx++] = 0;
            else if(nums[i] != 0) nums[idx++] = nums[i];
        }
    }
}
