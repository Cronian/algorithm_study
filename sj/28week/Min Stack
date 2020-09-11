/**
 * initialize your data structure here.
 */
var MinStack = function() {
    
    
    this.res = [];
    
};

/** 
 * @param {number} x
 * @return {void}
 */
MinStack.prototype.push = function(x) {
    
    this.res.push({
        value: x,
        min: this.res.length === 0 ? x : Math.min(x,this.getMin())
    })
    
};

/**
 * @return {void}
 */
MinStack.prototype.pop = function() {
    
    this.res.pop();
    
};

/**
 * @return {number}
 */
MinStack.prototype.top = function() {
    return this.res[this.res.length-1].value;
};

/**
 * @return {number}
 */
MinStack.prototype.getMin = function() {
    return this.res[this.res.length-1].min;
};

/** 
 * Your MinStack object will be instantiated and called as such:
 * var obj = new MinStack()
 * obj.push(x)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */
