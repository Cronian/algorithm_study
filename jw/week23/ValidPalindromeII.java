class Solution {
    public boolean validPalindrome(String s) {
        int st = 0;
        int ed = s.length()-1;
        boolean rs = true;
        while(ed>st) {
            if(s.charAt(st) != s.charAt(ed)) break;
            ed--;
            st++;
        }
        
        if(ed>=st) { 
            rs = calc(s,st+1,ed) || calc(s,st,ed-1);
        }
        return rs;
    }
    
    public boolean calc(String s,int st, int ed) {
        boolean rs = true;
        while(ed>st) {
            if(s.charAt(st) != s.charAt(ed)) {
                rs = false;
                break;
            }
            ed--;
            st++;
        }
        return rs;
    }
}
