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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        // finding mid (left mid for even no of nodes)
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // detaching the first and second halves
        ListNode next = slow.next;
        slow.next = null;
        slow = next;
        //reversing the second half
        ListNode prev = null;
        while(slow!=null){
            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        ListNode first = head;
        while(first!=null && prev!=null){
            next = first.next;
            first.next = prev;
            ListNode tempNxt = prev.next;
            prev.next = next;
            prev = tempNxt;
            first = next;
        }
        
    }
}