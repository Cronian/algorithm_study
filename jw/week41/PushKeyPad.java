import java.util.*;
class Solution {
    Map<Integer,Map<Integer,Integer>> targetMap = new HashMap<>();
    public String solution(int[] numbers, String hand) {
        //위치별 거리는 2,5,8,0만 계산하면 됨
        List<Point> tg = new ArrayList<>();
        tg.add(new Point(1,0)); // 2
        tg.add(new Point(1,1)); // 5
        tg.add(new Point(1,2)); // 8
        tg.add(new Point(1,3)); // 0
        int[][] pad = new int[][]{{1,2,3},{4,5,6},{7,8,9},{-1,0,-2}};
        for(Point t : tg) {
            Map<Integer,Integer> tmp = new HashMap<>();
            Map<Integer,Boolean> visit = new HashMap<>();
            int distance = 0;
            Queue<Point> qu = new LinkedList<>();
            qu.add(t);
            while(!qu.isEmpty()) {
                int qs = qu.size();
                for(int s=0;s<qs;s++) {
                    Point p = qu.poll();
                    for(int i=-1;i<=1;i++) {
                        for(int j=-1;j<=1;j++) {
                            if(checker(p.x+i,p.y+j,i,j,visit.getOrDefault(pad[p.y][p.x],false))) {
                                qu.add(new Point(p.x+i,p.y+j));
                            }
                        }
                    }
                    tmp.put(pad[p.y][p.x],Math.min(distance,tmp.getOrDefault(pad[p.y][p.x],distance)));
                    visit.put(pad[p.y][p.x],true);
                }
                distance++;
            }
            targetMap.put(pad[t.y][t.x],tmp);
        }
        
        StringBuilder sb = new StringBuilder();
        int rPos = -2;
        int lPos = -1;
        hand = hand.equals("right") ? "R" : "L";
        for(int num : numbers) {
            String rs = calcHands(num,lPos,rPos,hand);
            if(rs.equals("L")) lPos = num;
            else rPos = num;
            sb.append(rs);
        }
        return sb.toString();
    }
    
    public String calcHands(int target,int lPos,int rPos,String hand) {
        String rs = "";
        if(target == 1 || target == 4 || target == 7) {
            rs = "L";
        } else if(target == 3 || target == 6 || target ==9) {
            rs = "R";
        } else {
            // 타겟과 거리셋 불러오기
            Map<Integer,Integer> tmp = targetMap.get(target);
            int rDis = tmp.get(rPos);
            int lDis = tmp.get(lPos);
            if(rDis < lDis) rs = "R";
            else if(rDis > lDis) rs = "L";
            else rs = hand;
        }
        return rs;
    }
    
    public boolean checker(int x,int y,int i,int j,boolean v) {
        if(x < 0 || y < 0 || x >= 3 || y >= 4 || v) {
            return false;
        } else if ( Math.abs(i) + Math.abs(j) != 1) {
            return false;
        } else {
            return true;
        }
    }
}
class Point{
    int x,y;
    public Point(int x,int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash += this.x*97 + this.y*101;
        return hash;
    }
    
    @Override
    public boolean equals(Object o) {
        Point p = (Point) o;
        if(p.x == this.x && p.y == this.y) return true;
        return false;
    }
}
