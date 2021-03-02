/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    
    let max = -Number.MAX_VALUE;
    
    let temp = 0;
    
    for(let i=0; i<nums.length; i++)
        {
            temp = Math.max(temp+nums[i], nums[i]);
            
            max = Math.max(max,temp);
        }
    
    return max
};
