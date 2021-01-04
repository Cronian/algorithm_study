/**
 * @param {number[]} barcodes
 * @return {number[]}
 */
var rearrangeBarcodes = function(barcodes) {
    
    let res = [];
    
    let map = new Map();
    
    let i = 0;
    
    for(let b of barcodes){
        
            map.set(b,(map.get(b) || 0)+1);
        
    }
    
    console.log(map);
    
    //맵에서 키를 뽑아서 정렬 후 배열저장
    let arr = Array.from(map.keys()).sort(((a, b) => map.get(b) - map.get(a)));
    
    console.log(arr);
    
    for(let el of arr)
        {
            let count = map.get(el);
            
            // for(let i=0; i<=count; i+2)
            //     {
            //         res[i] = el;
            //     }
            
            //키에 해당하는 값 갯수만큼
            while(count--)
                {
                    res[i]=el;
                    //한칸뛰어서
                    i = i+2;
                }
            
            
            if(i>=barcodes.length)
                {
                    i =1;
                }
        }
    
    
    return res;
};
