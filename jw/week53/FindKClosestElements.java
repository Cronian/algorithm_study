// 정렬이라는 특징을 전혀 사용하지 못함..
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> {
            int absA = Math.abs(a-x);
            int absB = Math.abs(b-x);
            if(absA < absB) return -1;
            else if(absA > absB) return 1;
            
            if(a<b) return -1;
            else if(a>b) return 1;
            return 0;
        });
        
        List<Integer> ls = new ArrayList<>();
        for(int t:arr) {
            pq.add(t);
        }
        for(int i=0;i<k;i++) {
            ls.add(pq.poll());
        }
        Collections.sort(ls);
        return ls;
    }
}
