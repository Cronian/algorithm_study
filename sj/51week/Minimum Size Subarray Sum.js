/**
 * @param {number} target
 * @param {number[]} nums
 * @return {number}
 */
var minSubArrayLen = function(target, nums) {
    
    let left = 0;
 
    let sum =0;
    
    let res = Number.MAX_SAFE_INTEGER;
    
    for(let r = 0; r< nums.length; r++)
        {
            sum += nums[r];
            
            while(sum >= target)
                {
                    res = Math.min(res, r-left +1);
                    
                    sum -= nums[left];
                    left = left +1;
                }
        }
    return res === Number.MAX_SAFE_INTEGER ? 0 : res;
};
