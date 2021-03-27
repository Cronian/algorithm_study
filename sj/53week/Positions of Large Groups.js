/**
 * @param {string} s
 * @return {number[][]}
 */
var largeGroupPositions = function(s) {
    
    let res = [];
    
    let j =0;
    
    for(let i=0; i<s.length; i++)
        {
            
            if(s[i] !== s[i+1])
                {
                    if(i-j+1 >2) {
                        res.push([j,i]);
                    }
                    j = i+1;
                }
            
        }
    
    return res;
    
};
