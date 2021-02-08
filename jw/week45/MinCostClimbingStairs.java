class Solution {
    
    public int minCostClimbingStairs(int[] cost) {
        int v1 = cost[0];
        int v2 = cost[1];
        for(int i=2;i<cost.length;i++) {
            int tmp = cost[i] + Math.min(v1,v2);
            v1 = v2;
            v2 = tmp;
        }
        return Math.min(v1,v2);
    }
    
}
