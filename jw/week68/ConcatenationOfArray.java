class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int[] rs = new int[size*2];
        for(int i=0;i<size;i++) {
            rs[i]=nums[i];
            rs[i+size]=nums[i];
        }
        return rs;
    }
}
