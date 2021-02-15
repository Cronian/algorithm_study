class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Map<Integer,Integer> hm = new HashMap<>();
        int cnt = 0;
        for(int t1 : arr1) {
            int div = hm.getOrDefault(t1,-1);
            if(div == -1) {
                boolean b = false;
                for(int t2 : arr2) {
                    int tmp = t1-t2 < 0 ? t2-t1 : t1-t2;
                    if(tmp <= d) {
                        b = true;
                        break;
                    }
                }
                if(b) hm.put(t1,0);
                else {
                    hm.put(t1,1);
                    cnt++;
                }
            } else {
                if(div == 1) cnt++;
            }
        }
        return cnt;
    }
}
