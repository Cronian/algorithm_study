class Solution {
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<Symbol> pq = new PriorityQueue<Symbol>((x,y) -> (x.count > y.count ? -1 : (x.count < y.count ? 1 : 0)));
        Symbol aSymbol = new Symbol("a",a);
        Symbol bSymbol = new Symbol("b",b);
        Symbol cSymbol = new Symbol("c",c);
        if(a > 0) pq.add(aSymbol);
        if(b > 0) pq.add(bSymbol);
        if(c > 0) pq.add(cSymbol);
        String ex1 = "";
        String ex2 = "";
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()) {
            Symbol t1 = pq.poll();
            String t1c = t1.c;
            int t1cnt = t1.count;
            if(t1c.equals(ex1) && t1c.equals(ex2)) {
                if(!pq.isEmpty()) {
                    Symbol t2 = pq.poll();
                    String t2c = t2.c;
                    int t2cnt = t2.count;
                    sb.append(t2c);
                    t2.count = t2cnt-1;
                    if(t2.count > 0) {
                        pq.add(t2);  
                    } 
                    pq.add(t1);
                    ex2 = ex1;
                    ex1 = t2c;
                } else {
                    break;
                }
            } else {
                sb.append(t1c);
                t1.count = t1cnt-1;
                if(t1.count > 0) pq.add(t1);
                ex2 = ex1;
                ex1 = t1c;
            }
        }
        return sb.toString();
    }
}

class Symbol {
    public String c;
    public int count;
    public Symbol(String c,int count) {
        this.c = c;
        this.count = count;
    }
}
