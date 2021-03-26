// 정렬된 배열이라는 조건을 사용하지 못한 알고리즘
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        List<Integer> ls = new ArrayList<>();
        for(int[] h : matrix) {
            for(int t : h) {
                int size = ls.size();
                if(size < k) {
                    ls.add(t);
                } else {
                    if(size == k) {
                        Collections.sort(ls);
                    }
                    for(int i=0;i<k;i++) {
                        int tmp = ls.get(i);
                        if(tmp >= t) {
                            ls.add(i,t);
                            break;
                        }
                    }
                }
            }
        }
        return ls.get(k-1);
    }
}
