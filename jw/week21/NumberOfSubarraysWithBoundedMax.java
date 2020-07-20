class Solution {
    public int numSubarrayBoundedMax(int[] A, int L, int R) {
        int i0 = 0, res = 0, count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > R) { count = 0; i0 = i + 1; }
            else if (A[i] >= L) count = i-i0+1;
            res += count;
        }
        return res;
    }
}
