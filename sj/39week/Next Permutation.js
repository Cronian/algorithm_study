/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var nextPermutation = function(nums) {
    
    for(let i=nums.length-1; i>=0; i--)
        {
            if(nums[i] < nums[i+1])
                {
                    //// 2            //1
                    const max = maxNum(i);
                    //swap
                    [nums[i], nums[max]] = [nums[max], nums[i]];

                    reverse(i+1);

                    return ;
                }
        }
    
    nums.reverse() 
    
    function maxNum(now)
    {
        for(let i=nums.length-1; i>now; i--)
            {
                if(nums[i]>nums[now])
                    {
                        return i;
                    }
            }
    }
    
    function reverse(index)
    {
        let i = index;
        let j = nums.length-1;
        
        while(i<j)
            {
                 [nums[i], nums[j]] = [nums[j], nums[i]];
                 i++;
                 j--;
            }
    }
};
