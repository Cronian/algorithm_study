class Solution {
    
    static int[][] save;
    static int count;
    static int xMax;
    static int yMax;
        
    public int numIslands(char[][] grid) {
        
        if(grid.length == 0) {
            return 0;
        }
        
        save = new int[grid.length][grid[0].length];
        count = 0;
        xMax = grid.length-1;
        yMax = grid[0].length-1;
        
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                
                if(grid[i][j] == '1' && save[i][j] != 1) {
                    addIsland(grid, i, j);
                }
                
            }
        }
        
        return count;
    }
    
    
    public static void addIsland(char[][] grid, int x, int y) {
        
        
        if(save[x][y] == 0) {
            count++;
            save[x][y] = 1;
        }
        
        if(x + 1 <= xMax  && save[x+1][y] != 1) {
            save[x+1][y] = 1;
            
            if(grid[x+1][y] == '1') {
                addIsland(grid, x+1, y);    
            }
        }
        
        if(y + 1 <= yMax && save[x][y+1] != 1) {
            save[x][y+1] = 1;
            
            if(grid[x][y+1] == '1') {
                addIsland(grid, x, y+1);
            }
        }
        
        if(x - 1 >= 0  && save[x-1][y] != 1) {
            save[x-1][y] = 1;
            
            if(grid[x-1][y] == '1') {
                addIsland(grid, x-1, y);
            }
        }
        
        if(y - 1 >= 0  && save[x][y-1] != 1) {
            save[x][y-1] = 1;
            
            if(grid[x][y-1] == '1') {
                addIsland(grid, x, y-1);
            }
        }
        
        
    }
    
    
    
}
