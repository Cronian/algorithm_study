/**
 * @param {number[]} arr
 * @return {number[]}
 */
var sortByBits = function(arr) {
    
    const bit = num => {
        let sum = 0;
        
        while(num)
            {
                sum += num & 1;
                //자리 칸수 이동
                num = num >> 1;
            }
        
        return sum;
    }
    
    return arr.sort((a,b)=> bit(a)-bit(b) || a-b);
    
};
