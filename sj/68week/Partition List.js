/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} x
 * @return {ListNode}
 */
var partition = function(head, x) {
    
    
    let frontNode = new ListNode(0);
    
    let backNode = new ListNode(0);
    
    let tempFront = frontNode;
    
    let tempBack = backNode;
    
    let curr = head;
    
    while(curr)
        {
            if(curr.val < x)
                {
                    
                    tempFront.next = curr;
                    
                    tempFront = tempFront.next;
                }
            else 
            {
                tempBack.next = curr;
                
                tempBack = tempBack.next;

            }
            curr = curr.next;
        }
    
    tempFront.next = backNode.next;
    
    tempBack.next = null;
    
    return frontNode.next;
};
