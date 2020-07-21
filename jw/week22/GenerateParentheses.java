class Solution {
    private List<String> ls;
    public List<String> generateParenthesis(int n) {
        this.ls = new ArrayList<>();
        build(n,0,0,new StringBuilder());
        return ls;
    }
    
    private void build(int limit,int open,int close,StringBuilder sb) {
        if(limit == open && limit == close) ls.add(sb.toString());
        else {
            if(limit == open ) {
                sb.append(")");
                close++;
                build(limit,open,close,new StringBuilder(sb));
            } else {
                if(open == close) {
                    sb.append("(");
                    open++;
                    build(limit,open,close,new StringBuilder(sb));
                } else {
                    build(limit,open+1,close,new StringBuilder(sb).append("("));
                    build(limit,open,close+1,new StringBuilder(sb).append(")"));
                }
            }
        }
    }
}
