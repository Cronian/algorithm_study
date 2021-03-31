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
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> {
            if(a.val < b.val) return -1;
            else if(a.val > b.val) return 1;
            return 0;
        });
        
        for(ListNode l : lists) {
            if(l != null) pq.add(l);
        }
        
        ListNode rs = new ListNode();
        ListNode head = rs;
        while(!pq.isEmpty()) {
            ListNode t = pq.poll();
            rs.next = t;
            rs = rs.next;
            if(t.next != null) pq.add(t.next);
        }
        return head.next;
    }
}
