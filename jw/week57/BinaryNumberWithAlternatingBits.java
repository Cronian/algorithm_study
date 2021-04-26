class Solution {
    public boolean hasAlternatingBits(int n) {
        int ex = n%2;
        n = n/2;
        while(n >= 1) {
            if(ex == n%2) {
                return false;
            }
            else { 
                ex = n%2;
                n = n/2;
            }
        }
        return true;
    }
}
