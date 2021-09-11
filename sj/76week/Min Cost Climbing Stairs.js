/**
 * @param {number[]} cost
 * @return {number}
 */
var minCostClimbingStairs = function(cost) {
    
    let min1 = cost[0];
    
    let min2 = cost[1];
    
    if (cost.length === 1) return 0;
    
    if (cost.length === 2) return Math.min(cost[0], cost[1]);
    
    
    for(let n = 2; n<cost.length; n++)
        {
            const curr = cost[n] + Math.min(min1, min2);
            
            min2 = min1;
            
            min1 = curr;
            
        }
    
    return Math.min(min1, min2);
    
};
