class Solution {
    public int removeDuplicates(int[] nums) {
        int ex = Integer.MIN_VALUE;
        int cal = 0;
        int idx = 0;
        for(int t : nums) {
            if(ex == t) {
                if(cal < 1) {
                    nums[idx] = t;
                    idx++;
                } 
                cal++;
            } else {
                cal = 0;
                ex = t;
                nums[idx] = t;
                idx++;
            }
        }
        
        return idx;
    }
}
