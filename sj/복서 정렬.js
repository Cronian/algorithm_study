function solution(weights, head2head) {
    var answer = [];
    
    for(let i=0; i<weights.length; i++)
        {
            let win = 0;
            let lose = 0;
            let weight =0;
            
            for(let j=0; j<head2head[i].length; j++)
                {
                    if(head2head[i][j] === 'W')
                        {
                            win += 1;
                            
                            if(weights[i] < weights[j])
                                {
                                    weight +=1;
                                }
                        }
                    if(head2head[i][j] === 'L')
                        {
                            lose += 1;
                        }
                    if(head2head[i][j] === 'N')
                        {
                            continue;
                        }
                }
            let rate = win / (win + lose);
            
            answer = [...answer, [rate, weight, weights[i], i+1]];
        }
    return answer.sort((a,b)=> {
        if (a[0] > b[0]) return -1;
        if (a[0] < b[0]) return 1;
        if (a[1] > b[1]) return -1;
        if (a[1] < b[1]) return 1;
        if (a[2] > b[2]) return -1;
        if (a[2] < b[2]) return 1;
        if (a[3] > b[3]) return 1;
        if (a[3] < b[3]) return -1;
        return 0;
    }).map((item)=> item[3]);
}
