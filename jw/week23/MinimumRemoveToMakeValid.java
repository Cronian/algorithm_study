class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        int size = s.length();
        for(int i=0;i<size;i++) {
            if(s.charAt(i) == '(') {
                st.push(i);
            } else if(s.charAt(i) == ')') {
                if(st.isEmpty()) {
                    s = s.substring(0,i)+" "+s.substring(i+1);
                } else {
                    st.pop();
                }
            }
        }

        while(!st.isEmpty()) {    
            int idx = st.pop();
            s = s.substring(0,idx)+" "+s.substring(idx+1);
        }
        return s.replaceAll(" ","");
    }
}
