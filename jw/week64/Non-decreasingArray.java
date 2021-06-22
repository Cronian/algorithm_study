class Solution {
    public boolean checkPossibility(int[] nums) {
        for(int i=1;i<nums.length;i++){
           if(nums[i]<nums[i-1]){
               //modify the nums[i-1] or nums[i] to create nonDecreasing sequence
               int t = nums[i-1];
               nums[i-1] = nums[i];
               if(isNonDecreasing(nums)) return true;
               nums[i-1] = t;
               nums[i] = t;
               return isNonDecreasing(nums);
           }
        }
        return true;
    }
    
    public boolean isNonDecreasing(int[] nums){
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]) return false;
        }
        return true;
    }
}
