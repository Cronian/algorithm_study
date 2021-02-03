class Solution {
    public int maxSumDivThree(int[] nums) {
        PriorityQueue<Integer> one = new PriorityQueue<>();
        PriorityQueue<Integer> two = new PriorityQueue<>();
        int sum = 0;
        int sumM = 0;
        for(int t : nums) {
            sum += t;
            int div = t%3;
            if(div == 1) one.add(t);
            else if (div == 2) two.add(t);
        }
        
        if(sum%3 == 2) {
            int sizeO = one.size();
            int sizeT = two.size();
            int sumO = 0;
            int sumT = 0;
            if(sizeO >= 2) {
                sumO += one.poll();
                sumO += one.poll();
                if(sizeT >= 1) sumT += two.poll();
                if(sumT != 0) sumM = Math.min(sumO,sumT);
                else sumM = sumO;
            } else {
                if(sizeT >= 1) sumM = two.poll();
            }
            if(sumM == 0) sum = 0;
        } else if(sum%3 == 1) {
            int sizeO = one.size();
            int sizeT = two.size();
            int sumO = 0;
            int sumT = 0;
            if(sizeT >= 2) {
                sumT += two.poll();
                sumT += two.poll();
                if(sizeO >= 1) sumO += one.poll();
                if(sumO != 0) sumM = Math.min(sumO,sumT);
                else sumM = sumT;
            } else {
                if(sizeO >= 1) sumM = one.poll();
            }
            if(sumM == 0) sum = 0;
        }
        return sum-sumM;
    }
}
