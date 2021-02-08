class Solution {
    public String removeDuplicates(String S) {
        Stack<Character> st = new Stack<>();
        for(char c : S.toCharArray()) {
            if(st.empty()) st.push(c);
            else {
                if(st.peek() == c) st.pop();
                else st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
