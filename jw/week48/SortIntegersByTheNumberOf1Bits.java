class Solution {
    public int[] sortByBits(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> {
            int ca = a;
            int cb = b;
            int cntA = 0;
            int cntB = 0;
            while(ca>0) {
                if(ca%2 == 1) cntA++;
                ca = ca/2;
            }
            while(cb>0) {
                if(cb%2 == 1) cntB++;
                cb = cb/2;
            }
            if(cntA > cntB) return 1;
            else if (cntA < cntB) return -1;
            else {
                if(a<b) return -1;
                else if(a>b) return 1;
            }
            return 0;
        });
        for(int t : arr) {
            pq.add(t);
        }
        int cnt = 0;
        while(!pq.isEmpty()) {
            arr[cnt++] = pq.poll();
        }
        return arr;
    }
}
