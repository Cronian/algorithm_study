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
