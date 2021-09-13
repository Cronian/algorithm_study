import java.util.*;
/*
class Solution {
    public int[] solution(int[] weights, String[] head2head) {
        PriorityQueue<Boxer> pq = new PriorityQueue<>((a,b)->{
            if(a.win > b.win) return -1;
            else if(a.win < b.win) return 1;
            else {
                if(a.hwin > b.hwin) return -1;
                else if(a.hwin < b.hwin) return 1;
                else {
                    if(a.wei > b.wei) return -1;
                    else if(a.wei < b.wei) return 1;
                    else {
                        if(a.idx < b.idx) return -1;
                        return 1;
                    }
                }
            }
        });
        int size = weights.length;
        for(int i=0;i<size;i++) {
            Boxer boxer = new Boxer(weights[i],i);
            char[] arr = head2head[i].toCharArray();
            for(int j=0;j<size;j++) {
                if(i == j ) continue;
                boxer.count(arr[j],weights[j]);
            }
            boxer.finish();
            //System.out.printf("승률 : %d //// 더 무거운사람 승률 : %d //// 내 번호 : %d\n",boxer.win,boxer.hwin,boxer.idx);
            pq.add(boxer);
        }
        int[] answer = new int[size];
        int idx = 0;
        while(!pq.isEmpty()) {
            answer[idx++] = pq.poll().idx;
        }
        
        return answer;
    }
}
class Boxer {
        int wei;
        int cwin;
        double win;
        int hwin;
        int round;
        int idx;
        public Boxer(int wei,int idx) {
            this.cwin = 0;
            this.wei = wei;
            this.win = 0;
            this.hwin = 0;
            this.round = 0;
            this.idx = idx+1;
        }
        
        public void count(char c,int pwei) {
            if(c != 'N') this.round++;
            if(c == 'W') {
                this.cwin++;
                if(pwei > wei) this.hwin++;
            }
        }
        
        public void finish() {
            if(cwin != 0 && round != 0) this.win = (double)100.0/round*cwin;
            else this.win = 0;
        }
    }
*/
import java.util.*;

class Boxer implements Comparable<Boxer>{
    
    double winnum = 0;
    int swinnum =0;
    int weight = 0;
    int idx;
    public Boxer(double winnum,int swinnum, int weight,int idx){
        this.winnum = winnum;
        this.swinnum = swinnum;
        this.weight = weight;
        this.idx = idx;
    }
    
    public int compareTo(Boxer o){
        if(o.winnum-winnum>0){
            return 1;
        }else if(o.winnum-winnum<0){
            return -1;
        }else{
            if(o.swinnum-swinnum>0){
                return 1;
            }else if(o.swinnum - swinnum<0){
                return -1;
            }else{
                if(o.weight -weight>0){
                    return 1;
                }else if(o.weight - weight<0){
                    return -1;
                }else{
                    if(o.idx - idx<=0){
                        return 1;
                    }else{
                        return -1;
                    }
                }
            }
        }
       
    }
    
    public String toString(){
        return "boxer "+idx+"번 "+winnum+"승, 체중많은 사람한테 "+swinnum+"승";
    }
}


class Solution {
    public int[] solution(int[] weights, String[] head2head) {
        int[] answer = new int[weights.length];
        List<Boxer>boxerlist = new ArrayList();
        for(int i=0; i<answer.length; i++){
            int pan = head2head[i].replace("N","").length();
            int wincount = head2head[i].replace("N","").replace("L","").length();
           
            if(pan==0){
                boxerlist.add(new Boxer(0,checkwinnum(i,weights,head2head[i]),weights[i],i+1));
            }else{
                double winrate = ((double)wincount/pan);
                boxerlist.add(new Boxer(winrate,checkwinnum(i,weights,head2head[i]),weights[i],i+1));
            }
            
            //boxerlist.add(new Boxer(wincount,checkwinnum(i,weights,head2head[i]),weights[i],i+1));
        }
        Collections.sort(boxerlist);
        //System.out.println(boxerlist);
        
        for(int i=0; i<weights.length; i++){
            answer[i] = boxerlist.get(i).idx;
        }
        return answer;
    }
    
    public int checkwinnum(int idx, int[] weights, String head2head){
        int nowWeight = weights[idx];
        int cnt =0;
        String [] record = head2head.split("");
        for(int i=0; i<weights.length; i++){
            if(nowWeight<weights[i]){
                if(record[i].equals("W")){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
