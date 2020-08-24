class Solution {
    List<List<Integer>> ls;
    Set<Candidate> cls;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ls = new ArrayList<List<Integer>>();
        cls = new HashSet<Candidate>();
        calc(candidates,target,0,new ArrayList<Integer>(),0);
        for(Candidate cd : cls) {
            ls.add(cd.ls);
        }
        return ls;
    }
    
    public void calc(int[] cd,int tg,int st,List<Integer> tls,int sum) {
        int sz = cd.length;
        if(st < sz && sum < tg) {
            List<Integer> ttls = new ArrayList<Integer>(tls);
            ttls.add(cd[st]);
            List<Integer> ttls2 = new ArrayList<Integer>(tls);
            calc(cd,tg,st+1,ttls,sum+cd[st]);
            calc(cd,tg,st+1,ttls2,sum);
        } else if(sum == tg) {

            Candidate cdd = new Candidate(tls);
            this.cls.add(cdd);
        }
    }
}
class Candidate {
    List<Integer> ls;
    int size;
    int sum;
    public Candidate(List<Integer> ls) {
        Collections.sort(ls);
        this.ls = ls;
        int tot = 0;
        for(int t : ls) tot+=t;
        this.sum = tot;
        this.size = ls.size();
    }
    
    @Override
    public int hashCode() {
        int sum = 0;
        for(int t : ls) {
            sum += t*t;
        }
        return sum;
    }
    @Override
    public boolean equals(Object cdd){
        Candidate cd = (Candidate) cdd;
        if(this.size == cd.size && this.sum == cd.sum) {
            boolean rs = true;
            List<Integer> ls2 = cd.ls;
            for(int i=0;i<this.size;i++) {
                if(ls.get(i) != ls2.get(i)) {
                    rs = false;
                    break;
                }
            }
            return rs;
        }
        return false;
    }
}
