class Solution {
    Set<List<Integer>> hs = new HashSet<>();
    public List<List<Integer>> permute(int[] nums) {
        calc(nums,new ArrayList<Integer>(),0);
        List<List<Integer>> rs = new ArrayList<>();
        for(List<Integer> tls : hs) {
            rs.add(tls);
        }
        return rs;
    }
    
    public void calc(int[] nums, List<Integer> ls, int idx) {
        int nSize = nums.length;
        int lSize = ls.size();
        if(lSize < nSize ) {
            for(int i=0;i<nSize;i++) {
                List<Integer> nls = new ArrayList<>(ls);    
                if(!ls.contains(nums[(idx+i)%nSize])) {
                    nls.add(nums[(idx+i)%nSize]);
                    calc(nums,nls,(idx+i)%nSize);
                } 
            }
            
            
        } else if(lSize == nSize) {
            hs.add(ls);
        }
    }
}
