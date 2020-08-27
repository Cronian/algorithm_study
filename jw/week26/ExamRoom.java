class ExamRoom {
    PriorityQueue<Seats> pq;
    int size;
    List<Integer> occupancy;
    public ExamRoom(int N) {
        //Check Empty Space
        pq = new PriorityQueue<Seats>();
        occupancy = new ArrayList<Integer>();
        size = N;
    }
    
    public int seat() {
        int rs = 0;
        // First Insert
        if(pq.isEmpty()) {
            pq.add(new Seats(1,size-1,size));
            occupancy.add(0);
            rs = 0;
        // Others
        } else {
            Seats seat = pq.poll();
            
            //Empty First
            if(seat.s == 0) {
                rs = seat.s;
                occupancy.add(seat.s);
                pq.add(new Seats(seat.s+1,seat.e,size));
            //Empty Last
            } else if(seat.e == size-1) {
                rs = seat.e;
                occupancy.add(seat.e);
                pq.add(new Seats(seat.s,seat.e-1,size));
            
            } else {
                int pick = (seat.s+seat.e)/2;
                rs = pick;
                occupancy.add(pick);
                pq.add(new Seats(seat.s,pick-1,size));
                pq.add(new Seats(pick+1,seat.e,size));
            }
        }
        return rs;
    }
    
    public void leave(int p) {
        pq.clear();
        int rmIdx = 0;
        int st = 0;
        int ed = 0;
        Collections.sort(occupancy);
        int idx = 0;
        for(int t : occupancy) { 
            if(t == p) {
                rmIdx = idx;
                idx++;
                continue;
            }
            if(t == st) {
                st = st+1;
            } else {
                ed = t-1;
                pq.add(new Seats(st,ed,size));
                st = t+1;
            }
            idx++;
        }
        occupancy.remove(rmIdx);
        if(st != ed) pq.add(new Seats(st,size-1,size));
        
    }
    
    class Seats implements Comparable<Seats> {
        public int s;
        public int e;
        public int l;
        public int size;
        public Seats(int st,int ed,int size) {
            this.s = st;
            this.e = ed;
            this.l = ed-st+1;
            this.size = size;
        }
        
        @Override
        public int compareTo(Seats seats) {
            // Same Size
            // divide 2 
            int tSize = ((this.s == 0) || (this.e == size-1)) ? this.l :(int) Math.ceil(this.l/2.0);
            int sSize = ((seats.s == 0) || (seats.e == size-1)) ? seats.l :(int)Math.ceil(seats.l/2.0);
            if(tSize == sSize) {
                if(this.s <= seats.s) {
                    return -1;
                } else {
                    return 1;
                }
            } else {
                if(tSize >= sSize) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
    }
}

/**
 * Your ExamRoom object will be instantiated and called as such:
 * ExamRoom obj = new ExamRoom(N);
 * int param_1 = obj.seat();
 * obj.leave(p);
 */
