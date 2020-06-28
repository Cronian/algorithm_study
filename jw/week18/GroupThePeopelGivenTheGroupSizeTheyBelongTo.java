class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer,List<Integer>> hm = new HashMap<>();
        int size = groupSizes.length;
        List<List<Integer>> rs = new ArrayList<>();
        for(int i=0;i<size;i++) {
            int tmp = groupSizes[i];
            List<Integer> ls = hm.getOrDefault(tmp,new ArrayList<>());
            if(ls.size() < tmp) {
                ls.add(i);
                if(tmp == ls.size()) {
                    rs.add(ls);
                    ls = new ArrayList<>();
                } 
            }
            else {
                rs.add(ls);
                ls = new ArrayList<>();
                ls.add(i);
            }
            hm.put(tmp,ls);
        }
        return rs;
    }
}
