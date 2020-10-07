class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        return Arrays.stream(nums).filter(p->{ if(hs.contains(p)) return true;
                                                          else { hs.add(p); return false;}
                                            }).boxed()
                                              .collect(Collectors.toList());
    }
}
