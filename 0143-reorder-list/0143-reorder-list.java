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
    /**
        1. find the left mid and store next node
        l0->l1->l3->l4
        2. detach the first & second half and then reverse the second half
        l0->l1 l3->l2
        3. node from 1st half points to node from 2nd half
        and node from 2nd half points to next node from 1st half and so on
        l0->l3->l1->l2
        l0->l(3-0)->l1->l(3-1) 
     */
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast  = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode next = slow.next;
        slow.next = null;
        slow = next;
        ListNode prev = null;
        while(slow!=null){
            next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        ListNode first = head;
        while(prev!=null){
            next = first.next;
            first.next = prev;
            ListNode prevNext = prev.next;
            prev.next = next;
            first = next;
            prev = prevNext;
        }
    }
}