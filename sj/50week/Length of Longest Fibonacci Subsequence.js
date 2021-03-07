//베스트 솔루션
var lenLongestFibSubseq = function(A) {
    let N = A.length;
    let S = new Set(A);

    let ans = 0;
    for (let i = 0; i < N; ++i)
        for (let j = i+1; j < N; ++j) {
            /* With the starting pair (A[i], A[j]),
             * y represents the future expected value in
             * the fibonacci subsequence, and x represents
             * the most current value found. */
            let x = A[j], y = A[i] + A[j];
            let length = 2;
            while (S.has(y)) {
                let z = x + y;
                x = y;
                y = z;
                ans = Math.max(ans, ++length);
            }
        }

    return ans >= 3 ? ans : 0;
};


//내가 푼거
/**
 * @param {number[]} arr
 * @return {number}
 */
var lenLongestFibSubseq = function(arr) {
    
    let map = new Map();
    
    let len = 0;
    
    for(let a of arr)
        {
            map.set(a,true);
        }
    
    arr.sort((a,b)=> a-b);
    
    
    for(let i=0; i<arr.length; i++)
        {
            for(let j=i+1; j<arr.length; j++)
                {
                    let right = arr[j];
                    
                    let left = arr[i];
                    
                    let templen = 0;
                    
                    //두개 더한게 있는지
                    while(map.has(left+right))
                        {
                            templen++;
                            // 앞에 두개 더한값
                            let temp = left+right;
                            // 앞으로 댕김
                            left= right;
                            
                            right = temp;
                        }
                    
                    len = Math.max(len, templen+2);
                }
        }
    return len>2? len:0;
    
};
