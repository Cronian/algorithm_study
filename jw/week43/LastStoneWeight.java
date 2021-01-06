class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(stones.length,Collections.reverseOrder());
        for(int i : stones) {
            pq.add(i);
        }
        
        while(!pq.isEmpty()) {
            int i = pq.poll();
            int j = 0;
            if(!pq.isEmpty()) {
                j = pq.poll();
                if( i != j) {
                    int tmp = i-j;
                    if(tmp < 0) {
                        tmp = tmp*(-1);
                    }
                    pq.add(tmp);
                }
            } else {
                return i;
            }
        }
        return 0;
    }
}
