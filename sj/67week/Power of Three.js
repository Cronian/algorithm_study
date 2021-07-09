/**
 * @param {number} n
 * @return {boolean}
 */
var isPowerOfThree = function(n) {
    
   while (n > 1) {
       
        if (n % 3 === 0){
             n /= 3;
        }
        else {
             break;
        }
    }
    
    return n === 1;
    
};
