class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for(int t : nums ) hs.add(t);
        return IntStream.rangeClosed(1,nums.length).filter(p->{
            if(hs.contains(p)) return false;
            else return true;
        }).limit(1).max().orElse(nums.length+1);
    }
}
