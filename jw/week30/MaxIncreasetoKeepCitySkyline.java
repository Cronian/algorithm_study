class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int tMax = grid.length;
        int rMax = grid[0].length;
        int[] tMaxArr = new int[tMax];
        int[] rMaxArr = new int[rMax];
        for(int i=0;i<tMax;i++) {
            for(int j=0;j<rMax;j++) {
                if(grid[i][j] > tMaxArr[j]) tMaxArr[j] = grid[i][j];
                if(grid[i][j] > rMaxArr[i]) rMaxArr[i] = grid[i][j];
            }
        }
        
        int sum = 0;
        for(int i=0;i<tMax;i++) {
            for(int j=0;j<rMax;j++) {
                sum += Math.min(tMaxArr[j],rMaxArr[i]) - grid[i][j];
            }
        }
        return sum;
    }
    
}
