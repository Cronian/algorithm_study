class Solution {
    public int uniquePaths(int m, int n) {
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++) {
            int tmpI = i-1;
            for(int j=0;j<n;j++) {
                int tmpJ = j-1;
                if(tmpI < 0 || tmpJ < 0) arr[i][j] = 1;
                else {
                    arr[i][j] = arr[tmpI][j] + arr[i][tmpJ];
                }
            }
        }
        return arr[m-1][n-1];
    }
}
