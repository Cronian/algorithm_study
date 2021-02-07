/**
 * @param {string} S
 * @return {number}
 */
var minAddToMakeValid = function(S) {
    
    const res = [];
    
    for(let c of S)
        {
            if(c===')' && res[res.length-1]==='(')
                {
                    res.pop();
                }
            else
                {
                    res.push(c);
                }
        }
    
    return res.length;
    
};
