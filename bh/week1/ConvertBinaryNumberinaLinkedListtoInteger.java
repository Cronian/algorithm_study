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
    int sum = 0;
    int count = 0;
    public int getDecimalValue(ListNode head) {

        ListNode ln = head; //노드 길이를 확인할 새로운 노드 선언
        while(ln.next != null)
        {
            count++; //다음 노드가 있으면 카운트 증가 반복하여 총 노드의 길이 확인
            ln = ln.next;
        }
        
        while(head != null)
        {
            sum += head.val * Math.pow(2, count--);
            head = head.next;
        }
        
        return sum;
    }
     
}
