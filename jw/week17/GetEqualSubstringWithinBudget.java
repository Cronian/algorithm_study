class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int size = s.length();
        int[] cost = new int[size];
        int sum = 0;
        // Get CostArray
        for(int i=0;i<size;i++) {
            int tmp = (int)s.charAt(i) - (int)t.charAt(i);
            //Get Absolute Value
            if(tmp < 0) tmp *= -1;
            sum += tmp;
            cost[i] = sum;
        }
        
        if(size == 1) {
            if (cost[0] <= maxCost) return 1;
            else return 0;
        }
        
        int f = 0;
        int h = 0;
        int max = 0;
        while(f < size) {
            int tmp = 0;
            int tmpLength = f-h+1;
            if(f != h) {
                if(h-1 >= 0) tmp = cost[f]-cost[h-1];
                else tmp = cost[f];
               
                if(tmp <= maxCost) {
                    f++;
                    if(max < tmpLength) max = tmpLength;
                } else {   
                    h++;
                }
            } else {
                if(f == 0) tmp = cost[f];
                else tmp = cost[f] - cost[f-1];
                f++;
                if(tmp <= maxCost) {
                    if(max < tmpLength) max = tmpLength;
                }
            }
            
        }
        
        return max;
    }
}
