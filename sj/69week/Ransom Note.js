/**
 * @param {string} ransomNote
 * @param {string} magazine
 * @return {boolean}
 */
var canConstruct = function(ransomNote, magazine) {
        
    let map = {};
    
    for(let m of magazine)
        {
            if(!map[m])
                {
                    map[m] = 0;
                }
            map[m]++;
        }
    
    for(let r of ransomNote)
        {
            if(!map[r])
                {
                    return false;
                }
            
            map[r]--;
        }
    
    return true;
};
