class Solution {
    public int[] arrayRankTransform(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int tmp : arr) {
            pq.add(tmp);
        }
        int[] result = new int[arr.length];
        Map<Integer,Integer> map = new HashMap<>();
        int ex = Integer.MIN_VALUE;
        int cnt = 1;
        while(!pq.isEmpty()) {
            int tm = pq.poll();
            if(ex == tm) cnt--;
            map.put(tm,cnt++);
            ex = tm;
        }
        for(int i=0;i<arr.length;i++) {
            result[i] = map.get(arr[i]);
        }
        return result;
    }
}
