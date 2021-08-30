import java.util.*;
class Solution {
    public String solution(String[] table, String[] languages, int[] preference) {
        List<HashMap<String,Integer>> score = new ArrayList<>();
        List<String> nameTag = new ArrayList<>();
        for(String t : table) {
            String[] split = t.split(" ");
            int sc = 5;
            HashMap<String,Integer> hm= new HashMap<>();
            nameTag.add(split[0]);
            for(int i=1;i<6;i++){
                hm.put(split[i],sc--);
            }
            score.add(hm);
        }
        
        List<String> answer = new ArrayList<>();
        int maxScore = 0;
        int size = languages.length;
        for(int i=0;i<5;i++) {
            int sc = 0;
            HashMap<String,Integer> wk = score.get(i);
            for(int j=0;j<size;j++) {
                sc += wk.getOrDefault(languages[j],0)*preference[j];
            }
            
            if(sc > maxScore) {
                maxScore = sc;
                answer = new ArrayList<>();
                answer.add(nameTag.get(i));
            }else if(sc == maxScore) {
                maxScore = sc;
                answer.add(nameTag.get(i));
            }
        }
        Collections.sort(answer);
        return answer.get(0);
    }
}
