/**
 * @param {number[][]} isConnected
 * @return {number}
 */
var findCircleNum = function(isConnected) {
    
    const visit = new Set();
    
    let res = 0;
    
    const dfs = (i) => {
        
        for(let j=0; j< isConnected.length; j++)
            {
                if(isConnected[i][j] ===1 && !visit.has(j))
                    {
                        visit.add(j);
                        
                        dfs(j);
                    }
            }
            
        
    }
    
    
    for(let i=0; i<isConnected.length; i++)
        {
            
            if(!visit.has(i))
                {
                    dfs(i);
                    
                    res++;
                }
        }
    
    return res;
};
