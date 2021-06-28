class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        boolean rs = true;
        if(s.length()%2 == 1) return false;
        for(char c : s.toCharArray()) {
            if( c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if(st.empty()) {
                    rs = false;
                    break;
                }
                int tmp = (int)st.pop();   
                if((int)c-1 != tmp && (int)c-2 != tmp) {
                    rs = false;
                    break;
                }
            }
        }
        
        if(!st.empty()) {
            return false;
        }
        
        return rs;
    }
}
