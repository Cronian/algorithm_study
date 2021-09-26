/**
 * @param {string[]} words
 * @param {string} order
 * @return {boolean}
 */
var isAlienSorted = function(words, order) {
    
    let map = new Map();
    
    for(let i=0; i< order.length; i++)
        {
            map.set(order[i],i);
        }
    
    for(let i=1; i<words.length; i++)
        {
            let prev = words[i-1];
            let cur = words[i];
            
            if(map.get(prev[0]) > map.get(cur[0]))
                {
                    return false;
                }
            else if(prev[0] === cur[0])
                {
                    let p =0;
                    
                    while(prev[p]=== cur[p] && p < Math.max(cur.length, prev.length))
                        {
                            p++;
                        }
                    
                    if(map.get(prev[p]) >= 0 && !map.get(cur[p]) || map.get(prev[p]) > map.get(cur[p]))
                        {
                            return false;
                        }
                }
        }
    
    return true
    
};
