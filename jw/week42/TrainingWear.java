import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Map<Integer,Boolean> used = new HashMap<>();
        List<Integer> ls =  new ArrayList<>();
        for(int i : reserve) {
            ls.add(i);
        }
        for(int l : lost) {
            if( ls.contains(l) ) {
                //System.out.println(l);
                used.put(l,false);   
            }
        }
        
        for(int l : lost) {
            boolean div = true;
            for(int r : reserve) {
                if((l-1 == r || l+1 == r) && (used.getOrDefault(r,true)) ) {
                    System.out.println(r);
                    div = false;
                    used.put(r,false);
                    break;
                } else if(l==r) {
                    div = false;
                    break;
                }
            }
            if(div) n--;
        }
        return n;
    }
}
