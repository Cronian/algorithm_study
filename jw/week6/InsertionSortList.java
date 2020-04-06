/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        // 첫부분 찾기를 용이하게 하기 위한 더미헤드 설정
        ListNode dummy = new ListNode();
        // 더미헤드 다음을 헤드로 설정해준다
        dummy.next = head;
        // 탐색할 리스트노드를 만들어 준다
        ListNode ptr = dummy;
        // 비어있는 리스트노드면 바로 끝내준다.
        if(head == null) return null;
        // 탐색중 진행단계 기록
        ListNode curr = head;
        
        // 최근값이 null이 아니고 (끝이 아니고), 최근 다음이 null이 아닐대 (다음이 끝이 아닐때)
        while(curr != null && curr.next != null) {
            // 포인터를 초기화해준다.
            ptr = dummy;
            
            // 정렬필요지점 셋팅
            while(ptr.next != curr.next && ptr.next.val < curr.next.val  ) {
              ptr = ptr.next;
            }
            
            // 최근값이 아닌 경우에만 
            if(curr != ptr) {
                //정렬필요지점 잘라내기
              ListNode temp = curr.next;
                //잘라내서 건너뛰기 해준다.
              curr.next = curr.next.next;
                // 잘라낸값은 정렬지점으로 옮겨줌
              temp.next = ptr.next;
                // 앞쪽에 남은객체를 붙여준다.
              ptr.next = temp;
            } else {
                //최근값과 같으면 다음으로 진행시킨다.
                curr = curr.next;
            }            
        }
        return dummy.next;
    }
}
