class Solution {
    public boolean isPerfectSquare(int num) {
        int rs = (int)Math.sqrt(num);
        return rs*rs == num ? true : false;
    }
}
