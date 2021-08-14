/**
 * @param {number} n
 * @return {number}
 */
var arrangeCoins = function(n) {    
    let res = 0;
    
    while(res <= n)
        {
            n-= res;
            res++;
        }
    
    return res-1;
};
