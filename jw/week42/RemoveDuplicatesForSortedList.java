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
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> hs = new HashSet<>();
        ListNode rs = new ListNode(-1);
        ListNode rsHead = rs;
        while(head != null) {
            int t = head.val;
            if(!hs.contains(t)) {
                System.out.println(t);
                rs.next = new ListNode(t);
                rs = rs.next;
                hs.add(t);
            }
            head = head.next;
        }
        return rsHead.next;
    }
}
