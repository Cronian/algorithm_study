/**
 * @param {number[]} arr
 * @param {number} k
 * @param {number} x
 * @return {number[]}
 */
var findClosestElements = function(arr, k, x) {
    
    let left = 0;
    let right = arr.length - 1;
    
    while(left < right)
        {
            //2
            //1
            //0
            const mid = parseInt((left+right)/2);
            
            //(3-3) > undefined
            //(3-2) > undefined
            //(3-1) > 5
            if(x - arr[mid] > arr[mid+k]-x)
                {
                    left = mid+1;
                }
            else
                {
                    //4 => 2
                    //2 => 1
                    //1 => 0
                    right =mid;
                    //=> left === right ===0
                }
        }
    // 0 ~ 4
    return arr.slice(left,left+k);
    
};
