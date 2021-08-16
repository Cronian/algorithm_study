class Solution {
    public int findPeakElement(int[] nums) {
        int st = 0;
        int size = nums.length-1;
        int ed = size;
        int idx = size/2;
        while(true) {
            if( idx == ed) {
                    return idx;
                }
            if(nums[idx] < nums[idx+1]) {
                st= idx;
                idx = idx + (ed-st+1)/2;
            } else {
                if(idx > 0 ) {
                    if(nums[idx] > nums[idx-1]){
                        return idx;
                    } 
                } else {
                    return 0;
                }
                
                ed = idx;
                idx = idx - (ed-st+1)/2;
            }
            
        }
        
    }
}
