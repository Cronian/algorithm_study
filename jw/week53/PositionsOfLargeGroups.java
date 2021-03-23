class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        Map<Integer,List<List<Integer>>> hm = new HashMap<>();
        Set<Integer> hs = new HashSet<>();
        
        char ex = s.charAt(0);
        int cnt = 1;
        int st = 0;
        int ed = 1;
        for(int i=1;i<s.length();i++) {
            char t = s.charAt(i);
            if(t == ex) {
                cnt++;
            } else {
                if(cnt >= 3 ) cnt =3;
                setList(ex,cnt,st,i,hm,hs);
                cnt = 1;
                st = i;
                ex = t;
            }
            ed = i+1;
        }
        cnt = cnt >= 3 ? 3 : cnt;
        setList(ex,cnt,st,ed,hm,hs);
        return hm.getOrDefault(3,new ArrayList<List<Integer>>());
    }
    public void setList(char ex,int cnt,int st,int ed,Map<Integer,List<List<Integer>>> hm,Set<Integer> hs) {
        List<List<Integer>> ls = hm.getOrDefault(cnt,new ArrayList<List<Integer>>());
        List<Integer> tls = new ArrayList<>();
        tls.add(st);
        tls.add(ed-1);
        ls.add(tls);
        hs.add(cnt);
        hm.put(cnt,ls);
    }
}
