class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        List<Boolean> ls = new ArrayList<>();
        for(int t : candies) {
            if(max < t) max = t;
        }
        
        for(int t : candies) {
            if(t+extraCandies >= max) ls.add(true);
            else ls.add(false);
        }
        
        return ls;
    }
}
