class Solution {
    public boolean isPowerOfThree(int n) {
        if(n == 0) return false;
        boolean rs = true;
        if(n >= 1) {
            while(n > 1) {
                if(n%3 != 0 ) return false;
                n/=3;
            }
        } else  {
            return false;
        }
        return rs;
    }
}
