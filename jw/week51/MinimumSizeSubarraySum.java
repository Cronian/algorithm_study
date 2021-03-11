class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int size = nums.length;
        int s = 0;
        int e = 0;
        int sum = nums[0];
        int min = Integer.MAX_VALUE;
        
        while(s < size && e < size) {
            if(sum < target) {
                e+=1;
                if(e == size ) break;
                sum += nums[e];
            } else if(sum > target) {
                min = Math.min(e-s+1,min);
                if(e == s) {
                    e+=1;
                    if(e == size ) break;
                    sum += nums[e];
                } else {
                    s+=1;
                    sum -= nums[s-1];
                }
            } else {
                min = Math.min(e-s+1,min);
                e+= 1;
                if(e == size ) break;
                sum += nums[e];
            }
        }
        
        if(min == Integer.MAX_VALUE) min = 0;
        
        return min;
    }
}
