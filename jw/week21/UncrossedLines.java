class Solution {
    public int maxUncrossedLines(int[] A, int[] B) {
        int lenA = A.length;
        int lenB = B.length;
        int[][] dp = new int[lenA + 1][lenB + 1];
        for (int i = 1; i <= lenA; i++){
            for (int j = 1; j <= lenB; j++){
                if (A[i - 1] == B[j - 1]){
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[lenA][lenB];
    }
}
/*
class Solution {
    private int sizeA;
    private int sizeB;
    private int maxCount;
    public int maxUncrossedLines(int[] A, int[] B) {
        this.sizeA = A.length;
        this.sizeB = B.length;
        this.maxCount = 0;
        calc(A,B,0,-1,0,new ArrayList<Integer>());
        return maxCount;
    }
    
    private void calc(int[] A,int[] B,int idx,int minB,int count,List<Integer> out) {
        
        if(idx >= this.sizeA || minB+1 >= this.sizeB ) {
            if(maxCount < count) this.maxCount = count;
        }
        else {
            int sIdx = -1;
            if(!out.contains(A[idx])) {
                for(int i=minB+1;i<this.sizeB;i++) {
                    if(A[idx] == B[i]) {
                        sIdx = i;
                        break;
                    } 
                }
                if(sIdx != -1) {   
                    List<Integer> nout = new ArrayList<>(out);
                    calc(A,B,idx+1,sIdx,count+1,nout);
                }
                else out.add(A[idx]);
            }
            calc(A,B,idx+1,minB,count,out);
        }
    }
}
*/
