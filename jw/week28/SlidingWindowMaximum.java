class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> pq =  new PriorityQueue<>(Collections.reverseOrder());
        Map<Integer,Integer> inArr = new HashMap<>();
        int idx = 0;
        int ridx = 0;
        int[] rs = new int[nums.length-k+1];
        for(int t : nums ) {
            if(idx >= k) {
                inArr.put(nums[idx-k],inArr.get(nums[idx-k])-1);
                while((inArr.getOrDefault(pq.peek(),0) == 0) && !pq.isEmpty()) {
                    pq.poll();
                }  
            }
            pq.add(t);
            inArr.put(t,inArr.getOrDefault(t,0)+1);
            if(pq.size() >= k) {
                rs[ridx++] = pq.peek();
            }
            idx++;
        }
        return rs;
    }
}
