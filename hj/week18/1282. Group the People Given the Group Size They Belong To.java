class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        
        List<List<Integer>> result = new ArrayList<>();
        

        int max = 0;
        
        for(int i = 0; i < groupSizes.length; i++) {
            max = Math.max(max, groupSizes[i]); 
        }
        
        int now = 1;
        
        while(now <= max) {
            
            List<Integer> groups = new ArrayList<>();
            
            int size = now;
            
            for(int i = 0; i < groupSizes.length; i++) {
                
                if(now == groupSizes[i]) {
                    groups.add(i);
                }
                
                if(groups.size() == size) {
                    result.add(groups);
                    groups = new ArrayList<>();
                }
                
            }
            
            now++;
            
        }

        return result;
        
    }
}
