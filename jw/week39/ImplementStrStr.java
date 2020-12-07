class Solution {
    public int strStr(String haystack, String needle) {
        int sizeH = haystack.length();
        int sizeN = needle.length();
        if(sizeH >= sizeN && sizeN != 0) return haystack.indexOf(needle);
        else if ( sizeN == 0 ) return 0;
        else return -1;
    }
}
