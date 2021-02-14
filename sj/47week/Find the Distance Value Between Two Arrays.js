/**
 * @param {number[]} arr1
 * @param {number[]} arr2
 * @param {number} d
 * @return {number}
 */
var findTheDistanceValue = function(arr1, arr2, d) {
    
     return arr1.filter(n1 => arr2.every(n2 => Math.abs(n1 - n2) > d)).length;
    
};
