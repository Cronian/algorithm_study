class Solution {
    public String sortString(String s) {
        int[] store = new int[26];
        int cnt = s.length();
        for(char c : s.toCharArray()) {
            int tmp = (int) c - 97;
            store[tmp] += 1;
        }
        int path = 1;
        StringBuilder sb = new StringBuilder("");
        for(int i=0;cnt != 0;i=i+path) {
            if(i == 26) {
                path = -1;
                i = 25;
            } else if (i == -1 ) {
                path = 1;
                i = 0;
            }
            if(store[i] > 0) {
                sb.append(String.valueOf((char) (i+97)));
                store[i] -= 1;
                cnt--;
            }
            
        }
        
        return sb.toString();
    }
}
