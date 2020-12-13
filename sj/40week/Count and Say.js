/**
 * @param {number} n
 * @return {string}
 */
var countAndSay = function(n) {
    
    let res = '1';
    let count = 1;
    for(let i=1; i<n; i++)
        {
            let arr = res.split('');
            
            res = '';
            
            for(let j=0; j<arr.length; j++)
                {
                    if(arr[j] !== arr[j+1])
                    {
                        res += count + arr[j];
                        count =1;
                    }
                    else{
                        count++;
                    }
                }
        }
    
    return res;
};
