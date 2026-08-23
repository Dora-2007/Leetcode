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
    public ListNode removeElements(ListNode head, int val) {
         if (head == null) {
            return null;
        }
        
        ListNode dummy = new ListNode(-1);
        ListNode temp = head;
        ListNode result = dummy;
        
        while (temp != null) {
            
            if (temp.val != val) {
                dummy.next = temp;
                dummy = dummy.next;
            }
            
            temp = temp.next;
        }
        
        // Important: terminate the resulting list
        dummy.next = null;
        
        return result.next;
    }
}