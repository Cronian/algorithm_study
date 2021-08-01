class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int[] xFlag = {1,0,-1,0};
        int[] yFlag = {0,1,0,-1};
        int x = 0;
        int y = 0;
        int flag = 0;
        int sizeh = matrix.length;
        int sizew = matrix[0].length;
        int[][] visit = new int[sizeh][sizew];
        List<Integer> rs = new ArrayList<>();
        while(rs.size() < sizew*sizeh) {
            
            // visit
            visit[y][x] = 1;
            rs.add(matrix[y][x]);
            if(x+xFlag[flag] >= sizew || x+xFlag[flag] < 0 || y+yFlag[flag] >= sizeh || y+yFlag[flag] < 0) {
                
                flag = (flag+1)%4;
            } else if(visit[y][x+xFlag[flag]] == 1 && visit[y+yFlag[flag]][x] == 1) {
                
                flag = (flag+1)%4;
            }
            x = x+xFlag[flag];
            y = y+yFlag[flag];
        }
        return rs;
    }
}
