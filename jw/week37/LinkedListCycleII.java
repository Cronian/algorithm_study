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
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> hs = new HashSet<>();
        while( head != null && !hs.contains(head)) {
            hs.add(head);
            head = head.next;
        }
        return head;
    }
}
