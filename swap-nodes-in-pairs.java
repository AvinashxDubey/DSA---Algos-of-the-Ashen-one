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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode dummy = new ListNode(0, head);
        ListNode temp = dummy;

        while(temp.next!=null && temp.next.next!=null){
            ListNode prev = temp.next;
            ListNode curr = temp.next.next;
            temp.next = curr;
            prev.next = curr.next;
            curr.next = prev;
            temp = prev;
        }
        return dummy.next;
    }
}