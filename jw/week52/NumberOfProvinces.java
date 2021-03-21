class Solution {
    Set<Integer> hs = new HashSet<>();
    public int findCircleNum(int[][] isConnected) {
        int rs = 0;
        for(int i=0;i<isConnected.length;i++) {
            if(calc(isConnected,i)) rs++;
        }
        return rs;
    }
    
    public boolean calc(int[][] arr,int city) {
        boolean rs = true;
        if(hs.contains(city)) rs = false;
        else {
            hs.add(city);
            for(int i=0;i<arr.length;i++) {
                if(!hs.contains(i) && arr[city][i] == 1) calc(arr,i);
            }
        }
        return rs;
    }
}
