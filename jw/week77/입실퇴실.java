import java.util.*;
class Solution {
    public int[] solution(int[] enter, int[] leave) {
        // 크기
        int size = enter.length;
        // 반환값
        int[] answer = new int[size];
        // 각 번호별 마주친사람
        Map<Integer,HashSet<Integer>> hm = new HashMap<>();
        // 현재 독서실에 있는사람
        Set<Integer> status = new HashSet<>();
        
        int enterIdx = 0;
        int leaveIdx = 0;
        
        while(enterIdx < size || leaveIdx < size) {
            if(leaveIdx < size) {
                if(status.contains(leave[leaveIdx])) {
                    HashSet<Integer> ths = hm.get(leave[leaveIdx]);
                    
                    status.remove(leave[leaveIdx]);
                    leaveIdx++;
                    continue;
                }
                
            }
            
            if(enterIdx < size) {
                status.add(enter[enterIdx]);
                for(int t : status) {
                    HashSet<Integer> ths = hm.getOrDefault(t,new HashSet<Integer>());
                    if(t == enter[enterIdx]) {
                        for(int tt : status) {
                           ths.add(tt);
                        }
                    } else {
                        ths.add(enter[enterIdx]);
                    }
                    hm.put(t,ths);
                    answer[t-1] = ths.size()-1;
                }
                enterIdx++;
            }
        }
        return answer;
    }
}
