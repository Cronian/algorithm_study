class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character,Integer> hm = new HashMap<>();
        PriorityQueue<Store> pq = new PriorityQueue<>(
            (a,b) -> {
                int aE = a.getExist();
                int bE = b.getExist();
                if(aE > bE) return -1;
                else if( aE < bE) return 1;
                return 0;
            }
        );
        for(char c : tasks) {
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        
        for(char key : hm.keySet()) {
            pq.add(new Store(key,hm.get(key)));
        }
        int cnt = 0;
        List<Character> inArr = new ArrayList<>();
        while(!pq.isEmpty()) {
            Store t = pq.poll();
            List<Store> ls = new ArrayList<>();
            while(!pq.isEmpty() && inArr.contains(t.getKey())) {
                ls.add(t);
                t = pq.poll();
            }
            if(pq.isEmpty() && inArr.contains(t.getKey())) {
                inArr.add('i');
                //System.out.print('i');
            } else {
                //System.out.print(t.getKey());
                inArr.add(t.getKey());
                t.minus();
                
            }
            if(t.getExist() > 0) pq.add(t);
            if(inArr.size() > n) inArr.remove(0);
            cnt++;
            for(Store s : ls) pq.add(s);
        }
        return cnt;
    }
}

class Store { 
    private char key;
    private int exist;
    public Store(char c,int exist) {
        this.key = c;
        this.exist = exist;
    }
    
    public void plus() {
        this.exist++;
    }
    
    public void minus() {
        this.exist--;
    }
    
    public int getExist() {
        return this.exist;
    }
    
    public char getKey() {
        return this.key;
    }
}
