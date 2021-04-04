/**
 * @param {string} digits
 * @return {string[]}
 */
var letterCombinations = function(digits) {
      const phone = {
        2: 'abc',
        3: 'def',
        4: 'ghi',
        5: 'jkl',
        6: 'mno',
        7: 'pqrs',
        8: 'tuv',
        9: 'wxyz',
      };
    
    const res = [];
    
    if (digits == null || digits.length === 0){
         return [];
    }
    
    

    const dfs = (len, str) => {
    
        //2 === 2
    if(len === digits.length)
        {
            // ab
            res.push(str);
            return;
        }
        
        for(const c of phone[digits[len]])
            {
                // phone[2] => a,b,c
                // phone[3] => d, e, f
                console.log(len, c, str+c);
                //0->1      ''+a;
                //1->2      a+d
                dfs(len+1, str + c);
            }
    
    }
    
    dfs(0,'');
    
    return res;
};
