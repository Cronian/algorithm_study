class Solution {
    public int shipWithinDays(int[] weights, int D) {
        int sum = 0;
        int maxOne = 0;
        for(int i=0;i<weights.length;i++) {
            sum += weights[i];
            if(maxOne < weights[i]) maxOne = weights[i];
        }
        int minAvg = sum/D > maxOne ? sum/D : maxOne;
        boolean flag = true;
        while(flag) {
            int cnt = 1;
            int innerSum = 0;
            flag = false;
            for(int i=0;i<weights.length;i++) {
                int preSum = innerSum+weights[i];
                if(preSum <= minAvg) {
                    innerSum += weights[i];
                } else  {
                    innerSum = weights[i];
                    cnt++;
                    if(cnt > D) {
                        flag = true;
                        break;
                    }
                }
            }
            
            if(flag) {
                minAvg++;
            }
        }
        return minAvg;
    }
}
