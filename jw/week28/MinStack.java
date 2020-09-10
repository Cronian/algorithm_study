class MinStack {
    
    Stack<Integer> trace;
    Stack<Integer> storedMin;
    /** initialize your data structure here. */
    public MinStack() {
        this.trace = new Stack<>();
        this.storedMin = new Stack<>();
    }
    
    public void push(int x) {
        this.trace.push(x);
        int tmp = this.storedMin.empty() ? Integer.MAX_VALUE : this.storedMin.peek();
        if(tmp >= x) this.storedMin.push(x);
    }
    
    public void pop() {
        int tmp = this.trace.pop();
        int tmp2 = this.storedMin.peek();
        if(tmp == tmp2 ) this.storedMin.pop();
    }
    
    public int top() {
        return this.trace.peek();
    }
    
    public int getMin() {
        return this.storedMin.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
