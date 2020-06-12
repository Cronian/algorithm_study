class Solution {
    public int[] shuffle(int[] nums, int n) {
        int size = nums.length;
        int[] rs = new int[size];
        if(size <= 2) return nums;
        size /= 2;
        for(int i=0;i<size;i++) {
            rs[2*i] = nums[i];
            rs[2*i+1] = nums[size+i];
        }
        return rs;
    }
}
