/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
  
    if(nums.length ===0)
        {
            return nums.length;
        }
    
    let index =0;
    let cnt = 1;
    
    
    for(let i=1; i<nums.length; i++)
        {
            if(nums[i] == nums[index])
                {
                    cnt++;
                }
            else
                {
                    cnt = 1;
                }
            
            if(cnt <=2)
                {
                    index++;
                }
            
            nums[index] = nums[i];
        }
    
    return index+1;
};
