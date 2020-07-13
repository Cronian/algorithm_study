class Solution {
    private Map<Integer, Integer> visited = new HashMap<>();
    private ArrayList<Integer>[] graph;
    
    public boolean possibleBipartition(int N, int[][] dislikes) {
        
        graph = buildGraph(dislikes, N);        
        
        for (int p = 1; p <= N; p ++)
        {
            if (!visited.containsKey(p))
            {
                if (!traverse(p, 0)) return false;
            }
        }
        return true;
    }
    
    private ArrayList<Integer>[] buildGraph(int[][] dislikes, int N)
    {
        graph = new ArrayList[N+1];
        for (int i = 1; i <= N; i ++) graph[i] = new ArrayList<>();
        for (int[] dislike : dislikes)
        {
            graph[dislike[0]].add(dislike[1]);
            graph[dislike[1]].add(dislike[0]);
        }
        
        return graph;
    }
    
    private boolean traverse(Integer p, int color)
    {
        visited.put(p,color);
        
        color = color^1;
        ArrayList<Integer> ps = graph[p];
        for (Integer p0 : ps)
        {
            if (visited.containsKey(p0)&&visited.get(p0)!=color) return false;
            if (!visited.containsKey(p0))
            {
                if (!traverse(p0,color)) return false;
            }
        }
        return true;
    }
}
