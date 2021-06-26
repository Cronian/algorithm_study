/**
 * @param {character[][]} board
 * @return {boolean}
 */
var isValidSudoku = function(board) {
    
    for(let i=0; i<9; i++)
        {
            let row = new Set();
            let col = new Set();
            let box = new Set();
            
            for(let j=0; j<9; j++)
                {
                    let now_row = board[i][j];
                    let now_col = board[j][i];
                    let now_box = board[3*Math.floor(i/3)+Math.floor(j/3)][3*(i%3)+(j%3)];
                    
                    if(now_row != '.')
                        {
                            if(row.has(now_row))
                                {
                                    return false;
                                }
                            row.add(now_row);
                        }
                    
                    if(now_col != '.')
                        {
                            if(col.has(now_col))
                                {
                                    
                                    return false;
                                }
                            
                            col.add(now_col);
                        }
                    
                    if(now_box != '.')
                        {
                            if(box.has(now_box))
                                {
                                    return false;
                                }
                            
                            box.add(now_box);
                        }
                }
            
        }
    
    return true;
};
