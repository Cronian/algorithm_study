var permute = function(nums) {
    
    
    let res = [];
    
    const find = (arr, nums) =>
    {
        // !== 0 이랑 뭐가다르지...?
       if(!nums.length)
           {
                res.push(arr);
           }
        
        for(let i=0; i<nums.length; i++)
            {
                find([...arr,nums[i]], [...nums.slice(0,i), ...nums.slice(i+1)]);
            }
    }
    
    find([],nums);
    
   
    
    return res;
};
