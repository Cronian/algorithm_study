class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int s1Size = s1.length();
        int s2Size = s2.length();
        int s3Size = s3.length();
        if(s1Size + s2Size != s3Size) return false;
        Stack<Integer[]> st = new Stack<>();
        HashSet<Integer> hs = new HashSet<>();
        Integer[] init = {0,0,0};
        st.push(init);
        while(!st.empty()) {
            Integer[] t = st.pop();
            Integer[] t1 = {t[0]+1,t[1]  ,t[2]+1};
            Integer[] t2 = {t[0]  ,t[1]+1,t[2]+1};
            int iidx = t[0]*s3Size + t[1];
            if(hs.contains(iidx)) continue;
            hs.add(t[0]*s3Size + t[1]);
            if(t[0] != s1Size && (s1.charAt(t[0]) == s3.charAt(t[2]) ) && 
               (t[1] != s2Size && (s2.charAt(t[1]) == s3.charAt(t[2]) ))) {
                
                st.push(t1);
                st.push(t2);
            } else if(t[0] != s1Size && s1.charAt(t[0]) == s3.charAt(t[2])) {
                //System.out.printf("idx1 : %d\n",t[0]);
                st.push(t1);
            } else if(t[1] != s2Size && s2.charAt(t[1]) == s3.charAt(t[2])) {
                //System.out.printf("idx2 : %d\n",t[1]);
                st.push(t2);
            }
            //System.out.printf("idx1 : %d, idx2 : %d, idx3 : %d\n",t[0],t[1],t[2]);
            if(t[0] == s1Size && t[1] == s2Size && t[2] == s3Size) return true;
        }
        return false;
    }
    
    
}

