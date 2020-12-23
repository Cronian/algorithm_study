/**
 * @param {number[][]} grid
 * @return {number}
 */
var shortestPathBinaryMatrix = function(grid) {
    
    let res = 1;
    
    const m = grid.length || 0
    
    const n = m && grid[0].length || 0
    
    let q = [[0,0]];
    
    const dir = [[-1, 0], [1, 0], [0, 1], [0, -1], [-1, 1], [-1, -1], [1, 1], [1, -1]];
    
    if(m===0 || n === 0) return -1;
    
    if(grid[0][0]===1) return -1;
    
    while(q.length)
        {
            const size = q.length;
            
            
            for(let i =0; i< size; i++)
                {
                    const [x,y] = q.shift();
                    
                    if(x===m-1 && y===n-1)
                    {
                        return res;
                    }
                    
                    for(let d of dir)
                        {
                            
                            let newX = x+d[0];
                            let newY = y+d[1];
                            
                            if((0 <= newX && 0 <= newY && newX < m && newY < n) && grid[newX][newY]===0)
                                {
                                  
                                    grid[newX][newY] = 1;
                                    q.push([newX, newY])
                                }
                        }
                }
            
            res += 1;
        }
    
    
    
    return -1;
};

