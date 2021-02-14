function solution(p, location) {
    var answer = 0;
    
    while(p.length)
        {
            if(p[0]===Math.max(...p))
                {
                    
                    answer++;
                    
                     p.shift();
                    
                    if(location === 0)
                        {
                            return answer;
                        }
                    else
                        {
                            location--;
                        }
                }
            else
            {   
                const temp = p.slice(0,1)[0];  
                
                p.shift();
                
                p.push(temp);
                
                if(location === 0)
                    {
                        location = p.length-1;
                    }
                else {
                    location--;
                }
                
            }
           
        }
    return answer;
}
