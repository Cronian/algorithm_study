/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Map<ListNode,Boolean> hm = new HashMap<>();
        while( head != null && hm.getOrDefault(head,false) == false) {
            hm.put(head,true);
            head = head.next;
        }
        return hm.getOrDefault(head,false);
    }
}
