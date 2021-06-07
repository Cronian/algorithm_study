class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    /*
    public int majorityElement(int[] nums) {
        PriorityQueue<Dual> pq = new PriorityQueue<>((a,b) -> {
            if(a.getCount() > b.getCount()) return -1;
            else if(a.getCount() == b.getCount()) return 0;
            else return 1;
        });
        
        Map<Integer,Integer> hm = new HashMap<>();
        
        for(int t : nums) hm.put(t,hm.getOrDefault(t,0)+1);
        for(int k : hm.keySet()) pq.add(new Dual(k,hm.get(k)));
        return pq.poll().getKey();
    }
    
    class Dual {
        private int key;
        private int count;
        public Dual(int key,int count) {
            this.key = key;
            this.count = count;
        }
        
        public void plus() {
            this.count++;
        }
        
        public int getCount() {
            return this.count;
        }
        public int getKey() {
            return this.key;
        }
    }
    */
    
}
