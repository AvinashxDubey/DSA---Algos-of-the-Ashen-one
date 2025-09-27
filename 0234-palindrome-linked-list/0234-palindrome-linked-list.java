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
        we'll find the middle and rev the first half at the same time
        make sure fast is updated first 
        cz reversing list before it can lead to 
        fast node pointing to null or whatever curr state of reversed list is
        if the no of nodes is odd, then skip the middle element
        compare both the rev first half and second half
        if theres a single match return false
        otherwise true
     */
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        if(fast!=null){
            slow = slow.next;
        }

        while(prev!=null){
            if(prev.val!=slow.val) return false;
            prev = prev.next;
            slow = slow.next;
        }

        return true;
    }
}