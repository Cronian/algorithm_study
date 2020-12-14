class Solution {
    public String countAndSay(int n) {
        String rs = "1";
        for(int i=2;i<=n;i++) {
            char t = ' ';
            int cnt = 0;
            StringBuilder sb = new StringBuilder();
            for(char c : rs.toCharArray()) {
                if(t == ' ') t = c;
                else if ( t != c ) {
                    sb.append(cnt);
                    sb.append(t);
                    t = c;
                    cnt = 0;
                }
                cnt++;
            }
            sb.append(cnt);
            sb.append(t);
            rs = sb.toString();
        }
        return rs;
    }
}
