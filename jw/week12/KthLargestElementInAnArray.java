class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int tmp : nums) {
            pq.add(tmp);
        }
        while(k > 1) {
            pq.poll();
            k--;
        }
        return pq.poll();
    }
}