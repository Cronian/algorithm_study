class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        Set<Integer> st = new HashSet<>();
        for(int i : arr) st.add(i);
        
        int max = 0;
        
        for(int i=0;i<arr.length-1;i++) {
            for(int j=i+1;j<arr.length;j++) {
                int s = 2;
                int ex = arr[j];
                int t = arr[i] + arr[j];
               
                while(st.contains(t)) {
                    s++;
                    int tmp = ex;
                    ex = t;
                    t = tmp + t;
                    max=Math.max(max,s);
                }
            }
        }
        
        return max;
    }
}
