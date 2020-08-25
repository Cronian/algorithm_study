/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ln = new ListNode(-1);
        ListNode head = ln;
        while(l1 != null || l2 != null) {
            int l1v = l1 == null ? Integer.MAX_VALUE : l1.val;
            int l2v = l2 == null ? Integer.MAX_VALUE : l2.val;
            if(l1v <= l2v) {
                ListNode tp = new ListNode(l1v);
                ln.next = tp;
                ln = ln.next;
                l1 = l1.next;
            } else {
                ListNode tp = new ListNode(l2v);
                ln.next = tp;
                ln = ln.next;
                l2 = l2.next;
            }
        }
        return head.next;
    }
}
