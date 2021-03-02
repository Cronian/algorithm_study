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
