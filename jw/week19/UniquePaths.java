class Solution {
    public int uniquePaths(int m, int n) {
        int[][] rs = new int[m][n];
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(i==0 || j ==0) {
                    rs[i][j] = 1;
                } else {
                    rs[i][j] = rs[i-1][j] + rs[i][j-1];
                }
            }
        }
        
        return rs[m-1][n-1];
    }
}
