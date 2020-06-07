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
    public ListNode removeZeroSumSublists(ListNode head) {
        
         if(head == null) {
            return head;
        }
        
        ArrayList<Integer> arrList = new ArrayList<>();
        ListNode curr = head;
        while(curr != null) {
            arrList.add(curr.val);
            curr = curr.next;
        }
        
        boolean loop = true;
        while(!arrList.isEmpty() && loop) {
            HashMap<Integer, Integer> hm = new HashMap<>();
            hm.put(0, -1);
            loop = false;
            int i=0, sum=0;
            while(i<arrList.size()){
                int num = arrList.get(i);
                if(num == 0) {
                    loop = true;
                    arrList.remove(i);
                    break;
                }
                
                sum+=num;
                if(hm.containsKey(sum)){
                    loop = true;
                    arrList.subList(hm.get(sum) + 1, i+1).clear();
                    break;
                }
                hm.put(sum, i);
                i++;
            }
        }
        
        if(arrList.size() ==0){
            return null;
        }
        curr = head;
        for(int i=0; i<arrList.size() - 1; i++) {
            curr.val = arrList.get(i);
            curr = curr.next;
        }
        curr.val = arrList.get(arrList.size() - 1);
        curr.next = null;
        
        return head;
        
    }
}
