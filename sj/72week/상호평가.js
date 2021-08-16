function solution(scores) {
    var answer = '';
    
    for(let i=0; i<scores.length; i++)
        {
            let myScore = scores[i][i];
            let max = -1;
            let min = 101;
            let total = 0;
            let count = 0;
            let My = true;
            
            for(let j=0; j<scores.length; j++)
                {
                    let score = scores[j][i];
                    max = Math.max(max, score);
                    min = Math.min(min, score);
                    
                    if(i !== j && myScore === score)
                        {
                            My = false; 
                        }
                    total += score;
                    count++;
              
                }
            if(My && (max === myScore || min === myScore))
                {
                    total -= myScore;
                    count--;
                }

            answer += calculateRank(total/count);
        }
    
    return answer
}

function calculateRank(score){
    if(score >= 90)
        return "A";
    else if(score >= 80)
        return "B";
    else if(score >= 70)
        return "C";
    else if(score >= 50)
        return "D";
    else
        return "F";
}
