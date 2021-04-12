class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> {
                if(a[0] < target) {
                    if(b[0] <= target && a[0] < b[0]) return 1;
                    else return -1;
                } else if(a[0] > target) {
                    if(b[0] <= target) return 1;
                    else return -1;
                }
                return -1;
            }
        );
        for(int[] m : matrix) {
            pq.add(m);
        }
        for(int i : pq.poll()) {
            if(i == target) return true;
            if(i > target) break;
        }
        return false;
    }
}
