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
    public ListNode sortList(ListNode head) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        while(head != null) {
            pq.add(head.val);
            head = head.next;
        }
        ListNode ln = new ListNode(0);
        ListNode hd = ln;
        while(!pq.isEmpty()) {
            int tmp = pq.poll();
            ln.next = new ListNode(tmp);
            ln = ln.next;
        }
        return hd.next;
    }
}
