class Solution {
    public int balancedStringSplit(String s) {
        int c = 0;
        int as = 0;
        for(char t : s.toCharArray()) {
            if(t == 'L') c--;
            else c++;
            if(c == 0) as++;
        }
        return as;
    }
}
