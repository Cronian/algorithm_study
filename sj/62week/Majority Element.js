/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    
    let result = {};
    
    let len = Math.floor(nums.length/ 2);
    
    for(let i=0; i<nums.length; i++)
    {
        result[nums[i]] = result[nums[i]]+1 || 1;
        
        if(result[nums[i]] > len) {
            return nums[i];
        }
    }
    
};
