class Solution {
    Set<List<Integer>> hs = new HashSet<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        calc(candidates,target,new ArrayList<Integer>(),0);
        ArrayList<List<Integer>> rs = new ArrayList<>();
        for(List<Integer> ls : hs) {
            rs.add(ls);
        }
        return rs;
    }
    
    public void calc(int[] c,int t,List<Integer> l,int n){
        
        if(n < t) {
            for(int i : c) {
                List<Integer> nls = new ArrayList<Integer>(l);
                nls.add(i);
                calc(c,t,nls,n+i);
            }
        } else if( n == t) {
            if(l.size() > 0) {
                Collections.sort(l);
                hs.add(l);
            }
        }
        
    }
}
