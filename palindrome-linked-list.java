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
    public boolean isPalindrome(ListNode head) {
        // find the middle node
        // we use two pointers, slow = head,
        // fast = head.next(for even no of nodes, we need left)
        // reverse the next to middle node as rev
        // compare start of head to rev until rev becomes null
        // if head.val!=rev.val return false

        ListNode slow = head, fast=head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast =  fast.next.next;
        }

        ListNode rev = reverse(slow);
        slow.next=null;
        while(rev!=null){
            if(head.val!=rev.val){
                return false;
            }
            head = head.next;
            rev = rev.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head!=null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}