class Solution {
    public int countServers(int[][] grid) {
        Map<Integer,Integer> xAxis = new HashMap<>();
        Map<Integer,Integer> yAxis = new HashMap<>();
        int sizeX = grid[0].length;
        int sizeY = grid.length;
        for(int i=0;i<sizeY;i++) {
            for(int j=0;j<sizeX;j++) {
                if(grid[i][j] == 1) {
                    xAxis.put(i,xAxis.getOrDefault(i,0)+1);
                    yAxis.put(j,yAxis.getOrDefault(j,0)+1);
                }
            }
        }
        
        int cnt = 0;
        Iterator it = xAxis.keySet().iterator();
        List<Integer> lsY = new ArrayList<>();
        List<Integer> lsX = new ArrayList<>();
        while(it.hasNext()) {
            int key = (int)it.next();
            if(xAxis.get(key) >= 2) {
                cnt += xAxis.get(key);
                lsY.add(key);
            }
        }
        it = yAxis.keySet().iterator();
        while(it.hasNext()) {
            int key = (int) it.next();
            if(yAxis.get(key) >= 2) {
                cnt += yAxis.get(key);
                lsX.add(key);
            }
        }
        for(int i=0;i<lsY.size();i++) {
            int y = lsY.get(i);
            for(int j=0;j<lsX.size();j++){
                int x = lsX.get(j);
                if(grid[y][x] == 1) cnt--;
            }
        }
        return cnt;
    }
}
