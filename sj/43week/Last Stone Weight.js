/**
 * @param {number[]} stones
 * @return {number}
 */
var lastStoneWeight = function(stones) {
    
    return stones.length === 1 
        ? stones[0] : 
    //정렬
    lastStoneWeight(stones.sort((x,y)=> x-y)
                                            //쪼개고 남은거 다시 뒤에 넣어
                                            .concat(stones.pop() - stones.pop()))
};
