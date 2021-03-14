/**
 * @param {number} target
 * @param {number[]} nums
 * @return {number}
 */
var minSubArrayLen = function(target, nums) {
    
    let left = 0;
 
    let sum =0;
    
    let res = Number.MAX_SAFE_INTEGER;
    
    for(let r = 0; r< nums.length; r++)
        {
            sum += nums[r];
            
            while(sum >= target)
                {
                    res = Math.min(res, r-left +1);
                    
                    sum -= nums[left];
                    left = left +1;
                }
        }
    return res === Number.MAX_SAFE_INTEGER ? 0 : res;
};

//베스트 솔직히 거의 똑같음
public int minSubArrayLen(int s, int[] a) {
  if (a == null || a.length == 0)
    return 0;
  
  int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;
  
  while (j < a.length) {
    sum += a[j++];
    
    while (sum >= s) {
      min = Math.min(min, j - i);
      sum -= a[i++];
    }
  }
  
  return min == Integer.MAX_VALUE ? 0 : min;
}
