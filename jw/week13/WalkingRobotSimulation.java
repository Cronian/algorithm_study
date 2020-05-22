class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        Robot rb = new Robot(obstacles);
        for(int tmp : commands) {
            rb.goForward(tmp);
        }
        return rb.getResult();
    }
}

class Robot {
    private int[] now;
    private char[] forward;
    private int nowForward;
    private HashMap<Integer,HashSet<Integer>> xObs;
    private HashMap<Integer,HashSet<Integer>> yObs;
    private int max;
    
     public Robot(int[][] obs ) {
        this.now = new int[2];
        this.forward = new char[] {'N','R','S','L'};
        this.nowForward = 0;
        this.max = 0;
        this.xObs = new HashMap<>();
        this.yObs = new HashMap<>();
        for(int[] tmp : obs) {
            HashSet<Integer> xHs = xObs.getOrDefault(tmp[1],new HashSet<Integer>());
            HashSet<Integer> yHs = yObs.getOrDefault(tmp[0],new HashSet<Integer>());
            xHs.add(tmp[0]);
            yHs.add(tmp[1]);
            this.xObs.put(tmp[1],xHs);
            // y axis obstaclesa
            this.yObs.put(tmp[0],yHs);
        }
    }
    
    public void goForward(int n) {
        if(n < 0) turnForward(n);
        else {
            switch(forward[nowForward]) {
                case 'N' : 
                    for(int i=n;i>0;i--) {
                        boolean obs = isObs('Y',this.now[0],this.now[1]+1);
                        if(!obs) this.now[1] += 1;
                        else {calcMax();break;}
                    }
                    calcMax();
                    break;
                case 'S' : 
                    for(int i=n;i>0;i--) {
                        boolean obs = isObs('Y',this.now[0],this.now[1]-1);
                        if(!obs) this.now[1] -= 1;
                        else {calcMax();break;}
                    }
                    calcMax();
                    break;
                case 'R' : 
                    for(int i=n;i>0;i--) {
                        boolean obs = isObs('X',this.now[0]+1,this.now[1]);
                        if(!obs) {this.now[0] += 1;}
                        else {calcMax();break;}
                    }
                    calcMax();
                    break;
                case 'L' : 
                    for(int i=n;i>0;i--) {
                        boolean obs = isObs('X',this.now[0]-1,this.now[1]);
                        if(!obs) this.now[0] -= 1;
                        else {calcMax();break;}
                    }
                    calcMax();
                    break;
                default :
                    calcMax();
                    break;
            }
        }
    } 
    
    public boolean isObs(char target,int x,int y) {
        boolean rs = false;
        if(target == 'X') {
            HashSet<Integer> tmp = new HashSet<>();
            HashSet<Integer> tm = this.xObs.getOrDefault(y,tmp);
            if(tm != tmp) rs = tm.contains(x);
        } else if(target == 'Y') {
            HashSet<Integer> tmp = new HashSet<>();
            HashSet<Integer> tm = this.yObs.getOrDefault(x,tmp);
            if(tm != tmp) rs = tm.contains(y);
        }
        return rs;
    }
    
    public void calcMax() {
        this.max = Math.max(this.max,(int) Math.pow(this.now[0],2)+(int)Math.pow(this.now[1],2));
    }
    
    public int getResult() {
        Iterator it = this.xObs.keySet().iterator();
        while(it.hasNext()){
            int key = (int) it.next();
            Iterator itt = xObs.get(key).iterator();
            System.out.print("key");
            System.out.println(key);
            while(itt.hasNext()) System.out.print(itt.next());
        }
        return this.max;
    }
    
    public void turnForward(int n) {
        if(n == -2) this.nowForward--;
        else if(n == -1) this.nowForward++;
        if(this.nowForward == -1 ) this.nowForward = 3;
        else if(this.nowForward == 4) this.nowForward = 0;
    }
}
