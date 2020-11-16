class Solution {
    public int longestSubarray(int[] nums) {
        List<Integer> zPoint = new ArrayList<>();
        int numSize = nums.length;
        zPoint.add(0);
        for(int i=0;i<numSize;i++) {
            if(nums[i] == 0) {
                zPoint.add(i+1);
            }
        }
        zPoint.add(numSize+1);
        int size = zPoint.size();
        int max = 0;
        if(size == 2 || size == 3) return numSize-1;
        else {
            int s=0;
            int e=2;
            while(e < size) {
                int ar = zPoint.get(e)-zPoint.get(s) - 2;
                max = max > ar ? max : ar;
                s++;
                e++;
            }
        }
        return max;
    }
}
