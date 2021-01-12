var removeZeroSumSublists = function(head) {
    
    const temp = new ListNode("temp", head);
    
    console.log(temp)
    
    for(let prev = temp; prev; prev = prev.next)
        {
            let sum = 0;
            
            for(let next = prev.next; next; next= next.next)
                {
                    sum += next.val;
                    
                    if(sum === 0)
                        {
                            prev.next = next.next;
                        }
                }
        }
    
    return temp.next;
    
};
