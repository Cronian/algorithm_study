class Solution {
    public int orangesRotting(int[][] grid) {
        int sizeX = grid[0].length;
        int sizeY = grid.length;
        int frash = 0;
        Queue<int[]> qu = new LinkedList<>();
        for(int i=0;i<sizeY;i++) {
            for(int j=0;j<sizeX;j++) {
                if(grid[i][j] == 2) {
                    int[] tmp = {i,j};
                    qu.add(tmp);
                } else if(grid[i][j] == 1) frash++;
            }
        }
        int time = 0;
        while(!qu.isEmpty()) {
            int size = qu.size();
            for(int i=0; i<size;i++) {
                int[] tg = qu.poll();
                int x = tg[1];
                int y = tg[0];
                if(y+1 < sizeY) {
                    if(grid[y+1][x] == 1) {
                        int[] tmp = {y+1,x};
                        qu.add(tmp);
                        grid[y+1][x] = 2;
                        frash--;
                    }
                }
                if(y-1 >= 0) {
                    if(grid[y-1][x] == 1) {
                        int[] tmp = {y-1,x};
                        qu.add(tmp);
                        grid[y-1][x] = 2;
                        frash--;
                    }
                }
                if(x+1 < sizeX) {
                    if(grid[y][x+1] == 1) {
                        int[] tmp = {y,x+1};
                        qu.add(tmp);
                        grid[y][x+1] = 2;
                        frash--;
                    }
                }
                if(x-1 >= 0) {
                    if(grid[y][x-1] == 1) {
                        int[] tmp = {y,x-1};
                        qu.add(tmp);
                        grid[y][x-1] = 2;
                        frash--;
                    }
                }
            }
            time++;
        }
        if (time > 0) time -= 1;  
        return frash == 0 ? time : -1;
    }
}
