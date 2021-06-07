class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        List<Integer> pStart = new ArrayList<>();
        int size = gas.length;
        for(int i=0;i<size;i++) {
            if(gas[i] >= cost[i]) pStart.add(i);
        }
        int rs = -1;
        for(int s : pStart) {
            int gasTank = 0;
            boolean div = true;
            //System.out.print(s);
            //System.out.print(" : ");
            for(int i=0;i<size;i++) {
                int idx = (s+i)%size;
                gasTank += gas[idx];
                gasTank -= cost[idx];
                //System.out.print(" ");
                //System.out.print(gasTank);
                if(gasTank < 0) {
                    div = false;
                    break;
                }
            }
            //System.out.println("");
            if(div) {
                rs = s;
                break;
            }
        }
        return rs != -1 ? rs%size : -1;
    }
}
