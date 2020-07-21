class Solution {
    public int maxSubArray(int[] nums) {
        int size = nums.length;
        int max_ex = Integer.MIN_VALUE, max_sum = 0;
        for (int i = 0; i < size; i++) 
        { 
            max_sum = max_sum + nums[i]; 
            if (max_ex < max_sum) 
                max_ex = max_sum; 
            if (max_sum < 0) 
                max_sum = 0; 
        } 
        return max_ex; 
    }
}
