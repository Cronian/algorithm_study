/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    // {} [] () <-- 짝으로 이뤄지니까 무조건 길이가 짝수
    if(s.length % 2 !== 0) return false;
    
    //괄호 짝
    const pair = {
        '{':'}',
        '[':']',
        '(':')'
    };
    
    let stack = [];
    
    // 입력받은 string 길이 만큼 for문
    for(let i=0; i< s.length; i++)
    {
        // 시작 괄호를 스택에 넣고
        if(s[i] === '{' || s[i] === '[' || s[i] === '(' )
        {
            stack.push(s[i]);
            //아래까지 갈필요 없음
            continue;
        }
        
        //짝 지어둔 괄호 값 키와 동일하다면?
        if(pair[stack[stack.length - 1]] === s[i])
         {
             //다시 스택에서 꺼냄
                stack.pop();
             //그럼 다음으로
             continue;
         }
        
        //위 조건들 괄호 시작도 아니고 키값도 매칭 안된다면
        return false;
    }
    
    // 넣었다가 짝이 맞으면 다시 빼니까 스택은 0이여야함
    return stack.length === 0;
};
