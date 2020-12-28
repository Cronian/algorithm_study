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
        ListNode rs = new ListNode(-1);
        ListNode rsHead = rs;
        Map<Integer,Integer> hm = new LinkedHashMap<>();
        while(head != null) {
            int t = head.val;
            hm.put(t,hm.getOrDefault(t,0)+1);
            head = head.next;
        }
        for(int key : hm.keySet()) {
            if(hm.get(key) == 1) {
                rs.next = new ListNode(key);
                rs = rs.next;
            }
        }
        return rsHead.next;
    }
}
