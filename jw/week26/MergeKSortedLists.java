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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(ListNode ln : lists) {
            while(ln != null) {
                pq.add(ln.val);
                ln = ln.next;
            }
        }
        
        ListNode rs = new ListNode(0);
        ListNode head = rs;
        while(!pq.isEmpty()) {
            rs.next = new ListNode(pq.poll());
            rs = rs.next;
        }
        return head.next;
    }
}
