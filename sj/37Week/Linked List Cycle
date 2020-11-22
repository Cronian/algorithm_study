/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} head
 * @return {boolean}
 */
var hasCycle = function(head) {
    
    const set = new Set();
    
    let temp = head;
    
    while (temp != null)
        {
            if(set.has(temp))
                {
                    return true;
                }
            
            set.add(temp);
            
            temp = temp.next;
        }
    
    return false;
    
    
};
