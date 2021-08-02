class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> hm = new HashMap<>();
        int cnt = 0;
        boolean onePass = true;
        for(char c : s.toCharArray()) {
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        for(Character c : hm.keySet()) {
            if(hm.get(c)%2 == 0) cnt+=hm.get(c);
            else {
                if(onePass) {
                    onePass = false;
                    cnt += hm.get(c);
                }
                else cnt += hm.get(c)-1;
            }
            
        }
        return cnt;
    }
}
