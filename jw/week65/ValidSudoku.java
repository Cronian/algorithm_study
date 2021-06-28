class Solution {
    List<HashSet<Character>> lineChecker = new ArrayList<>();
    List<HashSet<Character>> heightChecker = new ArrayList<>();
    List<HashSet<Character>> areaChecker = new ArrayList<>();
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++) {
            this.lineChecker.add(new HashSet<Character>());
            this.heightChecker.add(new HashSet<Character>());
            this.areaChecker.add(new HashSet<Character>());
        }
        for(int i=0;i<9;i++) {
            for(int j=0;j<9;j++) {
                char target = board[i][j];
                if(target != '.') {
                    if(!line(i,j,board[i][j])) return false;
                    if(!area(i,j,board[i][j])) return false;
                }
            }
        }
        return true;
    }
    
    public boolean line(int x,int y,char t) {
        // Line Checker
        HashSet<Character> l = this.lineChecker.get(x);
        if(l.contains(t)) {
            //System.out.println("Line : "+x+" // Char : "+t);
            return false;
        }
        l.add(t);
        this.lineChecker.set(x,l);
        
        // Height Checker
        HashSet<Character> h = this.heightChecker.get(y);
        if(h.contains(t)) {
            //System.out.println("Height : "+y+" // Char : "+t);
            return false;
        }
        h.add(t);
        this.heightChecker.set(y,h);
        
        return true;
    }
    
    public boolean area(int x,int y,char t) {
        int idx = x/3 + 3*(y/3);
        HashSet<Character> a = this.areaChecker.get(idx);
        if(a.contains(t)) {
            //System.out.println("Area : "+idx+" // Char : "+t);
            return false;
        }
        a.add(t);
        this.areaChecker.set(idx,a);
        return true;
    }
}

