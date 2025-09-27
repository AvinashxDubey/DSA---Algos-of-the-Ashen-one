/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    /**
        alright, so we use floyds cycle detection algo here
        so theres slow S and fast F pointers
        So, let l1 be distance of cycle start node from start node
        l2 be distance of cycle detection node from cycle start node
        and k be the cycle length
        F = 2S i.e. F moves twice as fast as S
        S = l1 + l2
        F = l1 + l2 + nk (fast moved n times over cycle length to intersect)
        F = 2S
        => F = l1 + l2 + l1 + l2
        => F = l1 + l2 + nk
        => l1 + l2 = nk
        => l1 = nk - l2 = k - l2 (no matter how many cycles we move we'll reach the same point)
        so, l1 = k - l2, so now we're able to write the algo
        so just restart slow from head after detection and move fast 1 step at a time from the cycle detection node
     */
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                slow = head;
                while(slow!=fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}