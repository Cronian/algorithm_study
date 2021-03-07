//베스트 솔류션
function maxSubArray(A) {
  var prev = 0;
  var max = -Number.MAX_VALUE;

  for (var i = 0; i < A.length; i++) {
    prev = Math.max(prev + A[i], A[i]);
    max = Math.max(max, prev);
  }
  return max;
}


내가 푼거
/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    
    let max = -Number.MAX_VALUE;
    
    let temp = 0;
    
    for(let i=0; i<nums.length; i++)
        {
            temp = Math.max(temp+nums[i], nums[i]);
            
            max = Math.max(max,temp);
        }
    
    return max
};
