/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        List<Integer> data = new ArrayList();
        int number = 0;
        while(head != null) {
            data.add(head.val);
            head = head.next;
            number++;
        }
        
        heap(data, number);
        for(int i = number-1; i>0; i--) {
            int temp = data.get(0);
            data.set(0,data.get(i));
            data.set(i,temp);
            heap(data, i);
        }
        head = new ListNode();
        ListNode tmp = head;
        int cnt = 0;
        for(int v : data) {
            tmp.next = new ListNode(v);
            cnt++;
            if(cnt >= number) {
                break;
            } else {
                tmp = tmp.next;
            }
        }
        return head.next;
        
    }
    
    public static void heap(List<Integer> data, int number) 
    { 
        for(int i=1; i<number; i++) { 
            int child = i; 
            while(child > 0) { 
                int parent = (child-1)/2;
                if(data.get(child) > data.get(parent)) { 
                    int temp = data.get(parent);
                    data.set(parent,data.get(child));
                    data.set(child, temp);
                } 
                child = parent; 
            } 
        } 
    }

}
