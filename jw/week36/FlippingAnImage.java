class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int sizeCol = A[0].length;
        int sizeRow = A.length;
        int[][] rs = new int[sizeRow][sizeCol];
        
        for(int i=0;i<sizeRow;i++) {
            for(int j=0;j<sizeCol;j++) {
                int t = A[i][sizeRow-j-1];
                rs[i][j] = t == 0 ? 1 : 0;
            }
        }
        return rs;
    }
}
