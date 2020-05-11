class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character,Integer> hm = new HashMap<>();
        for(char v : t.toCharArray()) {
            int tmp = hm.getOrDefault(v,0);
            hm.put(v,tmp+1);
        }
        
        for(char v : s.toCharArray()) {
            int tmp = hm.get(v);
            if(tmp == 1) hm.remove(v);
            else hm.put(v,tmp-1);
        }
        
        Iterator it = hm.keySet().iterator();
        return (char) it.next();
    }
}
