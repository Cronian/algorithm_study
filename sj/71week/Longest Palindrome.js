/**
 * @param {string} s
 * @return {number}
 */
var longestPalindrome = function(s) {
    
    let count = 0;
  
    let res = new Set();
    
    for(let i=0; i<s.length; i++)
        {
            if(res.has(s[i]))
                {
                    count += 2;
                    res.delete(s[i]);
                }
                else
                    {
                       res.add(s[i]);
                    }

        }
    
    return count + (res.size > 0 ? 1 : 0);
    
    
};
