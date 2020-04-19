class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(nums.length,Collections.reverseOrder());
        int totalSum = 0;
        int judge = 0;
        List<Integer> rs = new ArrayList<>();
        for(int tmp : nums) {
            totalSum += tmp;
            pq.add(tmp);
        }
        
        while(!pq.isEmpty()) {
            int tmp = pq.poll();
            totalSum -= tmp;
            judge += tmp;
            rs.add(tmp);
            if(judge > totalSum) break;
        }
        
        return rs;
    }
}
