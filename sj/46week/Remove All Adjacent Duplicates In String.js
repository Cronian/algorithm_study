/**
 * @param {string} S
 * @return {string}
 */
var removeDuplicates = function(S) {
    
    const res = [];
    
    for (const c of S)
        {
            res[res.length-1]=== c ? res.pop() : res.push(c);
        }
    
    return res.join('');
    
};
