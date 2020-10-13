import java.util.*;

class Solution {
    boolean rs = false;
    int sizeH = 0;
    int sizeW = 0;
    int[][] visit = null;
    public boolean searchMatrix(int[][] matrix, int target) {
       this.sizeH = matrix.length;
        if(sizeH == 0) return rs;
        this.sizeW = matrix[0].length;
        if(sizeW == 0) return rs;
        visit = new int[sizeH][sizeW];
        find(matrix,0,0,target);
        return rs;
        
    }
    
    public void find(int[][] mx,int h,int w,int target) {
        if(visit[h][w] != 1) {
            visit[h][w] = 1;
            if(h < sizeH && w < sizeW) {
                if(mx[h][w] == target) this.rs = true;
                else if(mx[h][w] < target) {
                    if(h+1 < sizeH ) find(mx,h+1,w,target);
                    if(w+1 < sizeW) find(mx,h,w+1,target);
                }
            }
        }
    }
}

/*
class Solution {
     public boolean searchMatrix(int[][] matrix, int target) {
     완전탐색, Stream으로 병렬처리
        return       Arrays.asList(matrix).parallelStream()
                    .flatMapToInt(Arrays::stream)
                    .filter(p -> p == target)
                    .limit(1)
                    .max()
                    .orElse(Integer.MIN_VALUE) != Integer.MIN_VALUE ? true : false;      
     }
}
*/
