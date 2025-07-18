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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // can be solved with a two pointer approach
        // we use the dummy node to handle removal of first node edge case
        // then slow and fast pointing to dummy
        // we move fast n+1 steps ahead
        // then move both slow and fast until fast becomes null
        // now slow is just before the node to be removed
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        for(int i=0; i<=n; i++){
            fast = fast.next;
        }

        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next;

        return dummy.next;
    }
}