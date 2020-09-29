import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String,Integer> hm = new HashMap<>();
        HashMap<String,Integer> thm = new HashMap<>();
        int size = genres.length;
        for(int i=0;i<size;i++) {
            thm.put(genres[i],thm.getOrDefault(genres[i],0)+plays[i]);
        }
        PriorityQueue<Music> pq = new PriorityQueue<>((a,b)->{
            if(a.tPlay > b.tPlay) return -1;
            else if(a.tPlay < b.tPlay) return 1;
            else {
                if(a.play > b.play) return -1;
                else if(a.play < b.play) return 1;
                else {
                    if(a.genre.equals(b.genre)) {
                        if(a.idx < b.idx) return -1;
                        else return 1;
                    }
                }
            }
            return 0;
        });
        
        for(int i=0;i<size;i++) {
            Music m = new Music(genres[i],plays[i],thm.get(genres[i]),i);
            pq.add(m);
        }
        List<Integer> ls = new ArrayList<>();
        while(!pq.isEmpty()) {
            Music m = pq.poll();
            if(hm.getOrDefault(m.genre,0) < 2) {
                ls.add(m.idx);
                hm.put(m.genre,hm.getOrDefault(m.genre,0)+1);
            }
            else continue;
        }
        int[] answer = new int[ls.size()];
        int idx = 0;
        for(Integer t : ls) {
            answer[idx++] = t;
        }
        return answer;
    }
}
class Music {
    public int tPlay;
    public String genre;
    public int play;
    public int idx;
    public Music(String g,int p,int tp,int i) {
        this.genre = g;
        this.play = p;
        this.tPlay = tp;
        this.idx = i;
    }
}
