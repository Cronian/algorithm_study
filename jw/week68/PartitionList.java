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
    public ListNode partition(ListNode head, int x) {
        Queue<ListNode> min = new LinkedList();
        Queue<ListNode> max = new LinkedList();
        if(head == null) return head;
        while(true) {
            if(head.val < x) {
                //System.out.printf("Head Min : %d \n",head.val);
                min.add(new ListNode(head.val));

            }else if(head.val > x){
                //System.out.printf("Head Max : %d \n",head.val);
                max.add(new ListNode(head.val));

            }else {  
                //System.out.printf("Head Max : %d \n",head.val);
                max.add(new ListNode(head.val)); 
            }
            head = head.next;
            if(head == null) break;
        }
        ListNode rs = new ListNode();
        ListNode target = rs;
        while(!min.isEmpty()) {
            target.next = min.poll();
            target = target.next;
        }
        while(!max.isEmpty()) {
            target.next = max.poll();
            target = target.next;
        }
        return rs.next;
    }
}
