class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {        
        int length = grid.length;
        
        if(grid[0][0] == 1 || grid[length-1][length-1] == 1) {
            return -1;
        }     
        
        Queue<int[]> queue = new LinkedList<>();
        
        queue.offer(new int[]{0,0});
        grid[0][0] = 1;
                  
        int minDist = 0;
        while(!queue.isEmpty()) {
            minDist++;
            int size = queue.size();
            for(int k = 0; k < size; k++) {
                int[] cell = queue.poll();
                
                int r = cell[0];
                int c = cell[1];
                                
                if(r == length - 1 && c == length - 1) {
                    return minDist;
                }
                
                for(int i = -1; i <= 1; i++) {
                    for(int j = -1; j <= 1; j++) {
                        if(i == 0 && j == 0) {
                            continue;
                        }
                        
                        int x = i + r;
                        int y = j + c;
                        if(isBound(grid, x, y)) {
                            grid[x][y] = 1;
                            queue.offer(new int[]{x, y});
                        }
                    }
                }
                
            }
        }
        
        return -1;
    }    
    
    boolean isBound(int[][] grid, int r, int c) {
        return !(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 1);
    }
}
