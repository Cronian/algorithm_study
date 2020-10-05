class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for(int i : nums) {
            hs.add(i);
        }
        // IntStream Range 1 to nums.length
        // Filterd Not Included HashSet
        // int to Integer (boxing)
        // return List<Integer>
        return IntStream.rangeClosed(1,nums.length)
                            .filter(p -> !hs.contains(p))
                            .boxed()
                            .collect(Collectors.toList());
    }
}
