class Solution {
    public String solution(int[][] scores) {
        int cnt = scores.length;
        StringBuilder rs = new StringBuilder();
        for(int i=0;i<cnt;i++) {
            int max = 0;
            int maxCnt = 0;
            int min = 100;
            int minCnt = 0;
            int own = 0;
            int sum = 0;
            int size = cnt;
            for(int j=0;j<cnt;j++) {
                if(i==j) own = scores[j][i];
                if(scores[j][i] > max) {
                    max = scores[j][i];
                    maxCnt = 1;
                } else if(scores[j][i] == max) maxCnt++;
                if(scores[j][i] < min) {
                    min = scores[j][i];
                    minCnt = 1;
                } else if(scores[j][i] == min) minCnt++;
                sum+=scores[j][i];
            }
            if(   ((own == max) && (maxCnt == 1)) 
               || ((own == min) && (minCnt == 1)) ) {
                sum-=own;
                size-=1;
            }
            rs.append(getGrade(sum,size));
        }
        return rs.toString();
    }
    
    // Return Grade
    public String getGrade(double sum,double size) {
        double avg = sum/size;
        if(avg >= 90) return "A";
        else if(avg >= 80) return "B";
        else if(avg >= 70) return "C";
        else if(avg >= 50) return "D";
        else return "F";
    }
}
