class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->{
            if(a.val > b.val) return -1;
            else if( a.val < b.val) return 1;
            else return 0;
        });
        Map<Integer,Integer> hm = new HashMap<>();
        for(int t : barcodes) {
            hm.put(t,hm.getOrDefault(t,0)+1);
        }
        for(Integer key : hm.keySet()) {
            pq.add(new Pair(key,hm.get(key)));
        }
        
        int ex = 0;
        int idx = 0;
        while(!pq.isEmpty()) {
            Pair p1 = pq.poll();
            if(p1.key == ex) {
                Pair p2 = pq.poll();
                barcodes[idx++] = p2.key;
                p2.val -= 1;
                if(p2.val > 0) pq.add(p2);
            } 
            barcodes[idx++] = p1.key;
            p1.val -= 1;
            if(p1.val > 0) pq.add(p1);
            ex = p1.key;
        }
        
        return barcodes;
    }
}
class Pair {
    public int key;
    public int val;
    public Pair(int a,int b) {
        this.key = a;
        this.val = b;
    }
}
