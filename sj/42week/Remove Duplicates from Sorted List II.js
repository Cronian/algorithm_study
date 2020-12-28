/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var deleteDuplicates = function(head) {
    
    let tmp = new ListNode(0);
    
    //[0]=>[1]=>[2]=>[3]=>[3]=>[4]...
    tmp.next = head;
    
    let prev = tmp;
    let cur = head;
    
    while(cur)
        {
            while(cur.next && cur.val == cur.next.val)
                {
                    cur = cur.next;
                }
            
            if(prev.next == cur)
                {
                    prev = cur;
                }
            
            //[3]=>[4] <-- 일 떄
            else
                {   
                    //[2]=>[4]로 연결
                    prev.next = cur.next;
                }
            
            cur = cur.next;
        }
    
    return tmp.next;
    
};
