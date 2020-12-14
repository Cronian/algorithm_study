/**
 * @param {number[]} candidates
 * @param {number} target
 * @return {number[][]}
 */
var combinationSum = function(candidates, target) {
  
    let res = [];

    
    const find = (target, path, index) => {
        
        if(target < 0)
        {
            return;
        }
        
        if(target === 0)
        {
            res.push([...path]);
            return;
        }
        
        for(let i=index; i<candidates.length; i++)
            {
                find(target-candidates[i], [...path, candidates[i]], i);
            }
        
    }
    
    
    find(target,[],0);
    
    return res;
    
    
    
};
