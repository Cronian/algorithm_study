/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {

    private List<Integer> ls;
    private int idx;
    private int size;
    
    public NestedIterator(List<NestedInteger> nestedList) {
        this.ls = new ArrayList<>();
        ListAdd(nestedList);
        this.idx = -1;
        this.size = ls.size();
    }
    
    public void ListAdd(List<NestedInteger> lni) {
        for(NestedInteger ni : lni) {
            if(ni.isInteger()) {
                
                this.ls.add(ni.getInteger());
            }
            else ListAdd(ni.getList());
        }
    }

    @Override
    public Integer next() {
        
        if(this.idx + 1 < this.size) {
            this.idx +=1;
            return this.ls.get(idx);
        }
        else return -1;
    }

    @Override
    public boolean hasNext() {
        if(this.idx + 1 < this.size ) return true;
        else return false;
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
