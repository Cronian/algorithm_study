class Solution {
    public int xorOperation(int n, int start) {
        
        int[] nums = new int[n];
        
        int result = 0;

        nums[0] = start;
        
        for(int i = 1 ; i < n; i++) {
            nums[i] = nums[0] + i *2;
        }
        
        for(int i = 0 ; i < n; i++) {
            result ^= nums[i];
        }
        
        return result;
        
        
    }
}
