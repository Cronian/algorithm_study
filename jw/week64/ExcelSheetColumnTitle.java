class Solution {
    public String convertToTitle(int columnNumber) {
        Stack<Integer> st = new Stack<>();
    
        while(columnNumber >0) {
            int t = columnNumber%26;
            st.add(t);
            columnNumber = (int) Math.floor(columnNumber/26);
            if(t == 0) columnNumber--;
        }
        if(st.isEmpty()) st.add(1);
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()) {
            int t = st.pop();
            if(t == 0) t = 26;
            sb.append((char)(t+64));
        }
        return sb.toString();
    }
}
