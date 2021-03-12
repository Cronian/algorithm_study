class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> hm = new HashMap<>();
        int size = s1.length();
        for(char c : s1.toCharArray()) {
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        int size2 = s2.length();
        
        Map<Character,Integer> tgHm = new HashMap<>();
        int idx = 0;
        for(char c : s2.toCharArray()) {
            if(idx < size) {
                tgHm.put(c,tgHm.getOrDefault(c,0)+1);
                boolean rs = true;
                if(size2 == idx+1) {
                    rs = true;
                    for(char t : hm.keySet()) {
                        if( !hm.get(t).equals( tgHm.getOrDefault(t,-1))) {
                            //System.out.printf("%c %d %d %d\n",t,hm.get(t),tgHm.getOrDefault(t,-1),idx);
                            rs = false;
                            break;
                        }
                    }
                    if(rs) return true;
                }
            } else {
                boolean rs = true;
                for(char t : hm.keySet()) {
                    if( !hm.get(t).equals( tgHm.getOrDefault(t,-1))) {
                        //System.out.printf("%c %d %d %d\n",t,hm.get(t),tgHm.getOrDefault(t,-1),idx);
                        rs = false;
                        break;
                    }
                }
                if(rs) return true;
                else {
                    char ex = s2.charAt(idx-size);
                    tgHm.put(c,tgHm.getOrDefault(c,0)+1);
                    tgHm.put(ex,tgHm.getOrDefault(ex,0)-1);
                    if(size2 == idx+1) {
                        rs = true;
                        for(char t : hm.keySet()) {
                            if( !hm.get(t).equals( tgHm.getOrDefault(t,-1))) {
                                //System.out.printf("%c %d %d %d\n",t,hm.get(t),tgHm.getOrDefault(t,-1),idx);
                                rs = false;
                                break;
                            }
                        }
                        if(rs) return true;
                    }
                }
            }
            idx++;
        }
       
        return false;
    }
}
